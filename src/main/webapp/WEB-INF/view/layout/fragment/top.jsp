<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/taglib.jsp"%>

<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">  
				<span class="icon-bar"></span>  
				<span class="icon-bar"></span>  
				<span class="icon-bar"></span>  
			</a>
			<a class="brand" href="/">Project name</a>
			
			<div class="nav-collapse">
				<ul class="nav">
					<c:choose>
						<c:when test="${url eq 'document'}"><li class="active"><a href="/document">Document</a></li></c:when>
						<c:otherwise><li><a href="/document">Document</a></li></c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${url eq 'profile'}"><li class="active"><a href="/profile">Profile</a></li></c:when>
						<c:otherwise><li><a href="/profile">Profile</a></li></c:otherwise>
					</c:choose>
					<li><form:form method="get" action="/search" class="navbar-search pull-left"><input type="text" class="search-query span2" name="q" placeholder="Search"></form:form></li>
				</ul>
				<ul class="nav pull-right">
					<li><a href="/signout" class="navbar-link">Sign Out</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>