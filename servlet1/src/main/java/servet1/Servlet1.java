package servet1;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("<head>\r\n"
        		+"<body style=background-color:powderblue;>"
        		+ "<center>\r\n"
        		+ "		<table style=\"width:30%\">\r\n"
        		+ "			<tr>\r\n"
        		+ "			<th><h2><a href=\"HTML.html\">HOME<a/></h2></th>\r\n"
        		+ "			<th><h2><a href=\"chi sono.html\">CHI SONO<a/></h2></th>\r\n"
        		+ "			<th><h2><a href=\"servizi.html\">SERVIZI</h2></th>\r\n"
        		+ "			<th><h2><a href=\"contatti.html\">CONTATTI</h2></th>\r\n"
        		+ "			</tr>\r\n"
        		+ "		</table>\r\n"
        		+ "	</center>\r\n"
        		+ "</head>\r\n"
        		+ "	<body>\r\n"
        		+ "<br><br><br>\r\n"
        		+ "<center><h1> Ciao Sono Raffaele Tammaro </h1></center>\r\n"
        		+ "<center>\r\n"
        		+ "				<table>\r\n"
        		+ "					<tr>\r\n"
        		+ "						<br><br><br><br>\r\n"
        		+ "						<img src=C:\\Users\\aula1pos7\\Desktop\\Raf\\Mia pagina HTML\\omino.jpg width=650 height=600>\r\n"
        		+ "					</tr>\r\n"
        		+ "				</table>\r\n"
        		+ "			</center>\r\n"
        		+ "	</body></h1>");		 
        w.flush();
        w.close();
    }
}
