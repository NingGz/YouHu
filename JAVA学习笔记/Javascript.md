

# Javascript

#### JavaScript基本概念

JavaScript 是世界上最流行的脚本语言。

JavaScript 是属于 web 的语言，它适用于 PC、笔记本电脑、平板电脑和移动电话。

JavaScript 被设计为向 HTML 页面增加交互性。

许多 HTML 开发者都不是程序员，但是 JavaScript 却拥有非常简单的语法。几乎每个人都有能力将小的 JavaScript 片段添加到网页中。

如果您希望学习更多关于 JavaScript 的知识，请马上访问我们的 [JavaScript 教程](https://www.w3school.com.cn/js/index.asp)。



# JavaScript 输出

**JavaScript 不提供任何内建的打印或显示函数。**

## JavaScript 显示方案

JavaScript 能够以不同方式“显示”数据：

- 使用 window.alert() 写入警告框
- 使用 document.write() 写入 HTML 输出 （**注意：**使用 **document.write()** 将*删除所有已有的 HTML* ：）
- 使用 innerHTML 写入 HTML 元素
- 使用 console.log() 写入浏览器控制台

### InnerHTML  属性

innerHTML 属性设置或返回表格行的开始和结束标签之间的 HTML。

```html
语法:tablerowObject.innerHTML = HTML

<html>
<head>
<script type="text/javascript">
	function getInnerHTML()
 	 {
  		alert(document.getElementById("tr1").innerHTML);<!--获取行元素内的属性-->
  		}
</script>
</head>
<body>

<table border="1">
<tr id="tr1">
	<th>Firstname</th>
	<th>Lastname</th>
</tr>
<tr id="tr2">
	<td>Peter</td>
	<td>Griffin</td>
</tr>
</table>
	<br />
<input type="button" onclick="getInnerHTML()" value="Alert innerHTML of table row" />
											

</body>
</html>
```

## JavaScript 关键词

JavaScript 语句常常通过某个关键词来标识需要执行的 JavaScript 动作。

下面的表格列出了一部分将在教程中学到的关键词：

| 关键词        | 描述                                              |
| :------------ | :------------------------------------------------ |
| break         | 终止 switch 或循环。                              |
| continue      | 跳出循环并在顶端开始。                            |
| debugger      | 停止执行 JavaScript，并调用调试函数（如果可用）。 |
| do ... while  | 执行语句块，并在条件为真时重复代码块。            |
| for           | 标记需被执行的语句块，只要条件为真。              |
| function      | 声明函数。                                        |
| if ... else   | 标记需被执行的语句块，根据某个条件。              |
| return        | 退出函数。                                        |
| switch        | 标记需被执行的语句块，根据不同的情况。            |
| try ... catch | 对语句块实现错误处理。                            |
| var           | 声明变量。                                        |

## JavaScript 标识符

标识符是名称。

在 JavaScript 中，标识符用于命名变量（以及关键词、函数和标签）。

在大多数编程语言中，合法名称的规则大多相同。

在 JavaScript 中，首字符必须是字母、下划线（-）或美元符号（$）。

连串的字符可以是字母、数字、下划线或美元符号。

**提示：**数值不可以作为首字符。这样，JavaScript 就能轻松区分标识符和数值。

## JavaScript 对大小写敏感

所有 JavaScript 标识符*对大小写敏感*。

变量 lastName 和 lastname，是两个不同的变量。

```
lastName = "Gates";
lastname = "Jobs"; 
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_syntax_case)

JavaScript 不会把 *VAR* 或 *Var* 译作关键词 *var*。

## JavaScript 与驼峰式大小写

历史上，程序员曾使用三种把多个单词连接为一个变量名的方法：

### 连字符：

```html
first-name, last-name, master-card, inter-city.
```

**注释：**JavaScript 中不能使用连字符。它是为减法预留的。

### 下划线：

```html
first_name, last_name, master_card, inter_city.
```

### 驼峰式大小写（Camel Case）：

```html
FirstName, LastName, MasterCard, InterCity.
```

![camelCase](https://www.w3school.com.cn/i/camelcase.png)

**JavaScript 程序员倾向于使用以小写字母开头的驼峰大小写：**

```html
firstName, lastName, masterCard, interCity
```

## JavaScript 字符集

JavaScript 使用 *Unicode* 字符集。

Unicode 覆盖世界上几乎所有的字符、标点和符号。

如需了解详情，请访问我们完整的 [Unicode 参考手册](https://www.w3school.com.cn/tags/html_ref_utf8.asp)。

# JavaScript 注释

- [JS 语法](https://www.w3school.com.cn/js/js_syntax.asp)
- [JS 变量](https://www.w3school.com.cn/js/js_variables.asp)

**JavaScript 注释用于解释 JavaScript 代码，增强其可读性。**

**JavaScript 注释也可以用于在测试替代代码时阻止执行。**

## 单行注释

单行注释以 // 开头。

任何位于 // 与行末之间的文本都会被 JavaScript 忽略（不会执行）。

本例在每条代码行之前使用单行注释：

### 实例

```html
// 改变标题：
 document.getElementById("myH").innerHTML = "我的第一张页面";
// 改变段落：
 document.getElementById("myP").innerHTML = "我的第一个段落。";
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comments_1)

本例在每行结尾处使用了单行注释来解释代码：

### 实例

```
var x = 5;      // 声明 x，为其赋值 5
var y = x + 2;  // 声明 y，为其赋值 x + 2
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comments_2)

## 多行注释

多行注释以 /* 开头，以 */ 结尾。

任何位于 /* 和 */ 之间的文本都会被 JavaScript 忽略。

本例使用多行注释（注释块）来解释代码：

### 实例

```html
/*
 下面的代码会改变
 网页中
 id = "myH" 的标题
 以及 id = "myP" 的段落：
*/
document.getElementById("myH").innerHTML = "我的第一张页面";
document.getElementById("myP").innerHTML = "我的第一个段落。"; 
```

## JavaScript 算数运算符

算数运算符用于对数字执行算数运算：

| 运算符 | 描述 |
| :----- | :--- |
| +      | 加法 |
| -      | 减法 |
| *      | 乘法 |
| /      | 除法 |
| %      | 系数 |
| ++     | 递加 |
| --     | 递减 |

## JavaScript 赋值运算符

赋值运算符向 JavaScript 变量赋值。

| 运算符 | 例子   | 等同于    |
| :----- | :----- | :-------- |
| =      | x = y  | x = y     |
| +=     | x += y | x = x + y |
| -=     | x -= y | x = x - y |
| *=     | x *= y | x = x * y |
| /=     | x /= y | x = x / y |
| %=     | x %= y | x = x % y |

#### +在js中除了数字逻辑加，还可以作为字符之间的级联符号



## JavaScript 逻辑运算符

| 运算符 | 描述   |
| :----- | :----- |
| &&     | 逻辑与 |
| \|\|   | 逻辑或 |
| !      | 逻辑非 |

## JavaScript 类型运算符

| 运算符     | 描述                                  |
| :--------- | :------------------------------------ |
| typeof     | 返回变量的类型。                      |
| instanceof | 返回 true，如果对象是对象类型的实例。 |

## JavaScript 位运算符（了解）

位运算符处理 32 位数。

该运算中的任何数值运算数都会被转换为 32 位的数。结果会被转换回 JavaScript 数。

| 运算符 | 描述         | 例子    | 等同于       | 结果 | 十进制 |
| :----- | :----------- | :------ | :----------- | :--- | :----- |
| &      | 与           | 5 & 1   | 0101 & 0001  | 0001 | 1      |
| \|     | 或           | 5 \| 1  | 0101 \| 0001 | 0101 | 5      |
| ~      | 非           | ~ 5     | ~0101        | 1010 | 10     |
| ^      | 异或         | 5 ^ 1   | 0101 ^ 0001  | 0100 | 4      |
| <<     | 零填充左位移 | 5 << 1  | 0101 << 1    | 1010 | 10     |
| >>     | 有符号右位移 | 5 >> 1  | 0101 >> 1    | 0010 | 2      |
| >>>    | 零填充右位移 | 5 >>> 1 | 0101 >>> 1   | 0010 | 2      |

## JavaScript 算数运算符

算术运算符对数值（文字或变量）执行算术运算。

| 运算符 | 描述                                                      |
| :----- | :-------------------------------------------------------- |
| +      | 加法                                                      |
| -      | 减法                                                      |
| *      | 乘法                                                      |
| **     | 幂（[ES2016](https://www.w3school.com.cn/js/js_es6.asp)） |
| /      | 除法                                                      |
| %      | 系数                                                      |
| ++     | 递增                                                      |
| --     | 递减                                                      |

## JavaScript 赋值运算符

赋值运算符向 JavaScript 变量赋值。

| 运算符 | 例子     | 等同于      |
| :----- | :------- | :---------- |
| =      | x = y    | x = y       |
| +=     | x += y   | x = x + y   |
| -=     | x -= y   | x = x - y   |
| *=     | x *= y   | x = x * y   |
| /=     | x /= y   | x = x / y   |
| %=     | x %= y   | x = x % y   |
| <<=    | x <<= y  | x = x << y  |
| >>=    | x >>= y  | x = x >> y  |
| >>>=   | x >>>= y | x = x >>> y |
| &=     | x &= y   | x = x & y   |
| ^=     | x ^= y   | x = x ^ y   |
| \|=    | x \|= y  | x = x \| y  |

## JavaScript 数据类型

JavaScript 变量能够保存多种*数据类型*：数值、字符串值、数组、对象等等：

```html
var length = 7;                             // 数字
var lastName = "Gates";                      // 字符串
var cars = ["Porsche", "Volvo", "BMW"];         // 数组
var x = {firstName:"Bill", lastName:"Gates"};    // 对象 
```

## typeof 运算符

您可使用 JavaScript 的 typeof 来确定 JavaScript 变量的类型：

typeof 运算符返回变量或表达式的类型：

### 实例

```html
typeof ""                  // 返回 "string"
typeof "Bill"              // 返回 "string"
typeof "Bill Gates"          // 返回 "string"
```

## Undefined 与 Null 的区别

Undefined 与 null 的值相等，但类型不相等：

```html
typeof undefined              // undefined
typeof null                   // object
null === undefined            // false
null == undefined             // true
```

## 原始数据

原始数据值是一种没有额外属性和方法的单一简单数据值。

typeof 运算符可返回以下原始类型之一：

- string
- number
- boolean
- undefined

### 实例

```html
typeof "Bill"              // 返回 "string"
typeof 3.14                // 返回 "number"
typeof true                // 返回 "boolean"
typeof false               // 返回 "boolean"
typeof x                   // 返回 "undefined" (假如 x 没有值)
```

## JavaScript 函数语法

JavaScript 函数通过 function 关键词进行定义，其后是*函数名*和括号 ()。

函数名可包含字母、数字、下划线和美元符号（规则与变量名相同）。

圆括号可包括由逗号分隔的参数：

```
(参数 1, 参数 2, ...)
```

由函数执行的代码被放置在花括号中：*{}*

```html
function name(参数 1, 参数 2, 参数 3) {
    要执行的代码
}
```

## 函数返回

当 JavaScript 到达 return 语句，函数将停止执行。

如果函数被某条语句调用，JavaScript 将在调用语句之后“返回”执行代码。

函数通常会计算出*返回值*。这个返回值会返回给调用者：

### 实例

计算两个数的乘积，并返回结果：

```html
var x = myFunction(4, 3);        // 调用函数，返回值被赋值给 x

function myFunction(a, b) {
    return a * b;                // 函数返回 a 和 b 的乘积
}
```

## 为何使用函数？

您能够对代码进行复用：只要定义一次代码，就可以多次使用它。

您能够多次向同一函数传递不同的参数，以产生不同的结果。

### 实例

把华氏度转换为摄氏度：

```
function toCelsius(fahrenheit) {
    return (5/9) * (fahrenheit-32);
}

