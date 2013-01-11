<!DOCTYPE html>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    
	<link rel="stylesheet" type="text/css" href="resources/css/stylePage.css" />
	<link href='http://fonts.googleapis.com/css?family=Mouse+Memoirs' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Denk+One|Mouse+Memoirs' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Fredoka+One|Titillium+Web:400,700italic' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Londrina+Solid|Karla' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Unica+One' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Passion+One|Luckiest+Guy|Karla' rel='stylesheet' type='text/css'>
	<link href='http://fonts.googleapis.com/css?family=Swanky+and+Moo+Moo' rel='stylesheet' type='text/css'>
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
    
</head>
<body>
	<tiles:insertAttribute name="menu" />
	<div id="content">
		<div id="containerForm">
			<tiles:insertAttribute name="header" />
		</div>
	</div>
	<div id="main">
		<tiles:insertAttribute name="body" />
	</div>
	<footer>   
		<div id="footer">
			<div id="footerContainer">
				<tiles:insertAttribute name="footer" />
			</div>
			<div id="space2">
				<a href="#" >Inicio</a>
				<span class="separator">/</span>
				<a href="#">Acerca de Kuku</a>
				<span class="separator">/</span>
				<a href="#">Foro</a>
				<span class="separator">/</span>
				<a href="#">Noticias</a>
				<p><span class="copyRight">&#169; Copyright 2012 Kuku dev. All rights reserved.</span></p>
			</div>
		</div>
	</footer>
</body>
</html>