import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * @author Xavi Torrens
 */
public class ReadCookies extends HttpServlet {
    public void do

        }

        request.setAttribute("cookiesArray",cookienames);

        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/cookiesView.jsp");
        rd.forward(request,response);

    }
}
