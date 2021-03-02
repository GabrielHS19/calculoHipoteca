
package E1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author jesus
 */
public interface InterfaceRemota extends Remote{
    public double coutaMensual(double capital, double interes,
            double plazo)throws RemoteException;
}
