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

        String browser = "unknown";

//        Checking if the browser is Firefox
        if(userAgentHeader.contains("Firefox")){
            browser = "Mozilla Firefox";
        }
//        Checking if the browser is Chrome
        else if(userAgentHeader.contains("Chrome")){
            browser = "Google Chrome";
        }
        //For running on Mac
        //Checking if the browser is Safari
        else if(userAgentHeader.contains("Chrome")){
            browser = "Safari";
        }


//        Checking if the browser is Chrome

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        out.println("<html>");
        out.println("<body>");
        out.println("The user agent string is <strong>" + browser + "</strong");
        out.println("</body>");
        out.println("</html>");
    }
}
