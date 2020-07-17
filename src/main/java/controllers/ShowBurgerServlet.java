package controllers;

import models.DaoFactory;
import models.McBurger;
import models.McBurgers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowBurgerServlet", urlPatterns = "/burgers/show")
public class ShowBurgerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // check for the burger ID attribute in the URL, need to parseLong to parse the string to a long
        long burgerId = Long.parseLong(req.getParameter("id"));
        // Create a connection to the DAOFactory
        McBurgers burgerDao = DaoFactory.getMcBurgersDao();
        // Get the burger by its ID, using findByID
        McBurger thisBurger = burgerDao.findById(burgerId);
        // Send that burger back to the JSP
        req.setAttribute("burger", thisBurger);

        req.getRequestDispatcher("/burgers/show-burgers.jsp").forward(req,resp);

    }
}
