/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchstruts.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Map;

/**
 *
 * @author Lucas
 */
public class UserLogged implements Interceptor{

    public void destroy() {
        
    }

    public void init() {
        
    }

    public String intercept(ActionInvocation ai) throws Exception {
        //obtenemos sesion
        Map<String, Object> userSession = ai.getInvocationContext().getSession();
        
        if (userSession==null || userSession.get("usuario") ==null){
            return "login";
        }else{
            if(userSession.get("usuario").toString().equals("admin")){
                return ai.invoke();
            }else{
                return "login";
            }
        }        
    }    
}
