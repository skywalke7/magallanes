<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><tiles:insertAttribute name="title"/></title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300|Aldrich' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Dosis|Orbitron|Share+Tech+Mono' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Cuprum' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Electrolize' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
</head>

<body>
	<div id="page">
		
		<header>
		
			<div id="MainBar">
				
				<tiles:insertAttribute name="viewProfile"/>
				
			</div>
			
			<tiles:insertAttribute name="menu"/>
			
		</header>
		
		<section>
		
			<h1 class="TitleLastUpdates">Ultimas entradas</h1>
			
		</section>
		
		<aside>
		
			<h1 class="TitleRelatedPosts">Posts relacionados</h1>
		
			<ul>
				<li class="PostIndex"><a href="#" class="RelatedPostElement">Citrix, refresco para la menopausia</a></li>
				<li class="PostIndex"><a href="#" class="RelatedPostElement">Jabba el hutt demanda a Oracle por uso se nombre en lenguaje de programacion</a></li>
				<li class="PostIndex"><a href="#" class="RelatedPostElement">Wall-E afirma haber sido violado por el emblematico Android de Google</a></li>
				<li class="PostIndex"><a href="#" class="RelatedPostElement">Hacker mordio la manzana logo de Apple, presunto culpable afirma haber tenido hambre</a></li>
				<li class="PostIndex"><a href="#" class="RelatedPostElement">Se confirma la creacion de "ISO-Guajolota"", un nuevo estandar en el diseño de tortas de tamal"</a></li>
				<li class="PostIndex"><a href="#" class="RelatedPostElement">Qu hacr si no funciona una ltra d tu tclado</a></li>
			</ul>
		
		</aside>
	
	</div>
	
	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script src="resources/js/jquery.form.js"></script>
	<script src="resources/js/application.js"></script>
</body>
</html>