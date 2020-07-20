import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.Integer.parseInt;

@WebServlet(name = "CreateCarServlet", urlPatterns = "/create-car")
public class CreateCarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/cars/create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String make = req.getParameter("make");
        String model = req.getParameter("model");
        int year = parseInt(req.getParameter("year"));

        DaoFactory.getCarsDao().callingAllCars().add(new Car(DaoFactory.getCarsDao().callingAllCars().size()+1, make, model, year));
        resp.sendRedirect("/cars");
    }
}
