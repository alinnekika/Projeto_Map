
package br.com.av.agenda.enums;

/**
 *
 * @author Alinne
 */
public enum Categoria {
    
    VAZIO(""), SIMPLES("Simples"),IMPORTANTE("Importante"),ESTUDO("Estudo"),TRABALHO("Trabalho"),VIAJEM("Viajem"), ANIVERSARIO("Aniversário");
    private String categoria;
    

    private Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return categoria;
    }
}
