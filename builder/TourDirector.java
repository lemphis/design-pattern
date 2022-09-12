package builder;

import java.time.LocalDate;

public class TourDirector {

	private TourPlanBuilder tourPlanBuilder;

	public TourDirector(TourPlanBuilder tourPlanBuilder) {
		this.tourPlanBuilder = tourPlanBuilder;
	}

	public TourPlan cancunTrip() {
		return tourPlanBuilder.title("칸쿤 여행")
				.nightAndDays(2, 3)
				.startDate(LocalDate.of(2022, 9, 11))
				.whereToStay("리조트")
				.addPlan(0, "체크인하고 짐 풀기")
				.addPlan(0, "저녁 식사")
				.getPlan();
	}

	public TourPlan longBeachTrip() {
		return tourPlanBuilder.title("롱비치")
				.startDate(LocalDate.of(2022, 9, 11))
				.getPlan();
	}

}
