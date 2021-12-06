<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>Your Size Search</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <!-- owl stylesheets --> 
      <link rel="stylesheet" href="css/owl.carousel.min.css">
      <link rel="stylesheet" href="css/owl.theme.default.min.css">
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      
   </head>
   <!-- body -->
   <body class="main-layout">
      <!-- loader  -->
      <div class="loader_bg">
         <div class="loader"><img src="images/loading.gif" alt="#" /></div>
      </div>
    
      <header>
         
         <div class="header">
          
            <div id="h" class="container">
               <div class="row">
                  <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                     <div class="full">
                        <div class="center-desk">
                           <div class="logo"> <a href="index.html"><img src="images/logo.png" alt="#"></a> </div>
                        </div>
                     </div>
                  </div>
                  <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                     <div class="menu-area">
                        <div class="limit-box">
                           <nav class="main-menu">
                              <ul class="menu-area-main">
                                 <li class="active"> <a href="#h">Home</a> </li>
                                 <li> <a href="#about">Search</a> </li>
                                
                              </ul>
                           </nav>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <!-- end header inner -->
      </header>
      <!-- end header -->
      <section >
         <div class="banner-main">
            <img src="images/banner.jpg" alt="#"/>
            <div class="container">
               <div class="text-bg">
                  <h1>what's your size?<br><strong class="white">당신의 사이즈를 찾아드립니다.</strong></h1>
            
                
                  <div class="container">
                  
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- about -->
      <div id="about" class="about">
         <div class="container">
            <div class="row">
               <div class="col-md-12 ">
                  <div class="titlepage">
                     <h2>About our project</h2>
                     <span> 정형화된 사이즈를 제공하는 온라인 상점을 통해 잘못된 사이즈의 옷을 구매하는 실수를 피하는 데이터 제공합니다.<br> 이 데이터 세트를 사용하여 사이즈를 예측을 확인할 수 있습니다.</span>
                  </div>
               </div>
            </div>
         </div>
      
      </div>
         <div id="travel" class="traveling">
      <div class="titlepage">
                     <h2>Your Size Search</h2>
      </div>
      <form action="CalServlet" method="post" class="">
                        <h3>Find Your Size</h3>
                        <div class="row">
                           <div class="col-md-9">
                              <div class="row">
                                 <div class="col-xl-4 col-lg-4 col-md-4 col-sm-6 col-12">
                                    <label >Height (140.0 ~ 186.9)</label>
                                    <input class="form-control" placeholder="161.5" type="text" name="height" min="140" max="186">
                                 </div>
                                 <div class="col-xl-4 col-lg-4 col-md-4 col-sm-6 col-12">
                                    <label >Age (teen ~ sixty)</label>
                                    <input class="form-control" placeholder="25" type="text" name="age">
                                 </div>
                                 <div class="col-xl-4 col-lg-4 col-md-4 col-sm-6 col-12">
                                    <label >Weight (40.0 ~ 103.9)</label>
                                    <input class="form-control" placeholder="55" type="text" name="weight">
                                 </div>
                                  <div class="col-xl-4 col-lg-4 col-md-4 col-sm-6 col-12">
                                    <label >country (Korea, Japan, US, EU)</label>
                                    <input class="form-control" placeholder="Korea" type="text" name="country">
                                 </div> 
                                  <div class="col-xl-4 col-lg-4 col-md-4 col-sm-6 col-12">
                                    <label >algorithm (One-Rule, navie-bayes, J48)</label>
                                    <input class="form-control" placeholder="One-Rule" type="text" name="algori">
                                 </div> 
                                 
                               
                              </div>
                           </div>
                           <div class="col-xl-3 col-lg-3 col-md-3 col-sm-12 col-12">
                              <input type="submit" value =" search ">
                           </div>
                        </div>
                     </form>
       
      </div>
      
    <!--   <div id="ser" class="London">
       <div id="about" class="about">
         <div class="container">
            <div class="row">
               <div class="col-md-12 ">
                  <div class="titlepage">
                     <h2>Mining Result</h2>
                     <span> 당신의 사이즈를 탐색한 결과입니다.</span>
                  </div>
               </div>
            </div>
         </div>
         <div class="bg">
            <div class="container">
               <div class="row">
                  <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12">
                     <div class="about-box">
                        
                     </div>
                  </div>
               </div>
            </div>
            
         </div>
      </div>

      </div>
-->
      <footer>
         <div id="contact" class="footer">
          
               <div class="copyright">
                  <div class="container">
                     <p>Copyright 2019 All Right Reserved By <a href="https://html.design/">Free html Templates</a></p>
                  </div>
               </div>
            </div>
         </div>
      </footer>
      <!-- end footer -->
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/plugin.js"></script>
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
      <!-- javascript --> 
      <script src="js/owl.carousel.js"></script>
      <script>
         $(document).ready(function() {
           var owl = $('.owl-carousel');
           owl.owlCarousel({
             margin: 10,
             nav: true,
             loop: true,
             responsive: {
               0: {
                 items: 1
               },
               600: {
                 items: 2
               },
               1000: {
                 items: 3
               }
             }
           })
         })
      </script>
     
   </body>
</html>