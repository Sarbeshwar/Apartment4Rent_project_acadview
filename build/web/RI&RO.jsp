<html>
<head>
<title>RI&RO</title>
<style>
#RI {
    width: 20em;  height: 2em;
}
#RO {
    width: 20em;  height: 2em;
}
</style>
</head>
<body background ="premium_keklaguna-45.jpg" alink="cyan" vlink="cyan"\>
<button onclick="goBack()">Go Back</button>
<script>
function goBack() {
    window.history.back();
}
</script>
<center><h1><b>Log In Or Create A New Account</b></h1></center>
<center><img src="vu-hp-takeover-desktop.jpg"></center>
<form>
<br>
<center>
<input type="button" id="RI" value="LOG IN" onclick="window.location.href='login.jsp'"/>
</center>
<br>
<center>
<input type="button" id="RO" value="SIGNUP" onclick="window.location.href='Signup.jsp'"/>
</center>
</form>
</body>
</html>