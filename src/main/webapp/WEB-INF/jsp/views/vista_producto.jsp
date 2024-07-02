<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
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
                        <div class="col-12 mt-1 p-4">
                            <h5 class="fw-bold">Buscar Producto<span class="badge badge-secondary"></span></h5>

                            <!--Form para Buscar-->
                            <form id="producto-form-search">
                                <div class="row mt-3">

                                    <div class="col-md-3">
                                        <label for="lblCategoriaProducto" class="form-label fw-bold">Categoria:</label>
                                        <select name="idCategoriaProducto" id="idCategoriaProducto" class="form-select">
                                            <option value="" disabled selected>Seleccione una Opcion</option>
                                        </select>
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblTalla" class="form-label fw-bold">Talla:</label>
                                        <select name="talla" id="talla" class="form-select">
                                            <option value="" disabled selected>Seleccione una Opcion</option>
                                            <option value="S">S</option>
                                            <option value="M">M</option>
                                            <option value="L">L</option>
                                            <option value="XL">XL</option>
                                        </select>
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblFecha" class="form-label fw-bold">Fecha de
                                            Agregación</label>
                                        <input type="date" class="form-control" name="dtFechaInicio">
                                        <label for="lblSeparacion" class="form-label fw-bold">-</label>
                                        <input type="date" name="dtFechaFinal" class="form-control">
                                    </div>

                                    <!-- Boton Buscar Producto -->
                                    <div class="d-flex col-md-1 align-items-center"> 
                                        <button type="submit" class="btn btn-primary" style="display: flex; align-items: center;">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16" style="margin-right: 5px;">
                                            <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0"/>
                                            </svg>
                                            &nbsp;Buscar
                                        </button>
                                    </div>

                                </div>
                            </form>

                            <!-- Botones-->
                            <div class="d-flex gap-2 justify-content-end mt-3" > 
                                <a role="button" href="/productos/save" class="btn btn-success m-2" style="display: flex; align-items: center;">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" class="bi bi-plus-circle-fill" viewBox="0 0 16 16">
                                    <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3z"/>
                                    </svg>
                                    &nbsp;Registrar Producto
                                </a>
                                <button type="button" class="btn btn-info m-2" id="btnGeneralExcelCompras" style="display: flex; align-items: center;">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-file-earmark-excel-fill" viewBox="0 0 16 16">
                                    <path d="M9.293 0H4a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V4.707A1 1 0 0 0 13.707 4L10 .293A1 1 0 0 0 9.293 0M9.5 3.5v-2l3 3h-2a1 1 0 0 1-1-1M5.884 6.68 8 9.219l2.116-2.54a.5.5 0 1 1 .768.641L8.651 10l2.233 2.68a.5.5 0 0 1-.768.64L8 10.781l-2.116 2.54a.5.5 0 0 1-.768-.641L7.349 10 5.116 7.32a.5.5 0 1 1 .768-.64"/>
                                    </svg>
                                    &nbsp;Generar reporte excel
                                </button>
                            </div>

                            <div class="mt-4">
                                <table class="table table-striped text-center mt-3">
                                    <thead>
                                        <th style="display: none;">Id</th>
                                        <th>Categoria del Producto</th>
                                        <th>Codigo del Producto</th>
                                        <th>Producto</th>
                                        <th>Cantidad</th>
                                        <th>Talla</th>
                                        <th>Precio Unitario</th>
                                        <th>Fecha de Agregación</th>
                                        <th>Estado</th>
                                        <th>Eliminar</th>
                                    </thead>
                                    <tbody id="table-productos-list">

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
        <script src="${pageContext.request.contextPath}/static/js/producto.js"></script>
        <script src="${pageContext.request.contextPath}/static/js/categoriaProducto.js"></script>
    </body>
</html>