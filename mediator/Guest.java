package mediator;

import java.time.LocalDateTime;

public class Guest {

	private Integer id;
	private FrontDesk frontDesk;

	public Guest(FrontDesk frontDesk) {
		this.frontDesk = frontDesk;
	}

	public Integer getId() {
		return id;
	}

	public void dinner(LocalDateTime dinnerTime) {
		this.frontDesk.dinner(this, dinnerTime);
	}

	public void getTowel(int numberOfTowels) {
		this.frontDesk.getTowels(this, numberOfTowels);
	}

}
