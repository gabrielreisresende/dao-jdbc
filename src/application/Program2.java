package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: department insert ===");
		Department newDepartment = new Department(null, "Sports");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id: " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4: department delete ===");
		System.out.print("What department do you want to delete? ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department deleted!");
		
		System.out.println("\n=== TEST 5: department update ===");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Music");
		departmentDao.update(dep2);
		System.out.println("Depertment updated!");
		
		
		sc.close();
	}

}
