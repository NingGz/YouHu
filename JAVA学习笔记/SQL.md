## Oracle基础教程 										

#### 																													written by JusticeN

#### oracle简介

​	Oracle Database，又名Oracle RDBMS，或简称Oracle。

​    是甲骨文公司的一款关系数据库管理系统。

​    它是在数据库领域一直处于领先地位的产品。

​	可以说Oracle数据库系统是目前世界上流行的关系数据库管理系统，

​	系统可移植性好、使用方便、功能强，适用于各类大、中、小、微机环境。

​	它是一种高效率、可靠性好的、适应高吞吐量的数据库解决方案。

#### oracle安装教程 （请见本教程附属文件）

#### oracle的几大基本概念

1 **数据库** Oracle数据库是数据的物理存储。Oracle数据库是一个操作系统只有一个库。

​                可以看作Oracle只有一个大数据库

2 **实例**     Oracle实例有一系列后台进程和内存结构组成。一个数据库可以有n个实例

3 **用户**     用户是在实例下建立的。不同的实例可以建相同的名字 

​              （Oracle中 用户是管理表的基本单位，MySQL中管理表的基本单位是数据库

​                 可以理解为 一个用户有几张表 （Oracle） 一个数据库有几张表（MySQL））

4 **表空间**  表空间是Oracle 对物理数据库上相关数据文件（ORA 或者 DBF 文件）的逻辑映射。

​                一个数据库在逻辑上被划分成一到若干个表空间。

​                每个表空间包含了逻辑上县官的一组结构每个数据库至少有一个表空间 

​             （一组或者一堆数据文件被称为表空间)

![1564192840314](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1564192840314.png)



如图所示 ：

1       一个实例中有多个用户 用户是表空间的管理者，注意不同等级的用户 权限是不同的

2      实例中有多个表空间，表控制是逻辑上的集合名称 （一个表空间是若干个.dbf . ora文件集合的名称）

​        一个用户下有多个表，但不能说一个用户下有多少个表空间

 

个人理解 ：表空间和用户应该是平行的，用户可以访问表空间。

虽然表空间中的表不是该用户下的表，oracle中用户的所有数据都是存放在表空间中的。

很多个用户可以共用一个表空间，也可以指定一个用户只用某一个表空间。



## oracle基本操作（dos）

##### **链接数据库**

```dos
sqlplus   //链接Oracle数据库命令
sys/change_on_install@orcl as sysdba  //  用户民称/密码@链接的数据库 as 身份权限  （链接本地）
sys/change_on_instal@//180.45.160.22:1521/datebassname(数据库名称 默认 oracl 远程连接)
```

##### 登陆身份

```sql
sysdba ---超级管理员身份
sysoper---普通管理员身份
normal---普通身份
```

##### 创建表空间

```sql
create tablespace spacename; -----创建表空间名
datefile 'D:\spacename'; ------该表空间存储位置
size 100m ------表空间大小
autoextend on;---------超出自动增长
next 10m;-------自动增长的长度
```

##### 删除表空间

```sql
drop tablespace spacename;------删除表空间，下面一句是删除表空间以及它的联系
drop tablespace spacename including contents and datafiles cascade constraint;---级联删除
```

##### 创建用户

```sql
create user username;
identified by ning97;
defualt tablespace spacename;
```

##### 删除用户

```sql
drop user username;----删除用户，但是如果用户存在联系则无法删除
drop user username cascade;-----删除用户以及用户的级联关系
```

##### 解锁用户

```sql
--解锁系统自带的用户 或者 用户
alter user username account unlock;
--设置用户密码,或者重置密码
alter user username identified by pass;
```

##### 用户授权

```sql
grant dba/resource/connect to username;
---dba 系统最高权限
---resource 开发者权限
---connect 链接权限
grant 某权限 to username;---语法规则将某权限给某个用户
grant create tablespace to username;---赋予创建表空间权限
grant create session tousername;
grant select on tablename to username;---赋予查询某个表的权限
grant update on tablename to username;
grant insert on tablename to username;
grant execute on tablename to username;
grant 某权力 on tablename to username;-----授予用户某个表，某个权力
```

##### 授予用户角色

```sql
grant dba/resource/connect to username;
---dba 超级管理员角色
---resource 开发者角色
---connect 链接者角色
```

##### 收回用户角色/权限

