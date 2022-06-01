package myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myapp.entity.Product;
import myapp.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
    private ProductRepository repository;

    

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }



	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

    
}
