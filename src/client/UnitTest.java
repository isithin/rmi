package client;


import org.junit.Assert;
import org.junit.Test;
import server.*;
import java.rmi.RemoteException;
 
public class UnitTest {

    @Test
    public void testHello() throws RemoteException{
        Server server = new Server();
        Assert.assertEquals("Hey", server.Hello());
    }

    @Test
    public void testBye() throws RemoteException{
        Server server = new Server();
        Assert.assertEquals("Good Bye", server.Bye());
    }

    @Test
    public void test() throws RemoteException{
        Server server = new Server();
        Assert.assertEquals("Good", server.Question());
    }

    
}
