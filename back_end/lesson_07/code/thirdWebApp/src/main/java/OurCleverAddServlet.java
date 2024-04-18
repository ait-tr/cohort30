import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/plus/clever")
public class OurCleverAddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        // получение sum
        HttpSession session = request.getSession();
        Integer sum =(Integer) session.getAttribute("sum");

        if(sum == null) sum = 0;

        // получение number  из каждого запроса
        String number = request.getParameter("number");
        sum += Integer.parseInt(number);

        // запись в сессию
        session.setAttribute("sum", sum);

        PrintWriter writer = response.getWriter();

        try {
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Our Plus Service</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>sum = " +sum + "</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }finally {
            writer.close();
        }
    }
}
