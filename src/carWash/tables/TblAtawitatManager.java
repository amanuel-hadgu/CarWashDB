

package carWash.tables;

import carWash.beans.TblAtawitat;
import carWash.beans.TblWetsaeitat;
import carWashMain.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TblAtawitatManager {
    
    private static Connection conn = ConnectionManager.getInstance().getConnection();    
    
    public static boolean insert(TblAtawitat atawitatBean) throws SQLException {

        String sql = "insert into tblatawitat (MhtsabMlue, MhtsabFrki, MhtsabMayTrah, MhtsabMotor,"
                + " MhtsabTuboScambieto, MhtsabTiestata, MhtsabSalvatyo, MhtsabKale, "
                + "ServiceGrosso, ServiceCompressor, ServiceKale, Olet, QutsriSelieda ) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            
            stmt.setDouble(1, atawitatBean.getMhtsabMlue());
            stmt.setDouble(2, atawitatBean.getMhtsabFrki());
            stmt.setDouble(3, atawitatBean.getMhtsabMayTrah());
            stmt.setDouble(4, atawitatBean.getMhtsabMotor());
            stmt.setDouble(5, atawitatBean.getMhtsabTuboSkamieto());
            stmt.setDouble(6, atawitatBean.getMhtsabTastieta());
            stmt.setDouble(7, atawitatBean.getMhtsabSalvatyo());
            stmt.setDouble(8, atawitatBean.getMhtsabKale());
            stmt.setDouble(9, atawitatBean.getServiceGrosso());
            stmt.setDouble(10, atawitatBean.getServiceKompreser());
            stmt.setDouble(11, atawitatBean.getServiceKale());
            stmt.setDate(12, atawitatBean.getOlet());
            stmt.setString(13, atawitatBean.getQutsriSelieda());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            String exStr = "ዕለታዊ ኣታዊታት ምምዝጋብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
        return true;
    }
    
}
