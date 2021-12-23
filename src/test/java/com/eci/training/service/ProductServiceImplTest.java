package com.eci.training.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.eci.training.dal.ProductDAO;
import com.eci.training.domain.Product;

@SpringBootTest()
public class ProductServiceImplTest {
	
	@Mock
	ProductDAO mockDAO;
	
	@Test
	public void createNewProduct_Must_Return_Valid_Id_When_Value_GTEQ_MinValue() {
		
		//Arrange
		ProductServiceImpl service = new ProductServiceImpl();
		
		//ProductDAO mockDAO = Mockito.mock(ProductDAO.class);
		
		service.setDao(mockDAO);
		Product aProduct = new Product("sample", 10001, 1);
		Product savedProduct = new Product("sample", 10001, 1);
		savedProduct.setId(1);
		
		Mockito.when(mockDAO.save(aProduct)).thenReturn(savedProduct);
		
		//Act
		int id = service.createNewProduct(aProduct);
		//Assert
//		Assert.assertTrue(id>0);
		
		
	}

}