document.getElementById("demo").innerHTML = toCelsius(77);
```

## 局部变量

在 JavaScript 函数中声明的变量，会成为函数的*局部变量*。

局部变量只能在函数内访问。

### 实例

```html
// 此处的代码不能使用 carName

function myFunction() {
    var carName = "Volvo";
    // code here CAN use carName
}
```

## HTML 事件

HTML 事件可以是浏览器或用户做的某些事情。

下面是 HTML 事件的一些例子：

- HTML 网页完成加载
- HTML 输入字段被修改
- HTML 按钮被点击

通常，当事件发生时，用户会希望做某件事。

JavaScript 允许您在事件被侦测到时执行代码。

*通过 JavaScript 代码*，HTML 允许您向 HTML 元素添加事件处理程序。

使用单引号：

```html
<element event='一些 JavaScript'>
```

使用双引号：

```html
<element event="一些 JavaScript">
```

在下面的例子中，onclick 属性（以及代码）被添加到 <button> 元素：

### 实例

```html
<button onclick='document.getElementById("demo").innerHTML=Date()'>现在的时间是？</button>
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_event_onclick)



在上面的例子中，JavaScript 代码改变了 id="demo" 的元素的内容。

在接下来的例子中，代码（使用 this.innerHTML）改变了其自身元素的内容：

### 实例

```html
<button onclick="this.innerHTML=Date()">现在的时间是？</button>
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_event_onclick_this)



JavaScript 代码通常有很多行。事件属性调用函数更为常见：

### 实例

```html
<button onclick="displayDate()">现在的时间是？</button>
```

## 常见的 HTML 事件

下面是一些常见的 HTML 事件：

| 事件        | 描述                         |
| :---------- | :--------------------------- |
| onchange    | HTML 元素已被改变            |
| onclick     | 用户点击了 HTML 元素         |
| onmouseover | 用户把鼠标移动到 HTML 元素上 |
| onmouseout  | 用户把鼠标移开 HTML 元素     |
| onkeydown   | 用户按下键盘按键             |
| onload      | 浏览器已经完成页面加载       |

## 特殊字符

由于字符串必须由引号包围，JavaScript 会误解这段字符串：

```
var y = "中国是瓷器的故乡，因此 china 与"China（中国）"同名。"
```

该字符串将被切为 "中国是瓷器的故乡，因此 china 与"。

避免此问题的解决方法是，使用 *\ 转义字符*。

反斜杠转义字符把特殊字符转换为字符串字符：

| 代码 | 结果 | 描述   |
| :--- | :--- | :----- |
| \\'  | '    | 单引号 |
| \\"  | "    | 双引号 |
| \\   | \    | 反斜杠 |

### 实例

序列 \" 在字符串中插入双引号：

### 实例

```html
var x = "中国是瓷器的故乡，因此 china 与\"China（中国）\"同名。"
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_string_escape_quotes_1)



序列 \' 在字符串中插入单引号：

### 实例

```html
var x = 'It\'s good to see you again';
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_string_escape_quotes_2)



序列 \\ 在字符串中插入反斜杠：

### 实例

```html
var x = "字符 \\ 被称为反斜杠。";
```

## 长代码行换行

为了最佳可读性， 程序员们通常会避免每行代码超过 80 个字符串。

如果某条 JavaScript 语句不适合一整行，那么最佳换行位置是某个运算符之后：

### 实例

```html
document.getElementById("demo").innerHTML =
"Hello Kitty.";
```

# JavaScript 字符串方法

- [JS 字符串](https://www.w3school.com.cn/js/js_strings.asp)
- [JS 数字](https://www.w3school.com.cn/js/js_numbers.asp)

**字符串方法帮助您处理字符串。**

## 字符串方法和属性

原始值，比如“Bill Gates”，无法拥有属性和方法（因为它们不是对象）。

但是通过 JavaScript，方法和属性也可用于原始值，因为在执行方法和属性时 JavaScript 将原始值视为对象。

## 字符串长度

length 属性返回字符串的长度：

### 实例

```javascript
var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
var sln = txt.length;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_string_length)

## 查找字符串中的字符串

indexOf() 方法返回字符串中指定文本*首次*出现的索引（位置）：

### 实例

```javascript
var str = "The full name of China is the People's Republic of China.";
var pos = str.indexOf("China");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_string_indexof)

JavaScript 从零计算位置。

0 是字符串中的第一个位置，1 是第二个，2 是第三个 ...

lastIndexOf() 方法返回指定文本在字符串中*最后*一次出现的索引：

### 实例

```javascript
var str = "The full name of China is the People's Republic of China.";
var pos = str.lastIndexOf("China");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_string_lastindexof)

如果未找到文本， indexOf() 和 lastIndexOf() 均返回 -1。

### 实例

```javascript
var str = "The full name of China is the People's Republic of China.";
var pos = str.indexOf("USA");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_string_indexof_1)

两种方法都接受作为检索起始位置的第二个参数。

### 实例

```javascript
var str = "The full name of China is the People's Republic of China.";
var pos = str.indexOf("China", 18);
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_string_indexof_2)

lastIndexOf() 方法向后进行检索（从尾到头），这意味着：假如第二个参数是 50，则从位置 50 开始检索，直到字符串的起点。

### 实例

```javascript
var str = "The full name of China is the People's Republic of China.";
var pos = str.lastIndexOf("China", 50);
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_string_lastindexof_2)

## 检索字符串中的字符串

search() 方法搜索特定值的字符串，并返回匹配的位置：

### 实例

```javascript
var str = "The full name of China is the People's Republic of China.";
var pos = str.search("locate");
```

## 您注意到了吗？

两种方法，indexOf() 与 search()，是*相等的*。

这两种方法是不相等的。区别在于：

- search() 方法无法设置第二个开始位置参数。
- indexOf() 方法无法设置更强大的搜索值（正则表达式）。

您将在[正则表达式](https://www.w3school.com.cn/js/js_regexp.asp)的章节学习到这些更强大的检索值。

## String 对象属性

| 属性                                                         | 描述                       |
| :----------------------------------------------------------- | :------------------------- |
| constructor                                                  | 对创建该对象的函数的引用   |
| [length](https://www.w3school.com.cn/jsref/jsref_length_string.asp) | 字符串的长度               |
| prototype                                                    | 允许您向对象添加属性和方法 |

## String 对象方法

| 方法                                                         | 描述                                                 |
| :----------------------------------------------------------- | :--------------------------------------------------- |
| [anchor()](https://www.w3school.com.cn/jsref/jsref_anchor.asp) | 创建 HTML 锚。                                       |
| [big()](https://www.w3school.com.cn/jsref/jsref_big.asp)     | 用大号字体显示字符串。                               |
| [blink()](https://www.w3school.com.cn/jsref/jsref_blink.asp) | 显示闪动字符串。                                     |
| [bold()](https://www.w3school.com.cn/jsref/jsref_bold.asp)   | 使用粗体显示字符串。                                 |
| [charAt()](https://www.w3school.com.cn/jsref/jsref_charAt.asp) | 返回在指定位置的字符。                               |
| [charCodeAt()](https://www.w3school.com.cn/jsref/jsref_charCodeAt.asp) | 返回在指定的位置的字符的 Unicode 编码。              |
| [concat()](https://www.w3school.com.cn/jsref/jsref_concat_string.asp) | 连接字符串。                                         |
| [fixed()](https://www.w3school.com.cn/jsref/jsref_fixed.asp) | 以打字机文本显示字符串。                             |
| [fontcolor()](https://www.w3school.com.cn/jsref/jsref_fontcolor.asp) | 使用指定的颜色来显示字符串。                         |
| [fontsize()](https://www.w3school.com.cn/jsref/jsref_fontsize.asp) | 使用指定的尺寸来显示字符串。                         |
| [fromCharCode()](https://www.w3school.com.cn/jsref/jsref_fromCharCode.asp) | 从字符编码创建一个字符串。                           |
| [indexOf()](https://www.w3school.com.cn/jsref/jsref_indexOf.asp) | 检索字符串。                                         |
| [italics()](https://www.w3school.com.cn/jsref/jsref_italics.asp) | 使用斜体显示字符串。                                 |
| [lastIndexOf()](https://www.w3school.com.cn/jsref/jsref_lastIndexOf.asp) | 从后向前搜索字符串。                                 |
| [link()](https://www.w3school.com.cn/jsref/jsref_link.asp)   | 将字符串显示为链接。                                 |
| [localeCompare()](https://www.w3school.com.cn/jsref/jsref_localeCompare.asp) | 用本地特定的顺序来比较两个字符串。                   |
| [match()](https://www.w3school.com.cn/jsref/jsref_match.asp) | 找到一个或多个正则表达式的匹配。                     |
| [replace()](https://www.w3school.com.cn/jsref/jsref_replace.asp) | 替换与正则表达式匹配的子串。                         |
| [search()](https://www.w3school.com.cn/jsref/jsref_search.asp) | 检索与正则表达式相匹配的值。                         |
| [slice()](https://www.w3school.com.cn/jsref/jsref_slice_string.asp) | 提取字符串的片断，并在新的字符串中返回被提取的部分。 |
| [small()](https://www.w3school.com.cn/jsref/jsref_small.asp) | 使用小字号来显示字符串。                             |
| [split()](https://www.w3school.com.cn/jsref/jsref_split.asp) | 把字符串分割为字符串数组。                           |
| [strike()](https://www.w3school.com.cn/jsref/jsref_strike.asp) | 使用删除线来显示字符串。                             |
| [sub()](https://www.w3school.com.cn/jsref/jsref_sub.asp)     | 把字符串显示为下标。                                 |
| [substr()](https://www.w3school.com.cn/jsref/jsref_substr.asp) | 从起始索引号提取字符串中指定数目的字符。             |
| [substring()](https://www.w3school.com.cn/jsref/jsref_substring.asp) | 提取字符串中两个指定的索引号之间的字符。             |
| [sup()](https://www.w3school.com.cn/jsref/jsref_sup.asp)     | 把字符串显示为上标。                                 |
| [toLocaleLowerCase()](https://www.w3school.com.cn/jsref/jsref_toLocaleLowerCase.asp) | 把字符串转换为小写。                                 |
| [toLocaleUpperCase()](https://www.w3school.com.cn/jsref/jsref_toLocaleUpperCase.asp) | 把字符串转换为大写。                                 |
| [toLowerCase()](https://www.w3school.com.cn/jsref/jsref_toLowerCase.asp) | 把字符串转换为小写。                                 |
| [toUpperCase()](https://www.w3school.com.cn/jsref/jsref_toUpperCase.asp) | 把字符串转换为大写。                                 |
| toSource()                                                   | 代表对象的源代码。                                   |
| [toString()](https://www.w3school.com.cn/jsref/jsref_toString_string.asp) | 返回字符串。                                         |
| [valueOf()](https://www.w3school.com.cn/jsref/jsref_valueOf_string.asp) | 返回某个字符串对象的原始值。                         |

## NaN - 非数值

NaN 属于 JavaScript 保留词，指示某个数不是合法数。

尝试用一个非数字字符串进行除法会得到 NaN（Not a Number）：

### 实例

```javascript
var x = 100 / "Apple";  // x 将是 NaN（Not a Number）
```

您可使用全局 JavaScript 函数 isNaN() 来确定某个值是否是数：

### 实例

```javascript
var x = 100 / "Apple";
isNaN(x);               // 返回 true，因为 x 不是数
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_number_isnan_true)



要小心 NaN。假如您在数学运算中使用了 NaN，则结果也将是 NaN：

### 实例

```javascript
var x = NaN;
var y = 5;
var z = x + y;         // z 将是 NaN
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_number_nan_math)



结果也许是串连接：

### 实例

```javascript
var x = NaN;
var y = "5";
var z = x + y;         // z 将是 NaN5
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_number_nan_concat)



NaN 是数，typeof NaN 返回 number：

### 实例

