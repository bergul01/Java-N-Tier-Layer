package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	void add(Product product); //Product tipinde product değişkeni 
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();  //List interface dir//dizi oluşturma şekli ekledikçe dizi length i genişler dinamik bir yapı 
	//ArrayList<Integer> sayilar2 = new ArrayList<Integer>();  üst satırda ki List yapısı daha gelişmiş ypaıdır ve farklı nesneleride tutabiliriz
	
	
}
