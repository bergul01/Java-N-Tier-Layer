package nLayeredDemo;


import nLayeredDemo.business.abstracts.ProductServise;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;

import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
	
		//entityler haric newliyorsak ilerde problem yaşarız
		// ToDo : Spring IoC ile çözülecek 6.ders   20 ve 21. satırdaki kodlar 
		
		
		//ProductServise productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());   hibernate ile çalışırsak bu kısımı
		ProductServise productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());	//abc ile çalışırsak bu kısımı 
		
		/*iş yerinde bize dendi ki hibernate kullanmicaz abcProductDao kullanıcaz o zaman eski kodlara ellemeden 
		abcProductDao class oluşturulup interface ile implements etmemiz gerekir ve istenileni yapmış oluruz.*/
		
		
		Product product = new Product(1,2,"ELMA",12,50);
		productService.add(product);
	}

}
