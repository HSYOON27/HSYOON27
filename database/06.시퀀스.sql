/*--- ½ÃÄö½º(SEQUENCE)
- ¹øÈ£¸¦ ÀÌ¿ëÇÏ¿© µ¥ÀÌÅÍµéÀ» ±¸ºĞÇØ¾ß ÇÏ´Â °æ¿ì ¹øÈ£¸¦ »ı¼ºÇÏ´Â µµ±¸ÀÓ. 
- ½ÃÄö½º´Â ÇÑ¹ø ¹ß±ŞÇÑ ¹øÈ£´Â Àı´ë·Î ´Ù½Ã ¹ß±ŞÇÏÁö ¾ÊÀ½. 

»ı¼º : CREATE SEQUENCE ÀÌ¸§ [¿É¼Ç]; 
»ç¿ë : ÀÌ¸§.NEXTVAL
Á¶È¸ : SELECT * FROM USER_SEQUENCES;
»èÁ¦ : DROP SEQUENCE ÀÌ¸§; 
*/
--½ÃÄö½º »ı¼º
create sequence item_seq;
--½ÃÄö½º »èÁ¦
drop sequence item_seq;
--½ÃÄö½º Á¶È¸
select * from user_sequences;

--¾ÆÀÌÅÛ Å×ÀÌºí »ı¼º
create table item(
no number primary key,  -----´ëÇ¥Ç×¸ñ(not null+ unique) ÇÕÄ£°ÅÀÓ  
name varchar2(60) not null check(regexp_like(name,'^[°¡-ÆR0-9]+$')),  ---¿ŞÂÊÀÌ Ç×¸ñ ¿À¸¥ÂÊÀÌ Á¤±ÔÇ¥Çö½Ä 
type varchar2(15) not null,
price number not null check(price >= 0),
early char(1) not null check(early in ('0', '1')),
event char(1) not null check(event in('0', '1'))
);

-- ¾ÆÀÌÅÛ Å×ÀÌºí »èÁ¦
drop table item;

-- ¾ÆÀÌÅÛ ³»¿ë »ı¼º 
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, 'ÂüÀÌ½½ÈÄ·¹½Ã', 'ÁÖ·ù', 1200, '1','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, 'Å¬¶ó¿ìµå¸ÆÁÖ', 'ÁÖ·ù', 3000, '0','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, '¹Ù³ª³ªÅ±', '°úÀÚ', 1500, '0','1');
insert into item(no, name, type, price, early, event)
values(item_seq.nextval, 'Çã´Ï¹öÅÍÄ¨', '°úÀÚ', 2000, '1','0');
commit;

--¾ÆÀÌÅÛ ³»¿ë Á¶È¸ 
select * from item;


--subject Å×ÀÌºí ¸¸µé±â 
create table subject(
no number primary key,
name varchar2(30)not null,
period number not null check(period >= 0),
price number not null check(price >= 0),
type varchar2(12) not null check (type in('¿Â¶óÀÎ', '¿ÀÇÁ¶óÀÎ'))
);

--subject ³»¿ë ¸¸µé±â 
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, 'ÀÚ¹Ù ¸¶½ºÅÍ°úÁ¤', 90, 1000000, '¿Â¶óÀÎ');
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, 'ÆÄÀÌ½ã ±âÃÊ', 60, 600000, '¿Â¶óÀÎ');
insert into subject(no, name, period, price, type)
values(subject_seq.nextval, 'À¥ °³¹ßÀÚ ´Ü±â¾ç¼º', 120, 1200000, '¿ÀÇÁ¶óÀÎ');
commit;

--subject Å×ÀÌºí ³»¿ë Á¶È¸
select * from subject;

--subject Å×ÀÌºí »èÁ¦
drop table subject;

--½ÃÄö½º »ı¼º 
create sequence subject_seq;
--½ÃÄö½º »èÁ¦
drop sequence subject_seq;
--½ÃÄö½º Á¶È¸
select*from user_sequences;

