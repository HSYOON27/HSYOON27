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
