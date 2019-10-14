var jsonData;
$(function() {
	/* 初始化json数据 */
	$.ajax({
		url: "../data/summary.json",
		dataType: "json",
		success: function(data) {
			/* data=JSON.stringify(data); */
			$.each(data, function(i, n) {
				n.no = i + 1;
				n.total = parseFloat(n.Chinese) + parseFloat(n.English) + parseFloat(n.maths);
				n.avg = (n.total / 3.0).toFixed(2);
			})
			var json = {
				sum: data
			};
			jsonData = json;
			/* 初始化表格 */
			flushTable(jsonData);
		}
	})
})
/* 属性table */
function flushTable(json) {
	/* 清空table数据 */
	$("#basetable").html("");
	/* 加入数据 */
	var temp = $("#script_model1").html();
	var s2 = Mustache.render(temp, json)
	$("#basetable").append(s2);
	$("tr:odd").css('background', 'lightgoldenrodyellow');
	/* 添加最高分信息 */
	$("#maxScore").html("总分最高的是:" + getMaxScore(jsonData));
}
/* 删除数据 */
function deleteData(num) {
	jsonData.sum.splice(num - 1, 1);
	$.each(jsonData.sum, function(i, n) {
		n.no = i + 1;
	})
	flushTable(jsonData);
}
/* 获取最高分人的姓名 */
function getMaxScore(jsonData) {
	var max = -1;
	var maxName;
	$.each(jsonData.sum, function(i, n) {
		if (n.total > max) {
			max = n.total;
			maxName = n.name;
		}
	})
	return maxName+"("+max+")";
}
