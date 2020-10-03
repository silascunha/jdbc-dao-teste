package application;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department dep = new Department(15, "Computadores");
        Seller sel = new Seller(16, "Silas", "silas@gmail.com", new Date(), 2000.0, dep);

        System.out.println(sel);
    }
}
