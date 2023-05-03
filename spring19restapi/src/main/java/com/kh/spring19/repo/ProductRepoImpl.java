package com.kh.spring19.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring19.dto.ProductDto;

@Repository
public class ProductRepoImpl implements ProductRepo{

	@Autowired
	private SqlSession sqlSession;	
	
	@Override
	public List<ProductDto> selectList() {
		return sqlSession.selectList("product.list");
	}

	@Override
	public ProductDto selectOne(int no) {
		return sqlSession.selectOne("product.find", no);
	}

	@Override
	public void insert(ProductDto productDto) {
		sqlSession.insert("product.add", productDto);
	}

	@Override
	public boolean update(ProductDto productDto) {
		return sqlSession.update("product.edit", productDto) > 0;
	}

	@Override
	public boolean delete(int no) {
		return sqlSession.delete("product.delete", no) > 0;
	}

}