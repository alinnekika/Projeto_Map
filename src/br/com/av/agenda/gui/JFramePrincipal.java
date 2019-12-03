/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.av.agenda.gui;

import br.com.av.agenda.facade.Facade;
import br.com.av.agenda.model.Lembrete;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Alinne
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private Facade facade;
    private List<Lembrete> lembretesPendentes;
    private List<Lembrete> lembretesPerdidos;
    private List<Lembrete> lembretes;
    private boolean flag = false;

    public JFramePrincipal() {
        initComponents();
        facade = new Facade();
        lembretesPendentes = new ArrayList<Lembrete>();
        lembretesPerdidos = new ArrayList<Lembrete>();
        lembretes = new ArrayList<Lembrete>();

        try {
//            this.lembretes = facade.listarLembretes();
           // File file = new File(getClass().getResource("/br/com/av/agenda/imagens/agenda.jpg").toURI());
           // Image imagem = ImageIO.read(file);
           // lblFundo.setIcon(new ImageIcon(imagem.getScaledInstance(lblFundo.getWidth(), lblFundo.getHeight(), Image.SCALE_DEFAULT)));
            organizarLembretes(facade.listarLembretes());
            verificarLembretes();

        } catch (URISyntaxException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        btnLembretes = new javax.swing.JButton();
        btnContatos = new javax.swing.JButton();
        lblTituloAgenda = new javax.swing.JLabel();
        pnlNotificacoes = new javax.swing.JPanel();
        lblLembrete = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        setResizable(false);

        pnlFundo.setLayout(null);

        btnLembretes.setFont(new java.awt.Font("Calibri", 2, 20)); // NOI18N
        btnLembretes.setText("Lembretes");
        btnLembretes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLembretes.setOpaque(false);
        btnLembretes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLembretesActionPerformed(evt);
            }
        });
        pnlFundo.add(btnLembretes);
        btnLembretes.setBounds(50, 370, 140, 30);

        btnContatos.setFont(new java.awt.Font("Calibri", 2, 20)); // NOI18N
        btnContatos.setText("Contatos");
        btnContatos.setOpaque(false);
        btnContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContatosActionPerformed(evt);
            }
        });
        pnlFundo.add(btnContatos);
        btnContatos.setBounds(50, 410, 140, 30);

        lblTituloAgenda.setFont(new java.awt.Font("Kunstler Script", 0, 78)); // NOI18N
        lblTituloAgenda.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloAgenda.setText("Agenda");
        pnlFundo.add(lblTituloAgenda);
        lblTituloAgenda.setBounds(30, 250, 210, 100);

        pnlNotificacoes.setOpaque(false);

        lblLembrete.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        lblLembrete.setText("Lembrete:");

        lblFechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechar.setText("X");
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlNotificacoesLayout = new javax.swing.GroupLayout(pnlNotificacoes);
        pnlNotificacoes.setLayout(pnlNotificacoesLayout);
        pnlNotificacoesLayout.setHorizontalGroup(
            pnlNotificacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotificacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLembrete, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotificacoesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlNotificacoesLayout.setVerticalGroup(
            pnlNotificacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotificacoesLayout.createSequentialGroup()
                .addComponent(lblFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLembrete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlFundo.add(pnlNotificacoes);
        pnlNotificacoes.setBounds(560, 420, 240, 60);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/av/agenda/imagens/agenda.jpg"))); // NOI18N
        pnlFundo.add(lblFundo);
        lblFundo.setBounds(0, 0, 802, 484);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLembretesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLembretesActionPerformed
        JDGerenciadorLembretes gerenciadorLembretes = new JDGerenciadorLembretes(this, true);
        gerenciadorLembretes.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    organizarLembretes(facade.listarLembretes());
//                    lembretes = facade.listarLembretes();
                } catch (Exception ex) {
                    Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        gerenciadorLembretes.setVisible(true);

    }//GEN-LAST:event_btnLembretesActionPerformed

    private void btnContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContatosActionPerformed
        JDGerenciadorContato gerenciadorContato = new JDGerenciadorContato(this, true);
        gerenciadorContato.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                } catch (Exception ex) {
                    Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        gerenciadorContato.setVisible(true);
    }//GEN-LAST:event_btnContatosActionPerformed

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        pnlNotificacoes.setVisible(false);
    }//GEN-LAST:event_lblFecharMouseClicked

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContatos;
    private javax.swing.JButton btnLembretes;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLembrete;
    private javax.swing.JLabel lblTituloAgenda;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlNotificacoes;
    // End of variables declaration//GEN-END:variables

    private void verificarLembretes() throws Exception {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        try {
                            for (Lembrete lembrete : lembretes) {
                                for (Calendar data : lembrete.getCalendar()) {
                                    Calendar dataAtual = Calendar.getInstance();
                                    if (data.get(data.YEAR) == dataAtual.get(dataAtual.YEAR)
                                            && data.get(data.MONTH) == dataAtual.get(dataAtual.MONTH)
                                            && data.get(data.DAY_OF_MONTH) == dataAtual.get(dataAtual.DAY_OF_MONTH)
                                            && data.get(data.HOUR_OF_DAY) == dataAtual.get(dataAtual.HOUR_OF_DAY)
                                            && data.get(data.MINUTE) == dataAtual.get(dataAtual.MINUTE)) {
                                        if (lembrete.getStatus().equals("INICIADO")) {
                                            JDLembretes visualizer = new JDLembretes(new JFrame(), true, lembrete, data);
                                            visualizer.addWindowListener(new WindowAdapter() {
                                                @Override
                                                public void windowClosed(WindowEvent e) {
                                                    try {
                                                        organizarLembretes(facade.listarLembretes());
                                                    } catch (Exception ex) {
                                                        Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                                    }
                                                }
                                            });
                                            visualizer.setVisible(true);
                                        }
                                    }
                                }
                            }
                        } catch (Exception ex) {
                            Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JFramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }

    private void organizarLembretes(List<Lembrete> lembretes) {
        System.out.println("\n****************************");
        if (!lembretes.isEmpty()) {
            this.lembretes.clear();
            Calendar dataAtual = Calendar.getInstance();
            for (Lembrete lembrete : lembretes) {
                for (Calendar data : lembrete.getCalendar()) {
                    if (data.get(data.YEAR) == dataAtual.get(dataAtual.YEAR)
                            && data.get(data.MONTH) == dataAtual.get(dataAtual.MONTH)
                            && data.get(data.DAY_OF_MONTH) == dataAtual.get(dataAtual.DAY_OF_MONTH)) {
                        if (!this.lembretes.contains(lembrete)) {
                            this.lembretes.add(lembrete);
                            lblLembrete.setText("Lembretes: " + this.lembretes.size());
                        }
                    }
                }
            }
        }
    }
}
