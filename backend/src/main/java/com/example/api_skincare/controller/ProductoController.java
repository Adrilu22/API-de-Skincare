package com.example.api_skincare.controller;

import com.example.api_skincare.model.Producto;
import com.example.api_skincare.model.Categoria;
import com.example.api_skincare.repository.ProductoRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin("*")
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // GET todos
    @GetMapping
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    // GET por ID
    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    // POST crear
    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    // PUT actualizar
    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoRepository.save(producto);
    }

    // DELETE eliminar
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoRepository.deleteById(id);
    }

    // RELACIÓN (clave para la nota)
    @GetMapping("/{id}/categoria")
    public Categoria obtenerCategoria(@PathVariable Long id) {
        Producto producto = productoRepository.findById(id).orElse(null);
        return producto != null ? producto.getCategoria() : null;
    }
}
