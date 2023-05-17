package client;

import java.rmi.Naming;
import javax.swing.JOptionPane;
import sst.Response;

public class Client {

	public void getResponse(String url){
		int field[];
	
		try {
			// RMI Proxy-Objekt erzeugen
			Response proxy = (Response) Naming.lookup(url);
			String erg = getEingabe();
			if (erg.equals("Hello")) {
				System.out.print(proxy.Hello());
			} else if (erg.equals("Bye")) {
				System.out.print(proxy.Bye());
			} else if (erg.equals("Show array")) {
					field = proxy.giveAnswer4();
					for(int i = 0; i<field.length; i++){
						System.out.print(field[i]+" ");
					}
			} else {
				System.out.print("Fehler");
			}

		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

	public String getEingabe() {

		final String[] dropdown = {"Hello", "Bye", "Show array"};
		return (String) JOptionPane.showInputDialog(null, "Input",
				"ChatGPT 2.0", JOptionPane.QUESTION_MESSAGE, null, dropdown,
				dropdown[0]);
	}

}
