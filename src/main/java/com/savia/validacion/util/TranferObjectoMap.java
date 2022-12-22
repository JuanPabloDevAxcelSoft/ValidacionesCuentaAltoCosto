package com.savia.validacion.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
@Service
public class TranferObjectoMap {
     public Map<String,Object> objectToMap(Object objectPasciente){
         try {
             ObjectMapper mapper = new ObjectMapper();
             mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
             String JSON_SOURCE= null;
             JSON_SOURCE = mapper.writeValueAsString(objectPasciente);
             Map<String,Object> result = mapper.readValue(JSON_SOURCE, HashMap.class);
             return result;
         } catch (JsonProcessingException e) {
             e.printStackTrace();
             return null;
         }
     }
}