```sql
revoke resource from username;----收回用户开发者角色
revoke select on tablename from username;----收回某个用户在某个表的查找权限
revoke all on tablename from username;----收回某个用户在某张表的所有权限
revoke all from username;----收回所有权限
revoke ? on tablename; ---收回表权限 on table
revoke ? from username;---收回用户权限 from user
```

##### 授权和授予角色的区别

> ```scheme
> 授予角色是将一项权力的集合打包给予某个用户
> ```

> ```scheme
> 授予权限是将某一个具体的权限（表 or 系统）给某个用户
> ```

### 角色 role

##### 角色的概念：

角色是权力的集合

##### 创建角色

```
create role rolename;
```

##### 授予角色权限

```sql
grant create session to rolename;----授予创建会话权限给role
grant update on tablename to rolename;----授予更新表权限给role
```

##### 删除角色

```
drop role rolename；
```



##### 特殊权限sysdba

```
赋予DBA权限只是将DBA角色赋予了该用户，该用户会具备DBA角色拥有的权限，但仍然不是sysdba身份。

sysdba是个特殊的身份，它其实并不是数据库中的[用户账户]，默认是通过操作系统认证的方式连接数据库的。

例如你的数据库关闭后，所有的数据库用户肯定都无法登录了，但是sysdba身份的用户，仍然是可以登录的。
```

## 创建表table

#### 创建表

```
create table tablename(
	tid number(10);
	tname varcher(10);
	tsex varchar(2);
);
```

#### 删除表

```
drop table tablename;
```

#### 对表结构的操作

```sql
alter table tablename add(colunm varchar(8));--添加一个字段
alter table tablename rename column a to b;--重命名一个字段
alter table tablename drop colunm columnname;
---删除字段只要直接在drop column 后加上需要删除的字段名
alter table tablename modify columnname varchar(2);
---修改字段类型，只需要直接在字段名后面加上要变成的类型
```

#### 对表内容操作

```sql
update tablename set columnname=？ where column= ?;--更行一行的某几个字段的值，不可更改oid
delet from where ---删除一张表，一行的值
insert into tablename(？) valuns(？);---插入一行，tablename后没有设置顺序，按照表左到右默认顺序
```



## oracle数据类型

```sql
number()     ---数字类型
date()		 ---日期类型
char()		 ---字符类型	
varchar()	 ---字符串类型
varchar2()   ---可变子长字符串类型
clob()       ---大对象，大文本类型，可存储4G
bolb()		 ---大对象，二进制数据，可存储4G
```



## 单行函数

```sql
select upper（‘xxx’）from emp; --- 将括号里的字符串全大写
select lower(‘xxx’) from emp;  --- 将括号里的字符串全小写
select initcap（‘xxx’）from emp; --- 首字母大写，后面都是小写
select concat (‘hellow’,’world’) from dual; --- 将字符串合在一起 效果和 || 类似
select substr( ) from dual;   --- 截取字符串
select length('ningGz') from dual; --- 返回字符串长度
select inser( 'ningGz','G',m,n) from dual;  ---检索字符串 从m位开始 检索 n次
select trim('a' from 'aaabbbaaa') from dual; --- 全局删除字符a
select ltrim('a' from 'aaabbbaaa') from dual; --- 从左边开始删除a，遇到不是a 就停止
select rtrim('a' from 'aaabbbaaa') from dual; --- 从右边开始删除a，遇到不是a 就停止
select replace('ningandzhang','ning','Gz') from dual;--- 将ning替换成Gz
select ascii ('A') from dual; ---转化为ascii码
```

## 数字函数

```sql
select round(m,n) from dual;--四舍五入函数（n默认为0、n>0保留左边、n=0不保留、n<0右边）
select ceil（m） from dual；--向上取整数
select floor(m) from dual; --向下取整数，直接舍去小数点后面的数
select abs(m) from dual; --取绝对值函数
select mod(m,n) from dual; -- 取余函数
```

## 日期函数

```sql
select to_char(sysdate,'YYYY-MM-DD ') from dual;---转化系统时间为 年-月-日
select to_char(sysdate,'YYYY') from dual;---转化系统时间为年
select to_char(sysdate,'MM') from dual;---转化系统时间为月
select to_char(sysdate,'DD') from dual;---转化系统时间为月
Select to_char(sysdate, ’YYYY-MM-DD HH24:MI:SS’) today from dual;---转化系统时间到具体的秒
select to_date('1999-10-10','YYYY-MM-DD') from dual;---将时间字符串转化为date类型
```

