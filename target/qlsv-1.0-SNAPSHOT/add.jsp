<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>THÊM SINH VIÊN</title>
</head>
<body>
<h1 style="text-align: center; "><%= "THÊM SINH VIÊN" %>
</h1>
<br/>
<center>
    <form action="add" method="post">
        <table width="20%" border="1" cellspacing="0" cellpadding="10">
            <tr>
                <td>Mã sinh viên</td>
                <td><input type="text" name="masv"  placeholder="Nhập mã sinh viên"/></td>
            </tr>
            <tr>
                <td>Họ tên</td>
                <td><input type="text" name="hoten"  placeholder="Nhập họ tên"/></td>
            </tr>
            <tr>
                <td>Tên khoa</td>
                <td><input type="text" name="tenkhoa"  placeholder="Nhập tên khoa"/></td>
            </tr>
            <tr>
                <td>Giới tính</td>
                <td><input type="text" name="gioitinh" placeholder="Nhập giới tính" /></td>
            </tr>
            <tr >
                <td colspan="2"><button type="submit" style="margin-right: 100px">Thêm</button></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>