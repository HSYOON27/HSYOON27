package jdbc.test;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test01 {
public static void main(String[] args) {
		
		MemberDto dto = new MemberDto();
		MemberDao dao = new MemberDao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원가입 정보를 입력 하세요.");
		
		System.out.print("아이디를 입력하세요 : ");
		while(true) {
			String a = sc.nextLine();
			if(a.matches("^[a-z0-9--_]{5,20}$")) {
				dto.setMemberId(a);
				System.out.println("아이디 입력완료");
				break;
			}
			else {
				System.out.println("5~20자 영문 소문자, 숫자, 대시(-), 언더바(_)(중복 불가)");
				System.out.print("아이디를 입력하세요 :  ");
			}
		}
		System.out.print("비밀번호를 입력하세요 : ");
		while(true) {
			String a = sc.nextLine();
			if(a.matches("^[A-Za-z0-9!@#$%^&*?=+_-]{8,16}$")) {
				dto.setMemberPw(a);
				System.out.println("비밀번호 입력완료");
				break;
			}
			else {
				System.out.println("8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요");
				System.out.print("비밀번호를 입력하세요 : ");
			}
		}
		
		System.out.print("닉네임을 입력하세요 : ");
		while(true) {
			String a = sc.nextLine();
			if(a.matches("^[가-힣0-9]{2,10}$")) {
				dto.setMemberNick(a);
				System.out.println("닉네임 입력완료");
				break;
			}
			else {
				System.out.println("2~10자 한글 또는 숫자를 사용(중복 불가)");
				System.out.print("닉네임을 입력하세요 : ");
			}
		}
		
		System.out.print("핸드폰 번호를 입력하세요 : ");
		while(true) {
			String a = sc.nextLine();
			if(a.matches("^010[0-9]{8}$")) {
				dto.setMemberTel(a);
				break;
			}
			else {
				System.out.println("휴대폰 번호만 가능(010XXXXXXXX), -대시 제외");
				System.out.print("핸드폰 번호를 입력하세요 :  ");
			}
		}
		
		System.out.print("이메일을 입력하세요 : ");
		dto.setMemberEmail(sc.nextLine());
		
		System.out.print("생년월일을 입력하세요 : ");
		while(true) {
			String a = sc.nextLine();
			if(a.matches("^(19[0-9][0-9]|20\\d{2})-(0[0-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$")) {
				dto.setMemberBirth(a);
				break;
			}
			else {
				System.out.println("YYYY-MM-DD 형식으로 입력");
				System.out.print("생년월일을 입력하세요 : ");
			}
		}
		
		System.out.print("우편번호를 입력하세요 : ");
		while(true) {
			String a = sc.nextLine();
			if(a.matches("^[0-9]{5,6}$")) {
				dto.setMemberPost(a);
				break;
			}
			else {
				System.out.println("5~6자리 숫자만 가능");
				System.out.print("우편번호를 입력하세요 : ");
			}
		}
		
		System.out.print("기본주소 입력하세요 : ");
		while(true) {
			String a = sc.nextLine();
			if(a.matches("^[가-힣]{1,100}$")) {
				dto.setMemberPost(a);
				break;
			}
			else {
				System.out.println("한글 100자이내로 입력하세요");
				System.out.print("기본주소를 입력하세요 : ");
			}
		}
		
		System.out.print("상세주소를 입력하세요 : ");
		while(true) {
			String a = sc.nextLine();
			if(a.matches("^[가-힣]{1,100}$")) {
				dto.setMemberPost(a);
				break;
			}
			else {
				System.out.println("한글 100자이내로 입력하세요");
				System.out.print("상세주소를 입력하세요 : ");
			}
		}
		
		sc.close();
		

		dao.insert(dto);
		
		System.out.println("회원가입을 완료하였습니다.");
				
	}
}

