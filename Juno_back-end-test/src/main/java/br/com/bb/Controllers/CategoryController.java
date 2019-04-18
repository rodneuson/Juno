package br.com.bb.Controllers;

import java.util.List;

import br.com.bb.Models.Category;

import br.com.bb.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/listAll")
    public List<Category> listAll(){
        return categoryService.getAll();
    }

}
