//Funcion que tomara la fecha
function getDia() {
    const today = new Date();

    const year = today.getFullYear();
    const month = String(today.getMonth() + 1).padStart(2, '0');
    const day = String(today.getDate()).padStart(2, '0'); 
    return `${year}-${month}-${day}`;
}

document.addEventListener("DOMContentLoaded", function () {
    if (window.location.pathname.endsWith("/proveedores")) {
        fetch('/proveedor/list')
        .then(response => response.json())
        .then(proveedores => {
            let tablaBody = document.getElementById('table-proveedores-list');
            proveedores.forEach(proveedor => {
                let fila = document.createElement('tr');

                let idProveedor = document.createElement('td');
                idProveedor.textContent = proveedor.idProveedor;
                idProveedor.style.display = 'none';

                let ruc = document.createElement('td');
                ruc.textContent = proveedor.ruc;

                let razonSocial = document.createElement('td');
                razonSocial.textContent = proveedor.razonSocial;

                let representante = document.createElement('td');
                representante.textContent = proveedor.representante;

                let direccion = document.createElement('td');
                direccion.textContent = proveedor.direccion;

                let correoElectronico = document.createElement('td');
                correoElectronico.textContent = proveedor.correoElectronico;

                let telefono = document.createElement('td');
                telefono.textContent = proveedor.telefono;

                let fechaInicioActividad = document.createElement('td');
                fechaInicioActividad.textContent = proveedor.fechaInicioActividad.split("T")[0];

                let celdaEliminar = document.createElement('td');
                let boton = document.createElement('button');
                boton.textContent = 'Eliminar';
                boton.classList.add('btn','btn-danger','btn-sm');
                boton.addEventListener('click', function () {
                    fetch(`/proveedor/remove/${proveedor.idProveedor}`, {
                        method: 'DELETE'
                    }).then(() => {
                        fila.remove();
                    });
                });

                celdaEliminar.appendChild(boton);

                fila.appendChild(idProveedor);
                fila.appendChild(ruc);
                fila.appendChild(razonSocial);
                fila.appendChild(representante);
                fila.appendChild(direccion);
                fila.appendChild(correoElectronico);
                fila.appendChild(telefono);
                fila.appendChild(fechaInicioActividad);
                fila.appendChild(celdaEliminar);

                tablaBody.appendChild(fila);
            });
        });
    }else if (window.location.pathname.endsWith("/proveedores/save")) {
        let form = document.getElementById('proveedor-form-register');
        form.addEventListener('submit', function (event) {
            event.preventDefault();

            let datos = new FormData(form);
            let proveedor = {};
            datos.forEach((value,key) => {
                proveedor[key] = value;
            });

            proveedor['fechaInicioActividad'] = getDia();

            fetch('/proveedor/save', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(proveedor)
            })
            .then(response => response.json())
            .then(proveedorRegistrado => {
                console.log(proveedorRegistrado);
            })
        });
    }
});