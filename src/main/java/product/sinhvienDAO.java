package product;

import db.connect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class sinhvienDAO {
    private connect conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    private ConnectDB connectdb;

    public sinhvienDAO() {
        connectdb = new ConnectDB();
    }
    public ArrayList<sinhvien> getAllProducts() {
        ArrayList<sinhvien> list = new ArrayList();
        String sql = "SELECT * FROM sinhvien";
        try {
            rs = connectdb.getStatement().executeQuery(sql);
            while (rs.next()) {
                String masv = rs.getString("masv");
                String hoten = rs.getString("hoten");
                String tenkhoa = rs.getString("tenkhoa");
                String gioitinh = rs.getString("gioitinh");
                sinhvien sv = new sinhvien(masv, hoten, tenkhoa, gioitinh);
                list.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Please check getAllProduct index.jsp in sinhvienDAO");
        }
      
        return list;
    }

    public boolean insertNew(sinhvien sv) throws SQLException {
        String sql = "INSERT INTO `sinhvien` (`masv`, `hoten`, `tenkhoa`, `gioitinh`) VALUES (?, ?, ?, ?);";
        stmt = connectdb.openConnect().prepareStatement(sql);
        stmt.setString(1, sv.getMasv());
        stmt.setString(2, sv.getHoten());
        stmt.setString(3, sv.getTenkhoa());
        stmt.setString(4, sv.getGioitinh());

        return stmt.executeUpdate() > 0;
    }
    public boolean updateOld(sinhvien sv) throws SQLException {
        String sql = "UPDATE `sinhvien` SET `hoten`=?, `tenkhoa`=? , `gioitinh`=? WHERE `masv`=? ";
        stmt = connectdb.openConnect().prepareStatement(sql);

        stmt.setString(1, sv.getHoten());
        stmt.setString(2, sv.getTenkhoa());
        stmt.setString(3, sv.getGioitinh());
        stmt.setString(4, sv.getMasv());

        return stmt.executeUpdate() > 0;
    }
    public boolean delete(String masv) throws SQLException {
        String sql = "DELETE FROM `sinhvien` WHERE `masv`=?";
        stmt = connectdb.openConnect().prepareStatement(sql);
        stmt.setString(1, masv);

        return stmt.executeUpdate() > 0;
    }

    public sinhvien getSinhVienID(String masv) throws SQLException {
        String sql = "SELECT * FROM sinhvien WHERE masv=?";
        stmt = connectdb.openConnect().prepareStatement(sql);
        stmt.setString(1, masv);
        rs = stmt.executeQuery();

        sinhvien sv = null;
        while (rs.next()) {
            masv = rs.getString("masv");
            String hoten = rs.getString("hoten");
            String tenkhoa = rs.getString("tenkhoa");
            String gioitinh = rs.getString("gioitinh");
            sv = new sinhvien(masv, hoten, tenkhoa, gioitinh);
        }

        return sv;
    }
 }


