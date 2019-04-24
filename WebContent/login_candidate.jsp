
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Signin</title>

    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <body>

  
    <div class="container">

      <form class="form-signin" action="LoginCandidate" method="post">
	  <a href="candidate_registration.jsp">New user? Sign up</a>
        <h2 class="form-signin-heading">Please sign in</h2>
        
        <label for="userName" class="sr-only">UserName</label>
        <input type="text" id="userName" class="form-control" placeholder="User Name" name="username"  required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" name = "password" required>
       <!--  <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label> -->
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button></br>
        
      </form>

    </div>
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
