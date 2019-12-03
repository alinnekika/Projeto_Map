
package br.com.av.agenda.utils;

import br.com.av.agenda.enums.TipoLembrete;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableRenderer extends DefaultTableCellRenderer {

    private Component componente;
    private Color[] colorsDefault;
    private Color[] colorsCustomBackground;
    private Color[] colorsCustomForeground;
    int i = 0;

    public TableRenderer(Color[] colorsDefault) {
        this.colorsDefault = colorsDefault;
    }

    public TableRenderer(Color[] colorsDefault, Color[] colorsCustomBackground, Color[] colorsCustomForeground) {
        this.colorsDefault = colorsDefault;
        this.colorsCustomBackground = colorsCustomBackground;
        this.colorsCustomForeground = colorsCustomForeground;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (this.colorsDefault != null && this.colorsDefault.length != 0) {
            if (row % 2 == 0) {
                componente.setBackground(this.colorsDefault[0]);
                componente.setForeground(this.colorsDefault[2]);
            } else {
                componente.setBackground(this.colorsDefault[1]);
                componente.setForeground(this.colorsDefault[3]);
            }
            if (isSelected) {
                componente.setBackground(this.colorsDefault[4]);
            }

        }

        if (this.colorsCustomBackground != null && this.colorsCustomBackground.length != 0
                && this.colorsCustomForeground != null && this.colorsCustomForeground.length != 0) {
            if (value instanceof TipoLembrete) {
                if (((TipoLembrete) value).equals(TipoLembrete.UNICO)) {
                    componente.setBackground(this.colorsCustomBackground[0]);
                    componente.setForeground(this.colorsCustomForeground[0]);
                }
                if (((TipoLembrete) value).equals(TipoLembrete.DIARIO)) {
                    componente.setBackground(this.colorsCustomBackground[1]);
                    componente.setForeground(this.colorsCustomForeground[1]);
                }
                if (((TipoLembrete) value).equals(TipoLembrete.SEMANAL)) {
                    componente.setBackground(this.colorsCustomBackground[2]);
                    componente.setForeground(this.colorsCustomForeground[2]);
                }
                if (((TipoLembrete) value).equals(TipoLembrete.INTERVALODIAS)) {
                    componente.setBackground(this.colorsCustomBackground[3]);
                    componente.setForeground(this.colorsCustomForeground[3]);
                }
            }
        }
        return componente;
    }

    @Override
    public Component[] getComponents() {
        return super.getComponents(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
