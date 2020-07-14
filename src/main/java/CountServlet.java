import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
        private static int count = 1;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String reset = request.getParameter("reset");

        try {
            if(reset.equalsIgnoreCase("yes")){
                count = 1;
            }
        } catch(NullPointerException e){
            e.printStackTrace();
        }

        String content = "<h1>Count: " + count++ + "</h1>";
        content += "<button type='button'><a style='text-decoration : none' href='/count'>Add count</a></button>";
        content += "<br><br><button type='button'><a style='text-decoration : none' href='/count?reset=yes'>Reset Counter</a></button>";

        out.println(content);

    }
}
