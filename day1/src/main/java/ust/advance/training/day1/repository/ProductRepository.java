package repository;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
//    @Query(name = "Product.findByStockGreaterThan")

    Optional<Product> findByProductIdAndQuantityGreaterThan(String id, int stock );
}
