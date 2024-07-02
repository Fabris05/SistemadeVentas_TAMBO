//Funcion que tomara la fecha
function getDia() {
    const today = new Date();

    const year = today.getFullYear();
    const month = String(today.getMonth() + 1).padStart(2, '0');
    const day = String(today.getDate()).padStart(2, '0'); 
    return `${year}-${month}-${day}`;
}

document.addEventListener("DOMContentLoaded", function () {
    if (window.location.pathname.endsWith("/clientes")) {
        fetch('/cliente/list')
        .then(response => response.json())
        .then(clientes => {
            let tablaBody = document.getElementById('table-clientes-list');

            clientes.forEach(cliente => {
                let fila = document.createElement('tr');

                let idCliente = document.createElement('td');
                idCliente.textContent = cliente.idCliente;
                idCliente.style.display = 'none';

                let nombre = document.createElement('td');
                nombre.textContent = cliente.nombre;

                let apellido = document.createElement('td');
                apellido.textContent = cliente.apellido;

                let genero = document.createElement('td');
                genero.textContent = (cliente.genero == 'M') ? 'Hombre' : 'Mujer';

                let tipoDocumento = document.createElement('td');
                tipoDocumento.textContent = cliente.tipoDocumento;

                let numeroDocumento = document.createElement('td');
                numeroDocumento.textContent = cliente.numeroDocumento;

                let celular = document.createElement('td');
                celular.textContent = cliente.celular;

                let correoElectronico = document.createElement('td');
                correoElectronico.textContent = cliente.correoElectronico;

                let fechaRegistro = document.createElement('td');
                fechaRegistro.textContent = cliente.fechaRegistro.split("T")[0];

                let estado = document.createElement('td');
                estado.textContent = cliente.estado ? 'Activo' : 'Inactivo';

                let celdaEliminar = document.createElement('td');
                let boton = document.createElement('button');
                boton.textContent = 'Eliminar';
                boton.classList.add('btn','btn-danger','btn-sm');
                boton.addEventListener('click', function () {
                    fetch(`/cliente/remove/${cliente.idCliente}`, {
                        method: 'DELETE'
                    }).then(() => {
                        fila.remove();
                    });
                });

                celdaEliminar.appendChild(boton);

                fila.appendChild(idCliente);
                fila.appendChild(nombre);
                fila.appendChild(apellido);
                fila.appendChild(genero);
                fila.appendChild(tipoDocumento);
                fila.appendChild(numeroDocumento);
                fila.appendChild(celular);
                fila.appendChild(correoElectronico);
                fila.appendChild(fechaRegistro);
                fila.appendChild(estado);
                fila.appendChild(celdaEliminar);

                tablaBody.appendChild(fila)
            })
        });
    }else if (window.location.pathname.endsWith("/clientes/save")) {
        let form = document.getElementById('cliente-form-register');

        form.addEventListener('submit', function (event) {
            event.preventDefault();

            let datos = new FormData(form);
            let cliente = {};
            datos.forEach((value,key) => {
                cliente[key] = value;
            })

            cliente['fechaRegistro'] = getDia();

            fetch('/cliente/save', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(cliente)
            })
            .then(response => response.json())
            .then(clienteRegistrado => {
                window.location.href = '/clientes';
            });
        })
    }
});