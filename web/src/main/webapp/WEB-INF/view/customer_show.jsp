<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详细信息</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<tr><td>姓名</td><td>${customer.name}</td></tr>
			<tr><td>联系人</td><td>${customer.contact}</td></tr>
			<tr><td>电话</td><td>${customer.phone}</td></tr>
			<tr><td>邮箱</td><td>${customer.email}</td></tr>
			<tr><td>备注</td><td>${customer.remark}</td></tr>
			<tr><td><a href="javascript:doit();">doit</a></td><td></td></tr>
		</tbody>
	</table>
	<script type="text/javascript" src="asset/static/jquery-1.11.0.min.js"></script>
	<script type="text/javascript">
		function doit(){
		    alert("get");
		    $.ajax({
		        url:"/web/doit",
		        success:function(res) {
		            alert(res.result);
		        },
		        error:function(){
		            
		        }
		    });
		}
	</script>
</body>
</html>