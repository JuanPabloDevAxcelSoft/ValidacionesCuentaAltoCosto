package com.savia.validacion.repository;

import com.savia.validacion.model.WriteCmPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriteCmPacienteRepository extends JpaRepository<WriteCmPaciente,Long> {
}
