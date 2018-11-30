<html>
<head>
<title>SignUp Page</title>
<style>
         body {background-color:cornsilk;
         font-family: Arial, Helvetica, sans-serif;}
         * {box-sizing: border-box}
         input[type=text], input[type=password],input[type=email],input[type=tel] {
         width: 100%;
         padding: 10px;
         margin: 5px 0 22px 0;
         display: inline-block;
         border: none;
         background: #f1f1f1;
         }
	#submit
         {
         background-color: grey;
         color: white;
         padding: 14px 20px;
         margin: 8px 0;
         border: none;
         cursor: pointer;
         width: 30%;
         opacity: 2.9;
         }
         hr {
         border: 1px solid #f1f1f1;
         margin-bottom: 25px;
         }
         .container
         {
         padding : 15px;}
      </style>
</head>
<body background ="premium_keklaguna-45.jpg" alink="cyan" vlink="cyan"\>
<button onclick="goBack()">Go Back</button>
<script>
function goBack() {
    window.history.back();
}
</script>

<center><h1><b>SignUp</b></h1></center>


<center><img src="vu-hp-takeover-desktop.jpg"></center>
<form name="form" style="border:1px solid #ccc" action="InfoAdd" method="post">
         <div class="container">
            <center><h2>Sign Up</h2></center>
            <center><p>Please fill in this form to create an account.</p></center>
            <hr>
            <label for="Name" ><b>Name</b></label><br>
            <input type="text" placeholder="Enter your Name"  name="Name" minlength=4 required>
            <br><label for="email" ><b>Email</b></label><br>
            <input type="email" placeholder="Enter your Email" name ="email" required>
            <br><label for="password" ><b>Password</b></label><br>
            <input type="password" placeholder="Password" name="password" minlength=6 required> 
            <br><label for="confirm"><b>Confirm Password</b></label><br>
            <input type="password" placeholder="Confirm Password" name="confirm">
            <br><label for="phone" ><b>Mobile Number</b></label><br>
            <input type="tel" placeholder="Enter your Mobile number"  name="phone" minlength=10 maxlength=10 required>
            <br><label for="address" ><b>Address</b></label><br>
            <input type="text" placeholder="Enter your Address" name="address" required>
            <br>
            <center> <input type="submit" id="submit" value ="Signup" name="submit"> </center>
         </div>
      </form></body>
</html>

