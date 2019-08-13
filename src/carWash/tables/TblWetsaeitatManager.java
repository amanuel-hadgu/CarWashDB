

package carWash.tables;

import carWash.beans.TblAtawitat;
import carWash.beans.TblWetsaeitat;
import carWashMain.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TblWetsaeitatManager {
    
    private static Connection conn = ConnectionManager.getInstance().getConnection();    
    
    public static boolean insert(TblWetsaeitat wetsaeitatBean) throws SQLException {

        String sql = "insert into tblwetsaeitat (GezaKray, HalkiElectric, HalkiMay, Zeyti, HalkiNedadi, KeretsGbri, "
                + "Stationary, AquhuElectric, QbaDashboard, LbsiSerahtenata, Meereyi, DemozSerahtena, "
                + "Sheb, Diter, Tornyo, Goz, Kanava, Gohaf, Mekoster, Kalamederiya, Photocopy, Drawliko, "
                + "Shgomano, Shankielotat, Kale, Olet ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            
            stmt.setDouble(1, wetsaeitatBean.getGezaKray());
            stmt.setDouble(2, wetsaeitatBean.getHalkiElectric());
            stmt.setDouble(3, wetsaeitatBean.getHalkiMay());
            stmt.setDouble(4, wetsaeitatBean.getZeyti());
            stmt.setDouble(5, wetsaeitatBean.getHalkiNedadi());
            stmt.setDouble(6, wetsaeitatBean.getQeretsGbri());
            stmt.setDouble(7, wetsaeitatBean.getStationary());
            stmt.setDouble(8, wetsaeitatBean.getAquhuElectric());
            stmt.setDouble(9, wetsaeitatBean.getQbaDashboard());
            stmt.setDouble(10, wetsaeitatBean.getLbsiSerahtenata());
            stmt.setDouble(11, wetsaeitatBean.getMeereyi());
            stmt.setDouble(12, wetsaeitatBean.getDemozSerahtena());
            stmt.setDouble(13, wetsaeitatBean.getSheb());
            stmt.setDouble(14, wetsaeitatBean.getDeterjent());
            stmt.setDouble(15, wetsaeitatBean.getTornyo());
            stmt.setDouble(16, wetsaeitatBean.getGoz());
            stmt.setDouble(17, wetsaeitatBean.getCanava());
            stmt.setDouble(18, wetsaeitatBean.getGohaf());
            stmt.setDouble(19, wetsaeitatBean.getMekoster());
            stmt.setDouble(20, wetsaeitatBean.getKalamederiya());
            stmt.setDouble(21, wetsaeitatBean.getPhotocopy());
            stmt.setDouble(22, wetsaeitatBean.getDrawliko());  
            stmt.setDouble(23, wetsaeitatBean.getShgomano());
            stmt.setDouble(24, wetsaeitatBean.getShankielotat());
            stmt.setDouble(25, wetsaeitatBean.getKale());
            stmt.setDate(26, wetsaeitatBean.getOlet());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            String exStr = "ዕለታዊ ወጻኢታት ምምዝጋብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
        return true;
    }
    
}
