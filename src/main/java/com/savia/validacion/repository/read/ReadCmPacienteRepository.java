package com.savia.validacion.repository.read;

import com.savia.validacion.model.read.ReadCmPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReadCmPacienteRepository extends JpaRepository<ReadCmPaciente,Long> {
    @Query(value = "SELECT *, cm_detalle_paciente.id, cm_paciente_hemofilia.id FROM cm_paciente JOIN cm_detalle_paciente ON cm_paciente.id = cm_detalle_paciente.id_paciente JOIN cm_paciente_hemofilia ON cm_paciente.id = cm_paciente_hemofilia.id_paciente LIMIT 2 OFFSET 2 ;")
     List<String> paciente();
}
