package intrefaces;

import java.rmi.Remote;

public interface ServerInterface extends Remote{
		
	int add(int a, int b);
}
