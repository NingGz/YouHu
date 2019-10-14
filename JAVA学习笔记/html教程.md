# html教程

#### html概念

HTML 是用来描述网页的一种语言。

- HTML 指的是超文本标记语言 (**H**yper **T**ext **M**arkup **L**anguage)
- HTML 不是一种编程语言，而是一种*标记语言* (markup language)
- 标记语言是一套*标记标签* (markup tag)
- HTML 使用*标记标签*来描述网页

#### html标签

HTML 标记标签通常被称为 HTML 标签 (HTML tag)。

- HTML 标签是由*尖括号*包围的关键词，比如 <html>
- HTML 标签通常是*成对出现*的，比如 <b> 和 </b>
- 标签对中的第一个标签是*开始标签*，第二个标签是*结束标签*
- 开始和结束标签也被称为*开放标签*和*闭合标签*

## HTML 文档 = 网页

- HTML 文档*描述网页*
- HTML 文档*包含 HTML 标签*和纯文本
- HTML 文档也被称为*网页*

## HTML 标题

HTML 标题（Heading）是通过 <h1> - <h6> 等标签进行定义的。

```html
<h1>最大的标题</h1>
<h3>h3大小的标题</h3>
<h6>h6大小的标题</h6>
<h2>以上的标题大小按照1~6的顺序依次减小<h2>
```

## HTML 段落

HTML 段落是通过 <p> 标签进行定义的。

```
<p>段落标签</p>
```

## HTML 链接

HTML 链接是通过 <a> 标签进行定义的。href 后添加具体的链接地址

```html
<a href = "http://www.baidu.com">此处为超链接提示文字</a>
```

## HTML 链接 - target 属性

使用 Target 属性，你可以定义被链接的文档在何处显示。

下面的这行会在新窗口打开文档：

```html
<a href="http://www.w3school.com.cn/" target="_blank">Visit W3School!</a>
<!-- 在图片无法加载出来的时候显示-->
```

## HTML 图像

HTML 图像是通过 <img> 标签进行定义的。 src 后加图片位置 ,width为图片宽度，height为图片高度 

```html
<img src="picname.jpg" width="100px" height="200px"  />
```

## HTML 元素

HTML 元素指的是从开始标签（start tag）到结束标签（end tag）的所有代码。

| 开始标签                | 元素内容             | 结束标签 |
| :---------------------- | :------------------- | :------- |
| <p>                     | This is a paragraph  | </p>     |
| <a href="default.htm" > | This is a link       | </a>     |
| <br/>                   | br标签为换行，无结束 |          |

**注释：**开始标签常被称为开放标签（opening tag），结束标签常称为闭合标签（closing tag）。



## HTML 元素语法

- HTML 元素以*开始标签*起始
- HTML 元素以*结束标签*终止
- *元素的内容*是开始标签与结束标签之间的内容
- 某些 HTML 元素具有*空内容（empty content）*
- 空元素*在开始标签中进行关闭*（以开始标签的结束而结束）
- 大多数 HTML 元素可拥有*属性*

## HTML 元素

#### body 元素，为html文档的主体

```html
<body></body> <!--改标签为html主体-->
<html></html> <!--该标签定义了整个html文档 -->
```

## HTML 属性

HTML 标签可以拥有*属性*。属性提供了有关 HTML 元素的*更多的信息*。

属性总是以名称/值对的形式出现，比如：*name="value"*。

属性总是在 HTML 元素的*开始标签*中规定。

```html
<!--html 属性例子 -->
<a href = " xxx 属性">
<input id="id属性 " name="name属性" type="input输入框的格式,例如password/submit" style="样式">
```

## HTML 属性参考手册

我们的完整的 HTML 参考手册提供了每个 HTML 元素可使用的合法属性的完整列表：

