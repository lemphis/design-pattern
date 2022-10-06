package iterator;

import java.util.Iterator;

public class Client {

	public static void main(String[] args) {
		Board board = new Board();
		board.addPost("design pattern");
		board.addPost("iterator");
		board.addPost("pattern");

		Iterator<Post> recentPostIterator = board.getRecentPostIterator();
		while (recentPostIterator.hasNext()) {
			System.out.println(recentPostIterator.next().getTitle());
		}
	}

}
