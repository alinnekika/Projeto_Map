
package br.com.av.agenda.enums;

/**
 *
 * @author Alinne
 */
public enum TipoLembrete {
    
    VAZIO(""),UNICO("Único"),DIARIO("Diário"),SEMANAL("Semanal"),INTERVALODIAS("Intervalo de Dias");
    private String dias;

    private TipoLembrete(String dias) {
        this.dias = dias;
    }

    public String getDias() {
        return dias;
    }

    @Override
    public String toString() {
        return dias;
    }  
}
