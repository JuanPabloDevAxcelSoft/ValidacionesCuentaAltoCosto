package com.savia.validacion.repository.write;

import com.savia.validacion.model.write.WriteCmDetallePaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriteCmDetallePacienteRepository extends JpaRepository<WriteCmDetallePaciente,Integer> {
}
