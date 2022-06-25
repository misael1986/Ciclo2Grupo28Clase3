/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.unal.ciclo2grupo28clase3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase3 {

    public static int ejemplo2() {
        int a = 10;
        a += 20;//a=a+20;
        return a;
    }

    public static int sum(int x, int y) {
        int d = x + y;
        return d;
    }

    public static void main(String[] args) {
        
        /*
        System.out.println("Ejemplos: "+4);//Imprime en texto
        System.out.println(ejemplo2());
        System.out.println(f(20.5));
        double dato=f(2.5);
        System.out.println(dato);
         */

 /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        double d = Double.parseDouble(sc.nextLine());
        System.out.println(f(d));
         */
 
        //System.out.println(sum(2, 5));

        /*
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Ingrese el lado:");
        double l = sc2.nextDouble();//
        System.out.print("Ingrese el ancho:");
        double a = sc2.nextDouble();
        System.out.println("Area: " + area_rectangulo(l, a));
        */
        
        //System.out.println("Volumen del solido=" + volumen_solido(3, 9.0 / 2, 4));

        System.out.println("Area del Vagon:"+area_vagon(4,3,2));
        
    }

    public static void ejemplo() {
        int a = 10;
        a += 20;//a=a+20;
    }

    //               retorna un double y recibe una entrada double   
    public static double f(double x) {
        //return x * x;
        //return Math.pow(x,2);
        double y = Math.pow(x, 2);
        return y;
    }

    public static double area_vagon(double L, double A, double R){
    return area_rectangulo(L,A)+(area_circulo(R)*2);
    }
    
    public static double area_rectangulo(double L, double A) {
        double area = L * A;
        return area;
    }
    
    public static double area_circulo(double R) {
        double area = Math.PI*Math.pow(R, 2);
        return area;
    }

    public static double volumen_solido(double r1, double h, double r2) {
        double volTotal;
        double volCono;
        double volEsfera;
        volCono = (Math.pow(r2, 2) * Math.PI * h) / 3;
        volEsfera = (Math.PI * Math.pow(r1, 3) * 4 ) / 3;
        System.out.println("Cono:"+volCono+"\nEsfera:"+volEsfera);
        volTotal = volCono + volEsfera;
        return volTotal;
    }
}
