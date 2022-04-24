package product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/add"})
    public class add extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String masv = request.getParameter("masv");
            String hoten = request.getParameter("hoten");
            String tenkhoa = request.getParameter("tenkhoa");
            String gioitinh = request.getParameter("gioitinh");

            sinhvien sv = new sinhvien(masv, hoten, tenkhoa, gioitinh);
            sinhvienDAO spdao = new sinhvienDAO();
            try {
                if (spdao.insertNew(sv)) {
                    response.sendRedirect("index.jsp");
                } else {
                   // response.sendRedirect("error.jsp");
                    System.out.println("error");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


