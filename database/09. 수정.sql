/* ����(update)
    -  �̹� �����ϴ� �����͸�  ��ġ�� ��
    -  commit / rollback�� ������ ����.
    -  update ���̺��̸� set �ٲܳ��� [����]
    -  ��ü�� �����ϴ� ���� ���� ����, ������ ���� ���ϴ� �׸��� �����Ѵ� ����.
    -  Ư�� PK(Primary key)�� �̿��� �ϳ��� �׸� ��ġ�� ��찡 ���. 
*/

-- ��� ��ǰ ������ 0���� ����
update product set price = 0; 

-- 1�� ��ǰ�� ������ 1500������ ����
update product set price = 1500 where no = 1;

-- (Q) ��ũ������ ������ 2õ������ ����
update product set price = 2000 where no = 1;
update product set price = 2000 where name = '��ũ����';

-- (Q) ���佺�� ������ 1000������ �����ϰ� �з��� ���ڷ� ����. �ΰ� �ٲܶ� ,�� ����Ѵ� 
update product set price = 1000, type = '����' where no = 9;
update product set price = 1000, type = '����' where name = '���佺'

-- ���� ���� ó��
-- (Q) ���� ���� 500�� ����
update product set price = price-500 where type = '����';

-- (Q) ���̽�ũ�� ���� 10% �λ� 
update product set price = price*1.1 where type = '���̽�ũ��';

select * from product;
rollback;