package server;

import java.rmi.*;
import java.net.*;
import java.rmi.server.*;

import intrefaces.ServerInterface;;

public class Server extends UnicastRemoteObject implements ServerInterface {

	protected Server(String name) throws RemoteException {
		try {
			Naming.rebind("rmi:///" + name, this);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}



}