```javascript
typeof NaN;     
```

## Number 方法和属性

原始值（比如 3.14 或 2016），无法拥有属性和方法（因为它们不是对象）。

但是通过 JavaScript，方法和属性也可用于原始值，因为 JavaScript 在执行方法和属性时将原始值视作对象。

## toString() 方法

toString() 以字符串返回数值。

所有数字方法可用于任意类型的数字（字面量、变量或表达式）：

### 实例

```
var x = 123;
x.toString();            // 从变量 x 返回 123
(123).toString();        // 从文本 123 返回 123
(100 + 23).toString();   // 从表达式 100 + 23 返回 123
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_number_tostring)

## toExponential() 方法

toExponential() 返回字符串值，它包含已被四舍五入并使用指数计数法的数字。

参数定义小数点后的字符数：

### 实例

```
var x = 9.656;
x.toExponential(2);     // 返回 9.66e+0
x.toExponential(4);     // 返回 9.6560e+0
x.toExponential(6);     // 返回 9.656000e+0
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_number_toexponential)

该参数是可选的。如果您没有设置它，JavaScript 不会对数字进行舍入。

## toFixed() 方法

toFixed() 返回字符串值，它包含了指定位数小数的数字：

### 实例

```
var x = 9.656;
x.toFixed(0);           // 返回 10
x.toFixed(2);           // 返回 9.66
x.toFixed(4);           // 返回 9.6560
x.toFixed(6);           // 返回 9.656000
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_number_tofixed)

toFixed(2) 非常适合处理金钱。

## toPrecision() 方法

toPrecision() 返回字符串值，它包含了指定长度的数字：

### 实例

```
var x = 9.656;
x.toPrecision();        // 返回 9.656
x.toPrecision(2);       // 返回 9.7
x.toPrecision(4);       // 返回 9.656
x.toPrecision(6);       // 返回 9.65600
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_number_toprecision)

## valueOf() 方法

valueOf() 以数值返回数值：

### 实例

```
var x = 123;
x.valueOf();            // 从变量 x 返回 123
(123).valueOf();        // 从文本 123 返回 123
(100 + 23).valueOf();   // 从表达式 100 + 23 返回 123
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_number_valueof)

在 JavaScript 中，数字可以是原始值（typeof = number）或对象（typeof = object）。

在 JavaScript 内部使用 valueOf() 方法可将 Number 对象转换为原始值。

没有理由在代码中使用它。

所有 JavaScript 数据类型都有 valueOf() 和 toString() 方法。

## 什么是数组？

数组是一种特殊的变量，它能够一次存放一个以上的值。

如果您有一个项目清单（例如，汽车品牌列表），在单个变量中存储汽车品牌应该是这样的：

```
var car1 = "Saab";
var car2 = "Volvo";
var car3 = "BMW"; 
```

不过，假如您希望遍历所有汽车并找到一个特定的值？假如不是三个汽车品牌而是三百个呢？

解决方法就是数组！

数组可以用一个单一的名称存放很多值，并且还可以通过引用索引号来访问这些值。

## 创建数组

使用数组文本是创建 JavaScript 数组最简单的方法。

### 语法：

```javascript
var array-name = [item1, item2, ...];
```

### 实例

```javascript
var cars = ["Saab", "Volvo", "BMW"];
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array)

空格和折行并不重要。声明可横跨多行：

### 实例

```javascript
var cars = [
    "Saab",
    "Volvo",
    "BMW"
];
```

# JavaScript 数组方法

- [JS 数组](https://www.w3school.com.cn/js/js_arrays.asp)
- [JS 数组排序](https://www.w3school.com.cn/js/js_array_sort.asp)

**JavaScript 数组的力量隐藏在数组方法中。**

## 把数组转换为字符串

JavaScript 方法 toString() 把数组转换为数组值（逗号分隔）的字符串。

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
document.getElementById("demo").innerHTML = fruits.toString(); 
```

结果

```
Banana,Orange,Apple,Mango
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_tostring)

join() 方法也可将所有数组元素结合为一个字符串。

它的行为类似 toString()，但是您还可以规定分隔符：

### 实例

```
var fruits = ["Banana", "Orange","Apple", "Mango"];
document.getElementById("demo").innerHTML = fruits.join(" * "); 
```

结果

```
Banana * Orange * Apple * Mango
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_join)

## Popping 和 Pushing

在处理数组时，删除元素和添加新元素是很简单的。

Popping 和 Pushing 指的是：

从数组*弹出*项目，或向数组*推入*项目。

## Popping

pop() 方法从数组中删除最后一个元素：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.pop();              // 从 fruits 删除最后一个元素（"Mango"）
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_pop)

pop() 方法返回“被弹出”的值：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
var x = fruits.pop();      // x 的值是 "Mango"
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_pop_out)

## Pushing

push() 方法（在数组结尾处）向数组添加一个新的元素：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.push("Kiwi");       //  向 fruits 添加一个新元素
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_push)

push() 方法返回新数组的长度：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
var x =  fruits.push("Kiwi");   //  x 的值是 5
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_push_length)

## 位移元素

位移与弹出等同，但处理首个元素而不是最后一个。

shift() 方法会删除首个数组元素，并把所有其他元素“位移”到更低的索引。

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.shift();            // 从 fruits 删除第一个元素 "Banana"
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_shift)

shift() 方法返回被“位移出”的字符串：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.shift();             // 返回 "Banana"
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_shift_return)

unshift() 方法（在开头）向数组添加新元素，并“反向位移”旧元素：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.unshift("Lemon");    // 向 fruits 添加新元素 "Lemon"
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_unshift)

unshift() 方法返回新数组的长度。

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.unshift("Lemon");    // 返回 5
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_unshift_return)

## 更改元素

通过使用它们的*索引号*来访问数组元素：

数组*索引（下标）*以 0 开始。[0] 是第一个数组元素，[1] 是第二个，[2] 是第三个 ...

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits[0] = "Kiwi";        // 把 fruits 的第一个元素改为 "Kiwi"
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_change)

length 属性提供了向数组追加新元素的简易方法：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits[fruits.length] = "Kiwi";          // 向 fruits 追加 "Kiwi"
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_change_add)

## 删除元素

既然 JavaScript 数组属于对象，其中的元素就可以使用 JavaScript delete 运算符来*删除*：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
delete fruits[0];           // 把 fruits 中的首个元素改为 undefined
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_delete)

使用 delete 会在数组留下未定义的空洞。请使用 pop() 或 shift() 取而代之。

## 拼接数组

splice() 方法可用于向数组添加新项：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 0, "Lemon", "Kiwi");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_splice)

第一个参数（2）定义了应添加新元素的位置（拼接）。

第二个参数（0）定义应删除多少元素。

其余参数（“Lemon”，“Kiwi”）定义要添加的新元素。

splice() 方法返回一个包含已删除项的数组：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 2, "Lemon", "Kiwi");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_splice_return)

## 使用 splice() 来删除元素

通过聪明的参数设定，您能够使用 splice() 在数组中不留“空洞”的情况下移除元素：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(0, 1);        // 删除 fruits 中的第一个元素
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_splice_remove)

第一个参数（0）定义新元素应该被*添加*（接入）的位置。

第二个参数（1）定义应该*删除多个*元素。

其余参数被省略。没有新元素将被添加。

## 合并（连接）数组

concat() 方法通过合并（连接）现有数组来创建一个新数组：

### 实例（合并两个数组）

```
var myGirls = ["Cecilie", "Lone"];
var myBoys = ["Emil", "Tobias", "Linus"];
var myChildren = myGirls.concat(myBoys);   // 连接 myGirls 和 myBoys
```

# JavaScript 数组排序

- [JS 数组方法](https://www.w3school.com.cn/js/js_array_methods.asp)
- [JS 数组迭代](https://www.w3school.com.cn/js/js_array_iteration.asp)

**sort() 方法是最强大的数组方法之一。**

## 数组排序

sort() 方法以字母顺序对数组进行排序：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.sort();            // 对 fruits 中的元素进行排序
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_sort)

## 反转数组

reverse() 方法反转数组中的元素。

您可以使用它以降序对数组进行排序：

### 实例

```
var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.sort();            // 对 fruits 中的元素进行排序
fruits.reverse();         // 反转元素顺序
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_sort_reverse)

## 数字排序

默认地，sort() 函数按照*字符串*顺序对值进行排序。

该函数很适合字符串（"Apple" 会排在 "Banana" 之前）。

不过，如果数字按照字符串来排序，则 "25" 大于 "100"，因为 "2" 大于 "1"。

正因如此，sort() 方法在对数值排序时会产生不正确的结果。

我们通过一个*比值函数*来修正此问题：

### 实例

```
var points = [40, 100, 1, 5, 25, 10];
points.sort(function(a, b){return a - b}); 
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_sort_numeric_1)

使用相同的技巧对数组进行降序排序：

### 实例

```
var points = [40, 100, 1, 5, 25, 10];
points.sort(function(a, b){return b - a}); 
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_array_sort_numeric_2)

## 比值函数

比较函数的目的是定义另一种排序顺序。

比较函数应该返回一个负，零或正值，这取决于参数：

```
function(a, b){return a-b}
```

# JavaScript 数组迭代方法

## Array.forEach()

forEach() 方法为每个数组元素调用一次函数（回调函数）。

### 实例

```javascript
var txt = "";
var numbers = [45, 4, 9, 16, 25];
numbers.forEach(myFunction);

function myFunction(value, index, array) {
  txt = txt + value + "<br>"; 
}
```

## Array.map()

map() 方法通过对每个数组元素执行函数来创建新数组。

map() 方法不会对没有值的数组元素执行函数。

map() 方法不会更改原始数组。

这个例子将每个数组值乘以2：

### 实例

```javascript
var numbers1 = [45, 4, 9, 16, 25];
var numbers2 = numbers1.map(myFunction);

function myFunction(value, index, array) {
  return value * 2;
}
```

# JavaScript 日期

