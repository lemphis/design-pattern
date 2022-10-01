package facade;

public class Client {

	public static void main(String[] args) {
		EmailSettings emailSettings = new EmailSettings();
		emailSettings.setHost("127.0.0.1");

		EmailMessage emailMessage = new EmailMessage();
		emailMessage.setFrom("lemphis@gmail.com");
		emailMessage.setTo("vscode@kakao.com");
		emailMessage.setSubject("오징어 게임");
		emailMessage.setText("밖은 더 지옥이더라고..");

		EmailSender emailSender = new EmailSender(emailSettings);
		emailSender.sendEmail(emailMessage);
	}

}
