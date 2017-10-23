/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3.pkg1;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche obx1= new Coche();
        Scanner sc = new Scanner (System.in);
        obx1.acelerar(sc.nextInt());
        obx1.frenar(sc.nextInt());
        System.out.println(obx1.getVelocidade());
        
    }

    
}
