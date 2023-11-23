package dominio;

import java.sql.Date;

public class DistribucionVolumen {

    public DistribucionVolumen() {
    }

    public DistribucionVolumen(int id, String etapa, int semana, int mesociclo, Date fechaInicio, Date fechaFin, float ciclicidad, float acentos, float esfuerzo, String mediosFisicos) {
        this.id = id;
        this.etapa = etapa;
        this.semana = semana;
        this.mesociclo = mesociclo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ciclicidad = ciclicidad;
        this.acentos = acentos;
        this.esfuerzo = esfuerzo;
        this.mediosFisicos = mediosFisicos;
    }
    
    public int id, semana, mesociclo;
    public String etapa;
    public Date fechaInicio, fechaFin;
    public float ciclicidad, acentos, esfuerzo;
    public String mediosFisicos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public int getSemanaa() {
        return semana;
    }

    public void setSemanaa(int semanaa) {
        this.semana = semanaa;
    }

    public int getMesociclo() {
        return mesociclo;
    }

    public void setMesociclo(int mesociclo) {
        this.mesociclo = mesociclo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getCiclicidad() {
        return ciclicidad;
    }

    public void setCiclicidad(float ciclicidad) {
        this.ciclicidad = ciclicidad;
    }

    public float getAcentos() {
        return acentos;
    }

    public void setAcentos(float acentos) {
        this.acentos = acentos;
    }

    public float getEsfuerzo() {
        return esfuerzo;
    }

    public void setEsfuerzo(float esfuerzo) {
        this.esfuerzo = esfuerzo;
    }

    public String getMediosFisicos() {
        return mediosFisicos;
    }

    public void setMediosFisicos(String mediosFisicos) {
        this.mediosFisicos = mediosFisicos;
    }

}
