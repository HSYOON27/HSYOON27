package com.kh.spring12.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.spring12.dao.MemberDao;
import com.kh.spring12.dao.MemberImageDao;
import com.kh.spring12.dto.MemberDto;
import com.kh.spring12.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
	 @Autowired
	 private MemberService memberService;
	 
	 @Autowired
	 private MemberImageDao memberImageDao;
	
	 
	
	   //	회원가입
	 @GetMapping("/join")
	 public String join() {
		 return "/WEB-INF/views/member/join.jsp";
	 }
	 
	 @PostMapping("/join")
	 public String join(@ModelAttribute MemberDto memberDto,
			 @RequestParam MultipartFile attach) throws IllegalStateException, IOException {
	     //회원 가입!
		 memberService.join(memberDto, attach);
		 
		 return "redirect:joinFinish";
	 }
	 
	 @GetMapping("/joinFinish")
	 public String joinFinish() {
		 return "/WEB-INF/views/member/joinFinish.jsp";
	 }

//	 로그인 (2023.02.06)
	 @GetMapping("/login")
	 public String login() {
		 return "/WEB-INF/views/member/login.jsp";
	 }

	 @PostMapping("/login")
	 public String login(@ModelAttribute MemberDto userDto,
			 RedirectAttributes attr, HttpSession session) {
		 //로그인 검사 : 단일 조회 후 비밀번호 일치 비교
		 MemberDto findDto = memberDao.selectOne(userDto.getMemberId());

		//존재하지 않는 아이디라면 → 오류 처리
		 if(findDto == null) {
			 attr.addAttribute("mode", "error");
			 return "redirect:login"; //redirect도 GET방식 요청을 발생시킴
		 }

		 ////비밀번호가 일치하지 않는다면 → 오류 처리
		 if(!userDto.getMemberPw().equals(findDto.getMemberPw())) {
			 attr.addAttribute("mode", "error");
			 return "redirect:login";  //redirect도 GET방식 요청을 발생시킴
		 }

		 //로그인에 성공한 경우라면 이를 기억하기 위해 HttpSession에 정보를 추가
		 //- memberId = 회원아이디
		 //- memberLevel = 회원 레벨 
		 session.setAttribute("memberId", findDto.getMemberId());
		 session.setAttribute("memberLevel", findDto.getMemberLevel());
		 
		 //(+추가) 최종 로그인 시각을 갱신해야 한다.
		 memberDao.updateMemberLogin(findDto.getMemberId());
		 
		 //모두 통과한 경우만 남음
		 return "redirect:/";//메인페이지
	 }
//     로그아웃 2023.02.06
	 	@GetMapping("/logout")
	 	public String logout(HttpSession session) {
	 		session.removeAttribute("memberId");
	 		session.removeAttribute("memberLevel");
	 		return "redirect:/";
	 	}
