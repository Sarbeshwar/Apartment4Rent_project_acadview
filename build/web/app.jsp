<html>
<head>
<title>Apartment4rent</title>
<style>
* {box-sizing:border-box}
body {font-family: Verdana,sans-serif;}
.mySlides {display:none}


.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}
.footer
{
  color:white;
  padding:20px;
}   

.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}


.dot {
  height: 13px;
  width: 13px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}


.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 0.5s;
  animation-name: fade;
  animation-duration: 0.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}


@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}
#RI {
    width: 20em;  height: 2em;
}
#RO {
    width: 20em;  height: 2em;
}
</style>

</head>
<body background ="premium_keklaguna-45.jpg">
<div style = "text-align:right; float:right">
</div>
<center><b><h1><p>Appartment4Rent</p></h1></b></center>
<h2><center>Luxury, Location and Convenience.</center></h2>
<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 5</div>
  <img src="Beautiful_Luxury_House_with_Swiming_Pool_Wallpapers_for_Desktop.jpg" style="width:100%">
  <div class="text">Appartment4Rent</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 5</div>
  <img src="best-indian-house-models-Photo6.jpg" style="width:100%">
  <div class="text">Appartment4Rent</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 5</div>
  <img src="Simply_Amazing_Blue_and_White_Home_Interior_Wallpapers.jpg" style="width:100%">
  <div class="text">Appartment4Rent</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">4 / 5</div>
  <img src="thumb-1920-435117.jpg" style="width:100%">
  <div class="text">Appartment4Rent</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">5 / 5</div>
  <img src="indian-architectural-designs-house-plans.jpg" style="width:100%">
  <div class="text">Appartment4Rent</div>
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span>
  <span class="dot"></span>
  <span class="dot"></span>   
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex> slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000);
}
</script>
<center><h1><b>Discover Your Perfect Rental..</b></h1></center>
<center><img src="vu-hp-takeover-desktop.jpg"style="margin-bottom: 20px;"></center>
<center><h3><p>Find Your Perfect Apartment</p></h3></center>
<center><h3><p>OR</p></h3></center>
<center><h3><p>Rent Out Your Apartment</p></h3></center>
<form>
<center>
<input type="button" id="RI" value="Rent In/Rent Out" onclick="window.location.href='RI&RO.jsp'"/>
</center>
<br>
<div class="footer">
<div>
<div>Copyright 2018 © Appart4Rent. All rights reserved.
<a href="#" style="float:right;"></a>
</div>
</div>
</div>
</form>
</body>
</html>