
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Project Manager</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/dashboard.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="css/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="css/awesome_fonts.css" rel="stylesheet" type="text/css">
	
	<link href="css/signin.css" rel="stylesheet">
	

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Employee Name</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu message-dropdown">
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="img/1.png" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-footer">
                            <a href="#">Read All New Messages</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu alert-dropdown">
                        <li>
                            <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">View All</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="projectmanager_main.html"><i class="fa fa-fw fa-dashboard"></i> Profile</a>
                    </li>
                    <li>
                        <a href="pm_add_jobs.html"><i class="fa fa-fw fa-bar-chart-o"></i>Jobs</a>
                    </li>
                    <li>
                        <a href="pm_status.html"><i class="fa fa-fw fa-table"></i>Status</a>
                    </li>
					<li>
                        <a href="pm_can.html"><i class="fa fa-fw fa-table"></i>Candidates</a>
                    </li>
					<li>
                        <a href="pm_ref.html"><i class="fa fa-fw fa-table"></i>Referrals</a>
                    </li>
					<li>
                        <a href="pm_int.html"><i class="fa fa-fw fa-table"></i>Interviewers</a>
                    </li>
					<li>
                        <a href="pm_schedule_interview.html"><i class="fa fa-fw fa-table"></i>Schedule Interview</a>
                    </li>
					<li>
                        <a href="pm_assign_interviewer.html"><i class="fa fa-fw fa-table"></i>Assign Interview</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
				

    <div class="container">

      <form class="form-signin">
        <h2 class="form-signin-heading">Candidate Registration:</h2>
		<label> Name:</label>
        <input type="text" class="form-control" name="fname" placeholder="First Middle Last" required autofocus>

		<label > Gender:</label>
				<input type="radio" name="gender" value="male"> Male
				<input type="radio" name="gender" value="female"> Female
				<br>
		<label> Date of birth:</label>
        <input type="date" class="form-control" name="dob" required autofocus>

	<label> Contact:</label>
        <input type="text" class="form-control" name="contact" required autofocus>
		
		<label> Address:</label>
        <input type="text" class="form-control" name="address" required autofocus>

	<label> City:</label>
        <input type="text" class="form-control" name="city" required autofocus>
	<label> State:</label>
        <input type="text" class="form-control" name="state" required autofocus>
		
		<label> Email-id:</label>
        <input type="text" class="form-control" name="email" required autofocus>
		<label> Username:</label>
        <input type="text" class="form-control" name="username" required autofocus>
		<label> Password:</label>
        <input type="password" class="form-control" name="password" required autofocus>
		<label> Confirm Password:</label>
        <input type="password" class="form-control" name="confirm_password" required autofocus>

	 <h3 class="form-signin-heading">Government Id Proof:</h3>
		  <label> Id Type:</label>
		  <select class="form-control">
       <option value="PAN Card">PAN Card</option>
  <option value="AADHAAR Card">AADHAAR Card</option>
  <option value="password">Passport</option>
 
</select><br>
		<label> Id Number:</label>
		 <input type="text" class="form-control" name="cnumber" autofocus>
        
		
	
	<h3 class="form-signin-heading">Educational Details:</h3>
	<label> Qualification:</label>
        <input type="text" class="form-control" name="gradscore" required autofocus>
	
		
	<label> Score:</label>
        <input type="text" class="form-control" name="score" required autofocus>
		
		  <h3 class="form-signin-heading">Job Criteria:</h3>
	
	<label> Experience:</label>
        <input type="text" class="form-control" name="experience" required autofocus>
	<label> Designation:</label>
        <input type="text" class="form-control" name="designation" required autofocus>

	<div class="checkbox">
         
        </div>Upload Resume
        <input type="file" class="form-control" name="upload_resume" >
      </form>

        <button class="btn btn-lg btn-primary btn-block" style="max-width:370px;margin-left:490px" type="submit">Submit</button>
      </form>
    </div>
</div>	
</div>
    </div>
	</div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>
