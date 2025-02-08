package com.yaelvillanueva.micalculadorayvv;

import java.util.*;

public class MiCalculadoraYVV{
        
    //Declaramos nuestras variables
    private double num1,num2;
    
    public void setNum1(double num1){
        this.num1=num1;
    }
    
    public double getNum1(){
        return num1;
    }
    
    public void setNum2(double num2){
        this.num2=num2;
    }
   
    public double getNum2(){
        return num2;
    }
    
    //Suma 
    public double sumar(){
        return num1+num2;
    } 
    
    //Resta
    public double resta(){
        return num1-num2;
    }
            
    //Multiplicar
    public double multiplicacion(){
        return num1*num2;
    }
    
    //Dividir 
    public double division(){
        if (num2!=0){ //evaluamos 0
            return num1/num2;
        }else{
            System.out.println("Error");
            return 0;
        }
    }
    
    public double modulo(){
        if (num2!=0){ //evaluamos 0
            return num1%num2;
        } else {
            System.out.println("Error");
            return 0;
        }
    }
            
    // Clase principal
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        MiCalculadoraYVV calc = new MiCalculadoraYVV();
        
        System.out.println("** CALCULADORA v1.0 2025/02 **");
        
        //Simula una pequeña pantalla de carga
        for (int i=1;i<3;i++){
            System.out.println("\nCargando...");
        }
         boolean continuar = true;
        
        
        System.out.println("\nBienvenido a mi calculadora");
        
        /*
        El ciclo se repetira mientras la opcion de continuar sea verdadera y
        se quiera realizar operaciones
        */ 
        while (continuar==true){
            
        System.out.println("Por favor, digite el primer numero a operar");
        calc.setNum1(sc.nextDouble());
        
        System.out.println("Ingrese el segundo numero");
        calc.setNum2(sc.nextDouble());
        
        System.out.println("\nQue operacion va a realizar?");
        System.out.println("+ - * / m");
        char operacion = sc.next().charAt(0);
        
        double resultado;
        
        //Ejecucion de las opciones
        switch (operacion){
            case '+':
                resultado = calc.sumar();
                System.out.println("El resultado es: " +resultado);
                break;
                
            case '-':
                resultado=calc.resta();
                System.out.println("El resultado de la suma es: " +resultado);
                break;
                
            case '*':
                resultado=calc.multiplicacion();
                System.out.println("El resultado de la suma es: +resultado ");
                break;
                
            case '/':
                resultado=calc.division();
                System.out.println("El resultado de la multiplicación es: " +resultado);
                break;
                
                //modulo
            case 'm':
                resultado=calc.modulo();
                System.out.println("El modulo es: " +resultado);
                break;
                
            default:
                System.out.println("Operación no valida");
                break;
        }
        
        System.out.println("Desea realizar otra operacion? (s/n)");
        char respuesta=sc.next().charAt(0);
        if (respuesta=='s' || respuesta=='S'){ //Para detectar minusculas y mayusculas
        } else { //Si hay una respuesta negativa, el ciclo while termina y la ejecución del programa
            //llega a su fin
              System.out.println("Gracias por usar mi calculadora.");
              continuar=false;
        }
        }
    }
}