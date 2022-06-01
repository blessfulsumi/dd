package myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myapp.entity.Product;
//@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	
}
