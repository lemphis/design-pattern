package mediator;

import java.time.LocalDateTime;

public class Hotel {

	public static void main(String[] args) {
		FrontDesk frontDesk = new FrontDesk();
		Guest guest = new Guest(frontDesk);
		guest.getTowel(3);
		guest.dinner(LocalDateTime.of(2022, 10, 8, 11, 53));
	}

}
