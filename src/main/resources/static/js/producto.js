//Funcion que tomara la fecha
function getDia() {
    const today = new Date();

    const year = today.getFullYear();
    const month = String(today.getMonth() + 1).padStart(2, '0');
    const day = String(today.getDate()).padStart(2, '0'); 
    return `${year}-${month}-${day}`;
}

document.addEventListener("DOMContentLoaded", function () {
    if (window.location.pathname.endsWith("/productos")) {
        fetch('/producto/list')
        .then(response => response.json())
        .then(productos => {
            let tablaBody = document.getElementById('table-productos-list');

            productos.forEach(producto => {
                let fila = document.createElement('tr');

                let idProducto = document.createElement('td');
                idProducto.textContent = producto.idProducto;
                idProducto.style.display = 'none';

                let idCategoriaProducto = document.createElement('td');
                idCategoriaProducto.textContent = producto.idCategoriaProducto;

                let codigoProducto = document.createElement('td');
                codigoProducto.textContent = producto.codigoProducto;

                let nombre = document.createElement('td');
                nombre.textContent = producto.nombre;

                let cantidad = document.createElement('td');
                cantidad.textContent = producto.cantidad;

                let talla = document.createElement('td');
                talla.textContent = producto.talla;

                let precioUnitario = document.createElement('td');
                precioUnitario.textContent = producto.precioUnitario;

                let fechaAgregacion = document.createElement('td');
                fechaAgregacion.textContent = producto.fechaAgregacion.split("T")[0];

                let estado = document.createElement('td');
                estado.textContent = producto.estado ? 'Activo' : 'Inactivo';

                let celdaEliminar = document.createElement('td');
                let boton = document.createElement('button');
                boton.textContent = 'Eliminar';
                boton.classList.add('btn','btn-danger','btn-sm');
                boton.addEventListener('click', function () {
                    fetch(`/producto/remove/${producto.idProducto}`, {
                        method: 'DELETE'
                    }).then(() => {
                        fila.remove();
                    });
                });

                celdaEliminar.appendChild(boton);

                fila.appendChild(idProducto);
                fila.appendChild(idCategoriaProducto);
                fila.appendChild(codigoProducto);
                fila.appendChild(nombre);
                fila.appendChild(cantidad);
                fila.appendChild(talla);
                fila.appendChild(precioUnitario);
                fila.appendChild(fechaAgregacion);
                fila.appendChild(estado);
                fila.appendChild(celdaEliminar);

                tablaBody.appendChild(fila);
            });
        });
    }else if (window.location.pathname.endsWith("/productos/save")) {
        let form = document.getElementById('producto-form-register');

        form.addEventListener('submit', function (event) {
            event.preventDefault();

            let datos = new FormData(form);
            let producto = {};

            datos.forEach((value,key) => {
                producto[key] = value;
            })

            producto['cantidad'] = '0';
            producto['codigoProducto'] = 'null';
            producto['qr'] = 'null';
            producto['fechaAgregacion'] = getDia();
            
            fetch('/producto/save', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(producto)
            })
            .then(response => response.json())
            .then(productoRegistrado => {
                window.location.href = '/productos';
            })
        });
    }else if (window.location.pathname.endsWith("")) {

    }
});