package com.kh.spring12.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.spring12.dao.BoardDao;
import com.kh.spring12.dto.BoardDto;
import com.kh.spring12.service.BoardService;
import com.kh.spring12.vo.PaginationVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private BoardService boardService;
	
	//게시글 목록 & 검색
////		@GetMapping("/list")
////		public String list(Model model, 
////				@RequestParam (required=false, defaultValue="boardTitle") String column,
////				@RequestParam (required=false, defaultValue="") String keyword) {
////				
////		if(keyword.equals("")){
////		model.addAttribute("list", boardDao.selectList());
////		}
////		else {//키워드가 있다면 -> 검색
////			model.addAttribute("column", column);
////			model.addAttribute("keyword", keyword);
////			model.addAttribute("list", boardDao.selectList(column, keyword));
////		}
//		//검색 여부와 관계 없이 공지사항을 3개 조회해서 Model에 첨부
//		model.addAttribute("noticeList", boardDao.selectNoticeList(1,3));
//		return"/WEB-INF/views/board/list.jsp";
//     }
	
	//(+추가) ModelAttribute는 자동 수신외에 기능이 하나 더 있다.
	//-> Model에 자동으로 추가됨(이름을 설정해야한다 vo )
	
	//게시글 목록 & 검색 업글버전 
	@GetMapping("/list")
	public String list(@ModelAttribute("vo") PaginationVO vo, Model model) {
		//vo에 딱 한가지 없는 데이터 => 게시글의 개수 (목록/검색이 다름)
		int totalCount =boardDao.selectCount(vo);
		vo.setCount(totalCount);
		
		//공지사항
		model.addAttribute("noticeList", boardDao.selectNoticeList(1, 3));
		
		//게시글
		List<BoardDto> list = boardDao.selectList(vo);
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/board/list2.jsp";
	}
	
//	조회수 중복 방지 시나리오
// 1. 작성자 본인은 조회수 증가를 하지 않는다. 
// 2. 한 번 이상 본 글은 조회수 증가를 하지 않는다.
// 		(1) 세션에 현재 사용자가 읽은 글 번호를 저장해야 함.
//		(2) 새로운 글을 읽으려 할 때 (상세 페이지에 오면) 현재 읽는 글 번호가 읽은 이력이 있는지 조회 해봐야 함.
//		(3) 읽은 적이 있으면 조회수 증가를 하지 않고, 없으면 추가 후 조회수 증가처리.		
		
	//게시글 상세
	@GetMapping("/detail")
	public String detail(Model model, @RequestParam int boardNo, HttpSession session) {
		//사용자가 작성자인지 판정 후 JSP로 전달. 작성자가 쓴 게시글을 볼때 조회수가 안오르는 카운트.
		BoardDto boardDto = boardDao.selectOne(boardNo); //한번 밖에 못쓰니 맨위로 올림. 
		String memberId = (String) session.getAttribute("memberId");
		
		boolean owner = boardDto.getBoardWriter() != null && 
				boardDto.getBoardWriter().equals(memberId);
		model.addAttribute("owner", owner);
		
		//사용자가 관리자인지 판정 후 JSP 전달하는 코드
		String memberLevel = (String) session.getAttribute("memberLevel");
		boolean admin = memberLevel != null && memberLevel.equals("관리자");  // null은 모든 값에서 예외라 null 이 있을 수 있는 경우에 항상 검사해야함.
		model.addAttribute("admin", admin);
		
		//사용자가 관리자 일때만 공지사항을 작성할 수 있게 처리
//		if(admin) {
//			공지사항을 작성할 수 있게
//		}
//		else {
//			
//		}
		
		//조회수 증가(코드)
		if(!owner) { //내가 작성한 글이 아니라면(시나리오 1번)
			
			//시나리오 2번 진행
			Set<Integer> memory = (Set<Integer>) session.getAttribute("memory");
			if(memory == null) {
				memory = new HashSet<>();
			}
			
			if(!memory.contains(boardNo)) {//읽은 적이 없는거
				boardDao.updateReadCount(boardNo);
				boardDto.setBoardRead(boardDto.getBoardRead()+1); //DTO 조회수 1 증가
				memory.add(boardNo); //저장소에 추가(기억에 추가)
			}
//			System.out.println("memory = " + memory);
			session.setAttribute("memory", memory); //저장소 갱신
		}
		//게시글 상세(코드)
		model.addAttribute("boardDto",boardDto);
		return "/WEB-INF/views/board/detail.jsp";
	}
	
	//경로 변수 방식의 상세조회
	//- 매핑 주소에 중괄호를 적고 변수명을 작성하면 스프링에서 수신해줌
	//- 매개변수에 @PathVariable 형태로 주소에 작성한 변수명을 선언한다
	//장점
	//- 주소의 가독성 증가
	//- 전송방식과 무관하게 사용이 가능
	//- 정규표현식 검사가 가능

	//단점
	//- 엔드포인트(endpoint)가 달라져서 상대 경로를 쓰기 불편함
	//- 보내는 데이터 양이 많아질수록 가독성이 오히려 안좋아진다.
	//- 경로 변수 방식을 지원하지 않는 라이브러리들이 있음. 
	
	@GetMapping("/detail/{boardNo}")
	public String detail(@PathVariable int boardNo, Model model) {
		model.addAttribute("boardDto", boardDao.selectOne(boardNo));
		return "/WEB-INF/views/board/detail.jsp";
	}
	
	//게시글 작성 및 상세페이지로 갈땐 무적권 이렇게 
	@GetMapping("/write")
	public String write(@RequestParam(required = false) Integer boardParent, Model model) {
		model.addAttribute("boardParent", boardParent);
		return "/WEB-INF/views/board/write.jsp";
	}
	
