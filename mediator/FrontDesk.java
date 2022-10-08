package mediator;

import java.time.LocalDateTime;

public class FrontDesk {

	private CleaningService cleaningService = new CleaningService(this);
	private Restaurant restaurant = new Restaurant(this);

	public void getTowels(Guest guest, int numberOfTowels) {
		cleaningService.getTowel(guest.getId(), numberOfTowels);
	}

	public String getRoomNumberFor(Integer guestId) {
		return "1111";
	}

	public void dinner(Guest guest, LocalDateTime dinnerTime) {
		restaurant.dinner(guest.getId(), dinnerTime);
	}

}
