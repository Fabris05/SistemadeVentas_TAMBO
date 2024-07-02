<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>

    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesión</title>
        <link rel="stylesheet" href="https://unpkg.com/bootstrap@5.3.2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://unpkg.com/bs-brain@2.0.3/components/logins/login-3/assets/css/login-3.css">
        <link rel="icon" href="${pageContext.request.contextPath}/static/favicon.ico" type="image/x-icon">
    </head>

    <body class="d-flex align-items-center justify-content-center bg-dark vh-100 ">
        <section class="p-3 p-md-4">
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-6 bsb-tpl-bg-platinum">
                        <div class="d-flex flex-column justify-content-between h-100 p-3 p-md-4 p-xl-5">
                            <h3 class="m-0">Bienvenido!</h3>
                            <img class="img-fluid rounded mx-auto my-4" loading="lazy" src="">
                        </div>
                    </div>
                    <div class="col-12 col-md-6 bsb-tpl-bg-lotion">
                        <div class="p-3 p-md-4 p-xl-5">
                            <div class="row">
                                <div class="col-12">
                                    <div class="mb-5">
                                        <h3>Inicio de Sesión</h3>
                                    </div>
                                </div>
                            </div>
                            <form action="/" method="POST">
                                <div class="row gy-3 gy-md-4 overflow-hidden">
                                    <div class="col-12">
                                        <label for="email" class="form-label">Usuario<span
                                                class="text-danger">*</span></label>
                                        <input type="text" class="form-control" name="usuario" id="email"
                                            placeholder="Ingrese su usuario" required autocomplete="off">
                                    </div>
                                    <div class="col-12">
                                        <label for="password" class="form-label">Contraseña <span
                                                class="text-danger">*</span></label>
                                        <input type="password" class="form-control" name="password" id="password"
                                            value="" required autocomplete="off">
                                    </div>

                                    <div class="col-12">
                                        <div class="d-grid">
                                            <button class="btn bsb-btn-xl btn-primary" type="submit">
                                                Iniciar Sesión
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>

    </html>