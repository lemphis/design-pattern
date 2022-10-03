package chainofresponsibility;

public class Client {

	private RequestHandler requestHandler;

	public Client(RequestHandler requestHandler) {
		this.requestHandler = requestHandler;
	}

	public static void main(String[] args) {
		RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
		Client client = new Client(chain);
		client.doWork();
	}

	public void doWork() {
		Request request = new Request("이번 놀이는 뽑기입니다.");
		requestHandler.handle(request);
	}

}
