
<head>
<title>Login Page</title>
<style>
         body {background-color: background;
         font-family: Arial, Helvetica, sans-serif;}
         form {border: 4px solid black;
         text-align:center;
         }
         input[type=email], input[type=password] {
         width: 60%;
         padding: 12px 20px;
         margin: 8px 0;
         display: inline-block;
         border: 1px solid #ccc;
         box-sizing: border-box;
         }
         .container {
         padding: 70px;
         }
      </style>
</head>

<button onclick="goBack()">Go Back</button>
<script>
function goBack() {
    window.history.back();
}
</script>
<p><h1 style="color:red;">${message}</h1></p>
<p><h1 style="color:green;">${SuccessMessage}</h1></p>
<center><h1><b>Login</b></h1></center>


<center><img src="vu-hp-takeover-desktop.jpg"></center>
<form action="LoginServlet" method="post">
         <div class="container">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label for="email"><b>Email</b></label>
            <input type="email" placeholder="Enter Email" name="email" required>
            <br>
            <br>
            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password" required>
            <br>
            <br>
            <p>By creating an account you agree to our Terms & Conditions</a>.</p>
            <input type="submit" class="registerbtn" name="submit" value="Login"> 
                           <p style="color:lemonchiffon;">Don't have an account? <a style="color:cyan;" href="Signup.jsp">Sign up</a>.</p>
            
         </div>
         </hr>
      </form>



