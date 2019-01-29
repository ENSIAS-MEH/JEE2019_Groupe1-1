<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="storelog/fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="storelog/css/style.css">
</head>
<body>

    <div class="main">

        <section class="signup">
             <!-- <img src="images/signup-bg.jpg" alt=""> --> 
            <div class="container">
                <div class="signup-content">
                    <form method="POST" id="signup-form" class="signup-form">
                        <h2 class="form-title">vos infos !</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="pseudo" id="pseudo" placeholder="Pseudo"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="adresse" id="adresse" placeholder="Adresse"/>                  
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="pays" id="pays" placeholder="Pays"/>                  
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="code_postal" id="code_postal" placeholder="Code postal"/>                  
                        </div>                                                                        
                        <div class="form-group">
                            <input type="text" class="form-input" name="type_contenu" id="type_contenu" placeholder="Type de contenu"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="lien" id="lien" placeholder="Lien vers votre hub de contenu principal"/>                  
                        </div>                        
                        <div class="form-group">
                            <input type="text" class="form-input" name="about_me" id="about_me" placeholder="A propos de vous"/>                  
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                            <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                        </div>
						<div class="form-group">
                         <input type="submit" name="submit" id="submit" class="form-submit" value="Confirmer"/>
                         </div>
                    </form>
                    
                    
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>