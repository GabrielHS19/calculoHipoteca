
package E1;

import java.rmi.Naming;

/**
 *
 * @author jesus
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public Servidor(){
        try {
            
            System.setProperty(
                    "java.rmi.server.codebase",
                    "192.168.1.91");
            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//192.168.1.91/ObjetoRemoto", objetoRemoto);
            System.out.println("Servidor iniciado...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        new Servidor();
    }
    
}
