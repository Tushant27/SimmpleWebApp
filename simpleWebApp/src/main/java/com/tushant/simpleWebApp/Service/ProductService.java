package com.tushant.simpleWebApp.Service;

import com.tushant.simpleWebApp.Model.Product;
import com.tushant.simpleWebApp.Repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    Productrepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList
//            (new Product(1,"Dj",999),
//            (new Product(2,"MIC",899)),
//            (new Product(3,"POP",799))));

    public List<Product> getProducts() {
        return  repo.findAll();
    }

    public Product getProductbyId(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }
}