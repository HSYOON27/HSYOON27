
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
month varchar2(19) not null check(month in('24����', '30����', '36����', '�������� ����')),
unique(name, telecom)  --�̷��� name ���� ���Ƶ� ����, telecom�� ������ �ȵ�. �г� �� ��ȣ ���� ���� 
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
commit;
--------------- ������ ��ȸ
select * from mobile;

