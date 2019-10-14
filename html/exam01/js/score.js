$(function(){
	$("#choseBox").click(function(){
		alert(1);
		var n = $("#choseBox input[type='radio']:checked").val();
		if(n==1){
			$("#orScore").html(".java基础成绩");
		}
		else{
			$("#orScore").html(".net基础成绩");
		}
	});
	
	$("#javaScore").blur(function(){
		var reg=/^(?:0|[1-9][0-9]?|100)$/;
		if($.trim($("#javaScore").val()).length==0){
			$("#errorBox").html("java成绩不能为空");
		}
		else if($("#javaScore").val().match(reg)==null){
			$("#errorBox").html("java成绩范围为0-100");
		}
		else{
			$("#errorBox").html("");
		}
	});
	
	$("#dateScore").blur(function(){
		var reg=/^(?:0|[1-9][0-9]?|100)$/;
		if($.trim($("#dateScore").val()).length==0){
			$("#errorBox").html("数据库成绩不能为空");
		}
		else if($("#dateScore").val().match(reg)==null){
			$("#errorBox").html("数据库成绩范围为0-100");
		}
		else{
			$("#errorBox").html("");
		}
	});
	
	$("#endScore").blur(function(){
		var reg=/^(?:0|[1-9][0-9]?|100)$/;
		if($.trim($("#endScore").val()).length==0){
			$("#errorBox").html("结业成绩不能为空");
		}
		else if($("#endScore").val().match(reg)==null){
			$("#errorBox").html("结业成绩范围为0-100");
		}
		else{
			$("#errorBox").html("");
		}
	});
	
	$("#dayScore").blur(function(){
		var reg=/^(?:0|[1-9][0-9]?|100)$/;
		if($.trim($("#dayScore").val()).length==0){
			$("#errorBox").html("平时成绩不能为空");
		}	
		else if($("#dayScore").val().match(reg)==null){
			$("#errorBox").html("数据库成绩范围为0-100");
		}
		else{
			$("#errorBox").html("");
		}
	});
	
	$("#sumScore").focus(function(){
		$("#sumScore").val(getSum());
	});
	
	$("#avgScore").focus(function(){
		$("#avgScore").val(getAvg());
	});
	
	$("#subTn").click(function(){
		subCheck();
	});
	
	$("#resetTn").click(function(){
		resetFun();
	});
	
});
function getSum(){
	var java = $("#javaScore").val();
	var date = $("#dateScore").val();
	var end = $("#endScore").val();
	var day = $("#dayScore").val();
	var sum = parseInt(java)+parseInt(date)+parseInt(end)+parseInt(day);
	if(isNaN(sum)){
		return "请检查输入成绩是否有空";
	}
	else{
		return sum;
	}
}
function getAvg(){
	var thisSum = getSum();
	if(isNaN(thisSum)){
		return "请检查各项输入成绩是否有空"
	}
	else{
		return (thisSum*1.0/4).toFixed(2);
	}
}
function subCheck(){
	var java = $("#javaScore").val();
	var date = $("#dateScore").val();
	var end = $("#endScore").val();
	var day = $("#dayScore").val();
	var sum = $("#sumScore").val();
	var avg = $("#avgScore").val();
	var time = $("input[name=time]").val();
	var name = $("#name").val();
	var num = $("#num").val();
	alert(time);
	if(java==null||date==null||sum==null||end==null||day==null||avg==null||time==null||name==null||num==null){
		$("#errorBox").html("请检查表单是否有空")
	}
	else{
		var json = new Object();//创建类对象将值封装入对象中
		json.name = name;
		json.num = num;
		json.java = java;
		json.date = date;
		json.end = end;
		json.day = day;
		json.sum = sum;
		json.time = time;
		
		var a = JSON.stringify(json);//将json 对象转化成json字符串
		alert(a);
		var url="show.html?"+a;//将字符串发送到指定页面
		url=encodeURI(url);//将页面跳转的地址进行编码成网页地址格式
		window.location.href=url;//页面跳转
	}
}
function resetFun(){//刷新页面，将所有的值重置为默认

	window.location.reload();
}
