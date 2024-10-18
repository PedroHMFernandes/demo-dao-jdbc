package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: department findByID ====");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n==== TEST 2: department findAll ====");
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

        System.out.println("\n==== TEST 3: insert department ====");
//        departmentDao.insert(new Department(null, "Justiceiros"));

        System.out.println("\n==== TEST 4: update department ====");
//        department = departmentDao.findById(6);
//        department.setName("Libertinagem");
//        departmentDao.update(department);
//        System.out.println("Department updated successfully");

        System.out.println("\n==== TEST 5: delete department ====");
        departmentDao.deleteById(8);
    }
}
