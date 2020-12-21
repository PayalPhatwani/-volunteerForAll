package com.VFA.Service;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;


import com.VFA.Model.requestBean;
public class emailService {

	// method for sending mail
		public void sendmail(int personId, requestBean email) throws AddressException, MessagingException, IOException {
			// necessary configuration to send email
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			Session session = Session.getInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					// enter your gmail id and password here from which you want to send email
					return new PasswordAuthentication("gmailid", "password");
				}
			});
			Message msg = new MimeMessage(session);
			
			msg.setFrom(new InternetAddress("xyz@gmail.com", false));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("email-id"));
			msg.setSubject(email.getSubject());
			msg.setContent(email.getEmailbody(), "text/html");
			msg.setSentDate(new Date());
			Transport.send(msg);
		}
}
