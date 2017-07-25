<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
			
			<form class="form-horizontal" action="addItems" method="post" id="addItems">
	
				<div class="control-group">
					 <label class="control-label" for="inputId">goods_id</label>
					<div class="controls">
						<input id="inputId" type="text" name="goods_id"/>
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputName">goods_name</label>
					<div class="controls">
						<input id="inputName" type="text" name="goods_name"/>
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputType">type</label>
					<div class="controls">
						<select size="1" name="type">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
							<option>5</option>
							<option>6</option>
							<option>7</option>
						</select>
						说明：1(V-Junior)、2(V-Senior)、3(S-series)、4(EU-series)、5(EUMaster-series)、6(guita)、7(Bows)
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputPrice">price</label>
					<div class="controls">
						<input id="inputPrice" type="text" name="price"/>
					</div>
				</div>		
				<div class="control-group">
					 <label class="control-label" for="inputOther">describe</label>
					<div class="controls">
						<input id="inputOther" type="text" name="describe"/>
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputImage">image(填写图片的名字，如：xx.jpg)</label>
					<div class="controls">
						<input id="inputImage" type="text" name="images"/>
					</div>
				</div>
									
			</form>
		</div>
	<div class="footer">
		<div class="footer">
			<img alt="140x140" src="images/christinaviolinfooter.jpg" />
		</div>
	</div>
</div>
</body>
</html>