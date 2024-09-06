/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_china;

/**
 *
 * @author NEISER
 */
public class Operaciones {
     private double numero1;
    private double numero2;
    private String operacion;

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double calcular() {
        switch (operacion) {
            case "suma":
                return numero1 + numero2;
            case "resta":
                return numero1 - numero2;
            case "multiplicacion":
                return numero1 * numero2;
            case "division":
                
                    return numero1 / numero2;
                 
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}
