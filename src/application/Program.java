package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("====TESTE: seller findById====");
        Seller seller = sellerDAO.findById(7);
        System.out.println(seller);

        System.out.println("\n====TESTE: seller findByDepartment====");
        Department department = DaoFactory.createDepartmentDao().findById(3);
        List<Seller> list = sellerDAO.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n====TESTE: seller findAll====");
        list = sellerDAO.findAll();
        list.forEach(System.out::println);

        System.out.println("\n====TESTE: seller insert====");
        seller = new Seller(null, "Ana Paula", "ana@gmail.com", new Date(), 4000.0, department);
        //sellerDAO.insert(seller);
        //System.out.println("Inserido! Novo ID = " + seller.getId());

        System.out.println("\n====TESTE: seller update====");
        seller = new Seller(7, "Sandro Cezar", "sandro@gmail.com", new Date(), 3500.0, department);
        sellerDAO.update(seller);
        System.out.println("Atualizado! Novo seller = " + seller);

        System.out.println("\n====TESTE: seller deleteById====");
        System.out.print("Digite o id a ser excluído: ");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.println("Seller excluído!");

        sc.close();
    }
}
