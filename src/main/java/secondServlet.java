import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "secondServlet", value = "/secondServlet")
public class secondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String htmlresponse = "<html><body><h3>Ma deuxieme servelet</h3></body></html>";
        PrintWriter writer= response.getWriter();
        writer.write(htmlresponse);
    }

}
