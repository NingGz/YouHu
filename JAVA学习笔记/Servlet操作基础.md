# Servlet操作基础

## 概念：运行在服务器端的小程序

​	Servlet就是一个接口，定义了java类被浏览器访问到（tomcat识别）的规则

​	自定义方法重写这个类，实现Servlet接口，复写方法。

​	

#### 快速入门

​	1  创建一个JavaEE项目

​	2 定义一个类，

   3  servlet 映射配置 (在项目中选择servlet会自动生成)	

#### servlet实现原理

![1567153043365](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567153043365.png)

#### 执行过程

1 当服务七接收到客户端浏览器的请求后，会解析请求URL路径，获取访问的Servlet的资源路径

2 查找web.xml文件，是否有对应的<url-pattern>标签体内容

3 如果有，则找到对应的<servlet-class>全类名

4 tomcat会将文字码文件加载进内存，并且创建其对象

5 调用其方法

#### Servlet生命周期（单线程的）

​	1 被创建：执行init方法，只执行一次，说明一个Servlet在内存中只存在一个对象，Servlet是单例的

​		多个用户同时访问时，可能存在线程安全问题

​		解决：尽量不要在Servlet中定义成员变量。即使定义了成员变量，也不要对修改值

 	2 提供服务：执行service方法，执行多次

​		每次访问Servlet时，Service方法都会被调用一次

​	 3 被销毁：执行destory方法，只执行一次 

​		Servlet被销毁时执行。服务器关闭时，Servlet被销毁

​		只有服务器正常关闭时，才会执行destory方法

​		destory方法在Servlet被销毁之前执行，一般用于释放资源

#### Servlet生命周期方法

1 init() 创建servlrt **只执行一次**

2 service() **提供服务可以执行多次**

3 getServletConfig() 获取servlet配置信息

4 destory() **服务器关闭时销毁servlet, 只执行一次**

了解方法 getServletInfo();获取 servlet 信息

#### Servlet_3.0 注解配置（了解 jkd5 以上版本支持）

#### 步骤：

​	1 创建JavaEE项目，选择Servlet

#### IDEA与tomcat相关配置

服务器访问的时tomcat下部署的web项目，tomcat部署的web项目对应着工作空间的web下的所有资源

WEB-INF 目录下的资源是不能被浏览器直接访问

断点调试：  使用 “虫子” debug 运行

#### Servlet 实现类

#### HttpServlet 实现了方法 method 判断以及servlet这个接口中其他的方法

#### 继承了HttpServlet只需要重写dopost() 和doget() 就可以了



## Http请求协议

#### 概念：超文本传输协议

#### 			传输协议 ：定义了客户端和服务七通信时发送数据的格式

#### 			特点：

#### 					    基于TCP/IP的高级协议

#### 						默认端口号：80

#### 					   基本请求/响应模型的：一次请求对应一次响应

#### 					   无状态的：每次请求之间相互独立，不能交互数据

请求消息数据格式：

响应消息数据格式：





## request和response对象的原理

1 request和response对象时由服务器创建的额

2 request对象时获取请求信息，response对象时来设置响应消息



## Request原理（获取请求消息）

#### request对象继承体系

ServletRequest -- 接口

​	向下传递

HttpServletRequest -- 接口

   实现

org.apache.catalina.connector.RequestFacade



Request功能：

1 获取请求数据

a 获取请求行数据

![1567215975386](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567215975386.png)

b 获取请求头数据

```java
String getHeader(String name); //通过请求头名称获取请求的值
Enumeration<String> getHeaderName();//获取所有请求头名称
```

c 获取请求体数据

```java
//获取字符输入流
BufferedReader br = request.getReader();
String line = null;
while((line = br.readLine())!=null){
	System.out.println(line);
}
//获取字节操作流
InputStream sr = request.getInputStream();
int len = 0;
while((len = sr.read())!=-1){
    System.out.println((char)len);
}
```

2 其他功能

1 获取请求参数的通用方法