//	@PostMapping("/write")
//	public String write(
//			@ModelAttribute BoardDto boardDto, //3개 말머리, 제목, 내용)
//			HttpSession session, RedirectAttributes attr)
//			{
//		//번호와 회원 아이디를 추출
//		int boardNo = boardDao.sequence();
//		String memberId = (String)session.getAttribute("memberId");
//
//		//작성한 게시글 정보에 첨부해서
//		boardDto.setBoardNo(boardNo);
//		boardDto.setBoardWriter(memberId);
//		
//		//게시글을 등록 
//		boardDao.insert(boardDto);
//		
//		//상세 페이지로 이동
//		attr.addAttribute("boardNo", boardNo);
//		return "redirect:detail";
//	}
	//새글과 답글 
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto, HttpSession session, RedirectAttributes attr) {
		
		//boardDto 경우 정보를 새글과 답글로 구분하려 처리 후 등록
		
		//-새글일 경우 boardParent가 null이다.
		//  	- 그룹 번호(boardGroup)는 글번호와 동일하게 처리
		//		- 대상 글 번호(boardParent)는 null로 설정
		// 		- 차수(boardDepth)는 0으로 설정
		
		//-답글일 경우 boardParent가 null이 아니다.
		//		- 대상글의 정보를 조회한 결과를 설정한다. 
		//		- 그룹 번호(boardGroup)는 대상글의 그룹번호와 동일하게 처리
		//		- 대상 글 번호 (boardParent)는 전달받은 값을 그대로 사용
		//		- 차수(boardDepth)는 대상글의 차수에 1을 더해서 사용
		
		//컨트롤러에서 가능한 작업은 컨트롤러에서만 처리
		//- 사용자의 요청을 처리하는 것
		//- 세션 사용
		//- 리다이렉트 관련 처리
		//- 그 외 사용자 요청 처리 관련 도구 사용 
		String memberId = (String)session.getAttribute("memberId");
		boardDto.setBoardWriter(memberId);
		
		//나머지 일반 프로그래밍 코드는 서비스를 호출하여 처리
		int boardNo = boardService.write(boardDto);
	
		//상세 페이지로 이동
		attr.addAttribute("boardNo", boardNo);
		return "redirect:detail";
		
	}
	
	// 게시글 삭제
	   @GetMapping("/delete")
	   public String delete (@RequestParam int boardNo) {
	      boardDao.delete(boardNo);
	      return "redirect:list"; // 상대경로
//	      return "redirect:/board/list"; // 절대경로
	   }
	   
	   @GetMapping("/delete/{boardNo}")
	   public String delete2(@PathVariable int boardNo) {
	      boardDao.delete(boardNo);
//	      return "redirect:../list"; // 상대경로
	      return "redirect:/board/list"; // 절대경로
	   }
	 // 게시글 수정
	 // 할일
	 // - 준비 : 글번호
	 // - 처리 : 글정보 조회
	 // - 결과 : 화면에 조회한 데이터 전달  
	   @GetMapping("/edit")
	   public String edit(HttpSession session, @RequestParam int boardNo, Model model) {
		   String memberLevel = (String) session.getAttribute("memberLevel");
		   boolean admin = memberLevel != null && memberLevel.equals("관리자");
		   model.addAttribute("admin", admin);
		   model.addAttribute("boardDto", boardDao.selectOne(boardNo));
		   return "/WEB-INF/views/board/edit.jsp";
	   }
	   
	   @PostMapping("/edit")
	   public String edit(@ModelAttribute BoardDto boardDto, RedirectAttributes attr) {
		   boardDao.update(boardDto);
		   attr.addAttribute("boardNo", boardDto.getBoardNo());
		   return "redirect:detail";
	   }
}
