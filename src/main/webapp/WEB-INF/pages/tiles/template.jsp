<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><tiles:insertAttribute name="title"/></title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300|Aldrich' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Dosis|Orbitron|Share+Tech+Mono' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Cuprum' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Electrolize' rel='stylesheet' type='text/css'>
</head>
<body>
	
	<div id="page">
		<header>
			<div id="MainBar">
				<img id="logo" src="resources/img/logo.png" alt="Logo Kuku's software">
				<tiles:insertAttribute name="viewProfile"/>
			</div>
			<nav>
            	<ul>
                	<li><a href="#">Home</a></li>
                    <li><a href="#">Programming</a></li>
                    <li><a href="#">Security</a></li>
                    <li><a href="#">Networking</a></li>
                    <li><a href="#">Operating systems</a></li>
                    <li><a href="#">About us</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </nav>
		</header>
	</div>
</body>
</html>