package spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver 
{	

    public static void main(String[] args)
    {
    	AbstractApplicationContext ctx;
    	
        // load application context files
        ctx = new ClassPathXmlApplicationContext(new String []{"spring/appConfig.xml"});
    }
}
