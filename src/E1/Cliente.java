/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

import java.rmi.Naming;
import java.text.DecimalFormat;

/**
 *
 * @author jesus
 */
public class Cliente {
    
    public Cliente(){
        try {
            InterfaceRemota objetoRemoto = (InterfaceRemota) Naming.lookup("//192.168.1.91/ObjetoRemoto");
            System.out.println("Capital: $20,000");
            System.out.println("Interes: 6%");
            System.out.println("Plazo: 5 años");
            DecimalFormat df = new DecimalFormat("#.##");
            
            for (int i=0; i<100;i++){
                System.out.println("Couta mensual:"
                + df.format(objetoRemoto.coutaMensual(20000.00,6.00,5.00))+"pesos");
                System.out.println("Calculo:" +i);
                Thread.sleep(500);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args){
        new Cliente();
    }
    
}
