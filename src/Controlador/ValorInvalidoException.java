/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author josea
 */
public class ValorInvalidoException extends Exception {

    public ValorInvalidoException() {
        super("El valor ingresado no es válido.");
    }

    public ValorInvalidoException(String mensaje) {
        super(mensaje);
    }

}
    

