/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgado.g.t02.p2;
import java.util.Scanner;
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int valinf, valsup, i=0;
        System.out.println("Introduce el valor inferior");
        valinf=kb.nextInt();
        System.out.println("Introduce el valor superior");
        valsup=kb.nextInt();
        for(i=valinf;i<=valsup;i++){
            System.out.println(+i);
        }
        for(i=valinf;i<=valsup;i++){
        if(i%2==0){
            System.out.println(i+" es par");
        }
        if(i%3==0){
            System.out.println(i+" es divisible entre 3");
        }
        if(i%5==0){
            System.out.println(i+" es diviaible entre 5");
        }
        
        }

    }
    
}

