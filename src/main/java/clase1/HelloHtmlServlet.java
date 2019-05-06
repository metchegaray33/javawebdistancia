package clase1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloHtmlServlet extends HttpServlet {

    private static final long serialVersionUID = -6154475799000019575L;

    private static final String greeting = "<html>\n" +
            "<head>\n" +
            "<title>Hello</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<p>Hello Work</p>\n" +
            "\n" +
            "</body>\n" +
            "</html>\n";

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException,
            IOException {

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(greeting);
    }

}
