package com.urbansales.tiendaderopa.Controller.Views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.urbansales.tiendaderopa.Model.Autentificacion;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SistemaController {
    
    //Login
    @GetMapping("/")
    public String login(){
        return "index";
    }

    @PostMapping("/")
    public String validacion(@ModelAttribute Autentificacion autentificacion, HttpServletRequest request){
        if(autentificacion.getUsuario().equals("leo") && autentificacion.getPassword().equals("leo")){
            return "vista_empleado";
        }else{
            return "index";
        }
    }

    //Empleado
    @GetMapping("/empleados")
    public String vistaEmpleado(HttpServletRequest request){
        return "vista_empleado";
    }

    @GetMapping("/empleados/save")
    public String vistaRegistrarEmpleado(){
        return "vista_registrar_empleado";
    }

    //Puesto Trabajo
    @GetMapping("/puestoTrabajo")
    public String vistaPuestoTrabajo(){
        return "vista_gestionar_puesto_trabajo";
    }

    //Categoria Producto
    @GetMapping("/categoriaProducto")
    public String vistaCategoriaProducto(){
        return "vista_gestionar_categoria_producto";
    }

    //Cliente
    @GetMapping("/clientes")
    public String vistaCliente(){
        return "vista_cliente";
    }

    @GetMapping("/clientes/save")
    public String vistaRegistrarCliente(){
        return "vista_registrar_cliente";
    }

    //Proveedor
    @GetMapping("/proveedores")
    public String vistaProveedor(){
        return "vista_proveedor";
    }

    @GetMapping("/proveedores/save")
    public String vistaRegistrarProveedor(){
        return "vista_registrar_proveedor";
    }

    //Producto
    @GetMapping("/productos")
    public String vistaProducto(){
        return "vista_producto";
    }

    @GetMapping("/productos/save")
    public String vistaRegistrarProducto(){
        return "vista_registrar_producto";
    }

    //Compra
    @GetMapping("/compras")
    public String vistaCompra(){
        return "vista_compra";
    }

    @GetMapping("/compras/save")
    public String vistaRegistrarCompra(){
        return "vista_registrar_compra";
    }
}
