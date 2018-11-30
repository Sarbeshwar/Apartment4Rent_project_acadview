<html>
<head>
<title>Upload Search Prompt</title>
<style>
body {background-color: background;
         font-family: Arial, Helvetica, sans-serif;}
         form {border: 4px solid black;
         text-align:center;
         }

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

<center><h1><b>Rent In Your Apartment</b></h1></center>


<center><img src="vu-hp-takeover-desktop.jpg"></center>
<br>
<center><p><h2><b>Please Fill This Form</b></h2></p></center>
<br>
<br>
<form action="apartment_rentServlet" method="post">
  <b>Name:</b>
  <input type="text" name="firstname" value="First">
  <input type="text" name="lastname" value="Last">
  <br>
<br>
  <b>Email:</b>
  <input type="email" name="email">
  <br>
<br>  
<b>Current Address:</b>
  <input type="text" name="address"> <input type="text" value="State" name="state"> <input type="text" value="Zip/Postal" name="zip">
<br>  
<br>
  <b>Apartment Size:</b>
  <select name="Size">
    <option value="1BHK">1BHK</option>
    <option value="2BHK">2BHK</option>
    <option value="3BHK">3BHK</option>
    <option value="4BHK">4BHK</option>
  </select>
<br>  
<br>
  <b>Renting To:</b>
  <select name="Specification">
    <option value="Family">Family</option>
    <option value="Students">Students</option>
    <option value="Bachelors">Bachelors</option>
    <option value="No Specification">No Specification</option>
  </select>
<br>  
<br>
  <b>Expecting Rent:</b>
  <input type="text" name="rent">
<br>  
<br>
  <b>Rental Tenure:</b>
  <input type="text" name="tenure">
<br>  
<br>
<button type="submit" class="registerbtn">Submit</button>
</form>
</body>
</html>