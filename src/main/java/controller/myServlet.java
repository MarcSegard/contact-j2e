package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import myBeans.Contact;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  /**
	   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	   *      response)
	   */
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {

	    /* Création de la liste */
	    List < Contact > contacts = Arrays.asList(
	      new Contact("images/1.jpg", "Jane", "Doe", "jane.doe@email.com", "0600000000"),
	      new Contact("images/2.jpg", "John", "Doe", "john.doe@email.com", "0600000001"),
	      new Contact(null, "Sherlock", "Holmes", "sherlock.holmes@email.com", "0600000002"),
	      new Contact("images/4.jpg", "Betty", "Wayne", "betty.wayne@email.com", "0600000003"),
	      new Contact("images/3.jpg", "Mary", "Smith", "mary.smith@email.com", "0600000004"));

	    /* Ajoute un attribut contacts pour récupérer la liste des contacts en JSTL */
	    request.setAttribute("contacts", contacts);

	    /* Redirection vers la JSP contacts */
	    RequestDispatcher rd = getServletContext().getRequestDispatcher("/vue/home.jsp");
	    rd.forward(request, response);
	  }

}
