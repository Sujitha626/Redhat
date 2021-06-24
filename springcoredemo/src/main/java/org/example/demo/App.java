package org.example.demo;

import org.example.demo.model.Coach;
import org.example.demo.model.Customer;
import org.example.demo.model.InternationalCD;
import org.example.demo.model.SpecialEditionCD;
import org.example.demo.model.Coach;
import org.example.demo.model.Employee;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.demo.model.Coach;
import org.example.demo.model.Employee;
import org.example.demo.model.ManagerEmp;

import model2.MyInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
         
         @SuppressWarnings("resource")
   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
   /*
    * Coach theCoach=context.getBean("theCoach",Coach.class);
    * System.out.println(theCoach.getDailyWorkOut());
    */
         
   //Employee e=context.getBean("e",Employee.class);
  // System.out.println(e.getEmail());
         
        // InternationalCD cd = context.getBean("theCD", InternationalCD.class);
			//System.out.println(cd.getDetails());
			//cd.setCdId(101);
			//cd.setCdName("Godzila");
			//cd.setLanguage("Russian");
			//System.out.println(cd.getDetails());
			//SpecialEditionCD cd1=context.getBean("theCD1",SpecialEditionCD.class);
			//System.out.println(cd1.getDetails());
			//MyInterface cd=context.getBean("theCD", MyInterface.class);
			//System.out.println(cd.getDetails());
         Customer customer=context.getBean("theCustomer",Customer.class);
         System.out.println(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}