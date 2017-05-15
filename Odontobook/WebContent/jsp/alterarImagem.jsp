<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <c:set var="usuario" value="${login}"/>
	<c:if test="${usuario == null || empty usuario }">
	
		<c:redirect url="/default.jsp"/>
	
	</c:if>  
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Foto</title>
   <style rel="stylesheet" type="text/css">
   body
   {
   	background-image: url("../img/body-bg.jpg");
   	background-repeat: repeat-x;
   
   }
   	.art-button
   	{
   		border: 1px solid black;
   		color: white;
   		background-color: #006369;
   		width: 300px;
   	
   	}
   	#img
   	{
   		border: 2px solid black;
   	
   	
   	}

   </style>
</head>
<body>
<form method='POST' enctype='multipart/form-data' action='alterarFoto.ctrl'>
<table>
	<tr>
		<td><img id="img" src="${pageContext.request.contextPath}/img/noimage.jpg" width="100"></img><br> </td>
	</tr>
	<tr>
		<td>	<input type=file name=upfile ><br> </td>
	</tr>
</table>


<br>
<INPUT TYPE="submit" name="acao" id="botao" value="Gravar"
	class="art-button" CHECKED />
</form>
</html>