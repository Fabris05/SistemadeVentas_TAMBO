<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>

    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Empleado</title>
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
                            <h5 class="fw-bold">Añadir Empleado<span class="badge badge-secondary"></span></h5>

                            <form id="empleado-form-register">
                                <div class="row mt-3">

                                    <div class="col-md-3">
                                        <label for="lblNombreEmpleado" class="form-label fw-bold">Nombre:</label>
                                        <input type="text" class="form-control" name="nombre" id="nombre" required>
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblApellidoEmpleado" class="form-label fw-bold">Apellido:</label>
                                        <input type="text" class="form-control" name="apellido" id="apellido" required>
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblTipoDocumento" class="form-label fw-bold">Tipo de Documento:</label>
                                        <select class="form-select" name="tipoDocumento" id="tipoDocumento">
                                            <option value="DNI">DNI</option>
                                            <option value="Pasaporte">Pasaporte</option>
                                            <option value="Carnet de Extranjeria">Carnet de Extranjeria</option>
                                        </select>
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblNumeroDocumento" class="form-label fw-bold">Número de Documento:</label>
                                        <input type="text" class="form-control" id="numeroDocumento" name="numeroDocumento" required>
                                    </div>

                                    <div class="col-md-3 mt-3">
                                        <label for="lblCelular" class="form-label fw-bold">Celular:</label>
                                        <input type="text" class="form-control" id="celular" name="celular" required>
                                    </div>

                                    <div class="col-md-3 mt-3">
                                        <label for="lblCorreoElectronico" class="form-label fw-bold">Correo Electronico:</label>
                                        <input type="text" class="form-control" name="correoElectronico" id="correoElectronico">
                                    </div>

                                </div>

                                <div class="d-flex row gap-3 justify-content-center">
                                    <div class="col-5 mt-4 p-4">
                                        <h5 class="fw-bold">Credenciales Empleado<span class="badge badge-secondary"></span></h5>

                                        <div class="row mt-3">

                                            <div class="col-md-5">
                                                <label for="lblUsuario" class="form-label fw-bold">Usuario:</label>
                                                <input type="text" class="form-control" name="usuario" id="usuario" required autocomplete="off">
                                            </div>

                                            <div class="col-md-5">
                                                <label for="lblPassword" class="form-label fw-bold">Password:</label>
                                                <input type="password" class="form-control" name="password" id="password" required autocomplete="off">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-5 mt-4 p-4">
                                        <h5 class="fw-bold">Puesto de Trabajo<span class="badge badge-secondary"></span></h5>

                                        <div class="col mt-3">
                                            <label for="lblPuestoTrabajo" class="form-label fw-bold">Puesto de Trabajo:</label>
                                            <select name="idPuestoTrabajo" id="idPuestoTrabajo" class="form-select">

                                            </select>
                                        </div>
                                    </div>
                                </div>

                                <div class="d-flex col justify-content-center">
                                    <button type="submit" class="btn btn-success" style="display: flex; align-items: center;">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-floppy-fill" viewBox="0 0 16 16">
                                        <path d="M0 1.5A1.5 1.5 0 0 1 1.5 0H3v5.5A1.5 1.5 0 0 0 4.5 7h7A1.5 1.5 0 0 0 13 5.5V0h.086a1.5 1.5 0 0 1 1.06.44l1.415 1.414A1.5 1.5 0 0 1 16 2.914V14.5a1.5 1.5 0 0 1-1.5 1.5H14v-5.5A1.5 1.5 0 0 0 12.5 9h-9A1.5 1.5 0 0 0 2 10.5V16h-.5A1.5 1.5 0 0 1 0 14.5z"/>
                                        <path d="M3 16h10v-5.5a.5.5 0 0 0-.5-.5h-9a.5.5 0 0 0-.5.5zm9-16H4v5.5a.5.5 0 0 0 .5.5h7a.5.5 0 0 0 .5-.5zM9 1h2v4H9z"/>
                                        </svg>
    
                                        &nbsp;Registrar Empleado
                                    </button>
                                </div>

                            </form>
                        </div>
                    </div>

                    <div class="d-flex row-2 justify-content-end mt-2 me-5">
                        <a href="/empleados" class="btn btn-danger" style="display: flex; align-items: center;" id="btnFinalizarCompra" role="button">
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
        <script src="${pageContext.request.contextPath}/static/js/empleado.js"></script>
        <script src="${pageContext.request.contextPath}/static/js/puestoTrabajo.js"></script>
    </body>

    </html>