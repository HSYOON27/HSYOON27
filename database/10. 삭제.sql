/*
    삭제(delete)
    - 존재하는 데이터를 지우는 작업 
    - 데이터의 변경이 생기므로 commit / rollback 이 필요합니당.
    - 조건을 대부분 사용
    
      delete 테이블 이름 [조건] 
*/

--전체 삭제 
delete product;
-- delete from product;

-- (Q)1번 상품 삭제
delete product where no = 1;
-- (Q) 2020년 상반기에 제조된 상품 정보를 삭제;
delete product where made between to_date('2020-01-01 00:00:00','yyyy-mm-dd hh24:mi:ss') and to_date ('2020-06-30 23:59:59','yyyy-mm-dd hh24:mi:ss'); 
delete product where extract (year from made) = 2020 and extract(month from made) between 1 and 6;
delete product where regexp_like(to_char(made, 'yyyy-mm'), '^2020-0[1-6]$');

select * from product;
rollback;
