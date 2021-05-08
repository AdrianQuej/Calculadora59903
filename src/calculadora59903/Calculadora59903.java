/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora59903;

import java.util.Scanner;

/**
 *
 * @author Adrian Quej
 */
public class Calculadora59903 {
    public static double primerValor;
    public static double segundoValor;
    public static double valor;
    public static int valores;
    public static void encabezado() {
        System.out.println("Universidad Autonoma de Campeche");
        System.out.println("Facultad de Ingenieria");
        System.out.println("Ingenieria en Sistemas Computacionales");
        System.out.println("Mayo 2021");
        System.out.println("ADRIAN ERNESTO AGUILAR QUEJ");
    }
    public static void cuerpo(){
        System.out.println("--------------------");
        System.out.println("ACTIVIDAD CALCULADORA");
        System.out.println("Seleccione la operacion  a efectuar");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - División");
        System.out.println("--------------------");
    }
    public static void pie(){
        System.out.println("-----------");
        System.out.println("AGUILAR-QUEJ.2021");
    }
    public static void suma(){
    Operaciones sum = new Operaciones();
        Scanner miConsola = new Scanner(System.in);
        System.out.println("¿Cuantos valores se utilizarán?");
        valores= miConsola.nextInt();
        System.out.println("-----------------------------");
        for (int i = 0; i < 1; i++) {
            miConsola = new Scanner(System.in);
            System.out.println("Ingrese un valor a la suma");
            primerValor = miConsola.nextDouble();
            
            System.out.println(" + ");
            miConsola = new Scanner(System.in);
            segundoValor = miConsola.nextDouble();
            sum.setResultado(primerValor);
            sum.suma(segundoValor);
         }
        for (int i = 0; i < (valores-2); i++) {
            System.out.println(" + ");
            miConsola = new Scanner(System.in);
            primerValor = miConsola.nextDouble();
            sum.suma(primerValor);
            
        }
        System.out.println("El resultado es = " + sum.suma(0));
        
        
    }
    public static void resta(){
    Operaciones res = new Operaciones();
     Scanner miConsola = new Scanner(System.in);
        System.out.println("¿Cuantos valores se utilizarán?");
        valores= miConsola.nextInt();
        System.out.println("-----------------------------");
        for (int i = 0; i < 1; i++) {
            miConsola = new Scanner(System.in);
            System.out.println("Ingrese un valor a la resta");
            primerValor = miConsola.nextDouble();
            
            System.out.println(" - " );
            miConsola = new Scanner(System.in);
            segundoValor = miConsola.nextDouble();
            res.setResultado(primerValor);
            res.resta(segundoValor);
         }
        for (int i = 0; i < (valores-2); i++) {
            System.out.println(" - ");
            miConsola = new Scanner(System.in);
            primerValor = miConsola.nextDouble();
            res.resta(primerValor);
            
        }
        System.out.println("El resultado es = " + res.resta(0));   
    }
    public static void multiplicacion(){
        Operaciones mul = new Operaciones();
        Scanner miConsola = new Scanner(System.in);
        System.out.println("¿Cuantos valores se utilizarán?");
        valores= miConsola.nextInt();
        System.out.println("-----------------------------");
        for (int i = 0; i < 1; i++) {
            miConsola = new Scanner(System.in);
            System.out.println("Ingrese un primer valor a multiplicacion");
            primerValor = miConsola.nextDouble();
            
            System.out.println(" X " );
            miConsola = new Scanner(System.in);
            segundoValor = miConsola.nextDouble();
            mul.setResultado(primerValor);
            mul.mult(segundoValor);
         }
        for (int i = 0; i < (valores-2); i++) {
            System.out.println(" X ");
            miConsola = new Scanner(System.in);
            primerValor = miConsola.nextDouble();
            mul.mult(primerValor);
            
        }
        System.out.println("El resultado es = " + mul.mult(1));
    }
    public static void division(){
        Operaciones divi = new Operaciones();
        Scanner miConsola = new Scanner(System.in);
        System.out.println("¿Cuantos valores se utilizarán?");
        valores= miConsola.nextInt();
        System.out.println("-----------------------------");
        for (int i = 0; i < 1; i++) {
            miConsola = new Scanner(System.in);
            System.out.println("Ingrese un valor a la division");
            primerValor = miConsola.nextDouble();
            
            System.out.println(" / " );
            miConsola = new Scanner(System.in);
            segundoValor = miConsola.nextDouble();
            divi.setResultado(primerValor);
            divi.div(segundoValor);
         }
        for (int i = 0; i < (valores-2); i++) {
            System.out.println(" / ");
            miConsola = new Scanner(System.in);
            primerValor = miConsola.nextDouble();
            divi.div(primerValor);
            
        }
        System.out.println("El resultado es = " + divi.div(1));
        
    }
    public static void menu(int opcion){
    switch(opcion){
            case 1:
                System.out.println("---------SUMA--------");
                suma();
                break;
            case 2:
                System.out.println("---------RESTA--------");
                resta();
                break;
            case 3:
                System.out.println("---------MULTIPLICACION--------");
                multiplicacion();
                break;
            case 4:
                System.out.println("---------DIVISIÓN--------");
                division();
                break;
            default :
                System.out.println("Opcion no valida");
        }
    }
    public static void main(String[] args) {
        encabezado();
        cuerpo();
        int opciones;
        Scanner miConsola = new Scanner(System.in);
        opciones = miConsola.nextInt();
        menu(opciones);
        pie();
    }
    
}
