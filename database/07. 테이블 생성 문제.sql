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