## null函数

```sql
select nvl(comm,0) from dual;---判断如果comm字段为空，那么就将这个字段设置为0，并且返回
select nvl2(e1,e2,e3) from dual;
---判断如果 e1不为null，返回e2;额为null，返回e3；e2和e3类型不同的话，e3会转化为e2类型
select coalesce(comm,sysdate) from dual; -----返回一个非空表达式，返回的类型要和前面一致
```

## in函数

```sql
select colunm from emp where colunm in(a1,a2);--查询字段Colunm,当这个字段结果在a1,a2中输出
select colunm from emp where colunm ont in(a1,a2);--查询字段，当这个字段不在a1,a2中的时候
```



## 多行函数

```sql
count()、sum(sal)、max(sal)、min(sal)、avg(sal) -----在使用的时候必须分组
```



## 条件表达式

```sql
Select colunm
Case colunm （在case之后when后面自动默认为colunm字段的值）
	When ‘colum.value’then ‘ 别名’( 该语法用于给多行字段赋值)
	When ‘colum.value’then ‘别名’
	When ‘colum.value’then ‘别名’
	else ‘别名’
	end
From tablename;

Select sal  (在用于判断范围的时候不需要case 因为无法和在when中使用判断符号 )
	Case 
	When sal>2000 then ‘一级’
	When sal>1000 then  ‘二级’
	else ‘别名’
end
from
-----oracle中除了起别名 都用单引号‘’
```

## 序列sequence

#### 序列的概念

序列相当设置某一字段自动增长，当作为主键的时候可以看作为自增长的唯一 OID

##### 创建序列

```sql
create sequence s_test;
```

##### 添加下一个序列

```sql
select s_test.nextval from dual;
```

##### 查询当前序列

```sql
select s_test.currval from dual;
```

##### 插入序列

```sql
insert into tablename values( seq.nextval(),'name',id);---将序列插入到表中，这里sequence 是
```



#### 分组查询

##### 分组查询概念：

分组group by 分组是使用函数的一个条件比如 avg 你需要给一个指定范围 可以按照部门分组 这样计算出来的值就会 按照不同部门 不同的平均值来计算。

```sql
select colunm1...colunmn from tablename where xxx group by colun1...colunmn;---语法
select ename,avg(sal) from emp group by ename;--分组计算平均值
```

注意：分组函数分组部分和查询部分的字段要一致；

## 多表查询

### 内链接（等值链接）

```sql
select * from emp,dept where emp.deptno =dept.deptno;
--将两张表合在一起（通过等值匹配）
select * from emp inner join dept on emp.deptno =dept.deptno;
```

### 外连接

##### 右外链接

```sql
select * from emp,dept where emp.deptno(+) = dept.deptno;
--加号在那一侧就是显示另外一侧表的所有值
select * from emp right join dept on emp.deptno =dept.deptno;
```

##### 左外链接

```sql
select * from emp,dept where emp.deptno = dept.deptno(+);
select * from emp left join dept on emp.deptno = dept.deptno;
```

##### 全连接

```sql
select * from emp full join dept on emp.deptno = dept.deptno;
--显示两张表的所有字段 即使是 null 也显示 和内连接不一样的是 
--内连接自动舍去匹配不上的（不满足匹配条件或匹配条件为null）
```

##### 自链接

```sql
select * from emp a,emp b where a.mgr = b.empno;
--表中字段之间自身就有链接关系，可以用自链接
```

##### 多表链接

```sql
select a.ename,c.dname,b.ename 
from emp a, emp b,dept c 
where a.empno = b.empno and a.deptno = c.deptno;
--多表链接查询 思路将一张主表通过不同的链接条件链接查询 附属表
--本例子为查询员工老板名字以及所在的部门，使用了自链接和外连接
--在这里要注意链接条件，本例子条件是 后两张表都和主表匹配。那么就会出现员工和领导不在同一个部门
--如果要求在同一个部门 我们可以添加链接条件 b.deptno = c.deptno;
```

##### 多表链接中的关系链接（非等价链接）

