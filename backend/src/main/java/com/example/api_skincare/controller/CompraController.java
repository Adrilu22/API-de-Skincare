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
    public String guardarCompra(@RequestBody List<DetalleCompra> detalles) {

        // 1. Crear compra
        Compra compra = compraRepo.save(new Compra());

        // 2. Guardar detalles
        for (DetalleCompra d : detalles) {

            DetalleCompra detalle = new DetalleCompra();

            // ✅ SOLO lo que existe en tu modelo
            detalle.setProductoId(d.getProductoId());

            // 🔥 asignar compra
            detalle.setCompraId(compra.getId());

            detalleRepo.save(detalle);
        }

        return "Compra guardada correctamente ✅";
    }
}