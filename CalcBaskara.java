/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcbaskara;

import static java.lang.Math.sqrt;

public class CalcBaskara {
    
    public double Delta(double a, double b, double c){
        double delta;
        delta = b*b -4*a*c;
        if (delta < 0) {
            return Double.NaN; // Não existem raízes negativas
                    }
        delta = sqrt(delta);
        
        return delta;
        }
     
    public double[] baskara(double a, double b, double c){
        double x1,x2, delta;
        delta = Delta(a,b,c);
        
        if (Double.isNaN(delta)) {
            return null; // Retorna null se não houver raízes reais
        }
        
        x1 = (-b + delta)/(2*a);
        x2 = (-b + delta)/(2*a);
        return new double[] {x1,x2};
    }
    
}
