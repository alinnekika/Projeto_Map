/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.av.agenda.gui;

import br.com.av.agenda.enums.TipoLembrete;
import br.com.av.agenda.facade.Facade;
import br.com.av.agenda.model.Lembrete;
import br.com.av.agenda.utils.StringUtils;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author walterlly
 */
public class JDLembretes extends javax.swing.JDialog {

    private Facade facade;
    private Lembrete lembrete;
    private Calendar data;

    public JDLembretes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JDLembretes(java.awt.Frame parent, boolean modal, Lembrete lembrete, Calendar data) {
        super(parent, modal);
        initComponents();
        this.facade = new Facade();
        this.lembrete = lembrete;
        this.data = data;

        try {

            lblTitulo.setText(lembrete.getTitulo());
            lblData.setText("Data:  " + StringUtils.formatarDataCalendar(data) + "  Hora:  " + StringUtils.getHoraCalendar(data));
            txtaDescricao.setText(lembrete.getDescricao());
            lblLembrete.setText("Lembrete: " + lembrete.getTipo().getDias());

        } catch (ParseException ex) {
            Logger.getLogger(JDLembretes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescricao = new javax.swing.JTextArea();
        lblData = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        lblLembrete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtaDescricao.setColumns(20);
        txtaDescricao.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtaDescricao.setRows(5);
        txtaDescricao.setOpaque(false);
        jScrollPane1.setViewportView(txtaDescricao);

        lblData.setText("Data:");

        btnOk.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnParar.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        btnParar.setText("PARAR");

        lblLembrete.setText("Lembrete: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLembrete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btnOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnParar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData)
                .addGap(18, 18, 18)
                .addComponent(lblLembrete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnParar)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try {
            verificarLembrete();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDLembretes dialog = new JDLembretes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnParar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblLembrete;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtaDescricao;
    // End of variables declaration//GEN-END:variables

    private void verificarLembrete() throws Exception {
        if (this.lembrete.getTipo().equals(TipoLembrete.UNICO)) {
            Lembrete lembreteAux = this.facade.buscarLembrete(this.lembrete.getId());
            this.facade.excluirLembrete(lembreteAux);
        }
        if (this.lembrete.getTipo().equals(TipoLembrete.DIARIO)) {
            this.lembrete = this.facade.buscarLembrete(this.lembrete.getId());
            this.lembrete.getCalendar().get(0).add(this.lembrete.getCalendar().get(0).DAY_OF_MONTH, 1);
            this.facade.alterarLembrete(this.lembrete);
        }
        if (this.lembrete.getTipo().equals(TipoLembrete.SEMANAL)) {
            List<Calendar> lista = this.lembrete.getCalendar();
            for (Calendar dataAtual : lista) {
                if (dataAtual.before(data)) {
                    dataAtual.add(dataAtual.DAY_OF_MONTH, 7);
                    System.out.println("1data passada " + StringUtils.formatarDataCalendar(data));
                }
            }
            for (Calendar dataAtual : lista) {
                if (dataAtual.get(dataAtual.YEAR) == data.get(data.YEAR)
                        && dataAtual.get(dataAtual.MONTH) == data.get(data.MONTH)
                        && dataAtual.get(dataAtual.DAY_OF_MONTH) == data.get(data.DAY_OF_MONTH)) {
//                    Calendar calendar = dataAtual.
                    dataAtual.add(dataAtual.DAY_OF_MONTH, 7);
                    System.out.println("2data passada " + StringUtils.formatarDataCalendar(data));
                }
            }
            this.lembrete.setCalendar(lista);
            this.facade.alterarLembrete(this.lembrete);

        }
        if (this.lembrete.getTipo().equals(TipoLembrete.INTERVALODIAS)) {
            this.lembrete = this.facade.buscarLembrete(this.lembrete.getId());
            this.lembrete.getCalendar().get(0).add(this.lembrete.getCalendar().get(0).DAY_OF_MONTH, this.lembrete.getIntervaloDias());
            this.facade.alterarLembrete(this.lembrete);
        }
    }
}
