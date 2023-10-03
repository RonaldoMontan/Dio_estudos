package com.ronaldo.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.demo.Department;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public List<Product> getObjects(){
        Department d1 = new Department(1l, "Tech");
        Department d2 = new Department(2l, "Pet");

        Product p1 = new Product(1l, "Mackbook pro", 4000.0, d1);
        Product p2 = new Product(2l, "Pc -gamer", 5000.00, d2);
        Product p3 = new Product(3l, "pet - House", 300.0, d2);

        List<Product> list = Arrays.asList(p1, p2, p3);
        
        return list;
    }


}
