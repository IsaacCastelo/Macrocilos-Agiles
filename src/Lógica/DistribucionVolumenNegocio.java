package Lógica;

import dominio.CalcularEtapas;
import dominio.DistribucionVolumen;
import dominio.MediosFisicos;
import persistence.CalcularEtapasDAO;
import persistence.DistribucionVolumenDAO;
import persistence.MediosFisicosDAO;
import java.util.List;

public class DistribucionVolumenNegocio {

    private CalcularEtapasDAO calcularEtapasDAO;
    private DistribucionVolumenDAO distribucionVolumenDAO;
    private MediosFisicosDAO mediosFisicosDAO;

    public DistribucionVolumenNegocio() {
        calcularEtapasDAO = new CalcularEtapasDAO();
        distribucionVolumenDAO = new DistribucionVolumenDAO();
        mediosFisicosDAO = new MediosFisicosDAO();
    }

    public List<CalcularEtapas> obtenerInformacionEtapas() {
        return (List<CalcularEtapas>) calcularEtapasDAO.consultarTodo();
    }

    public List<DistribucionVolumen> obtenerInformacionDistribucionVolumen() {
        return (List<DistribucionVolumen>) distribucionVolumenDAO.consulTodo();
    }

    public List<MediosFisicos> obtenerInformacionMediosFisicos() {
        return (List<MediosFisicos>) mediosFisicosDAO.consulNombre("vacio");
    }
    
    



}
