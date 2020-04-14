package it.dstech.jpa.controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.jpa.model.Persona;

@WebServlet(urlPatterns = "/")
public class PlayersController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
		EntityManager em = emf.createEntityManager();
		
//		PreparedStatement prep = connection.preparedStatemnet("select * from persona where id= ?");
//		prep.setLong(1, 1L);
//		ResultSet executeQuery = prep.executeQuery();
//		while(executeQuery.next()) {
//			e
//		}
//		Persona find = em.find(Persona.class, 1L);
		List<Persona> lista = em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
		
		req.setAttribute("lista", lista);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
		EntityManager em = emf.createEntityManager();
		Persona persona = new Persona();
		
		persona.setCognome(req.getParameter("cognome"));
		persona.setNome(req.getParameter("nome"));
		
		
		em.getTransaction().begin();
		em.persist(persona);
		em.getTransaction().commit();
		
		
        doGet(req, resp);

	}

}
