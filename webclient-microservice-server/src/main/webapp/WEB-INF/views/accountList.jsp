<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="resources/styles/pivotal.css" />
	<title>spring-microservices: Account List</title>
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
			<div style="text-align: right">[ <a href="/">Home</a> ]</div>
		</div>
		
		<div class="row">
			
			<h1>Account List</h1>
			
			<c:if test="${not empty lists}">
				<c:forEach items="${accounts}" var="account">
					<li>${accounts}</li>
					<li><a href="accountDetails?number=${account.number}">${account.name}</a></li>
				</c:forEach>
			</c:if>
					
		</div>
		
	</div>
</body>
</html>
