package product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    @WebServlet(urlPatterns = {"/delete"})
    public class delete extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String masv = request.getParameter("masv");
            sinhvienDAO svdao = new sinhvienDAO();
            try {
                if (svdao.delete(masv)) {
                    response.sendRedirect("index.jsp");
                } else {
                    response.sendRedirect("error.jsp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

