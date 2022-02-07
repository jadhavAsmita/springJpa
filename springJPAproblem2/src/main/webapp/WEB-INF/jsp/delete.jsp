<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Details</title>
<style>
.main {
	display: flex;
	flex-direction: column;
	align-items: center;
	text-align: center;
}
</style>
</head>
<body>
	<div class="main">
		<h1>Delete Data</h1>
		<form action="deleted" method="get">
			<table>
				<tr>
					<td><input type="number" name="id" placeholder="ID"></td>
				</tr>
				<tr></tr>
				<tr>
					<td><input type="submit" value="Delete"></td>
				</tr>
			</table>
		</form>
		<h5>
			<a href="/home">go to Home Page</a>
		</h5>
	</div>
</body>
</html>