package prototype;

public class App {

	public static void main(String[] args) {
		GithubRepository repository = new GithubRepository();
		repository.setUser("lemphis");
		repository.setName("design-pattern");

		GithubIssue githubIssue = new GithubIssue(repository);
		githubIssue.setId(1);
		githubIssue.setTitle("design pattern - prototype pattern");

		String url = githubIssue.getUrl();
		System.out.println(url);

		GithubIssue clone = githubIssue.clone();
		System.out.println(clone.getUrl());

		System.out.println(clone != githubIssue);
		System.out.println(clone.equals(githubIssue));
		System.out.println(clone.getClass() == githubIssue.getClass());
	}

}
