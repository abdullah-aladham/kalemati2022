//package com.abdullah_aladham.kalemati.Services;
//
//import com.abdullah_aladham.kalemati.Registeration.Email.EmailSender;
//import lombok.AllArgsConstructor;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import java.util.logging.Logger;
//import java.mail;
//import javax.mail.internet.MimeMessage;
//
//@Service
//@AllArgsConstructor
//public class EmailServices implements EmailSender {
//    private final static Logger LOGGER = LoggerFactory.getLogger(EmailServices.class);
//    private final JavaMailSender mailSender;
//    @Override
//    public void send(String to, String Email) {
//        try{
//        MimeMessage message =mailSender.createMimeMessage();
//        }
//        catch (MessagingException e){
//            LOGGER.error("failed to send mail ",e);
//            throw new IllegalStateException("failed to send email");
//        }
//
//    }
//}
