//Funcion que tomara la fecha
function getDia() {
    const today = new Date();

    const year = today.getFullYear();
    const month = String(today.getMonth() + 1).padStart(2, '0');
    const day = String(today.getDate()).padStart(2, '0'); 
    return `${year}-${month}-${day}`;
}

document.addEventListener("DOMContentLoaded", function () {
    if (window.location.pathname.endsWith("/empleados")) {
        fetch('/empleado/list')
        .then(response => response.json())
        .then(empleados => {
            let tablaBody = document.getElementById('table-empleados-list');
            empleados.forEach(empleado => {
                let fila = document.createElement('tr');

                let idEmpleado = document.createElement('td');
                idEmpleado.textContent = empleado.idEmpleado;
                idEmpleado.style.display = 'none';

                let idPuestoTrabajo = document.createElement('td');
                idPuestoTrabajo.textContent = empleado.idPuestoTrabajo;

                let nombre = document.createElement('td');
                nombre.textContent = empleado.nombre;

                let apellido = document.createElement('td');
                apellido.textContent = empleado.apellido;

                let tipoDocumento = document.createElement('td');
                tipoDocumento.textContent = empleado.tipoDocumento;

                let numeroDocumento = document.createElement('td');
                numeroDocumento.textContent = empleado.numeroDocumento;

                let correoElectronico = document.createElement('td');
                correoElectronico.textContent = empleado.correoElectronico;

                let celular = document.createElement('td');
                celular.textContent = empleado.celular;

                let usuario = document.createElement('td');
                usuario.textContent = empleado.usuario;

                let fechaIngreso = document.createElement('td');
                fechaIngreso.textContent = empleado.fechaIngreso.split("T")[0];

                let celdaEliminar = document.createElement('td');
                let boton = document.createElement('button');
                boton.textContent = 'Eliminar';
                boton.classList.add('btn','btn-danger','btn-sm');
                boton.addEventListener('click', function () {
                    fetch(`/empleado/remove/${empleado.idEmpleado}`, {
                        method: 'DELETE'
                    }).then(() => {
                        fila.remove();
                    });
                });

                celdaEliminar.appendChild(boton);

                fila.appendChild(idEmpleado);
                fila.appendChild(idPuestoTrabajo);
                fila.appendChild(nombre);
                fila.appendChild(apellido);
                fila.appendChild(tipoDocumento);
                fila.appendChild(numeroDocumento);
                fila.appendChild(celular);
                fila.appendChild(correoElectronico);
                fila.appendChild(usuario);
                fila.appendChild(fechaIngreso);
                fila.appendChild(celdaEliminar);

                tablaBody.appendChild(fila);
            });
        });
    }else if (window.location.pathname.endsWith("/empleados/save")) {
        let form = document.getElementById('empleado-form-register');
        form.addEventListener('submit', function(event) {
            event.preventDefault();

            let datos = new FormData(form);
            let empleado = {};
            datos.forEach((value,key) => {
                empleado[key] = value;
            });

            empleado['fechaIngreso'] = getDia();

            fetch('/empleado/save', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(empleado)
            })
            .then(response => response.json())
            .then(empleadoRegistrado => {
                window.location.href = '/empleados';
            });
        });
    }
});