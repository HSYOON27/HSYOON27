
------------- 테이블 조건 설정 및 생성 
create table menu(
name varchar2(30) not null unique,
type varchar2(9) not null check(type in ('음료','디저트')),
price number not null check(price >=0),
event char(1) not null check(event in (0, 1))
);

------------- 자바에서 논리는 데이터베이스에서 0이나 1로 처리한다
------------- 0은 false 1은 true로 사용 

------------- day18 휴대폰 판매정보 테이블
create table mobile(
name varchar2(30) not null, 
telecom char(2) not null check(telecom in('SK', 'KT', 'LG')),
price varchar2(20) not null,
month varchar2(19) not null check(month in('24개월', '30개월', '36개월', '설정하지 않음')),
unique(name, telecom)  --이러면 name 까진 같아도 들어가고, telecom이 같으면 안들어감. 학년 반 번호 같은 느낌 
);
------------- 테이블 삭제 
drop table mobile;

-------------- 모바일 테이블 데이터 입력 
insert into mobile(name, telecom, price, month)
values('갤럭시22s', 'SK', '180만원', '설정하지 않음');
insert into mobile(name, telecom, price, month)
values('갤럭시22s', 'KT', '175만원', '24개월');
insert into mobile(name, telecom, price, month)
values('아이폰14', 'LG', '200만원', '30개월');
insert into mobile(name, telecom, price, month)
values('아이폰14', 'SK', '199만원', '설정하지 않음');
commit;
--------------- 데이터 조회
select * from mobile;

