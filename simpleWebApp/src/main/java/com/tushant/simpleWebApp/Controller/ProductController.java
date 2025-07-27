package com.tushant.simpleWebApp.Controller;

import com.tushant.simpleWebApp.Model.Product;
import com.tushant.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductbyId(@PathVariable int prodId)
    {
        return service.getProductbyId(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
         service.addProduct(prod);
    }

    @PutMapping("/products/{prodId}")
    public void updateProduct(@RequestBody Product prod)
    {
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
