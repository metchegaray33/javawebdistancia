package clase1;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * desdemasternewamastergithubdeskgop
 * @author Usuario
 *
 */
public class EmbeddingJettyWithServlet {

    public static void main(String[] args) throws Exception {

    	//las siguientes 4 lineas leventan un server.
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.setContextPath("/hello");//digo donde voy a estar escuchando siempre en /hello aca

        server.setHandler(context);

         //le decimos al jetty cuales son los servlet que hay que instalar y le decimos la expresion regular que define 
        //que request van a ser atendidos por este servlet.Puedo tener distintos path y ser atendidos.
       // context.addServlet(new ServletHolder(new HelloServlet()), "/simple");
        context.addServlet(new ServletHolder(new HelloServlet()), "/*"); //si le pongo el asterisco invoco con http://localhost:8080/hello/
       // context.addServlet(new ServletHolder(new HelloHtmlServlet()), "/html");

        server.start();

    }

}
