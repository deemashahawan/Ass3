package stu.najah.edu.SingleResponsibility;
import stu.najah.edu.SingleResponsibility.IntF.addInvoice;
import stu.najah.edu.SingleResponsibility.IntF.deleteInvoice;
import stu.najah.edu.SingleResponsibility.IntF.sendEmail;

import java.util.Date;

public class Invoice {
    private long amount;
    private Date invoiceDate;

    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }
    private addInvoice AddInvoice;
    private deleteInvoice removeInvoice;
    private sendEmail SendEmail;
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public addInvoice getAddInvoice() {
        return AddInvoice;
    }

    public void setAddInvoice(addInvoice addInvoice) {
        AddInvoice = addInvoice;
    }

    public deleteInvoice getRemoveInvoice() {
        return removeInvoice;
    }

    public void setRemoveInvoice(deleteInvoice removeInvoice) {
        this.removeInvoice = removeInvoice;
    }

    public void add()  {
        AddInvoice.addInv(this);
    }

    public void delete()  {
        removeInvoice.deleteInv(this);
    }
    public void Email(MailMessage mailMessage)  {

        this.SendEmail.send(mailMessage);
    }
}
