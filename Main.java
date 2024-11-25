/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcbaskara;

import java.util.Scanner;

/**
 *
 * @author mari
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcBaskara calcB = new CalcBaskara();
                       
        System.out.println("Boas vindas! Entre com os coeficientes da equação!");
        
        System.out.println("Digite o coeficiente a:");
        double a = scanner.nextDouble();

        System.out.println("Digite o coeficiente b:");
        double b = scanner.nextDouble();
        
        System.out.println("Digite o coeficiente c:");
        double c = scanner.nextDouble();

        System.out.println("Calcilando . . . ");
        
        double[] x = calcB.baskara(a, b, c);
        
       if (x != null) {
        System.out.println("x1: " + x[0]);
        System.out.println("x2: " + x[1]);
    } else {
        System.out.println("Delta negativo, sem raízes reais.");
    }
        
    }

}
