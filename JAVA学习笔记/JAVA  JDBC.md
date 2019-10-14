# JAVA  JDBC

## 1什么是jdbc

jdbc是java链接不同数据库的一套代码规范，

它提供了统一的操作方法方便java程序员在不同数据库之间数据库编程

## 2 jdbc的基本步骤

1导入驱动jar

2注册驱动

3获取数据库链接方法

4定义sql

5获取执行sql语句的对象Statement

6执行sql，接受返回结果

7处理结果

8释放资源

```java
//原生jdbc
public static void main(String[] args){
    //1 导入jar包
    //2 获取驱动
    Class.forName();
    //3 获取数据库连接对象
    Connection conn = DriverManager.getConnection(url,user,password);
    //4 定义sql语句
    String sql = "select * from studentInfo "
    //5 获取执行sql的对象 Statement
    Statement st = conn.createStatement();
    //6 执行sql
    int count = st.executeUpdate(sql);
    //7 处理结果
    System.out.println(count);
    //8 释放资源 关闭操作对象和链接
    st.close();
    conn.close();
}
```

## JDBC各个类详解（以下都是接口，实现在驱动包中）

1 DriverManeger	驱动管理对象

2 Connection	数据库连接对象

3 Statement	执行sql对象	

4 ResultSet	结果对象

5 PreparedStatement	执行sql对象

## DriverManeger	驱动管理对象

功能：1 注册驱动 

static void registerDriver(Driver driver)

在程序中使用Class.forName("com.mysql.jdbc.Driver");

(在jdbc 5版本以后可以不注册驱动)

源码中：通过静态代码块

```java
static{
	try{
		java.sql.DriverManager.registerDiver(new Driver());
	}
	catch(SQLException e){
		throw new RuntimeException("Can not register driver");
	}
}
```

2 获取数据库连接

方法：static Connection getConnection(String url,String user,String password);

参数：

​	url:指定链接的路径

​			语法：jdbc:mysql://ip地址：端口号/数据库名称

## Connection:数据库连接对象

1 功能：

​	获取执行sql对象

```java
Statement createStatement(String sql)

PreparedStatement prepareStatement(String sql)
```

​	管理事务

```java
setAutoCommit(boolean autoCommit)//调用该方法设置参数为false，开启事务
commit();//提交事务
rollback();//回滚事务
```

## Statement:执行sql的对象

1 boolean execute(String sql):可以执行任意sql（了解）

2 int executeUpdate(String sql) ； 执行DML语句，DDL语句（返回值是int ，是执行sql语句影响的行数）

3 ResultSet executeQuery(String sql); 执行（select）语句

## ResultSet:结果对象

#### 封装查询结果集的对象

next();游标向下移动一行

getXxx();获取数据

​	Xxx : 代表参数类型 如getString().getInt();

参数：

​	·1 int：代表列编号。从1开始 例如getString(1) 获取第一个位置上的String类型的数据 

​	2 String 代表列名称。如：getDouble("balance");获取列名balance的数据

​	

## PreparedStatement:执行sql的对象（Statement的子类）

1 PreparedStatement会对sql语句进行预处理，防止出现sql注入问题（即查询条件返回？True）

2 预编译SQL：参数使用？占位符替代

3 步骤：

​	1 注册驱动

​	2 获取Connection对象

​	3 定义SQL语句

​	4 获取SQL语句对象 PreparedStatement ps = conn.parperedStatement(sql);

​	5 给sql语句？赋值 ps.setString(1,"天王盖地虎");

​	6 执行sql ResultSet rs = ps.excuteQuery();

​	7 返回结果

​	8 抛出异常

​	9 释放资源

优点：防止SQL注入，而且效率更高

### DML语句有返回结果，DDL语句没有返回结果

#### 简单的jdbc insert操作

```java
try{
	//1 注册驱动
    Class.forName("com.mysql.jdbc.Driver");
    //2 定义sql
    String sql = "insert into account value(null,'wuwu',3000)";
    //3 获取Connection对象
    conn = DriverManager.getConnection(url,user,password);
    //4 获取执行sql对象Statement 
    stmt = conn.createSatement();
    //5 执行sql
    int count = stmt.executeUpdate(sql);
    //6 处理结果
    System.out.println(count);
    if(count>0){
        System.out.println("添加成功！");
    }
    else{
        System.out.println("添加失败!");
    }
}
catch(Exception e){
    e.printStackTrace();
}
finally{
    //避免空指针异常
    stmt.close();
    if(stmt != null){
        try{
            stmt.close();
        }
    }
}
```

#### 简单的jdbc update DML操作（查询）

