<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Nuestra tienda virtual</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="css/registro.css">
</head>
<body>
<jsp:useBean class="model.TiendaDAO" id = "tiendaDAO" ></jsp:useBean>
<div class="container-fluid">
  <div class="row no-gutter">
    <div class="d-none d-md-flex col-md-4 col-lg-6 bg-image"></div>
    <div class="col-md-8 col-lg-6">
      <div class="login d-flex align-items-center py-5">
        <div class="container">
          <div class="row">
            <div class="col-md-9 col-lg-8 mx-auto">
              <h3 class="login-heading mb-4">Registro de Tienda</h3>
              <form action="TiendaController?action=insert" method="post">
              
                <div class="form-label-group">
                  <input type="input" id="inputFacebook" class="form-control"  name="Descripcion"  placeholder="Descripcion" required>
                  <label for="inputFacebook">Descripcion</label>
                </div>
                <div class="form-label-group">
                  <input type="input" id="inputWeb" class="form-control" placeholder="Nombre"  name="nombre" required>
                  <label for="inputWeb">nombre</label>
                </div>
                <div class="form-label-group">
                 <label>Tienda</label> <select class="form-control"
						id="exampleFormControlSelect1" name="tienda">


						</option>
						<c:forEach items="${tiendaDAO.list() }" var="tienda">

							<option value="${tienda.id}">
								<c:out value="${tienda.descripcion} " />
							</option>



						</c:forEach>


					</select>
                </div>


                <button class="btn btn-lg btn-primary btn-block btn-login text-uppercase font-weight-bold mb-2" type="submit">Registrar</button>

              </form>
               <div class="col-xs-12 col-sm-6 col-md-3 align-self-center">
            	<a href="${pageContext.request.contextPath}/servicios.jsp"  class="btn btn-lg btn-primary btn-block text-uppercase font-weight-bold mb-2 text-light" type="submit">Volver</a>
            </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>