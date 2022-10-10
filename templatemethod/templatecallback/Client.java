package templatemethod.templatecallback;

public class Client {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new FileProcessor("number.txt");
		int result = fileProcessor.process(Integer::sum);
		System.out.println(result);
	}

}
