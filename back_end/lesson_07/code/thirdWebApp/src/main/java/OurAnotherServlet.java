import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class OurAnotherServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

        // получение параметра по ключу "name"  из запроса
      String servletName =  request.getParameter("name");


        // пмещение параметра "name" в сессию
        HttpSession session = request.getSession(true);
        session.setAttribute("name",servletName);

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Our another servlet name</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>Our servlet's name is " + servletName + "</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }finally {
            writer.close();
        }

    }
}
