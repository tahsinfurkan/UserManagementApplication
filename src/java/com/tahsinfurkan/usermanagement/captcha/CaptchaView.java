package java.com.tahsinfurkan.usermanagement.captcha;

import javax.faces.bean.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@ManagedBean(name = "captchaView")
@ApplicationScoped
public class CaptchaView {

    public void submit() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}