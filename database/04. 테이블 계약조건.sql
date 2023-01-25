------------Day 18 ������ �÷� ���̺�
CREATE TABLE PLAN (
telecom char(2) not null check(telecom in ('SK', 'KT', 'LG')),
name varchar2(60) not null unique,
price number not null check(price>=0),
data number not null check(data>=0),
call number not null check(call>=0),
sms number not null check(sms >=0)
);

-----------�̻� ������ �߰� �׽�Ʈ
insert into plan(telecom, name, price, data, call, sms)
values(null,null,null,null,null,null);

-----------���� ������ : ����ũ���� 2�� �߰��� �ȵȴ�.  
insert into plan(telecom, name, price, data, call, sms)
values('SK', '5G ����Ʈ 52', 52000, 200, 1000, 2000);

----------- menu ���̺� ���� 
create table menu(
name varchar2(30),
type varchar2(12),
price number,
event varchar2(9)
);

------------ menu ���̺� ���� 
drop table menu;

------------ menu ������ �Է� 
insert into menu(name, type, price, event)
values('�Ƹ޸�ī��', '����', 2500, '1');
insert into menu(name, type, price, event)
values('��ī��', '����', 3500, '0');
insert into menu(name, type, price, event)
values('ġ������ũ', '����Ʈ', 5000, '1');
insert into menu(name, type, price, event)
values('��ī��', '����Ʈ', 3000, '0');
commit;

------------- ������ ��ȸ
select * from menu;

------------- ���̺� ���� ���� �� ���� 
create table menu(
name varchar2(30) not null unique,
type varchar2(9) not null check(type in ('����','����Ʈ')),
price number not null check(price >=0),
event char(1) not null check(event in (0, 1))
);

------------- �ڹٿ��� ���� �����ͺ��̽����� 0�̳� 1�� ó���Ѵ�
------------- 0�� false 1�� true�� ��� 

------------- day18 �޴��� �Ǹ����� ���̺�
create table mobile(
name varchar2(30) not null, 
telecom char(2) not null check(telecom in('SK', 'KT', 'LG')),
price varchar2(20) not null,
month varchar2(19) not null check(month in('24����', '30����', '�������� ����')),
unique(name, telecom)
);
------------- ���̺� ���� 
drop table mobile;

-------------- ����� ���̺� ������ �Է� 
insert into mobile(name, telecom, price, month)
values('������22s', 'SK', '180����', '�������� ����');
insert into mobile(name, telecom, price, month)
values('������22s', 'KT', '175����', '24����');
insert into mobile(name, telecom, price, month)
values('������14', 'LG', '200����', '30����');
insert into mobile(name, telecom, price, month)
values('������14', 'SK', '199����', '�������� ����');

--------------- ������ ��ȸ
select * from mobile;

