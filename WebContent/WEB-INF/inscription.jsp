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
             <!-- <img src="images/signup-bg.jpg" alt=""> --> 
            <div class="container">
                <div class="signup-content">
                    <form method="post" id="signup-form" class="signup-form" action="inscription">
                        <h2 class="form-title">Create account</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="nom" id="nom" value="<c:out value="${utilisateur.nom}"/>" placeholder="Your Name"/>
                            <span class="erreur">${form.erreurs['nom']}</span>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-input" name="email" id="email" value="<c:out value="${utilisateur.email}"/>" placeholder="Your Email"/>
                            <span class="erreur">${form.erreurs['email']}</span>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="motdepasse" id="motdepasse" value="" placeholder="Password"/>
                            <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                            <span class="erreur">${form.erreurs['motdepasse']}</span>
                            
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="confirmation" id="confirmation" value="" placeholder="Repeat your password"/>
                            <span class="erreur">${form.erreurs['confirmation']}</span>
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                            <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                        </div>
                        <div class="form-group">
                         <input type="submit" name="submit" id="submit" class="form-submit" value="Sign up"/>
                            
                        	<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
                        	<%-- Cette balise affichera le mot 'test' si le bean n'existe pas : --%>
                            
						
									
                         <c:if test="${form.resultat == 'Succès de l inscription.' }">
                            <meta http-equiv="refresh" content="2; URL=http://localhost:8080/JEE2019_Groupe1-1/connexion" >
                         </c:if>
                        </div>

                    </form>
                   <p class="loginhere">
                        Have already an account ? <a href="#" class="loginhere-link">Login here</a>
                    </p>
                    
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>