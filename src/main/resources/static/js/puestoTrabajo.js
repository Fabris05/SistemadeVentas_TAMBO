//Funcion que tomara la fecha
function getDia() {
    const today = new Date();

    const year = today.getFullYear();
    const month = String(today.getMonth() + 1).padStart(2, '0');
    const day = String(today.getDate()).padStart(2, '0'); 
    return `${year}-${month}-${day}`;
}

document.addEventListener("DOMContentLoaded", function () {

    if (window.location.pathname.endsWith("/puestoTrabajo")) {
        let form = document.getElementById('puestoTrabajo-form-register');

        form.addEventListener('submit', function (event) {
            event.preventDefault();

            let datos = new FormData(form);
            let puestoTrabajo = {};

            datos.forEach((value,key) => {
                puestoTrabajo[key] = value;
            });

            puestoTrabajo['fechaCreacion'] = getDia();

            fetch('/puestoTrabajo/save', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(puestoTrabajo)
            })
            .then(response => response.json())
            .then(puestoTrabajoRegistrado => {
                window.location.href = '/puestoTrabajo';
                cargarPuestoTrabajo();
            });
        });

        function cargarPuestoTrabajo () {
            fetch('/puestoTrabajo/list')
            .then(response => response.json())
            .then(puestosTrabajos => {
                let tablaBody = document.getElementById('table-puestoTrabajo-list');
    
                puestosTrabajos.forEach(puestoTrabajo => {
                    let fila = document.createElement('tr');
    
                    let idPuestoTrabajo = document.createElement('td');
                    idPuestoTrabajo.textContent = puestoTrabajo.idPuestoTrabajo;
                    idPuestoTrabajo.style.display = 'none';
    
                    let puesto = document.createElement('td');
                    puesto.textContent = puestoTrabajo.puesto;
    
                    let fechaCreacion = document.createElement('td');
                    fechaCreacion.textContent = puestoTrabajo.fechaCreacion.split("T")[0];
    
                    let estado = document.createElement('td');
                    estado.textContent = puestoTrabajo.estado ? 'Activo' : 'Inactivo';
    
                    let celdaEliminar = document.createElement('td');
                    let boton = document.createElement('button');
                    boton.textContent = 'Eliminar';
                    boton.classList.add('btn','btn-danger','btn-sm');
                    boton.addEventListener('click', function () {
                        fetch(`/puestoTrabajo/remove/${puestoTrabajo.idPuestoTrabajo}`, {
                            method: 'DELETE'
                        }).then(() => {
                            fila.remove();
                        });
                    });
    
                    celdaEliminar.appendChild(boton);
    
                    fila.appendChild(idPuestoTrabajo);
                    fila.appendChild(puesto);
                    fila.appendChild(fechaCreacion);
                    fila.appendChild(estado);
                    fila.appendChild(celdaEliminar);
    
                    tablaBody.appendChild(fila);
                });
            });
        }

        cargarPuestoTrabajo();
    }

    if (window.location.pathname.endsWith("/empleados/save") || window.location.pathname.endsWith("/empleados")) {
        function cargarComboBox () {
            fetch('/puestoTrabajo/list')
            .then(response => response.json())
            .then(puestosTrabajos => {
                let comboBox = document.getElementById('idPuestoTrabajo');
    
                puestosTrabajos.forEach(puestoTrabajo => {
                    let opciones = document.createElement('option');
                    opciones.value = puestoTrabajo.idPuestoTrabajo;
                    opciones.textContent = puestoTrabajo.puesto;
    
                    comboBox.appendChild(opciones);
                });
            });
        }

        cargarComboBox();
    }
});