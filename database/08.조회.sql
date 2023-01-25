/*
    ��ȸ(Read)
   - �̸� ���̺� �־�� �����͸� ���ϴ� ������ �°� Ž���ϴ°� ��ȸ�� �Դϴ�. 
   - ����, �׷�, ���� �̶�°� ���Ϳ� 
*/

create table product(
no number primary key,
name varchar2(30) not null,
type varchar2(15) check(type in ('����','���̽�ũ��','�ַ�','����')),
price number,
made date,
expire date
);

insert into product values(1, '��ũ����', '���̽�ũ��', 1200, '2020-05-01', '2020-10-01');
insert into product values(2, '������', '����', 900, '2020-01-01', '2021-01-01');
insert into product values(3, '��������', '����', 3000, '2020-01-01', '2021-01-01');
insert into product values(4, '������', '����', 2200, '2020-02-01', '2020-10-20');
insert into product values(5, '���̽�', '�ַ�', 1000, '2020-01-05', '2020-04-05');
insert into product values(6, 'ó��ó��', '�ַ�', 1000, '2020-03-15', '2020-08-15');
insert into product values(7, '�ٳ���ű', '����', 1500, '2020-05-03', '2020-06-03');
insert into product values(8, '������', '���̽�ũ��', 1000, '2019-12-01', '2020-06-01');
insert into product values(9, '���佺', '����', 1200, '2020-03-20', '2020-12-31');
insert into product values(10, '������', '����', 2100, '2019-06-01', '2020-06-01');

commit;

-- ��ü ���̺� ���� ��ȸ
select * from product;

-- Ư�� �׸� ��ȸ
select name from product;
select name, price from product;
select name, price, type from product;

-- ���� �׸��� ��ȸ�� �� ����. 
select name, price, type, point from product;

--��� �׸��� ��ȸ
select no, name, price, type, made, expire from product;
select * from product;

-- ����� �׸��� �߰��� ��ȸ 
select name, expire-made from product;

-- ���� : ���ϵ�ī��� �ܵ����θ� ��� ����
-- select *. expire-made from product;

-- ��ü�� �θ� �� expire�� made�� ���ִ� ��
select product.*, expire-made from product;

--����(����) : ����, ���ڿ�, ��¥
-- select * from product where ���͸�����;

-- ������ 1�� �϶�
select * from product where price < 1000;

-- ������ 2�� �̻��̶�� %%, ||�� �ڹٿ���.
-- ����Ŭ������ && �Է±�ȣ, ||�� ���ڿ� ������ȣ�� �Ұ�����
-- ��� ���ĺ� ������ ������ �����Ѵ�(and, or) ! 

select * from product where price >= 1000 and price <= 2000;

-- (Q)������ 1000�� �̸��̰ų� 2õ�� �ʰ��� ��ǰ�� ��ȸ�غ�����
select * from product where price < 1000 or price > 2000;

-- (����)����Ŭ���� ���ٴ� ��ȣ = 1����.
-- (Q)��ȣ�� 5���� ��ǰ�� ��ȸ 
select * from product where no = 5;

-- (Q) ��ȣ�� 5���� �ƴ� ��ǰ�� ��ȸ 
select * from product where no != 5;
select * from product where no <> 5;

-- ���ڿ� ���� : ��ġ, ���� �˻�
-- ���� �˻� ��ɾ�� 2���� �̹Ƿ� �����Ͽ� ����� �� �־�� �մϴ�.
-- like�� %�� ����Ͽ� ���� �˻縦 �ϴ� ���
-- instr�� Ư�� Ű���尡 ���° ��ġ�� �����ϴ����� �˾Ƴ��� ���
-- ��ü���� ������ instr�� �켼������ ���۰˻� ��ŭ�� like�� ����

select * from product where name = '��ũ����';

