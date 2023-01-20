-- 테이블(table)
-- 데이터가 저장되는 객체
-- 표 라고 생각합시다. 표 형태. 
create table attendance(
no number(10),
name varchar2(21),
phone char(13)
);

drop table attendance;

----------- day18 월드컵 테이블 

create table worldcup(
rank number(1),
name varchar2(22),
nation varchar2(15),
goal number(1)
);

drop table worldcup;

------------day18 포켓몬 테이블 
CREATE TABLE POCKETMON(
NO NUMBER(4),
NAME VARCHAR2(21),
TYPE VARCHAR2(9)
);

DROP TABLE POCKETMON

------------Day18 메달리스트 테이블
CREATE TABLE MEDALIST(
NAME VARCHAR2(21),
EVENT VARCHAR2(31),
TYPE CHAR(6),
GOLD NUMBER(2),
SILVER NUMBER(2),
BRONZE NUMBER(2)
);

DROP TABLE MEDALIST


