<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion de Categorias de Productos</title>
        <link rel="stylesheet" href="https://unpkg.com/bootstrap@5.3.2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://unpkg.com/bs-brain@2.0.3/components/logins/login-3/assets/css/login-3.css">
        <link rel="icon" href="${pageContext.request.contextPath}/static/favicon.ico" type="image/x-icon">
    </head>

    <body>
        <div class="container-fluid">
            <%@ include file="../templates/header.jsp" %>
            <div class="row vh-100">
                <%@ include file="../templates/section.jsp" %>
                <div class="col-10">
                    <div class="d-flex row gap-3 justify-content-center">
                        <div class="col-12 mt-3 p-4">
                            <h5 class="fw-bold">Gestionar Categorias de Productos<span class="badge badge-secondary"></span></h5>

                            <form id="categoriaProducto-form-register">
                                <div class="row mt-4 justify-content-center">

                                    <div class="col-md-2">
                                        <label for="lblCategoria" class="form-label fw-bold">Categoria:</label>
                                        <input type="text" name="categoria" id="categoria" class="form-control" autocomplete="off">
                                    </div>

                                    <div class="col-md-3">
                                        <label for="lblEstadoCategoria" class="form-label fw-bold">Estado:</label>
                                        <div class="d-flex col gap-3">
                                            <select name="estado" id="estado" class="form-select">
                                                <option value="true">Activo</option>
                                                <option value="false">Inactivo</option>
                                            </select>
                                            <div class="col-md-2">
                                                <button type="submit" class="btn btn-success" style="display: flex; align-items: center;">
                                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle-fill" viewBox="0 0 16 16">
                                                        <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3z"/>
                                                    </svg>
                                                    &nbsp;Añadir
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>

                    <div class="row justify-content-center">
                        <div class="d-flex col-6 mt-4">
                            <table class="table table-striped text-center">
                                <thead>
                                    <tr>
                                        <td style="display: none;">Id</td>
                                        <td>Categoria</td>
                                        <td>Fecha de Creacion</td>
                                        <td>Estado</td>
                                        <td>Eliminar</td>
                                    </tr>
                                </thead>
                                <tbody id="table-categoriaProducto-list">

                                </tbody>
                            </table>
                        </div>
                    </div>

                    <div class="d-flex row-2 justify-content-end mt-2 me-5">
                        <a href="/empleados" class="btn btn-danger" style="display: flex; align-items: center;" role="button">
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
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" 
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
        crossorigin="anonymous"></script>
        <script src="${pageContext.request.contextPath}/static/js/categoriaProducto.js"></script>
    </body>
</html>