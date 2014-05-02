/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.gchstruts.action;

/**
 *
 * @author Lucas
 */
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import pe.edu.cibertec.gchhibernate.modelo.User;

/*
Login Action: Controlador Seguridad
*/
public class LoginAction extends ActionSupport implements SessionAware{
    private User usuario;
    private Map<String, Object> session;


    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

  
    public String login() throws Exception {
        
        if(usuario.getUser().equals("admin") && 
                usuario.getPass().equals("admin")){           
            //guardamos objetos en sesion
            session.put("usuario", getUsuario().getUser());                
            return SUCCESS;
        }else{
            addActionError(getText("login.wrong.credentials"));
            return LOGIN; 
        }
    }
    
    public String logout() throws Exception {       
            //obtenemos sesion
            session.remove("usuario");       
            
            return LOGIN;
    }
    
    public String home(){
        return SUCCESS;
    }
    
    public String inicio(){
        return LOGIN;
    }
    
    @Override
    public void validate() {
        if(getUsuario()!=null){
            
            String user= getUsuario().getUser();
            String pass= getUsuario().getPass();
            
            if(user==null || user.equals("")){
                addFieldError("usuario.user", getText("login.empty.username"));
            }
            if(pass==null || pass.equals("")){
                addFieldError("usuario.pass", getText("login.empty.password"));
            }       
            
        }
       
    }
    
    
    public Map<String, Object> getSession() {
        return session;
    }

    public void setSession(Map<String, Object> map) {
        session = map;
    }
}
