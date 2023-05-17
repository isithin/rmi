package client;


public class RunClient {

	public static void main(String[] args) {
		
		String url = "//localhost/ChatGPT";
		Client client = new Client();
		client.getResponse(url);
		
	}
}