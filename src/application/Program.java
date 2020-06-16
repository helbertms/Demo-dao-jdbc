package application;


import model.dao.DaoFactury;
import model.dao.SellerDao;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactury.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
