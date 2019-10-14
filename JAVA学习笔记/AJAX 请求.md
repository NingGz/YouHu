# AJAX 请求

## ajax 是什么

AJAX = 异步 JavaScript 和 XML。

AJAX 是一种用于创建快速动态网页的技术。

通过在后台与服务器进行少量数据交换，AJAX 可以使网页实现异步更新。这意味着可以在不重新加载整个网页的情况下，对网页的某部分进行更新。

#### 传统的网页（不使用 AJAX）如果需要更新内容，必需重载整个网页面。

#### 有很多使用 AJAX 的应用程序案例：新浪微博、Google 地图、开心网等等。

#### ps ：（部分刷新网页，当某一个功能执行的时候，不需要重新刷新整个页面）



## 同步和异步

#### 同步发送请求后等待请求返回，再继续执行下一步

异步在发送请求后发送



## GET 还是 POST？

与 POST 相比，GET 更简单也更快，并且在大部分情况下都能用。

然而，在以下情况中，请使用 POST 请求：

- 无法使用缓存文件（更新服务器上的文件或数据库）
- 向服务器发送大量数据（POST 没有数据量限制）
- 发送包含未知字符的用户输入时，POST 比 GET 更稳定也更可靠



## GET 请求

一个简单的 GET 请求：

```javascript
xmlhttp.open("GET","demo_get.asp",true);
xmlhttp.send();
```

在上面的例子中，您可能得到的是缓存的结果。

为了避免这种情况，请向 URL 添加一个唯一的 ID：

```javascript
xmlhttp.open("GET","demo_get.asp?t=" + Math.random(),true);
xmlhttp.send();
```

如果您希望通过 GET 方法发送信息，请向 URL 添加信息：

Get语法格式（请求方式，请求地址，是否异步）

```javascript
xmlhttp.open("GET","demo_get2.asp?fname=Bill&lname=Gates",true);
xmlhttp.send();
```

## POST 请求

一个简单 POST 请求：

```
xmlhttp.open("POST","demo_post.asp",true);
xmlhttp.send();
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=ajax_post)



如果需要像 HTML 表单那样 POST 数据，请使用 setRequestHeader() 来添加 HTTP 头。然后在 send() 方法中规定您希望发送的数据：

```
xmlhttp.open("POST","ajax_test.asp",true);
xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
xmlhttp.send("fname=Bill&lname=Gates");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=ajax_post2)



| 方法                               | 描述                                       |
| :--------------------------------- | :----------------------------------------- |
| setRequestHeader(*header*,*value*) | 向请求添加 HTTP 头。*header*: 规定头的名称 |

## JQuery 

#### jquery 是什么？

##### JQuery 是一个优秀的javascript 框架

**jQuery 是一个 JavaScript 库。**

**jQuery 极大地简化了 JavaScript 编程。**

**jQuery 很容易学习。**



**通过 jQuery，您可以选取（查询，query） HTML 元素，并对它们执行“操作”（actions）。**

## jQuery 语法实例

