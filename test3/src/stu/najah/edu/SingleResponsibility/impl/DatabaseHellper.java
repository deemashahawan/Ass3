package stu.najah.edu.SingleResponsibility.impl;

public class DatabaseHellper {
    public static void insertNewRecord(String interQuery) {

        System.out.println("Database db = Database.getConnection()");
        System.out.println("result = db.executeQuery 'insert this");
    }
    public static void deleteRecord(String interQuery){
        System.out.println("Database db = Database.getConnection()");
        System.out.println("result = db.executeQuery 'delete this");
    }
}
