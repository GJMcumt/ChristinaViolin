<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	 <link rel="stylesheet" type="text/css" href="stylesheet/css/bootstrap.min.css">
	  <script src="stylesheet/jquery/jquery-3.2.1.js"></script>
    <script src="stylesheet/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="stylesheet/css/style.css">
<style type="text/css">
	table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
	th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
	th{font-weight:bold;background:#ccc;}
</style>
</head>
<body>
<div class="container-fluid">
	<div class="banner">
		<div class="span1">
			Welcome christinaviolin.com 
		</div>
		<div class="span2">
			<ul class="breadcrumb">
				<li>
					Hi ${sessionScope["user_session"]["user_name"]}<span class="divider"></span>
				</li>
				<li>
					<a href="index">[Sign out]</a> <span class="divider"></span>
				</li>
				<li>
					<a href="#">My order</a> <span class="divider"></span>
				</li>
				<li>
					<a href="#">About us</a> <span class="divider"></span>
				</li>
				<li>
					<a href="#">Feedback</a> <span class="divider"></span>
				</li>
				<li>
					<a href="#">Helpcenter</a> <span class="divider"></span>
				</li>
								
			</ul>
		</div>
	</div>
	<div class="logo">
		<div class="span3">
			<img alt="Christina" src="images/logo.png" />
		</div>
		<div class="span4">
			<form class="form-search">
				<input class="input-medium search-query" type="text" /> <button class="btn" type="submit"></button>
			</form>
		</div>
	</div>
	<div class="nav">
		<div class="span5">
			<div class="btn-group">

		</div>
	</div>
	<div class="content">
		<div class="span7">
			<div class="row-fluid">
				<div class="span8">
					<div class="row-fluid">
						<div class="span9">
							<ul >
								<li class="nav-header">
									商品管理
								</li>
								<li class="active">
									<a href="#">查询商品</a>
								</li>
								<li>
									<a href="#">添加商品</a>
								</li>
								<li>
									<a href="#">删除商品</a>
								</li>

							</ul>
						</div>
					</div>

					<div class="row-fluid">

					</div>
				</div>
		<div class="span12">
			
<table border="1">
	<tr>
		<th>goods_name</th> <th>price</th> <th>describe</th> <th>images</th> <th>update</th>
	</tr>
	<c:forEach items="${requestScope.book_list }" var="">
		<tr>
			<td></td>
			<td>${book.name }</td>
			<td>${book.author }</td>
			<td><img src="images/${goods.image }" height="60"></td>
			<td><a href="updateGoods">编辑</a></td>
		</tr>
	</c:forEach>
</table>
		</div>
	<div class="footer">
		<div class="footer">
			<img alt="140x140" src="images/christinaviolinfooter.jpg" />
		</div>
	</div>
</div>
</body>
</html>