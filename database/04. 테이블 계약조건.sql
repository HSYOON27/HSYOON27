------------Day 18 데이터 플랜 테이블
CREATE TABLE PLAN (
telecom char(2) not null check(telecom in ('SK', 'KT', 'LG')),
name varchar2(60) not null unique,
price number not null check(price>=0),
data number not null check(data>=0),
call number not null check(call>=0),
sms number not null check(sms >=0)
);

-----------이상 데이터 추가 테스트
insert into plan(telecom, name, price, data, call, sms)
values(null,null,null,null,null,null);

-----------정상 데이터 : 유니크땜에 2번 추가는 안된다.  
insert into plan(telecom, name, price, data, call, sms)
values('SK', '5G 언택트 52', 52000, 200, 1000, 2000);

----------- menu 테이블 생성 
create table menu(
name varchar2(30),
type varchar2(12),
price number,
event varchar2(9)
);

------------ menu 테이블 삭제 
drop table menu;

------------ menu 데이터 입력 
insert into menu(name, type, price, event)
values('아메리카노', '음료', 2500, '1');
insert into menu(name, type, price, event)
values('모카라떼', '음료', 3500, '0');
insert into menu(name, type, price, event)
values('치즈케이크', '디저트', 5000, '1');
insert into menu(name, type, price, event)
values('마카롱', '디저트', 3000, '0');
commit;

------------- 데이터 조회
select * from menu;

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
month varchar2(19) not null check(month in('24개월', '30개월', '설정하지 않음')),
unique(name, telecom)
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

--------------- 데이터 조회
select * from mobile;

