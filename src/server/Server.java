package server;

import sst.Response;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Response{

	public Server() throws RemoteException {
		super();
	}

	public String Hello() throws RemoteException {
		String a = "Hey";
		return a;
	}
	
	public String Bye() throws RemoteException {
		String a = "Good Bye";
		return a;
	}
	
	public String Question() throws RemoteException {
		String a = "Good";
		return a;
	}

}