```sql
select e1.ename,e2.ename boss,d.dname,s.grade
from emp e1,emp e2,dept d,salgrade s
where e1.empno = e2.empno 
and e1.deptno = d.deptno 
and e1.sal between s.losal and s.hisal;
--这一题查询员工的老板、工资等级、部门名称 内容来自三张表
--在这里使用了自链接、外连接、关系链接 分别将其余三张表链接到 e1表中
--between这样的链接 虽然不是等值 但是可以通过关系建立两张表的联系 也可以达到链接的效果
```

## 子查询

##### 子查询返回一个集合

```sql
select * from emp where sal in(select sal from emp where deptno = 10);
--第一种子查询返回一个或者多个值 返回的值用（）括起来算是一个值的集合
-- ‘=’ 适合在集合返回的是一个值的时候使用 ，in（）适合在子查询返回的是一个集合的时候
```

##### 子查询返回一个表

```sql
select *
from (select deptno,min(sal) mins from emp group by deptno)t,emp.dept
where t.deptno = e.deptno
and t.msal = e.sal;
--当子查询返回一个表的时候 就等于加入了一张新的表 给这张取一个别名 就可以用表连接正常使用了
```

## 分页查询

```sql
rownum 
--从1开始不能跳跃，row不能大于一个正数即（rownum>5）
--（这种情况是没有将rownum设置为一个新的列的情况）
select rownum,emp.*from emp;
--sql 在查询的同时会默认给每一行排序
select rownum,emp.* from emp order by emp.sal;
--sql语句有执行的先后顺序，这一句的rownum顺序会被打乱
select rownum,a.* from (select rownum,emp.* from emp order by emp.sal) a;
--重新查询会对rownum 重新排序
select b.* 
from( select rownum ar,a.* from (select emp.* from emp order by sal) a) b 
where b.ar >2 and b.ar <8;
--分页查询 此处查询的是第三行到第七行作为一页查询，在这里rownum是虚列不能直接作为条件去使用
--我们可以在在子查询中进行一次rownum的排列 并且对其进行重命名，这样rownum就能作为子表中的一列
--在新的表、表b中去使用
select b.* 
from( select rownum ar,a.* from (select emp.* from emp order by sal) a) b 
where b.ar = 7;
--查询第7行
```

## 集合运算

#### 集合运算概念：

通过集合运算符号来求出两个查询结果集合的交、并、差集

```sql
select xxx union select xxx; ---- 求并集，结果排血，去重复，去空
select xxx union all select xxx; ----求并集，结果不排序，不去重复，不去空
select xxx intersert select xxx; ----求交集
select xxx minus select xxx; ----求差集
--------------注意集合的查询返回类型要一致，否则报错
```



## 视图

#### 视图的特性、作用

1 视图可以频闭掉一些字段，因为视图是在原表的基础上选择部分字段去创建的

2 视图和主表之间的关系是同步的，（视图可以修改主表但是一般不会去使用）

视图本身是没有数据的、只要主表发生变化，视图中的数据也会同步更行发生变化

3 视图必须是dba权限创建

#### 视图的操作：

##### 查询语句创建视图

```sql
create table emo as select *from scott.emp;
```

##### 查询语句创建视图（连同将值赋予了这个视图）

```sql
create view v_test as select ename,job from emp；
```

##### 查询视图(查询方法和查询表是一样的)

```
select * from v_test(视图名字);
```

##### 修改视图(和修改表是一样的)

```sql
update v_name set v_colunm='xxx' where colunm ='xxx';
```

##### 删除视图

```sql
drop view v_name;	
```

##### 创建只读/读写视图

```sql
create view as select colunm1,colunm2,... from table_name with read only 
(read-write);
```

## 索引

#### 索引的概念和作用：

1 索引就是在表的列上构建一个二叉树，达到大幅度提高查询效率的目的，但是索引会影响

   增删改的效率。

##### 创建单列索引

```sql
create index idx_ename on emp(ename);
```

注意：单列索引触发规则，条件必须是索引列中的原始值。单行函数、模糊查询都会影响索引触发。

##### 创建复合索引

```
create index idx_enamejob on(ename,job);
```

注意：复合索引第一行为优先检所列，如果触发复合索引必须包含有优先检索列中的原始值。

##### 索引触发条件

```sql
select * from emp where ename='SCOTT' and job='XX';--触发复合
select * from emp where ename='SCOTT' or job='xx';--不触发
select * from emp where ename='SCOTT';--触发单列
```

