
package carWash.beans;

import java.sql.Date;

public class TblCarWashMain {
    
    private String QutsriSelieda;
    private String GugleTeshkerkarit;
    private String OaynetMekina;
    private String BzhiZmetseto;
    private Date Olet;

    public String getBzhiZmetseto() {
        return BzhiZmetseto;
    }

    public void setBzhiZmetseto(String BzhiZmetseto) {
        this.BzhiZmetseto = BzhiZmetseto;
    }

    public String getGugleTeshkerkarit() {
        return GugleTeshkerkarit;
    }

    public void setGugleTeshkerkarit(String GugleTeshkerkarit) {
        this.GugleTeshkerkarit = GugleTeshkerkarit;
    }

    public String getOaynetMekina() {
        return OaynetMekina;
    }

    public void setOaynetMekina(String OaynetMekina) {
        this.OaynetMekina = OaynetMekina;
    }

    public Date getOlet() {
        return Olet;
    }

    public void setOlet(Date Olet) {
        this.Olet = Olet;
    }

    public String getQutsriSelieda() {
        return QutsriSelieda;
    }

    public void setQutsriSelieda(String QutsriSelieda) {
        this.QutsriSelieda = QutsriSelieda;
    }
        
}
