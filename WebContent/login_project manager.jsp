
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>PM Login Page</title>

    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">

      <form class="form-signin" action="candidate_main.html">
	<!--  <a href="">New user? Sign up</a> -->
        <h2 class="form-signin-heading">Login Page For Project Manager</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
          
          
        </div><br>
          <!-- <button  class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button></br>
        <button onclick="PmMainPage.jsp">Sign In</button><br>  -->
      <a href="PmMainPage.jsp" ><center>Sign In</center></a> <br> 
      
 		

      
        <a href="forgetpass.jsp" >Forgot Password? Click here</a>
      </form>

    </div>
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
