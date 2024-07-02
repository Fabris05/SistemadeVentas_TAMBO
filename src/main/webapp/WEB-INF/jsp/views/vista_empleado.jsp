<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
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
                                    <h5 class="fw-bold">
                                        Buscar Empleado
                                        <span class="badge badge-secondary"></span>
                                    </h5>

                                    <!--Form para buscar-->
                                    <form id="clientes-form-search">
                                        <div class="row mt-4">

                                            <div class="col-md-3">
                                                <label for="lblTipoDocumento" class="form-label fw-bold">Tipo de
                                                    Documento</label>
                                                <select name="cbxTipoDocumentoBuscar" class="form-select">
                                                    <option value="" disabled selected>Seleccione una Opcion</option>
                                                    <option value="DNI">DNI</option>
                                                    <option value="PASAPORTE">Pasaporte</option>
                                                    <option value="CARNET DE EXTRANJERIA">Carnet de Extranjeria</option>
                                                </select>
                                            </div>

                                            <div class="col-md-3">
                                                <label for="lblNumeroDocumento">Número de Documento</label>
                                                <input type="text" class="form-control" id="txtNumeroDocumento"
                                                    name="txtNumeroDocumento">
                                            </div>

                                            <div class="col-md-3">
                                                <label for="lblPuestoTrabajo" class="form-label fw-bold">Puesto de
                                                    Trabajo</label>
                                                <select name="cbxPuestoTrabajo" class="form-select" id="idPuestoTrabajo">
                                                    <option value="" disabled selected>Seleccione una Opcion</option>
                                                </select>
                                            </div>

                                            <div class="col-md-3">
                                                <label for="lblFecha" class="form-label fw-bold">Fecha de
                                                    Ingreso</label>
                                                <input type="date" class="form-control" name="dtFechaInicio">
                                                <label for="lblSeparacion" class="form-label fw-bold">-</label>
                                                <input type="date" name="dtFechaFinal" class="form-control">
                                            </div>

                                            <div class="col-md-3">
                                                <button type="submit" class="btn btn-primary"
                                                    style="display: flex; align-items: center;">
                                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                                        fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                                                        <path
                                                            d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0" />
                                                    </svg>
                                                    &nbsp;Buscar
                                                </button>
                                            </div>

                                        </div>
                                    </form>

                                    <!--Botones-->
                                    <div class="d-flex gap-3 justify-content-center mt-4"> <!-- DIV botones -->
                                        <a class="btn btn-success" href="/empleados/save" role="button"
                                            style="display: flex; align-items: center;">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                                fill="currentColor" class="bi bi-plus-circle-fill" viewBox="0 0 16 16">
                                                <path
                                                    d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3z" />
                                            </svg>
                                            &nbsp;Añadir empleado
                                        </a>
                                        <button type="button" class="btn btn-info"
                                            style="display: flex; align-items: center;">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                                fill="currentColor" class="bi bi-file-earmark-excel-fill"
                                                viewBox="0 0 16 16">
                                                <path
                                                    d="M9.293 0H4a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V4.707A1 1 0 0 0 13.707 4L10 .293A1 1 0 0 0 9.293 0M9.5 3.5v-2l3 3h-2a1 1 0 0 1-1-1M5.884 6.68 8 9.219l2.116-2.54a.5.5 0 1 1 .768.641L8.651 10l2.233 2.68a.5.5 0 0 1-.768.64L8 10.781l-2.116 2.54a.5.5 0 0 1-.768-.641L7.349 10 5.116 7.32a.5.5 0 1 1 .768-.64" />
                                            </svg>
                                            &nbsp;Generar reporte excel
                                        </button>
                                        <a class="btn btn-secondary" href="/puestoTrabajo" role="button"
                                            style="display: flex; align-items: center;">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                                fill="currentColor" class="bi bi-gear" viewBox="0 0 16 16">
                                                <path
                                                    d="M8 4.754a3.246 3.246 0 1 0 0 6.492 3.246 3.246 0 0 0 0-6.492M5.754 8a2.246 2.246 0 1 1 4.492 0 2.246 2.246 0 0 1-4.492 0" />
                                                <path
                                                    d="M9.796 1.343c-.527-1.79-3.065-1.79-3.592 0l-.094.319a.873.873 0 0 1-1.255.52l-.292-.16c-1.64-.892-3.433.902-2.54 2.541l.159.292a.873.873 0 0 1-.52 1.255l-.319.094c-1.79.527-1.79 3.065 0 3.592l.319.094a.873.873 0 0 1 .52 1.255l-.16.292c-.892 1.64.901 3.434 2.541 2.54l.292-.159a.873.873 0 0 1 1.255.52l.094.319c.527 1.79 3.065 1.79 3.592 0l.094-.319a.873.873 0 0 1 1.255-.52l.292.16c1.64.893 3.434-.902 2.54-2.541l-.159-.292a.873.873 0 0 1 .52-1.255l.319-.094c1.79-.527 1.79-3.065 0-3.592l-.319-.094a.873.873 0 0 1-.52-1.255l.16-.292c.893-1.64-.902-3.433-2.541-2.54l-.292.159a.873.873 0 0 1-1.255-.52zm-2.633.283c.246-.835 1.428-.835 1.674 0l.094.319a1.873 1.873 0 0 0 2.693 1.115l.291-.16c.764-.415 1.6.42 1.184 1.185l-.159.292a1.873 1.873 0 0 0 1.116 2.692l.318.094c.835.246.835 1.428 0 1.674l-.319.094a1.873 1.873 0 0 0-1.115 2.693l.16.291c.415.764-.42 1.6-1.185 1.184l-.291-.159a1.873 1.873 0 0 0-2.693 1.116l-.094.318c-.246.835-1.428.835-1.674 0l-.094-.319a1.873 1.873 0 0 0-2.692-1.115l-.292.16c-.764.415-1.6-.42-1.184-1.185l.159-.291A1.873 1.873 0 0 0 1.945 8.93l-.319-.094c-.835-.246-.835-1.428 0-1.674l.319-.094A1.873 1.873 0 0 0 3.06 4.377l-.16-.292c-.415-.764.42-1.6 1.185-1.184l.292.159a1.873 1.873 0 0 0 2.692-1.115z" />
                                            </svg>
                                            &nbsp;Gestionar Puestos de Trabajo
                                        </a>
                                        <a class="btn btn-secondary" href="/categoriaProducto" role="button"
                                            style="display: flex; align-items: center;">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                                fill="currentColor" class="bi bi-gear" viewBox="0 0 16 16">
                                                <path
                                                    d="M8 4.754a3.246 3.246 0 1 0 0 6.492 3.246 3.246 0 0 0 0-6.492M5.754 8a2.246 2.246 0 1 1 4.492 0 2.246 2.246 0 0 1-4.492 0" />
                                                <path
                                                    d="M9.796 1.343c-.527-1.79-3.065-1.79-3.592 0l-.094.319a.873.873 0 0 1-1.255.52l-.292-.16c-1.64-.892-3.433.902-2.54 2.541l.159.292a.873.873 0 0 1-.52 1.255l-.319.094c-1.79.527-1.79 3.065 0 3.592l.319.094a.873.873 0 0 1 .52 1.255l-.16.292c-.892 1.64.901 3.434 2.541 2.54l.292-.159a.873.873 0 0 1 1.255.52l.094.319c.527 1.79 3.065 1.79 3.592 0l.094-.319a.873.873 0 0 1 1.255-.52l.292.16c1.64.893 3.434-.902 2.54-2.541l-.159-.292a.873.873 0 0 1 .52-1.255l.319-.094c1.79-.527 1.79-3.065 0-3.592l-.319-.094a.873.873 0 0 1-.52-1.255l.16-.292c.893-1.64-.902-3.433-2.541-2.54l-.292.159a.873.873 0 0 1-1.255-.52zm-2.633.283c.246-.835 1.428-.835 1.674 0l.094.319a1.873 1.873 0 0 0 2.693 1.115l.291-.16c.764-.415 1.6.42 1.184 1.185l-.159.292a1.873 1.873 0 0 0 1.116 2.692l.318.094c.835.246.835 1.428 0 1.674l-.319.094a1.873 1.873 0 0 0-1.115 2.693l.16.291c.415.764-.42 1.6-1.185 1.184l-.291-.159a1.873 1.873 0 0 0-2.693 1.116l-.094.318c-.246.835-1.428.835-1.674 0l-.094-.319a1.873 1.873 0 0 0-2.692-1.115l-.292.16c-.764.415-1.6-.42-1.184-1.185l.159-.291A1.873 1.873 0 0 0 1.945 8.93l-.319-.094c-.835-.246-.835-1.428 0-1.674l.319-.094A1.873 1.873 0 0 0 3.06 4.377l-.16-.292c-.415-.764.42-1.6 1.185-1.184l.292.159a1.873 1.873 0 0 0 2.692-1.115z" />
                                            </svg>
                                            &nbsp;Gestionar Categoría
                                        </a>
                                    </div>

                                    <!--Tabla de lista Empleados-->
                                    <div class="mt-4">
                                        <table class="table table-striped text-center">
                                            <thead>
                                                <tr>
                                                    <th style="display: none;">ID</th>
                                                    <th>Puesto</th>
                                                    <th>Nombre</th>
                                                    <th>Apellido</th>
                                                    <th>Tipo Documento</th>
                                                    <th>Numero Documento</th>
                                                    <th>Celular</th>
                                                    <th>Correo Electronico</th>
                                                    <th>Usuario</th>
                                                    <th>Fecha Ingreso</th>
                                                    <th>Eliminar</th>
                                                </tr>
                                            </thead>
                                            <tbody id="table-empleados-list">

                                            </tbody>
                                        </table>
                                    </div>

                                </div>
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