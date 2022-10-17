package stu.najah.edu.SingleResponsibility.impl;

import stu.najah.edu.SingleResponsibility.IntF.addInvoice;
import stu.najah.edu.SingleResponsibility.Invoice;
import stu.najah.edu.SingleResponsibility.MailMessage;

public class adder implements addInvoice {
    @Override
    public void addInv(Invoice invoice) {
        String interQuery = getInsertQuery(invoice);
        DatabaseHellper.insertNewRecord(interQuery);
        System.out.println("Database db = Database.getConnection()");
        System.out.println("result = db.executeQuery('select * from Invoice')");
        MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        invoice.Email(mailMessage);
    }

    private String getInsertQuery(Invoice invoice) {
        StringBuilder query = new StringBuilder();
        query.append("Insert into invoice amount: ");
        query.append(invoice.getAmount());


        return query.toString();
    }
}