## PL/SQL编程语言

#### PL/SQL的基本概念

​	PL/SQL 语言是对sql 语言的扩展，使sql语言具有过程化编程的特性 

​	PL/SQL编程语言比一般的过程化编程语言、更加灵活高效。

​	PL/SQL 编程语言主要用来编写存储过程和存储函数等。

#### PL/SQL 声明方法

##### declare后添加的数据以及类型是对其变量的声明

```sql
declare
	i number(2) ;= 10;
	s varchar2(10) := '小明';
	ena emp.ename%type; ---引用型变量
	emprow emp%rowtype; ---记录型变量
begin 
	dbms_output.put_line(i);
	dbms_output.put_line(i);
	select ename into ena from emp where empno = 7788;---给引用型变量赋值
	dbms_output.put_line(ena);
	select * into emprow from emp where empno = 7788;---给记录型变量赋值
	dbms_output.put_line(emprow.ename || '的工作为：' || emprow.job);
	----记录型变量就相当于将这一张表的一行的变量，都加载进函数
	----引用型变量就是把表中的一列中的一个加入到函数中 
	----用法和表中变量用法相同，不过需要用where限定条件取获取相同的值。
end;
```

##### declare中的if条件语句

```sql
declare
	i number(2) := &input;
begin
	if mod(m,n)!= 0 then ------------------条件语句的开始（语法中if，else后无分号）
		dbms_output.put_line('no');
	elsif xxxxx ----注意这里是elsif,不是else if
	else ----------------------------------不满足条件
		dbms_output.put_line('yes');
	end if; -------------------------------条件语句结束
end;
```

##### while循环

```sql
declare
	i number(2) := &input;
begin
	while i<12 loop ----------------------------- 循环条件和循环的开始
		dbms_output.put_line(i);
		i :=i+1;--------------------------------- 在PL/SQL 中没有i++；
	end loop;------------------------------------- 循环结束
end;
```

##### exit循环

```sql
declare
	i number(2) := &input;
begin
	loop exit when i >12;---------------------循环结束条件
	dbms_output.put_line(i);
	i := i+1;
	end loop;---------------------------------循环结束位置
end;
```

##### for循环

```sql
declare
	i number(2) :=&input;--- 在for循环中输入i、没有意义、他只会在for规定的条件中进行循环
begin
	for i in 1..10 loop----------------------- 当i在1到10之间的时候循环
		dbms_output.put_line(i);------输出了 1到10
	end loop;--------------------------------- 循环结束位置
end;
```

#### 游标 cursor

##### 游标的定义和概念： 游标可以存放多个对象，多行记录 (就相当可以获取表的多列信息、或者一张表)

```sql
declare
	cursor c1 is select *from emp;----用游标获取这个表中的所有值
	emprow emp%rowtype;
begin 
	open c1;-----开启游标
		loop------开启循环
			fetch c1 into emprow; -----开启游标向记录型变量赋值
			exit when c1%notfound;------循环退出条件
			dbms_output.put_line(emprow.ename);------在控制台输出每一个员工的名字
		end loop;-------关闭循环
	close c1;-------关闭游标
end;
```

##### 游标练习： 给指定部门员工涨工资（带有参数的游标）

```sql
declare
	cursor c2(eno emp.deptno%type) is select empno from emp where deptno = eno;
	en emp.empno%type;-----引用型变量 相当于一个字段
begin
	open c2(10);----------open xx(); close xx;前后结束都需要；
		loop
			fetch c2 into en;----加载c2中的值到en中
			exit when c2%notfound;------循环结束条件
			update emp set sal=sal+100 where empno=en;-----具体的操作
            commit;----提交事务到数据库中保存
		end loop;
	close c2;
end;
```

#### PL/SQL 中变量总结

```sql
cursor -----游标 用来获取几列的值 或者整张表的值
enrow emp%rowtype-------- 记录型变量，用来获取这个表中一行的值
en emp.empno%type-------- 引用型变量，用来获取某一个字段的值
```

#### 存储过程

##### 存储过程概念：

存储过程就是提前已经编译好的一段pl/sql语言，放置在数据库端。

可以直接调用，这一段pl/sql一般都是固定业务

相当于自定义函数，简化某一特定段的业务。

##### 示例：给指定雇员涨100工资

