/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;
import Controlador.ValorInvalidoException;

/**
 *
 * @author UTN
 */

public class Calculadora {
    private double numero1;
    private double numero2;

  
    public Calculadora() {
    }
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    
     public void validarNumero(double numero) throws ValorInvalidoException {

        if (Double.isNaN(numero)) {
            throw new ValorInvalidoException("El número ingresado es NaN.");
        }

        if (Double.isInfinite(numero)) {
            throw new ValorInvalidoException("El número ingresado es infinito.");
        }
    }

    public double sumar(double a, double b) throws ValorInvalidoException {
        validarNumero(a);
        validarNumero(b);
        return a + b;
    }

    public double restar(double a, double b) throws ValorInvalidoException {
        validarNumero(a);
        validarNumero(b);
        return a - b;
    }

    public double multiplicar(double a, double b) throws ValorInvalidoException {
        validarNumero(a);
        validarNumero(b);
        return a * b;
    }

    public double dividir(double a, double b) throws ValorInvalidoException {

        validarNumero(a);
        validarNumero(b);

        if (b == 0) {
            throw new ValorInvalidoException("No se puede dividir entre cero.");
        }

        return a / b;
    }
}
   

