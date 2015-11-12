/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onps.action;

import com.opensymphony.xwork2.ActionSupport;
import dao.DBService;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Uchiha
 */
public class RegisterAction extends ActionSupport implements ServletRequestAware {
    
    HttpServletRequest req;
    private String userid;
    private String password;
    private String city;
    private String constituency;
    private String role;
    private String party;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

   

   
    

    
    
    public boolean registered()
    {
        String query;
        System.out.println(userid);
        System.out.println(password);
        query="insert into users values('"+userid+"','"+password+"','"+role+"')";
        int ur=DBService.updateData(query);
        int ur1=0;
        System.out.println(ur);
        System.out.println(query);
        System.out.println(role);
        if(ur==1 && role.equals("Voter"))
        {
            String subQuery="insert into voters values('"+userid+"','"+city+"','"+constituency+"','"+name+"')";
            System.out.println(subQuery);
            ur1=DBService.updateData(subQuery);
            
        }
        if(ur==1 && role.equals("Candidate"))
        {
            String subQuery="insert into candidates values('"+userid+"','"+city+"','"+constituency+"','"+name+"','"+party+"')";
            //String subQuery="insert into voters values ";
            System.out.println(subQuery);
            ur1=DBService.updateData(subQuery);
        }
        System.out.println(ur);
        System.out.println(ur1);
        
        if(ur==1&&ur1==1)
            return true;
        else
            return false;
    }
    
    public String execute() throws Exception {
        if(registered())
            return "success";
        else
            return "error";
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        req=hsr;
    }
    
}
