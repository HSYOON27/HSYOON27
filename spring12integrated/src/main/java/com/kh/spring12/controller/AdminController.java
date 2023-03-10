package com.kh.spring12.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.spring12.component.RandomComponent;
import com.kh.spring12.dao.MemberDao;
import com.kh.spring12.dao.MemberStatDao;
import com.kh.spring12.dao.PocketmonStatDao;
import com.kh.spring12.dao.SubjectStatDao;
import com.kh.spring12.dto.MemberDto;
import com.kh.spring12.dto.PocketmonStatDto;
import com.kh.spring12.dto.SubjectStatDto;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private RandomComponent randomComponent;
	
	//관리자 홈
	@GetMapping("/home")
	public String home() {
		return "/WEB-INF/views/admin/home.jsp";
	}
	
	@GetMapping("/member/list")
	public String memberList(Model model,
			@RequestParam(required = false, defaultValue ="1") int page,
			@RequestParam(required = false, defaultValue ="10") int size) {
		model.addAttribute("page", page);
		model.addAttribute("size",size);
		// 화면에서 목록 하단에 숫자 링크(페이지 네비게이터)를 보여주려면
		// 총 몇 페이지가 있는지를 계산해야 한다. 
		// 총 몇 페이지가 있는지를 계산하려면, 전체 게시글이 몇 개인지 알아야 한다. 
		// 개수는 어케 구함? - select count(*) from member;
		int totalCount = memberDao.selectCount();
		model.addAttribute("totalCount", totalCount);
		int totalPage = (totalCount+size-1)/size; //전체 카운트(1002)에서 사이즈의 크기(10)-1 /10 하면 10개씩 딱 떨어짐
		model.addAttribute("totalPage", totalPage);
		
		List<MemberDto> list = memberDao.selectListPaging(page, size);
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/member/list.jsp";
	}
	
	//회원 상세정보 (2023.02.08)
	@GetMapping("/member/detail")
	public String memberDetail(@RequestParam String memberId, Model model
				) {
		model.addAttribute("memberDto", memberDao.selectOne(memberId));
		return "/WEB-INF/views/admin/member/detail.jsp";
	}

	//회원 탈퇴 및 대기테이블로의 이동 
	@GetMapping("/member/password")
	public String memberPassword(
//			Model model, 
//			RedirectAttributes attr,
			@RequestParam String memberId,
			HttpSession session) {
////		String memberPw = "khacademy";
//		List<String> data = new ArrayList<>();
//		for(char i='A'; i <= 'Z'; i++) data.add(String.valueOf(i));
//		for(char i='a'; i <= 'z'; i++) data.add(String.valueOf(i));
//		for(char i='0'; i <= '9'; i++) data.add(String.valueOf(i));
//
//		Random r = new Random();
//		StringBuffer buffer = new StringBuffer();
//
//		for(int i=0; i < 10; i++) {
//			int index = r.nextInt(data.size());
//			buffer.append(data.get(index));
//		}
//
//		String memberPw = buffer.toString();
		String memberPw = randomComponent.generateString(10);
//		model.addAttribute("memberPw", memberPw);
//		return "/WEB-INF/views/admin/member/password.jsp";

//		비밀번호는 절대로 파라미터로 첨부하면 안됨
//		attr.addAttribute("memberPw", memberPw);

//		일시적으로 세션에 보관한 뒤 바로 삭제하는 방식으로 전달
		session.setAttribute("memberPw", memberPw);
		return "redirect:passwordFinish";
	}

	@GetMapping("/member/passwordFinish")
	public String passwordFinish(
//					@RequestParam String memberPw,
					HttpSession session,
					Model model) {
		String memberPw = (String)session.getAttribute("memberPw");
		session.removeAttribute("memberPw");
		model.addAttribute("memberPw", memberPw);
		return "/WEB-INF/views/admin/member/password.jsp";
		}
	
//		관리자로 회원 정보 변경(2023.02.09)	
	@GetMapping("/member/edit")
	public String memberEdit(@RequestParam String memberId, Model model) {
	MemberDto memberDto = memberDao.selectOne(memberId);
	model.addAttribute("memberDto", memberDto);
	return "/WEB-INF/views/admin/member/edit.jsp";
}
	
	@PostMapping("/member/edit")
	public String memberEdit(@ModelAttribute MemberDto memberDto, RedirectAttributes attr) {
		//정보변경
		memberDao.changeInformationByAdmin(memberDto);
		attr.addAttribute("memberId", memberDto.getMemberId());
		return "redirect:detail";
	}

	// 관리자통계  2023.02.09

	@Autowired
	private PocketmonStatDao pocketmonStatDao;
	
	@GetMapping("/stat/pocketmon")
	public String pocketmon(Model model) {
		List<PocketmonStatDto> list = pocketmonStatDao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/pocketmon.jsp";
	}
	
	// 관리자 통계 서브젝트편 
	
	@Autowired
	private SubjectStatDao subjectStatDao;
	
	@Autowired
	private MemberStatDao memberStatDao;
	
	@GetMapping("/stat/subject")
	public String subject(Model model) {
		List<SubjectStatDto> list = subjectStatDao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/admin/stat/subject.jsp";
	}
	
	// 관리자 통계 멤버편
	
	@GetMapping("/stat/member")
	public String member(Model model, 
			@RequestParam(required = false,
			defaultValue = " member_level asc")String sort) {
		model.addAttribute("list", memberStatDao.selectList(sort));
		return "/WEB-INF/views/admin/stat/member.jsp";
	}
	
	
	
}

	
	

	

	

