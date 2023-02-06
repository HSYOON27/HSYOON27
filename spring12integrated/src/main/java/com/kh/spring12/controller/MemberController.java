package com.kh.spring12.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.spring12.dao.MemberDao;
import com.kh.spring12.dto.MemberDto;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
//	회원가입
	 @GetMapping("/join")
	 public String join() {
		 return "/WEB-INF/views/member/join.jsp";
	 }
	 
	 @PostMapping("/join")
	 public String join(@ModelAttribute MemberDto memberDto) {
		 memberDao.insert(memberDto);
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
	 	
		 @GetMapping("/mypage")
		 public String mypage(HttpSession session, Model model) {
			 String memberId = (String) session.getAttribute("memberId"); //1번
			 MemberDto memberDto = memberDao.selectOne(memberId); //2번
			 model.addAttribute("memberDto", memberDto); //3번 
			 return "/WEB-INF/views/member/mypage.jsp";
	 	}
		 //비밀번호 변경
		 @GetMapping("/password")
		 public String password() {
			 return "/WEB-INF/views/member/password.jsp";
		 }
		 
		 @PostMapping("/password")
		 public String password(@ModelAttribute MemberDto memberDto) {
			 memberDao.insert(memberDto);
			 return "/WEB-INF/views/member/passwordFinish.jsp"; 
		 }
		 
		 @GetMapping("/passwordFinish")
		 public String passwordFinish() {
			 return "/WEB-INF/views/member/mypage.jsp";
		 }
		 //개인정보 변경
		 @GetMapping("/edit")
		 public String edit() {
			 return "/WEB-INF/views/member/edit.jsp";
		 }
		 
		 @PostMapping("/edit")
		 public String edit(@ModelAttribute MemberDto memberDto) {
			 memberDao.insert(memberDto);
			 return "/WEB-INF/views/member/editFinish.jsp"; 
		 }
		 
		 @GetMapping("/editFinish")
		 public String editFinish() {
			 return "/WEB-INF/views/member/mypage.jsp";
		 }
		 
		 //회원 탈퇴
		 
		 @GetMapping("/exit")
		 public String exit() {
			 return "/WEB-INF/views/member/exit.jsp";
		 }
		 
		 @PostMapping("/exit")
		 public String exit(@ModelAttribute MemberDto memberDto) {
			 memberDao.insert(memberDto);
			 return "/WEB-INF/views/member/exit.jsp"; 
		 }
		 
		 @GetMapping("/exitFinish")
		 public String exitFinish() {
			 return "/";
		 }
}


