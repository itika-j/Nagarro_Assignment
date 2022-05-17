package com.nagarro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EditProductServlet
 */
public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
        String quantity = request.getParameter("quantity");
        String size = request.getParameter("size");          
        String image = request.getParameter("image");
        Product prod = new Product(id, title, quantity, size, image);
        System.out.println(title+" "+size+" "+id);
        PrintWriter out = response.getWriter();
        try{
            ProductDao proDao = new ProductDao(ConnectionDao.getCon());
            proDao.editProductInfo(prod);
            response.sendRedirect("index.jsp");
//                out.print("wrong credential");
            
            
        }catch(Exception e){
            out.print("Some error occoured in Product update Info");
        }
        
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
