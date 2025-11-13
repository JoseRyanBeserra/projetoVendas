package com.projetoVendas.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoVendas.sistema.modelos.Estado;

public interface EstadoRepositorio extends JpaRepository<Estado, Long> {
}
