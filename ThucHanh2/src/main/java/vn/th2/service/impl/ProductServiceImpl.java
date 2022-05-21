package vn.th2.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.th2.entity.Product;
import vn.th2.repository.ProductRepository;
import vn.th2.service.ProductService;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepository;

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Transactional
	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Transactional
	@Override
	public void delete(String code) {
		productRepository.deleteById(code);
	}

	@Override
	public Product getByCode(String code) {
		return productRepository.findById(code).orElse(null);
	}
}
