package facade;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

	private final EmailSettings emailSettings;

	public EmailSender(EmailSettings emailSettings) {
		this.emailSettings = emailSettings;
	}

	public void sendEmail(EmailMessage emailMessage) {
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", emailSettings.getHost());

		Session session = Session.getDefaultInstance(properties);

		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(emailMessage.getFrom()));
			message.addRecipients(Message.RecipientType.TO, emailMessage.getTo());
			message.setSubject(emailMessage.getSubject());
			message.setText(emailMessage.getText());
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
