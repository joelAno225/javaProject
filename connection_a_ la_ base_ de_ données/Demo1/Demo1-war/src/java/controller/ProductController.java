
package controller;

import Demo.ProductSessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import java.util.*;
import entites.*;

@Named(value = "productController")
@SessionScoped
public class ProductController implements Serializable {

    @EJB
    private ProductSessionBean productSessionBean;

    
    public ProductController() {
    }
    
    public product find(){
         return this.productSessionBean.find();
    }
    
    public List<product> findAll(){
         return this.productSessionBean.findAll();
    }
}  
