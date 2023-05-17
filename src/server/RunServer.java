package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunServer {

	public static void main(String[] args) {
				
		try {

			Server server = new Server();
			
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Naming.rebind("rmi://localhost/ChatGPT", server);

			System.out.print("Ready");
			
		} catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
	}
}
