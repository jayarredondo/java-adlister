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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Let's get all of the burgers that exist currently and list them here, 
        // with links to their individual product pages
        McBurgers burgersDao = DaoFactory.getMcBurgersDao();

        List<McBurger> allBurgers = new ArrayList<>();
        allBurgers.add(burgersDao.findById(1));
        allBurgers.add(burgersDao.findById(2));
        allBurgers.add(burgersDao.findById(3));

        req.setAttribute("allBurgers", allBurgers);
        req.getRequestDispatcher("../webapp/index.jsp").forward(req,resp);

    }
}