```sql
create or replace procedure p1(eno emp.empno%type)
-----or replace是可被修改的存储过程
is
begin
	update emp set sal=sal+100 where empno = eno;----部门编号由外界传入
	commit; ----提交事务到数据库
end; ------存储过程结束
```

##### 测试存储过程

```sql
declare

begin
	p1(7369);---给7369号员工加100工资的存储过程
end;
```

#### 存储函数

##### 存储函数和存储过程的区别

存储函数有返回值，而存储过程只是一个预设的操作过程，是没有返回值的 （类似于void）。

##### 存储函数计算一年的年薪

```sql
create or replace function testFun(eno emp.empno%type) return number
---返回的类型是number，传入的参数的类型是 emp.empno
is
	s number(10);
begin
	select sal*12+nvl(comm,0) into s from emp where emp.empno = eno;
	return s;
end;
```

##### 存储函数测试

```sql
declare 
	a number(10);
begin
	a := tetsfun();------传入需要计算年薪的员工的编号
	dbms_output.put_line(a);
	------在控制台打印结果，一般的对数据的存储操作都是在存储过程中完成
end;
```

#### out类型参数

##### out类型参数的概念

out类型相当于给存储过程一个输出参数的出口。

在PL/SQL 中所有的参数都默认具有in/out 类型，默认参数类型为in 就是输入参数

在需要输出参数的存储过程中需要使用out修饰

```sql
create or replace procedure p2( eno emp.empno%type,yearsal out number) 
is----- 输入和输出参数类型不能带有具体的长度,out修饰的数字类型代表输出参数
	s number(10);----没有输出删除存储过程将无法输出，只能通过事务修改表。在表中找到
	c emp.comm%type;
begin
	select sal*12,nvl(comm,0) into s,c from emp where empno = eno;
	yearsal := s + c;
end;
```

##### 测试输出类型

```sql
declare
	yearsal number(10);----------定义接收参数的类型
begin
	p2(7369,yearsal);----------执行存储过程
	dbm_output.put_line(yearsal);----------在控制台使出结果
end;
```

#### 触发器

##### 触发器的概念：

指定一个规则，在做增删改操作的时候，只要满足该规则，自动触发，无需调用。

##### 语句级触发器

不包含for each row的触发器

##### 行级触发器

包含有for each row 的触发器

## Oracle事务

#### 事务的概念

在数据库中事务是工作的逻辑单元，一个事务是由一个或多个完成一组的相关行为的SQL语句组成，通过事务机制确保这一组SQL语句所作的操作要么都成功执行，完成整个工作单元操作，要么一个也不执行。

#### 事务的特性

- 原子性(Atomicity)：一个事务里面所有包含的SQL语句是一个执行整体，不可分割，要么都做，要么都不做。
- 一致性(Consistency)：事务开始时，数据库中的数据是一致的，事务结束时，数据库的数据也应该是一致的。
- 隔离性(Isolation)：是指数据库允许多个并发事务同时对其中的数据进行读写和修改的能力，隔离性可以防止事务的并发执行时，由于他们的操作命令交叉执行而导致的数据不一致状态。
- 持久性 (Durability) : 是指当事务结束后，它对数据库中的影响是永久的，即便系统遇到故障的情况下，数据也不会丢失。

#### 数据异常

##### 脏读

当一个事务修改数据时，另一事务读取了该数据，但是第一个事务由于某种原因取消对数据修改，使数据返回了原状态，这是第二个事务读取的数据与数据库中数据不一致，这就叫脏读。

##### 不可重复读

是指一个事务读取数据库中的数据后，另一个事务则更新了数据，当第一个事务再次读取其中的数据时，就会发现数据已经发生了改变，这就是不可重复读取。不可重复读取所导致的结果就是一个事务前后两次读取的数据不相同。

##### 幻读

如果一个事务基于某个条件读取数据后，另一个事务则更新了同一个表中的数据，这时第一个事务再次读取数据时，根据搜索的条件返回了不同的行，这就是幻读

##### 事务隔离级别

| 隔离级别                    | 脏读 | 不可重复读 | 幻读 |
| --------------------------- | ---- | ---------- | ---- |
| Read uncommitted(读未提交)  | 是   | 是         | 是   |
| Read committed（读已提交）  | 否   | 是         | 是   |
| Repeatable read（可重复读） | 否   | 否         | 是   |
| Serializable（串行读）      | 否   | 否         | 否   |

