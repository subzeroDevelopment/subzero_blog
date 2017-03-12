/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author subzero
 */
@Controller        
public class HomeControler {
    
    
    @RequestMapping("home.htm")
    public ModelAndView home(){
        ModelAndView mav =new ModelAndView();
        mav.setViewName("home");
        
        return mav;
    
    }
     @RequestMapping("nosotros.htm")
     public ModelAndView nosotros(HttpServletRequest req){
        ModelAndView mav =new ModelAndView();
        mav.setViewName("nosotros");
        
        String id=req.getQueryString();
        System.out.println(id);
        String id2=req.getParameter("id");
        System.err.println(id2);
        
        mav.addObject("id",id2);
        
        return mav;
    
    }
    
}
