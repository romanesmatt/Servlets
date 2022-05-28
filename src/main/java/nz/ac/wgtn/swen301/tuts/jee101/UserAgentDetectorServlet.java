package nz.ac.wgtn.swen301.tuts.jee101;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Main servlet for this tutorial.
 */
public class UserAgentDetectorServlet extends HttpServlet{

    /**
     * @param req 
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userAgentHeader = req.getHeader("User-Agent");

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.println("<html>");
        out.println("<body>");
        out.println("Hello World!");
        out.println("</body>");
        out.println("</html>");
    }
}
