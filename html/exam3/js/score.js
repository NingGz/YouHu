$(function() {
	$("input[name=name]").focus();
	$("input[name='direction']").click(function() {
		if($(this).val()=='java开发'){
			$("#direction_name").html("<label>java基础成绩</label>:");
			$("#direction_value").html("<input type='text' name='direction_score'>");
		}else{
			$("#direction_name").html("<label>.Net基础成绩</label>:");
			$("#direction_value").html("<input type='text' name='direction_score'>");
		}
	})
	$(document).on('click','#sub_from',function(){
		var jsonString=$("#baseForm").serializeArray();
		jsonString=JSON.stringify(jsonString);
		alert(jsonString);
		var url="show.html?"+jsonString;
		url=encodeURI(url);
		window.location.href=url;
	})
	/* 表单非	空验证 */
	$(document).on('blur',"input",function(){
		if($.trim($(this).val()).length==0){
			var s=$(this).parent().prev().children().first().html();
			$("#error_message").html(s+"不能为空");
			$(this).focus();
		}else{
			$("#error_message").html("");
		}
	})
	/* 成绩验证0-100 */
	$(document).on('blur','.score',function(){
		var reg=/^(?:0|[1-9][0-9]?|100)$/;
		if($(this).val().match(reg)!=null){
			$("#error_message").html("");
		}else{
			$("#error_message").html("请输入0-100整数");
			$(this).focus();
		}
	})
	/* 失去焦点时添加总分和平均分 */
	$(document).on('blur',"input[name='direction_score'],input[name='sqlScore']",function(){
		var reg=/^(?:0|[1-9][0-9]?|100)$/;
		if($(this).val().match(reg)!=null){
			var s1=$("input[name='direction_score']").val();
			var s2=$("input[name='sqlScore']").val();
			if($.trim(s1)!=""&&$.trim(s1)!=""){
				$("input[name='totalScore']").val(parseInt(s1)+parseInt(s2));
				$("input[name='avgScore']").val(((parseInt(s1)+parseInt(s2))/2.0).toFixed(2));
			}
		}else{
			$("#error_message").html("请输入0-100整数");
			$(this).focus();
		}
	})
	/* 获取焦点时清空总分和平均分 */
	$(document).on('focus',"input[name='direction_score'],input[name='sqlScore']",function(){
		$("input[name='totalScore']").val("");
		$("input[name='avgScore']").val("");
	})
})
