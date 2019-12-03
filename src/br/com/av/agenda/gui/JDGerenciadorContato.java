/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.av.agenda.gui;

import br.com.av.agenda.facade.Facade;
import br.com.av.agenda.model.Contato;
import br.com.av.agenda.utils.TableController;
import br.com.av.agenda.utils.Validation;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author walterlly
 */
public class JDGerenciadorContato extends javax.swing.JDialog {

    private Facade facade;
    private Contato contato;
    private String flag;

    public JDGerenciadorContato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.facade = new Facade();
//        this.contato = new Contato();
        CardLayout card = (CardLayout) pnlCentral.getLayout();
        card.show(pnlCentral, "cardManager");
        try {
            TableController.criarTabela(tblContatos, new String[]{"Indice", "Nome", "Numero", "E-mail"}, 14);
            carregarTabelaContatos(facade.listarContatos());
            TableController.ordenarTabela(tblContatos, new Integer[]{50, 250, 100, 150});
            TableController.colorirTabela(tblContatos, new Color[]{Color.DARK_GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK, Color.GRAY});
        } catch (Exception ex) {
            Logger.getLogger(JDGerenciadorContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentral = new javax.swing.JPanel();
        pnlGerenciarContatos = new javax.swing.JPanel();
        pnlOpcoes = new javax.swing.JPanel();
        btnCriar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContatos = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        pnlAdicionarContato = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        ftfNumero = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Contato");
        setResizable(false);

        pnlCentral.setLayout(new java.awt.CardLayout());

        pnlOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcoesLayout = new javax.swing.GroupLayout(pnlOpcoes);
        pnlOpcoes.setLayout(pnlOpcoesLayout);
        pnlOpcoesLayout.setHorizontalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnCriar)
                .addGap(27, 27, 27)
                .addComponent(btnEditar)
                .addGap(32, 32, 32)
                .addComponent(btnDeletar)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });

        tblContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblContatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContatos);

        btnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout pnlGerenciarContatosLayout = new javax.swing.GroupLayout(pnlGerenciarContatos);
        pnlGerenciarContatos.setLayout(pnlGerenciarContatosLayout);
        pnlGerenciarContatosLayout.setHorizontalGroup(
            pnlGerenciarContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGerenciarContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGerenciarContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGerenciarContatosLayout.createSequentialGroup()
                        .addComponent(tfPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlGerenciarContatosLayout.setVerticalGroup(
            pnlGerenciarContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGerenciarContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGerenciarContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGerenciarContatosLayout.createSequentialGroup()
                        .addGroup(pnlGerenciarContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(pnlOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlCentral.add(pnlGerenciarContatos, "cardManager");

        lblFoto.setBackground(new java.awt.Color(153, 153, 153));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/av/agenda/imagens/retrato.png"))); // NOI18N
        lblFoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblFoto.setOpaque(true);

        lblNome.setText("Nome:");

        lblNumero.setText("Número:");

        try {
            ftfNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfNumero.setText("(00) 00000-0000");
        ftfNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfNumeroMouseClicked(evt);
            }
        });

        lblEmail.setText("E-Mail:");

        tfEmail.setForeground(new java.awt.Color(102, 102, 102));
        tfEmail.setText("example@hotmail.com");
        tfEmail.setToolTipText("");
        tfEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfEmailMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdicionarContatoLayout = new javax.swing.GroupLayout(pnlAdicionarContato);
        pnlAdicionarContato.setLayout(pnlAdicionarContatoLayout);
        pnlAdicionarContatoLayout.setHorizontalGroup(
            pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionarContatoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail)
                    .addGroup(pnlAdicionarContatoLayout.createSequentialGroup()
                        .addGroup(pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdicionarContatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        pnlAdicionarContatoLayout.setVerticalGroup(
            pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionarContatoLayout.createSequentialGroup()
                .addGroup(pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdicionarContatoLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAdicionarContatoLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(ftfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(pnlAdicionarContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addGap(54, 54, 54))
        );

        pnlCentral.add(pnlAdicionarContato, "cardAdd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ftfNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfNumeroMouseClicked
        ftfNumero.setText("");
    }//GEN-LAST:event_ftfNumeroMouseClicked

    private void tfEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfEmailMouseClicked
        tfEmail.setText("");
        tfEmail.setForeground(Color.BLACK);
    }//GEN-LAST:event_tfEmailMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            CardLayout card = (CardLayout) pnlCentral.getLayout();
            card.show(pnlCentral, "cardManager");
            this.contato = null;
            limparCampos();
            this.setTitle("Gerenciar Contatos");
            TableController.limparTabela(tblContatos);
            carregarTabelaContatos(facade.listarContatos());
            TableController.ordenarTabela(tblContatos, new Integer[]{50, 250, 100, 150});
        } catch (Exception ex) {
            Logger.getLogger(JDGerenciadorContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            carregarContato();
            Validation.validarContato(this.contato);
            if (btnSalvar.getText().equals("Adicionar")) {
                facade.salvarContato(this.contato);
                JOptionPane.showMessageDialog(this, "ADICIONADO COM SUCESSO!!!");
            }
            if (btnSalvar.getText().equals("Alterar")) {
                facade.alterarContato(this.contato);
                JOptionPane.showMessageDialog(this, "ALTERADO COM SUCESSO!!!");
            }

            CardLayout card = (CardLayout) pnlCentral.getLayout();
            card.show(pnlCentral, "cardManager");
            this.contato = null;
            limparCampos();
            this.setTitle("Gerenciar Contatos");
            TableController.limparTabela(tblContatos);
            carregarTabelaContatos(facade.listarContatos());
            TableController.ordenarTabela(tblContatos, new Integer[]{50, 250, 100, 150});
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

//    ****************************************************************************************

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        CardLayout card = (CardLayout) pnlCentral.getLayout();
        card.show(pnlCentral, "cardAdd");
        this.contato = new Contato();
        this.setTitle("Adicionar Contato");
        this.btnSalvar.setText("Adicionar");
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (this.contato != null) {
            CardLayout card = (CardLayout) pnlCentral.getLayout();
            card.show(pnlCentral, "cardAdd");
            preencherCampos();
            this.setTitle("Alterar Contato");
            this.btnSalvar.setText("Alterar");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Contato!!!");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (this.contato != null) {
                if (this.contato != null) {
                    int valor = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o Contato??");
                    if (valor == 0) {
                        this.contato.setRemovido(true);
                        facade.alterarContato(this.contato);
                        JOptionPane.showMessageDialog(this, "REMOVIDO COM SUCESSO!!!");
                    }
                    this.contato = null;
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione um Produto!!!");
                }
                TableController.limparTabela(tblContatos);
                carregarTabelaContatos(facade.listarContatos());
                TableController.ordenarTabela(tblContatos, new Integer[]{50, 250, 100, 150});
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um Contato!!!");
            }
        } catch (Exception ex) {
            Logger.getLogger(JDGerenciadorContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void tblContatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContatosMouseClicked
        this.contato = obterObjetoContato(tblContatos.getSelectedRow());

    }//GEN-LAST:event_tblContatosMouseClicked

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        try {
            List<Contato> contatos = facade.listarContatosPorNome(tfPesquisar.getText());
            TableController.limparTabela(tblContatos);
            carregarTabelaContatos(contatos);
            TableController.ordenarTabela(tblContatos, new Integer[]{50, 250, 100, 150});
        } catch (Exception ex) {
            Logger.getLogger(JDGerenciadorContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfPesquisarKeyReleased

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
                JDGerenciadorContato dialog = new JDGerenciadorContato(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftfNumero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JPanel pnlAdicionarContato;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlGerenciarContatos;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.JTable tblContatos;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables

    private void carregarContato() {
        contato.setNome(tfNome.getText());
        contato.setNumero(ftfNumero.getText());
        contato.setEmail(tfEmail.getText());
    }

    private void carregarTabelaContatos(List<Contato> lista) {
        for (int linha = 0; linha < lista.size(); linha++) {
            tblContatos.getModel().setValueAt(new Object[]{
                lista.get(linha).getId(),
                lista.get(linha).getNome(),
                lista.get(linha).getNumero(),
                lista.get(linha).getEmail()
            }, linha, 0);
        }
    }

    private Contato obterObjetoContato(int indice) {
        try {
            if (tblContatos.getModel().getValueAt(indice, 0).equals("")) {
                return null;
            } else {
                return facade.buscarContato(Long.parseLong(String.valueOf(tblContatos.getModel().getValueAt(indice, 0))));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private void limparCampos() {
        tfNome.setText("");
        ftfNumero.setText("(00) 00000-0000");
        tfEmail.setText("example@hotmail.com");
    }

    private void preencherCampos() {
        limparCampos();
        tfNome.setText(contato.getNome());
        ftfNumero.setText(contato.getNumero());
        tfEmail.setText(contato.getEmail());
    }

}
