
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
    
    
    
}
