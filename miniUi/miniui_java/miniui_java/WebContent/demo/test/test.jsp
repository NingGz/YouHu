<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String rootpath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>jQuery MiniUI 学习Demo</title>

<script src="../../scripts/boot.js" type="text/javascript"></script> 
    <style>
    html,body{
       height:100%;width:100%;padding:0;margi:0;
    }
    </style>
</head>
<body>
	<div id="layout1" class="mini-layout" style="width: 100%; height: 100%;">
		<!-- Header部分开始 -->
		<div class="header" region="north" height="50" showSplit="false" showHeader="false">
			<h1 style="margin: 0; margin-top: 10px; margin-left: 10px; color: #FFF; cursor: default; font-family: 微软雅黑, 黑体, 宋体;">视频联网报警平台V2.0</h1>
			<div style="position: absolute; top: 20px; right: 1px;">
				<input id="input1" type="button" class="HDMenubtn" value="切换1" /> 
				<input id="input2" type="button" class="HDMenubtn" value="切换2" /> 
				<input id="input3" type="button" class="HDMenubtn" value="切换3" /> 
				<input id="input4" type="button" class="HDMenubtn" value="切换4" /> 
				<input id="input5" type="button" class="HDMenubtn" value="切换5" /> 
				<input id="input6" type="button" class="HDMenubtn" value="切换6" /> 
				<input id="input7" type="button" class="HDMenubtn" value="切换7" />
			</div>
		</div>
		<!-- Header部分结束 -->
		<!-- 版权部分开始 -->
		<div title="south" region="south" style="background-color: #3A83C3" ; showSplit="false" showHeader="false" height="30">
			<div style="line-height: 28px; color: #FFF; text-align: center; cursor: default">Copyright ? </div>
		</div>
		<div title="center" region="center" style="border: 0;" bodyStyle="overflow:hidden;">
			<div id="HdDiv1" style="display: black; border: 1px; width: 100%; height: 100%">
				<div class="mini-splitter" style="width: 100%; height: 100%;" borderStyle="border-style: solid;border-top-width:0;border-right-width:0">
					<div size="220" maxSize="250" minSize="100" showCollapseButton="true">
						<div id="leftTree" borderStyle="border-style: solid;border-width:1px 0 0 0;" class="mini-outlooktree" url="<%=rootpath%>/outlooktree.txt" onnodeclick="onItemSelect" textField="text" idField="id"
							parentField="pid" expandOnLoad="1"></div>
					</div>
					<div showCollapseButton="false" style="border: 0">
						<div class="mini-splitter" vertical="true" style="width: 100%; height: 100%;" borderStyle="border:0px">
							<div size="85.5%" showCollapseButton="false" style="border: 0">
								<iframe id="mainframe" frameborder="0" name="main" style="width: 100%; height: 100%;" border="0"></iframe>
							</div>
							<div showCollapseButton="true" borderStyle="border:1px">
								<jsp:include page="1.jsp" flush="true"></jsp:include>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="HdDiv2" style="display: none; border: 1px; width: 100%; height: 100%">
			
			<div style="position:absolute;right:12px;top:0px;font-size:12px;line-height:25px;font-weight:normal;color:#ffffff;">
		            <span class="hd-groom" >（推荐Blue）</span><span class="hd-SelectSkip">选择皮肤：</span>
		            <select id="selectSkin" onchange="onSkinChange(this.value)" style="width:100px;" >
		            	<option value="hd_blue">HD_Blue</option>
		                <option value="hd_gray">Gray</option>
		                <option value="hd_olive2003">Olive2003</option>
		                <option value="hd_green">HD_green</option>
		                
		            </select>
	        </div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var rootpath='<%=rootpath%>';
		mini.parse();		

		var iframe = document.getElementById("mainframe");
		iframe.src = "<%=rootpath%>/datagrid.html"

		function onItemSelect(e) {
			var node = e.node;
			var isLeaf = e.isLeaf;

			if (isLeaf) {
				iframe.src = rootpath + node.F_URL;
			}
		}

		//菜单单机事件
		$('input').click(function() {
			var aObj = this.id;
			var aId = null;
			var arr1 = [ "1", "2", "3", "4", "5", "6", "7" ];
			$.each(arr1, function(i, val) {
				if (aObj == "input" + val) {
					$("#input" + val).addClass("HDMenubtnSel");
					aId = "#HdDiv" + val;
					$(aId).show();
					mini.layout();
				} else {
					$("#input" + val).removeClass("HDMenubtnSel");
					$("#input" + val).addClass("HDMenubtn");
					aId = "#HdDiv" + val;
					$(aId).hide();
				}
			});
		});

		//菜单光标移动事件
		$(document).ready(function() {
			//默认第一个标签为选中状态
			$("#input1").addClass("HDMenubtnSel");
			var arr1 = [ "1", "2", "3", "4", "5", "6", "7" ];
			$.each(arr1, function(i, val) {
				$("#input" + val).mousemove(function() {
					$("#input" + val).addClass("HDMenubtnleave");
					$("#input" + val).removeClass("HDMenubtn");
				});
				$("#input" + val).mouseleave(function() {
					$("#input" + val).addClass("HDMenubtn");
					$("#input" + val).removeClass("HDMenubtnleave");
				});
			});
		});
	</script>
</body>
</html>
