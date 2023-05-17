package server;

import sst.Response;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Response{

	//private static final long serialVersionUID = -6488630703870051651L;

	public Server() throws RemoteException {
		super();
	}

	public String Hello() throws RemoteException {
		// TODO Auto-generated method stub
		String a = "Hey";
		return a;
	}
	
	public String Bye() throws RemoteException {
		// TODO Auto-generated method stub
		String a = "Good Bye";
		return a;
	}
	
	public int[] giveAnswer4() throws RemoteException {
		// TODO Auto-generated method stub
		int [] array = {10, 20, 30, 40, 50};
		return array;
	}

}
