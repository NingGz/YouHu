var jsonDate;//全局变量
$(function(){
	
	$.ajax({
		dataType:"json",
		url:"json/summary.json",
		success:function(data){
			$.each(data,function(index,value){
				value.no = index+1;//遍历中的index 的下标是从0 开始的
				value.sum = parseInt(value.maths)+parseInt(value.Chinese)+parseInt(value.English);//计算成绩和
				value.avg = (value.sum/3.0).toFixed(2);//求平均值
			});
			var json = {theAppends:data};//把处理后的data赋给模板动态添加数据的地方，theAppends 是模板中动态的部分
			jsonDate = json;//给全局变量赋值
			openTable(json);//开始将模板和模板数据加入到页面中		
		}
	});
	
	
	
});
function openTable(json){
	$("#firstTable").html("");//每次刷新初始化数据为空
	var temp = $("#theModel").html();//加入模板
	var react = Mustache.render(temp,json);//将函数获取到的数据装入模板封装
	var max = theMax(json);//获取最大的值
	$("#firstTable").append(react);//在名称为first的table出添加模板内容
	$("tr:odd").css('background','yellow');//css 选择器 选中奇数行
	$("#maxBox").html("总分最高的是："+ max);
}
function theMax(json){
	var max=-1;
	var maxName;
	$.each(json.theAppends,function(index,data){
		if(data.sum>max){
			max = data.sum;
			maxName = data.name;
		}
	});
	return maxName+"("+max+"分)";
}
function reduce(no){
	jsonDate.theAppends.splice(no-1,1);//删除json文件中的一行 并不是删除源文件 而是删除页面中加载来的json数据
	$.each(jsonDate.theAppends,function(index,value){
		value.no = index+1;//将删除一行的json源文件重新排序
	});
	openTable(jsonDate);//将更新后的源文件重新装入
}
