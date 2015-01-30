package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Yang on 2015/1/19.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        if (getUsername().equals("yang")&& getPassword().equals("123")){
            ActionContext.getContext().getSession().put("user", getUsername());
            return SUCCESS;
        }
        else {
            return ERROR;
        }
    }
}