**设置隔离级别**

设置一个事务的隔离级别：

- SET TRANSACTION ISOLATION LEVEL READ COMMITTED;
- SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
- SET TRANSACTION READ ONLY;
- SET TRANSACTION READ WRITE;

注意：这些语句是互斥的，不能同时设置两个或两个以上的选项。

##### 设置单个会话的隔离级别：

- ALTER SESSION SET TRANSACTION ISOLATION LEVEL READ COMMITTED;
- ALTER SESSION SET TRANSACTION ISOLATION SERIALIZABLE;

在执行使用`COMMIT`语句可以提交事务，当执行了COMMIT语句后，会确认事务的变化，结束事务，删除保存点，释放锁。当使用COMMIT语句结束事务之后，其他会话将可以查看到事务变化后的新数据。

**提交事务**

在执行使用`COMMIT`语句可以提交事务，当执行了COMMIT语句后，会确认事务的变化，结束事务，删除保存点，释放锁。当使用COMMIT语句结束事务之后，其他会话将可以查看到事务变化后的新数据。

##### 回滚事务

保存点（savepoint）：是事务中的一点，用于取消部分事务，当结束事务时，会自动的删除该事务所定义的所有保存点。当执行ROLLBACK时，通过指定保存点可以回退到指定的点。

设置保存点：

```
sql> Savepoint a;
```

删除保存点：

```
sql> Release Savepoint a;
```

回滚部分事务：

```
sql> Rollback To a;
```

回滚全部事务：

```
sql> Rollback;
```

## oracle约束

##### 约束的概念

　约束是数据库用来确保数据满足业务规则的手段，不过在真正的企业开发中，除了主键约束这类具有强需求的约束，像外键约束，检查约束更多时候仅仅出现在数据库设计阶段，真实环境却很少应用，更多是放到程序逻辑中去进行处理。这也比较容易理解，约束会一定程度上较低数据库性能，有些规则直接在程序逻辑中处理就可以了，同时，也有可能在面对业务变更或是系统扩展时，数据库约束会使得处理不够方便。不过在我看来，数据库约束是保证数据准确性的最后一道防线，对于设计合理的系统，处于性能考虑数据库约束自然可有可无；不过若是面对关联关系较为复杂的系统，且对系统而言，数据的准确性完整性要高于性能要求，那么这些约束还是有必要的（否则，就会出现各种相对业务规则来说莫名其妙的脏数据，本人可是深有体会的。。）。总之，对于约束的选择无所谓合不合理，需要根据业务系统对于准确性和性能要求的侧重度来决定。

##### 数据库约束有五种：

- ​     **主键约束（PRIMARY KEY）**
- ​     **唯一性约束（UNIQUE)**
- ​     **非空约束（NOT NULL)**
- ​     **外键约束（FOREIGN KEY)**
- ​     **检查约束（CHECK)**

**主键约束（PRIMARY KEY)**

​     主键是定位表中单个行的方式，可唯一确定表中的某一行，关系型数据库要求所有表都应该有主键，不过Oracle没有遵循此范例要求，Oracle中的表可以没有主键（这种情况不多见）。关于主键有几个需要注意的点：

1. 键列必须必须具有唯一性，且不能为空，其实主键约束 相当于 UNIQUE+NOT NULL
2. 一个表只允许有一个主键
3. 主键所在列必须具有索引（主键的唯一约束通过索引来实现），如果不存在，将会在索引添加的时候自动创建

​     添加主键（约束的添加可在建表时创建，也可如下所示在建表后添加，一般推荐建表后添加，灵活度更高一些，建表时添加某些约束会有限制）

```
SQL> alter table emp add constraint emp_id_pk primary key(id);
```

**唯一性约束（UNIQUE)**

​     唯一性约束可作用在单列或多列上，对于这些列或列组合，唯一性约束保证每一行的唯一性。

​     UNIQUE需要注意：

1. ​     对于UNIQUE约束来讲，索引是必须的。如果不存在，就自动创建一个（UNIQUE的唯一性本质上是通过索引来保证的）
2. ​     UNIQUE允许null值，UNIQUE约束的列可存在多个null。这是因为，Unique唯一性通过btree索引来实现，而btree索引中不包含null。当然，这也造成了在where语句中用null值进行过滤会造成全表扫描。

