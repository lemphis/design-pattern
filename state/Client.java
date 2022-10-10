package state;

public class Client {

	public static void main(String[] args) {
		OnlineCourse onlineCourse = new OnlineCourse();
		Student lemphis = new Student("lemphis");
		Student zmzhoi = new Student("zmzhoi");

		onlineCourse.addStudent(lemphis);
		onlineCourse.changeState(new Private(onlineCourse));
		onlineCourse.addReview("hello", lemphis);
		onlineCourse.addStudent(zmzhoi);

		System.out.println(onlineCourse.getState());
		System.out.println(onlineCourse.getStudents());
		System.out.println(onlineCourse.getReviews());
	}

}
