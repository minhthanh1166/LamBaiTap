<%@ page import="product.sinhvien" %>
<%@ page import="product.sinhvienDAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>QUẢN LÝ SINH VIÊN</title>
</head>
<body>
<% ArrayList<sinhvien> lst = new sinhvienDAO().getAllProducts(); %>
<h1 style="text-align: center; "><%= "QUẢN LÝ SINH VIÊN" %>
</h1>
<br/>
<center>
    <form>
        <table width="30%" border="1" cellspacing="0" cellpadding="10">
            <thead>
                <tr>
                    <th>Mã sinh viên</th>
                    <th>Họ tên</th>
                    <th>Tên khoa</th>
                    <th>Giới tính</th>
                    <th>Chọn</th>
                </tr>
            </thead>
            <tbody>
            <%
                for (sinhvien sv : lst) {
                    String editURL = "update.jsp?id=" + sv.getMasv();
                    String deleteURL = "DeleteServlet?id=" + sv.getMasv();

            %>
                <tr>
                    <td><%= sv.getMasv() %></td>
                    <td><%= sv.getHoten() %></td>
                    <td><%= sv.getTenkhoa() %></td>
                    <td><%= sv.getGioitinh() %></td>
                    <td><a href="./edit.jsp?masv=<%=sv.getMasv()%>">Sửa</a>
                        <a href="delete?masv=<%=sv.getMasv()%>">Xoá</a></td>
                </tr>


            <%
                }
            %>
                <tr>
                    <td colspan="5" ><a href="add.jsp">Thêm</a></td>
                </tr>
            </tbody>
        </table>
    </form>
</center>
</body>
</html>