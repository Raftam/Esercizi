package dao;

import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Articolo;
import dao.ArticoloDao;

@WebServlet("/ArticoloSrv")
public class Articolosrv extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public Articolosrv() {
		super();
	}
	
         protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    
        	 ArticoloDao aDao = new ArticoloDao();
        	 String descrizione= request.getParameter("descrizione");
        	 String quant= request.getParameter("quantita");
        	 int quantita= Integer.parseInt(quant);
        	 
        	 Articolo a = new Articolo();
        	 a.setDescrizione(descrizione);
        	 a.setQuantita(quantita);
        	 
        	try {
				aDao.insert(a);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
        	 response.getWriter().append("Served at: ").append(request.getContextPath());
         }
         
         protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        	 
        	 doGet(request, response);
        	 
         }
         
 }

