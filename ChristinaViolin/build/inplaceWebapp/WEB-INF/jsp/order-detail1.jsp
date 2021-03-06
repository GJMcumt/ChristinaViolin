<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
 	<link rel="stylesheet" type="text/css" href="stylesheet/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="stylesheet/css/style.css">
    <script src="stylesheet/jquery/jquery-3.2.1.js"></script>
    <script src="stylesheet/js/bootstrap.min.js"></script>
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
		   			<a href="my_cart">My cart</a> <span class="divider"></span>
		    	</li>
		    	<li>
		    		<a href="my_order">My order</a> <span class="divider"></span>
		    	</li>
				<li>
					<a href="AllCol">My collection</a> <span class="divider"></span>
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
								<li class="active">
									<a href="alter-goods">Management-Products</a>
								</li>
								<li>
								<a href="select_goods">
									Find Productions
								</a>
								</li>
								<li>
								<a href="addGoods">
									Add Productions
								</a>
								</li>

							</ul>
							<ul >
								<li class="active">
									Management-Orders
								</li>
								<li>
								<a href="#">
									Order-detail
								</a>
								</li>
							</ul>
							<ul >
								<li class="active">
									Management-Users
								</li>
								<li>
								<a href="#">
									All Users
								</a>
								</li>
							</ul>								
						</div>
						<div class="spanx"></div>
					</div>

					<div class="row-fluid">

					</div>
				</div>
				<div class="span"></div>
		<div class="cart">
		<h3>Order detail</h3>
			<form action="delete_order" method="post">
				<table>				
				<tr>
					<th>订单号</th><th>商品名称</th><th>价格</th><th>数量</th><th>收货地址</th><th>订单状态</th><th>下单时间</th>
				</tr>				
					<tr>
						<td><input type="text" name="order_sn" value="${sessionScope.order.order_sn}" readonly/></td>
						<td>${sessionScope.order_detail.goods_name}</td>
						<td>${sessionScope.order_detail.price}</td>
						<td>${sessionScope.order_detail.buy_count }</td>
						<td>${sessionScope.order.address}</td>
						<td>${sessionScope.order.order_status}</td>
						<td>${sessionScope.order.order_datetime}</td>
					</tr>
				</table>	
				<input type="submit" value="删除">
				<input type="hidden" name="user_id" value="${sessionScope.order.user_id }"/>
				<button type="submit" formaction="deliver" formmethod="post">发货</button>
				<a href="updateOrder">修改订单信息</a>	
				</form>		
		</div>

	<div class="row-fluid">
		<div class="foota">
			<img alt="140x140" src="images/PROSERIES_01.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_02.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_03.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_04.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_05.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_06.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_07.jpg" />
		</div>
		<div class="footb">
			<img alt="140x140" src="images/PROSERIES_08.jpg" />
		</div>
		<div class="foota">
			<img alt="140x140" src="images/PROSERIES_09.jpg" />
		</div>
	</div>
	<div class="footer">
		<div class="footer">
			<img alt="140x140" src="images/christinaviolinfooter.jpg" />
		</div>
	</div>   
</div>
</body>
</html>