//	     마이페이지 2023.02.06 - 회원 전용 기능 
//      1. 세션에서 회원 ID 추출
//      2. 추출한 ID로 대상의 정보를 상세조회
//      3. 상세조회한 결과를 Model에 첨부 
//		4. 회원 프로필 이미지가 있다면 첨부해라(2023.02.17)
	 	
	 	
		 @GetMapping("/mypage")
		 public String mypage(HttpSession session, Model model) {
			 String memberId = (String) session.getAttribute("memberId"); //1번
			 MemberDto memberDto = memberDao.selectOne(memberId); //2번
			 model.addAttribute("memberDto", memberDto); //3번 
			 model.addAttribute("profile", memberImageDao.selectOne(memberId));
			 return "/WEB-INF/views/member/mypage.jsp";
	 	}
		 //비밀번호 변경 기능(2023.02.07)
		 @GetMapping("/password")
		 public String password() {
			 return "/WEB-INF/views/member/password.jsp";
		 }

		 @PostMapping("/password")
		 public String password(
				 HttpSession session,//아이디가 저장되어 있는 세션 객체
				 @RequestParam String currentPw, //현재 비밀번호
				 @RequestParam String changePw,//변경할 비밀번호
				 RedirectAttributes attr) {//리다이렉트에 정보를 추가하기 위한 객체
			 String memberId = (String)session.getAttribute("memberId");
			 MemberDto memberDto = memberDao.selectOne(memberId);

			 //비밀번호가 일치하지 않는다면
			 if(!memberDto.getMemberPw().equals(currentPw)) {
				 attr.addAttribute("mode", "error");
				 return "redirect:password";
			 }

			 //비밀번호가 일치한다면 → 비밀번호 변경 처리
			 memberDao.changePassword(memberId, changePw);
			 return "redirect:passwordFinish";		 
		 }


		 @GetMapping("/passwordFinish")
		 public String passwordFinish() {
			 return "/WEB-INF/views/member/passwordFinish.jsp";
		 }

		 
		 //비밀번호를 제외한 개인정보 변경
		 @GetMapping("/edit")
		 public String edit(HttpSession session,//회원 아디가 저장되어있는 세션 객체, 
				 Model model//회원의 모든 정보를 전달할 전송 객체
				 ) {
			 String memberId = (String) session.getAttribute("memberId");
			 MemberDto memberDto = memberDao.selectOne(memberId);
			 model.addAttribute("memberDto", memberDto);
			 return "/WEB-INF/views/member/edit.jsp";
		 }
		 
		 @PostMapping("/edit")
		 public String edit(@ModelAttribute MemberDto memberDto, 
				 HttpSession session, //회원 아이디가 저장되어 있는 세션 객체
				 RedirectAttributes attr//리다이렉트 시 정보를 추가할 전송 객체
				 )//데이터를 자동으로 받기위한 객체) 
		 {
			 String memberId = (String) session.getAttribute("memberId"); //세션에서 아이디를 꺼낸다
			 MemberDto findDto = memberDao.selectOne(memberId);
			 
			 //비밀번호가 일치하지 않는다면 -> 에러 표시 후 이전 페이지로 리다이렉트
			 if(!findDto.getMemberPw().equals(memberDto.getMemberPw())) {
				 attr.addAttribute("mode","error");
				 return "redirect:edit";
			 }
			 //비밀번호가 일치한다면 -> 비밀번호 변경 및 완료 페이지로 리다이렉트
			 memberDto.setMemberId(memberId);//아이디 추가 설정
			 memberDao.changeInformation(memberDto);//정보 변경 요청 
			 return "redirect:editFinish.jsp"; 
		 }
		 
		 @GetMapping("/editFinish")
		 public String editFinish(@ModelAttribute MemberDto memberDto, 
				 HttpSession session,RedirectAttributes attr) {
			 
			 return "/WEB-INF/views/member/editFinish.jsp";
		 }
		 
		 //회원 탈퇴 (2023.02.07)
		 
		 @GetMapping("/exit")
		 public String exit(HttpSession session) {
			 return "/WEB-INF/views/member/exit.jsp";
		 }
		 
		 @PostMapping("/exit")
		 public String exit(HttpSession session, //회원 정보가 저장되어 있는 세션 객체 
				 @RequestParam String memberPw,//사용자가 입력한 비밀번호 
				 RedirectAttributes attr//리다이렉트 시 정보를 추가하기 위한 객체
				 )
		 {
			 String memberId = (String)session.getAttribute("memberId");
			 //System.out.println(Id);
			 MemberDto memberDto = memberDao.selectOne(memberId);
		    //System.out.println(memberDto);
			 
			 //비밀번호가 일치하지 않는다면
			 if(!memberDto.getMemberPw().equals(memberPw)) {
				 attr.addAttribute("mode", "error");
				 return "redirect:exit";
			 }
			 //비밀번호가 일치한다면 -> 회원탈퇴+로그아웃
			 memberDao.delete(memberId);
			 
			 session.removeAttribute("memberId");
			 session.removeAttribute("memberLevel");
			 
			 return "redirect:exitFinish";
			 
		 }
		 
		 @GetMapping("/exitFinish")
		 public String exitFinish() {
			 return "/WEB-INF/views/member/exitFinish.jsp";
		 }
		 
		 //아이디 찾기 페이지(2023.02.07)
		 @GetMapping("/find")
		 public String find() {
			 return "/WEB-INF/views/member/find.jsp";
		  }
		 
		 @PostMapping("/find") //session은 아디가 로그인 한 상태일때 쓰는거다
		 public String find(@ModelAttribute MemberDto memberDto, 
				 Model model, RedirectAttributes attr) {
			 try {
				 String memberId = memberDao.findId(memberDto);
				 model.addAttribute("memberId", memberId);
				 return "/WEB-INF/views/member/findResult.jsp";
			 }
			 catch(Exception e) {
				 attr.addAttribute("mode", "error");
				 return "redirect:find";
			 }
		 }
		 
}