- [JS 数组迭代](https://www.w3school.com.cn/js/js_array_iteration.asp)
- [JS 日期格式](https://www.w3school.com.cn/js/js_date_formats.asp)

## 实例

```
var d = new Date();
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_date_current)

## JavaScript 日期输出

默认情况下，JavaScript 将使用浏览器的时区并将日期显示为全文本字符串：

```
Tue Apr 02 2019 09:01:19 GMT+0800 (中国标准时间)
```

稍后，您将在本教程学到更多关于如何显示日期的知识。

## 创建 Date 对象

Date 对象由新的 Date() 构造函数创建。

有 4 种方法创建新的日期对象：

- new Date()
- new Date(year, month, day, hours, minutes, seconds, milliseconds)
- new Date(milliseconds)
- new Date(date string)

## new Date()

new Date() 用当前日期和时间创建新的日期对象：

### 实例

```
var d = new Date();
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_date_new)

日期对象是静态的。计算机时间正在滴答作响，但日期对象不会。

## new Date(year, month, ...)

new Date(year, month, ...) 用指定日期和时间创建新的日期对象。

7个数字分别指定年、月、日、小时、分钟、秒和毫秒（按此顺序）：

### 实例

```javascript
var d = new Date(2018, 11, 24, 10, 33, 30, 0);
```

有四种 JavaScript 日期输入格式：

| 类型     | 实例                             |
| :------- | :------------------------------- |
| ISO 日期 | "2018-02-19" （国际标准）        |
| 短日期   | "02/19/2018" 或者 "2018/02/19"   |
| 长日期   | "Feb 19 2018" 或者 "19 Feb 2019" |
| 完整日期 | "Monday February 25 2015"        |

## 日期获取方法

获取方法用于获取日期的某个部分（来自日期对象的信息）。下面是最常用的方法（以字母顺序排序）：

| 方法              | 描述                                 |
| :---------------- | :----------------------------------- |
| getDate()         | 以数值返回天（1-31）                 |
| getDay()          | 以数值获取周名（0-6）                |
| getFullYear()     | 获取四位的年（yyyy）                 |
| getHours()        | 获取小时（0-23）                     |
| getMilliseconds() | 获取毫秒（0-999）                    |
| getMinutes()      | 获取分（0-59）                       |
| getMonth()        | 获取月（0-11）                       |
| getSeconds()      | 获取秒（0-59）                       |
| getTime()         | 获取时间（从 1970 年 1 月 1 日至今） |

## Math 对象方法

| 方法             | 描述                                                     |
| :--------------- | :------------------------------------------------------- |
| abs(x)           | 返回 x 的绝对值                                          |
| acos(x)          | 返回 x 的反余弦值，以弧度计                              |
| asin(x)          | 返回 x 的反正弦值，以弧度计                              |
| atan(x)          | 以介于 -PI/2 与 PI/2 弧度之间的数值来返回 x 的反正切值。 |
| atan2(y,x)       | 返回从 x 轴到点 (x,y) 的角度                             |
| ceil(x)          | 对 x 进行上舍入                                          |
| cos(x)           | 返回 x 的余弦                                            |
| exp(x)           | 返回 Ex 的值                                             |
| floor(x)         | 对 x 进行下舍入                                          |
| log(x)           | 返回 x 的自然对数（底为e）                               |
| max(x,y,z,...,n) | 返回最高值                                               |
| min(x,y,z,...,n) | 返回最低值                                               |
| pow(x,y)         | 返回 x 的 y 次幂                                         |
| random()         | 返回 0 ~ 1 之间的随机数                                  |
| round(x)         | 把 x 四舍五入为最接近的整数                              |
| sin(x)           | 返回 x（x 以角度计）的正弦                               |
| sqrt(x)          | 返回 x 的平方根                                          |
| tan(x)           | 返回角的正切                                             |

## Math.random()

Math.random() 返回 0（包括） 至 1（不包括） 之间的随机数：

### 实例

```javascript
Math.random();				// 返回随机数
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_random)

Math.random() 总是返回小于 1 的数。

## JavaScript 随机整数

Math.random() 与 Math.floor() 一起使用用于返回随机整数。

### 实例

```javascript
Math.floor(Math.random() * 10);		
```



## 比较运算符

比较运算符在逻辑语句中使用，以判定变量或值是否相等。

我们给定 x = 5，下表中解释了比较运算符：

| 运算符 | 描述                 | 比较      | 返回  | 测试                                                         |
| :----- | :------------------- | :-------- | :---- | :----------------------------------------------------------- |
| ==     | 等于                 | x == 8    | false | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_01) |
|        |                      | x == 5    | true  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_02) |
|        |                      | x == "5"  | true  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_03) |
| ===    | 值相等并且类型相等   | x === 5   | true  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_04) |
|        |                      | x === "5" | false | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_05) |
| !=     | 不相等               | x != 8    | true  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_06) |
| !==    | 值不相等或类型不相等 | x !== 5   | false | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_07) |
|        |                      | x !== "5" | true  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_08) |
|        |                      | x !== 8   | true  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_09) |
| >      | 大于                 | x > 8     | false | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_10) |
| <      | 小于                 | x < 8     | true  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_11) |
| >=     | 大于或等于           | x >= 8    | false | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_12) |
| <=     | 小于或等于           | x <= 8    | true  | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_comparison_13) |

## JavaScript Switch 语句

请使用 switch 语句来选择多个需被执行的代码块之一。

### 语法

```javascript
switch(表达式) {
     case n:
        代码块
        break;
     case n:
        代码块
        break;
     default:
        默认代码块
} 
```

## For/In 循环

JavaScript for/in 语句遍历对象的属性：

### 实例

```javascript
var person = {fname:"Bill", lname:"Gates", age:62}; 

var text = "";
var x;
for (x in person) {
    text += person[x];
```

# JavaScript While 循环

- [JS Loop For](https://www.w3school.com.cn/js/js_loop_for.asp)
- [JS Break](https://www.w3school.com.cn/js/js_break.asp)

**只要条件为 true，循环能够一直执行代码块。**

## While 循环

while 循环会一直循环代码块，只要指定的条件为 true。

### 语法

```javascript
while (条件) {
    要执行的代码块
}
```

### 实例

在下面的例子中，循环中的代码将运行，一遍又一遍，只要变量（i）小于 10：

```javascript
while (i < 10) {
    text += "数字是 " + i;
    i++;
}
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_while)

如果您忘了对条件中使用的变量进行递增，那么循环永不会结束。这会导致浏览器崩溃。

## Do/While 循环

do/while 循环是 while 循环的变体。在检查条件是否为真之前，这种循环会执行一次代码块，然后只要条件为真就会重复循环。

### 语法

```javascript
do {
    要执行的代码块
}

while (条件);
```

### 实例

下面的例子使用了 do/while 循环。该循环会执行至少一次，即使条件为 false，因为代码块会在条件测试之前执行：

```javascript
do {
    text += "The number is " + i;
    i++;
 }
while (i < 10);
```

## Break 语句

在本教程稍早的章节中，您已见到了 break 语句。它被用于“跳出” switch 语句。

break 语句也可用于跳出循环。

break 语句会中断循环，并继续执行循环之后的代码（如果有）：

### 实例

```javascript
for (i = 0; i < 10; i++) {
    if (i === 3) { break; }
    text += "数字是 " + i + "<br>";
}
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_break)

## Continue 语句

continue 语句中断（循环中）的一个迭代，如果发生指定的条件。然后继续循环中的下一个迭代。

本例跳过值 3 ：

### 实例

```javascript
for (i = 0; i < 10; i++) {
    if (i === 3) { continue; }
    text += "数字是 " + i + "<br>";
} 
```

### javascript 数据类型

## JavaScript 数据类型

JavaScript 中有五种可包含值的数据类型：

- 字符串（string）
- 数字（number）
- 布尔（boolean）
- 对象（object）
- 函数（function）

有三种对象类型：

- 对象（Object）
- 日期（Date）
- 数组（Array）

同时有两种不能包含值的数据类型：

- null
- undefined



## 检测javascript 数据类型

```javascript
function isArray(myArray) {
    return myArray.constructor === Array; //这里的Array 可以是其他类型
}
```

| 方法            | 描述                                                   |
| :-------------- | :----------------------------------------------------- |
| toExponential() | 返回字符串，对数字进行舍入，并使用指数计数法来写。     |
| toFixed()       | 返回字符串，对数字进行舍入，并使用指定位数的小数来写。 |
| toPrecision()   | 返回字符串，把数字写为指定的长度。                     |

## 把布尔转换为字符串（其余同理）

全局方法 String() 能够将布尔转换为字符串。

```
String(false)        // 返回 "false"
String(true)         // 返回 "true" 
```

布尔方法 toString() 同理。

```
false.toString()     // 返回 "false"
true.toString()      // 返回 "true"
```

## 把日期转换为字符串

全局方法 String() 可将日期转换为字符串。

```javascript
String(Date())      // 返回 "Thu Aug 01 2019 13:35:52 GMT+0800 (中国标准时间)"
```

日期方法 toString() 同理。

### 实例

```javascript
Date().toString()   // 返回 "Thu Aug 01 2019 13:35:52 GMT+0800 (中国标准时间)"
```

| 方法              | 描述                                    |
| :---------------- | :-------------------------------------- |
| getDate()         | 获得以数值计（1-31）的日                |
| getDay()          | 或者以数值计（0-6）的周                 |
| getFullYear()     | 获得四位的年（yyyy）                    |
| getHours()        | 获得时（0-23）                          |
| getMilliseconds() | 获得毫秒（0-999）                       |
| getMinutes()      | 获得分钟（0-59）                        |
| getMonth()        | 获得月（0-11）                          |
| getSeconds()      | 获得秒（0-59）                          |
| getTime()         | 获得时间（1970 年 1 月 1 日以来的毫秒） |

## JavaScript 类型转换表

下表中列出了将不同 JavaScript 值转换为数字、字符串和布尔的结果：

| 原始值           | 转换为数字 | 转换为字符串      | 转换为逻辑 |
| :--------------- | :--------- | :---------------- | :--------- |
| false            | 0          | "false"           | false      |
| true             | 1          | "true"            | true       |
| 0                | 0          | "0"               | false      |
| 1                | 1          | "1"               | true       |
| "0"              | 0          | "0"               | true       |
| "000"            | 0          | "000"             | true       |
| "1"              | 1          | "1"               | true       |
| NaN              | NaN        | "NaN"             | false      |
| Infinity         | Infinity   | "Infinity"        | true       |
| -Infinity        | -Infinity  | "-Infinity"       | true       |
| ""               | 0          | ""                | false      |
| "20"             | 20         | "20"              | true       |
| "twenty"         | NaN        | "twenty"          | true       |
| [ ]              | 0          | ""                | true       |
| [20]             | 20         | "20"              | true       |
| [10,20]          | NaN        | "10,20"           | true       |
| ["twenty"]       | NaN        | "twenty"          | true       |
| ["ten","twenty"] | NaN        | "ten,twenty"      | true       |
| function(){}     | NaN        | "function(){}"    | true       |
| { }              | NaN        | "[object Object]" | true       |
| null             | 0          | "null"            | false      |
| undefined        | NaN        | "undefined"       | false      |

## 正则表达式修饰符

*修饰符*可用于大小写不敏感的更全局的搜素：

| 修饰符 | 描述                                                     |                                                              |
| :----- | :------------------------------------------------------- | ------------------------------------------------------------ |
| i      | 执行对大小写不敏感的匹配。                               | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_regexp_i) |
| g      | 执行全局匹配（查找所有匹配而非在找到第一个匹配后停止）。 | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_regexp_g) |
| m      | 执行多行匹配。                                           | [试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_regexp_m) |

## 正则表达式模式

*括号*用于查找一定范围的字符串：

| 表达式 | 描述                       |
| :----- | :------------------------- |
| [abc]  | 查找方括号之间的任何字符。 |
| [0-9]  | 查找任何从 0 至 9 的数字。 |
| (x\|y) | 查找由 \| 分隔的任何选项。 |

*元字符（Metacharacter）*是拥有特殊含义的字符：

| 元字符 | 描述                                        |
| :----- | :------------------------------------------ |
| \d     | 查找数字。                                  |
| \s     | 查找空白字符。                              |
| \b     | 匹配单词边界。                              |
| \uxxxx | 查找以十六进制数 xxxx 规定的 Unicode 字符。 |

*Quantifiers* 定义量词：

| 量词 | 描述                                |
| :--- | :---------------------------------- |
| n+   | 匹配任何包含至少一个 n 的字符串。   |
| n*   | 匹配任何包含零个或多个 n 的字符串。 |
| n?   | 匹配任何包含零个或一个 n 的字符串。 |

## JavaScript try 和 catch

try 语句允许您定义一个代码块，以便在执行时检测错误。

catch 语句允许你定义一个要执行的代码块，如果 try 代码块中发生错误。

JavaScript 语句 try 和 catch 成对出现：

```javascript
try {
     供测试的代码块
}
 catch(err) {
     处理错误的代码块
} 
```

## 输入验证案例

本例会检查输入。如果值是错误的，将抛出异常（err）。

该异常（err）被 catch 语句捕获并显示一条自定义的错误消息：

```javascript
<!DOCTYPE html>
<html>
<body>

<p>请输入 5 - 10 之间的数字：</p>

<input id="demo" type="text">
<button type="button" onclick="myFunction()">测试输入</button>
<p id="message"></p>

<script>
function myFunction() {
    var message, x;
    message = document.getElementById("message");
    message.innerHTML = "";
    x = document.getElementById("demo").value;
    try { 
        if(x == "") throw "空的";
         if(isNaN(x)) throw "不是数字";
         x = Number(x);
        if(x < 5) throw  "太小";
        if(x > 10) throw "太大";
    }
    catch(err) {
        message.innerHTML = "输入是 " + err;
    }
}
</script>

</body>
</html> 
```

#### 输入框只能输入整数、并且在其中选择

```javascript
<input id="demo" type="number" min="5" max="10" step="1">
```

## Error 对象

JavaScript 拥有当错误发生时提供错误信息的内置 error 对象。

error 对象提供两个有用的属性：name 和 message。

## Error 对象属性

| 属性    | 描述                             |
| :------ | :------------------------------- |
| name    | 设置或返回错误名                 |
| message | 设置或返回错误消息（一条字符串） |

## Error Name Values

error 的 name 属性可返回六个不同的值：

| 错误名         | 描述                          |
| :------------- | :---------------------------- |
| EvalError      | 已在 eval() 函数中发生的错误  |
| RangeError     | 已发生超出数字范围的错误      |
| ReferenceError | 已发生非法引用                |
| SyntaxError    | 已发生语法错误                |
| TypeError      | 已发生类型错误                |
| URIError       | 在 encodeURI() 中已发生的错误 |

## JavaScript 函数作用域

在 JavaScript 中有两种作用域类型：

- 局部作用域
- 全局作用域

JavaScript 拥有函数作用域：每个函数创建一个新的作用域。

作用域决定了这些变量的可访问性（可见性）。

函数内部定义的变量从函数外部是不可访问的（不可见的）。

## 局部 JavaScript 变量

在 JavaScript 函数中声明的变量，会成为函数的*局部变量*。

局部变量的作用域是*局部的*：只能在函数内部访问它们。

### 实例

```javascript
// 此处的代码不能使用 carName 变量

function myFunction() {
    var carName = "porsche";

}
```

## 全局 JavaScript 变量

函数之外声明的变量，会成为*全局变量*。

全局变量的作用域是*全局的*：网页的所有脚本和函数都能够访问它。

### 实例

```javascript
var carName = " porsche";
// 此处的代码能够使用 carName 变量
function myFunction() {
    // 此处的代码也能够使用 carName 变量
}
```

## 事件处理程序中的 this

在 HTML 事件处理程序中，this 指的是接收此事件的 HTML 元素：

### 实例

```javascript
<button onclick="this.style.display='none'">
  点击来删除我！
</button>
```

## 方法中的 this

在对象方法中，this 指的是此方法的“拥有者”。

在本页最上面的例子中，this 指的是 person 对象。

person 对象是 fullName 方法的拥有者。

```javascript
fullName : function() {
  return this.firstName + " " + this.lastName;
}
```



# Var Tips

#### var 定义对象的作用范围

## 全局作用域

*全局*（在函数之外）声明的变量拥有*全局作用域*。

### 全局作用

```javascript
var carName = "porsche";

// 此处的代码可以使用 carName

function myFunction() {
  // 此处的代码也可以使用 carName
}
```

## 函数作用域

*局部*（函数内）声明的变量拥有*函数作用域*。

### 实例

```javascript
// 此处的代码不可以使用 carName

function myFunction() {
  var carName = "porsche";
  // code here CAN use carName
}

// 此处的代码不可以使用 carName
```

## JavaScript 块作用域

通过 var 关键词声明的变量没有块*作用域*。

在块 *{}* 内声明的变量可以从块之外进行访问。

### 实例

```
{ 
  var x = 10; 
}
// 此处可以使用 x
```

在 ES2015 之前，JavaScript 是没有块作用域的。

可以使用 let 关键词声明拥有块作用域的变量。

在块 *{}* 内声明的变量无法从块外访问：

### 实例

```javascript
{ 
  let x = 10;
}
// 此处不
```

## JavaScript 调试

在没有调试器的情况下写 JavaScript 是有难度的。

您的代码中也许包含了语法错误，或者逻辑错误，这些都难以诊断。

通常，如果 JavaScript 代码包含错误，也不会发生任何事情。不会有错误消息，并且不会有任何可供查找错误的指示信息。

通常，每当你尝试编写新的 JavaScript 代码，就可能发生错误。

## JavaScript 调试器

查找编程代码中的错误被称为代码调试。

调试并不简单。但幸运地是，所有现代浏览器都有内置的调试器。

内置的调试器可打开或关闭，强制将错误报告给用户。

通过调试器，您也可以设置断点（代码执行被中断的位置），并在代码执行时检查变量。

通常通过 F12 键启动浏览器中的调试器，然后在调试器菜单中选择“控制台”。

## console.log() 方法

如果您的浏览器支持调试，那么您可以使用 console.log() 在调试窗口中显示 JavaScript 的值：

### 实例

```html
<!DOCTYPE html>
<html>
<body>

<h1>My First Web Page</h1>

<script>
a = 5;
b = 6;
c = a + b;
console.log(c);
</script>

</body>
</html>
```

## 请勿使用 new Object()

- 请使用 {} 来代替 new Object()
- 请使用 "" 来代替 new String()
- 请使用 0 来代替 new Number()
- 请使用 false 来代替 new Boolean()
- 请使用 [] 来代替 new Array()
- 请使用 /()/ 来代替 new RegExp()
- 请使用 function (){}来代替 new Function()

### 实例

```javascript
var x1 = {};           // 新对象
var x2 = "";           // 新的原始字符串值
var x3 = 0;            // 新的原始数值
var x4 = false;        // 新的原始布尔值
var x5 = [];           // 新的数组对象
var x6 = /()/;         // 新的正则表达式
var x7 = function(){}; // 新的函数对象
```

## JavaScript 保留词

在 JavaScript 中，您不能把这些保留词作为变量、标记或函数名来使用：

| abstract | arguments  | await*       | boolean   |
| -------- | ---------- | ------------ | --------- |
| break    | byte       | case         | catch     |
| char     | class*     | const        | continue  |
| debugger | default    | delete       | do        |
| double   | else       | enum*        | eval      |
| export*  | extends*   | false        | final     |
| finally  | float      | for          | function  |
| goto     | if         | implements   | import*   |
| in       | instanceof | int          | interface |
| let*     | long       | native       | new       |
| null     | package    | private      | protected |
| public   | return     | short        | static    |
| super*   | switch     | synchronized | this      |
| throw    | throws     | transient    | true      |
| try      | typeof     | var          | void      |
| volatile | while      | with         | yield     |

# JavaScript 表单

- [JS JSON](https://www.w3school.com.cn/js/js_json.asp)
- [JS 表单 API](https://www.w3school.com.cn/js/js_validation_api.asp)

## JavaScript 表单验证

HTML 表单验证能够通过 JavaScript 来完成。

如果某个表单字段（fname）是空的，那么该函数会发出一条警告消息，并返回 false，以防止表单被提交出去：

### JavaScript 实例

```javascript
function validateForm() {
    var x = document.forms["myForm"]["fname"].value;
    if (x == "") {
        alert("必须填写姓名");
        return false;
    }
}
```

该函数能够在表单提交时被调用：

### HTML 表单实例

```javascript
<form name="myForm" action="/action_page_post.php" onsubmit="return validateForm()" method="post">
姓名：<input type="text" name="fname">
<input type="submit" value="Submit">
</form>
```

# JavaScript 验证 API

- [JS 表单](https://www.w3school.com.cn/js/js_validation.asp)
- [JS 对象定义](https://www.w3school.com.cn/js/js_object_definition.asp)

## 约束验证 DOM 方法

| 属性                | 描述                                       |
| :------------------ | :----------------------------------------- |
| checkValidity()     | 返回 true，如果 input 元素包含有效数据     |
| setCustomValidity() | 设置 input 元素的 validationMessage 属性。 |

## checkValidity() 方法

如果输入字段包含无效的数据，显示一条消息：

```
<input id="id1" type="number" min="100" max="300" required>
<button onclick="myFunction()">OK</button>

<p id="demo"></p>

<script>
 function myFunction() {
    var inpObj = document.getElementById("id1");
    if (inpObj.checkValidity() == false) {
        document.getElementById("demo").innerHTML = inpObj.validationMessage;
    }
}
</script>
```

## 合法性属性

input 元素的 validity 属性包含了与数据合法性相关的一系列属性：

| 属性            | 描述                                                         |
| :-------------- | :----------------------------------------------------------- |
| customError     | 设置为 true，如果设置自定义的合法性消息。                    |
| patternMismatch | 设置为 true，如果元素值不匹配其 pattern 属性。               |
| rangeOverflow   | 设置为 true，如果元素值大约其 max 属性。                     |
| rangeUnderflow  | 设置为 true，如果元素值小于其 min 属性。                     |
| stepMismatch    | 当字段拥有 step 属性，且输入的 value 值不符合设定的间隔值时，该属性值为 true。 |
| tooLong         | 设置为 true，如果元素值超过了其 maxLength 属性。             |
| typeMismatch    | 当字段的 type 是 email 或者 url 但输入的值不是正确的类型时，属性值为 true。 |
| valueMissing    | 设置为 true，如果元素（包含 required）没有值。               |
| valid           | 设置为 true，如果元素值是有效的。                            |

## JavaScript 原始值

*原始值*指的是没有属性或方法的值。

*原始数据类型*指的是拥有原始值的数据。

JavaScript 定义了 5 种原始数据类型：

- string
- number
- boolean
- null
- undefined

原始值是一成不变的（它们是硬编码的，因此不能改变）。

假设 x = 3.14，您能够改变 x 的值。但是您无法改变 3.14 的值。

| 值        | 类型      | 注释                       |
| :-------- | :-------- | :------------------------- |
| "Hello"   | string    | "Hello" 始终是 "Hello"     |
| 3.14      | number    | 3.14 始终是 3.14           |
| true      | boolean   | true 始终是 true           |
| false     | boolean   | false 始终是 false         |
| null      | null      | (object) null 始终是 null  |
| undefined | undefined | undefined 始终是 undefined |

## 对象是包含变量的变量

JavaScript 变量能够包含单个的值：

### 实例

```html
var person = "Bill Gates";
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_variable_1)



