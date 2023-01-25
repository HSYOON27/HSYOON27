/*--- ������(SEQUENCE)
- ��ȣ�� �̿��Ͽ� �����͵��� �����ؾ� �ϴ� ��� ��ȣ�� �����ϴ� ������. 
- �������� �ѹ� �߱��� ��ȣ�� ����� �ٽ� �߱����� ����. 

���� : CREATE SEQUENCE �̸� [�ɼ�]; 
��� : �̸�.NEXTVAL
��ȸ : SELECT * FROM USER_SEQUENCES;
���� : DROP SEQUENCE �̸�; 
*/
--������ ����
create sequence item_seq;
--������ ����
drop sequence item_seq;
--������ ��ȸ
select * from user_sequences;

--������ ���̺� ����
create table item(
no number primary key,  -----��ǥ�׸�(not null+ unique) ��ģ����  
name varchar2(60) not null check(regexp_like(name,'^[��-�R0-9]+$')),  ---������ �׸� �������� ����ǥ���� 
type varchar2(15) not null,
price number not null check(price >= 0),
early char(1) not null check(early in ('0', '1')),
event char(1) not null check(event in('0', '1'))
);

-- ������ ���̺� ����
drop table item;

-- ������ ���� ���� 
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, '���̽��ķ���', '�ַ�', 1200, '1','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, 'Ŭ�������', '�ַ�', 3000, '0','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, '�ٳ���ű', '����', 1500, '0','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, '��Ϲ���Ĩ', '����', 2000, '1','0');
commit;

--������ ���� ��ȸ 
select * from item;


--subject ���̺� ����� 
create table subject(
no number primary key,
name varchar2(30)not null,
period number not null check(period >= 0),
price number not null check(price >= 0),
type varchar2(12) not null check (type in('�¶���', '��������'))
);

--subject ���� ����� 
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, '�ڹ� �����Ͱ���', 90, 1000000, '�¶���');
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, '���̽� ����', 60, 600000, '�¶���');
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, '�� ������ �ܱ�缺', 120, 1200000, '��������');
commit;

--subject ���̺� ���� ��ȸ
select * from subject;

--subject ���̺� ����
drop table subject;

--������ ���� 
create sequence subject_seq;
--������ ����
drop sequence subject_seq;
--������ ��ȸ
select*from user_sequences;

