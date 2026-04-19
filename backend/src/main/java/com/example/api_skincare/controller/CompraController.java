package com.example.api_skincare.controller;

import com.example.api_skincare.model.Compra;
import com.example.api_skincare.model.DetalleCompra;
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

    // 🔥 GUARDAR COMPRA
    @PostMapping
    public String guardarCompra(@RequestBody List<java.util.Map<String, Object>> detalles) {

        // 1. Crear compra
        Compra compra = compraRepo.save(new Compra());

        // 2. Guardar detalles
        for (java.util.Map<String, Object> d : detalles) {

            // ✅ Fix: casting seguro desde Integer o Long
            Long productoId = ((Number) d.get("productoId")).longValue();

            DetalleCompra detalle = new DetalleCompra();
            detalle.setProductoId(productoId);
            detalle.setCompraId(compra.getId());

            detalleRepo.save(detalle);
        }

        return "Compra guardada correctamente ✅";
    }
}