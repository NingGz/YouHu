var s;
var index = 0;
var dataString = "前端开发是创建Web页面或app等前端界面呈现给用户的过程，通过HTML，CSS及JavaScript以及衍生出来的各种技术、框架、解决方案，来实现互联网产品的用户界面交互。";
$(function() {
	s = setInterval(printData, 100);
})

function printData() {
	$("#dataFrame").append(dataString[index]);
	index++;
	if (index == dataString.length) {
		clearInterval(s);
	}
}
