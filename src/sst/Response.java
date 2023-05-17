package sst;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Response extends Remote{
	
	public String Hello() throws RemoteException;
	
	public String Bye() throws RemoteException;
	
	public String Question() throws RemoteException;

}
