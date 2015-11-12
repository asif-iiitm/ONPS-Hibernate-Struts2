/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onps.action;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.DBService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Uchiha
 */
public class LoginAction extends ActionSupport implements SessionAware {
    
   HttpServletRequest req;
   private String userid;
   private String password;
   private Map<String,Object> session;
    
   public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /*public boolean validat() throws SQLException 
    {
        String query;
        query="select * from student where user='"+user+"' and password='"+password+"'";
        ResultSet rs;
        rs=DBService.selectData(query);
        boolean status=rs.next();
        return status;
        
    }*/
    
    public String execute() throws Exception  {
        String query;
        query="select * from users where userid='"+userid+"' and password='"+password+"'";
        System.out.println(query);
        ResultSet rs;
        rs=DBService.selectData(query);
        
        if(rs.next())
        {
            String r=rs.getString("role");
            System.out.println(r);
            if(r.equals("Admin"))
            {
            session = ActionContext.getContext().getSession();
            session.put("adminlog", "true");
            session.put("user", userid);
            session.put("r", r);
            return "asuccess";
            }
            else if(r.equals("Voter"))
            {
            session = ActionContext.getContext().getSession();
            session.put("voterlog", "true");
            session.put("user", userid);
            session.put("r", r);
            return "vsuccess";
            }
            else 
            {
            session = ActionContext.getContext().getSession();
            session.put("canlog", "true");
            session.put("user", userid);
            session.put("r", r);
            return "csuccess";
            }
        }
       
        else
        return ERROR;
}
    public void setServletRequest(HttpServletRequest hsr) {
        req = hsr;
    }

    @Override
    public void setSession(Map<String, Object> map) {
         this.session=map;
    }
    public Map<String ,Object> getSession()
    {
            return session;
    }
}
