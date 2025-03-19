package com.empresa.app.repositories;

import com.empresa.app.model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, UUID> {
}
