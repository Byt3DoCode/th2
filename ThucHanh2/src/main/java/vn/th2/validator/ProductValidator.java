package vn.th2.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import lombok.RequiredArgsConstructor;
import vn.th2.entity.Product;
import vn.th2.service.ProductService;

@Component
@RequiredArgsConstructor
public class ProductValidator implements Validator {
	private final ProductService productService;

	@Override
	public boolean supports(Class<?> clazz) {
		return Product.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Product product = (Product) target;
		
		Product getByCode = productService.getByCode(product.getCode());
		if(getByCode != null) {
			errors.rejectValue("code", "code", "Mã sản phẩm đã tồn tại");
		}
		
	}

}
