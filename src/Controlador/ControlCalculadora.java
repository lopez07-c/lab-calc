/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Calculadora;

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

    public double calcular() {

        double resultado = 0;

        try {

            double n1 = Double.parseDouble(numero1);
            double n2 = Double.parseDouble(numero2);

            modelo.setNumero1(n1);
            modelo.setNumero2(n2);

            if (operacion == '+') {
                resultado = modelo.sumar();
            }

            if (operacion == '-') {
                resultado = modelo.restar();
            }

            if (operacion == '*') {
                resultado = modelo.multiplicar();
            }

            if (operacion == '/') {
                resultado = modelo.dividir();
            }

        } catch (NumberFormatException e) {

            System.out.println("Debe ingresar un número válido.");

        } catch (ArithmeticException e) {

            System.out.println("No se puede dividir entre cero.");

        }

        return resultado;
    }

    public boolean hayNumero1() {

        if (numero1.equals("")) {
            return false;
        }

        return true;
    }

    public boolean hayNumero2() {

        if (numero2.equals("")) {
            return false;
        }

        return true;
    }

    public boolean hayOperacion() {

        if (operacion == ' ') {
            return false;
        }

        return true;
    }

    public void limpiarTodo() {

        numero1 = "";
        numero2 = "";
        operacion = ' ';

    }

    public void limpiarNumero2() {

        numero2 = "";

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