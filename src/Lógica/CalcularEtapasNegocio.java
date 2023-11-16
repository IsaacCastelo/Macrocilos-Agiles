
package Lógica;

import dominio.CalcularEtapas;
import javax.swing.JOptionPane;
import persistence.CalcularEtapasDAO;

/**
 *
 * @author Carlos A. Vale Encinas
 */
public class CalcularEtapasNegocio {
    
    public void onEnviarButtonClick(String semanas, String ins, String min, String max,
            String prom, String volumenEtapa, String tipoEtapa){
        
        try{
            int semanasInt= Integer.parseInt(semanas);
            int Ins= Integer.parseInt(ins);
            float minF= Float.parseFloat(min);
            float maxF= Float.parseFloat(max);
            float promF= Float.parseFloat(prom);
            float volumenF= Float.parseFloat(volumenEtapa);
                    
            CalcularEtapas calcularEtapa=new CalcularEtapas();
            calcularEtapa.setSemanas(semanasInt);
            calcularEtapa.setIns(Ins);
            calcularEtapa.setMin(minF);
            calcularEtapa.setMax(maxF);
            calcularEtapa.setProm(promF);
            calcularEtapa.setVolumenEtapa(volumenF);
            calcularEtapa.setTipoEtapa(tipoEtapa);
            
            CalcularEtapasDAO etapas=new CalcularEtapasDAO();
            boolean confirmacion= etapas.registrar(calcularEtapa); 
            
            if(confirmacion){
                JOptionPane.showMessageDialog(null, "Se han registrado los datos con éxito");
            }
            else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error al momento de registrar los datos.");
            }
        }
        catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(null, "Formato de entrada incorrecto.");
        }
    }
    
}
