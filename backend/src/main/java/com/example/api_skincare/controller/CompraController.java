package com.example.api_skincare.controller;

import com.example.api_skincare.model.Compra;
import com.example.api_skincare.model.DetalleCompra;
import com.example.api_skincare.model.Producto;
import com.example.api_skincare.repository.CompraRepository;
import com.example.api_skincare.repository.DetalleCompraRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
@CrossOrigin("*")
public class CompraController {

    private final CompraRepository compraRepo;
    private final DetalleCompraRepository detalleRepo;

    public CompraController(CompraRepository compraRepo, DetalleCompraRepository detalleRepo) {
        this.compraRepo = compraRepo;
        this.detalleRepo = detalleRepo;
    }

    @PostMapping
    public String guardarCompra(@RequestBody List<Producto> productos) {

        // 1. Crear compra
        Compra compra = compraRepo.save(new Compra());

        // 2. Guardar cada producto en detalle_compra
        for (Producto p : productos) {
            DetalleCompra detalle = new DetalleCompra();
            detalle.setCompraId(compra.getId());
            detalle.setProductoId(p.getId());
            detalleRepo.save(detalle);
        }

        return "Compra guardada correctamente";
    }
}
