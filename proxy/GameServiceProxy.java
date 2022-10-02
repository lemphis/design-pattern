package proxy;

public class GameServiceProxy implements GameService {

	private final GameService gameService;

	public GameServiceProxy(GameService gameService) {
		this.gameService = gameService;
	}

	@Override
	public void startGame() {
		long start = System.currentTimeMillis();
		gameService.startGame();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
