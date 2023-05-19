package client;

import server.*;

import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class LokalTest {
 
    public static void main(String[] args) throws RemoteException{

        Server re = new Server();
        String er = getEingabe();

        if (er.equals("Hello")) {
            System.out.print(re.Hello());
        } else if (er.equals("Bye")) {
            System.out.print(re.Bye());
        } else if (er.equals("How are you?")) {
            System.out.print(re.Question());	
            
        } else {
            System.out.print("Fehler");
        }
    }

    public static String getEingabe() {

		final String[] dropdown = {"Hello", "Bye", "How are you?"};
		return (String) JOptionPane.showInputDialog(null, "Input",
				"ChatGPT 2.0", JOptionPane.QUESTION_MESSAGE, null, dropdown,
				dropdown[0]);
	}
}
