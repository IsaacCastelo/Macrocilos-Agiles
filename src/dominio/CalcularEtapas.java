
package dominio;

/**
 *
 * @author Kevin
 */
public class CalcularEtapas {
    private int id,semanas, ins;
    private float min, max, prom, volumenEtapa;
    private String tipoEtapa;

    public CalcularEtapas() {
    }

    public CalcularEtapas(int id, int semanas, int ins, float min, float max, float prom, float volumenEtapa, String tipoEtapa) {
        this.id = id;
        this.semanas = semanas;
        this.ins = ins;
        this.min = min;
        this.max = max;
        this.prom = prom;
        this.volumenEtapa = volumenEtapa;
        this.tipoEtapa = tipoEtapa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public int getIns() {
        return ins;
    }

    public void setIns(int ins) {
        this.ins = ins;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getProm() {
        return prom;
    }

    public void setProm(float prom) {
        this.prom = prom;
    }

    public float getVolumenEtapa() {
        return volumenEtapa;
    }

    public void setVolumenEtapa(float volumenEtapa) {
        this.volumenEtapa = volumenEtapa;
    }

    public String getTipoEtapa() {
        return tipoEtapa;
    }

    public void setTipoEtapa(String tipoEtapa) {
        this.tipoEtapa = tipoEtapa;
    }
    
    
    
}
