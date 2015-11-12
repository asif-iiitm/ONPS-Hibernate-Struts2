package onps.util;
import onps.entity.Admin;
import onps.entity.Candidates;

import onps.entity.Users;
import onps.entity.Voters;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TableCreater {
 public static void main(String[] args) {
  AnnotationConfiguration cfg = new AnnotationConfiguration();
  //cfg.addAnnotatedClass(Employee.class);
  //cfg.addAnnotatedClass(Person.class);
  //cfg.addAnnotatedClass(PersonDetail.class);
  //cfg.addAnnotatedClass(Users.class);
  
  cfg.addAnnotatedClass(Voters.class);
  cfg.addAnnotatedClass(Candidates.class);
  cfg.addAnnotatedClass(Admin.class);
  cfg.configure();
  
  SchemaExport se = new SchemaExport(cfg);
  se.create(true, true);
  System.out.println("TABLE CREATED!!!");
 
  
  
  
  
  
  }
}
