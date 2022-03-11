/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.arduino;
import java.util.Scanner;
/**
 *
 * @author Ing.Jon
 */
public class PruebaArduino {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1,b=2,c=3;
        Scanner leer=new Scanner(System.in);
        int escribe=leer.nextInt();
        if(escribe==a&&escribe!=b&&escribe!=c){
            System.out.println(escribe);
        }
    }
    
}
