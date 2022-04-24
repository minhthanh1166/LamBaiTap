<%@ page import="product.sinhvien" %>
<%@ page import="product.sinhvienDAO" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>SỬA SINH VIÊN</title>
</head>
<body>
<%
    String masv = request.getParameter("masv");
    sinhvien sv = new sinhvienDAO().getSinhVienID(masv);
%>
<h1 style="text-align: center; "><%= "SỬA SINH VIÊN" %>
</h1>
<br/>
<center>
    <form action="edit" method="post">
        <table width="20%" border="1" cellspacing="0" cellpadding="10">
            <tr>
                <td>Mã sinh viên</td>
                <td><input type="text" name="masv"  value="<%=sv.getMasv() %>" /></td>
            </tr>
            <tr>
                <td>Họ tên</td>
                <td><input type="text" name="hoten"  placeholder="Nhập họ tên" value="<%=sv.getHoten()%>"/></td>
            </tr>
            <tr>
                <td>Tên khoa</td>
                <td><input type="text" name="tenkhoa"  placeholder="Nhập tên khoa" value="<%=sv.getTenkhoa()%>"/></td>
            </tr>
            <tr>
                <td>Giới tính</td>
                <td><input type="text" name="gioitinh"  placeholder="Nhập giới tính" value="<%=sv.getGioitinh()%>"/></td>
            </tr>
            <tr >
                <td colspan="2"><button type="submit" style="margin-right: 100px">Sửa</button></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>