package com.urbansales.tiendaderopa.Services.Facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbansales.tiendaderopa.Model.CategoriaProducto;
import com.urbansales.tiendaderopa.Model.Cliente;
import com.urbansales.tiendaderopa.Model.Compra;
import com.urbansales.tiendaderopa.Model.CompraProducto;
import com.urbansales.tiendaderopa.Model.CompraProveedor;
import com.urbansales.tiendaderopa.Model.Empleado;
import com.urbansales.tiendaderopa.Model.Producto;
import com.urbansales.tiendaderopa.Model.Proveedor;
import com.urbansales.tiendaderopa.Model.PuestoTrabajo;
import com.urbansales.tiendaderopa.Model.Venta;
import com.urbansales.tiendaderopa.Model.VentaProducto;
import com.urbansales.tiendaderopa.Services.DAOs.FactoryDAO;

@Service
public class Facade {
    
    @Autowired
    private FactoryDAO factoryDAO;

    //Metodos de Categoria Producto

    public String agregarCategoriaProducto(CategoriaProducto categoriaProducto){
        return this.factoryDAO.getCategoriaProductoDAO().newCategoriaProducto(categoriaProducto);
    }

    public List<CategoriaProducto> listaCategoriasProducto(){
        return this.factoryDAO.getCategoriaProductoDAO().getAllCategoriaProducto();
    }

    public String eliminarCategoriaProducto(int id){
        return this.factoryDAO.getCategoriaProductoDAO().deleteCategoriaProducto(id);
    }

    public CategoriaProducto obtenerCategoriaProducto(int id){
        return this.factoryDAO.getCategoriaProductoDAO().getCategoriaProductoById(id);
    }

    //Metodos de Cliente

    public String agregarCliente(Cliente cliente){
        return this.factoryDAO.getClienteDAO().newCliente(cliente);
    }

    public List<Cliente> listaClientes(){
        return this.factoryDAO.getClienteDAO().getAllCliente();
    }

    public String eliminarCliente(int id){
        return this.factoryDAO.getClienteDAO().deleteCliente(id);
    }

    //Metodos de Compra

    public String agregarCompra(Compra compra){
        return this.factoryDAO.getCompraDAO().newCompra(compra);
    }

    public List<Compra> listaCompras(){
        return this.factoryDAO.getCompraDAO().getAllCompra();
    }

    public String eliminarCompra(int id){
        return this.factoryDAO.getCompraDAO().deleteCompra(id);
    }

    //Metodos de Compra Producto

    public void agregarCompraProducto(CompraProducto compraProducto){
        this.factoryDAO.getCompraProductoDAO().newCompraProducto(compraProducto);
    }

    //Metodos de Compra Proveedor

    public void agregarCompraProveedor(CompraProveedor compraProveedor){
        this.factoryDAO.getCompraProveedorDAO().newCompraProveedor(compraProveedor);
    }

    //Metodos de Empleado

    public String agregarEmpleado(Empleado empleado){
        return this.factoryDAO.getEmpleadoDAO().newEmpleado(empleado);
    }

    public List<Empleado> listaEmpleados(){
        return this.factoryDAO.getEmpleadoDAO().getAllEmpleado();
    }

    public String eliminarEmpleado(int id){
        return this.factoryDAO.getEmpleadoDAO().deleteEmpleado(id);
    }

    //Metodos de Producto

    public String agregarProducto(Producto producto){
        return this.factoryDAO.getProductoDAO().newProducto(producto);
    }

    public List<Producto> listaProductos(){
        return this.factoryDAO.getProductoDAO().getAllProducto();
    }

    public String eliminarProducto(int id){
        return this.factoryDAO.getProductoDAO().deleteProducto(id);
    }

    //Metodos de Proveedor

    public String agregarProveedor(Proveedor proveedor){
        return this.factoryDAO.getProveedorDAO().newProveedor(proveedor);
    }

    public List<Proveedor> listaProveedores(){
        return this.factoryDAO.getProveedorDAO().getAllProveedor();
    }

    public String eliminarProveedor(int id){
        return this.factoryDAO.getProveedorDAO().deleteProveedor(id);
    }

    //Metodos de Puesto Trabajo

    public String agregarPuestoTrabajo(PuestoTrabajo puestoTrabajo){
        return this.factoryDAO.getPuestoTrabajoDAO().newPuestoTrabajo(puestoTrabajo);
    }

    public List<PuestoTrabajo> listaPuestoTrabajos(){
        return this.factoryDAO.getPuestoTrabajoDAO().getAllPuestoTrabajo();
    }

    public String eliminarPuestoTrabajo(int id){
        return this.factoryDAO.getPuestoTrabajoDAO().deletePuestoTrabajo(id);
    }

    //Metodos de Venta

    public String agregarVenta(Venta venta){
        return this.factoryDAO.getVentaDAO().newVenta(venta);
    }

    //Metodos de Venta Producto

    public void agregarVentaProducto(VentaProducto ventaProducto){
        this.factoryDAO.getVentaProductoDAO().newVentaProducto(ventaProducto);
    }
}
