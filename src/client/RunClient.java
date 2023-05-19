package client;


public class RunClient {

	public static void main(String[] args) {
		
		String url = "//localhost:1099/ChatGPT";
		Client client = new Client();
		client.getResponse(url);
		
	}
}