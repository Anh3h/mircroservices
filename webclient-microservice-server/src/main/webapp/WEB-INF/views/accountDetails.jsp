<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="resources/styles/pivotal.css" />
	<title>spring-microservices: Account Details</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<a title="Spring IO" href="http://www.spring.io"> 
							<img src="resources/images/spring-trans-dark.png" height="50"/>
						</a>
					</div>
					<div>
						<ul class="nav navbar-nav navbar-right">
							<li>
								<a href="http://www.pivotal.io">
									<img alt="Pivotal" title="Pivotal" height="20" src="resources/images/pivotal-logo-600.png" />
								</a>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<div style="text-align: right">[ <a href="/">Home</a>
              | <a href="accountList">Accounts</a> ]</div>
		</div>
		
		<div class="row">
			
			<h1>Account Details</h1>
			
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-3">
						Account:
					</div>
					<div class="col-sm-9">
						${account.number}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						Name:
					</div>
					<div class="col-sm-9">
						${account.name}
					</div>
				</div>
				<div class="row">
					<div class="col-sm-3">
						Amount:
					</div>
					<div class="col-sm-9">
						${account.amount}
					</div>
				</div>
			</div>
								
		</div>

	</div>
</body>
</html>
