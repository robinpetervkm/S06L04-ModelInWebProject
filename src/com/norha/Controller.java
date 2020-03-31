package com.norha;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.norha.model.Person;

@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		List<Person> staff = new ArrayList<>();
		staff.add(new Person("Robin", 32));
		staff.add(new Person("Rinu", 26));
		staff.add(new Person("Rosely", 65));
		staff.add(new Person("Peter", 68));
		staff.add(new Person("Tinu", 30));
		
		request.setAttribute("staff", staff); 		
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}

}
 