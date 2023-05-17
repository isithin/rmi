package client;

import java.rmi.Naming;
import javax.swing.JOptionPane;
import sst.Response;

public class Client {

	public void getResponse(String url){

	
		try {
			Response stub = (Response) Naming.lookup(url);
			String erg = getEingabe();

			if (erg.equals("Hello")) {
				System.out.print(stub.Hello());
			} else if (erg.equals("Bye")) {
				System.out.print(stub.Bye());
			} else if (erg.equals("How are you?")) {
				System.out.print(stub.Question());	
					
			} else {
				System.out.print("Fehler");
			}

		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

	public String getEingabe() {

		final String[] dropdown = {"Hello", "Bye", "How are you?"};
		return (String) JOptionPane.showInputDialog(null, "Input",
				"ChatGPT 2.0", JOptionPane.QUESTION_MESSAGE, null, dropdown,
				dropdown[0]);
	}

}
