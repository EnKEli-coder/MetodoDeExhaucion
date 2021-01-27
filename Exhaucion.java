package exhaucion;

import java.lang.Math;

public class Exhaucion {
        
    public static void main(String[] args) {
        
        double lados = 6,b = 1,c,d,e,f,g,h;
        System.out.println("Iteraciones:");
        
        for (int i = 0; i<= 12; i++){
            c = b/2;
            d = Math.sqrt(1-(c*c));
            e = 1 - d;
            f = Math.sqrt((c*c)+(e*e));
            g = lados*b;
            h = g/2;
            System.out.println(h);
            b = f;
            lados *=2;
        }
        
    }
    
    
    
}
