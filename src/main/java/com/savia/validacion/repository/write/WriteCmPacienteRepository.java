package com.savia.validacion.repository.write;

import com.savia.validacion.model.write.WriteCmPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriteCmPacienteRepository extends JpaRepository<WriteCmPaciente,Long> {
}
