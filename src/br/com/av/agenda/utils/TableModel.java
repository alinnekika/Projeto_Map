package br.com.av.agenda.utils;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public TableModel(ArrayList linhas, String[] colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public TableModel(String[] colunas) {
        this.colunas = colunas;
    }

    public TableModel(ArrayList linhas) {
        this.linhas = linhas;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados) {
        this.linhas = dados;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] nomes) {
        this.colunas = nomes;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {
        Object[] linha = (Object[]) this.linhas.get(numLinha);
        return linha[numColuna];
    }

    @Override
    public void setValueAt(Object elemento, int linhaIndice, int columnIndex) {
        if (linhaIndice >= this.linhas.size()) {
            this.linhas.add(elemento);
        } else {
            this.linhas.set(linhaIndice, elemento);
        }
    }
}
