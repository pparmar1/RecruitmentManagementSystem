
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

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug
    <link href="css/login.css" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">
	<h1 align= center> Employee Registration </h1>
      <form class="form-signin" action = UniqueUserNameValidation method ="post">
        <h2 class="form-signin-heading">Personal Details:</h2>
	
	<label> User Name:</label>
        <input type="text" class="form-control" name="user_name"  pattern="[a-zA-Z][a-zA-Z0-9\s]*" title="Please enter valid username" required autofocus>

	<label> Password:</label>
        <input type="password" class="form-control" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required autofocus>



	<label> Name:</label>
        <input type="text" class="form-control" name="fname" pattern="[a-zA-Z][a-zA-Z\s]*" title="Please enter valid name" required autofocus>

		<label> Gender:</label>
				<input type="radio" name="gender" value="male"> Male
				<input type="radio" name="gender" value="female"> Female
				<br>
		<label> Date of birth:</label>
        <input type="date" class="form-control" name="dob" required autofocus>

	<label> Contact:</label>
        <input type="tell" class="form-control" name="contact" pattern="[7-9]{1}[0-9]{9}" title="Please Enter a Valid 10 Digit Phone Number"  maxlength=10 required autofocus>
		
		<label>Email address</label>
	 <label for="inputEmail" class="sr-only">Email address</label>
      <input type="email" id="inputEmail" class="form-control" name="email"   pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Please enter a valid email" required autofocus>
       	
		<label> Address:</label>
        <input type="text" class="form-control" name="address" required autofocus>

	<label> Location:</label>
        <input type="text" class="form-control" name="location" required autofocus>

	<label> State:</label>
        <input type="text" class="form-control" name="state" required autofocus>

	 <h3 class="form-signin-heading">Government Id Proof:</h3>
		  <label> Id Type:</label>
		  <select id = "prooftype" name = "prooftype"  class="form-control" >
       <option value="PAN Card">PAN Card</option>
  <option value="AADHAAR Card">AADHAAR Card</option>
  <option value="password">Passport</option>
 
</select><br>
		<label> Id Number:</label>
		 <input type="text" class="form-control" name="pnumber" autofocus>
        
		
	<br>
	<h3 class="form-signin-heading">Educational Details:</h3>
	<label> Qualification:</label>
        <input type="text" class="form-control" name="gradscore" required autofocus>
	
		
	<label> Score:</label>
        <input type="text" class="form-control" name="score" pattern="[0-9]{2}" title="Please Enter a Valid Number" required autofocus>
	
		  <h3 class="form-signin-heading">Job Criteria:</h3>
	
	<label> Experience:</label>
        <input type="text" class="form-control" name="experience" pattern="[0-9]{1}" title="Please Enter a Valid Number" required autofocus>
	<label> Designation:</label>
        <input type="text" class="form-control" name="designation" required autofocus>

	<div class="checkbox">
         
        </div>
       
     	
	
		   
<div class="checkbox">
         
        </div>
       	 <!--  <button type="submit" class="btn btn-lg btn-primary btn-block" style="max-width:300px;margin-left:520px" onclick=>Submit</button> -->
    	 <!--  <input type="submit" value="submit"  class="btn btn-lg btn-primary btn-block" style="max-width:300px;margin-left:520px" > -->
      
      
      
       <input type="submit" value="Submit" class="btn btn-lg btn-primary btn-block"  style="max-width:400px;"/>
      
      
      </form>

    </div>
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
