
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Job Requirements</title>

    <!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug
    <link href="css/login.css" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <body>
    <div class="container">

      <form class="form-signin" method="post" action="AddJobServlet">
        <h2 class="form-signin-heading">Job Requirements Details:</h2>
	
	<label> Posted By:</label>
        <input type="text" class="form-control" name="E_ID" required>

	<label> Job Title: </label>
        <input type="text" class="form-control" name="job_title" required autofocus>
		<label> Job Description: </label>
        <textarea rows="10" cols="50" name="job_description" class="form-control">
		</textarea>
		<label>Expiry Date:</label>
		<input type="date" class="form-control" name="expiry_date" required>

    <label> Domain:</label>
        <input type="text" class="form-control" name="domain" required>


	<label> Experience</label>
        <input type="text" class="form-control" name="experience" required autofocus>
	
	<label> Skill Set</label>
        <input type="text" class="form-control" name="skill_set" required autofocus>

	<label> Location</label>
        <input type="text" class="form-control" name="location" required autofocus>
	<button class="btn btn-lg btn-primary btn-block" style="max-width:300px ; margin-left:525px" type="submit">Submit</button>
         </form> 
        </div>
         
 
  
       
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