对象也是变量。但是对象能够包含很多值。

值按照*名称 : 值*对的形式编写（名称和值以冒号分隔）。

### 实例

```html
var person = {firstName:"Bill", lastName:"Gates", age:62, eyeColor:"blue"};
```

## 创建 JavaScript 对象

通过 JavaScript，您能够定义和创建自己的对象。

有不同的方法来创建对象：

- 定义和创建单个对象，使用对象文字。
- 定义和创建单个对象，通过关键词 new。
- 定义对象构造器，然后创建构造类型的对象。

在 ECMAScript 5 中，也可以通过函数 Object.create() 来创建对象。

## 使用对象字面量

这是创建对象最简答的方法。

使用对象文字，您可以在一条语句中定义和创建对象。

对象文字指的是花括号 {} 中的名称:值对（比如 age:62）。

下面的例子创建带有四个属性的新的 JavaScript 对象：

### 实例

```
var person = {firstName:"Bill", lastName:"Gates", age:62, eyeColor:"blue"};
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_create_1)

空格和折行不重要。对象定义可横跨多行：

### 实例

```
var person = {
    firstName:"Bill",
    lastName:"Gates",
    age:62,
    eyeColor:"blue"
};
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_create_2)

## 使用 JavaScript 关键词 new

下面的例子也创建了带有四个属性的新的 JavaScript 对象：

### 实例

```
var person = new Object();
person.firstName = "Bill";
person.lastName = "Gates";
person.age = 50;
person.eyeColor = "blue"; 
```

## JavaScript for...in 循环

JavaScript for...in 语句遍历对象的属性。

### 语法

```javascript
for (variable in object) {
    要执行的代码
}
```

for...in 循环中的代码块会为每个属性执行一次。

循环对象的属性：

### 实例

```javascript
var person = {fname:"Bill", lname:"Gates", age:62}; 

for (x in person) {
    txt += person[x];
}
```

# JavaScript 对象方法

