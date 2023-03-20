package com.kh.spring12.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.MemberStatDao;
import com.kh.spring12.dao.PocketmonStatDao;
import com.kh.spring12.dao.SubjectStatDao;
import com.kh.spring12.dto.MemberStatDto;
import com.kh.spring12.dto.PocketmonStatDto;
import com.kh.spring12.dto.SubjectStatDto;

//목표 : 관리자가 보는 페이지에 필요한 데이터를 전송하는 비동기 대응 컨트롤러
//CORS 엄청중요

@CrossOrigin(origins = {"http://127.0.0.1:5500"})
@RestController
@RequestMapping("/rest/admin")

public class AdminRestController {
		
		@Autowired
		private PocketmonStatDao pocketmonStatDao;
		
		@GetMapping("/pocketmon")
		   public Map<String, List<Object>> pocketmon() {
		      List<PocketmonStatDto> list = pocketmonStatDao.selectList();
		      // list를 두 개로 분리
		      List<Object> names = new ArrayList<>();
		      List<Object> counts = new ArrayList<>();
		      
		      for(PocketmonStatDto dto : list) {
		         names.add(dto.getType());
		         counts.add(dto.getCnt());
		      }
		      
		      Map<String, List<Object>> map = new HashMap<>();
		      map.put("label", names);
		      map.put("data", counts);
		      return map;
		   }
		
		
		@Autowired
		private SubjectStatDao subjectStatdao;
		
		@GetMapping("/subject1")
		public Map<String, List<Object>> subject1(){
			//조회
			List<SubjectStatDto> list = subjectStatdao.selectList();
			
			//분리
			//list를 두개로 분리 
			List<Object> names = new ArrayList<>();
			List<Object> counts = new ArrayList<>();
			List<Object> averages = new ArrayList<>();

			for(SubjectStatDto dto : list) {
				names.add(dto.getType());
				counts.add(dto.getCnt());
				averages.add(dto.getAverage());
			}
			
			//추가
			Map<String, List<Object>> map = Map.of("label", names, "count", counts, "average", averages);
			
			//반환
			return map;
			}
		
		
		@GetMapping("/subject2")
		public Map<String, List<Object>> subject2(){
			//조회
			List<SubjectStatDto> list = subjectStatdao.selectList();
			
			//분리
			//list를 두개로 분리 
			List<Object> names = new ArrayList<>();
			List<Object> average = new ArrayList<>();
			for(SubjectStatDto dto : list) {
				names.add(dto.getType());
				average.add(dto.getAverage());
			}
			
			//추가
			Map<String, List<Object>> map = Map.of("label", names, "data", average);
			
			//반환
			return map;
			}
		
		
		
		
		@Autowired
		private MemberStatDao memberStatdao;
		
		@GetMapping("/member")
		public Map<String, List<Object>> member(){
			List<MemberStatDto> list = memberStatdao.selectList();
			
			//list를 두개로 분리 
			List<Object> MemberLevels = new ArrayList<>();
			List<Object> Totals = new ArrayList<>();
			
			for(MemberStatDto dto : list) {
				MemberLevels.add(dto.getMemberLevel());
				Totals.add(dto.getTotal());
			}
			
			Map<String, List<Object>> map = new HashMap<>();
			map.put("label", MemberLevels);
			map.put("data", Totals);
			return map;
		}
		
//		@GetMapping("/pocketmon")
		
}
