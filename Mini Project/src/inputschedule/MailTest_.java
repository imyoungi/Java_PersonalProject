package inputschedule;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import inputschedule.new_SendSchedule;

public class MailTest_ {
	
	public static void main(String[] args) {
		new_SendSchedule ns = new new_SendSchedule();
	
		final String user = "wemit_helper@naver.com";
		final String password = "dkssudgktpdy!";
		
		

		Properties p = new Properties();
		p.put("mail.smtp.host", "smtp.naver.com");
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.ssl.enable", "true");
		p.put("mail.smtp.ssl.trust", "smtp.naver.com");
		p.put("mail.smtp.debug", "true");
		p.put("mail.smtp.socketFactory.port","465");
		p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.socketFactory.fallback", "false");
		
		

		Session session = Session.getDefaultInstance(p, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);

			}
		});
		

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			 
			InternetAddress[] toAddr = new InternetAddress[2];
			toAddr[0] = new InternetAddress(ns.getMreceiver());
			toAddr[1] = new InternetAddress(ns.getMCc());
			

			// 수신자 메일 주소
			message.addRecipients(Message.RecipientType.TO, toAddr);

			message.setSubject("[일정알림] "+ns.getMtitle()); // 메일 제목

			// Text
			message.setText(ns.getMmemo());

			Transport.send(message);
			System.out.println("메일 발송완료");
			System.out.println();

		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
			System.out.println("메일 발송실패");
		}
	}
}