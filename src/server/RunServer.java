package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.InetAddress;

public class RunServer {

	public static void main(String[] args) {
				
		try {

			Server server = new Server();
			InetAddress IP = InetAddress.getLocalHost();
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Naming.rebind("rmi://" + IP.getHostAddress() + ":" + Registry.REGISTRY_PORT + "/ChatGPT", server);

			System.out.println("Server Ready.\nIP: " + IP.getHostAddress() + "\nPORT: " + Registry.REGISTRY_PORT);

		} catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
	}
}