[完整的 HTML 参考手册](https://www.w3school.com.cn/tags/index.asp)

下面列出了适用于大多数 HTML 元素的属性：

| 属性  | 值                 | 描述                                     |
| :---- | :----------------- | :--------------------------------------- |
| class | *classname*        | 规定元素的类名（classname）              |
| id    | *id*               | 规定元素的唯一 id                        |
| style | *style_definition* | 规定元素的行内样式（inline style）       |
| title | *text*             | 规定元素的额外信息（可在工具提示中显示） |

如需更多关于标准属性的信息，请访问：

[HTML 标准属性参考手册](https://www.w3school.com.cn/tags/html_ref_standardattributes.asp)

## HTML 水平线

##### hr 标签在 HTML 页面中创建水平线。

hr 元素可用于分隔内容。

```html
<p>这是一个段落 </p>
<hr/>
<p>这是分割线下的段落</p>
```

## HTML 注释

可以将注释插入 HTML 代码中，这样可以提高其可读性，使代码更易被人理解。浏览器会忽略注释，也不会显示它们。

```html
<!-- 此处为html 中的注释 -->
```

## HTML 提示 - 如何查看源代码

您一定曾经在看到某个网页时惊叹道 “WOW! 这是如何实现的？”

如果您想找到其中的奥秘，只需要单击右键，然后选择“查看源文件”（IE）或“查看页面源代码”（Firefox），其他浏览器的做法也是类似的。这么做会打开一个包含页面 HTML 代码的窗口。

![1564476741574](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1564476741574.png)

## HTML 输出 - 有用的提示

我们无法确定 HTML 被显示的确切效果。屏幕的大小，以及对窗口的调整都可能导致不同的结果。

对于 HTML，您无法通过在 HTML 代码中添加额外的空格或换行来改变输出的效果。

##### 当显示页面时，浏览器会移除*源代码中*多余的空格和空行。所有连续的空格或空行都会被算作一个空格。需要注意的是，HTML 代码中的所有连续的空行（换行）也被显示为一个空格。

ps（无法通过空格改变段落的样式，连续的空格会被视为一个空格）

## 不赞成使用的标签和属性

在 HTML 4 中，有若干的标签和属性是被废弃的。被废弃（Deprecated）的意思是在未来版本的 HTML 和 XHTML 中将不支持这些标签和属性。

这里传达的信息很明确：请避免使用这些被废弃的标签和属性！

### 应该避免使用下面这些标签和属性：

| 标签                 | 描述               |
| :------------------- | :----------------- |
| <center>             | 定义居中的内容。   |
| <font> 和 <basefont> | 定义 HTML 字体。   |
| <s> 和 <strike>      | 定义删除线文本     |
| <u>                  | 定义下划线文本     |
| 属性                 | 描述               |
| align                | 定义文本的对齐方式 |
| bgcolor              | 定义背景颜色       |
| color                | 定义文本颜色       |

对于以上这些标签和属性：请使用样式代替！

ps：（以上标签都在style = ” “ 里面使用）

## 文本格式化标签

| 标签     | 描述                                  |
| :------- | :------------------------------------ |
| <b>      | 定义粗体文本。                        |
| <big>    | 定义大号字。                          |
| <em>     | 定义着重文字。                        |
| <i>      | 定义斜体字。                          |
| <small>  | 定义小号字。                          |
| <strong> | 定义加重语气。                        |
| <sub>    | 定义下标字。                          |
| <sup>    | 定义上标字。                          |
| <ins>    | 定义插入字。（下换线）                |
| <del>    | 定义删除字。                          |
| <s>      | *不赞成使用。*使用 <del> 代替。       |
| <strike> | *不赞成使用。*使用 <del> 代替。       |
| <u>      | *不赞成使用。*使用样式（style）代替。 |

## “计算机输出”标签

| 标签        | 描述                            |
| :---------- | :------------------------------ |
| <code>      | 定义计算机代码。                |
| <kbd>       | 定义键盘码。                    |
| <samp>      | 定义计算机代码样本。            |
| <tt>        | 定义打字机代码。                |
| <var>       | 定义变量。                      |
| <pre>       | 定义预格式文本。                |
| <listing>   | *不赞成使用。*使用 <pre> 代替。 |
| <plaintext> | *不赞成使用。*使用 <pre> 代替。 |
| <xmp>       | *不赞成使用。*使用 <pre> 代替。 |

## 引用、引用和术语定义

| 标签         | 描述                                       |
| :----------- | :----------------------------------------- |
| <abbr>       | 定义缩写。                                 |
| <acronym>    | 定义首字母缩写。                           |
| <address>    | 定义地址。                                 |
| <bdo>        | 定义文字方向。                             |
| <blockquote> | 定义长的引用。                             |
| <q>          | 定义短的引用语。 ( 双标签，相当于 "     ") |
| <cite>       | 定义引用、引证。                           |
| <dfn>        | 定义一个定义项目。                         |

## 用于长引用的 HTML 

HTML *<blockquote>* 元素定义被引用的节。

浏览器通常会对 <blockquote> 元素进行*缩进*处理。

```html
<p>以下内容引用自 WWF 的网站：</p>
<blockquote cite="http://www.worldwildlife.org/who/index.html"><!--引用的地址-->
	五十年来，WWF 一直致力于保护自然界的未来。
	世界领先的环保组织，WWF 工作于 100 个国家，
	并得到美国一百二十万会员及全球近五百万会员的支持。
</blockquote>
```

## 用于缩略词的 HTML 

HTML *<abbr>* 元素定义*缩写*或首字母缩略语。

对缩写进行标记能够为浏览器、翻译系统以及搜索引擎提供有用的信息。

```html
<p><abbr title="World Health Organization">WHO</abbr> 成立于 1948 年。</p><!--缩写tiele-->
```

## HTML 引文、引用和定义元素

| 标签         | 描述                             |
| :----------- | :------------------------------- |
| <abbr>       | 定义缩写或首字母缩略语。         |
| <address>    | 定义文档作者或拥有者的联系信息。 |
| <bdo>        | 定义文本方向。                   |
| <blockquote> | 定义从其他来源引用的节。         |
| <dfn>        | 定义项目或缩略词的定义。         |
| <q>          | 定义短的行内引用。               |
| <cite>       | 定义著作的标题。                 |



## 如何使用样式

当浏览器读到一个样式表，它就会按照这个样式表来对文档进行格式化。有以下三种方式来插入样式表：

### 外部样式

当样式需要被应用到很多页面的时候，外部样式表将是理想的选择。使用外部样式表，你就可以通过更改一个文件来改变整个站点的外观。

```html
<head>
	<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
```

### 内部样式

当单个文件需要特别样式时，就可以使用内部样式表。你可以在 head 部分通过 <style> 标签定义内部样式表。

```html
<head>
<style type="text/css">
	body {background-color: red}
	p {margin-left: 20px}
</style>
</head>
```

### 内联样式

当特殊的样式需要应用到个别元素时，就可以使用内联样式。 使用内联样式的方法是在相关的标签中使用样式属性。样式属性可以包含任何 CSS 属性。以下实例显示出如何改变段落的颜色和左外边距。

```html
<p style="color: red; margin-left: 20px">
	This is a paragraph
</p>
```

## HTML 链接语法

```html
<a href="url">Link text</a>
```

## HTML 链接 - target 属性

使用 Target 属性，你可以定义被链接的文档在何处显示。

下面的这行会在新窗口打开文档：设置了target="_blank" 属性后会在新的页面打开链接

```html
<a href="http://www.w3school.com.cn/" target="_blank">Visit W3School!</a>
```

## HTML 链接 - name 属性

name 属性规定锚（anchor）的名称。

您可以使用 name 属性创建 HTML 页面中的书签。

书签不会以任何特殊方式显示，它对读者是不可见的。

当使用命名锚（named anchors）时，我们可以创建直接跳至该命名锚（比如页面中某个小节）的链接，这样使用者就无需不停地滚动页面来寻找他们需要的信息了

### 命名锚的语法：

```
<a name="label">锚（显示在页面上的文本）</a>
```

**提示：**锚的名称可以是任何你喜欢的名字。

**提示：**您可以使用 id 属性来替代 name 属性，命名锚同样有效。

### 实例

首先，我们在 HTML 文档中对锚进行命名（创建一个书签）：

```
<a name="tips">基本的注意事项 - 有用的提示</a>
```

然后，我们在同一个文档中创建指向该锚的链接：

```
<a href="#tips">有用的提示</a>
```

您也可以在其他页面中创建指向该锚的链接：

```
<a href="http://www.w3school.com.cn/html/html_links.asp#tips">有用的提示</a>
```

在上面的代码中，我们将 # 符号和锚名称添加到 URL 的末端，就可以直接链接到 tips 这个命名锚了。

ps (锚是用来在同一个窗口做同页跳转的 #+锚的名称)

## 图像标签（img）和源属性（Src）

在 HTML 中，图像由 <img> 标签定义。

<img> 是空标签，意思是说，它只包含属性，并且没有闭合标签。

要在页面上显示图像，你需要使用源属性（src）。src 指 "source"。源属性的值是图像的 URL 地址。

定义图像的语法是：

```
<img src="url" />
```

## 替换文本属性（Alt）

alt 属性用来为图像定义一串预备的可替换的文本。替换文本属性的值是用户定义的。

```html
<img src="boat.gif" alt="Big Boat"><!-- 在图片无法加载出来的时候显示alt中的文本信息 -->
```

在浏览器无法载入图像时，替换文本属性告诉读者她们失去的信息。此时，浏览器将显示这个替代性的文本而不是图像。为页面上的图像都加上替换文本属性是个好习惯，这样有助于更好的显示信息，并且对于那些使用纯文本浏览器的人来说是非常有用的

#### 排列图像

```html
<html>
<body>
<h2>未设置对齐方式的图像：</h2>
	<p>图像 <img src ="/i/eg_cute.gif"> 在文本中</p>
	<h2>已设置对齐方式的图像：</h2>
	<p>图像 <img src="/i/eg_cute.gif" align="bottom"> 在文本中</p>
	<p>图像 <img src ="/i/eg_cute.gif" align="middle"> 在文本中</p>
	<p>图像 <img src ="/i/eg_cute.gif" align="top"> 在文本中</p>
	<p>请注意，bottom 对齐方式是默认的对齐方式。</p>
</body>
</html>
```

## 图像标签

| 标签 | 描述                         |
| :--- | :--------------------------- |
| imp  | 定义图像。                   |
| map  | 定义图像地图。               |
| area | 定义图像地图中的可点击区域。 |

表格由 <table> 标签来定义。每个表格均有若干行（由 <tr> 标签定义），每行被分割为若干单元格（由 <td> 标签定义）。字母 td 指表格数据（table data），即数据单元格的内容。数据单元格可以包含文本、图片、列表、段落、表单、水平线、表格等等。

```html
<table border="1">
<tr><!--行元素-->
	<td>row 1, cell 1</td><!--单元格个元素-->
	<td>row 1, cell 2</td>
</tr>
<tr>
	<td>row 2, cell 1</td>
	<td>row 2, cell 2</td>
</tr>
</table>
```

#### 一个格子占有几行/几列

```html
<th rowspan = "n"></th><!--占有几行 占几个tr高度-->
<th colspan = "n"></th><!--占有几列 占几个td宽度-->
<td></td><!--单个单元格-->
<tr></tr><!--表示表格中的一行-->
```

#### 表格的一些基本属性

```html
<caption>我的标题</caption> <!--表格的标题浮在table上方-->
<table cellpadding = "10"> <!--cellpadding 为表格内边距-->
<table cellspacing = "10"> <!-- 表格与表格之间的距离 -->
<table background = "xxx.jpg"> <!--表格背景-->
<td align = "right/left/center"> <!--表格中内容的相对位置-->
```

#### frame控制框架围绕

```html
<p><b>注释：</b>frame 属性无法在 Internet Explorer 中正确地显示。</p>
<table frame="box"></table> <!--table边框盒子四周围绕样式-->
<table frame="above"></table> <!--table上方保留边框-->
<table frame="below"></table> <!--table下方保留边框-->
<table frame="hsides"></table> <!--table盒子上下保留边框-->
<table frame="vsides"></table> <!--table盒子左右保留边框-->
```

## 无序列表

无序列表是一个项目的列表，此列项目使用粗体圆点（典型的小黑圆圈）进行标记。

无序列表始于 <ul> 标签。每个列表项始于 <li>。

```html
<ul>
	<li>Coffee</li>
	<li>Milk</li>
</ul>
```

浏览器显示如下：

- Coffee
- Milk

列表项内部可以使用段落、换行符、图片、链接以及其他列表等等。

## 有序列表

同样，有序列表也是一列项目，列表项目使用数字进行标记。

有序列表始于 <ol> 标签。每个列表项始于 <li> 标签。

```html
<ol>
	<li>Coffee</li>
	<li>Milk</li>
</ol>
```

浏览器显示如下：

1. Coffee
2. Milk

列表项内部可以使用段落、换行符、图片、链接以及其他列表等等。

## HTML 块元素

大多数 HTML 元素被定义为块级元素或内联元素。

编者注：“块级元素”译为 block level element，“内联元素”译为 inline element。

##### 块级元素在浏览器显示时，通常会以新行来开始（和结束）。

例子：<h1>, <p>, <ul>, <table>

## HTML 内联元素

##### 内联元素在显示时通常不会以新行开始。

例子：<b>, <td>, <a>, <img>

## HTML <  div  >元素

HTML <div> 元素是**块级元素**，它是可用于组合其他 HTML 元素的容器。

<div> 元素没有特定的含义。除此之外，由于它属于块级元素，浏览器会在其前后显示折行。

如果与 CSS 一同使用，<div> 元素可用于对大的内容块设置样式属性。

<div> 元素的另一个常见的用途是文档布局。它取代了使用表格定义布局的老式方法。使用 <table> 元素进行文档布局不是表格的正确用法。<table> 元素的作用是显示表格化的数据。

## HTML <   span  > 元素

HTML <span> 元素是**内联元素**，可用作文本的容器。

<span> 元素也没有特定的含义。

当与 CSS 一同使用时，<span> 元素可用于为部分文本设置样式属性。

总结 ：

```html
<div> div是块级元素容器，块级别元素元素默认是下下一行开始</div>
<span> span是内联元素容器，内联元素开始不会换行</span>
<!--div和span的区别 div可用于组合其他html元素 span是文本文档的容器 -->
```

# HTML 类

对 HTML 进行分类（设置类），使我们能够为元素的类定义 CSS 样式。

为相同的类设置相同的样式，或者为不同的类设置不同的样式。

```html
<!DOCTYPE html>
<html>
<head>
<style>
.cities {
    background-color:black;
    color:white;
    margin:20px;
    padding:20px;
} <!--html中的类是一组样式的集合，可以赋予给能够使用class定义的样式的标签-->
</style>
</head>

<body>

<div class="cities">
		<h2>London</h2>
	<p>
	London is the capital city of England. 
	It is the most populous city in the United Kingdom, 
	with a metropolitan area of over 13 million inhabitants.
	</p>
</div> 

</body>
</html>
```

## 使用 < div > 元素的 HTML 布局

**注释：**<div> 元素常用作布局工具，因为能够轻松地通过 CSS 对其进行定位。

这个例子使用了四个 <div> 元素来创建多列布局：

```html
<body>
<div id="header">
<h1>City Gallery</h1>
</div>

<div id="nav">
	London<br>
	Paris<br>
	Tokyo<br>
</div>

<div id="section">
	<h1>London</h1>
		<p>
			London is the capital city of England. It is the most populous city in the 				United Kingdom,with a metropolitan area of over 13 million inhabitants.
		</p>
		<p>
			Standing on the River Thames, London has been a major settlement for two 		        millennia,its history going back to its founding by the Romans, who named it 			 Londinium.
		</p>
</div>

<div id="footer">
		Copyright W3School.com.cn
</div>

</body>
```

### CSS：

```css
<style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:300px;
    width:100px;
    float:left;
    padding:5px; 
}
#section {
    width:350px;
    float:left;
    padding:10px; 
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px; 
}
</style>
```

### HTML5 语义元素 (按照字面上的意思定义的名字 没有特殊样式)

| header  | 定义文档或节的页眉             |
| ------- | ------------------------------ |
| nav     | 定义导航链接的容器             |
| section | 定义文档中的节                 |
| article | 定义独立的自包含文章           |
| aside   | 定义内容之外的内容（比如侧栏） |
| footer  | 定义文档或节的页脚             |
| details | 定义额外的细节                 |
| summary | 定义 details 元素的标题        |

# HTML 响应式 Web 设计

## 什么是响应式 Web 设计？（解决适配问题）

- RWD 指的是响应式 Web 设计（Responsive Web Design）
- RWD 能够以可变尺寸传递网页
- RWD 对于平板和移动设备是必需的

 在网页代码的头部，加入一行viewport元标签

```html
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0;user-scalable=no">
```

在网页的<head>中增加以上这句话，可以让网页的宽度自动适应手机屏幕的宽度，下面是这些属性的解释：

　　1）width=device-width ：表示宽度是设备屏幕的宽度

　　2）initial-scale=1.0：表示初始的缩放比例，1.0就是占网页的100%

　　3）minimum-scale=1.0：表示最小的缩放比例

　　4）maximum-scale=1.0：表示最大的缩放比例

# HTML 框架

**通过使用框架，你可以在同一个浏览器窗口中显示不止一个页面。**

水平是框架（rows 表示水平分配 rows = “xx%,xx%.....”）

```html
<html>

<frameset rows="25%,50%,25%">

  <frame src="/example/html/frame_a.html">
  <frame src="/example/html/frame_b.html">
  <frame src="/example/html/frame_c.html">

</frameset>

</html>
```

垂直式框架（cols 表示竖直分配 cols = “ xx%，xx%....” 引号里面加的是宽度）

```html
<html>
<frameset cols="25%,50%,25%">
  		<frame src="/example/html/frame_a.html">
  		<frame src="/example/html/frame_b.html">
 	 	<frame src="/example/html/frame_c.html">
</frameset>
</html>
```

水平式框架

使用框架的坏处：

- 开发人员必须同时跟踪更多的HTML文档
- 很难打印整张页面

- 框架结构标签（<frameset>）

  框架结构标签（<frameset>）定义如何将窗口分割为框架每个 frameset 定义了一系列行*或*列rows/columns 的值规定了每行或每列占据屏幕的面积

**编者注：**frameset 标签也被某些文章和书籍译为框架集。

## 框架标签（Frame）

Frame 标签定义了放置在每个框架中的 HTML 文档。

在下面的这个例子中，我们设置了一个两列的框架集。第一列被设置为占据浏览器窗口的 25%。第二列被设置为占据浏览器窗口的 75%。HTML 文档 "frame_a.htm" 被置于第一个列中，而 HTML 文档 "frame_b.htm" 被置于第二个列中：

```
<frameset cols="25%,75%">
   <frame src="frame_a.htm">
   <frame src="frame_b.htm">
</frameset>
```

## 基本的注意事项 - 有用的提示：

假如一个框架有可见边框，用户可以拖动边框来改变它的大小。为了避免这种情况发生，可以在 <frame> 标签中加入：noresize="noresize"。

为不支持框架的浏览器添加 <noframes> 标签。

**重要提示：**不能将 <body></body> 标签与 <frameset></frameset> 标签同时使用！不过，假如你添加包含一段文本的 <noframes> 标签，就必须将这段文字嵌套于 <body></body> 标签内。（在下面的第一个实例中，可以查看它是如何实现的。）

# HTML Iframe

**iframe 用于在网页内显示网页。**

## Iframe - 设置高度和宽度

height 和 width 属性用于规定 iframe 的高度和宽度。

属性值的默认单位是像素，但也可以用百分比来设定（比如 "80%"）。

### 实例

```html
<iframe src="demo_iframe.htm" width="200" height="200"></iframe>
```

## Iframe - 删除边框

frameborder 属性规定是否显示 iframe 周围的边框。

设置属性值为 "0" 就可以移除边框：

### 实例

```html
<iframe src="demo_iframe.htm" frameborder="0"></iframe>
```

## 使用 iframe 作为链接的目标

iframe 可用作链接的目标（target）。

链接的 target 属性必须引用 iframe 的 name 属性：

### 实例

```html
<iframe src="demo_iframe.htm" name="iframe_a"></iframe>
<p><a href="http://www.w3school.com.cn" target="iframe_a">W3School.com.cn</a></p>
```

# HTML 背景

- [HTML 内联框架](https://www.w3school.com.cn/html/html_iframe.asp)
- [HTML 脚本](https://www.w3school.com.cn/html/html_scripts.asp)

**好的背景使站点看上去特别棒。**

## 实例

- [搭配良好的背景和颜色](https://www.w3school.com.cn/tiy/t.asp?f=html_back_good)

  一个背景颜色和文字颜色搭配良好的例子，使页面中的文字易于阅读。

- [搭配得不好的背景和颜色](https://www.w3school.com.cn/tiy/t.asp?f=html_back_bad)

  一个背景颜色和文字颜色搭配得不好的例子，使页面中的文字难于阅读。

（[可以在本页底端找到更多实例](https://www.w3school.com.cn/html/html_backgrounds.asp#more_examples)。）

## 背景（Backgrounds）

<body> 拥有两个配置背景的标签。背景可以是颜色或者图像。

### 背景颜色（Bgcolor）

背景颜色属性将背景设置为某种颜色。属性值可以是十六进制数、RGB 值或颜色名。

```
<body bgcolor="#000000">
<body bgcolor="rgb(0,0,0)">
<body bgcolor="black">
```

以上的代码均将背景颜色设置为黑色。

### 背景（Background）

背景属性将背景设置为图像。属性值为图像的URL。如果图像尺寸小于浏览器窗口，那么图像将在整个浏览器窗口进行复制。

```
<body background="clouds.gif">
<body background="http://www.w3school.com.cn/clouds.gif">
```

URL可以是相对地址，如第一行代码。也可以使绝对地址，如第二行代码。

**提示：**如果你打算使用背景图片，你需要紧记一下几点：

- 背景图像是否增加了页面的加载时间。小贴士：图像文件不应超过 10k。
- 背景图像是否与页面中的其他图象搭配良好。
- 背景图像是否与页面中的文字颜色搭配良好。
- 图像在页面中平铺后，看上去还可以吗？
- 对文字的注意力被背景图像喧宾夺主了吗？

# HTML 脚本

**JavaScript 使 HTML 页面具有更强的动态和交互性**

## HTML script 元素

<script> 标签用于定义客户端脚本，比如 JavaScript。

script 元素既可包含脚本语句，也可通过 src 属性指向外部脚本文件。

必需的 type 属性规定脚本的 MIME 类型。

JavaScript 最常用于图片操作、表单验证以及内容动态更新。

下面的脚本会向浏览器输出“Hello World!”：

```html
<script type="text/javascript">
	document.write("Hello World!")
</script>
```

## < noscript > 标签

<noscript> 标签提供无法使用脚本时的替代内容，比方在浏览器禁用脚本时，或浏览器不支持客户端脚本时。

noscript 元素可包含普通 HTML 页面的 body 元素中能够找到的所有元素。

只有在浏览器不支持脚本或者禁用脚本时，才会显示 noscript 元素中的内容：

**改标签的用法和alt一样 都是在图片、脚本出现错误的时候发出的提示语句**

```html
<script type="text/javascript">
document.write("Hello World!")
</script>
<noscript>Your browser does not support JavaScript!</noscript>
```

## HTML 文件路径

文件路径描述了网站文件夹结构中某个文件的位置。

文件路径会在链接外部文件时被用到：

- 网页
- 图像
- 样式表
- JavaScript

## 绝对文件路径

绝对文件路径是指向一个因特网文件的完整 URL：

### 实例

```html
<img src="https://www.w3school.com.cn/images/picture.jpg" alt="flower">
```

## 相对路径

相对路径指向了相对于当前页面的文件。

在本例中，文件路径指向了位于当前网站根目录中 images 文件夹里的一个文件：

### 实例

```html
<img src="/images/picture.jpg" alt="flower">
```

在本例中，文件路径指向了位于当前文件夹中 images 文件夹里的一个文件：

### 实例

```html
<img src="images/picture.jpg" alt="flower">
```

在本例中，文件路径指向了位于当前文件夹的上一级文件夹中 images 文件夹里的一个文件：

### 实例

```html
<img src="../images/picture.jpg" alt="flower">
```

## 好习惯

**使用相对路径是个好习惯（如果可能）。**

**如果使用了相对路径，那么您的网页就不会与当前的基准 URL 进行绑定。所有链接在您的电脑上 (localhost) 或未来的公共域中均可正常工作。**

## HTML < head > 元素

<head> 元素是所有头部元素的容器。<head> 内的元素可包含脚本，指示浏览器在何处可以找到样式表，提供元信息，等等。

以下标签都可以添加到 head 部分：<title>、<base>、<link>、<meta>、<script> 以及 <style>。

## HTML <title> 元素

< title > 标签定义文档的标题。

title 元素在所有 HTML/XHTML 文档中都是必需的。

title 元素能够：

- 定义浏览器工具栏中的标题
- 提供页面被添加到收藏夹时显示的标题
- 显示在搜索引擎结果中的页面标题

一个简化的 HTML 文档：

```html
<!DOCTYPE html>
<html>
<head>
	<title>Title of the document</title> <!--网页的名称-->
</head>

<body>
	The content of the document......
</body>

</html>
```

## HTML < base > 元素

<base> 标签为页面上的所有链接规定默认地址或默认目标（target）：

```html
<head>
<base href="http://www.w3school.com.cn/images/" />
<base target="_blank" />
</head>
```

## HTML < link > 元素

< link > 标签定义文档与外部资源之间的关系。

< link > 标签最常用于连接样式表：

```html
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css" />
</head>
```

## HTML < style > 元素

< style > 标签用于为 HTML 文档定义样式信息。

您可以在 style 元素内规定 HTML 元素在浏览器中呈现的样式：

```html
<head>
<style type="text/css">
	body {background-color:yellow}
	p {color:blue}
</style>
</head>
```

## HTML < meta > 元素

元数据（metadata）是关于数据的信息。

<meta> 标签提供关于 HTML 文档的元数据。元数据不会显示在页面上，但是对于机器是可读的。

典型的情况是，meta 元素被用于规定页面的描述、关键词、文档的作者、最后修改时间以及其他元数据。

<meta> 标签始终位于 head 元素中。

元数据可用于浏览器（如何显示内容或重新加载页面），搜索引擎（关键词），或其他 web 服务。

### 针对搜索引擎的关键词

一些搜索引擎会利用 meta 元素的 name 和 content 属性来索引您的页面。

下面的 meta 元素定义页面的描述：

```
<meta name="description" content="Free Web tutorials on HTML, CSS, XML" />
```

下面的 meta 元素定义页面的关键词：

```
<meta name="keywords" content="HTML, CSS, XML" />
```

name 和 content 属性的作用是描述页面的内容。

## HTML 头部元素

| 标签   | 描述                                     |
| :----- | :--------------------------------------- |
| head   | 定义关于文档的信息。                     |
| title  | 定义文档标题。                           |
| base   | 定义页面上所有链接的默认地址或默认目标。 |
| link   | 定义文档与外部资源之间的关系。           |
| meta   | 定义关于 HTML 文档的元数据。             |
| script | 定义客户端脚本。                         |
| style  | 定义文档的样式信息。                     |

**HTML 中的预留字符必须被替换为字符实体。**

## HTML 实体

在 HTML 中，某些字符是预留的。

**在 HTML 中不能使用小于号（<）和大于号（>）**，这是因为浏览器会误认为它们是标签。

如果希望正确地显示预留字符，我们必须在 HTML 源代码中使用字符实体（character entities）。

字符实体类似这样：

```html
&entity_name; 或者 &#entity_number;
```

如需显示小于号，我们必须这样写：&lt; 或 &#60;

**提示：**使用实体名而不是数字的好处是，名称易于记忆。不过坏处是，浏览器也许并不支持所有实体名称（对实体数字的支持却很好）。

## 不间断空格（non-breaking space）

HTML 中的常用字符实体是不间断空格(&nbsp;)。

浏览器总是会截短 HTML 页面中的空格。如果您在文本中写 10 个空格，在显示该页面之前，浏览器会删除它们中的 9 个。如需在页面中增加空格的数量，您需要使用 &nbsp; 字符实体。

## HTML 中有用的字符实体

**注释：**实体名称对大小写敏感！

| 显示结果 | 描述              | 实体名称          | 实体编号 |
| :------- | :---------------- | :---------------- | :------- |
|          | 空格              | &nbsp;            | &#160;   |
| <        | 小于号            | &lt;              | &#60;    |
| >        | 大于号            | &gt;              | &#62;    |
| &        | 和号              | &amp;             | &#38;    |
| "        | 引号              | &quot;            | &#34;    |
| '        | 撇号              | &apos; (IE不支持) | &#39;    |
| ￠       | 分（cent）        | &cent;            | &#162;   |
| £        | 镑（pound）       | &pound;           | &#163;   |
| ¥        | 元（yen）         | &yen;             | &#165;   |
| €        | 欧元（euro）      | &euro;            | &#8364;  |
| §        | 小节              | &sect;            | &#167;   |
| ©        | 版权（copyright） | &copy;            | &#169;   |
| ®        | 注册商标          | &reg;             | &#174;   |
| ™        | 商标              | &trade;           | &#8482;  |
| ×        | 乘号              | &times;           | &#215;   |
| ÷        | 除号              | &divide;          | &#247;   |

如需完整的实体符号参考，请访问我们的 [HTML 实体符号参考手册](https://www.w3school.com.cn/tags/html_ref_entities.html)。

# HTML 统一资源定位器

## URL - Uniform Resource Locator

当您点击 HTML 页面中的某个链接时，对应的 <a> 标签指向万维网上的一个地址。

统一资源定位器（URL）用于定位万维网上的文档（或其他数据）。

网址，比如 http://www.w3school.com.cn/html/index.asp，遵守以下的语法规则：

```html
scheme://host.domain:port/path/filename
```

解释：

- scheme - 定义因特网服务的类型。最常见的类型是 http
- host - 定义域主机（http 的默认主机是 www）
- domain - 定义因特网域名，比如 w3school.com.cn
- :port - 定义主机上的端口号（http 的默认端口号是 80）
- path - 定义服务器上的路径（如果省略，则文档必须位于网站的根目录中）。
- filename - 定义文档/资源的名称

**编者注：**URL 的英文全称是 Uniform Resource Locator，中文也译为“统一资源定位符”。

## URL Schemes

以下是其中一些最流行的 scheme：

| Scheme | 访问               | 用于...                             |
| :----- | :----------------- | :---------------------------------- |
| http   | 超文本传输协议     | 以 http:// 开头的普通网页。不加密。 |
| https  | 安全超文本传输协议 | 安全网页。加密所有信息交换。        |
| ftp    | 文件传输协议       | 用于将文件下载或上传至网站。        |
| file   |                    | 您计算机上的文件。                  |

## URL 编码示例 

## (URL 编码会将字符转换为可通过因特网传输的格式)

| 字符 | URL 编码 |
| :--- | :------- |
| €    | %80      |
| £    | %A3      |
| ©    | %A9      |
| ®    | %AE      |
| À    | %C0      |
| Á    | %C1      |
| Â    | %C2      |
| Ã    | %C3      |
| Ä    | %C4      |
| Å    | %C5      |

## 颜色值

颜色由一个十六进制符号来定义，这个符号由红色、绿色和蓝色的值组成（RGB）。

每种颜色的最小值是0（十六进制：#00）。最大值是255（十六进制：#FF）。

这个表格给出了由三种颜色混合而成的具体效果：

| Color | Color HEX | Color RGB        |
| :---- | :-------- | :--------------- |
| 黑    | #000000   | rgb(0,0,0)       |
| 红    | #FF0000   | rgb(255,0,0)     |
| 绿    | #00FF00   | rgb(0,255,0)     |
| 蓝    | #0000FF   | rgb(0,0,255)     |
| 黄    | #FFFF00   | rgb(255,255,0)   |
| 淡蓝  | #00FFFF   | rgb(0,255,255)   |
| 紫    | #FF00FF   | rgb(255,0,255)   |
| 灰    | #C0C0C0   | rgb(192,192,192) |
| 白    | #FFFFFF   | rgb(255,255,255) |

## 颜色名

大多数的浏览器都支持颜色名集合。

**提示：**仅仅有 16 种颜色名被 W3C 的 HTML4.0 标准所支持。它们是：aqua, black, blue, fuchsia, gray, green, lime, maroon, navy, olive, purple, red, silver, teal, white, yellow。

如果需要使用其它的颜色，需要使用十六进制的颜色值。

![img](file:///C:\Users\32621\AppData\Roaming\Tencent\Users\326212101\QQ\WinTemp\RichOle\@M10QHUE2]CIWFS@BIVN82E.png)

# HTML 颜色名（了解 16进制）

**提示：**仅有 16 种*颜色名*被 W3C 的 HTML 4.0 标准支持，它们是：aqua、black、blue、fuchsia、gray、green、lime、maroon、navy、olive、purple、red、silver、teal、white、yellow。

![1564562751543](C:\Users\32621\AppData\Roaming\Typora\typora-user-images\1564562751543.png)

# HTML <!DOCTYPE>

## <!DOCTYPE> 声明

Web 世界中存在许多不同的文档。只有了解文档的类型，浏览器才能正确地显示文档。

HTML 也有多个不同的版本，只有完全明白页面中使用的确切 HTML 版本，浏览器才能完全正确地显示出 HTML 页面。这就是 <!DOCTYPE> 的用处。

<!DOCTYPE> 不是 HTML 标签。它为浏览器提供一项信息（声明），即 HTML 是用什么版本编写的。

**提示：**W3School 即将升级为最新的 HTML5 文档类型。

## HTML 版本

从 Web 诞生早期至今，已经发展出多个 HTML 版本：

| 版本      | 年份 |
| :-------- | :--- |
| HTML      | 1991 |
| HTML+     | 1993 |
| HTML 2.0  | 1995 |
| HTML 3.2  | 1997 |
| HTML 4.01 | 1999 |
| XHTML 1.0 | 2000 |
| HTML5     | 2012 |
| XHTML5    | 2013 |

## 常用的声明

### HTML5

```html
<!DOCTYPE html>
```

### HTML 4.01

```html
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
```

### XHTML 1.0

```html
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
```

# XHTML 简介

## 什么是 XHTML？

- XHTML 指的是可扩展超文本标记语言
- XHTML 与 HTML 4.01 几乎是相同的
- XHTML 是更严格更纯净的 HTML 版本
- XHTML 是以 XML 应用的方式定义的 HTML
- XHTML 是 [2001 年 1 月](https://www.w3school.com.cn/w3c/w3c_xhtml.asp)发布的 W3C 推荐标准
- XHTML 得到所有主流浏览器的支持



# HTML 表单

## < form > 元素

HTML 表单用于收集用户输入。

< form > 元素定义 HTML 表单：

### 实例

```html
<form method = "post" action = "xxx.jsp">
	<imput type="text" style=" " onclick=""/>
    <imput type="submit" style=" " value = ""/>
</form>
```

## 单选按钮输入

*<input type="radio">* 定义*单选按钮*。

单选按钮允许用户在有限数量的选项中选择其中之一：

### 实例

```html
<form>
<input type="radio" name="sex" value="male" checked>Male
<br>
<input type="radio" name="sex" value="female">Female
</form> 
```



## 用 <fieldset> 组合表单数据

*<fieldset>* 元素组合表单中的相关数据

*<legend>* 元素为 <fieldset> 元素定义标题。

### 实例

```html
<form action="action_page.php">
<fieldset>
<legend>Personal information:</legend>
First name:<br>
<input type="text" name="firstname" value="Mickey">
<br>
Last name:<br>
<input type="text" name="lastname" value="Mouse">
<br><br>
<input type="submit" value="Submit"></fieldset>
</form> 
```

下面是 <form> 属性的列表：

| 属性           | 描述                                                       |
| :------------- | :--------------------------------------------------------- |
| accept-charset | 规定在被提交表单中使用的字符集（默认：页面字符集）。       |
| action         | 规定向何处提交表单的地址（URL）（提交页面）。              |
| autocomplete   | 规定浏览器应该自动完成表单（默认：开启）。                 |
| enctype        | 规定被提交数据的编码（默认：url-encoded）。                |
| method         | 规定在提交表单时所用的 HTTP 方法（默认：GET）。            |
| name           | 规定识别表单的名称（对于 DOM 使用：document.forms.name）。 |
| novalidate     | 规定浏览器不验证表单。                                     |
| target         | 规定 action 属性中地址的目标（默认：_self）。              |

## < select > 元素（下拉列表）

*< select >* 元素定义*下拉列表*：

### 实例

```html
<select name="cars">
<option value="volvo">Volvo</option>
<option value="saab">Saab</option>
<option value="fiat">Fiat</option>
<option value="audi">Audi</option>
</select>
```

## < textarea > 元素

*< textarea >* 元素定义多行输入字段（*文本域*）：

### 实例

```html
<textarea name="message" rows="10" cols="30">
The cat was playing in the garden.
</textarea>
```

## HTML5 输入类型

HTML5 增加了多个新的输入类型：

- color\ date \ datetime
- datetime-local\email\month
- number\range\search
- tel\time
- url\week

## 输入限制

这里列出了一些常用的输入限制（其中一些是 HTML5 中新增的）：

| 属性      | 描述                               |
| :-------- | :--------------------------------- |
| disabled  | 规定输入字段应该被禁用。           |
| max       | 规定输入字段的最大值。             |
| maxlength | 规定输入字段的最大字符数。         |
| min       | 规定输入字段的最小值。             |
| pattern   | 规定通过其检查输入值的正则表达式。 |
| readonly  | 规定输入字段为只读（无法修改）。   |
| required  | 规定输入字段是必需的（必需填写）。 |
| size      | 规定输入字段的宽度（以字符计）。   |
| step      | 规定输入字段的合法数字间隔。       |
| value     | 规定输入字段的默认值。             |

## html 输出

```javascript
console.log() //在控制台输出
alert()// 在页面提示输出
```

