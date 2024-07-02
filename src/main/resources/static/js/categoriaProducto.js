//Funcion que tomara la fecha
function getDia() {
    const today = new Date();

    const year = today.getFullYear();
    const month = String(today.getMonth() + 1).padStart(2, '0');
    const day = String(today.getDate()).padStart(2, '0'); 
    return `${year}-${month}-${day}`;
}

document.addEventListener("DOMContentLoaded", function () {

    if (window.location.pathname.endsWith("/categoriaProducto")) {
        let form = document.getElementById('categoriaProducto-form-register');

        form.addEventListener('submit', function (event) {
            event.preventDefault();

            let datos = new FormData(form);
            let categoriaProducto = {};

            datos.forEach((value,key) => {
                categoriaProducto[key] = value;
            })

            categoriaProducto['fechaRegistro'] = getDia();

            fetch('/categoriaProducto/save', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(categoriaProducto)
            })
            .then(response => response.json())
            .then(categoriaProducto => {
                window.location.href = '/categoriaProducto';
                cargarCategoriaProductos();
            });
        });

        function cargarCategoriaProductos () {
            fetch('/categoriaProducto/list')
            .then(response => response.json())
            .then(categoriasProductos => {
                let tablaBody = document.getElementById('table-categoriaProducto-list');
    
                categoriasProductos.forEach(categoriaProducto => {
                    let fila = document.createElement('tr');
    
                    let idCategoriaProducto = document.createElement('td');
                    idCategoriaProducto.textContent = categoriaProducto.idCategoriaProducto;
                    idCategoriaProducto.style.display = 'none';
    
                    let categoria = document.createElement('td');
                    categoria.textContent = categoriaProducto.categoria;
    
                    let fechaRegistro = document.createElement('td');
                    fechaRegistro.textContent = categoriaProducto.fechaRegistro.split("T")[0];
    
                    let estado = document.createElement('td');
                    estado.textContent = categoriaProducto.estado ?  'Activo' : 'Inactivo';
    
                    let celdaEliminar = document.createElement('td');
                    let boton = document.createElement('button');
                    boton.textContent = 'Eliminar';
                    boton.classList.add('btn','btn-danger','btn-sm');
                    boton.addEventListener('click', function () {
                        fetch(`/categoriaProducto/remove/${categoriaProducto.idCategoriaProducto}`, {
                            method: 'DELETE'
                        }).then(() => {
                            fila.remove();
                        });
                    });
    
                    celdaEliminar.appendChild(boton);
    
                    fila.appendChild(idCategoriaProducto);
                    fila.appendChild(categoria);
                    fila.appendChild(fechaRegistro);
                    fila.appendChild(estado);
                    fila.appendChild(celdaEliminar);
    
                    tablaBody.appendChild(fila);
                });
            });
        }

        cargarCategoriaProductos();
    }

    if (window.location.pathname.endsWith("/productos") || window.location.pathname.endsWith("/productos/save")) {
        function cargarComboBox () {
            fetch('/categoriaProducto/list')
            .then(response => response.json())
            .then(categoriasProductos => {
                let comboBox = document.getElementById('idCategoriaProducto');
    
                categoriasProductos.forEach(categoriaProducto => {
                    let opciones =  document.createElement('option');
                    opciones.value = categoriaProducto.idCategoriaProducto;
                    opciones.textContent = categoriaProducto.categoria;

                    comboBox.appendChild(opciones);
                });
            });
        }

        cargarComboBox();
    }
});