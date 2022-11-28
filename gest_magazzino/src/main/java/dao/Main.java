package dao;

import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class Main {

	public static void main(String[] args) {

		// Server web java
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        Context ctx = tomcat.addContext("/raffaele", new File(".").getAbsolutePath());
        
        Articolosrv srv = new Articolosrv();
        
        Tomcat.addServlet(ctx, "raffaele", srv);

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
