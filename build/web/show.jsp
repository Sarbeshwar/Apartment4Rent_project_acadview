<%@page import="java.util.Iterator"%>
<%@page import="Database.SearchBean"%>
<%@page import="java.util.ArrayList"%>
<% ArrayList<SearchBean> ar=(ArrayList<SearchBean>)request.getAttribute("Sarbi");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search_Output</title>
        <style>
.footer
{
  color:white;
  padding:20px;
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
        <button onclick="goBack()">Go Back</button>
<script>
function goBack() {
    window.history.back();
}
</script>
        <div style = "text-align:right; float:right">
        </div>
        <center><b><h1><p>Results as per your Request</p></h1></b></center>
        <center><img src="vu-hp-takeover-desktop.jpg"style="margin-bottom: 20px;"></center>
        <center>
        <% if(!ar.isEmpty())
        {
            for(int i=0;i<ar.size();i++)
            {
        %>
        <h2>Firstname:<%=ar.get(i).getFirstname()%><br>
        Lastname:<%=ar.get(i).getLastname()%><br>
        Address:<%=ar.get(i).getAddress()%><br>
        State:<%=ar.get(i).getState()%><br>
        Apartment Size:<%=ar.get(i).getSize()%><br>
        Email:<%=ar.get(i).getEmail()%><br>
        Postal Code:<%=ar.get(i).getZip()%><br></h2>
        <br>
        <br>
        <%}}%></center>
    </
</html>
</