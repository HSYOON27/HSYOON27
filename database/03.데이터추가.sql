--������ �߰�
/*
  ������ �߰� 
  - �����ʹ� ��ü�� �ƴϴ� (CREATE�� �������� �ʴ´�)
  - ���̺��� �̹� �����Ǿ� �־�� �Ѵ�.
  - ���ڴ� ����ǥ�� ������ �ʴ´�(�ڹٿ� ����)
  - ���ڿ��� ����ǥ�� 1�� ¥���� �����Ѵ�(�ڹٿ� �ٸ�)
  - INSERT INTO ���̺��̸�(������� �÷�) VALUES ������� ��);
*/

INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(1, '������', '������', 8);
INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(2, '������ �޽�', '�Ƹ���Ƽ��', 7);
INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(3, '�ø��� ����', '������', 4);
INSERT INTO WORLDCUP(RANK, NAME, NATION, GOAL)
VALUES(4, '�Ǹ��� �˹ٷ���', '�Ƹ���Ƽ��', 4);

--������ ��ȸ
SELECT * FROM WORLDCUP;

--���ϸ� ������ �Է�
INSERT INTO POCKETMON(NO, NAME, TYPE)
VALUES(1, '�̻��ؾ�', 'Ǯ');
INSERT INTO POCKETMON(NO, NAME, TYPE)
VALUES(4, '���̸�', '�Ҳ�');
INSERT INTO POCKETMON(NO, NAME, TYPE)
VALUES(7, '���α�', '��');
INSERT INTO POCKETMON(NO, NAME, TYPE)
VALUES(25, '��ī��', '����');

--������ ��ȸ
SELECT * FROM POCKETMON;

--�޴޸���Ʈ ������ �Է�
INSERT INTO MEDALIST(NAME, EVENT, TYPE, GOLD, SILVER, BRONZE)
VALUES('������', '���', '�ϰ�', 4, 2, 0);
INSERT INTO MEDALIST(NAME, EVENT, TYPE, GOLD, SILVER, BRONZE)
VALUES('�����', '���', '�ϰ�', 4, 1, 1);
INSERT INTO MEDALIST(NAME, EVENT, TYPE, GOLD, SILVER, BRONZE)
VALUES('���̰�', '��ƮƮ��', '����', 4, 0, 1);

--������ ��ȸ
SELECT * FROM MEDALIST;

-- rollback;  ��������� �۾� ������ ��ȿȭ
-- commit; ��������� �۾� ������ ���� ����.
