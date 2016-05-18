--用户表
create table user1
(
  userid   varchar2(10) not null primary key,           --用户id
  username varchar2(20) not null,           --用户名
  password  varchar2(20) not null,           --用户密码
  status    number(6) not null,              --用户状态
  version   number(10) not null              --角色
);

 
--投票主题
create table subject
(
   sub_id    number(10) not null primary key,            --投票主题编号
   title varchar2(200) not null,         --投票主题
   type  number(6) not null              --投票类型:   单选  1    多选   2
);

select * from subject;



--投票内容对应的选项表
create table option1
(
  op_id   number(10) not null primary key,  --编号
  option1  varchar2(100) not null,--投票选项
  sub_id  number(10) not null,  --投票主题编号
  order1  number(10) not null  --显示顺序
);

drop table option;
delete from option;
create sequence seq_option start with 1 increment by 1;
create sequence seq_item start with 500 increment by 1;
create sequence seq_subject start with 500 increment by 1;

drop sequence seq_item;

 --用户投票取值表
create table item
(
  it_id      number(10) not null primary key, --编号
  op_id      number(10) not null, --投票选项id
  sub_id      number(10) not null, --投票主题编号id
  userid varchar2(10) not null --用户id
);
 
--添加用户
insert into user1 (userid, username, password, status, version)
values ('ss', '普通用户', 'a', 1, 1);
insert into user1 (userid, username, password, status, version)
values ('admin', '管理员', 'a', 2, 1);
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
--添加投票主题
insert into subject (sub_id, title, type)
values (103, '选出你心目中最好的下载工具',2);
insert into subject (sub_id, title, type)
values (104, '选出你心目中最好的输入法',1);
insert into subject (sub_id, title, type)
values (105, '选出你心目中最好的网络聊天工具',1);
insert into subject (sub_id, title, type)
values (440, '你最想区的地方',1);
insert into subject (sub_id, title, type)
values (101, '选出你心目中最好的浏览器',1);
insert into subject (sub_id, title, type)
values (102, '选出你心目中最好的杀毒软件',1);
commit; 
--添加主题中的选项
insert into option1
values (397, '腾讯qq',105,1);
insert into option1 
values (398, 'msn',105,2);
insert into option1 
values (380, '迅雷',103,1);
insert into option1 
values (399, '新浪uc',105,3);
insert into option1
values (400, '飞信',105,4);
insert into option1
values (401, 'skype',105,5);
insert into option1
values (402, '阿里旺旺',105,6);
insert into option1
values (403, '百度hi',105,7);
insert into option1 
values (404, '微软ie浏览器',101,1);
insert into option1
values (405, '火狐（firefox）浏览器',101,2);
insert into option1
values (381, '网际快车',103,2);
insert into option1 
values (382, '电驴',103,3);
insert into option1 
values (383, '比特精灵',103,4);
insert into option1 
values (384, '超级旋风',103,5);
insert into option1
values (385, '搜狗拼音',104,1);
insert into option1
values (386, '搜狗五笔',104,2);
insert into option1 
values (387, 'qq拼音',104,3);
insert into option1 
values (388, 'qq五笔',104,4);
insert into option1 
values (389, '谷歌拼音',104,5);
insert into option1 
values (390, '紫光拼音',104,6);
insert into option1 
values (391, '智能abc',104,7);
insert into option1
values (392, '微软拼音',104,8);
insert into option1 
values (393, '万能拼音',104,9);
insert into option1 
values (394, '万能五笔',104,10);
insert into option1 
values (395, '极品拼音',104,11);
insert into option1 
values (396, '极品五笔',104,12);
insert into option1 
values (406, '世界之窗浏览器',101,3);
insert into option1 
values (407, '360浏览器',101,4);
insert into option1 
values (408, '傲游浏览器',101,5);
insert into option1 
values (409, '谷歌（chrome）浏览器',101,6);
insert into option1 
values (410, '卡巴斯基',102,1);
insert into option1 
values (411, '360杀毒',102,2);
insert into option1
values (412, 'mcafee',102,3);
insert into option1 
values (413, 'avg',102,4);
insert into option1
values (414, '诺顿杀毒',102,5);
insert into option1 
values (415, '瑞星杀毒',102,6);
insert into option1 
values (416, '金山毒霸',102,7);
insert into option1 
values (417, '江民杀毒',102,8);
insert into option1 
values (418, '微点防御',102,9);
insert into option1 
values (419, '趋势杀毒',102,10);
insert into option1
values (441, '地域',440,1);
insert into option1 
values (442, '天堂',440,2);
commit;
--添加选择结果
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