- [JS 对象属性](https://www.w3school.com.cn/js/js_object_properties.asp)
- [JS 对象访问器](https://www.w3school.com.cn/js/js_object_accessors.asp)

## 实例

```
var person = {
  firstName: "Bill",
  lastName : "Gates",
  id       : 648,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_this)

## JavaScript 方法

JavaScript 方法是能够在对象上执行的动作。

JavaScript *方法*是包含*函数定义*的属性。

| 属性      | 值                                                        |
| :-------- | :-------------------------------------------------------- |
| firstName | Bill                                                      |
| lastName  | Gates                                                     |
| age       | 62                                                        |
| eyeColor  | blue                                                      |
| fullName  | function() {return this.firstName + " " + this.lastName;} |

方法是存储为对象属性的函数。

## *this* 关键词

在 JavaScript 中，被称为 this 的事物，指的是拥有该 JavaScript 代码的对象。

this 的值，在函数中使用时，是“拥有”该函数的对象。

请注意 this 并非变量。它是关键词。您无法改变 this 的值。

## 访问对象方法

请使用如下语法创建对象方法：

```
methodName : function() { 代码行 }
```

请通过如下语法来访问对象方法：

```
objectName.methodName()
```

您通常会把 fullName() 描述为 person 对象的方法，把 fullName 描述为属性。

fullName 属性在被通过 () 调用后会以函数形式执行。

此例访问 person 对象的 fullName() *方法*：

### 实例

```
name = person.fullName();
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_method)

如果您访问 fullName *属性*时没有使用 ()，则将返回*函数定义*：

### 实例

```
name = person.fullName;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_function)

## 使用内建方法

此例使用 String 对象的 toUpperCase() 方法，把文本转换为大写：

```
var message = "Hello world!";
var x = message.toUpperCase();
```

x 的值，在以上代码执行后将是：

```
HELLO WORLD!
```

## 添加新的方法

向对象添加方法是在构造器函数内部完成的：

### 实例

```
function person(firstName, lastName, age, eyeColor) {
    this.firstName = firstName;  
    this.lastName = lastName;
    this.age = age;
    this.eyeColor = eyeColor;
    this.changeName = function (name) {
        this.lastName = name;
    };
}
```

changeName() 函数 name 的值赋给了 person 的 lastName 属性。

现在您可以尝试：

```
myMother.changeName("Jobs");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_method_add)

通过用 myMother “替代” this，JavaScript 清楚您指的是哪个 person。

# JavaScript 对象方法

- [JS 对象属性](https://www.w3school.com.cn/js/js_object_properties.asp)
- [JS 对象访问器](https://www.w3school.com.cn/js/js_object_accessors.asp)

## 实例

```
var person = {
  firstName: "Bill",
  lastName : "Gates",
  id       : 648,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_this)

## JavaScript 方法

JavaScript 方法是能够在对象上执行的动作。

JavaScript *方法*是包含*函数定义*的属性。

| 属性      | 值                                                        |
| :-------- | :-------------------------------------------------------- |
| firstName | Bill                                                      |
| lastName  | Gates                                                     |
| age       | 62                                                        |
| eyeColor  | blue                                                      |
| fullName  | function() {return this.firstName + " " + this.lastName;} |

方法是存储为对象属性的函数。

## *this* 关键词

在 JavaScript 中，被称为 this 的事物，指的是拥有该 JavaScript 代码的对象。

this 的值，在函数中使用时，是“拥有”该函数的对象。

请注意 this 并非变量。它是关键词。您无法改变 this 的值。

## 访问对象方法

请使用如下语法创建对象方法：

```
methodName : function() { 代码行 }
```

请通过如下语法来访问对象方法：

```
objectName.methodName()
```

您通常会把 fullName() 描述为 person 对象的方法，把 fullName 描述为属性。

fullName 属性在被通过 () 调用后会以函数形式执行。

此例访问 person 对象的 fullName() *方法*：

### 实例

```
name = person.fullName();
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_method)

如果您访问 fullName *属性*时没有使用 ()，则将返回*函数定义*：

### 实例

```
name = person.fullName;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_function)

## 使用内建方法

此例使用 String 对象的 toUpperCase() 方法，把文本转换为大写：

```
var message = "Hello world!";
var x = message.toUpperCase();
```

x 的值，在以上代码执行后将是：

```
HELLO WORLD!
```

## 添加新的方法

向对象添加方法是在构造器函数内部完成的：

### 实例

```
function person(firstName, lastName, age, eyeColor) {
    this.firstName = firstName;  
    this.lastName = lastName;
    this.age = age;
    this.eyeColor = eyeColor;
    this.changeName = function (name) {
        this.lastName = name;
    };
}
```

changeName() 函数 name 的值赋给了 person 的 lastName 属性。

现在您可以尝试：

```
myMother.changeName("Jobs");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_method_add)

通过用 myMother “替代” this，JavaScript 清楚您指的是哪个 person。

# JavaScript 对象方法

- [JS 对象属性](https://www.w3school.com.cn/js/js_object_properties.asp)
- [JS 对象访问器](https://www.w3school.com.cn/js/js_object_accessors.asp)

## 实例

```
var person = {
  firstName: "Bill",
  lastName : "Gates",
  id       : 648,
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_this)

## JavaScript 方法

JavaScript 方法是能够在对象上执行的动作。

JavaScript *方法*是包含*函数定义*的属性。

| 属性      | 值                                                        |
| :-------- | :-------------------------------------------------------- |
| firstName | Bill                                                      |
| lastName  | Gates                                                     |
| age       | 62                                                        |
| eyeColor  | blue                                                      |
| fullName  | function() {return this.firstName + " " + this.lastName;} |

方法是存储为对象属性的函数。

## *this* 关键词

在 JavaScript 中，被称为 this 的事物，指的是拥有该 JavaScript 代码的对象。

this 的值，在函数中使用时，是“拥有”该函数的对象。

请注意 this 并非变量。它是关键词。您无法改变 this 的值。

## 访问对象方法

请使用如下语法创建对象方法：

```
methodName : function() { 代码行 }
```

请通过如下语法来访问对象方法：

```
objectName.methodName()
```

您通常会把 fullName() 描述为 person 对象的方法，把 fullName 描述为属性。

fullName 属性在被通过 () 调用后会以函数形式执行。

此例访问 person 对象的 fullName() *方法*：

### 实例

```
name = person.fullName();
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_method)

如果您访问 fullName *属性*时没有使用 ()，则将返回*函数定义*：

### 实例

```
name = person.fullName;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_function)

## 使用内建方法

此例使用 String 对象的 toUpperCase() 方法，把文本转换为大写：

```
var message = "Hello world!";
var x = message.toUpperCase();
```

x 的值，在以上代码执行后将是：

```
HELLO WORLD!
```

## 添加新的方法

向对象添加方法是在构造器函数内部完成的：

### 实例

```
function person(firstName, lastName, age, eyeColor) {
    this.firstName = firstName;  
    this.lastName = lastName;
    this.age = age;
    this.eyeColor = eyeColor;
    this.changeName = function (name) {
        this.lastName = name;
    };
}
```

changeName() 函数 name 的值赋给了 person 的 lastName 属性。

现在您可以尝试：

```
myMother.changeName("Jobs");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_method_add)

通过用 myMother “替代” this，JavaScript 清楚您指的是哪个 person。

# JavaScript 对象访问器

- [JS 对象方法](https://www.w3school.com.cn/js/js_object_methods.asp)
- [JS 对象构造器](https://www.w3school.com.cn/js/js_object_constructors.asp)

## JavaScript 访问器（Getter 和 Setter）

ECMAScript 5 (2009) 引入了 Getter 和 Setter。

Getter 和 Setter 允许您定义对象访问器（被计算的属性）。

## JavaScript Getter（get 关键词）

本例使用 lang 属性来获取 language 属性的值。

### 实例

```
// 创建对象：
var person = {
  firstName: "Bill",
  lastName : "Gates",
  language : "en",
  get lang() {
    return this.language;
  }
};

// 使用 getter 来显示来自对象的数据：
document.getElementById("demo").innerHTML = person.lang;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_accessors_get_1)

## JavaScript Setter（set 关键词）

本例使用 lang 属性来设置 language 属性的值。

### 实例

```
var person = {
  firstName: "Bill",
  lastName : "Gates",
  language : "",
  set lang(lang) {
    this.language = lang;
  }
};

// 使用 setter 来设置对象属性：
person.lang = "en";

// 显示来自对象的数据：
document.getElementById("demo").innerHTML = person.language;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_accessors_set_1)

## JavaScript 函数还是 Getter？

下面两个例子的区别在哪里？

### 例子 1

```
var person = {
  firstName: "Bill",
  lastName : "Gates",
  fullName : function() {
    return this.firstName + " " + this.lastName;
  }
};

// 使用方法来显示来自对象的数据：
document.getElementById("demo").innerHTML = person.fullName();
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_accessors_method)

### 例子 2

```
var person = {
  firstName: "Bill",
  lastName : "Gates",
  get fullName() {
    return this.firstName + " " + this.lastName;
  }
};

// 使用 getter 来显示来自对象的数据：
document.getElementById("demo").innerHTML = person.fullName;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_accessors_method_get)

例子 1 以函数形式访问 fullName：person.fullName()。

例子 2 以属性形式访问 fullName：person.fullName。

第二个例子提供了更简洁的语法。

## 数据质量

使用 getter 和 setter 时，JavaScript 可以确保更好的数据质量。

在本例中，使用 lang 属性以大写形式返回 language 属性的值：

### 实例

```
// Create an object:
var person = {
  firstName: "Bill",
  lastName : "Gates",
  language : "en",
  get lang() {
    return this.language.toUpperCase();
  }
};

// 使用 getter 来显示来自对象的数据：
document.getElementById("demo").innerHTML = person.lang;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_accessors_get_2)

在本例中，使用 lang 属性将大写值存储在 language 属性中：

### 实例

```
var person = {
  firstName: "Bill",
  lastName : "Gates",
  language : "",
  set lang(lang) {
    this.language = lang.toUpperCase();
  }
};

// 使用 getter 来设置对象属性：
person.lang = "en";

// 显示来自对象的数据：
document.getElementById("demo").innerHTML = person.language;
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_accessors_set_2)

## 为什么使用 Getter 和 Setter？

- 它提供了更简洁的语法
- 它允许属性和方法的语法相同
- 它可以确保更好的数据质量
- 有利于后台工作

## 一个计数器实例

### 实例

```javascript
var obj = {
  counter : 0,
  get reset() {
    this.counter = 0;
  },
  get increment() {
    this.counter++;
  },
  get decrement() {
    this.counter--;
  },
  set add(value) {
    this.counter += value;
  },
  set subtract(value) {
    this.counter -= value;
  }
};

// 操作计数器：
obj.reset;
obj.add = 5;
obj.subtract = 1;
obj.increment;
obj.decrement;
Object.defineProperty()
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_accessors_set_3)

Object.defineProperty() 方法也可用于添加 Getter 和 Setter：

### 实例

```javascript
// 定义对象
var obj = {counter : 0};

// 定义 setters
Object.defineProperty(obj, "reset", {
  get : function () {this.counter = 0;}
});
Object.defineProperty(obj, "increment", {
  get : function () {this.counter++;}
});
Object.defineProperty(obj, "decrement", {
  get : function () {this.counter--;}
});
Object.defineProperty(obj, "add", {
  set : function (value) {this.counter += value;}
});
Object.defineProperty(obj, "subtract", {
  set : function (value) {this.counter -= value;}
});

// 操作计数器：
obj.reset;
obj.add = 5;
obj.subtract = 1;
obj.increment;
obj.decrement;
```

# JavaScript 对象构造器

- [JS 对象访问器](https://www.w3school.com.cn/js/js_object_accessors.asp)
- [JS 对象原型](https://www.w3school.com.cn/js/js_object_prototypes.asp)

## 实例

```
function Person(first, last, age, eye) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eye;
}
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_1)

用大写首字母对构造器函数命名是个好习惯。

## 对象类型（蓝图）（类）

