package product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


    @WebServlet(urlPatterns = {"/edit"})
    public class edit extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String masv = request.getParameter("masv");
            String hoten = request.getParameter("hoten");
            String tenkhoa = request.getParameter("tenkhoa");
            String gioitinh = request.getParameter("gioitinh");

            sinhvien sv = new sinhvien(masv, hoten, tenkhoa, gioitinh);
            sinhvienDAO svdao = new sinhvienDAO();
            try {
                if (svdao.updateOld(sv)) {
                    response.sendRedirect("index.jsp");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }


