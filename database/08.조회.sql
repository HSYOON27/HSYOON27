/*
    조회(Read)
   - 미리 테이블에 넣어둔 데이터를 원하는 목적에 맞게 탐색하는걸 조회라 함니다. 
   - 조건, 그룹, 정렬 이라는게 나와염 
*/

create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
price number,
made date,
expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '마이쮸', '사탕', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '초코파이', '과자', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '맛동산', '과자', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '참이슬', '주류', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, '처음처럼', '주류', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '바나나킥', '과자', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '빠삐코', '아이스크림', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '멘토스', '사탕', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '오레오', '과자', 2100, '2019-06-01', '2020-06-01');

commit;

-- 전체 테이블 내용 조회
select * from product;

-- 특정 항목만 조회
select name from product;
select name, price from product;
select name, price, type from product;

-- 없는 항목은 조회할 수 없다. 
select name, price, type, point from product;

--모든 항목을 조회
select no, name, price, type, made, expire from product;
select * from product;

-- 계산한 항목을 추가로 조회 
select name, expire-made from product;

-- 에러 : 와일드카드는 단독으로만 사용 가능
-- select *. expire-made from product;

-- 전체를 부른 후 expire과 made만 빼주는 식
select product.*, expire-made from product;

--조건(필터) : 숫자, 문자열, 날짜
-- select * from product where 필터링조건;

-- 조건이 1개 일때
select * from product where price < 1000;

-- 조건이 2개 이상이라면 %%, ||는 자바에서.
-- 오라클에서는 && 입력기호, ||는 문자열 덧셈기호라서 불가능함
-- 대신 알파벳 형태의 연산을 지원한다(and, or) ! 

select * from product where price >= 1000 and price <= 2000;

-- (Q)가격이 1000원 미만이거나 2천원 초과인 제품을 조회해보세여
select * from product where price < 1000 or price > 2000;

-- (주의)오라클에서 같다는 등호 = 1개임.
-- (Q)번호가 5번인 상품을 조회 
select * from product where no = 5;

-- (Q) 번호가 5번이 아닌 상품을 조회 
select * from product where no != 5;
select * from product where no <> 5;

-- 문자열 조건 : 일치, 유사 검색
-- 유사 검색 명령어는 2가지 이므로 구분하여 사용할 수 있어야 합니다.
-- like는 %를 사용하여 패턴 검사를 하는 방식
-- instr은 특정 키워드가 몇번째 위치에 존재하는지를 알아내는 방식
-- 전체적인 성능은 instr이 우세하지만 시작검사 만큼은 like가 빠름

select * from product where name = '스크류바';

-- 이 경우는 like가 처리 속도가 빠름(시작검사) 
select * from product where name like '스크류%';
select * from product where instr(name, '스크류')>0; -- 0보다 크다라고 표시 해 놓는건 true가 1 false가 0이기 때문에
select * from product where instr(name, '스크류') = 1;  -- 이것도 가능

-- 이 경우는 instr이 처리 속도가 빠름(시작검사 제외한 전부) 
select * from product where name like '%이%';
select * from product where instr(name, '이')>0

--(Q) 과자와 아이스크림을 조회 
select * from product where type = '과자' or type = '아이스크림';
select * from product where type in ('과자', '아이스크림');

--(Q) 과자와 주류 중에서 가격이 1000원 이상 2000이하인 제품 조회 
-- select * from product where price >= 1000 and price <=2000, type '과자', '주류'; 나의 오답 
select * from product where (type = '과자' or type = '아이스크림') and (price >= 1000 and price <=2000);
select * from product where type in('과자', '주류') and (price >= 1000 and price<=2000);
select * from product where type in('과자', '주류') and price between 1000 and 2000;

--(Q) 이름에 '초코' 가 들어가 있는 제품을 조회(instr 우세) 왜? 시작검사가 아니니까
select * from product where instr(name, '초코') >0;
select * from product where name like '%초코%';

--(Q) 이름에 '바나나'로 시작하는 제품을 조회
select * from product where name like '바나나%';
select * from product where instr(name,'바나나') = 1;

--(Q) 이름에 '이'라는 글자가 들어있지 않은 제품을 조회
-- (참고) not은 부정연산 자리에 쓸 수 있는 영어 단어형 연산 기호 
select * from product where instr(name, '이')=0;
select * from product where name not like '%이%';


-- 문자열 끝. 날짜 간다 
-- 기본 형식은 YYYY-MM-DD-HH24:MI:SS(자바와 약간 다름, 대소문자 구분이 없음) 
-- 문자열 처럼 사용할 수 있지만 국가마다 날짜 형식이 달라서 위험함. 
-- 날짜용 명령들이 존재한다. (to_char, to_date, extract)

-- extract는 원하는 날짜에서 숫자를 추출하는 명령어이다.
select name, made, extract(year from made) from product;

-- ex) 2019년에 생산한 제품 조회
select * from product where extract(year from made) = 2019;

