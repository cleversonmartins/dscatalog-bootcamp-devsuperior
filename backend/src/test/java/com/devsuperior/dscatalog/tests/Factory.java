package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {
	public static Product createProduct() {
		Product product = new Product(1L, "PS5", "Videogame", 3500.0, 
				"http://img.io/ps5", Instant.now());
		product.getCategories().add(new Category(1L, "Eletrônicos"));
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(1L, "Eletrônicos");
	}
}