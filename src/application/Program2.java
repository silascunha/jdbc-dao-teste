package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDAO depDao = DaoFactory.createDepartmentDao();

        System.out.println("====TESTE Department findById====");
        Department dep = depDao.findById(2);
        System.out.println(dep);

        System.out.println("\n====TESTE Department findAll====");
        List<Department> list = depDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n====TESTE Department insert====");
        //depDao.insert(new Department(null, "Departamento Teste"));
        //System.out.println("Departamento inserido!");

        System.out.println("\n====TESTE Department update====");
        depDao.update(new Department(6, "Roupas"));
        System.out.println("Atualizado!");

        System.out.println("\n====TESTE Department delete====");
        System.out.print("Digite o id: ");
        int id = sc.nextInt();
        depDao.deleteById(id);
        System.out.println("Excluído!!");

        sc.close();
    }
}
