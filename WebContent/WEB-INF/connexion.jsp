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
    
      <link type="text/css" rel="stylesheet" href="inc/form12.css" />
      
</head>
<body>

    <div class="main">

        <section class="signup">
            <!-- <img src="storelog/images/bg.jpg" alt=""> -->
            <div class="container">
                <div class="signup-content">
                    <form method="POST" id="signup-form" class="signup-form">
                        <h2 class="form-title">Connexion</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="email" id="email" value="<c:out value="${utilisateur.email}"/>" placeholder="Email"/>
                            <span class="erreur">${form.erreurs['email']}</span>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="motdepasse" id="motdepasse" placeholder="Mot de passe"/>
                            <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                            <span class="erreur">${form.erreurs['motdepasse']}</span>
                          
                          <input type="submit" name="submit" id="submit" class="form-submit" value="Sign in"/>
                <%-- Vérification de la présence d'un objet utilisateur en session --%>
                        </div>
                    </form>
                    
                     
                   <%-- <p class="loginhere">
                       <a href="store1.html" class="loginhere-link">Login</a>
                    </p> --%>
                    
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>