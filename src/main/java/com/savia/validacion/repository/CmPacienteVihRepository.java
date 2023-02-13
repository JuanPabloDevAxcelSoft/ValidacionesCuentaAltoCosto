package com.savia.validacion.repository;

import com.savia.validacion.model.write.WriteCmPacienteVih;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmPacienteVihRepository extends JpaRepository<WriteCmPacienteVih, Integer> {
}
