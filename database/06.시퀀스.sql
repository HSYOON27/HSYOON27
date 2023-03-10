/*--- 시퀀스(SEQUENCE)
- 번호를 이용하여 데이터들을 구분해야 하는 경우 번호를 생성하는 도구임. 
- 시퀀스는 한번 발급한 번호는 절대로 다시 발급하지 않음. 

생성 : CREATE SEQUENCE 이름 [옵션]; 
사용 : 이름.NEXTVAL
조회 : SELECT * FROM USER_SEQUENCES;
삭제 : DROP SEQUENCE 이름; 
*/
--시퀀스 생성
create sequence item_seq;
--시퀀스 삭제
drop sequence item_seq;
--시퀀스 조회
select * from user_sequences;

--아이템 테이블 생성
create table item(
no number primary key,  -----대표항목(not null+ unique) 합친거임  
name varchar2(60) not null check(regexp_like(name,'^[가-힣0-9]+$')),  ---왼쪽이 항목 오른쪽이 정규표현식 
type varchar2(15) not null,
price number not null check(price >= 0),
early char(1) not null check(early in ('0', '1')),
event char(1) not null check(event in('0', '1'))
);

-- 아이템 테이블 삭제
drop table item;

-- 아이템 내용 생성 
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, '참이슬후레시', '주류', 1200, '1','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, '클라우드맥주', '주류', 3000, '0','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, '바나나킥', '과자', 1500, '0','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, '허니버터칩', '과자', 2000, '1','0');
commit;

--아이템 내용 조회 
select * from item;


--subject 테이블 만들기 
create table subject(
no number primary key,
name varchar2(30)not null,
period number not null check(period >= 0),
price number not null check(price >= 0),
type varchar2(12) not null check (type in('온라인', '오프라인'))
);

--subject 내용 만들기 
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, '자바 마스터과정', 90, 1000000, '온라인');
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, '파이썬 기초', 60, 600000, '온라인');
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, '웹 개발자 단기양성', 120, 1200000, '오프라인');
commit;

--subject 테이블 내용 조회
select * from subject;

--subject 테이블 삭제
drop table subject;

--시퀀스 생성 
create sequence subject_seq;
--시퀀스 삭제
drop sequence subject_seq;
--시퀀스 조회
select*from user_sequences;