-- (Q) 여름(6,7,8)월에 생산한 제품 조회 
select * from product where extract(month from made) in(6, 7 ,8);
select * from product where extract(month from made) between 6 and 8;
select * from product where extract(month from made) = 6;
select * from product where extract(month from made) = 7;
select * from product where extract(month from made) = 8;

-- to_char 명령은 날짜를 원하는 서식의 문자열로 변경하는 명령 
-- (자바의 SImpleDateFormat과 유사한 느낌)
select name, made, to_char(made, 'yyyy-mm-dd hh24:mi:ss') from product;

--ex) 2019년에 생산한 제품 조회
select * from product where to_char(made, 'yyyy')= '2019';

--ex) 봄(3,4, 5월)에 생산한 제품 조회 문자열은 03 04 이런식으로 써줘야 함.
select * from product where to_char(made, 'mm') = '03';
select * from product where to_char(made, 'mm') = '04';
select * from product where to_char(made, 'mm') = '05';
select * from product where to_char(made, 'mm') in('03','04','05');
select * from product where to_char(made, 'mm') between '03' and '05';

-- 정규표현식 형식으로도 가능. 하지만 가장 느림. 검색에서 제일 중요한건 성능.
select * from product where regexp_like(to_char(made, 'mm'), '^0[345]$');

--그냥 날짜 자체로도 비교 가능할까?
--ex) 2019년에 생산한 제품 조회 = 2019-01-01부터 2019-12-31까지 
--아래 코드는 틀린거임. 문자열과 날짜를 혼용하면 국가나 지역에 따라 작동하지 않을 수 있음.
--select * from product where to_char >= '2019-01-01' and made <= '2019-12-31'; 

--그래서 to_date를 사용하면 문자열을 날짜로 바꿀 수 있다.(형식을 알려줘야 한다).
select * from product where made >= to_date('2019-01-01 00:00:00','yyyy-mm-dd hh24:mi:ss'); -- 어디가 년도인지 월인지 날짜인지 모르니까 지정해줘야함
select * from product where made <= to_date('2019-12-31 23:59:59','yyyy-mm-dd hh24:mi:ss'); -- 이러면 12월 31이 빠져버린다.
select * from product where made between to_date('2019-01-01 00:00:00','yyyy-mm-dd hh24:mi:ss') and to_date ('2019-12-31 23:59:59','yyyy-mm-dd hh24:mi:ss'); 

-- 날짜에서 sysdate라는 키워드는 현재 시각을 의미한다. 
-- 최근 1년간 생산된 제품 조회  라는 뜻. sysdate(현재시각)에서 -365일단위니까. and 현재시각 즉 (현재시각-365)와 현재시각 사이의 값을 말함. 
select * from product where made between sysdate-365 and sysdate;

-- 최근 5분간 생산 내역 조회 나누기 순서가 상관이 없구나 
select * from product where made between sysdate-1/24/60*5 and sysdate;
select * from product where made between sysdate-1/60/24*5 and sysdate;
select * from product where made between sysdate-5/24/60 and sysdate;

-- 정렬 
-- 조회가 끝난 데이터를 원하는 순서대로 나열하는 작업
-- 오름차순(ascending, asc) 내림차순(descending, desc)으로 구분
-- (주의) 정렬은 데이터가 확정된 이후에 해야한다.
-- order by는 정렬을 의미 

select * from product order by no asc;
select * from product order by price asc;
select * from product order by price desc;

--select *from product order by price desc where price between 1000 and 2000; -- 이래서 정렬을 마지막에. 10억개 중 5개를 고르는건 ㅄ짓이니까.
select * from product where price between 1000 and 2000 order by price desc;

--만약 정렬 시 동일한 항목이 존재한다면, 하위 정렬 조건을 추가해야 한다. 
select * from product order by price desc, no asc; --같은 애들은 번호순으로 내림차순 해라 라는 뜻.

--(Q) 최근 제조 상품부터 출력
select * from product order by made desc;

--(Q) 이름순으로 출력
select * from product order by name asc;

--(Q) 과자와 주류 상품들을 가격이 비싼 순으로 출력
select * from product where type in('과자', '주류') order by price desc no asc;

--(Q) 유통기한이 가장 짧은 상품부터 출력 
select * from product order by expire-made asc, no asc;
select * from product order by expire asc, no asc;
select product.*, expire-made from product order by expire-made asc, no asc; --남은 날짜까지 보게하는 
select product.*, expire-made 유통기한일수 from product order by 유통기한일수 asc, no asc;
-- 조회하는 항목에는 별칭을 붙일 수 있다. 즉 원하는 이름으로 바꿀 수 있음. 

-- 별칭에 띄어쓰기 하고싶으면 쌍따옴표로 감싼다.
-- 대신 자바에서 명령문을 만들 때에는 쓰기가 어려움. 
select product.*, expire-made "유통 기한 일수" from product order by "유통 기한 일수" asc, no asc;
