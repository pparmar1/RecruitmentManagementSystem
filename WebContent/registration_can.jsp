
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

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug
    <link href="css/login.css" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">

      <form class="form-signin">
        <h2 class="form-signin-heading">Please Register</h2>
		<label> First Name</label>
        <input type="text" class="form-control" name="fname"  required >
       <label> Middle Name</label>
        <input type="text" class="form-control" name="mname" required>
				<label> Last Name</label>
        <input type="text" class="form-control" name="lname"  required autofocus>
				<label> Email</label>
        <input type="text" class="form-control" name="email"required autofocus>
				<label> Contact</label>
        <input type="text" class="form-control" name="contact" required autofocus>
				<label> Password</label>
        <input type="password" class="form-control" name="password"  required autofocus>
				<label>Confirm Password</label>
        <input type="text" class="form-control" name="confirm_password"required autofocus>
        <div class="checkbox">
         
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
      </form>

    </div>
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
