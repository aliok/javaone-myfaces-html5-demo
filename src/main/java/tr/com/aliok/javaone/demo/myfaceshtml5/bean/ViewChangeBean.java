package tr.com.aliok.javaone.demo.myfaceshtml5.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@ManagedBean(name = "viewChangeBean")
@RequestScoped
public class ViewChangeBean implements Serializable{
    public boolean isSlideView(){
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        return request.getRequestURL().toString().contains("slides.jsf");
    }
}
