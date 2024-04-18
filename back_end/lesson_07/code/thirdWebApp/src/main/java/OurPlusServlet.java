import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/plus")
public class OurPlusServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      String i =  request.getParameter("i");
      String j =  request.getParameter("j");

      int sum = Integer.parseInt(i) + Integer.parseInt(j);

      response.setContentType("text/html;charset=UTF-8");
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
