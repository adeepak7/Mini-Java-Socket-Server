
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEEPAK AHIRE
 */

public class TestRequests {

    private Socket s;
    private ObjectOutputStream oos;
    public TestRequests() throws IOException
    {
        System.out.println("Google");
        s = new Socket("localhost",8888);
        User user = new User("0701","Deepak Ahire","WCE Sangli",false,0,0,0,0);
        oos = new ObjectOutputStream(s.getOutputStream());
        oos.writeObject(user);
        oos.close();
        s.close();
    }
    
    public static void main(String [] DEEPAK) throws IOException
    {
        new TestRequests();
    }
}
