package br.com.bb.Service;

import br.com.bb.Repository.ProductRepository;
import br.com.bb.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllByCategoryId(Integer categoryId){
        return productRepository.findByCategoryId(categoryId);
    }

}
