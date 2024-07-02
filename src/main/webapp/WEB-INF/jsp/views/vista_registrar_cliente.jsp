<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Cliente</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/2207d6bcc1.js" crossorigin="anonymous"></script>
        <link rel="icon" href="${pageContext.request.contextPath}/static/favicon.ico" type="image/x-icon">
    </head>

    <body>
        <div class="container-fluid">
            <%@ include file="../templates/header.jsp" %>
            <div class="row vh-100">
                <%@ include file="../templates/section.jsp" %>
                <div class="col-10">
                    <div class="d-flex row g-3 justify-content-center">
                        <div class="col-12 mt-3 p-4">
                            <h5 class="fw-bold">Añadir Cliente<span class="badge badge-secondary"></span></h5>

                            <form id="cliente-form-register">
                                <div class="row mt-3">

                                    <div class="col-md-3">
                                        <label for="lblTipoDocumento" class="form-label fw-bold">Tipo de Documento:</label>
                                        <select name="tipoDocumento" id="tipoDocumento" class="form-select">
                                            <option value="DNI">DNI</option>
                                            <option value="Pasaporte">Pasaporte</option>
                                            <option value="Carnet de Extranjeria">Carnet de Extranjeria</option>
                                        </select>
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblNumeroDocumento" class="form-label fw-bold">Número de Documento:</label>
                                        <input type="text" name="numeroDocumento" id="numeroDocumento" autocomplete="off" class="form-control">
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblNombreCliente" class="form-label fw-bold">Nombre:</label>
                                        <input type="text" name="nombre" id="nombre" class="form-control" autocomplete="off">
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblApellidoCliente" class="form-label fw-bold">Apellido:</label>
                                        <input type="text" name="apellido" id="apellido" autocomplete="off" class="form-control">
                                    </div>

                                    <div class="col-md-3 mt-3">
                                        <label for="lblGenero" class="form-label fw-bold">Género:</label>
                                        <select name="genero" id="genero" class="form-select">
                                            <option value="M">Hombre</option>
                                            <option value="F">Mujer</option>
                                        </select>
                                    </div>

                                    <div class="col-md-3 mt-3">
                                        <label for="lblCorreoElectronico" class="form-label fw-bold">Correo Electronico:</label>
                                        <input type="text" name="correoElectronico" id="correoElectronico" class="form-control" autocomplete="off">
                                    </div>

                                    <div class="col-md-3 mt-3">
                                        <label for="lblCelular" class="form-label fw-bold">Celular:</label>
                                        <input type="text" name="celular" id="celular" autocomplete="off" class="form-control">
                                    </div>

                                    <div class="col-md-3 mt-3">
                                        <label for="lblEstado" class="form-label fw-bold">Estado:</label>
                                        <select name="estado" id="estado" class="form-select">
                                            <option value="true">Activo</option>
                                            <option value="false">Inactivo</option>
                                        </select>
                                    </div>

                                </div>

                                <!-- Boton registrar cliente -->
                                <div class="d-flex row-2 justify-content-center mt-5"> 
                                    <button type="submit" class="btn btn-success" style="display: flex; align-items: center;">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-plus-fill" viewBox="0 0 16 16">
                                        <path d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6"/>
                                        <path fill-rule="evenodd" d="M13.5 5a.5.5 0 0 1 .5.5V7h1.5a.5.5 0 0 1 0 1H14v1.5a.5.5 0 0 1-1 0V8h-1.5a.5.5 0 0 1 0-1H13V5.5a.5.5 0 0 1 .5-.5"/>
                                        </svg>
                                        &nbsp;Registrar Cliente
                                    </button>
                                </div> 

                            </form>
                        </div>
                    </div>

                    <div class="d-flex row-2 justify-content-end mt-2 me-5">
                        <a href="/clientes" class="btn btn-danger" style="display: flex; align-items: center;" role="button">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-left-circle-fill" viewBox="0 0 16 16">
                            <path d="M8 0a8 8 0 1 0 0 16A8 8 0 0 0 8 0m3.5 7.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5z"/>
                            </svg>
                            &nbsp;Atrás
                        </a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Script de Boostrap -->
        <script src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
        <script src="${pageContext.request.contextPath}/static/js/cliente.js"></script>
    </body>
</html>