package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements INotificationService {
	
	@Override
	public String sendMessage(EmailUser user) {
		return "Sending Email from " + user.toString();
	}
//	private String fromEmailUsername = "sush@gmail.com";
//	private String fromEmailPassword = "pass12";
//	
//	@Value("${email.provider}")
//	private String emailProvider;
//	@Value("${email.provider.port}")
//	private int emailProviderPort;
//	
//	
//	public void sendMessage(String toEmail, String messageBody){
//		Properties prop = new Properties();
//		prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//        
//        
//        
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(fromEmailUsername, fromEmailPassword);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("from@gmail.com"));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse("to_username_a@gmail.com, to_username_b@yahoo.com")
//            );
//            message.setSubject("Testing Gmail TLS");
//            message.setText("Dear Mail Crawler,"
//                    + "\n\n Please do not spam my email!");
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//	}

}
