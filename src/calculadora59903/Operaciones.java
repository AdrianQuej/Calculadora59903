/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora59903;

/**
 *
 * @author Adrian Quej
 */
public class Operaciones {
    private double resultado;
    

    public Operaciones() {
    }

    public Operaciones(double resultado) {
        this.resultado = resultado;
        
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double suma (double valor){
        this.resultado=resultado+valor;
        return resultado;
    }
    public double resta(double valor){
        this.resultado= resultado- valor;
        return resultado;
    }
    public double mult (double valor){
        this.resultado=resultado*valor;
        return resultado;
    }
    
    public double div(double valor){
        this.resultado=resultado/valor;
        return resultado;
    }

    @Override
    public String toString() {
        return "Operaciones{" + "resultado=" + resultado + '}';
    }
    
}

