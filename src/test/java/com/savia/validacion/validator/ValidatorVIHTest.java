package com.savia.validacion.validator;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

import com.savia.validacion.model.TblReadHemofiliaPasoModel;
import com.savia.validacion.service.HemofiliaReadService;
import com.savia.validacion.service.impl.ValidacionServiceImpl;
import com.savia.validacion.util.PacienteFind;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
// import org.springframework.beans.factory.annotation.Autowired;
// import com.savia.validacion.interfaces.ValidacionInterfaces;
// import com.savia.validacion.service.ValidacionService;
// import com.savia.validacion.util.MethodsGeneric;

@SpringBootTest
public class ValidatorVIHTest {
    @Autowired
    PacienteFind pacienteFind;
    // private final Integer idEnfermedad = 2;
    // private String response = null;;
    // private MethodsGeneric methodsGeneric = new MethodsGeneric();

    // @Autowired
    // private ValidacionService validacion;

    @Test
    void validatorV1() {
        //String result= validacionService.isPacienteCorrect(1,1);

        TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel= (TblReadHemofiliaPasoModel)pacienteFind.paciente(1,1);
        // Map<String, String> parametros = new HashMap<String, String>() {
        // {
        // put("entidad_reporte", "11000");
        // put("entidad_reportante_sgsss", "asdasdN");
        // }
        // };

        // List<ValidacionInterfaces> list =
        // validacion.findAllValidacionesByIdEnfermedad(idEnfermedad);
        // for (ValidacionInterfaces item : list) {
        // response = methodsGeneric.validacionDependenciaUno(item, parametros);
        // }

         TblReadHemofiliaPasoModel tblReadHemofiliaPasoModel2= new TblReadHemofiliaPasoModel();
        assertEquals(tblReadHemofiliaPasoModel2,tblReadHemofiliaPasoModel);
    }

}