-- �� ���� like�� ó�� �ӵ��� ����(���۰˻�) 
select * from product where name like '��ũ��%';
select * from product where instr(name, '��ũ��')>0; -- 0���� ũ�ٶ�� ǥ�� �� ���°� true�� 1 false�� 0�̱� ������
select * from product where instr(name, '��ũ��') = 1;  -- �̰͵� ����

-- �� ���� instr�� ó�� �ӵ��� ����(���۰˻� ������ ����) 
select * from product where name like '%��%';
select * from product where instr(name, '��')>0

--(Q) ���ڿ� ���̽�ũ���� ��ȸ 
select * from product where type = '����' or type = '���̽�ũ��';
select * from product where type in ('����', '���̽�ũ��');

--(Q) ���ڿ� �ַ� �߿��� ������ 1000�� �̻� 2000������ ��ǰ ��ȸ 
-- select * from product where price >= 1000 and price <=2000, type '����', '�ַ�'; ���� ���� 
select * from product where (type = '����' or type = '���̽�ũ��') and (price >= 1000 and price <=2000);
select * from product where type in('����', '�ַ�') and (price >= 1000 and price<=2000);
select * from product where type in('����', '�ַ�') and price between 1000 and 2000;

--(Q) �̸��� '����' �� �� �ִ� ��ǰ�� ��ȸ(instr �켼) ��? ���۰˻簡 �ƴϴϱ�
select * from product where instr(name, '����') >0;
select * from product where name like '%����%';

--(Q) �̸��� '�ٳ���'�� �����ϴ� ��ǰ�� ��ȸ
select * from product where name like '�ٳ���%';
select * from product where instr(name,'�ٳ���') = 1;

--(Q) �̸��� '��'��� ���ڰ� ������� ���� ��ǰ�� ��ȸ
-- (����) not�� �������� �ڸ��� �� �� �ִ� ���� �ܾ��� ���� ��ȣ 
select * from product where instr(name, '��')=0;
select * from product where name not like '%��%';


-- ���ڿ� ��. ��¥ ���� 
-- �⺻ ������ YYYY-MM-DD-HH24:MI:SS(�ڹٿ� �ణ �ٸ�, ��ҹ��� ������ ����) 
-- ���ڿ� ó�� ����� �� ������ �������� ��¥ ������ �޶� ������. 
-- ��¥�� ��ɵ��� �����Ѵ�. (to_char, to_date, extract)

-- extract�� ���ϴ� ��¥���� ���ڸ� �����ϴ� ��ɾ��̴�.
select name, made, extract(year from made) from product;

-- ex) 2019�⿡ ������ ��ǰ ��ȸ
select * from product where extract(year from made) = 2019;

-- (Q) ����(6,7,8)���� ������ ��ǰ ��ȸ 
select * from product where extract(month from made) in(6, 7 ,8);
select * from product where extract(month from made) between 6 and 8;
select * from product where extract(month from made) = 6;
select * from product where extract(month from made) = 7;
select * from product where extract(month from made) = 8;

-- to_char ����� ��¥�� ���ϴ� ������ ���ڿ��� �����ϴ� ��� 
-- (�ڹ��� SImpleDateFormat�� ������ ����)
select name, made, to_char(made, 'yyyy-mm-dd hh24:mi:ss') from product;

--ex) 2019�⿡ ������ ��ǰ ��ȸ
select * from product where to_char(made, 'yyyy')= '2019';

--ex) ��(3,4, 5��)�� ������ ��ǰ ��ȸ ���ڿ��� 03 04 �̷������� ����� ��.
select * from product where to_char(made, 'mm') = '03';
select * from product where to_char(made, 'mm') = '04';
select * from product where to_char(made, 'mm') = '05';
select * from product where to_char(made, 'mm') in('03','04','05');
select * from product where to_char(made, 'mm') between '03' and '05';

-- ����ǥ���� �������ε� ����. ������ ���� ����. �˻����� ���� �߿��Ѱ� ����.
select * from product where regexp_like(to_char(made, 'mm'), '^0[345]$');

