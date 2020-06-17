package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactury;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactury.createSellerDao();

		System.out.println(" ====== TESTE 1 - método findById ========");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n====== TESTE 2 - método findByDepartment ========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n====== TESTE 3 - método findByAll ========");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n====== TESTE 4 - método Seller insert ========");
		//Seller newSeller = new Seller(null, "Grag", "grag@gmail.com", new Date(), 4000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New ID = " + newSeller.getId());
		
		
		System.out.println("\n====== TESTE 5 - método Seller Update ========");
		seller = sellerDao.findById(8);
		seller.setName("Martha Rocha");
		sellerDao.update(seller);
		System.out.println("Update Completed! ");
		
		
		System.out.println("\n====== TESTE 6 - método Seller delet ========");
		int id = 8;
		sellerDao.deleteById(id);
		System.out.println("Deleted! ");
		
		
	}
}
