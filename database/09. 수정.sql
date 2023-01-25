/* 수정(update)
    -  이미 존재하는 데이터를  고치는 것
    -  commit / rollback의 영향을 받음.
    -  update 테이블이름 set 바꿀내용 [조건]
    -  전체를 수정하는 경우는 거의 없고, 조건을 통해 원하는 항목을 수정한다 보통.
    -  특히 PK(Primary key)를 이용해 하나의 항목만 고치는 경우가 잦다. 
*/

-- 모든 상품 가격을 0으로 변경
update product set price = 0; 

-- 1번 상품의 가격을 1500원으로 변경
update product set price = 1500 where no = 1;

-- (Q) 스크류바의 가격을 2천원으로 변경
update product set price = 2000 where no = 1;
update product set price = 2000 where name = '스크류바';

-- (Q) 멘토스의 가격을 1000원으로 변경하고 분류를 과자로 변경. 두개 바꿀땐 ,를 사용한다 
update product set price = 1000, type = '과자' where no = 9;
update product set price = 1000, type = '과자' where name = '멘토스'

-- 누적 연산 처리
-- (Q) 과자 가격 500원 할인
update product set price = price-500 where type = '과자';

-- (Q) 아이스크림 가격 10% 인상 
update product set price = price*1.1 where type = '아이스크림';

select * from product;
rollback;