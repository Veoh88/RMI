package server;

import java.rmi.RemoteException;

public class ServerMain {

	public static void main(String[] args) {
		try {
			Server svr1 = new Server("Server1");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
