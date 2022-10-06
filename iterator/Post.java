package iterator;

import java.time.LocalDateTime;

public class Post {

	private final LocalDateTime createdDateTime = LocalDateTime.now();
	private String title;

	public Post(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

}
