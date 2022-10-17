package stu.najah.edu.SingleResponsibility.impl;

import stu.najah.edu.SingleResponsibility.IntF.sendEmail;
import stu.najah.edu.SingleResponsibility.MailMessage;

public class sender implements sendEmail {
    @Override
    public void send(MailMessage mailMessage) {
        if (mailMessage.isValidMessage()){
            // Code for getting Email setting and send invoice mail
        } else {
            System.out.println("Error");
        }
    }
}
