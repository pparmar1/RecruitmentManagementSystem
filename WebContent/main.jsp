
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Atos</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Theme CSS -->
<link href="css/main.css" rel="stylesheet">
<!--Slideshow css-->
<link href="css/slideshow.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">

</head>

<body id="page-top" class="index">
	<div id="skipnav">
		<a href="#maincontent"></a>
	</div>

	<!-- Navigation -->
	<nav id="mainNav"
		class="navbar navbar-default navbar-fixed-top navbar-custom">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> Menu <i
						class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="#page-top"></a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">

				<!-- <ul class="nav navbar-nav navbar-right">
                    <li>
                       <img src="img/atoslogo.png" style="width:100% height:100%"> 
                    </li> -->

				<ul class="nav navbar-nav navbar-right">
					<li class="hidden"><a href="#page-top"></a></li>
					<!--  <li class="page-scroll">
                        <a href="#portfolio">Portfolio</a>
                    </li> -->
					<li class="page-scroll"><a href="#portfolio">Login</a></li>
					<li class="page-scroll"><a href="#about">About</a></li>
					<li class="page-scroll"><a href="#contact">Contact</a></li>
					<!-- 					 <li class="page-scroll">
                        <a href="login_admin.html">Admin Login</a>
                    </li> -->
				</ul>
			</div>
		</div>
	</nav>
	<header>
		<div class="container" id="maincontent" tabindex="-1">
			<div class="row">
				<div class="col-lg-12">
					<img class="img-responsive" alt="">
					<div class="intro-text">
						<!-- 					                        <hr class="star-light"> -->

						<!--Slide Show -->
						<div class="slideshow-container">

							<div class="mySlides fade">
								<div class="numbertext"></div>
								<img src="img/canopy.jpg" style="width: 100% height:100%">
								<div class="text"></div>
							</div>

							<div class="mySlides fade">
								<div class="numbertext"></div>
								<img src="img/atos3.png" style="width: 100% height:100%">
								<div class="text"></div>
							</div>

							<div class="mySlides fade">
								<div class="numbertext"></div>
								<img src="img/canopy.jpg" style="width: 100% height:100%">
								<div class="text"></div>
							</div>

						</div>
						<br>

						<div style="text-align: center; margin: 100px 0px 0px 0px;">
							<span class="dot"></span> <span class="dot"></span> <span
								class="dot"></span>
						</div>

						<script>
							var slideIndex = 0;
							showSlides();

							function showSlides() {
								var i;
								var slides = document
										.getElementsByClassName("mySlides");
								var dots = document
										.getElementsByClassName("dot");
								for (i = 0; i < slides.length; i++) {
									slides[i].style.display = "none";
								}
								slideIndex++;
								if (slideIndex > slides.length) {
									slideIndex = 1
								}
								for (i = 0; i < dots.length; i++) {
									dots[i].className = dots[i].className
											.replace(" active", "");
								}
								slides[slideIndex - 1].style.display = "block";
								dots[slideIndex - 1].className += " active";
								setTimeout(showSlides, 2000); // Change image every 2 seconds
							}
						</script>


						<h1 class="name" style="margin: 20px">Atos Recruitment</h1>

					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- Portfolio Grid Section -->
	<section id="portfolio">
		<div class="container" style="margin-bottom: -400px">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2>Login</h2>
					<hr class="star-primary">
				</div>
			</div>
			<div class="col-sm-4 portfolio-item">
				<a href="#portfolioModal2" class="portfolio-link"
					data-toggle="modal">
					<div class="caption">
						<div class="caption-content">
							<i class="fa fa-search-plus fa-3x"></i>
						</div>
					</div> <a href="login_employee.jsp"> <img src="img/employee2.jpg"
						class="img-responsive"></a>
					<div style="margin: 0px 100px 500px 75px">
						<h4>Employee</h4>
					</div>
			</div>

			<div class="col-sm-4 portfolio-item">
				<a href="#portfolioModal2" class="portfolio-link"
					data-toggle="modal"/>
					<div class="caption" style="margin: 500px 100px 0px 0px">
						<div class="caption-content">
							<i class="fa fa-search-plus fa-3x"></i>
						</div>
					</div> <a href="login_candidate.jsp" > <img src="img/candidate1.png"
						class="img-responsive" target="login_candidate.html" style="margin-left: 420px"></img>
				</a>
					<div style="margin-left:500px">
						<h4>Candidate</h4>
					</div>
			</div>
			<div class="col-sm-4 portfolio-item">
	</section>
	<section class="success" id="about">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2
						style="padding: 0px; margin: 0px 40px 30px 30px; border-top: 0px">About</h2>
					<hr class="star-light">
				</div>
				<div class="row">
					<div class="col-lg-4 col-lg-offset-2">Atos India is a
						subsidiary of Atos SE – head quartered in Paris, France – a
						leader in digital services serving a global client base. Atos is
						present in India since 1991, operating as a strategic Global
						Delivery Center for clients from a wide range of industry
						verticals across Europe, Americas, Asia Pacific and Middle East.
						Atos has also established itself as a key technology partner to
						some of the leading industries in the Indian subcontinent.</div>
					<div class="col-lg-4">Our experience and expertise spans
						across industry verticals such as MRT, FS, TMU, Engineering,
						Public, Health and Education with focus on enabling Digital
						Transformation, Technology Transformation Services, Applications
						Services , IT Infrastructure Services, Big Data and Cyber Security
						and High Performance Computing. Through Worldline , an Atos
						company, we provide unrivalled expertise in e-payments and digital
						solutions. We are also the largest authorized SAP training partner
						in India with seven training centers.</div>
					<div class="col-lg-8 col-lg-offset-2 text-center">
						<a href="https://atos.net/en/india" class="btn btn-lg btn-outline"
							target="_blank"> <i class="fa fa-download"></i> Atos India
						</a>
					</div>
				</div>
			</div>
	</section>

	<!-- Contact Section -->







	<!-- Footer -->
	<section id="contact">
		<footer class="text-center">
			<div class="footer-above">
				<div class="container">
					<div class="row">
						<div class="footer-col col-md-4">
							<h3>Mumbai Location</h3>
							<p>
								Gate No. 2, Plant No. 5, </br> Pirojshanagar, LBS Marg </br> Vikhroli (W),
								Mumbai: 400079 </br> Maharashtra, India <br>Beverly Hills, CA
								90210
							</p>
						</div>

						<div class="footer-col col-md-4"
							style="margin: 0px 0px 100px 300px">
							<h3>Contact</h3>
							<p>
								Tel- (022) 6733 3400 </br> Fax- (022) 6733 3401
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="footer-below">
				<div class="container">
					<div class="row">
						<div class="col-lg-12">Atos India Pvt Ltd.</div>
					</div>
				</div>
			</div>
		</footer>

		<!-- jQuery -->
		<script src="vendor/jquery/jquery.min.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

		<!-- Plugin JavaScript -->
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

		<!-- Contact Form JavaScript -->
		<script src="js/jqBootstrapValidation.js"></script>
		<script src="js/contact_me.js"></script>

		<!-- Theme JavaScript -->
		<script src="js/main1.js"></script>
</body>

</html>
