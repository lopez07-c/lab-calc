/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author josea
 */
public class DivisionPorCeroException extends Exception {

    public DivisionPorCeroException() {
        super("No se puede dividir entre cero.");
    }

    public DivisionPorCeroException(String mensaje) {
        super(mensaje);
    }

}

