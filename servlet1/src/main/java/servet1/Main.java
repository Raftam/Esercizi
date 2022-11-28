package servet1;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import it.gaetano.PrimaServlet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Server web java
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        Context ctx = tomcat.addContext("/raffaele", new File(".").getAbsolutePath());
        
        Servlet1 primaServlet = new Servlet1();
        
        Tomcat.addServlet(ctx, "raffaele", primaServlet);

        ctx.addServletMapping("/*", "raffaele");

        try {
			tomcat.start();
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        tomcat.getServer().await();
		
		
	}

}
