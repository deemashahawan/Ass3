package stu.najah.edu.SingleResponsibility.impl;

import stu.najah.edu.SingleResponsibility.IntF.deleteInvoice;
import stu.najah.edu.SingleResponsibility.Invoice;

public class remover implements deleteInvoice {

    @Override
    public void deleteInv(Invoice invoice) {

        System.out.println("Database db = Database.getConnection()");
        System.out.println("result = db.executeQuery('select * from Invoice')");
        String interQuery = getDeleteQuery(invoice);
        DatabaseHellper.deleteRecord(interQuery);
    }
    private String getDeleteQuery(Invoice invoice) {
        StringBuilder query = new StringBuilder();
        query.append("delete invoice into: ");


        return query.toString();
    }
}
