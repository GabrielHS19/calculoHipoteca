/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author jesus
 */
public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota{

    private static final long serialVersionIUD =1L;
    
    public ObjetoRemoto() throws RemoteException{
        super();
    }
    
    @Override
    public double coutaMensual(double capital, double interes, double plazo) throws RemoteException {
        System.out.println("Calculando cuota..");
        double plazoMes = plazo / 12.00;
        double interesMes = interes / 12.00;
        return (capital * interes ) / (100.00 * (1-(Math.pow(interes/100.00
        , plazoMes))));
    }
    
    
    
}
