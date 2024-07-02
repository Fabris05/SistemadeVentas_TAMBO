<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
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
                        <div class="row mt-3 p-4">
                            <h5 class="fw-bold">Buscar Cliente<span class="badge badge-secondary"></span></h5>

                            <!--Form para Buscar-->
                            <form id="cliente-form-search">
                                <div class="row mt-3">

                                    <div class="col-md-4">
                                        <label for="lblTipoDocumento" class="form-label fw-bold">Tipo de Documento:</label>
                                        <select name="tipoDocumento" id="tipoDocumento" class="form-select">
                                            <option value="" disabled selected>Seleccione una Opcion</option>
                                            <option value="DNI">DNI</option>
                                            <option value="PASAPORTE">Pasaporte</option>
                                            <option value="CARNET DE EXTRANJERIA">Carnet de Extranjeria</option>
                                        </select>
                                    </div>

                                    <div class="col-md-4">
                                        <label for="lblNumeroDocumento" class="form-label fw-bold">Número de Documento:</label>    
                                        <input type="text" id="numeroDocumento"  class="form-control" name="numeroDocumento" autocomplete="off">
                                    </div>

                                    <div class="col-md-4">
                                        <label for="lblGenero" class="form-label fw-bold">Género:</label>
                                        <select name="genero" id="genero" class="form-select">
                                            <option value="M">Hombre</option>
                                            <option value="F">Mujer</option>
                                        </select>
                                    </div>

                                    <div class="col-md-4 mt-2">
                                        <label for="lblFecha" class="form-label fw-bold">Fecha de Ingreso</label>
                                        <input type="date" class="form-control" name="fechaInicio" id="fechaInicio">
                                        <label for="lblSeparacion" class="form-label fw-bold">-</label>
                                        <input type="date" name="fechaFinal" class="form-control" id="fechaFinal">
                                    </div>
                                    
                                    <div class="d-flex row-3 justify-content-center mt-3">
                                        <button type="submit" class="btn btn-primary" style="display: flex; align-items: center;">
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
                            <div class="d-flex col justify-content-end gap-3 me-3" > 
                                <div class="d-flex justify-content-center align-items-center">
                                    <button id="generarExcelClientes" class="btn btn-info" style="display: flex; align-items: center;">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-file-earmark-excel-fill" viewBox="0 0 16 16">
                                        <path d="M9.293 0H4a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V4.707A1 1 0 0 0 13.707 4L10 .293A1 1 0 0 0 9.293 0M9.5 3.5v-2l3 3h-2a1 1 0 0 1-1-1M5.884 6.68 8 9.219l2.116-2.54a.5.5 0 1 1 .768.641L8.651 10l2.233 2.68a.5.5 0 0 1-.768.64L8 10.781l-2.116 2.54a.5.5 0 0 1-.768-.641L7.349 10 5.116 7.32a.5.5 0 1 1 .768-.64"/>
                                        </svg>
                                        &nbsp; Generar reporte en excel
                                    </button>
                                </div>   
                                <div class="">
                                    <a class="btn btn-secondary" href="/clientes/save" role="button" style="display: flex; align-items: center;">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle-fill" viewBox="0 0 16 16">
                                        <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3z"/>
                                        </svg>
                                        &nbsp;Añadir Cliente
                                    </a>
                                </div> 
                            </div>

                            <!--Tabla de lista Clientes-->
                            <div class="mt-4">
                                <table class="table table-striped text-center mt-3">
                                    <thead>
                                        <tr>
                                            <th style="display: none;">Id</th>
                                            <th>Nombre</th>
                                            <th>Apellido</th>
                                            <th>Género</th>
                                            <th>Tipo de Documento</th>
                                            <th>Número de Documento</th>
                                            <th>Celular</th>
                                            <th>Correo Electronico</th>
                                            <th>Fecha de Registro</th>
                                            <th>Estado</th>
                                            <th>Eliminar</th>
                                        </tr>
                                    </thead>
                                    <tbody id="table-clientes-list">

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
        <script src="${pageContext.request.contextPath}/static/js/cliente.js"></script>
    </body>
</html>