package com.tushant.simpleWebApp.Repository;

import com.tushant.simpleWebApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepo extends JpaRepository <Product,Integer> {
}