--�׳� ��¥ ��ü�ε� �� �����ұ�?
--ex) 2019�⿡ ������ ��ǰ ��ȸ = 2019-01-01���� 2019-12-31���� 
--�Ʒ� �ڵ�� Ʋ������. ���ڿ��� ��¥�� ȥ���ϸ� ������ ������ ���� �۵����� ���� �� ����.
--select * from product where to_char >= '2019-01-01' and made <= '2019-12-31'; 

--�׷��� to_date�� ����ϸ� ���ڿ��� ��¥�� �ٲ� �� �ִ�.(������ �˷���� �Ѵ�).
select * from product where made >= to_date('2019-01-01 00:00:00','yyyy-mm-dd hh24:mi:ss'); -- ��� �⵵���� ������ ��¥���� �𸣴ϱ� �����������
select * from product where made <= to_date('2019-12-31 23:59:59','yyyy-mm-dd hh24:mi:ss'); -- �̷��� 12�� 31�� ����������.
select * from product where made between to_date('2019-01-01 00:00:00','yyyy-mm-dd hh24:mi:ss') and to_date ('2019-12-31 23:59:59','yyyy-mm-dd hh24:mi:ss'); 

-- ��¥���� sysdate��� Ű����� ���� �ð��� �ǹ��Ѵ�. 
-- �ֱ� 1�Ⱓ ����� ��ǰ ��ȸ  ��� ��. sysdate(����ð�)���� -365�ϴ����ϱ�. and ����ð� �� (����ð�-365)�� ����ð� ������ ���� ����. 
select * from product where made between sysdate-365 and sysdate;

-- �ֱ� 5�а� ���� ���� ��ȸ ������ ������ ����� ������ 
select * from product where made between sysdate-1/24/60*5 and sysdate;
select * from product where made between sysdate-1/60/24*5 and sysdate;
select * from product where made between sysdate-5/24/60 and sysdate;

-- ���� 
-- ��ȸ�� ���� �����͸� ���ϴ� ������� �����ϴ� �۾�
-- ��������(ascending, asc) ��������(descending, desc)���� ����
-- (����) ������ �����Ͱ� Ȯ���� ���Ŀ� �ؾ��Ѵ�.
-- order by�� ������ �ǹ� 

select * from product order by no asc;
select * from product order by price asc;
select * from product order by price desc;

--select *from product order by price desc where price between 1000 and 2000; -- �̷��� ������ ��������. 10�ﰳ �� 5���� ���°� �����̴ϱ�.
select * from product where price between 1000 and 2000 order by price desc;

--���� ���� �� ������ �׸��� �����Ѵٸ�, ���� ���� ������ �߰��ؾ� �Ѵ�. 
select * from product order by price desc, no asc; --���� �ֵ��� ��ȣ������ �������� �ض� ��� ��.

--(Q) �ֱ� ���� ��ǰ���� ���
select * from product order by made desc;

--(Q) �̸������� ���
select * from product order by name asc;

--(Q) ���ڿ� �ַ� ��ǰ���� ������ ��� ������ ���
select * from product where type in('����', '�ַ�') order by price desc no asc;

--(Q) ��������� ���� ª�� ��ǰ���� ��� 
select * from product order by expire-made asc, no asc;
select * from product order by expire asc, no asc;
select product.*, expire-made from product order by expire-made asc, no asc; --���� ��¥���� �����ϴ� 
select product.*, expire-made ��������ϼ� from product order by ��������ϼ� asc, no asc;
-- ��ȸ�ϴ� �׸񿡴� ��Ī�� ���� �� �ִ�. �� ���ϴ� �̸����� �ٲ� �� ����. 

-- ��Ī�� ���� �ϰ������ �ֵ���ǥ�� ���Ѵ�.
-- ��� �ڹٿ��� ��ɹ��� ���� ������ ���Ⱑ �����. 
select product.*, expire-made "���� ���� �ϼ�" from product order by "���� ���� �ϼ�" asc, no asc;
