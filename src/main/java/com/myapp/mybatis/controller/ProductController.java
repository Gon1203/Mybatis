package com.myapp.mybatis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.mybatis.mapper.ProductMapper;
import com.myapp.mybatis.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

//	@Autowired // 필드 주입(DI)
	private ProductMapper productMapper;

	// 생성자 주입 (객체를 생성자 주입으로 입력시 @Autowired가 필요없음, 권장)
	public ProductController(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}

	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		Product product = productMapper.selectProductById(id);
		return product;
	}

	@GetMapping()
	public List<Product> getProductList() {

		List<Product> products = productMapper.selectAllProducts();
		return products;
	}

	@PostMapping
	public void createProduct(@RequestParam("name") String prodName, @RequestParam("price") int prodPrice) {

		productMapper.insertProduct(new Product(prodName, prodPrice));
	}

	@PutMapping("/{id}")
	public void updateProduct(@PathVariable("id") long prodId, @RequestParam("name") String prodName,
			@RequestParam("price") int prodPrice) {

		productMapper.updateProduct(new Product(prodId, prodName, prodPrice));
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id") long id) {
		productMapper.deleteProductById(id);
	}
}
