package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(2);


        System.out.println("==== TEST 1: seller findByID ====");
        System.out.println(seller);

        System.out.println("\n==== TEST 2: seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        sellers.forEach(System.out::println);

        System.out.println("\n==== TEST 3: seller findAll ====");
        sellers = sellerDao.findAll();
        sellers.forEach(System.out::println);

//        System.out.println("\n==== TEST 4: seller insert ====");
//        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n==== TEST 5: seller update ====");
        seller = sellerDao.findById(1);
        seller.setEmail("Bob Brown");
        seller.setEmail("bob@gmail.com");
        sellerDao.update(seller);
    }
}
