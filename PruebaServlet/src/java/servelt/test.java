
package servelt;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class test extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException { 
        PrintWriter esc=resp.getWriter();
        esc.println("<html>");
        esc.println("<head>");
        esc.println("</head>");
        esc.println("<body>");
        esc.println("Funciona");
        esc.println("</body>");
        esc.println("</html>");
    }
    
    
}
