package com.solt.jdc.securityfilterinrepository.repositories;

import com.solt.jdc.securityfilterinrepository.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    //@PostFilter("filterObject.owner == authentication.principal.username")
    @Query("select p from Product p where p.name like %:text% and p.owner=?#{authentication.principal.username}")
    List<Product> findProductByNameContains(String text);
}
