package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("====TESTE: seller findById====");
        Seller seller = sellerDAO.findById(7);
        System.out.println(seller);

        System.out.println("\n====TESTE: seller findByDepartment====");
        Department department = DaoFactory.createDepartmentDao().findById(1);
        List<Seller> list = sellerDAO.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n====TESTE: seller findAll====");
        list = sellerDAO.findAll();
        list.forEach(System.out::println);

        System.out.println("\n====TESTE: seller insert====");
        seller = new Seller(null, "Ana Paula", "ana@gmail.com", new Date(), 4000.0, department);
        //sellerDAO.insert(seller);
        //System.out.println("Inserido! Novo ID = " + seller.getId());

    }
}
