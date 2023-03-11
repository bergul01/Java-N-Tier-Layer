package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductServise;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductServise {
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) { //HİBERNATE E BAĞLI DEĞİLİZ AMA HİBERNATE REFERANSINI TUTUYORUZ.
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
	//hibernate e asla bağlı değiliz bu yaptıklarımızla üst satırdaki kodlar
	@Override
	public void add(Product product) {
		
		/*HibernateProductDao dao = new HibernateProductDao();
		dao.add(product);
		BU YAPTIĞIMIZ KISIM İLE HIBERNATE KISMINA ÇOK SIKI BAĞLIYIZ BUNU İSTEMİYORUZ YUKARDAKİ KODU YAZARAK BAĞLILIK ÇÖZÜLÜR.
		*/
		
		if(product.getCategoryId() == 1) {
			System.out.println("bu kategoride urun kabul edilemiyor.");
			return;
		}
		
		this.productDao.add(product);
		
		//JLoggerManager i dışardan alınan hazır mikroservisi bu kısımda çağırmamız gerek nasıl çağırırız
		//JLoggerManager kısmına dokunamıyoruz.
		//bu durumda kendi interface kısmımızı yaratıcaz core packet kısmında bunu yaptık LoggerService adında bir interface oluşturduk
		
		this.loggerService.logToSystem("urun eklendi: " + product.getName());
	}

	@Override
	public List<Product> getAll() {

		return null;
	}

}
