package com.kh.spring19.rest;

import java.util.List;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.kh.spring19.dto.SubjectDto;
import com.kh.spring19.repo.SubjectRepo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@Tag(name = "서브젝트 요청처리기")
@RestController
@RequestMapping("/subject")
public class SubjectRestController {

	@Autowired
	private SubjectRepo repo;
	
	@Operation(
			description = "과목 신규 등록",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "등록이 정상적으로 완료된 경우",
							content = @Content(
									mediaType = "text/plain", 
									schema = @Schema(implementation = String.class),
									examples = {
											@ExampleObject("OK")
									}
								)
							),
					@ApiResponse(
							responseCode = "500",
							description = "번호 중복 또는 이름/속성 크기가 초과한 경우" ,
							content = @Content(
									mediaType = "text/plain", 
									schema = @Schema(implementation = String.class),
									examples = {
													@ExampleObject("Server error")
											}
									)
							)
			}
			)
	
// @ModelAttribute는 springdoc에서 인식 X
// @ParameterObject로 대체하여 사용할 것을 권장	
	
	@PostMapping("/")
	public void add(@ParameterObject SubjectDto dto) {
		repo.insert(dto);
	}
	
	
	@Operation(
		description = "과목 목록 조회",
		responses = {
			@ApiResponse(
					responseCode = "200", description ="조회 성공",
					content = @Content(
							mediaType = "application/json",
							array = @ArraySchema(
									schema = @Schema(implementation = SubjectDto.class)
									)
							
							)
					
					),
			@ApiResponse(
					responseCode = "500",
					description = "서버의 처리 과정에서 오류 발생" ,
					content = @Content(
							mediaType = "text/plain", 
							schema = @Schema(implementation = String.class),
							examples = {
											@ExampleObject("Server error")
									}
					)
				)	
		}
	)
	
	@GetMapping("/")
	public List<SubjectDto> list(){
		return repo.selectList();
	}
	
	@Operation(
			summary = "과목 상세정보 조회",
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "해당 번호의 과목을 찾음",
							content = @Content(
										mediaType ="application/json",
										schema =@Schema(implementation = SubjectDto.class)
									)
							),
					@ApiResponse(
							responseCode = "404",
							description = "해당 번호의 과목이 없어요" ,
							content = @Content(
									mediaType = "text/plain", 
									schema = @Schema(implementation = String.class),
									examples = {
													@ExampleObject("Targer notfound")
											}
							)
							),
					@ApiResponse(
							responseCode = "500",
							description = "서버의 처리 과정에서 오류 발생" ,
							content = @Content(
									mediaType = "text/plain", 
									schema = @Schema(implementation = String.class),
									examples = {
													@ExampleObject("Server error")
											}
							)
							)
			}
			)
	
	@GetMapping("/{no}")
	   public SubjectDto find(
	         @Parameter(description = "과목 번호")
	         @PathVariable int no) throws NoHandlerFoundException {
		SubjectDto dto = repo.selectOne(no);
	      if(dto == null) throw new NoHandlerFoundException(null, null, null);
	      return dto;
	   }
	   
	   @PutMapping("/")
	   public void edit(@ModelAttribute SubjectDto dto) throws NoHandlerFoundException {
		   SubjectDto find = repo.selectOne(dto.getNo());
	      if(find == null) throw new NoHandlerFoundException(null, null, null);
	      repo.update(dto);
	   }
	   
	   @DeleteMapping("/{no}")
	   public void remove(@PathVariable int no) throws NoHandlerFoundException {
		   SubjectDto dto = repo.selectOne(no);
	      if(dto == null) throw new NoHandlerFoundException(null, null, null);
	      repo.delete(no);
	
}
}

