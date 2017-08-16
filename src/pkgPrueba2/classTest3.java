/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgPrueba2;

import pkgPrueba1.classTest1;
import pkgPrueba1.classTest2;

/**
 *
 * @author GP 4.2
 */
public class classTest3 {
    public static void main(String[] args) {
        classTest1 instancia1 = new classTest1();
        classTest2 instancia2 = new classTest2(0, "par", true, 4, 0, 0.6);
        
        for (int i = 0; i < 10; i++) {
            do {                
                
            } while (i<8);
 
        }
        
        while (true) {            
            try {
                int caseSwitch = 5;
                switch(caseSwitch)
                {
                    case 1:
                        for (int i = 0; i < 10; i++) {
                            
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 10; i++) {
                            
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
            }
        }
    }
}