前一章的实例是有限制的。它们只创建单一对象。

有时我们需要创建相同“类型”的许多对象的“*蓝图*”。

创建一种“对象类型”的方法，是使用*对象构造器函数*。

在上面的例子中，*函数 Person()* 就是对象构造器函数。

通过 *new* 关键词调用构造器函数可以创建相同类型的对象：

```
var myFather = new Person("Bill", "Gates", 62, "blue");
var myMother = new Person("Steve", "Jobs", 56, "green");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_2)

## *this* 关键词

在 JavaScript 中，被称为 this 的事物是代码的“拥有者”。

this 的值，在对象中使用时，就是对象本身。

在构造器函数中，this 是没有值的。它是新对象的替代物。 当一个新对象被创建时，this 的值会成为这个新对象。

请注意 this 并不是变量。它是关键词。您无法改变 this 的值。

## 为对象添加属性

为已有的对象添加新属性很简单：

### 实例

```
myFather.nationality = "English";
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_3)

新属性被添加到 myFather。不是 myMother，也不是任何其他 person 对象。

## 为对象添加方法

为已有的对象添加新方法很简单：

### 实例

```
myFather.name = function () {
    return this.firstName + " " + this.lastName;
};
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_4)

新方法被添加到 myFather。不是 myMother，也不是任何其他 person 对象。

## 为构造器添加属性

与向已有对象添加新属性不同，您无法为对象构造器添加新属性：

### 实例

```
Person.nationality = "English";
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_5)

如需向构造器添加一个新属性，您必须添加到构造器函数：

### 实例

```
function Person(first, last, age, eyecolor) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eyecolor;
    this.nationality = "English";
}
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_6)

这样对象属性就可以拥有默认值。

## 为构造器添加方法

您的构造器函数也可以定义方法：

### 实例

```
function Person(first, last, age, eyecolor) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eyecolor;
    this.name = function() {return this.firstName + " " + this.lastName;};
}
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_7)

与向已有对象添加新方法不同，您无法为对象构造器添加新方法。

必须在构造器函数内部向一个对象添加方法：

### 实例

```
function Person(firstName, lastName, age, eyeColor) {
    this.firstName = firstName;  
    this.lastName = lastName;
    this.age = age;
    this.eyeColor = eyeColor;
    this.changeName = function (name) {
        this.lastName = name;
    };
}
```

changeName() 函数把 name 赋值给 person 的 lastName 属性。

现在您可以试一试：

```
myMother.changeName("Jobs");
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_8)

通过用 myMother 替代 *this*，JavaScript 可以获知目前处理的哪个 person。

## 内建 JavaScript 构造器

JavaScript 提供用于原始对象的构造器：

### 实例

```
var x1 = new Object();    // 一个新的 Object 对象
var x2 = new String();    // 一个新的 String 对象
var x3 = new Number();    // 一个新的 Number 对象
var x4 = new Boolean();   // 一个新的 Boolean 对象
var x5 = new Array();     // 一个新的 Array 对象
var x6 = new RegExp();    // 一个新的 RegExp 对象
var x7 = new Function();  // 一个新的 Function 对象
var x8 = new Date();      // 一个新的 Date 对象
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_builtin_1)

Math() 对象不再此列。Math 是全局对象。new 关键词不可用于 Math。

## 您知道吗？

正如以上所见，JavaScript 提供原始数据类型字符串、数字和布尔的对象版本。但是并无理由创建复杂的对象。原始值快得多！

请使用对象字面量 {} 代替 new Object()。

请使用字符串字面量 "" 代替 new String()。

请使用数值字面量代替 Number()。

请使用布尔字面量代替 new Boolean()。

请使用数组字面量 [] 代替 new Array()。

请使用模式字面量代替 new RexExp()。

请使用函数表达式 () {} 代替 new Function()。

### 实例

```
var x1 = {};            // 新对象
var x2 = "";            // 新的原始字符串
var x3 = 0;             // 新的原始数值
var x4 = false;         // 新的原始逻辑值
var x5 = [];            // 新的数组对象
var x6 = /()/           // 新的正则表达式对象
var x7 = function(){};  // 新的函数对象
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_object_constructor_builtin_2)

## 字符串对象

通常，字符串被创建为原始值：var firstName = "John"

但是也可以使用 new 关键词创建字符串对象：var firstName = new String("John")

请在 [JS 字符串](https://www.w3school.com.cn/js/js_strings.asp)这一章中学习为何不应该把字符串创建为对象。

## 数字对象

通常，数值被创建为原始值：var x = 456

但是也可以使用 new 关键词创建数字对象：var x = new Number(456)

请在 [JS 数字](https://www.w3school.com.cn/js/js_numbers.asp)这一章中学习为何不应该把数值创建为对象。

## 布尔对象

通常，逻辑值被创建为原始值：var x = false

但是也可以使用 new 关键词创建逻辑对象：var x = new Boolean(false)

请在 [JS 逻辑](https://www.w3school.com.cn/js/js_booleans.asp)这一章中学习为何不应该把逻辑值创建为对象。

# JavaScript 函数参数

- [JS 函数定义](https://www.w3school.com.cn/js/js_function_definition.asp)
- [JS 函数调用](https://www.w3school.com.cn/js/js_function_invocation.asp)

**JavaScript 函数不会对参数值进行任何检查。**

## 函数参数

在本教程中稍早的时间，您已经学到了函数可以拥有*参数*：

```
functionName(parameter1, parameter2, parameter3) {
    要执行的代码
}
```

*函数参数（parameter）*指的是在函数定义中列出的*名称*。

*函数参数（argument）*指的是传递到函数或由函数接收到的真实*值*。

## 参数规则

JavaScript 函数定义不会为参数（parameter）规定数据类型。

JavaScript 函数不会对所传递的参数（argument）实行类型检查。

JavaScript 函数不会检查所接收参数（argument）的数量。

## 参数默认

如果调用参数时*省略了参数*（少于被声明的数量），则丢失的值被设置为：*undefined*。

有时这是可以接受的，但是有时最好给参数指定默认值：

### 实例

```
function myFunction(x, y) {
    if (y === undefined) {
          y = 0;
    } 
}
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_function_parameter_default)

如果函数调用的*参数太多*（超过声明），则可以使用 *arguments 对象*来达到这些参数。

If a function is called with too many arguments (more than declared), these arguments can be reached using the arguments object.

## arguments 对象

JavaScript 函数有一个名为 arguments 对象的内置对象。

arguments 对象包含函数调用时使用的参数数组。

这样，您就可以简单地使用函数来查找（例如）数字列表中的最高值：

### 实例

```
x = findMax(1, 123, 500, 115, 44, 88);

function findMax() {
    var i;
    var max = -Infinity;
    for (i = 0; i < arguments.length; i++) {
        if (arguments[i] > max) {
            max = arguments[i];
        }
    }
    return max;
}
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_function_arguments)

或创建一个函数来总和所有输入值：

### 实例

```
x = sumAll(1, 123, 500, 115, 44, 88);

function sumAll() {
    var i, sum = 0;
    for (i = 0; i < arguments.length; i++) {
        sum += arguments[i];
    }
    return sum;
}
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_function_arguments_sum)

## 参数通过值传递

函数调用中的参数（parameter）是函数的参数（argument）。

JavaScript 参数通过*值*传递：函数只知道值，而不是参数的位置。

如果函数改变了参数的值，它不会改变参数的原始值。

参数的改变在函数之外是不可见的。

## 对象是由引用传递的

在 JavaScript 中，对象引用是值。

正因如此，对象的行为就像它们通过*引用*来传递：

如果函数改变了对象属性，它也改变了原始值。

对象属性的改变在函数之外是可见的。

## arguments 对象

JavaScript 函数有一个名为 arguments 对象的内置对象。

arguments 对象包含函数调用时使用的参数数组。

这样，您就可以简单地使用函数来查找（例如）数字列表中的最高值：

### 实例

```javascript
x = findMax(1, 123, 500, 115, 44, 88);

function findMax() {
    var i;
    var max = -Infinity;
    for (i = 0; i < arguments.length; i++) {
        if (arguments[i] > max) {
            max = arguments[i];
        }
    }
    return max;
}
```



## HTML DOM（文档对象模型）

当网页被加载时，浏览器会创建页面的文档对象模型（*D*ocument *O*bject *M*odel）。

*HTML DOM* 模型被结构化为*对象树*：

### 对象的 HTML DOM 树