- [$(this).hide()](https://www.w3school.com.cn/tiy/t.asp?f=jquery_hide_this)

  演示 jQuery hide() 函数，隐藏当前的 HTML 元素。

- [$("#test").hide()](https://www.w3school.com.cn/tiy/t.asp?f=jquery_hide_id)

  演示 jQuery hide() 函数，隐藏 id="test" 的元素。

- [$("p").hide()](https://www.w3school.com.cn/tiy/t.asp?f=jquery_hide_p)

  演示 jQuery hide() 函数，隐藏所有 <p> 元素。

- [$(".test").hide()](https://www.w3school.com.cn/tiy/t.asp?f=jquery_hide_class)

  演示 jQuery hide() 函数，隐藏所有 class="test" 的元素。

## jQuery 语法

jQuery 语法是为 HTML 元素的选取编制的，可以对元素执行某些操作。

基础语法是：*$(selector).action()*

- 美元符号定义 jQuery
- 选择符（selector）“查询”和“查找” HTML 元素
- jQuery 的 action() 执行对元素的操作

### 示例

$(this).hide() - 隐藏当前元素

$("p").hide() - 隐藏所有段落

$(".test").hide() - 隐藏所有 class="test" 的所有元素

$("#test").hide() - 隐藏所有 id="test" 的元素

**提示：**jQuery 使用的语法是 XPath 与 CSS 选择器语法的组合。在本教程接下来的章节，您将学习到更多有关选择器的语法。

## jQuery 元素选择器

jQuery 使用 CSS 选择器来选取 HTML 元素。

$("p") 选取 <p> 元素。

$("p.intro") 选取所有 class="intro" 的 <p> 元素。

$("p#demo") 选取所有 id="demo" 的 <p> 元素。

## jQuery 属性选择器

jQuery 使用 XPath 表达式来选择带有给定属性的元素。

$("[href]") 选取所有带有 href 属性的元素。

$("[href='#']") 选取所有带有 href 值等于 "#" 的元素。

$("[href!='#']") 选取所有带有 href 值不等于 "#" 的元素。

$("[href$='.jpg']") 选取所有 href 值以 ".jpg" 结尾的元素

## jQuery CSS 选择器

jQuery CSS 选择器可用于改变 HTML 元素的 CSS 属性。

下面的例子把所有 p 元素的背景颜色更改为红色：

### 实例

```javascript
$("p").css("background-color","red");
```

| 语法                 | 描述                                                 |
| :------------------- | :--------------------------------------------------- |
| $(this)              | 当前 HTML 元素                                       |
| $("p")               | 所有 <p> 元素                                        |
| $("p.intro")         | 所有 class="intro" 的 <p> 元素                       |
| $(".intro")          | 所有 class="intro" 的元素                            |
| $("#intro")          | id="intro" 的元素                                    |
| $("ul li:first")     | 每个 <ul> 的第一个 <li> 元素                         |
| $("[href$='.jpg']")  | 所有带有以 ".jpg" 结尾的属性值的 href 属性           |
| $("div#intro .head") | id="intro" 的 <div> 元素中的所有 class="head" 的元素 |

## jQuery 事件

下面是 jQuery 中事件方法的一些例子：

| Event 函数                      | 绑定函数至                                     |
| :------------------------------ | :--------------------------------------------- |
| $(document).ready(function)     | 将函数绑定到文档的就绪事件（当文档完成加载时） |
| $(selector).click(function)     | 触发或将函数绑定到被选元素的点击事件           |
| $(selector).dblclick(function)  | 触发或将函数绑定到被选元素的双击事件           |
| $(selector).focus(function)     | 触发或将函数绑定到被选元素的获得焦点事件       |
| $(selector).mouseover(function) | 触发或将函数绑定到被选元素的鼠标悬停事件       |

# jQuery 效果 - 隐藏和显示

- [jQuery 事件](https://www.w3school.com.cn/jquery/jquery_events.asp)
- [jQuery 淡入淡出](https://www.w3school.com.cn/jquery/jquery_fade.asp)

**隐藏、显示、切换，滑动，淡入淡出，以及动画，哇哦！**

## 效果演示

点击这里，隐藏/显示面板

## 实例

- [jQuery hide()](https://www.w3school.com.cn/tiy/t.asp?f=jquery_hide)

  演示一个简单的 jQuery hide() 方法。

- [jQuery hide()](https://www.w3school.com.cn/tiy/t.asp?f=jquery_hide_explanations)

  另一个 hide() 演示。如何隐藏部分文本。

## jQuery hide() 和 show()

通过 jQuery，您可以使用 hide() 和 show() 方法来隐藏和显示 HTML 元素：

```
$("#hide").click(function(){
  $("p").hide();
});

$("#show").click(function(){
  $("p").show();
});
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=jquery_hide_show)

### 语法：

```
$(selector).hide(speed,callback);

$(selector).show(speed,callback);
```

可选的 speed 参数规定隐藏/显示的速度，可以取以下值："slow"、"fast" 或毫秒。

可选的 callback 参数是隐藏或显示完成后所执行的函数名称。

下面的例子演示了带有 speed 参数的 hide() 方法：

### 实例

```
$("button").click(function(){
  $("p").hide(1000);
});
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=jquery_hide_slow)

## jQuery toggle()

通过 jQuery，您可以使用 toggle() 方法来切换 hide() 和 show() 方法。

显示被隐藏的元素，并隐藏已显示的元素：

### 实例

```
$("button").click(function(){
  $("p").toggle();
});
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=jquery_toggle)

### 语法：

```
$(selector).toggle(speed,callback);
```

## jQuery 效果参考手册

如需全面查阅 jQuery 效果，请访问我们的 [jQuery 效果参考手册](https://www.w3school.com.cn/jquery/jquery_ref_effects.asp)。

## json 与字符串直接的转化

```javascript
//from 提交的字符串格式本身就是json对象
//JSON字符串:
var str1 = '{ "name": "cxh", "sex": "man" }'; 
JSON对象:
//var str2 = { "name": "cxh", "sex": "man" };
//由JSON字符串转换为JSON对象
var obj = eval('(' + str + ')');
或者
var obj = str.parseJSON(); //由JSON字符串转换为JSON对象
或者
var obj = JSON.parse(str); //由JSON字符串转换为JSON对象
//然后，就可以这样读取（下面是读取json字符串）：
Alert(obj.name);
Alert(obj.sex);
//将json 转化为 字符串（str）
var last=obj.toJSONString(); //将JSON对象转化为JSON字符
或者
var last=JSON.stringify(obj); //将JSON对象转化为JSON字符
//读取字符串
alert(last);
```

**Js获取当前系统时间**

```javascript
var myDate = new Date(); //Date() 时js的 内置对象类型 表示时日期类
myDate.getYear();        //获取当前年份(2位)
myDate.getFullYear();    //获取完整的年份(4位,1970-????)
myDate.getMonth();       //获取当前月份(0-11,0代表1月)
myDate.getDate();        //获取当前日(1-31)
myDate.getDay();         //获取当前星期X(0-6,0代表星期天)
myDate.getTime();        //获取当前时间(从1970.1.1开始的毫秒数)
myDate.getHours();       //获取当前小时数(0-23)
myDate.getMinutes();     //获取当前分钟数(0-59)
myDate.getSeconds();     //获取当前秒数(0-59)
myDate.getMilliseconds();    //获取当前毫秒数(0-999)
myDate.toLocaleDateString();     //获取当前日期
var mytime=myDate.toLocaleTimeString();     //获取当前时间
myDate.toLocaleString( );        //获取日期与时间
```

