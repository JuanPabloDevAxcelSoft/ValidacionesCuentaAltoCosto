package com.savia.validacion.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.savia.validacion.dto.ValidateOperadores;

import io.vavr.control.Try;

@Component
public class OperadoresLogicos {

    @PostConstruct
    public void init() {
    }

    private boolean isValidNumber(String number) {
        return Try.of(() -> Integer.valueOf(number)).isSuccess();
    }

    /*
     * Tener encuenta que falta la validacion de que sea mayor a una fecha, por el
     * momento solo se tiene los numero
     */
    public ValidateOperadores isOperadorCampos(Object var_depe, Object valor_var_dep, String operador) {
        ValidateOperadores validate = new ValidateOperadores();
        boolean result = false;
        String message = "";

        switch (operador) {
            case "IGUAL":
                result = var_depe.toString().matches(valor_var_dep.toString());
                message = "(IGUAL) : Operacion completada de igualda";
                break;
            case "MAYOR":
                message = (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString()))
                        ? "(MAYOR) : El valor " + valor_var_dep + " no es un numero."
                        : "Accion completada de mayor";
                if (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString())) {
                    result = Integer.parseInt(var_depe.toString()) > Integer.parseInt(valor_var_dep.toString());
                }
                break;
            case "MAYOR_IGUAL":
                message = (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString()))
                        ? "(MAYOR_IGUAL) : El valor " + valor_var_dep + " no es un numero."
                        : "Accion completada de mayor";
                if (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString())) {
                    result = Integer.parseInt(var_depe.toString()) >= Integer.parseInt(valor_var_dep.toString());
                }
                break;
            case "MENOR":
                message = (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString()))
                        ? "(MENOR) : El valor " + valor_var_dep + " no es un numero."
                        : "Accion completada de mayor";
                if (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString())) {
                    result = Integer.parseInt(var_depe.toString()) < Integer.parseInt(valor_var_dep.toString());
                }
                break;
            case "MENOR_IGUAL":
                message = (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString()))
                        ? "(MENOR_IGUAL) El valor " + valor_var_dep + " no es un numero."
                        : "Accion completada de mayor";
                if (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString())) {
                    result = Integer.parseInt(var_depe.toString()) <= Integer.parseInt(valor_var_dep.toString());
                }
                break;
            case "DIFERENTE": /*
                               * Falta por validar, ya que es posible que sea diferente no solo de numero si
                               * no tambien de letras
                               */
                message = (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString()))
                        ? "(DIFERENTE) : El valor " + valor_var_dep + " no es un numero."
                        : "Accion completada debe ser diferente.";
                if (this.isValidNumber(var_depe.toString()) && this.isValidNumber(valor_var_dep.toString())) {
                    result = Integer.parseInt(var_depe.toString()) != Integer.parseInt(valor_var_dep.toString());
                }
                break;
            default:
                break;
        }

        validate.setDescription(message);
        validate.setIsCompleted(result);
        return validate;
    }

}
