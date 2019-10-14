



# Java基础

### Java 面向对象编程思想

[Java](https://baike.baidu.com/item/Java/85979)是一门[面向对象](https://baike.baidu.com/item/面向对象)编程语言，不仅吸收了[C++](https://baike.baidu.com/item/C%2B%2B)语言的各种优点，还摒弃了C++里难以理解的[多继承](https://baike.baidu.com/item/多继承)、[指针](https://baike.baidu.com/item/指针/2878304)等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程 [1]  。



### java中的基本数据类型

### java中的关键字

下面列出了 Java 关键字。这些保留字不能用于常量、变量、和任何标识符的名称。

| 类别                 | 关键字                         | 说明                 |
| :------------------- | :----------------------------- | :------------------- |
| 访问控制             | private                        | 私有的               |
| protected            | 受保护的                       |                      |
| public               | 公共的                         |                      |
| 类、方法和变量修饰符 | abstract                       | 声明抽象             |
| class                | 类                             |                      |
| extends              | 扩充,继承                      |                      |
| final                | 最终值,不可改变的              |                      |
| implements           | 实现（接口）                   |                      |
| interface            | 接口                           |                      |
| native               | 本地，原生方法（非 Java 实现） |                      |
| new                  | 新,创建                        |                      |
| static               | 静态                           |                      |
| strictfp             | 严格,精准                      |                      |
| synchronized         | 线程,同步                      |                      |
| transient            | 短暂                           |                      |
| volatile             | 易失                           |                      |
| 程序控制语句         | break                          | 跳出循环             |
| case                 | 定义一个值以供 switch 选择     |                      |
| continue             | 继续                           |                      |
| default              | 默认                           |                      |
| do                   | 运行                           |                      |
| else                 | 否则                           |                      |
| for                  | 循环                           |                      |
| if                   | 如果                           |                      |
| instanceof           | 实例                           |                      |
| return               | 返回                           |                      |
| switch               | 根据值选择执行                 |                      |
| while                | 循环                           |                      |
| 错误处理             | assert                         | 断言表达式是否为真   |
| catch                | 捕捉异常                       |                      |
| finally              | 有没有异常都执行               |                      |
| throw                | 抛出一个异常对象               |                      |
| throws               | 声明一个异常可能被抛出         |                      |
| try                  | 捕获异常                       |                      |
| 包相关               | import                         | 引入                 |
| package              | 包                             |                      |
| 基本类型             | boolean                        | 布尔型               |
| byte                 | 字节型                         |                      |
| char                 | 字符型                         |                      |
| double               | 双精度浮点                     |                      |
| float                | 单精度浮点                     |                      |
| int                  | 整型                           |                      |
| long                 | 长整型                         |                      |
| short                | 短整型                         |                      |
| 变量引用             | super                          | 父类,超类            |
| this                 | 本类                           |                      |
| void                 | 无返回值                       |                      |
| 保留关键字           | goto                           | 是关键字，但不能使用 |
| const                | 是关键字，但不能使用           |                      |
| null                 | 空                             |                      |

## Java 标识符

Java 所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。

关于 Java 标识符，有以下几点需要注意：

- 所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
- 首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或数字的任何字符组合
- 关键字不能用作标识符
- 标识符是大小写敏感的
- 合法标识符举例：age、$salary、_value、__1_value
- 非法标识符举例：123abc、-salary

## 基本语法

编写 Java 程序时，应注意以下几点：

- **大小写敏感**：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
- **类名**：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 **MyFirstJavaClass**。
- **方法名**：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
- **源文件名**：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 **.java**。（如果文件名和类名不相同则会导致编译错误）。
- **主方法入口**：所有的 Java 程序由 **public static void main(String []args)** 方法开始执行。

## Java修饰符

像其他语言一样，Java可以使用修饰符来修饰类中方法和属性。主要有两类修饰符：

- 访问控制修饰符 : default, public , protected, private
- 非访问控制修饰符 : final, abstract, static, synchronized

在后面的章节中我们会深入讨论 Java 修饰

## Java 变量

Java 中主要有如下几种类型的变量

- 局部变量
- 类变量（静态变量）
- 成员变量（非静态变量）

## Java 空行

空白行或者有注释的行，Java 编译器都会忽略掉。

------

## 继承

在 Java 中，一个类可以由其他类派生。如果你要创建一个类，而且已经存在一个类具有你所需要的属性或方法，那么你可以将新创建的类继承该类。

利用继承的方法，可以重用已存在类的方法和属性，而不用重写这些代码。被继承的类称为超类（super class），派生类称为子类（subclass）。

------

## 接口

在 Java 中，接口可理解为对象间相互通信的协议。接口在继承中扮演着很重要的角色。

接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类。

## Java 源程序与编译型运行区别

如下图所示：

下一节介绍 Java 编程中的类和对象。之后你将会对 Java 中的类和对象有更清楚的认识。

# Java 基本数据类型

变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。

内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据。

因此，通过定义不同类型的变量，可以在内存中储存整数、小数或者字符。

Java 的两大数据类型:

- 内置数据类型
- 引用数据类型

Java 教程

[Java 教程](https://www.runoob.com/java/java-tutorial.html)[Java 简介](https://www.runoob.com/java/java-intro.html)[Java 基础语法](https://www.runoob.com/java/java-basic-syntax.html)[Java 基本数据类型](https://www.runoob.com/java/java-basic-datatypes.html)[Java 修饰符](https://www.runoob.com/java/java-modifier-types.html)[Java 循环结构](https://www.runoob.com/java/java-loop.html)[Java switch case](https://www.runoob.com/java/java-switch-case.html)[Java Character 类](https://www.runoob.com/java/java-character.html)[Java StringBuffer](https://www.runoob.com/java/java-stringbuffer.html)[Java 日期时间](https://www.runoob.com/java/java-date-time.html)[Java 方法](https://www.runoob.com/java/java-methods.html)[Java Scanner 类](https://www.runoob.com/java/java-scanner-class..html)
[Java 继承](https://www.runoob.com/java/java-inheritance.html)[Java 多态](https://www.runoob.com/java/java-polymorphism.html)[Java 封装](https://www.runoob.com/java/java-encapsulation.html)[Java 包(package)](https://www.runoob.com/java/java-package.html)

## Java 高级教程

[Java 数据结构](https://www.runoob.com/java/java-data-structures.html)[Java 集合框架](https://www.runoob.com/java/java-collections.html)[Java 序列化](https://www.runoob.com/java/java-serialization.html)[Java 发送邮件](https://www.runoob.com/java/java-sending-email.html)[Java Applet 基础](https://www.runoob.com/java/java-applet-basics.html)[Java 实例](https://www.runoob.com/java/java-examples.html)[Java MySQL 连接](https://www.runoob.com/java/java-mysql-connect.html)[Java 测验](https://www.runoob.com/quiz/java-quiz.html)

 [Java 对象和类](https://www.runoob.com/java/java-object-classes.html)

[Java 变量类型](https://www.runoob.com/java/java-variable-types.html) 

# Java 基本数据类型

变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。

内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据。

![img](https://www.runoob.com/wp-content/uploads/2013/12/memorypic1.jpg)

因此，通过定义不同类型的变量，可以在内存中储存整数、小数或者字符。

Java 的两大数据类型:

- 内置数据类型
- 引用数据类型

------

## 内置数据类型

Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。

**byte：**

- byte 数据类型是8位、有符号的，以二进制补码表示的整数；
- 最小值是 **-128（-2^7）**；
- 最大值是 **127（2^7-1）**；
- 默认值是 **0**；
- byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
- 例子：byte a = 100，byte b = -50。

**short：**

- short 数据类型是 16 位、有符号的以二进制补码表示的整数
- 最小值是 **-32768（-2^15）**；
- 最大值是 **32767（2^15 - 1）**；
- Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
- 默认值是 **0**；
- 例子：short s = 1000，short r = -20000。

**int：**

- int 数据类型是32位、有符号的以二进制补码表示的整数；
- 最小值是 **-2,147,483,648（-2^31）**；
- 最大值是 **2,147,483,647（2^31 - 1）**；
- 一般地整型变量默认为 int 类型；
- 默认值是 **0** ；
- 例子：int a = 100000, int b = -200000。

**long：**

- long 数据类型是 64 位、有符号的以二进制补码表示的整数；
- 最小值是 **-9,223,372,036,854,775,808（-2^63）**；
- 最大值是 **9,223,372,036,854,775,807（2^63 -1）**；
- 这种类型主要使用在需要比较大整数的系统上；
- 默认值是 **0L**；
- 例子： long a = 100000L，Long b = -200000L。
  "L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。

**float：**

- float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
- float 在储存大型浮点数组的时候可节省内存空间；
- 默认值是 **0.0f**；
- 浮点数不能用来表示精确的值，如货币；
- 例子：float f1 = 234.5f。

**double：**

- double 数据类型是双精度、64 位、符合IEEE 754标准的浮点数；
- 浮点数的默认类型为double类型；
- double类型同样不能表示精确的值，如货币；
- 默认值是 **0.0d**；
- 例子：double d1 = 123.4。

**boolean：**

- boolean数据类型表示一位的信息；
- 只有两个取值：true 和 false；
- 这种类型只作为一种标志来记录 true/false 情况；
- 默认值是 **false**；
- 例子：boolean one = true。

**char：**

- char类型是一个单一的 16 位 Unicode 字符；
- 最小值是 **\u0000**（即为0）；
- 最大值是 **\uffff**（即为65,535）；
- char 数据类型可以储存任何字符；
- 例子：char letter = 'A';。

### 实例

对于数值类型的基本类型的取值范围，我们无需强制去记忆，因为它们的值都已经以常量的形式定义在对应的包装类中了。请看下面的例子：

```java
public class PrimitiveTypeTest {       

public static void main(String[] args) {           // byte           System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);           System.out.println("包装类：java.lang.Byte");           System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);           System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);           System.out.println();              // short           System.out.println("基本类型：short 二进制位数：" + Short.SIZE);           System.out.println("包装类：java.lang.Short");           
System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);           System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);           System.out.println();              // int           
System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);           System.out.println("包装类：java.lang.Integer");           
System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);           System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);           System.out.println();              // long           
System.out.println("基本类型：long 二进制位数：" + Long.SIZE);           System.out.println("包装类：java.lang.Long");           
System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);           System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);           System.out.println();              // float           
System.out.println("基本类型：float 二进制位数：" + Float.SIZE);           System.out.println("包装类：java.lang.Float");           
System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);           System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);           System.out.println();              // double           
System.out.println("基本类型：double 二进制位数：" + Double.SIZE);           System.out.println("包装类：java.lang.Double");           
System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);           System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);           System.out.println();              // char           
System.out.println("基本类型：char 二进制位数：" + Character.SIZE);           System.out.println("包装类：java.lang.Character");           // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台           
System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);           // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台           
System.out.println("最大值：Character.MAX_VALUE="+ (int) Character.MAX_VALUE);}}
```

编译以上代码输出结果如下所示：

```
基本类型：byte 二进制位数：8
包装类：java.lang.Byte
最小值：Byte.MIN_VALUE=-128
最大值：Byte.MAX_VALUE=127

基本类型：short 二进制位数：16
包装类：java.lang.Short
最小值：Short.MIN_VALUE=-32768
最大值：Short.MAX_VALUE=32767

基本类型：int 二进制位数：32
包装类：java.lang.Integer
最小值：Integer.MIN_VALUE=-2147483648
最大值：Integer.MAX_VALUE=2147483647

基本类型：long 二进制位数：64
包装类：java.lang.Long
最小值：Long.MIN_VALUE=-9223372036854775808
最大值：Long.MAX_VALUE=9223372036854775807

基本类型：float 二进制位数：32
包装类：java.lang.Float
最小值：Float.MIN_VALUE=1.4E-45
最大值：Float.MAX_VALUE=3.4028235E38

基本类型：double 二进制位数：64
包装类：java.lang.Double
最小值：Double.MIN_VALUE=4.9E-324
最大值：Double.MAX_VALUE=1.7976931348623157E308

基本类型：char 二进制位数：16
包装类：java.lang.Character
最小值：Character.MIN_VALUE=0
最大值：Character.MAX_VALUE=65535
```

Float和Double的最小值和最大值都是以科学记数法的形式输出的，结尾的"E+数字"表示E之前的数字要乘以10的多少次方。比如3.14E3就是3.14 × 103 =3140，3.14E-3 就是 3.14 x 10-3 =0.00314。

实际上，JAVA中还存在另外一种基本类型 void，它也有对应的包装类 java.lang.Void，不过我们无法直接对它们进行操作。

### 类型默认值

下表列出了 Java 各个类型的默认值：

| **数据类型**           | **默认值** |
| :--------------------- | :--------- |
| byte                   | 0          |
| short                  | 0          |
| int                    | 0          |
| long                   | 0L         |
| float                  | 0.0f       |
| double                 | 0.0d       |
| char                   | 'u0000'    |
| String (or any object) | null       |
| boolean                | false      |

## 内置数据类型

Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。

**byte：**

- byte 数据类型是8位、有符号的，以二进制补码表示的整数；
- 最小值是 **-128（-2^7）**；
- 最大值是 **127（2^7-1）**；
- 默认值是 **0**；
- byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
- 例子：byte a = 100，byte b = -50。

**short：**

- short 数据类型是 16 位、有符号的以二进制补码表示的整数
- 最小值是 **-32768（-2^15）**；
- 最大值是 **32767（2^15 - 1）**；
- Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
- 默认值是 **0**；
- 例子：short s = 1000，short r = -20000。

**int：**

- int 数据类型是32位、有符号的以二进制补码表示的整数；
- 最小值是 **-2,147,483,648（-2^31）**；
- 最大值是 **2,147,483,647（2^31 - 1）**；
- 一般地整型变量默认为 int 类型；
- 默认值是 **0** ；
- 例子：int a = 100000, int b = -200000。

**long：**

- long 数据类型是 64 位、有符号的以二进制补码表示的整数；
- 最小值是 **-9,223,372,036,854,775,808（-2^63）**；
- 最大值是 **9,223,372,036,854,775,807（2^63 -1）**；
- 这种类型主要使用在需要比较大整数的系统上；
- 默认值是 **0L**；
- 例子： long a = 100000L，Long b = -200000L。
  "L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。

**float：**

- float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
- float 在储存大型浮点数组的时候可节省内存空间；
- 默认值是 **0.0f**；
- 浮点数不能用来表示精确的值，如货币；
- 例子：float f1 = 234.5f。

**double：**

- double 数据类型是双精度、64 位、符合IEEE 754标准的浮点数；
- 浮点数的默认类型为double类型；
- double类型同样不能表示精确的值，如货币；
- 默认值是 **0.0d**；
- 例子：double d1 = 123.4。

**boolean：**

- boolean数据类型表示一位的信息；
- 只有两个取值：true 和 false；
- 这种类型只作为一种标志来记录 true/false 情况；
- 默认值是 **false**；
- 例子：boolean one = true。

**char：**

- char类型是一个单一的 16 位 Unicode 字符；
- 最小值是 **\u0000**（即为0）；
- 最大值是 **\uffff**（即为65,535）；
- char 数据类型可以储存任何字符；
- 例子：char letter = 'A';。

Java语言支持一些特殊的转义字符序列。

| 符号   | 字符含义                 |
| :----- | :----------------------- |
| \n     | 换行 (0x0a)              |
| \r     | 回车 (0x0d)              |
| \f     | 换页符(0x0c)             |
| \b     | 退格 (0x08)              |
| \0     | 空字符 (0x20)            |
| \s     | 字符串                   |
| \t     | 制表符                   |
| \"     | 双引号                   |
| \'     | 单引号                   |
| \\     | 反斜杠                   |
| \ddd   | 八进制字符 (ddd)         |
| \uxxxx | 16进制Unicode字符 (xxxx) |

## 自动类型转换

**整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。**

转换从低级到高级。

```java
低  ------------------------------------>  高

byte,short,char—> int —> long—> float —> double 
```

数据类型转换必须满足如下规则：

- \1. 不能对boolean类型进行类型转换。
- \2. 不能把对象类型转换成不相关类的对象。
- \3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
- \4. 转换过程中可能导致溢出或损失精度，例如：

- 因为 byte 类型是 8 位，最大值为127，所以当 int 强制转换为 byte 类型时，值 128 时候就会导致溢出。

- \5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：

  ```java
  (int)23.7 == 23;        
  (int)-45.89f == -45
  ```

### 自动类型转换

必须满足转换前的数据类型的位数要低于转换后的数据类型，例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，同样float数据类型的位数为32，可以自动转换为64位的double类型。

## 实例

```java
public class ZiDongLeiZhuan{         
public static void main(String[] args){             
	char c1='a';//定义一个char类型             
	int i1 = c1;//char自动类型转换为int             
	System.out.println("char自动类型转换为int后的值等于"+i1);             
	char c2 = 'A';//定义一个char类型             
	int i2 = c2+1;//char 类型和 int 类型计算             
	System.out.println("char类型和int计算后的值等于"+i2);         
	} 
}
```

### 自动类型转换

必须满足转换前的数据类型的位数要低于转换后的数据类型，例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，同样float数据类型的位数为32，可以自动转换为64位的double类型。

ps:(低精度可以自由转换成高精度，就像小杯子里的水可以倒入大杯子，但是大杯子的水不会溢出)

### 强制类型转换

- \1. 条件是转换的数据类型必须是兼容的。

- \2. 格式：(type)value type是要强制类型转换后的数据类型 实例：

  ## 实例

  ```java
  public class QiangZhiZhuanHuan{
      public static void main(String[] args){
          int i1 = 123;
          byte b = (byte)i1;//强制类型转换为byte
          System.out.println("int强制类型转换为byte后的值等于"+b);
      }
  }//强制转换要注意精度，如果精度溢出，会出现意想不到的结果
  ```

  

  运行结果：

  ```
  int强制类型转换为byte后的值等于123
  ```





# Java中基本数据类型占几个字节多少位



1.字节：byte：用来计量存储容量的一种计量单位；位：bit

2.一个字节等于8位  1byte = 8bit

char占用的是2个字节 16位，所以一个char类型的可以存储一个汉字。

整型：

byte:1个字节 8位 -128~127

short ：2个字节 16位 (-2^15~2^15-1)

int ：4个字节 32位 (-2^31~2^31-1)

long：8个字节 64位 (-2^63~2^63-1)

浮点型：

float：4个字节 32 位

double ：8个字节 64位

注：默认的是double类型，如3.14是double类型的，加后缀F（3.14F）则为float类型的。

char类型：

char：2个字节。

Boolean 类型:

boolean: （true or false）（并未指明是多少字节  1字节  1位 4字节）

补充：BigInteger类实现了任意精度的整数运算，BigDecimal实现了任意精度的浮点数运算。

莫要把字节和字符弄混了，虽然二者就不在同一个位面

字节(Byte)是一种计量单位，表示数据量多少，它是计算机信息技术用于计量存储容量的一种计量单位；

字符是指计算机中使用的文字和符号。

## java抽象类





## java多态

#### 多态的概念

​	多态是一个类的多种状态（可以通过具体需要对类进行个性化的重写）

#### 如何使用多态

```java
public class Fu{
    public void Fun_01(){
        System.out.println("这是父类的第一个方法");
    }
    public void Fun_02(){
        System.out.println("这是父类的第二个方法");
    }
}

public class Zi extends{
    public void Fun_02(){
        System.out.println("这是对父类的第二个方法重写");
    }
}
public class test{
    //上转型 父类接受子类对象 子类重写父类方法 上转型默认调用子类重写父类后的方法
    Fu obj = new Zi();
    obj.Fun_01();
    obj.Fun_02();
    //下转型 将父类将转为子类 即可访问子类中没有重写父类的方法
    Zi z = (Zi) obj; 
    //下转型之后容器类z 可以访问子类没有重写父类方法的方法
    z.Fun_01();
}
```

#### 多态中成员变量的特点

```java
//子类可以重写父类的成员变量
public class Fu{
    public int num =10;
}
public class Zi enxtends Fu{
    public int num = 20;
}
public class test{
    Fu obj =new Zi();
    //此时打印的结果是20 上转型优先使用上一等级的值
    System.out.println(obj.num);
}
```

#### 多态中的上转型

```java
public class Zi entends Fu{};
Fu obj = new Zi();
```

#### 多态中的下转型

```java
public class Zi entends Fu{};
Fu obj = new Zi();
```

#### 多态中的instanceof关键字（了解）

```java
(fu instanceof Zi ) //括号内会返回true or fasle
//判断父类引用本来是不是zi
```

## 集合框架

#### collection 集合

###### 什么是collection

1 定义所有单列集合中共性的方法

a 所有单列集合都可以使用共性的方法，所有单列集合最顶层的接口 

b 所有单列集合都可以使用最顶层接口的方法

3 没有带索引的方法

4 继承：子类共性抽取，形成父类（接口）

5 collection 在java.util.*;中

```java
public boolean add(E e);//把给定对象添加到集合中 注意括号中传入的参数是单个的
public void clear();//清空集合中所有的元素
public boolean remove(E e);//把给定对象在结合中删除
public int size();//返回集合中元素个数
public Object[] toArray();//把集合中的元素。存储到数组中。
public void contains(Object o);//判断集合中是否有o这个值或者对象
public boolean isEmpty();//判断这个集合是否为空
```

```java
//使用collection集合
public static void main(String[] args){
    //1 创建一个集合数组
    Collection<String> coll = new ArrayList<>();
    //2 使用collection共性的方法 添加操作
    coll.add("李四"，19);
    coll.add("小王",17);
    System.out,println(coll);
    
    //例子
    //判断这个集合里是否有“李四”
    boolean b = coll.contains("李四");
    //判断这个集合是否为空
    boolean b = coll.isEmpty();
    //获取这个集合中元素的个数
    int Size = coll.size();
    //清除集合中的值
    coll.clear();
}
```

#### iterator接口

遍历Collection集合，使用集合迭代器完成该操作

public Iterator iterator(); //获取集合对应的迭代器，用来遍历集合中的元素。

iterator接口常用的方法:

public E next(); 返回迭代的下一个元素

public boolean hasNext();如果仍有元素可以迭代，则返回true

public boolean remove ();移除迭代器返回的最后一个元素

#### 概述：

迭代器是一个接口，无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式毕节特殊

Collection接口中有一个方法，叫iterator(),这个方法返回值解释迭代器对象的实现类。

​	Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器

```java
public class Iterator{
    //创建collection对象,注意collection是一个抽象类，无法创建对象。要使用多态
    Collection<String> coll = new ArrayList<>();
    //多态接口实现方法
	Iterator<String> it = coll.iterator();
    while(it.hasNext())
        String i = it.next();
    	System.out.println(i);
    }
}
```

#### 增强for(for循环格式简化迭代器)

#### 概述：

增强for，可以遍历所有的单列集合

格式

​		for（集合/数组类型 变量名：集合名称/数组名称）{

​					sout(变量名称)；

​		}

```java
public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
    for(String s:list){
        System.out.println(s);
    }
}
```

## 泛型

概述：泛型是数组或者集合在不知道具体参数类型的时候用户自定义的一种数据类型的简称

```java
//例如
public class ArrayList<E>{
    public boolean add(E e);
    public E get(int Index){}
}
// 在这里 E 指代不具体的类型
E 可以是String,或者（new Peoples(){
    private int pnum;
    private String pname;
    public People(){}
    public People(int pnum,String pname){
       this.pnum = pnum;
       this.pname = pname;
    }
}）
```

#### 泛型的好处

好处：

1避免了类型转换的麻烦，存储什么类型就是什么类型，**可以使用所返回类型的特有方法**。

2把运行期的异常（代码运行后的异常),提升到编译期的异常。

3不使用泛型，则默认返回和读取的是object类型，不能使用子类特有的方法。需要向下转型，但会抛出异常。

弊端：

泛型是什么类型，只能存储什么类型

#### 定义和使用含有泛型的类

```java
//E表示不确定的类型，带有E的成员变量都是不去确定类型的
public class GenericClass<E>{
    private E name;
    public E getName(){
        return name;
    }
    public void setName(E name){
        this.name = name;
    }
}
```

#### 定义含有泛型的方法

```Java
//E表示不确定的类型,在这个方法的行参中传递什么类型的数字，这个方法就是什么类型的方法
public class GenericMethod{
    public <E> method(E e){
        return e;
    }
}
public static void main(Stringp[] args){
    GenericMethod g = new GenericMethod();
    g.method(122);
    g.method("adc");
}
```

#### 定义使用含有泛型的接口和方法

```java
public Interface GenericInter<I>{
    public void method(I i);
    public <E> getE();
}

public class GenericInterfaceImpl<I> implements GenericInter<I>{
	public void method(I i){
		System.out.println(i);
	}
    public <E> getE(){
        return num;
    }
}
```

#### 泛型通配符

```java
// ?表示型形参中的暑促存储的数据不确定 所以这个数组中可以传入任意类型数据
public statc void printArr(ArrayList<?> list){
    for(Object arr :list){
        //不确定类型的数组返回的值是Object
        Object o = arr;
        System.out.println(o);
    }
}
public static void printArr(AttayList<?> list){
    Iterator<?> i = list.iterator();
    while(i.hasNext()){
        Object o = i.next();
        System.out.println(o);
    }
}
```

#### 通配符高级使用（受限泛型）

#### 泛型的上限：

格式：类型名称<? extends 类> 对象名称

意义：只能接受该类型及其子类

#### 泛型的上限：

格式：类型名称<? super 类>对象名称

意义：只能接受该类型及其父类型

例如：Object类，String类，Number类，Integer类，其中Number是Intger的父类

#### 斗地主案例

![1566631272018](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566631272018.png)

#### 数据结构

# 栈：

![1566781086922](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566781086922.png)

# 队列

![1566781163544](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566781163544.png)



# 数组结构

![1566781578220](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566781578220.png)

# 链表结构

![1566782109419](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566782109419.png)

# 红黑树结构

![1566782383180](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566782383180.png)

#### List接口

什么是list接口

1 有序的集合（存储和去除元素顺序相同）

2 允许存储重复的元素

3 有索引可以使用普通for循环

```Java
//list中的特有方法
public void add(int index,E element);//将指定的元素，添加到集合中的指定位置上
public E get(int index);//返回集合中指定位置的元素
public E remove(int index);//移除列表中指定位置的元素，返回的是被移除的元素
public E set(int index,E element);//用指定元素替换集合中指定位置的元素，返回值的更新的元素
indexOf(Object o) //返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。 
lastIndexOf(Object o) //返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。 
```

List集合特有的方法和索引有关

```java
public class ListDemo{
    public static void main(String[] args){
        // 创建单列数组list
        List<String> list = new ArrayList<String>();
        //尾部添加指定元素
        list.add("添加一个指定类型的数字");
        //在指定位置添加元素 对父类方法进行了重载
        list.add(1，"在下表为1的位置添加元素");
        //获取指定下标位置的元素 注意这里和数组不一样
        list.get(2);
        // 移除指定位置的元素
        list.remove(6);
        //修改指定位置 元素
        list.set(2,"修改2号位置的值");
        //删除指定位置元素
        list.remove(0);
    }
}
```

```java
//list方法测试
import java.util.*;
public class ListDemo{
	public static void main(String[] args){
		// 创建list list存储int 要使用他的封装类
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		System.out.println("返回2下标的值"+list.get(2));
		
		//修改指定位置元素
		//list.set(12,2000);
		//删除指定位置元素 删除一个元素之后 所有剩下的元素下表会自定向前前进一位
		list.remove(0);
		
		//查看数组
		for(int L :list){
			System.out.println(L);
		 
		}
		System.out.println(list.get(0));
		System.out.println("====================================");
		//在指定位置添加一个数字(并不是随意指定位置,正确的解读应该是在队列中插入一个数字)
		list.add(1,1999);
		//查看数组
		for(int L :list){
			System.out.println(L);
		}
		System.out.println("====================================");
		//修改指定位置数字
		list.set(1,2000);
		//查看数组
		for(int L :list){
			System.out.println(L);
		}
	}
}
```



#### Vector集合(了解)

什么是vector

#### (list接口，单线程同步的不常用，自动增长长度和ArrayList一样(底层为数组)）

```
//所有方法都可被ArrayList取代
```

#### ArrayList集合（底层实现是数组，查询快，增删慢（是一个队列list方法））

什么是ArrayList集合

#### 1 此时事先不是同步的（多线程）

```

```

#### LinkedList集合（底层实现是链表，查询慢，增删快（是一个链表list方法））

什么是linkedlist集合：

1.底层是一个链表结构：查询慢，增删快

2.里面包含了大量操作首位元素的方法

注意:使用LinkedList集合特有的方法，不能使用多态

```java
public void addFirst(E e);//将指定元素插入此列表开头。
public void addLast(E e);//将指定元素添加到此处列表的结尾。
public void push(E e);//将元素推入此列表的堆栈。
public E getFirst();//返回此列表的第一个元素
public E getLast();//返回此列表的最后一个元素
public E removeFirst();//移除并且返回此列表的第一个元素
public E removeLast();//移除并且返回此列表的最后一个元素
public E pop();//此列表所有的堆栈弹出一个元素
public boolean isEmpty();//如果列表不包含元素，则返回true
```

```java
//测试上述方法
import java.util.*;
public class LinklistDemo{
	//测试Linklist
	public static void main(String[] args){
		//创建Linkedlist
		LinkedList<String> link = new LinkedList<>();
		//给LinkedList添加数据
		for(Integer i=0; i<10; i++){
			//转换成String使用toString()方法
			String s = i.toString();
			link.add(s);
		}
		//在连开头添加数据
		link.addFirst("将数据插入到开头");
		//在链结尾添加数据
		link.addLast("将数据插入到结尾");
		//向堆内添加数据(每次添加的数据都会默认添加咋栈顶部)
		link.push("这是添加的数据位置");
		//展示
		show(link);
		
		//列表第一个元素
		System.out.println(link.getFirst());
		
		//列表最后一个元素
		System.out.println(link.getLast());
		
		//从栈里弹出一个元素(每次都从栈顶取出一个数据)
		System.out.println(link.pop());
		System.out.println("=================================");
		//从栈顶移除一个元素并且返回这个被移除的元素
		link.removeFirst();
		//从栈底移除一个元素并且返回这个被移除的元素
		link.removeLast();
		show(link);
		//判读该集合中是否含数据(列表有数据不为空，则输出false)
		System.out.println(link.isEmpty());
	}
	//遍历 （如果链按照逻辑出栈 每次从栈顶出栈则会与入栈书顺序相反）
	public static void show(LinkedList<String> L){
		for(String showL:L){
			System.out.println(showL+"  ");
		}
	}
}
```



#### set接口（父类也是collcetion）

什么是set接口

1 不允许存储重复元素

2 没有索引（不能使用普通的for遍历）

3 存储和取出的顺序不一致

#### TreeSet集合（无序集合）

什么是TreeSet集合

```

```

#### HashSet集合（无序集合）

什么是HashSet集合

1 不允许重复的元素

2 没有索引，没有带索引的方法，也不能使用普通的for循环遍历

3 是一个无序集合，存储元素和去除元素的顺序可能不一致

4 底层是一个哈希表结构

```java
//set集合创建，遍历示例
public static void main(String[] args){
    Set<String> s = new HashSet<>();
    for(Integer i=0; i<10; i++){
        s.add(s);
    }
    //迭代器姐空的实现
    Iterator<Integer> it = set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    System.out.println("==========================================");
    //for遍历
    for(String S:s){
        System.out.println(S);
    }
}
```

#### LinkedHashSet集合

什么是LinkedHashSet集合

1 LinkedHashSet() 和 HashSet()方法基本上一样 唯一不同的是 LinkedHashSet()哈希值存储在链表中

2 由于LinkHashSet() 哈希值存储在链表中，所以他是有序的输出

```java
import java.util.*;
public class SetTest{
	//输出HashSet() 和 LinkedHashSet() 查看输出顺序
		public static void main(String[] args){
			HashSet<String> h = new HashSet<>();
			h.add("第1个");
			h.add("第2个");
			h.add("第3个");
			System.out.println(h);
			System.out.println("==================================");
			LinkedHashSet<String> L = new LinkedHashSet<>(); 
			L.add("第一个");
			L.add("第二个");
			L.add("第三个");
			//这个输出直接输出所有
			System.out.println(L);
		}
}
```

## 哈希数据结构

#### 哈希值

哈希值是一个十进制的整数，默认由系统随即给出

他的系统默认输出是16进制（如果转换成int输出）

（对象地址值是一个逻辑地址，是模拟出来的地址不是数据存储的物理地址(哈希值物理地址不一样)））

 哈希值的操作方法

```java
//返沪系统给出的哈希值 native 表示操作系统自带的方法
public native int hashCode();
```

#### 哈希数的存储结构（存储元素超过八个转换成 红黑树）

#### 哈希查找的特点就是速度快

哈希值所对应存储的元素是挂在链表所存储的哈希值下面的

![1566803704825](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566803704825.png)

#### set不存储两个相同元素的原理

```java
set.add(s1);
set.add(s2);
add()方法在存储数前会调用hsahCode()和equals()来判度 如果两个方法都返回true，即两个数据完全相同。
这是add不会将数据存储进去；
```



![1566804281334](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566804281334.png)



#### hashSet存储自定义类型的元素(必须重写equals和hashCode()方法) 

#### 否则将会存储相同元素

![1566805029312](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566805029312.png)

#### 自定义对象（重写hashCode() equals()）

![1566805147608](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566805147608.png)

### 可变字长参数（了解但没有深入学习）

## Collections工具类

#### 常用功能

```java
public static <T> boolean addAll(Collection<T> c....elements);//向集合中添加任意类型人一个数据
public static void shuffle(List<?> list);//打乱有序集合的集合顺序
public static <T> void sort(List<T> list);//将集合按照默认规则排序
public static <T> void sort(List<T> list,comparator<? super T>);//按照指定规则排序
```

# Map集合

#### 概述：

​	1 Map是一个双列集合Map<k,v>

​	2 Map的key是唯一的不能重复，key和value 1 1对应

```java
//常用方法 这里的 V 指代的是value的类型
public v put(K key,V value);//把指定的key和指定的值添加到Map集合中
public v remove(Object key);//删除指定key对应的元素
public v get(Object key);//根据指定的key，在Map集合中获取对应的值
boolean containsKey(Object key);//判断集合中是否包含指定的键
public set<k> keySet();//获取Map集合中所有的键，存储到Set中
public Set<Map.Entry<k,v> entrySet()>//获取Map集合中所有的键值对象的额集合(Set集合)
```

#### Map集合的遍历

```java
import java.util.*;
public class MapTest{
	public static void main(String[] args){
		//1 创建对象
		Map<String,Integer> m = new HashMap<>();
		//Map<>() = new LinkedHashMap<>();
		m.put("小仙女",999);
		m.put("赛金花",666);
		m.put("牛牛",7676);
		//创建set集合接收
		Set<String> s = new HashSet<>();
		s = m.keySet();
		//实现迭代器接口
		Iterator<String> i = s.iterator();
		//该循环输出结果没有顺序
		while(i.hasNext()){
			//获取键值
			String k = i.next();
			//使用键值去找到value
			Integer v = m.get(k);
			System.out.println(k+" "+v);
		}
		System.out.println("=======================================");
		Set<String> s1 = new LinkedHashSet<>();
		s1 = m.keySet();
		//实现迭代器接口
		Iterator<String> i1 = s1.iterator();
		//该循环输出结果没有顺序
		while(i1.hasNext()){
			//获取键值
			String k = i1.next();
			//使用键值去找到value
			Integer v = m.get(k);
			System.out.println(k+" "+v);
		}
		System.out.println("=======================================");
		//for循环优化输出
		for(String s3:m.keySet()){
			System.out.println(s3+" "+m.get(s3));		
		}		
	}

}
```

#### Map.Entry 对象遍历

![1566810899891](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566810899891.png)

```java
// set<Map.Entry<k,v>> 遍历Map
public static void main(String[] args){
    Map<String,string> m = new HashMap<>();
    m.put("aaa","bbbb");
    m.put("ccc","wewe");
    m.put("ppp","sdssds");
    Set<Map.Entry<String,String>> s = m.entrySet();
    for(Map.Entry<String,String> S:s){
        System.out.println(S.getKey()+" "+S.getValue());
    }
}
```

#### 自定义数据类型Map

```java
import java.util.*;
public class SelfHashMap{
	//自定义类型的HasMap
	public static void main(String[] args){
		HashMap<String,Gamer> h = new HashMap<>();
		h.put("头号玩家",new Gamer("小明","第一等级"));
		h.put("大玩家",new Gamer("小王","第二等级"));
		h.put("宗师",new Gamer("小明","第三等级"));
		//set接受map的key
		Set<Map.Entry<String,Gamer>> H = h.entrySet();
		//entrySet + 增强for 遍历自定义map
		for(Map.Entry<String,Gamer> getH:H){
			String key = getH.getKey();
			Gamer g = getH.getValue();
			System.out.println("key:"+key+"value:"+g.getName()+" "+g.getDegreed());
		}
	}
	
}
```

#### 例题判断一个字符串中字母数量

```java
import java.util.*;
public class CharNum{
	//判断一个字符串中的字母数量
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String c = sc.nextLine();
		//创建map
		HashMap<Character,Integer> h = new HashMap<>();
		//将数据存储到map中
		for(char C :c.toCharArray()){
			//判断集合中是否存在C
			//如果存在更新这一行数据
			if(h.containsKey(C)){
				Integer value = h.get(C);
				value++;
				h.put(C,value);
			}
			//如果不存在则添加这个字符，而且将值变为1
			else{
				h.put(C,1);
			}
		}
		//注意entry中获取key 是getKey(); 普通Map中是遍历keySet();
		for(char H:h.keySet()){
			System.out.println(H+" "+h.get(H));
		}
		
	}
}
```



#### HashMap(底层为哈希表，不同步多线程，元素无序)

```java
//HashMap是Map的子类，方法基本与父类相同
```



#### LinkedHashMap(底层为链表+哈希表，不同步多线程，元素有序)

#### LinkedHashMap() 是HashMap()的子类

#### 特点：存储有序

```java

```



## File类

#### 文件类的概述

java.io.file 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建，查找，删除等操作

#### 构造方法

public File (String pathname);//通过给定路径名称字符串转换为抽象路径名称来创建File实例

public File (String parent,String child);//从父路径名称和子路径名称字符串创建新的File实例

public File (File parent,String child);//从父类路劲名和子类路径名字符串创建新的File实例

```

```

#### file类的成员变量(在文件路劲中用相应的成员变量带符号)

```java
//路径分割符 
String pathSeparator = File.pathSeparator;
//文件名称分割符号
String separator = File.separator(windos '\' linux '/')
//文件动态路径
"c "+File.pathSeparator+""+File.separator+"aaa" 
"c:\aaa"                                  
//上述两行代码在win10中效果相同，不过第一行的代码会根据系统的不同自动更换相应的符号
```

#### file中的绝对路径和相对路径

##### 绝对路径：是一个完整的路径，以盘符 C: D:开始 （例如 C:\\a.text）

##### 相对路径：是一个简化路径，例如 C:\document\a.text 可以简化为 a.text

注意：

​			1.路径是不区分大小写的

​			2.路劲中的文件名称分隔符windows使用的是反斜杠，反斜杠是转义字符

​				两个反斜杠代表一个普通反斜杠

#### file类构造方法创建对象

第一种构造 File(String pathname);

``` java
File f1 = new File(pathname "c:\\user\\worker\\a.txt");//绝对路径创建对象
File f2 = new File(pathname "c:\\user\\worker");//文件夹结尾创建对象
File f3 = new File(pathname "a.text");//相对路径创建对象
//如果文件路劲不存在会创建这个路径 如果路劲是相对路劲这个路劲是相对与路劲的根目录下的文件
```

第二种构造方法File(String parent,String child) (将路径拆分成父路径，子路径)

```java
File f1 = new File(parent "c:\\",child "a.text");//将路劲拆分为两部分更加灵活
```

第三种构造方法 File(File parent,String child)(路径拆分，父为文件类型)

```java
File parent = new File(pathname "c:\\");
File f = new File(parent,child"hellow.java");
```

### file类的常用方法

#### 获取功能的方法

public String getAbsolutePath();//返回File的绝对路径

public String getPath();//将此File转换为路径名称字符串

public String getName();//返回由此File表示的文件或者目录长度

public long length(); //返回此File表示的文件长度

#### 判断功能的方法

public boolean exists(); //用于判断此file调式的文件路径是否存在

public boolean isDirectory();//此File表示的是否为目录

public boolean isFile();//此File表示的是否为文件

#### 创建删除功能的方法

public boolean createNewFile();//当且仅当文件尚不存在时，创建一个新的空文件夹。

public boolean delete();//删除由此File表示的文件或者目录

public boolean mkdir();//创建由此File表示的目录

public boolean mkdirs();//创建由此File表示的目录，包括任何必须但不存在的父目录。

```java
public boolean mkdirs();//创建单级和多级文件夹 创建文件夹的名称和路径在构造方法中给出
//实例(mkdirs 返回值 false表示文件夹存在 true 表示文件夹不存在并且创建了)
public static void main(String[] arg){
    File f = new File("C:\\newFile\\a.text");
    boolean b = f.mkdirs();
    System.out.println("新创建的地址的路劲"+b);
}

//删除文件||文件夹实例
public boolean delete();
public static void main(String[] arg){
    File f = new File("C:\\newFile\\a.text");
    boolean b = f.delete();
    System,out,println(b);
}

```

#### File文件遍历

File类遍历（文件夹）目录功能

public String[] list();//返回一个String数组，表示该file目录中的所有子文件

public File[] listFiles();//返回一个File数组，表示File目录中的所有子文件或目录

注意：

​		list方法和listFiles方法遍历的是构造方法中给出的目录

​		如果构造方法中给出的目录的路径不存在，会抛出控指针异常

```java
//遍历document文件中所有的文件名称（public String[] list()）
private static void show(){
    File file = new file("c:\\Users\\docunment");
    String[] arr = file.list();
    for(String Filename : arr){
        System.out.println(fileName);
    }
}
```

```java
//遍历document文件中所有文件名称 File 方法
private static void show(){
	File file = new File("c:\\user\\document");
    File[] file = file.listFiles();
    for(File f:files){
        System.out.println(f);
    }
}
```

//复制一个问价夹中所有文件夹和文件名称（空文件）到一个新的地址中

```java
import java.util.*;
import java.io.*;
public class CopyAtoB{
	public static void main(String[] args) throws IOException{
		//输入路径
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入源文件地址");
		String f1 = sc.nextLine();
		System.out.println("请输入目标文件地址");
		String f2 = sc.nextLine();
		//创建源文件对象
		File F1 = new File(f1);
		Copy(F1,f2);
	}
	public static void Copy(File F1,String f2) throws IOException{
		//定义字符串接收文件夹/文件名称
		String F2 ="";
		String F2_son="";
		//打印源文件名称集合
		File[] list = F1.listFiles();
		for(File fileName:list){
			if(fileName.isDirectory()){
				//获取新文价夹的名称
				F2 = f2+"\\\\"+fileName.getName();
				System.out.println(F2);
				//创建新的子文件夹
				File n = new File(F2);
				n.mkdirs();
				//递归
				Copy(fileName,F2);
			}
			else
			{
				//在该问价夹中找到了文件，则拼接新文件夹中文件路径
				F2_son = f2+"\\\\"+fileName.getName();
				//创建文件夹
				File m = new File(F2_son);
				m.createNewFile();
			}
		}
	}
}
```



### Io流

##### 什么是io流

input 输入(读取) 

output 输出(写入) 

流：（字符，字节）1字符 = 2个字节  1字节 = 8二进制位

![1566279875672](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566279875672.png)

输入输出流如图所示

## 字节流

#### 一切皆为字节流：在计算机中所有文件都是二进制字节流

字节流的方法在java.io.* 包下

## 字节流输出流【OutputStream】

java.io.OutputStream 抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性方法（这个类的子类都可以使用超类的方法）

public void close(); 关闭此输出流并释放与此流县官的任何系统资源

public void flush(); 刷新此输出流并强制任何缓冲的输出字节被写出

public void write(byte[] b); 将b.length字节从指定的字节数组写入此输出流

public void write(int b);

注意：close方法，当完成流的操作时，必须调用此方法，释放系统资源

#### FileOutputStream类

FileOutputStream extends OutputStream 作用把内存中的数据写入到硬盘的文件中

构造方法：(注意传入的是文件，而不是文件夹)

FileOutputStream(String name);	创建一个向具有指定名称的**文件**中写入数据输出文件流

FileOutputStream(File file);  创建一个向指定File 对象表示的**文件**中写入数据的文件输出流

参数：

​			String name；目的地是一个文件的路径

​			File file；目的地是一个文件

构造方法的作用：

​			1.创建一个FileOutputStream对象

​			2.会根据构造方法中传递文件/文件路径，创建一个空的文件

​			3.会把FileOutputStream对象指向创建好的文件

写入数据原理（内存-->硬盘）:

 java程序-->JVM(java虚拟机)-->os(操作系统)-->os调用写程序的方法-->把数据写到文件中

#### 字节输出流的使用步骤（重点）

1 创建一个FileOutputStream对象，构造方法中传递写入数据的目的地

2 调用FileOutputStream 对象中的方法write,把数据写入到文件中

3 释放资源（流使用会占用一定的内存),使用完毕把内存清空,提高陈旭效率

#### 输入单个字节

```java
//将数据写入文件中
public class DemoOutputStream{
    public static void main(String[] arg){
        //1 创建一个FileOutputStream对象，构造方法中写入数据的目的地
        //File f = new File("c:\\user\\document");
        FileOutputStream fos = new FileOutputStream("c:\\user\\document\\a.txt");
        //2 调用FileOutputStream对象中的方法write(int b);把数据写入到文件中
        f.write(99);
        //3 释放资源（流的使用会占一定的内存，使用完毕把内存清空）
       	f.close();
    }
}
```

#### 字节输出流写入多个字节（会覆盖源文件）

一次写多个字节的方法：

public void write(byte[] b); 将b.length字节从指定的字节数组写入此输出流。

public void write(byte[] b,int off,int len);从指定的字节数组中写入len字节，从偏移量off开始输出此输出流

```java
//不指定文职长度的多字节写入
public class DemoOutputStream{
    public static void main(String[] args){
        //1 创建File对象
        File f = new File("c:\\document\\a.txt");
        //2 调用FileOutputStream
        FileOutputStream d = new FileOutputStream(f);
        //3 创建数组(1 第一个数组为正数查询Ascii输入的数据也是数字对应Ascii表中相应的字母)
        //输入第一个数字为负数，byte[] 数组进行GBK编码
        byte[] bytes = {60,61,67,99,100};
        d.write(bytes);
        d.close();
    }
}
```

```java
//指定长度和位置的多字节写入 len控制写入几个字节（写入一部分）off数组的写入起点
public class DemoOutputStream{
	public static void main(String[] args){
        //字节数组存入的都是Ascii码
        //如果存入字符串 则需要进行转换 byte[] byte = "你好".getBytes();
        //以上注释中的代码的意思是将”你好“转换成字节存入字节数组中
        byte[] bytes = {99,29,88,12};
        FileOutputStream f = new FileOutputStream("C:\\document\\a.txt"); 
        f.write(bytes,1,2);//写入数组中的数据从第一个开始，写入两个字节
        byte[] bytes = "你好".getBytes();//utf-8一个中文三个字节,gbk一个中文两个字节
        f.write(bytes,1,2);
        f.close();
    }    
}
```

#### 记事本存储数据原理

![1566351375388](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566351375388.png)



#### 字节输出流续写和换行

续写的两个方法

FileOutputStream(String name,boolean append);创建一个向具有指定 name 的文件中写入数据的输出文件流

FileOutputStream(File file,boolean append);创建一个向指定File对象的文件中写入数据文件输出流。

参数：

​		String name,File file (写入文件目的地) 

​		boolean append（追加写开关 true or false）

​		true 开启追加写，在源文件后继续写

​		false 关闭追加写 新写入的文件会覆盖源文件

```java
//续写
FileOutputStream f = new FileOutputStream("C:\\Users\\32621\\Desktop\\a.txt",true);
//覆盖写
FileOutputStream f = new FileOutputStream("C:\\Users\\32621\\Desktop\\a.txt",false);
//换行写
for(int i=0; i<10; i++){
    f.write("你好".getBytes());
    f.write("\r\n".getBytes());
    /*
    	不同操作系统中 换行的符号不一样
    	windows:\r\n
    	linux:/n
    	mac:/r
    */
}
```

## 字节输入流【InputStream】

java.io.InputStream抽象类是表示字节输入流的所有类的超类，可以读取自己信息到内存中

它定义了字节输入流的基本共性功能的方法

public void close(); //关闭此输入流并释放与此相关的任何系统资源

public abstract int read();//从输入流读取的下一字节

public int read(byte[] b);//从输入流中堆区一些字节数，并且将他们存储到字节数组b中

#### FileInputStream类

java.io.FileInputStream 类是文件输入流，从文件中读取字节，读取到内存中使用。

#### 构造方法

FileInputStream(File file);

通过打开与实际文件的链接来创建一个FileInputStream,该文件由文件系统中的File对象file命名

FileInputStream(String name);//传入文件路径

通过打开与实际文件的链接来创建一个FileInputStream,该文件由文件系统中的路径name命名

注意（创建流对象的时候必须创建一个文件路径，该路径下如果没有该文件，则会抛出异常）

构造方法创建 FileInputStream 对象，指定要读取文件的路径

#### 输入流单个字节读取

```java
//单个字节读取
public class DemoInputStream{
    public static void main(String[] args) throws IOException{
        //开启文件流
        FileInputStream f = new FileInputStream("c:\\doucment\\a.text");
        //读取ASCii 并且使用int类型接收
        int len = f.read();
        Systeam.out.println(len);
        //打印后关闭流
        f.close();
    }
}
//循环单字节读取
public class DemoInputStream{
    public static void main(String[] args) throws IOException{
        FileInputStream f = new FileInputStream("c:\\doucment\\a.text");
        int len = 0;
        //f.read();进行一次读取之后会立即进行一次指向下一个数字 如果再写一个则会读取到下一个字符
        while((len = f.read())!=-1){
            Systen.out.print((char)len);
        }
        //释放资源
        f.close();
    }
}
```

#### 字节输入流读取过程示意图

![1566366607907](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566366607907.png)

#### 输入流多个字节读取

```java
import java.io.*;
public class DemoInputSream2{
	//一次读取多个字节
	public static void main(String[] args) throws IOException{
		//1 打开文件流
		FileInputStream f = new FileInputStream("C:\\Users\\32621\\Desktop\\a.txt");
		//2 创建一个字节数组作为容器获取多个字节
		byte[] bytes = new byte[2];
		//3 开启读文件 并且获取这个数组的长度(注意这个读方法会自动指向下一个字节)
		int len = f.read(bytes);
		//4 打印读取到的字节
		System.out.print(new String(bytes)+" ");
		f.close();
	}
}
```

#### 输入流多个字节读取（读取整个文件）

```java
import java.io.*;
public class DemoInputSream2{
	//一次读取多个字节
	public static void main(String[] args) throws IOException{
		//1 打开文件流
		FileInputStream f = new FileInputStream("C:\\Users\\32621\\Desktop\\a.txt");
		//2 创建一个字节数组作为容器获取多个字节
		byte[] bytes = new byte[2];
		//3 创建一个容器接受数组中有效字段的长度
		int len = 0;
		//4 打印出容器中的值(结束标记为len = -1)
		while((len = f.read(bytes))!=-1){
			//正常有效字段情况下直接打印(这里两个字符就是一个字符串需要强制转换成String)
			if(len==2){
				//这里使用String的构造方法，将bytes数组转换成了字符串
				System.out.print(new String(bytes));
			}
			//不正常有效字段按照一个一个字符打印 len接受了数组的长度
			else{
				for(int i=0; i<len; i++){
					//转换成字符输出
					System.out.print((char)bytes[i]);
				}
			}
		}
		f.close();
	}
}
```



#### 输入流多个字节读取原理示意图

##### 右下方的小图为每次读取的数据和覆盖的字节（int len = f.read(bytes); 接受的是有效字节的个数）

![1566371589863](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566371589863.png)

### 文件复制(读和写的过程)

#### 单个读写

```java
import java.io.*;
public class Copy{
	public static void main(String[] args) throws Exception{
		//1 开启读文件流 读取a.txt文件中的数据
		FileInputStream f1 = new FileInputStream("C:\\Users\\32621\\Desktop\\a.txt");
		//2 开启写文件流 准备将读取到的文件写入b.txt
		FileOutputStream f2 = new FileOutputStream("C:\\Users\\32621\\Desktop\\b.txt");
		//3 开始读文件
		int len = 0;
		while((len=f1.read())!=-1){
			//将读取到的 ASCII f2文件中
			f2.write(len);
		}
		//完成操作后关闭流
		f1.close();
		f2.close(); 
	}
}
```

#### 优化多个读写

```java
import java.io.*;
public class Copy{
	public static void main(String[] args) throws Exception{
		//1 开启读文件流 读取a.txt文件中的数据
		FileInputStream f1 = new FileInputStream("C:\\Users\\32621\\Desktop\\a.txt");
		//2 开启写文件流 准备将读取到的文件写入b.txt
		FileOutputStream f2 = new FileOutputStream("C:\\Users\\32621\\Desktop\\b.txt");
		//3 开始读文件
		int len = 0;
		//len在多个读取的时候返回的是有效字节个数、
		//len在单个读取的时候返回的是AScii码
		byte[] bytes = new byte[1024];
		while((len=f1.read(bytes))!=-1){
			//将读取到的 ASCII f2文件中 直接写入字节 相应的文件类型会将其转化对应的输出
			//wirte方法重载 传入字节数组 从第一个开始写入有效字段长度个字节
			f2.write(bytes,0,len);
		}
		//完成操作后关闭流
		f1.close();
		f2.close(); 
	}
}
```

## 字符流

当使用字节流读取文本文件时，遇到正文字符时，肯能不会显示完整的字符，因为一个中文字符占多个字节，所以java提供一些字符流，以字符为单位读写数据，专门用于处理文本文件

#### 字符输入流[Reader]

java.io.Reader 抽象类是表示用于读取字符流的所有类的超类，可以读取自读信息到内存中，它定义了字符输入流的基本共性功能方法

```Java
public void close();//关闭流释放资源
public int read();//从输入流读取一个字符
public int read(char[] charBuffer);
//从输入流中读取一些字符，并将它们存储到字符数组charbuffer缓冲区中
//注意java.io.FileInputStream;包中的read() 和 java.io.Reader；包中的read()不一样
```

#### FileReader类

java.io.FileReader 类是读取字符文件的便利类，构造时使用系统默认的字符编码和默认字节缓冲区

把硬盘中的数据以字符方式读取到内存中

```Java
//构造方法（创建FileReader对象）
FileReader(String fileName);//直接传入路径的方法
FileReader(File file);//传入File类对象的方法
```

#### 单字符读取

```java
import java.io.FileReader;
import java.io.*;
public class DemoFileReader{
	//FileReader 读取示例文件
	public static void main(String[] args) throws IOException{
		//1 创建FileReader对象()
		FileReader f = new FileReader("C:\\Users\\32621\\Desktop\\a.txt");
		//2 创建容器接收
		int len = 0;
		while((len = f.read())!=-1){
			System.out.println((char)len);
		}
		//3 关闭流
		f.close();
	}
}

```

#### 一次多字符读取

```java
import java.io.FileReader;
import java.io.*;
public class FileReadMuch{
	//FileReader 读取示例文件
	public static void main(String[] args) throws IOException{
		//1 创建FileReader对象()
		FileReader f = new FileReader("C:\\Users\\32621\\Desktop\\TestText\\a.txt");
		//2 创建容器接收
		int len = 0;
		char[] c = new char[1024];
		while((len = f.read(c))!=-1){
            System.out.print(new String(c,0,len));
		}
		//3 关闭流
		f.close();
	}
}
```

#### 字符输入流[Writer]

java.io.Writer 抽象类是表示用于写出字符流的所有类的超类，将指定字符信息写出到目的地。定义了字节书橱里的基本共性功能方法。

void write(int c);写入单个字符

void write(char[] cbuf);写入字符数组

abstract void write(char[] cbuf, int off, int len);写入字符数组的某一部分，off数组的开始索引，len写入字符个数

void flush(); 刷新流缓冲。

void close();关闭流，但先刷新它

### FileWriter类

java.io.FileWriter类是写出字符到文件的便利类，构造时使用系统默认的字符编码和默认字节缓冲区

```java
//构造方法
Filewriter(File file);//给定文件对象创建
FileWriter(String fileName);//给定路径名称创建
```

#####  FileWriter的基本使用

```java
//注意这个便捷类和流中的writer最大的区别是 便捷类中的数据会先写入到内存中
//刷新和释放资源会将数据从内存中写入到文件中
public static void main(String[] args){
    FileWriter f = new FileWriter();
    f.Writer(90909);
    f.close();
}
```

#### close()和flush()的区别

```java
//flush() 刷新之后流可以继续使用
//close() 关闭流对象之后虽数据会写入文件，但是流对象不可以继续使用了
```

#### fileWriter写入文件的其他方法

```java
public static void main(String[] args){
	FileWriter f = new FileWriter("c:\\document\\b.text");
    char[] c = {"a","b","c"};
    //写入一个数组
    f.writer(c);
    //写入指定有效字段 下面这一句的意思是从第2个字符开始写，写入三个字符
    f.writer(c,1,3);
    //写入字符串
    f.writer("this is a String");
    //写入字符串中指定有效长度,从下标为2的地方开始写
    f.writer("abcde",2,3);
    f.flush();
    f.close();
}
```

#### 字符流换行写/续写

```java
FileWriter(String flash,boolean append);
FileWriter(File file,boolean append);
//append ->(true or false) 续写开关 true继续写 false 覆盖
    /*
    	不同操作系统中 换行的符号不一样
    	windows:\r\n
    	linux:/n
    	mac:/r
    */
f.writer("\r\n");//输出换行（字符流）
f.write("\r\n".getBytes());//换行（字节流，字节流需要把字符转换为字节）

```

## 流中的异常（try_catch_Finally）

```java
public static void main(String[] args){
    FileWriter f = null;
	try{
        //可能会出错的代码
        F = new FileWriter("c:\\document\\a.txt");
        for(int 1=0; i<10; i++){
            f.write("hello"+i+"\r\n");
        }
    }
    catch(Exception e){
        //异常处理
        System.out.println(e);
    }
    finally{
        if{
           //一定要执行的代码
        try{
            f.close();
        }
       	 catch(Exception e){
            //异常处理
            e.printStackTrace();
       	 } 
            
        }  
    }
}
```

#### JDK7和JDK9中异常处理

JDK7的型特性：在try的后面增加一个（），在括号中可以定义流对象，那么流对象的作用域就在try中有效。

try中的代码执行完毕，会自定把流对象释放，不用写finally格式。

```java
public static void main(String[] args){
    try(FileInputStream f1 = new FileInputStream();
       FileOutputStream f2 = new FileOutputStream();){
        int len=0;
        While((len=f1.read())!=-1){
            f2.Write(len);
        }
    }
    catch(IOException e){
        System.out.println(e);
    }
}
```

JDK9的新特新：在7的基础上，可以在try前声明流对象

```java
public static void main(String[] args) throws IOException{
    FileInputStream f1 = new FileInputStream();
    FileOutputStream f2 = new FileOutputStream();
	try(f1,f2){
        int len=0;
        While((len=f1.read())!=-1){
            f2.Write(len);
        }
    }
    catch(IOException e){
        System.out.println(e);
    }
}
```



## FileFileter 过滤器

##### File过滤器原理和使用

用过滤器可以实现从众多问价夹中筛选出符合体条件的文件

在File类中有两个和listFiles重载的方法，**方法参数传递就是过滤器**

File[] listFiles(FileFilter filter),**这个方法可以直接获取file中所有的文件**

java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器。

注意：过滤器接口是没有实现类的，需要自己写实现类，重写过滤方法accept，在方法中自己定义规律

```Java
//自定义过滤器的实现类
import java.io.File;
import java.io.FileFilter
public class FileFilterImp implements FileFilter{
	//这个方法固定传入File
	public boolean accept(File pathname){
		if(pathname.isDriectory()) return true;
		//在这里自定义自己的过滤规则
		//getName();将文件转换成字符串
		//tolowerCase();将文件转换成小写
		//endsWith();判断结尾
		else return pathname.getName().toLowerCase().endsWith(".java");
	};
}
```

```java
//遍历目录中的文件
public static void getAllFile(File dir){
    //打印遍历目录名称
   	System.out.println(dir);
    //在这个地方将过滤器和获得文件方法传入，不传入listFiles会直接获得这个文件夹以及集合
    File[] files = dir.listFiles(new FileFilterImp());
    for(File f:files){
        //判断是否是文件夹
        if(f.isDirectory()){
            //是文件夹 则递归调用打开这个文件夹并且遍历文件夹里所有的内容
            getAllFile(f);
        }
        //不是文件夹 是文件就打印
        else{
            //是文件打印文件名称
            System.out.println(f);
        }
    }
}
```

```java
//主方法测试
public static void main(String[] args){
    File file = new File("c:\\document\\mian");
    getAllFile(file);
}
```

```java
//过滤器优化改写
public void getAllFile(File dir){
    //方法体中匿名内部类
      File[] files = dir.listFiles(new FileFilterImp(){
          public boolean accept(File pathname){
              if(pathname.isDriectory()) return true;
         	  else return pathname.getName().toLowerCase().endsWith(".java");
          }
      });
}
```

```java
//过滤器优化lomdba表达式 由于接口中只有一个方法
 File[] files = dir.listFiles((File f,String name)->{
          return newFile(f,name).isDirectory()||name.toLowerCase().endsWith(".java");
      });
```

## 属性集（Properties）

概述 ：java.util.Properties 继承于 Hashtable 来表示一个持久的属性集。它使用的键值结构存储数据，每个键及其对应值都是一个字符串，该类也被许多java类使用。比如获取系统属性时，System.getProperties 方法就是返回一个Properties对象

## Properties类

#### 构造方法 

public Properties(); 创建一个空的属性列表

#### 基本的存储方法

public object setProperty(String key,String value); 保存一堆属性

public String getProperty(String key);使用此属性列表中指定的键搜索属性值

public Set <  String  > stringPropertyName(); 所有键的名称集合

```java
//Properties类表示一个持久属性集。properties 可保存在流中或者从流中加载
//Properties集合是一个唯一和IO流相结合的集合
//1 Properties 的store方法，把集合中的临时数据，持久化写入到硬盘中
//2 Properties 的load方法，把硬盘中保存的文件，读取到集合中使用
//属性列表中每个键及其对应值都是一个字符串 Properties集合是一个双列集合，key和value默认都是字符串
public void useProperties(){
    //1 创建Properties类对象
    Properties p = new Properties();
    //2 使用Properties特有的方法 setProperties 给集合添加数据
    p.setProperty("aaa","155");
    p.setProperty("bbb","144");
    //3 使用stringPropertyNames();读取键值存储到一个 Set集合中
    Set<String> set = p.stringPropertyName();
    //4 遍历Set，去除键值对印的value
    for(String key:set){
        String value = p.getProperty(key);
    }
}
```

### Properties的store方法

```java
//作用 Properties的store方法可以把集合中的临时数据，持久化写入到硬盘中存储
//void store(OutputStream out,String comments);out字节输出流，不能写入中文
//void store(Writer writer,String comments)；writer字符输出流，可以写中文
//comments 注释，不能用中文，一般为空
public void useStore() throws IOException{
    //1 创建Properties类对象
    Properties p = new Properties();
    //2 使用Properties特有的方法 setProperties 给集合添加数据
    p.setProperty("aaa","155");
    p.setProperty("bbb","144");
    //3 创建字节流/字符流（一般不用字节流）
    //FileOutputStream f = new FileOutputStream("c:\\document\\a.txt");
    FileWriter f = new FileWriter("c:\\document\\a.txt");
    //4 使用store方法，把集合中的临时数据，持久化写入到硬盘中存储
    p.store(f,"save data");
    f.close();
}
```

#### Properties的load方法

```java
//作用使用Properties集合中的方法load，把硬盘中保存的文件（键值对），读取到集合中使用
//void load(inputStream s); 传入字节输入流的方法
//void load(Reader r); 传入字符输入流的方法
public void useLoad() throws IOException{
    //1 创建Properties 集合对象
    Properties p = new Properties();
    //2 使用Properties 集合对象中的方法load读取保存键值对的文件
    FileReader f = new FileReader("c:\\document\\a.text");
    p.load(f);
   	// 获取键值到set 集合
     Set<String> s = p.getPropertyName();
    //3 遍历Properties 集合
    for(String key:s){
        String value = getProperty(key);
        System.out.println(key+“ ”+);
    }
}
```

## 缓冲流

缓冲流是对基本的io流的一种增强。例如：高效读写的缓冲流，编码转换的转换流，能持久化存储对象的序列化流，等等。

#### 概述

缓冲流也叫高效流，是对基本的字节输入输出，字符输入输出的增强，按照类型分类有如下这两种：

##### 字符缓冲流：BufferedReader.BufferedWriter

##### 字节缓冲流：BufferedInputStream，BufferedOutputStream

缓冲流的基本原理，是在创建流对象时，会创建一个内置的默认大小的缓冲区读写，减少系统IO次数

从而提高读写的效率。

### 字节缓冲流

构造方法

public BufferedInputStream(InputSream in); 创建一个新的缓冲输入流

public BufferedOutputStream(OutputStream out); 创建一个性的缓冲输出流

```java
import java.io.*;
public class useBuffered{
		//写入多个字节到缓冲区中
		public static void main(String[] args) throws IOException{
		//1 创建FileOutputStream流对象
FileOutputStream f = new FileOutputStream("C:\\Users\\32621\\Desktop\\TestText\\a.txt");
		//2 创建BufferedOutputStream对象，将流传递到缓冲区对象中
		BufferedOutputStream b = new BufferedOutputStream(f);
		//3 将需要写入流对象的内容写入流对象
		b.write("这是写入流对象的内容".getBytes());
		//4 关闭流/刷新流
		b.flush();
		b.close();
	}
}
```

### 字节缓冲输入流

构造方法

BufferedInputStream(InputStream in);

BufferedInputStream(InputStream in,int Size); 创建具有指定缓冲区域大小的Buffer并保存其参数，即输入流

```java
public static void main(String[] args) throws IOException{
    //1 创建输入流对象
    FileInputStream f = new FileInputSream("C:\\Users\\32621\\Desktop\\TestText\\a.txt");
    //2 将流对象添加到缓冲区中
    BufferedInputStream b = new BufferedInputStream(f);
    //3 将流对象中的字节一个一个去除/ 或者使用缓冲区定义缓冲区大小直接读出
    int len = 0;
    while((len=b.read())!=-1){
        Systeam.out.println((char)len);
    }
    //3 将流对象中的字节自定义缓冲区大小输出
    int len;
    Byte[] bytes = new Byte[1024];
    while((len = b.read(bytes))!=-1){
        Systeam.out.println(new String(bytes));
    }
}
```

## 字符缓冲流

#### 字符输出缓冲流

构造方法

BufferedWriter(Writer out) 创建一个默认大小的输出缓冲区的缓冲字符输出流

BufferedWriter(Writer out,int size) 创建一个给定大小输出缓冲区的缓冲字符输出流

```java
import java.io.*;
public class BufferedWrite{
	public static void main(String[] args) throws IOException{
   	//1 创建字符输出流
    FileWriter f = new FileWriter("C:\\Users\\32621\\Desktop\\TestText\\b.txt");
    //2 开启字符缓冲区
    BufferedWriter b = new BufferedWriter(f);
    //3 开始写入字符
    for(int i=0; i<10; i++){
        b.write("写入缓冲区字符串");
        b.write("\r\n");
    }
    b.close();
}
}
```

#### 字符输入缓冲流

构造方法

BufferedReader(Reader r); 创建一个默认大小输入缓冲区的缓冲字符输出流

BufferedReader(Reader r,int size);

```java
//一个一个字符读取
import java.io.*;
public class BufferedRead{
	public static void main(String[] args) throws IOException{
   	//1 创建字符输出流
    FileReader f = new FileReader("C:\\Users\\32621\\Desktop\\TestText\\b.txt");
    //2 开启字符缓冲区
	BufferedReader b = new BufferedReader(f);
    //3 开始读取字符（byte[] b = new byte[1024]）
    int len=0;
    while((len=b.read())!=-1){
		System.out.print((char)len);
    }
    b.close();
}
}
```

```java
//BufferReade 一行一行读取
import java.io.*;
public class BufferedReadLine{
    public static void main(String[] args) throws IOException{
        //1 创建字符输出流
    	FileReader f = new FileReader("C:\\Users\\32621\\Desktop\\TestText\\b.txt");
    	//2 开启字符缓冲区
		BufferedReader b = new BufferedReader(f);
        //3 开始读取
		String line;
        while((line = b.readLine())!=null){//b.newLine() 写入一个换行
            System.out.println(line);       
        }
		b.close();
    }
}
```

#### 文本排序练习题

```txt
c.txt
2 这是第二行
1 这是第一行
5 这是第五行
4 这时第四行
3 这是第三行
```

```java
//随上述文本进行排序
import java.io.*;
import java.util.*;
public class setArrTxt{
    public static void main(String[] args) throws IOException{
        //1 创建输入输出流
        FileWriter w = new FileWriter("C:\\Users\\32621\\Desktop\\TestText\\d.txt");
        FileReader r = new FileReader("C:\\Users\\32621\\Desktop\\TestText\\c.txt");
        //2 创建读写缓冲区
        BufferedWriter bw = new BufferedWriter(w);
        BufferedReader br = new BufferedReader(r);
        //3 创建Map,用来存储读出的数据
        HashMap<String,String> map = new HashMap<>();
        //4 遍历读出的数据
        String line;
        while((line=br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        //遍历获取键值对的键值，再通过 HashMap加强遍历会按照顺序读取
        for(String key:map.keySet()){
            //通过键获取，键值对的值
            String value = map.get(key);
            //拼接这一行，写入文件中
            line = key+" "+value;
			System.out.println(line);
            bw.write(line);
			bw.newLine();
        }
		bw.flush();
		bw.close();
		br.close();
    }
}
```

# 转换流

#### 字符编码和字符集

编码:字节(能看懂的) ->字节(看不懂的)

解码:字节(看不懂的)->字节(能看懂的)

系统编码：win10 GBK

IDEA编码: UTF-8(?)

#### 字符编码

也叫编码表,就是一套自然语言的字符与二进制数之间的对应规则，

编码表时是生活中文字和计算机中二进制对应规则。

#### 字符集

也叫编码表，是一个系统支持的所有字符的集合，包括文字，标点符号，图形符号，数字等等

![1566520177066](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566520177066.png)

### 编码引起的问题

在Win10系统中，系统默认的编码时GBK,而IDEA默认的编码一般是Utf-8。所以在读取windows系统中创建的文本文件时。由于Windows系统的默认是GBK编码，所以会出现乱码问题

![1566521394461](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566521394461.png)

## inputStreamReader类

#### 作用：将文件读写改为指定格式

![1566523371727](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566523371727.png)

#### InputStreamReader

构造方法

InputStreamReader(InputStream in);//不指定 默认UTF_8

InputStreamReader(InputStream in,String charSetName);//将文件流转换为指定编码输出

#### 作用:读取某一类型的文件（不使用该方法读取文件格式和源文件一致）

```java
import java.io.*;
public class RTest{
	
	public static void main(String[] args) throws IOException{
		//注意这里是一个字节流
FileInputStream in = new FileInputStream("C:\\Users\\32621\\Desktop\\TestText\\i.txt");
		//InputStreamReader in = new InputStreamReader(in);默认读取utf-8文件
		//在这里指定什么格式就去读什么格式的文件
		InputStreamReader ir = new InputStreamReader(in,"utf-8");
		//这里并不是输入字节，但是可以存储
		int len = 0;
		while((len=ir.read())!=-1){
			System.out.print((char)len);
		}
		ir.close();
	}
	
}
```



#### OutputStreamWrite

构造方法

OutputStreamWriter(OutputStream out);// 不指定编码 默认时UTF-8 编码

OutputStreamWriter(OutputStream out,String charSetName);//将文件流转换为指定编码进行输出写操作

#### 作用:把文件写成什么格式的文件（不用该方法，写成的文件和编译器一致）

```java
public void WriteByGBK(){
 //注意这里是一个字节流
 FileOutputStream out = new FileOutputStream("C:\\document\\a.txt");
 // OutputStreamWrite ow = new OutputStreamWrite(out); 
 OutputStreamWriter ow = new OutputStreamWriter(out,"gbk")
 //这里并不是输入字节，但是可以存储
 ow.write("你好");
 ow.flush();
 ow.close();
}
```

```java
//写入转换流测试
import java.io.*;
public class WTest{
	//1 测试1 测试向UTF-8编码文件中写入数据
	//测试1 结果默认的UTF-8 文件编码格式变成了IDEA编码格式 ANSI
	//2 测试2 测试向UTF-8编码的文件中写入 指定GBK类型的数据
	//测试2  结果问文件的UTF-8编码，转换成了GBK
	//3 测试3 用转换流写以上测试
	public static void main(String[] args)throws IOException{
		File f = new File("C:\\Users\\32621\\Desktop\\TestText\\x.txt");
		W_FileWrite(f);
	}
	// a 字节流正常写入
	public static void W_FileOutWriteWrite(File f) throws IOException{
		FileOutputStream out = new FileOutputStream(f);
		out.write("你好".getBytes());
		out.close();
	}
	// b 字符流写入
	public static void W_FileWrite(File f)throws IOException{
		FileWriter w = new FileWriter(f);
		w.write("哈哈哈");
		w.close();
	}
	// c 转换流写入
	public static void W_OutputStreamReader(File f)throws IOException{
		FileOutputStream out = new FileOutputStream(f);
		OutputStreamWriter o = new OutputStreamWriter(out,"utf-8");
		o.write("天气真好");
		o.close();
	}
}
```

#### 练习不同格式文本转换格式拷贝

```Java
import java.io.*;
public class Change{
	public static void main(String[] args) throws IOException{
		File f1 = new File("C:\\Users\\32621\\Desktop\\TestText\\thisUTF-8.txt");
		File f2 = new File("C:\\Users\\32621\\Desktop\\TestText\\thisGBK.txt");
		//使用utf-8编码来读取utf-8文件
		InputStreamReader r = new InputStreamReader(new FileInputStream(f1),"utf-8");
		// 在默认情况下 写入文件编码时IDEA的编码格式
		OutputStreamWriter w = new OutputStreamWriter(new FileOutputStream(f2),"utf-8");
		int len = 0;
		while((len=r.read())!=-1){
			System.out.print((char)len);
			w.write(len);
		}
		w.flush();
		r.close();
		w.close();
	}
}
```

# 流的序列化

#### 序列化和反序列化的概述：

序列化：将实体类写入磁盘变成字节的方法 WriteObject();

反序列化：将实体类从磁盘中读取出来变成文件的过程 ReaderObject();

![1566539786513](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1566539786513.png)

### 序列化流的使用

```java
// 标记性接口 Serializable 只有实现这个接口 才能够对这个对象进行序列化
public class Person implements Serializable{
	private String name;
	private int age;
	Person(){}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
```

#### 序列化流如下：(将类写入文件的方法)

```java
public static void main() throws IOException{
	// 1 创建objectOutputStream对象 将输出流传递给这个对象
    FileOutputStream f = new FileOutputStream("c:\\document\\a.txt");
    ObjectOutputStream obj = new ObjectOutputStream(f);
    obj.writeObject(new Person("牛牛"，19));
    obj.close();
}
```

#### 反序列化流如下：(将类读出文件的方法)

```java
public static void main(String[] args){
	//1 创建objectInputStream对象
    FileInputStream f = new FileInputStream("c:\\document\\a.txt");
    ObjectInputStream obj = new  ObjectInputStream(f);
    Object o = obj.readObject();
    o.close();
    Sysrem.out.println(o);
    //强制转换为自定义的类型
    Person p = (Person)o;
}
```

#### 序列化注意事项

```
static关键子：静态关键字
	静态关键子优先于非静态关键字加载加载到内存中（静态优先于对象进入到内存中）
	被static修饰的成员变量不能被序列化，序列化的都是对象（不带有static）
transient关键字：瞬态关键子
	被transient修饰的成员变量不能被序列化
```

#### 序列化Class InvalidClassException异常

在序列化的过程中，系统会给这个实体类一个序列化编码 serialVersionUID .

这个编码会在类发生修改的时候发生改变，此时在反序列化的过程中前后两次

序列化编码不一致，则会导致抛出找不到类的异常。

```Java
//为了防止序列化编码在类修改的时候发生改变，可自定义一个序列化编码
private static final long serialVersionUID = 1L;
```

#### 练习序列化集合（将集合序列化，然后再读取）

```Java
import java.io.*;
public class SerArrClass{
	public static void main(String[] args)throws IOException,ClassNotFoundException{
		GoSer();
	}
	//序列化方法
	public static void GoSer()throws IOException,ClassNotFoundException{
		File f = new File("C:\\Users\\32621\\Desktop\\TestText\\list.txt");
		//开启序列化流，并且将序列化结果写入文件流 f 到其文件地址
		ObjectOutputStream objw = new ObjectOutputStream(new FileOutputStream(f));
		//定义实体类（数组）
		Person[] p = new Person[100];
		p[1] = new Person("小红",19);
		p[2] = new Person("小明",18);
		objw.writeObject(p);
		objw.flush();
		
		//开启反序列化过程
		ObjectInputStream objr = new ObjectInputStream(new FileInputStream(f));
		Object o = objr.readObject();
		
		Person[] p2 = (Person[])o;
		for(Person Parr :p2){
			if(Parr!=null){
				System.out.println(Parr.getName()+"  "+Parr.getAge());
			}
			
		}
		objw.close();
		objr.close();
	}
}
```

# 打印流

#### PrintStream特点：

1 只负责输出不负责数据读取

2 与其他输出流不同，PrintStream永远不会抛出IOException

3 特有方法：

​	void print(任意类型);          void println(任意类型值并换行);

构造方法：

​	PrintStream(File file);

​	PrintStream(OutputStream out);

​	PrintStream(String fileName);

```java
//改变流的输出位置
public static void main(String[] args){
    PrintStream ps = new PrintStream("c:\\document\\p.txt");
    System.setOut(ps);//把输出语句的目的地改变为打印流目的地
    ps.close();
}
```

