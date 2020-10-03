package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("====TESTE: seller findById====");
        Seller seller = sellerDAO.findById(8);
        System.out.println(seller);

        System.out.println("\n====TESTE: seller findByDepartment====");
        List<Seller> list = sellerDAO.findByDepartment(DaoFactory.createDepartmentDao().findById(1));
        list.forEach(System.out::println);

        System.out.println("\n====TESTE: seller findAll====");
        list = sellerDAO.findAll();
        list.forEach(System.out::println);

    }
}
