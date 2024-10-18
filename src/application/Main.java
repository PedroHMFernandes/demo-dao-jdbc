package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department dpt = new Department(1, "Books");
        Seller seller = new Seller(1, "John Doe", "johndoe@gmail.com", new Date(), 3000.0, dpt);

        System.out.println(dpt);
        System.out.println(seller);
    }
}
