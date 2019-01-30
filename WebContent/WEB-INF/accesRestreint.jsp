<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Business Casual - Start Bootstrap Theme</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/business-casual.min.css" rel="stylesheet">

  </head>

  <body>

    <h1 class="site-heading text-center text-white d-none d-lg-block">
      <span class="site-heading-upper text-primary mb-3">welcome</span>
      <span class="site-heading-lower">hello</span>
    </h1>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark py-lg-4" id="mainNav">
      <div class="container">
        <a class="navbar-brand text-uppercase text-expanded font-weight-bold d-lg-none" href="#">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav mx-auto">
            <li class="nav-item active px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="#">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="/JEE2019_Groupe1-1/pagecreateurVrai.jsp">ma page</a>
            </li>            
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="dashboard.html">Dashboard</a>
            </li>
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="/JEE2019_Groupe1-1/plusieursutilisateur">explorer</a>
            </li>            
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="/JEE2019_Groupe1-1/user">mon profile</a>
            </li>
           
            <li class="nav-item px-lg-4">
              <a class="nav-link text-uppercase text-expanded" href="/JEE2019_Groupe1-1/deconnexion">se déconnecter</a>
            </li>            
            
          </ul>
        </div>
      </div>
    </nav>

    <section class="page-section clearfix">
      <div class="container">
        <div class="intro">
          <img class="intro-img img-fluid mb-3 mb-lg-0 rounded" src="img/intro.jpg" alt="">
          <div class="intro-text left-0 text-center bg-faded p-5 rounded">
            <h2 class="section-heading mb-4">
              <span class="section-heading-upper">my page</span>
              <span class="section-heading-lower">acceuil</span>
            </h2>
         <form action="" method="post" enctype="multipart/form-data">
        
        <div class="form-group">
        </div>
         
        <div class="form-group">
             <input type="text" class="form-input" name="titre"  placeholder="titre pub"/>
        </div>
        <br /> 
           <p>
             
             <textarea name="ameliorer" id="ameliorer" placeholder="Exprimez vous"></textarea>
           </p>
         <br />  
           
            <fieldset>
                <br />

                <label for="fichier">Emplacement du fichier <span class="requis">*</span></label>
                <input type="file" id="fichier" name="fichier" />
                <br />
                                
            </fieldset>
            <br />
            <input type="url" placeholder="http://" />
             <p>
       qui peut voir la pub<br />
            <input type="radio" name="rad" value="priv" id="priv" /> <label for="priv">Seuls abonnés</label><br />
            <input type="radio" name="rad" value="pub" id="pub" /> <label for="priv">Tout le monde</label><br />
       
             </p>
             
             
            
        </form> 
            <div class="intro-button mx-auto">
              <a class="btn btn-primary btn-xl" href="#">creer</a>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="page-section cta">
      <div class="container">
        <div class="row">
          <div class="col-xl-9 mx-auto">
            <div class="cta-inner text-center rounded">
              <h2 class="section-heading mb-4">
                <span class="section-heading-upper">Our Promise</span>
                <span class="section-heading-lower">To You</span>
              </h2>
              <p class="mb-0">text !</p>
            </div>
          </div>
        </div>
      </div>
    </section>

    <footer class="footer text-faded text-center py-5">
      <div class="container">
        <p class="m-0 small">Copyright &copy; ensias Website 2018</p>
      </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
