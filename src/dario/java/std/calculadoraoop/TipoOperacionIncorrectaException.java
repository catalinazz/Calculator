/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dario.java.std.calculadoraoop;

/**
 *
 * @author EducaciónIT
 */
public class TipoOperacionIncorrectaException extends Exception {

    private String tipoOperacion;
// constructor 
    public TipoOperacionIncorrectaException(String tipoOperacion) {
        super("operacion incorrecta"+tipoOperacion);
        this.tipoOperacion = tipoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }


}
