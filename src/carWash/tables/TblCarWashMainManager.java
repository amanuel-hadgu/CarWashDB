
package carWash.tables;

import carWashMain.ConnectionManager;
import java.sql.Connection;

public class TblCarWashMainManager {
    
    private static Connection conn = ConnectionManager.getInstance().getConnection();    
    
    
}
