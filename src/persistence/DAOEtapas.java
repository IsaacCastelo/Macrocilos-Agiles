/*
 * Carlos A. Valle Encinas 
ITSON ISW 228219
 */ 

 package persistence;
 import dominio.CalcularEtapas; 

 public interface DAOEtapas {

    public void registrar (CalcularEtapas etapa);
    public void editar (CalcularEtapas etapa);
    public void eliminar (CalcularEtapas etapa);
    public void consultar (CalcularEtapas etapa);
 }