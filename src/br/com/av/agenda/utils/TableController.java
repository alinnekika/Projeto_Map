
package br.com.av.agenda.utils;

import br.com.av.agenda.model.Lembrete;
import br.com.av.agenda.utils.TableModel;
import br.com.av.agenda.utils.TableRenderer;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

/**
 *
 * @author Alinne
 */
public class TableController {
    public static Lembrete lembrete;

    public static void criarTabela(JTable tabela, String[] colunas, int linhas) {
        ArrayList lista = new ArrayList();
        Object[] objeto = new Object[colunas.length];
        for (int i = 0; i <= linhas; i++) {
            for (int j = 0; j < colunas.length; j++) {
                objeto[j] = "";
            }
            lista.add(objeto);
        }
        tabela.setModel(new TableModel(lista, colunas));
    }
    public static void ordenarTabela(JTable tabela, Integer[] valores) {
        for (int coluna = 0; coluna <= valores.length - 1; coluna++) {
            if (valores[coluna] == 0) {
                tabela.getColumnModel().getColumn(coluna).setMaxWidth(valores[coluna]);
                tabela.getColumnModel().getColumn(coluna).setMinWidth(valores[coluna]);
                tabela.getTableHeader().getColumnModel().getColumn(coluna).setMaxWidth(valores[coluna]);
                tabela.getTableHeader().getColumnModel().getColumn(coluna).setMinWidth(valores[coluna]);
            } else {
                tabela.getColumnModel().getColumn(coluna).setPreferredWidth(valores[coluna]);
                tabela.getColumnModel().getColumn(coluna).setResizable(false);
            }
        }
//            ------oculta as colunas que eu não quero mostras(no caso, o id)--------
//        tblProdutos.getColumnModel().getColumn(5).setMaxWidth(0);
//        tblProdutos.getColumnModel().getColumn(5).setMinWidth(0);
//        tabela.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
//        tabela.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
//        tabela.getTableHeader().setReorderingAllowed(false);

        configurarTabela(tabela, false, tabela.AUTO_RESIZE_OFF, ListSelectionModel.SINGLE_SELECTION, 22, null, false, 0);
    }

    public static void configurarTabela(JTable tabela, boolean reorderingAllowed, int mode,
            int selectionMode, int rowHeight, Border border, boolean showGrid, int rowMargin) {

        tabela.getTableHeader().setReorderingAllowed(reorderingAllowed);
        tabela.setAutoResizeMode(mode);
        tabela.setSelectionMode(selectionMode);
        tabela.setRowHeight(rowHeight);
        tabela.setBorder(border);
        tabela.setShowGrid(showGrid);
        tabela.setRowMargin(rowMargin);
    }

    public static void colorirTabela(JTable tabela, Color[] cores) {
        tabela.setDefaultRenderer(Object.class, new TableRenderer(cores));
    }
    public static void colorirTabela2(JTable tabela, Color[] coresDefault, Color[] coresBackground, Color[] coresForeground) {
        tabela.setDefaultRenderer(Object.class, new TableRenderer(coresDefault, coresBackground, coresForeground));
    }

    public static void limparTabela(JTable tabela) {
        for (int i = 0; i < tabela.getModel().getRowCount(); i++) {
            Object[] objeto = new Object[tabela.getModel().getColumnCount()];
            for (int j = 0; j < tabela.getModel().getColumnCount(); j++) {
                objeto[j] = "";
            }
            tabela.getModel().setValueAt(objeto, i, 0);
        }
    }
}
