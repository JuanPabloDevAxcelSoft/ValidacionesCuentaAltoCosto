package com.savia.validacion.repository;

import com.savia.validacion.model.WriteCmPacienteHemofilia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriteCmPacienteHemofiliaRepository extends JpaRepository<WriteCmPacienteHemofilia,Integer> {
}
