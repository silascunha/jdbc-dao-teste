package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("====TESTE: findById====");
        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);
    }
}