```java
String getParameter(String name);//根据参数名称获取参数值
String[] getParameterValue(String name);//根据参数名称获取参数值的数组
Enumeration<String> getParameterNames();//获取所有请求的参数名称
Map<String,String[]> getParameterMap();//获取所有参数的map集合
```

2 请求转发

3共享数据

4 获取ServletContext

#### Servlet 中文乱码问题解决

//解决乱码 设置字节流为utf-8

​		response.setContentType("text/html;charset=utf-8");
​		request.setCharacterEncoding("utf-8"); 
​		response.setCharacterEncoding("utf-8");

#### servlet获取数据示例

```Java
package com.Ning.servlet;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("不支持post，自动转为post");
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//解决乱码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//ͨ通过名称获取值
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassWord");
		
		//通过名称获取数组 比如多选框同一个名称对应多个数据
		String[] role = request.getParameterValues("role");
		for(String r:role){
			response.getWriter().append(r);
		}
		response.getWriter().append(userName+userPassword);
		
		//获取所有名称加数据
		//先获取所有名称(注意这个数组没有实现iterate迭代器)
		Enumeration<String> en = request.getParameterNames();
		while(en.hasMoreElements()) {
			String name = en.nextElement();
			response.getWriter().append(name);
			String value = request.getParameter(name);
			response.getWriter().append(value);
		}
		
		//将所有数据获取到map中
		Map<String,String[]> map = request.getParameterMap();
		for(String Name: map.keySet()){
			//获取属性名称
			String[] value = map.get(Name);
			for(String v :value) {
				response.getWriter().append(v);
			}
		}
	}

}

```

# Response 请求响应

![1567226667540](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567226667540.png)

![1567227342898](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567227342898.png)

## response 方法

```java
response.sendRedirect(String )//重定向，输入指定的路径即可 将结果传入指定的链接
```

#### 重定向特点（改变相应的地址，也就是交给其他servlet完成任务）

1 地址栏发生改变（？）

2 重定向可以访问其他站点的资源

3 重定向时两次请求，不能使用request对象来共享数据

#### 转发特点

1 转发地址栏不变

2 转发只能访问当前服务器下的资源

3 转发是一次请求，可以使用request对象来共享数据(request作用域仅仅在本servlet中？)

#### 绝对路径和相对路径

![1567229672083](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1567229672083.png)

#### 绝对路径

1 在客户端使用时需要加虚拟目路，就是当前项目的名称 例如 Demo项目下的 servlet01 /Demo/servlet01

2 在项目内部使用的时候不需要加虚拟目录。例如转发

```java
request.getRequestDispatcher(“/requestDemo2”).forword(request,response);//转发
```

#### Response 输出字符/字节到浏览器（主要用于图片输出）

```Java
//创建字符输入流对象 
PrintWriter pw = response.getWriter();
//将字符写入浏览器
pw.writer("你好");
//创建字节流对象
ServletOnputStream in = response.getOutputStream();
//输出数据到浏览器
in.Writer("你好".getByte("Utf-8"));
```

#### servlet 验证码



## servletContext

1 概念：代表整个web应用，可以和程序的容器来通信

2 功能：

​	1 获取MIME类型：

​			MINE类型;是互联网通信过程中定义的一种文件数据类型

​				格式：大类型/小类型   例如： text/html

```java
//获取文件的Mime类型
String filename = "a.jpg";
String mimeType = context.getMimeType();
```

​	2 域对象：共享数据 

​		(所有用户都能共享，浏览器关闭才会消失，无论创建多少个ServletContext都会指向一个地方)

```java
setAttribute(String name,object value);//设置数据
getAttribute(String name)//获取数据，用名字
removeAttribute(String name);//移除一个域对象数据
getRealPath("/xxx/xxx.xx");//获取文件的真实路劲，多用于创建文件对象
```

​	3 获取文件的真实路径

```java
//通过request对象获取/创建 servletContext 对象
servletContext context = request.getServletContext();
//通过HttpServlet获取
ServletContext context2 = this.getServletContext();
```

#### 文件下载案例

```java

```

```

```