![DOM HTML 树](https://www.w3school.com.cn/i/ct_htmltree.gif)

- JavaScript 能改变页面中的所有 HTML 元素
- JavaScript 能改变页面中的所有 HTML 属性
- JavaScript 能改变页面中的所有 CSS 样式
- JavaScript 能删除已有的 HTML 元素和属性
- JavaScript 能添加新的 HTML 元素和属性
- JavaScript 能对页面中所有已有的 HTML 事件作出反应
- JavaScript 能在页面中创建新的 HTML 事件

## 什么是 DOM？

DOM 是一项 W3C (World Wide Web Consortium) 标准。

DOM 定义了访问文档的标准：

> “W3C 文档对象模型（DOM）是中立于平台和语言的接口，它允许程序和脚本动态地访问、更新文档的内容、结构和样式。”

W3C DOM 标准被分为 3 个不同的部分：

- Core DOM - 所有文档类型的标准模型
- XML DOM - XML 文档的标准模型
- HTML DOM - HTML 文档的标准模型

## 什么是 HTML DOM？

HTML DOM 是 HTML 的标准*对象*模型和*编程接口*。它定义了：

- 作为*对象*的 HTML 元素
- 所有 HTML 元素的*属性*
- 访问所有 HTML 元素的*方法*
- 所有 HTML 元素的*事件*

**换言之：HTML DOM 是关于如何获取、更改、添加或删除 HTML 元素的标准**。

# JavaScript - HTML DOM 方法

- [DOM 简介](https://www.w3school.com.cn/js/js_htmldom.asp)
- [DOM 文档](https://www.w3school.com.cn/js/js_htmldom_document.asp)

**HTML DOM 方法是您能够（在 HTML 元素上）执行的动作。**

**HTML DOM 属性是您能够设置或改变的 HTML 元素的值。**

## DOM 编程界面

HTML DOM 能够通过 JavaScript 进行访问（也可以通过其他编程语言）。

在 DOM 中，所有 HTML 元素都被定义为*对象*。

编程界面是每个对象的属性和方法。

*属性*是您能够获取或设置的值（就比如改变 HTML 元素的内容）。

*方法*是您能够完成的动作（比如添加或删除 HTML 元素）。

## 实例

下面的例子改变了 id="demo" 的 <p> 元素的内容：

```
<html>
<body>

<p id="demo"></p>

<script>
document.getElementById("demo").innerHTML = "Hello World!";
</script>

</body>
</html>
```

[亲自试一试](https://www.w3school.com.cn/tiy/t.asp?f=js_dom_method)

在上面的例子中，getElementById 是*方法*，而 innerHTML 是*属性*。

## getElementById 方法

访问 HTML 元素最常用的方法是使用元素的 id。

在上面的例子中，getElementById 方法使用 id="demo" 来查找元素。

## innerHTML 属性

获取元素内容最简单的方法是使用 innerHTML 属性。

innerHTML 属性可用于获取或替换 HTML 元素的内容。

innerHTML 属性可用于获取或改变任何 HTML 元素，包括 <html> 和 <body>。

# JavaScript HTML DOM 文档

- [DOM 方法](https://www.w3school.com.cn/js/js_htmldom_methods.asp)
- [DOM 元素](https://www.w3school.com.cn/js/js_htmldom_elements.asp)

**HTML DOM 文档对象是您的网页中所有其他对象的拥有者。**

## HTML DOM Document 对象

文档对象代表您的网页。

如果您希望访问 HTML 页面中的任何元素，那么您总是从访问 document 对象开始。

下面是一些如何使用 document 对象来访问和操作 HTML 的实例。

## 查找 HTML 元素

| 方法                                    | 描述                   |
| :-------------------------------------- | :--------------------- |
| document.getElementById(*id*)           | 通过元素 id 来查找元素 |
| document.getElementsByTagName(*name*)   | 通过标签名来查找元素   |
| document.getElementsByClassName(*name*) | 通过类名来查找元素     |

## 改变 HTML 元素

| 方法                                       | 描述                   |
| :----------------------------------------- | :--------------------- |
| element.innerHTML = *new html content*     | 改变元素的 inner HTML  |
| element.attribute = *new value*            | 改变 HTML 元素的属性值 |
| element.setAttribute(*attribute*, *value*) | 改变 HTML 元素的属性值 |
| element.style.property = *new style*       | 改变 HTML 元素的样式   |

## 添加和删除元素

| 方法                              | 描述             |
| :-------------------------------- | :--------------- |
| document.createElement(*element*) | 创建 HTML 元素   |
| document.removeChild(*element*)   | 删除 HTML 元素   |
| document.appendChild(*element*)   | 添加 HTML 元素   |
| document.replaceChild(*element*)  | 替换 HTML 元素   |
| document.write(*text*)            | 写入 HTML 输出流 |

## 添加事件处理程序

| 方法                                                     | 描述                            |
| :------------------------------------------------------- | :------------------------------ |
| document.getElementById(id).onclick = function(){*code*} | 向 onclick 事件添加事件处理程序 |

## 查找 HTML 对象

首个 HTML DOM Level 1 (1998)，定义了 11 个 HTML 对象、对象集合和属性。它们在 HTML5 中仍然有效。

后来，在 HTML DOM Level 3，加入了更多对象、集合和属性。

| 属性                         | 描述                                        | DOM  |
| :--------------------------- | :------------------------------------------ | :--- |
| document.anchors             | 返回拥有 name 属性的所有 <a> 元素。         | 1    |
| document.applets             | 返回所有 <applet> 元素（HTML5 不建议使用）  | 1    |
| document.baseURI             | 返回文档的绝对基准 URI                      | 3    |
| document.body                | 返回 <body> 元素                            | 1    |
| document.cookie              | 返回文档的 cookie                           | 1    |
| document.doctype             | 返回文档的 doctype                          | 3    |
| document.documentElement     | 返回 <html> 元素                            | 3    |
| document.documentMode        | 返回浏览器使用的模式                        | 3    |
| document.documentURI         | 返回文档的 URI                              | 3    |
| document.domain              | 返回文档服务器的域名                        | 1    |
| document.domConfig           | 废弃。返回 DOM 配置                         | 3    |
| document.embeds              | 返回所有 <embed> 元素                       | 3    |
| document.forms               | 返回所有 <form> 元素                        | 1    |
| document.head                | 返回 <head> 元素                            | 3    |
| document.images              | 返回所有 <img> 元素                         | 1    |
| document.implementation      | 返回 DOM 实现                               | 3    |
| document.inputEncoding       | 返回文档的编码（字符集）                    | 3    |
| document.lastModified        | 返回文档更新的日期和时间                    | 3    |
| document.links               | 返回拥有 href 属性的所有 <area> 和 <a> 元素 | 1    |
| document.readyState          | 返回文档的（加载）状态                      | 3    |
| document.referrer            | 返回引用的 URI（链接文档）                  | 1    |
| document.scripts             | 返回所有 <script> 元素                      | 3    |
| document.strictErrorChecking | 返回是否强制执行错误检查                    | 3    |
| document.title               | 返回 <title> 元素                           | 1    |
| document.URL                 | 返回文档的完整 URL                          | 1    |

## 创建动画容器

所有动画都应该与容器元素关联。

### 实例

```
<div id ="container">
    <div id ="animate">我的动画在这里。</div>
</div>
```

## 为元素添加样式

应该通过 style = "position: relative" 创建容器元素。

应该通过 style = "position: absolute" 创建动画元素。

### 实例

```
#container {
    width: 400px;
    height: 400px;
    position: relative;
    background: yellow;
}
#animate {
    width: 50px;
    height: 50px;
    position: absolute;
    background: red;
} 
```

## 事件句柄　(Event Handlers)

HTML 4.0 的新特性之一是能够使 HTML 事件触发浏览器中的行为，比如当用户点击某个 HTML 元素时启动一段 JavaScript。下面是一个属性列表，可将之插入 HTML 标签以定义事件的行为。

| 属性                                                         | 此事件发生在何时...                  |
| :----------------------------------------------------------- | :----------------------------------- |
| [onabort](https://www.w3school.com.cn/jsref/event_onabort.asp) | 图像的加载被中断。                   |
| [onblur](https://www.w3school.com.cn/jsref/event_onblur.asp) | 元素失去焦点。                       |
| [onchange](https://www.w3school.com.cn/jsref/event_onchange.asp) | 域的内容被改变。                     |
| [onclick](https://www.w3school.com.cn/jsref/event_onclick.asp) | 当用户点击某个对象时调用的事件句柄。 |
| [ondblclick](https://www.w3school.com.cn/jsref/event_ondblclick.asp) | 当用户双击某个对象时调用的事件句柄。 |
| [onerror](https://www.w3school.com.cn/jsref/event_onerror.asp) | 在加载文档或图像时发生错误。         |
| [onfocus](https://www.w3school.com.cn/jsref/event_onfocus.asp) | 元素获得焦点。                       |
| [onkeydown](https://www.w3school.com.cn/jsref/event_onkeydown.asp) | 某个键盘按键被按下。                 |
| [onkeypress](https://www.w3school.com.cn/jsref/event_onkeypress.asp) | 某个键盘按键被按下并松开。           |
| [onkeyup](https://www.w3school.com.cn/jsref/event_onkeyup.asp) | 某个键盘按键被松开。                 |
| [onload](https://www.w3school.com.cn/jsref/event_onload.asp) | 一张页面或一幅图像完成加载。         |
| [onmousedown](https://www.w3school.com.cn/jsref/event_onmousedown.asp) | 鼠标按钮被按下。                     |
| [onmousemove](https://www.w3school.com.cn/jsref/event_onmousemove.asp) | 鼠标被移动。                         |
| [onmouseout](https://www.w3school.com.cn/jsref/event_onmouseout.asp) | 鼠标从某元素移开。                   |
| [onmouseover](https://www.w3school.com.cn/jsref/event_onmouseover.asp) | 鼠标移到某元素之上。                 |
| [onmouseup](https://www.w3school.com.cn/jsref/event_onmouseup.asp) | 鼠标按键被松开。                     |
| [onreset](https://www.w3school.com.cn/jsref/event_onreset.asp) | 重置按钮被点击。                     |
| [onresize](https://www.w3school.com.cn/jsref/event_onresize.asp) | 窗口或框架被重新调整大小。           |
| [onselect](https://www.w3school.com.cn/jsref/event_onselect.asp) | 文本被选中。                         |
| [onsubmit](https://www.w3school.com.cn/jsref/event_onsubmit.asp) | 确认按钮被点击。                     |
| [onunload](https://www.w3school.com.cn/jsref/event_onunload.asp) | 用户退出页面。                       |

## 鼠标 / 键盘属性

| 属性                                                         | 描述                                         |
| :----------------------------------------------------------- | :------------------------------------------- |
| [altKey](https://www.w3school.com.cn/jsref/event_altkey.asp) | 返回当事件被触发时，"ALT" 是否被按下。       |
| [button](https://www.w3school.com.cn/jsref/event_button.asp) | 返回当事件被触发时，哪个鼠标按钮被点击。     |
| [clientX](https://www.w3school.com.cn/jsref/event_clientx.asp) | 返回当事件被触发时，鼠标指针的水平坐标。     |
| [clientY](https://www.w3school.com.cn/jsref/event_clienty.asp) | 返回当事件被触发时，鼠标指针的垂直坐标。     |
| [ctrlKey](https://www.w3school.com.cn/jsref/event_ctrlkey.asp) | 返回当事件被触发时，"CTRL" 键是否被按下。    |
| [metaKey](https://www.w3school.com.cn/jsref/event_metakey.asp) | 返回当事件被触发时，"meta" 键是否被按下。    |
| [relatedTarget](https://www.w3school.com.cn/jsref/event_relatedtarget.asp) | 返回与事件的目标节点相关的节点。             |
| [screenX](https://www.w3school.com.cn/jsref/event_screenx.asp) | 返回当某个事件被触发时，鼠标指针的水平坐标。 |
| [screenY](https://www.w3school.com.cn/jsref/event_screeny.asp) | 返回当某个事件被触发时，鼠标指针的垂直坐标。 |
| [shiftKey](https://www.w3school.com.cn/jsref/event_shiftkey.asp) | 返回当事件被触发时，"SHIFT" 键是否被按下。   |

## IE 属性

除了上面的鼠标/事件属性，IE 浏览器还支持下面的属性：

| 属性            | 描述                                                         |
| :-------------- | :----------------------------------------------------------- |
| cancelBubble    | 如果事件句柄想阻止事件传播到包容对象，必须把该属性设为 true。 |
| fromElement     | 对于 mouseover 和 mouseout 事件，fromElement 引用移出鼠标的元素。 |
| keyCode         | 对于 keypress 事件，该属性声明了被敲击的键生成的 Unicode 字符码。对于 keydown 和 keyup 事件，它指定了被敲击的键的虚拟键盘码。虚拟键盘码可能和使用的键盘的布局相关。 |
| offsetX,offsetY | 发生事件的地点在事件源元素的坐标系统中的 x 坐标和 y 坐标。   |
| returnValue     | 如果设置了该属性，它的值比事件句柄的返回值优先级高。把这个属性设置为 fasle，可以取消发生事件的源元素的默认动作。 |
| srcElement      | 对于生成事件的 Window 对象、Document 对象或 Element 对象的引用。 |
| toElement       | 对于 mouseover 和 mouseout 事件，该属性引用移入鼠标的元素。  |
| x,y             | 事件发生的位置的 x 坐标和 y 坐标，它们相对于用CSS动态定位的最内层包容元素。 |

## 标准 Event 属性

下面列出了 2 级 DOM 事件标准定义的属性。

| 属性                                                         | 描述                                           |
| :----------------------------------------------------------- | :--------------------------------------------- |
| [bubbles](https://www.w3school.com.cn/jsref/event_bubbles.asp) | 返回布尔值，指示事件是否是起泡事件类型。       |
| [cancelable](https://www.w3school.com.cn/jsref/event_cancelable.asp) | 返回布尔值，指示事件是否可拥可取消的默认动作。 |
| [currentTarget](https://www.w3school.com.cn/jsref/event_currenttarget.asp) | 返回其事件监听器触发该事件的元素。             |
| [eventPhase](https://www.w3school.com.cn/jsref/event_eventphase.asp) | 返回事件传播的当前阶段。                       |
| [target](https://www.w3school.com.cn/jsref/event_target.asp) | 返回触发此事件的元素（事件的目标节点）。       |
| [timeStamp](https://www.w3school.com.cn/jsref/event_timestamp.asp) | 返回事件生成的日期和时间。                     |
| [type](https://www.w3school.com.cn/jsref/event_type.asp)     | 返回当前 Event 对象表示的事件的名称。          |

## 标准 Event 方法

下面列出了 2 级 DOM 事件标准定义的方法。IE 的事件模型不支持这些方法：

| 方法                                                         | 描述                                     |
| :----------------------------------------------------------- | :--------------------------------------- |
| [initEvent()](https://www.w3school.com.cn/jsref/event_initevent.asp) | 初始化新创建的 Event 对象的属性。        |
| [preventDefault()](https://www.w3school.com.cn/jsref/event_preventdefault.asp) | 通知浏览器不要执行与事件关联的默认动作。 |
| [stopPropagation()](https://www.w3school.com.cn/jsref/event_stoppropagation.asp) | 不再派发事件。                           |