```java
try{
    //1 注册驱动
    Class.forName("com.mysql.jdbc.Driver");
    //2 开启数据库连接对象
    Connection conn = new Connection(url,user,pass);
    //3 定义sql语句
    String sql = "select * from user";
    //4 开启sql操作对象 ParperStatement()
    PraperSatement ps = new ParperStatement();
    //5 执行sqls
    int count = ps.executeUpdate(sql);
    //6 输出结果
    System.out.println(count);
    if(count>0){
        System.out.println("修改成功！");
    }
    else{
        System.out.println("修改失败！");
    }
}
catch(Exception e){
    e.printStackTrace();
    System.out.println(e);
}
finally{
    //释放资源
    if(ps!=null){
        try{
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    if(conn!=null){
        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
```

####  简单的JDBC DDL操作

```java
try{
    //1 注册驱动
    Class.forName("com.mysql.jdbc.Driver");
    //2 开始数据库连接
    Connection conn = new Connection(url,name,pass);
    //3 定义sql语句
    String sql = "create tabel student(id int,name varchar(30))";
    //4 开始sql操作对象
    Statement ps = conn.creatStatement();
    //5 执行sql语句( ResultSet rs = ps.excuteQuery(sql);)
   	int count = ps.excuteUpdate();
    //6 输出结果 操作影响的行数
    System.out.println(count)；   
}
//处理异常
catch(Exception e){
    e.printStackTrace();
}
finally{
    //释放资源
    if(ps!=null){
        try{
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    if(conn!=null){
        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
```

#### 简单的JDBC executeQuery() 操作

```java
try{
	//1 创建驱动
    Class.forName();
    //2 创建连接对象
    // Connection conn = JDBCUtils.close();
    Connection conn = new Connection();
    //3 创建sql语句 
    String sql = "Select *from student where username = ? and userpassword = ?";
    //4 创建sql执行对象
    ParperedStatement ps = conn.ParperStatement(sql);
    //5 给？赋值
    ps.setString(1,"张三");
    ps.setInteger(2,19990909);
    //6 执行sql
    ResultSet rs = ps.executeQuery();
    //7 输出结果 re.next() 游标向下移动一位 返回值是boolean
    for(ResultSet r:rs){
        System.out.println(r.getInt(1)+" "+);
    }
}
catch(Excpetion e){
	e.printStackTrace();
}
finally{
    //释放资源 JDBCUtil.close(ps.conn);
    if(ps!=null){
        try{
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    if(conn!=null){
        try{
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    if(rs!=null){
        try{
            rs.close();
        }
        carch(Excption e){
            
        }
    }
}
```

# JDBC 管理事务

事务的特性:在事务中，如果一个线程出现问题，则整个事务都会失败

```java
try{
	//1注册驱动
    Class.forName("com.mysql.jdbc.Driver");
    //2创建链接
    Connection conn = JDBCUtil.getConnection();
    //3 开启事务
    conn.setAutoCommit(false);
    //4创建sql语言
    String sql = "select *from student where username = ?"
    //5创建sql执行对象
    PreparedStatement ps = conn.preparedStatement(sql);
    //6设置sql中？的值
    ps.setString(1,"我心永恒");
    //7执行sql 并且接受 结果
    ResultSet rs = ps.executeQuery();
    //提交事务
    conn.commit();
}
catch(Exception e){
    //操作中出现异常,开启事务回滚
    try{
        if(conn!=null)
        conn.rollback();
    }catch(Exception e){
        //此处是事务回滚操作异常
        e.printStackTrace();
    }
    e.printStackTrace();
}
finally{
    //释放资源
    if(conn!=null){
        conn.clsoe();
    }
    if(ps!=null){
        ps.close();
    }
    if(rs!=null){
        rs.close();
    }
}
```

# 数据库连接池

#### 概念：其实就是一个容器（连接对象集合）存放数据库连接的容器

​			当系统初始化后，容器被创建，池子会申请数个连接对象，当用户需要访问数据库的时候，从连接池中分配一个对象给用户，在用户结束访问后，链接对象不会消失，会返回到连接池中

**优点**：1 节约资源 2 用户访问高效

#### 实现：

##### 		1 标准接口：DataSource

##### 				1 方法：

​						获取链接：getConnection();

​						归还链接： Connection.close();如果连接对象Connection是从连接池中获取的那么

​						在调用close()方法的时候不会将这个连接对象释放，而是将这个连接对象返回给这个连接池

# druid 连接池

#### 操作步骤

​	1 导入jar包 druid.jar

​	2 定义配置文件

​	3 加载配置

​	4 获取数据库连接池对象：通过工厂获取 DruidDataSourceFactory

​	5 获取链接 getConnection