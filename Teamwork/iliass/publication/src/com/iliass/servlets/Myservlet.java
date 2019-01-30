package com.iliass.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iliass.models.MyClass;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/myservlet")
public class Myservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MyClass myClass = new MyClass();

        if (request.getParameter("button1") != null) {
            myClass.method1();
        } else if (request.getParameter("button2") != null) {
            myClass.method2();
        } else if (request.getParameter("button3") != null) {
            myClass.method3();
        } else {
            myClass.setAttribut(0);
        }
        
        HttpSession session = request.getSession() ;
 		session.setAttribute("myClass", myClass);
 		
        request.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(request, response);
    }

}
