package co.edu.uniquindio.proyectofinal1.service;

import co.edu.uniquindio.proyectofinal1.model.CrudProducto;

public interface ICrudProducto {
  boolean crearProducto(CrudProducto newProducto);
  boolean eliminarProducto(String id);
  boolean actualizarProducto(String idProducto, CrudProducto producto);
  CrudProducto buscarProducto(String id);
  boolean verificarProductoExistente(String idProducto);
}
