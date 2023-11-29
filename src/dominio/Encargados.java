/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.sql.Date;

/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class Encargados {
       public int id,totalSemanas,MediosFisicos_id;
       public Date  inicioPlan,finPlan;
       public String deporte,rama,jefeRama,EntAuxPrepFis,metodologo;

    public Encargados(int id, int totalSemanas, int MediosFisicos_id, Date inicioPlan, Date finPlan, String deporte, String rama, String jefeRama, String EntAuxPrepFis, String metodologo) {
        this.id = id;
        this.totalSemanas = totalSemanas;
        this.MediosFisicos_id = MediosFisicos_id;
        this.inicioPlan = inicioPlan;
        this.finPlan = finPlan;
        this.deporte = deporte;
        this.rama = rama;
        this.jefeRama = jefeRama;
        this.EntAuxPrepFis = EntAuxPrepFis;
        this.metodologo = metodologo;
    }

    public Encargados() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalSemanas() {
        return totalSemanas;
    }

    public void setTotalSemanas(int totalSemanas) {
        this.totalSemanas = totalSemanas;
    }

    public int getMediosFisicos_id() {
        return MediosFisicos_id;
    }

    public void setMediosFisicos_id(int MediosFisicos_id) {
        this.MediosFisicos_id = MediosFisicos_id;
    }

    public Date getInicioPlan() {
        return inicioPlan;
    }

    public void setInicioPlan(Date inicioPlan) {
        this.inicioPlan = inicioPlan;
    }

    public Date getFinPlan() {
        return finPlan;
    }

    public void setFinPlan(Date finPlan) {
        this.finPlan = finPlan;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getJefeRama() {
        return jefeRama;
    }

    public void setJefeRama(String jefeRama) {
        this.jefeRama = jefeRama;
    }

    public String getEntAuxPrepFis() {
        return EntAuxPrepFis;
    }

    public void setEntAuxPrepFis(String EntAuxPrepFis) {
        this.EntAuxPrepFis = EntAuxPrepFis;
    }

    public String getMetodologo() {
        return metodologo;
    }

    public void setMetodologo(String metodologo) {
        this.metodologo = metodologo;
    }


}
