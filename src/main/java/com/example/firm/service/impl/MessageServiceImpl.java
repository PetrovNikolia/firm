package com.example.firm.service.impl;

import com.example.firm.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;

@Component
public class MessageServiceImpl implements MessageService {

    @Autowired
    private JavaMailSender sender;

    @Override
    public void sendMsg(String msg) {
        MimeMessagePreparator message = newMessage -> {
            newMessage.setRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress("nikolaykolya123ewq@gmail.com")
            );
            newMessage.setFrom("nikolaykolya123ewq@gmail.com");
            newMessage.setSubject("Новая заявка");
            newMessage.setText(msg);
        };

        this.sender.send(message);
    }
}
