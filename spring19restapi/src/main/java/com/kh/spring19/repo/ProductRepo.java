package com.kh.spring19.repo;

import java.util.List;

import com.kh.spring19.dto.ProductDto;


public interface ProductRepo {
	List<ProductDto> selectList();
	ProductDto selectOne(int no);
	void insert(ProductDto productDto);
	boolean update(ProductDto productDto);
	boolean delete(int no);
}
