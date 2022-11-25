
package controller;

import Demo.HelloSessionBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

@Named(value = "helloController")
@SessionScoped
public class HelloController implements Serializable {

    @EJB
    private HelloSessionBean helloSessionBean;
    
    public HelloController() {
        
    }
    public String display(){
        
          return this.helloSessionBean.hello("Apprendre la programmation java");    
    }
    
    public int calculate (){
       return this.helloSessionBean.calculate(10, "+", 10);
    }
}
