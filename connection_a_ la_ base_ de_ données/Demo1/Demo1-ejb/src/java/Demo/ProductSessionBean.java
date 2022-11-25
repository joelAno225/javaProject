
package Demo;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import java.util.*;
import entites.*;


@Stateless
@LocalBean
public class ProductSessionBean {
    
    public product find(){
        
        return new product("P1","Joel",500);
    }
    
    public List<product> findAll(){
         List<product> ListProduct = new ArrayList<product>();
         ListProduct.add(new product("P1","Joel",5000));
         ListProduct.add(new product("P2","Mojo",1000));
         ListProduct.add(new product("P3","Stephi",1100));
         return ListProduct;
    }
    

}
