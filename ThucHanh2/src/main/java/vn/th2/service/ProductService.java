package vn.th2.service;

import java.util.List;

import vn.th2.entity.Product;

public interface ProductService {
	List<Product> getAll();
	
	Product save(Product product);
	
	void delete(String code);
	
	Product getByCode(String code);
}
