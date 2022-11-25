
package Demo;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class HelloSessionBean {

    
    public String hello(String name){
          return "hello "+ name;
       }
    
    public Integer calculate (int a , String sign ,int b){
        
        if (sign.equals("+"))
            return a+b;
        else if (sign.equals("-"))
            return a-b;
        else if (sign.equals("*"))
            return a*b;
        else if (sign.equals("/"))
            return a/b;
        return null;
        
    }
}
