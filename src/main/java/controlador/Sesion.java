package controlador; 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.*;

@ManagedBean
@SessionScoped
public class Sesion{
    
    private Usuario u; 
    private String username;
    private String password;
    
    private void creaUsuario(String n,String c,String con){
        this.u=new Usuario(200,n,c,con,true,true);
    }
    public String login() {
        UsuarioDAO em = new UsuarioDAO();
        
        creaUsuario("Alan","1234net.com","1234");
        Usuario user = u;
        FacesContext context = FacesContext.getCurrentInstance();

        //if (user == null) {
          //  context.addMessage(null, new FacesMessage("Unknown login, try again"));
          //  username = null;
          //  password = null;
          //  return "";
        //} else{
            context.getExternalContext().getSessionMap().put("user", user);
            username = null;
            password = null;
            return "index.xhtml?faces-redirect=true";
        
        }
}
    


