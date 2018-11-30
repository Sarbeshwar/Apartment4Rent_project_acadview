<html>
<head>
<title>Search Apartment</title>
<style>

#RI {
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

<center><h1><b>Search Your Desired Apartment</b></h1></center>


<center><img src="vu-hp-takeover-desktop.jpg"></center>
<br>
<center><p><h2><b>Please Fill This Form</b></h2></p></center>
<br>
<br>
<form method="post" action="SearchServlet">
<center>
<b>State:</b> 
<input type="text" name="state" value="Enter State">
<b>Size:</b>
<select name="Size">
    <option value="1BHK">1BHK</option>
    <option value="2BHK">2BHK</option>
    <option value="3BHK">3BHK</option>
    <option value="4BHK">4BHK</option>
  </select>
<br>
<br>

 <button type="submit" class="registerbtn">Submit

</center>
</form>

</body>
</html>