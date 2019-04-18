package br.com.bb.Controllers;

import br.com.bb.Models.Product;
import br.com.bb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/listByCategory/{categoryId}", method = RequestMethod.GET)
    public List<Product> listAll(@PathVariable("categoryId") Integer categoryId){
        return productService.getAllByCategoryId(categoryId);
    }

}
