import entities.UnifyEntityBuilder;
import helpers.EntityListFactory;
import interfaces.FillEntityInterface;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class CSVDocumentsServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        try {
            FillEntityInterface fillEntityInterface = new UnifyEntityBuilder();

            request.setAttribute("libraries", EntityListFactory.getLibraryList(fillEntityInterface));
            request.setAttribute("theaters", EntityListFactory.getTheaterList(fillEntityInterface));

            request.getRequestDispatcher("mainpage.jsp").forward(request, response);
        } catch (IllegalAccessException | InstantiationException ex) {
            throw new ServletException(ex);
        }
    }

}
