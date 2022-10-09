package observer.ex2;

public class Client {

	public static void main(String[] args) {
		ChatServer chatServer = new ChatServer();
		User user1 = new User("lemphis");
		User user2 = new User("zhzmoi");

		chatServer.register("ui team", user1);
		chatServer.register("ui team", user2);

		chatServer.register("api team", user1);

		chatServer.sendMessage(user1, "ui team", "또 지각이야?");
	}

}