​     添加唯一约束

```
SQL> alter table emp add constraint emp_code_uq unique(code);
```

**非空约束（NOT NULL)**

非空约束作用的列也叫强制列。顾名思义，强制键列中必须有值，当然建表时候若使用default关键字指定了默认值，则可不输入。

　　添加非空约束，语法较特别

```
SQL> alter table emp modify ename not null;
```

**外键约束（FOREIGN KEY）**

外键约束定义在具有父子关系的子表中，外键约束使得子表中的列对应父表的主键列，用以维护数据库的完整性。不过出于性能和后期的业务系统的扩展的考虑，很多时候，外键约束仅出现在数据库的设计中，实际会放在业务程序中进行处理。外键约束注意以下几点：

1. 　　外键约束的子表中的列和对应父表中的列数据类型必须相同，列名可以不同
2. 　　对应的父表列必须存在主键约束（PRIMARY KEY）或唯一约束（UNIQUE）
3. 　　外键约束列允许NULL值，对应的行就成了孤行了

　　其实很多时候不使用外键，很多人认为会让删除操作比较麻烦，比如要删除父表中的某条数据，但某个子表中又有对该条数据的引用，这时就会导致删除失败。我们有两种方式来优化这种场景：

　　第一种方式简单粗暴，删除的时候，级联删除掉子表中的所有匹配行，在创建外键时，通过 **on delete cascade** 子句指定该外键列可级联删除：

```
SQL> alter table emp add constraint emp_deptno_fk foreign key(deptno) references dept (deptno) on delete cascade;
```

　　第二种方式，删除父表中的对应行，会将对应子表中的所有匹配行的外键约束列置为NULL，通过 **on delete set null** 子句实施：

```
SQL> alter table emp add constraint emp_deptno_fk foreign key(deptno) references dept(deptno) on delete set null;
```

实际上，外键约束列和对应的父表列可以在同一张表中，常见的就是表的业务逻辑含义是一棵树，最简单的例子如下（id为主键id，fid为父id，fid存储对id的引用），这种结构的表根据业务要求可通过Oracle的递归查询来获取这种层级关系

![img](https://images2015.cnblogs.com/blog/1024555/201611/1024555-20161105180113471-412654864.png)

**检查约束（CHECK)**

检查约束可用来实施一些简单的规则，比如列值必须在某个范围内。检查的规则必须是一个结果为true或false 的表达式，比如：

```
SQL> alter table emp add constraint emp_sex_ck check(sex in('男','女'));
```

很多时候由于业务需要，比如我们有大量的历史数据，需要和现有数据合并，当前表存在数据库约束（如非空约束），而这些历史数据又包含违背非空约束的数据行，为了避免导入时由于违反约束而导入失败，我们通过调整约束状态来达到目的。

##### 约束状态

数据库约束有两类状态

　　**启用/禁用（enable/disable）**：是否对新变更的数据启用约束验证

　　**验证/非验证 (validate/novalidate)** ：是否对表中已客观存在的数据进行约束验证

这两类四种状态从语法角度讲可以随意组合，默认是 enable validate

下面我们来看着四类组合会分别出现什么样的效果：

**enable validate** : 默认的约束组合状态，无法添加违反约束的数据行，数据表中也不能存在违反约束的数据行；

**enable novalidate** : 无法添加违反约束的数据行，但对已存在的违反约束的数据行不做验证；

**disable validate** : 可以添加违反约束的数据行，但对已存在的违反约束的数据行会做约束验证（从描述中可以看出来，这本来就是一种相互矛盾的约束组合，只不过是语法上支持这种组合罢了，造成的结果就是会导致DML失败）

**disable novalidate** : 可以添加违法约束的数据行，对已存在的违反约束的数据行也不做验证。

拿上面的例子来说，我们需要上传大量违反非空约束的历史数据（从业务角度讲这些数据不会造成系统功能异常），可以临时将约束状态转为 disable novalidate，以保证这些不合要求的数据导入表中

```
SQL> alter table emp modify constraint emp_ename_nn disable novalidate;
```

在数据导入完成之后，我们再将约束状态转为enable novalidate 以确保之后添加的数据不会再违反约束

```
SQL> alter table emp modify constraint emp_ename_nn enable novalidate;
```