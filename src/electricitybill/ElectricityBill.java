/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybill;

import javafx.scene.effect.Light;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class ElectricityBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int unit=20;
    double up=17;
    if (unit<=50 && unit<=150){
    double ppu=unit*up ;
    double pppu=ppu *0.10;
        System.out.println(pppu);
    }
    else if (unit>=151 && unit<=300){
    double ppu=unit*up ;
    double pppu=ppu *0.50;
        System.out.println(pppu+"                    2nd");
    }
    else if (unit>=301 && unit<=450){
    double ppu=unit*up ;
    double pppu=ppu *0.70;
        System.out.println(pppu+"                    3rd");
    }
    }
    
}
