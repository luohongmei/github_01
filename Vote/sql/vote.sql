--�û���
create table user1
(
  userid   varchar2(10) not null primary key,           --�û�id
  username varchar2(20) not null,           --�û���
  password  varchar2(20) not null,           --�û�����
  status    number(6) not null,              --�û�״̬
  version   number(10) not null              --��ɫ
);

 
--ͶƱ����
create table subject
(
   sub_id    number(10) not null primary key,            --ͶƱ������
   title varchar2(200) not null,         --ͶƱ����
   type  number(6) not null              --ͶƱ����:   ��ѡ  1    ��ѡ   2
);

select * from subject;



--ͶƱ���ݶ�Ӧ��ѡ���
create table option1
(
  op_id   number(10) not null primary key,  --���
  option1  varchar2(100) not null,--ͶƱѡ��
  sub_id  number(10) not null,  --ͶƱ������
  order1  number(10) not null  --��ʾ˳��
);

drop table option;
delete from option;
create sequence seq_option start with 1 increment by 1;
create sequence seq_item start with 500 increment by 1;
create sequence seq_subject start with 500 increment by 1;

drop sequence seq_item;

 --�û�ͶƱȡֵ��
create table item
(
  it_id      number(10) not null primary key, --���
  op_id      number(10) not null, --ͶƱѡ��id
  sub_id      number(10) not null, --ͶƱ������id
  userid varchar2(10) not null --�û�id
);
 
--����û�
insert into user1 (userid, username, password, status, version)
values ('ss', '��ͨ�û�', 'a', 1, 1);
insert into user1 (userid, username, password, status, version)
values ('admin', '����Ա', 'a', 2, 1);
insert into user1 (userid, username, password, status, version)
values ('zy', 's', 'a', 1, 0);
insert into user1 (userid, username, password, status, version)
values ('yc', 'a', 'a', 2, 0);
insert into user1 (userid, username, password, status, version)
values ('yc1', 'a', 'a', 2, 1);
insert into user1 (userid, username, password, status, version)
values ('yc2', 'a', 'a', 2, 1);
insert into user1 (userid, username, password, status, version)
values ('yc3', 'a', 'a', 2,1);
insert into user1 (userid, username, password, status, version)
values ('yc4', 'a', 'a',2,1);
insert into user1 (userid, username, password, status, version)
values ('yc5', 'a', 'a',2,1);
insert into user1 (userid, username, password, status, version)
values ('yc6', 'a', 'a', 1,0);
commit;


select * from user1;
--���ͶƱ����
insert into subject (sub_id, title, type)
values (103, 'ѡ������Ŀ����õ����ع���',2);
insert into subject (sub_id, title, type)
values (104, 'ѡ������Ŀ����õ����뷨',1);
insert into subject (sub_id, title, type)
values (105, 'ѡ������Ŀ����õ��������칤��',1);
insert into subject (sub_id, title, type)
values (440, '���������ĵط�',1);
insert into subject (sub_id, title, type)
values (101, 'ѡ������Ŀ����õ������',1);
insert into subject (sub_id, title, type)
values (102, 'ѡ������Ŀ����õ�ɱ�����',1);
commit; 
--��������е�ѡ��
insert into option1
values (397, '��Ѷqq',105,1);
insert into option1 
values (398, 'msn',105,2);
insert into option1 
values (380, 'Ѹ��',103,1);
insert into option1 
values (399, '����uc',105,3);
insert into option1
values (400, '����',105,4);
insert into option1
values (401, 'skype',105,5);
insert into option1
values (402, '��������',105,6);
insert into option1
values (403, '�ٶ�hi',105,7);
insert into option1 
values (404, '΢��ie�����',101,1);
insert into option1
values (405, '�����firefox�������',101,2);
insert into option1
values (381, '���ʿ쳵',103,2);
insert into option1 
values (382, '��¿',103,3);
insert into option1 
values (383, '���ؾ���',103,4);
insert into option1 
values (384, '��������',103,5);
insert into option1
values (385, '�ѹ�ƴ��',104,1);
insert into option1
values (386, '�ѹ����',104,2);
insert into option1 
values (387, 'qqƴ��',104,3);
insert into option1 
values (388, 'qq���',104,4);
insert into option1 
values (389, '�ȸ�ƴ��',104,5);
insert into option1 
values (390, '�Ϲ�ƴ��',104,6);
insert into option1 
values (391, '����abc',104,7);
insert into option1
values (392, '΢��ƴ��',104,8);
insert into option1 
values (393, '����ƴ��',104,9);
insert into option1 
values (394, '�������',104,10);
insert into option1 
values (395, '��Ʒƴ��',104,11);
insert into option1 
values (396, '��Ʒ���',104,12);
insert into option1 
values (406, '����֮�������',101,3);
insert into option1 
values (407, '360�����',101,4);
insert into option1 
values (408, '���������',101,5);
insert into option1 
values (409, '�ȸ裨chrome�������',101,6);
insert into option1 
values (410, '����˹��',102,1);
insert into option1 
values (411, '360ɱ��',102,2);
insert into option1
values (412, 'mcafee',102,3);
insert into option1 
values (413, 'avg',102,4);
insert into option1
values (414, 'ŵ��ɱ��',102,5);
insert into option1 
values (415, '����ɱ��',102,6);
insert into option1 
values (416, '��ɽ����',102,7);
insert into option1 
values (417, '����ɱ��',102,8);
insert into option1 
values (418, '΢�����',102,9);
insert into option1 
values (419, '����ɱ��',102,10);
insert into option1
values (441, '����',440,1);
insert into option1 
values (442, '����',440,2);
commit;
--���ѡ����
insert into item 
values (422,405,101, 'yc1');
insert into item 
values (423,405,101, 'yc2');
insert into item
values (424,404,101, 'yc3');
insert into item
values (425,407,101, 'yc4');
insert into item 
values (426,408,101, 'yc5');
insert into item 
values (427,409,101, 'yc');
insert into item 
values (445,404,101, 'zy');
insert into item 
values (367,136,135, 'admin');
insert into item 
values (420,405,101, 'admin');
insert into item 
values (421,406,101, 'ss');



commit;


select * from option1;
select * from item;





alter table item add constraint item_uk unique(op_id,userid);




