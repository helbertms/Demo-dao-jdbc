package application;


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
		
		System.out.println(" \n====== TESTE 2 - método findById ========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
