import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class Server extends UnicastRemoteObject implements RMIInterface {

    

	public String echo(Object input) throws RemoteException {
	     	return "Echoing: " + input.toString();
	}

        protected Server() throws RemoteException {
                super();
        }


        public static void main(String[] args) {
                try {
                	System.out.println("[+] Trying to bind...");
                        //Below IP:PORT can be changed
                        Naming.rebind("rmi://0.0.0.0:11099/RMIInterface", new Server());
                        System.out.println("[+] Server started. ");
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

}


