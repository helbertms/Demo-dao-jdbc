package application;


import java.util.Date;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
		Seller seller = new Seller(24, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(obj);
		System.out.println(seller);
	}

}
