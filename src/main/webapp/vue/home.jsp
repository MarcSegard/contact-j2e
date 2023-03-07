<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Mes contacts</title>
    <%-- CDN Bootstrap --%>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
    <%-- fichier style.css --%>
    <link rel="stylesheet" href="style.css" />
  </head>
  <body>
    <div class="container">
      <h1>Mes contacts</h1>
      <div class="row">

        <!-- Pour chaque personne. Récupération de la liste contacts -->
        <c:forEach items="${requestScope.contacts}" var="contact">
          <div class="col-lg-4 col-md-6">
            <div class="card contact-card">

              <c:choose>
                <%-- Si avatar existe --%>
                <c:when test="${contact.getAvatar() != null}">
                  <%-- On affiche l'avatar --%>
                  <img class="card-img-top rounded-circle avatar" src="<c:out value="${ contact.getAvatar() }" />" alt="Avatar" />
                </c:when>
                <c:otherwise>
                  <%-- Sinon on affiche l'avatar par défaut --%>
                  <img class="card-img-top rounded-circle avatar" src="images/default-avatar.png" alt="Default Avatar" />
                </c:otherwise>
              </c:choose>
              <div class="card-body">
                <h5 class="card-title">
                  <%-- On affiche le prénom et le nom avec un espace --%>
                  <c:out value="${ contact.getFirstName() } ${ contact.getLastName() }" />
                </h5>
                <p class="card-text">
                  <%-- On affiche l'email --%>
                  <c:out value="${ contact.getEmail() }" />
                </p>
                <p class="card-text">
                  <%-- On affiche le téléphone --%>
                  <c:out value="${ contact.getPhone() }" />
                </p>
              </div>
            </div>
          </div>

        </c:forEach>
        
      </div>
    </div>
  </body>
</html>