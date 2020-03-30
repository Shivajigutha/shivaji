<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
	<div>
	<h1>profile Info</h1> 
	
		<jsp:useBean id="profileInformation" class="com.jpa.UserActions"/> 
		<p> the data info is <% profileInformation.getEmail(); %></p>
		
			<table>
				<tr align="center">
					<td>Fullname</td>
					<td><p><jsp:getProperty name = "profileInformation" property = "fullname"/>
					</p>
					<!-- <input type="text" placeholder='< jsp:getProperty name = "data" property = "fullname"/>' > -->
						</td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" placeholder="<s:property value="email"/>"
						readonly="readonly"></td>
				</tr>
				<tr>
					<td>Phone number</td>
					<td><input type="text" placeholder="<s:property value="phone"/>"
						readonly="readonly"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="text" placeholder="<s:property value="gender"/>"
						readonly="readonly"></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" placeholder="<s:property value="age"/>"
						readonly="readonly"></td>
				</tr>
				<tr>
					<td>GPA</td>
					<td><input type="text" placeholder="<s:property value="gpa"/>"
						readonly="readonly"></td>
				</tr>
				<tr>
					<td>Years of Experience</td>
					<td><input type="text" placeholder="<s:property value="experience"/>"
						readonly="readonly"></td>
				</tr>
				
			</table>
			
	
		</div>

</body>
</html>