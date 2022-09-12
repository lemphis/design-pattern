package builder;

public class Client {

	public static void main(String[] args) {
		TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
		TourPlan cancunPlan = tourDirector.cancunTrip();
		TourPlan longBeachPlan = tourDirector.longBeachTrip();
	}

}
