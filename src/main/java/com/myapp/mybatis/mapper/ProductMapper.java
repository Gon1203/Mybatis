package com.myapp.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myapp.mybatis.model.Product;

@Mapper
public interface ProductMapper {

	
	// 구현이 안된 추상 메소드 들을 연결된 mapper 폴더의 ProductMapper.xml 에서 작성함
	Product selectProductById(Long id);

	List<Product> selectAllProducts();

	void insertProduct(Product product);

	void updateProduct(Product product);

	void deleteProductById(Long id);

}
