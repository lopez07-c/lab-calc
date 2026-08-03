/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Calculadora;
import Controlador.ValorInvalidoException;

public class ControlCalculadora {

    private Calculadora modelo;
    private String numero1 = "";
    private String numero2 = "";
    private char operacion = ' ';

    public ControlCalculadora(Calculadora modelo) {
        this.modelo = modelo;
    }

    public void guardarNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public void guardarNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public void guardarOperacion(char operacion) {
        this.operacion = operacion;
    }

    public double calcular() throws ValorInvalidoException, NumberFormatException {
        
        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);

        return switch (operacion) {
            case '+' 
                -> modelo.sumar(n1, n2);
            case '-' 
                -> modelo.restar(n1, n2);
            case '*' 
                -> modelo.multiplicar(n1, n2);
            case '/' 
                -> modelo.dividir(n1, n2);
            default  
                -> 0;
        };
    }

    public void limpiarTodo() {
        numero1 = "";
        numero2 = "";
        operacion = ' ';
    }

    public String getNumero1() {
        return numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public char getOperacion() {
        return operacion;
    }
}