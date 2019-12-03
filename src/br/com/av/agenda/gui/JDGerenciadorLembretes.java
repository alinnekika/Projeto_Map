/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.av.agenda.gui;

import br.com.av.agenda.enums.Categoria;
import br.com.av.agenda.enums.TipoLembrete;
import br.com.av.agenda.facade.Facade;
import br.com.av.agenda.model.Contato;
import br.com.av.agenda.model.Lembrete;
import br.com.av.agenda.utils.StringUtils;
import br.com.av.agenda.utils.TableController;
import br.com.av.agenda.utils.Validation;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Alinne
 */
public class JDGerenciadorLembretes extends javax.swing.JDialog {

    private Facade facade;
    private Lembrete lembrete;

    public JDGerenciadorLembretes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            this.facade = new Facade();
            this.lembrete = null;

            lblIntervaloDe.setVisible(false);
            tfIntervaloDias.setVisible(false);
            lblIntervaloDias.setVisible(false);
            lblHora.setVisible(false);
            ftfHora.setVisible(false);
            lblData.setVisible(false);
            ftfData.setVisible(false);

            CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
            card.show(pnlCentralTipo, "cardAmostra");
            card = (CardLayout) pnlCentral.getLayout();
            card.show(pnlCentral, "cardManager");

            carregarCmbCategoria(Categoria.VAZIO);
            carregarCmbContato(null);
            TableController.criarTabela(tblLembretes, new String[]{"Indice", "Titulo", "Descrição", "Tipo", " Categoria", "Status"}, 15);
            TableController.ordenarTabela(tblLembretes, new Integer[]{50, 250, 100, 100, 100, 100});
            TableController.colorirTabela2(tblLembretes, new Color[]{Color.DARK_GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK, Color.GRAY},
                    new Color[]{Color.BLUE, Color.GRAY, Color.GREEN, Color.MAGENTA},
                    new Color[]{Color.BLACK, Color.DARK_GRAY, Color.BLACK, Color.BLUE});
            carregarTabelaLembretes(facade.listarLembretes());
        } catch (Exception ex) {
            Logger.getLogger(JDGerenciadorLembretes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCentral = new javax.swing.JPanel();
        pnlAdicionarLembrete = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        tfCampoTextoTitulo = new javax.swing.JTextField();
        lblDescrição = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        lblVincularContato = new javax.swing.JLabel();
        cmbContato = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        rtnUnico = new javax.swing.JRadioButton();
        rtnDiario = new javax.swing.JRadioButton();
        rtnSemanal = new javax.swing.JRadioButton();
        rtnIntervalo = new javax.swing.JRadioButton();
        pnlCentralTipo = new javax.swing.JPanel();
        pnlAmostra = new javax.swing.JPanel();
        pnlSemanal = new javax.swing.JPanel();
        ckbDomingo = new javax.swing.JCheckBox();
        ckbSegunda = new javax.swing.JCheckBox();
        ckbTerca = new javax.swing.JCheckBox();
        ckbQuarta = new javax.swing.JCheckBox();
        ckbQuinta = new javax.swing.JCheckBox();
        ckbSexta = new javax.swing.JCheckBox();
        ckbSabado = new javax.swing.JCheckBox();
        pnlGenerico = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        ftfHora = new javax.swing.JFormattedTextField();
        lblData = new javax.swing.JLabel();
        ftfData = new javax.swing.JFormattedTextField();
        lblIntervaloDe = new javax.swing.JLabel();
        lblIntervaloDias = new javax.swing.JLabel();
        tfIntervaloDias = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpnlDescricao = new javax.swing.JTextPane();
        pnlGerenciarLembrete = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLembretes = new javax.swing.JTable();
        pnlOpcoes = new javax.swing.JPanel();
        btnCriar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Lembrete");
        setResizable(false);

        pnlCentral.setLayout(new java.awt.CardLayout());

        pnlAdicionarLembrete.setBackground(new java.awt.Color(204, 204, 204));
        pnlAdicionarLembrete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblTitulo.setText("Título:");
        pnlAdicionarLembrete.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 26));

        tfCampoTextoTitulo.setBorder(null);
        pnlAdicionarLembrete.add(tfCampoTextoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 440, 21));

        lblDescrição.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblDescrição.setText("Descrição:");
        pnlAdicionarLembrete.add(lblDescrição, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 61, 100, 34));

        lblCategoria.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblCategoria.setText("Tipo:");
        pnlAdicionarLembrete.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, -1));

        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        pnlAdicionarLembrete.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 290, 24));

        lblVincularContato.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblVincularContato.setText("Vincular Contato:");
        pnlAdicionarLembrete.add(lblVincularContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, 110, -1));

        cmbContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContatoActionPerformed(evt);
            }
        });
        pnlAdicionarLembrete.add(cmbContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 440, 24));

        lblTipo.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblTipo.setText("Categoria:");
        pnlAdicionarLembrete.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 133, 103, -1));

        btnSalvar.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlAdicionarLembrete.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 110, -1));

        btnCancelar.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlAdicionarLembrete.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 110, -1));

        rtnUnico.setText("Único");
        rtnUnico.setOpaque(false);
        rtnUnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnUnicoActionPerformed(evt);
            }
        });
        pnlAdicionarLembrete.add(rtnUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 110, 18));

        rtnDiario.setText("Diário");
        rtnDiario.setOpaque(false);
        rtnDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnDiarioActionPerformed(evt);
            }
        });
        pnlAdicionarLembrete.add(rtnDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 110, 18));

        rtnSemanal.setText("Semanal");
        rtnSemanal.setOpaque(false);
        rtnSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnSemanalActionPerformed(evt);
            }
        });
        pnlAdicionarLembrete.add(rtnSemanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 110, 18));

        rtnIntervalo.setText("Intervalos de Dias");
        rtnIntervalo.setOpaque(false);
        rtnIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnIntervaloActionPerformed(evt);
            }
        });
        pnlAdicionarLembrete.add(rtnIntervalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, 18));

        pnlCentralTipo.setLayout(new java.awt.CardLayout());

        pnlAmostra.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlAmostraLayout = new javax.swing.GroupLayout(pnlAmostra);
        pnlAmostra.setLayout(pnlAmostraLayout);
        pnlAmostraLayout.setHorizontalGroup(
            pnlAmostraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlAmostraLayout.setVerticalGroup(
            pnlAmostraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        pnlCentralTipo.add(pnlAmostra, "cardAmostra");

        pnlSemanal.setBackground(new java.awt.Color(204, 204, 204));

        ckbDomingo.setBackground(new java.awt.Color(204, 204, 204));
        ckbDomingo.setText("Domingo");

        ckbSegunda.setBackground(new java.awt.Color(204, 204, 204));
        ckbSegunda.setText("Segunda-Feira");

        ckbTerca.setBackground(new java.awt.Color(204, 204, 204));
        ckbTerca.setText("Terça-Feira");

        ckbQuarta.setBackground(new java.awt.Color(204, 204, 204));
        ckbQuarta.setText("Quarta-Feira");

        ckbQuinta.setBackground(new java.awt.Color(204, 204, 204));
        ckbQuinta.setText("Quinta-Feira");
        ckbQuinta.setAlignmentY(0.7F);

        ckbSexta.setBackground(new java.awt.Color(204, 204, 204));
        ckbSexta.setText("Sexta-Feira");

        ckbSabado.setBackground(new java.awt.Color(204, 204, 204));
        ckbSabado.setText("Sábado");

        javax.swing.GroupLayout pnlSemanalLayout = new javax.swing.GroupLayout(pnlSemanal);
        pnlSemanal.setLayout(pnlSemanalLayout);
        pnlSemanalLayout.setHorizontalGroup(
            pnlSemanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSemanalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pnlSemanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ckbSegunda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbDomingo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbTerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbQuarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbSexta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbSabado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbQuinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(214, 214, 214))
        );
        pnlSemanalLayout.setVerticalGroup(
            pnlSemanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSemanalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckbDomingo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbSegunda)
                .addGap(0, 0, 0)
                .addComponent(ckbTerca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbQuarta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbQuinta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbSexta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbSabado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCentralTipo.add(pnlSemanal, "cardSemanal");

        pnlGenerico.setBackground(new java.awt.Color(204, 204, 204));
        pnlGenerico.setLayout(null);

        lblHora.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblHora.setText("Hora:");
        pnlGenerico.add(lblHora);
        lblHora.setBounds(20, 20, 40, 20);

        ftfHora.setBackground(new java.awt.Color(204, 204, 204));
        ftfHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        try {
            ftfHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfHora.setText("00:00");
        ftfHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfHoraMouseClicked(evt);
            }
        });
        pnlGenerico.add(ftfHora);
        ftfHora.setBounds(70, 20, 43, 20);

        lblData.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblData.setText("Data:");
        pnlGenerico.add(lblData);
        lblData.setBounds(20, 50, 50, 20);

        ftfData.setBackground(new java.awt.Color(204, 204, 204));
        ftfData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        try {
            ftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfData.setText("00/00/0000");
        ftfData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfDataMouseClicked(evt);
            }
        });
        pnlGenerico.add(ftfData);
        ftfData.setBounds(70, 50, 105, 20);

        lblIntervaloDe.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblIntervaloDe.setText("Intervalo de:");
        pnlGenerico.add(lblIntervaloDe);
        lblIntervaloDe.setBounds(20, 90, 80, 20);

        lblIntervaloDias.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        lblIntervaloDias.setText("dias");
        pnlGenerico.add(lblIntervaloDias);
        lblIntervaloDias.setBounds(170, 90, 41, 20);

        tfIntervaloDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfIntervaloDias.setOpaque(false);
        pnlGenerico.add(tfIntervaloDias);
        tfIntervaloDias.setBounds(110, 90, 50, 20);

        pnlCentralTipo.add(pnlGenerico, "cardGenerico");

        pnlAdicionarLembrete.add(pnlCentralTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 250, 170));

        jScrollPane2.setViewportView(tpnlDescricao);

        pnlAdicionarLembrete.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 52, 440, 70));

        pnlCentral.add(pnlAdicionarLembrete, "cardAdd");

        tblLembretes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblLembretes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLembretesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLembretes);

        pnlOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlOpcoes.setPreferredSize(new java.awt.Dimension(96, 393));

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
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnCriar)
                .addGap(35, 35, 35)
                .addComponent(btnEditar)
                .addGap(36, 36, 36)
                .addComponent(btnDeletar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout pnlGerenciarLembreteLayout = new javax.swing.GroupLayout(pnlGerenciarLembrete);
        pnlGerenciarLembrete.setLayout(pnlGerenciarLembreteLayout);
        pnlGerenciarLembreteLayout.setHorizontalGroup(
            pnlGerenciarLembreteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGerenciarLembreteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGerenciarLembreteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGerenciarLembreteLayout.createSequentialGroup()
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pnlGerenciarLembreteLayout.setVerticalGroup(
            pnlGerenciarLembreteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGerenciarLembreteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGerenciarLembreteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGroup(pnlGerenciarLembreteLayout.createSequentialGroup()
                        .addGroup(pnlGerenciarLembreteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlCentral.add(pnlGerenciarLembrete, "cardManager");

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

    private void rtnDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnDiarioActionPerformed
        if (rtnDiario.isSelected()) {
            rtnUnico.setSelected(false);
            rtnSemanal.setSelected(false);
            rtnIntervalo.setSelected(false);
            CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
            card.show(pnlCentralTipo, "cardGenerico");
            lblIntervaloDe.setVisible(false);
            tfIntervaloDias.setVisible(false);
            lblIntervaloDias.setVisible(false);
            lblHora.setVisible(true);
            ftfHora.setVisible(true);
            lblData.setVisible(false);
            ftfData.setVisible(false);
            this.lembrete.setTipo(TipoLembrete.DIARIO);
        }
    }//GEN-LAST:event_rtnDiarioActionPerformed

    private void rtnIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnIntervaloActionPerformed
        if (rtnIntervalo.isSelected()) {
            rtnUnico.setSelected(false);
            rtnSemanal.setSelected(false);
            rtnDiario.setSelected(false);
            CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
            card.show(pnlCentralTipo, "cardGenerico");
            lblIntervaloDe.setVisible(true);
            tfIntervaloDias.setVisible(true);
            lblIntervaloDias.setVisible(true);
            lblHora.setVisible(true);
            ftfHora.setVisible(true);
            lblData.setVisible(true);
            ftfData.setVisible(true);
            this.lembrete.setTipo(TipoLembrete.INTERVALODIAS);
        }
    }//GEN-LAST:event_rtnIntervaloActionPerformed

    private void rtnUnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnUnicoActionPerformed
        if (rtnUnico.isSelected()) {
            rtnDiario.setSelected(false);
            rtnSemanal.setSelected(false);
            rtnIntervalo.setSelected(false);
            lblIntervaloDe.setVisible(false);
            tfIntervaloDias.setVisible(false);
            lblIntervaloDias.setVisible(false);
            lblHora.setVisible(true);
            ftfHora.setVisible(true);
            lblData.setVisible(true);
            ftfData.setVisible(true);
            CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
            card.show(pnlCentralTipo, "cardGenerico");
            this.lembrete.setTipo(TipoLembrete.UNICO);
        }
    }//GEN-LAST:event_rtnUnicoActionPerformed

    private void rtnSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnSemanalActionPerformed
        if (rtnSemanal.isSelected()) {
            rtnDiario.setSelected(false);
            rtnUnico.setSelected(false);
            rtnIntervalo.setSelected(false);
            CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
            card.show(pnlCentralTipo, "cardSemanal");
            this.lembrete.setTipo(TipoLembrete.SEMANAL);
        }
    }//GEN-LAST:event_rtnSemanalActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed

    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void cmbContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContatoActionPerformed

    }//GEN-LAST:event_cmbContatoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            carregarLembrete();
            Validation.validarLembrete(this.lembrete);
            validarCampos();
            gerarDatas();
            if (btnSalvar.getText().equals("Adicionar")) {
                facade.salvarLembrete(this.lembrete);
                JOptionPane.showMessageDialog(this, "ADICIONADO COM SUCESSO!!!");
            }
            if (btnSalvar.getText().equals("Alterar")) {
                facade.alterarLembrete(this.lembrete);
                JOptionPane.showMessageDialog(this, "ALTERADO COM SUCESSO!!!");
            }

            CardLayout card = (CardLayout) pnlCentral.getLayout();
            card.show(pnlCentral, "cardManager");
            this.setTitle("Gerenciar Lembretes");
            limparCampos();
            this.lembrete = null;
            TableController.limparTabela(tblLembretes);
            carregarTabelaLembretes(facade.listarLembretes());
            TableController.ordenarTabela(tblLembretes, new Integer[]{50, 250, 100, 100, 100, 100});
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            CardLayout card = (CardLayout) pnlCentral.getLayout();
            card.show(pnlCentral, "cardManager");
            this.setTitle("Gerenciar Lembretes");
            limparCampos();
            TableController.limparTabela(tblLembretes);
            carregarTabelaLembretes(facade.listarLembretes());
            TableController.ordenarTabela(tblLembretes, new Integer[]{50, 250, 100, 100, 100, 100});
            this.lembrete = null;
        } catch (Exception ex) {
            Logger.getLogger(JDGerenciadorContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ftfHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfHoraMouseClicked
        ftfHora.setText("");
    }//GEN-LAST:event_ftfHoraMouseClicked

    private void ftfDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfDataMouseClicked
        ftfData.setText("");
    }//GEN-LAST:event_ftfDataMouseClicked

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        CardLayout card = (CardLayout) pnlCentral.getLayout();
        card.show(pnlCentral, "cardAdd");
        this.lembrete = new Lembrete();
        this.setTitle("Adicionar Lembrete");
        this.btnSalvar.setText("Adicionar");
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (this.lembrete != null) {
            CardLayout card = (CardLayout) pnlCentral.getLayout();
            card.show(pnlCentral, "cardAdd");
            preencherCampos();
            this.setTitle("Alterar Lembrete");
            this.btnSalvar.setText("Alterar");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Lembrete!!!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            if (this.lembrete != null) {
                if (this.lembrete != null) {
                    int valor = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o Lembrete?");
                    if (valor == 0) {
                        facade.excluirLembrete(this.lembrete);
                        JOptionPane.showMessageDialog(this, "REMOVIDO COM SUCESSO!!!");
                    }
                    this.lembrete = null;
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione um Lembrete!!!");
                }
                TableController.limparTabela(tblLembretes);
                carregarTabelaLembretes(facade.listarLembretes());
                TableController.ordenarTabela(tblLembretes, new Integer[]{50, 250, 100, 100, 100, 100});
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um Lembrete!!!");
            }
        } catch (Exception ex) {
            Logger.getLogger(JDGerenciadorContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void tblLembretesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLembretesMouseClicked
        this.lembrete = obterObjetoLembrete(tblLembretes.getSelectedRow());
    }//GEN-LAST:event_tblLembretesMouseClicked

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        try {
            TableController.limparTabela(tblLembretes);
            carregarTabelaLembretes(facade.listarLembretesPorTitulo(tfPesquisar.getText()));
            TableController.ordenarTabela(tblLembretes, new Integer[]{50, 250, 100, 100, 100, 100});
        } catch (Exception ex) {
            Logger.getLogger(JDGerenciadorLembretes.class.getName()).log(Level.SEVERE, null, ex);
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
                JDGerenciadorLembretes dialog = new JDGerenciadorLembretes(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox ckbDomingo;
    private javax.swing.JCheckBox ckbQuarta;
    private javax.swing.JCheckBox ckbQuinta;
    private javax.swing.JCheckBox ckbSabado;
    private javax.swing.JCheckBox ckbSegunda;
    private javax.swing.JCheckBox ckbSexta;
    private javax.swing.JCheckBox ckbTerca;
    private javax.swing.JComboBox<Categoria> cmbCategoria;
    private javax.swing.JComboBox<Contato> cmbContato;
    private javax.swing.JFormattedTextField ftfData;
    private javax.swing.JFormattedTextField ftfHora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescrição;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIntervaloDe;
    private javax.swing.JLabel lblIntervaloDias;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVincularContato;
    private javax.swing.JPanel pnlAdicionarLembrete;
    private javax.swing.JPanel pnlAmostra;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlCentralTipo;
    private javax.swing.JPanel pnlGenerico;
    private javax.swing.JPanel pnlGerenciarLembrete;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.JPanel pnlSemanal;
    private javax.swing.JRadioButton rtnDiario;
    private javax.swing.JRadioButton rtnIntervalo;
    private javax.swing.JRadioButton rtnSemanal;
    private javax.swing.JRadioButton rtnUnico;
    private javax.swing.JTable tblLembretes;
    private javax.swing.JTextField tfCampoTextoTitulo;
    private javax.swing.JTextField tfIntervaloDias;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextPane tpnlDescricao;
    // End of variables declaration//GEN-END:variables

    private void carregarCmbCategoria(Categoria categoria) {
        cmbCategoria.removeAllItems();
        for (Categoria categoriaAtual : Categoria.values()) {
            cmbCategoria.addItem(categoriaAtual);
            if (categoriaAtual.getCategoria().equals(categoria.getCategoria())) {
                cmbCategoria.getModel().setSelectedItem(categoriaAtual);
            }
        }
    }

    private void carregarCmbContato(Contato contato) {

        try {
            cmbContato.removeAllItems();
//            if (contato == null) {
//                cmbContato.addItem(new Contato(""));
//            }
            for (Contato contatoAtual : facade.listarTodosContatos()) {
                cmbContato.addItem(contatoAtual);
                if (contato != null && contato.getId() == contatoAtual.getId()) {
                    cmbContato.getModel().setSelectedItem(contatoAtual);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void carregarLembrete() {
        this.lembrete.setTitulo(tfCampoTextoTitulo.getText());
        this.lembrete.setDescricao(tpnlDescricao.getText());
        this.lembrete.setCategoria((Categoria) cmbCategoria.getModel().getSelectedItem());
        this.lembrete.setContato((Contato) cmbContato.getModel().getSelectedItem());
//         System.out.println(ftfIntervaloDias.getText().equals("    "));
        if (tfIntervaloDias.getText().equals("    ")) {
            this.lembrete.setIntervaloDias(Integer.parseInt(tfIntervaloDias.getText()));
        }
    }

    private void limparCampos() {

        tfCampoTextoTitulo.setText("");
        tpnlDescricao.setText("");
        carregarCmbContato(null);
        carregarCmbCategoria(Categoria.VAZIO);
        rtnUnico.setSelected(false);
        rtnDiario.setSelected(false);
        rtnSemanal.setSelected(false);
        rtnIntervalo.setSelected(false);
        ftfHora.setText("00:00");
        ftfData.setText("00/00/0000");
        tfIntervaloDias.setText("");
        ckbDomingo.setSelected(false);
        ckbSegunda.setSelected(false);
        ckbTerca.setSelected(false);
        ckbQuarta.setSelected(false);
        ckbQuinta.setSelected(false);
        ckbSexta.setSelected(false);
        ckbSabado.setSelected(false);
        CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
        card.show(pnlCentralTipo, "cardAmostra");

    }

    private void validarCampos() throws Exception {
        if (this.lembrete.getTipo().equals(TipoLembrete.UNICO)) {
            if (ftfHora.getText().equals("00:00")) {
                throw new Exception("Preencha o campo Hora!");
            }
            if (ftfHora.getText().equals("  :  ")) {
                throw new Exception("Preencha o campo Hora!");
            }
            if (ftfData.getText().equals("00/00/0000")) {
                throw new Exception("Preencha o campo Data!");
            }
            if (ftfData.getText().equals("  /  /    ")) {
                throw new Exception("Preencha o campo Data!");
            }
        }
        if (this.lembrete.getTipo().equals(TipoLembrete.DIARIO)) {

            if (ftfHora.getText().equals("00:00")) {
                throw new Exception("Preencha o campo Hora!");
            }
            if (ftfHora.getText().equals("  :  ")) {
                throw new Exception("Preencha o campo Hora!");
            }
        }
        if (this.lembrete.getTipo().equals(TipoLembrete.SEMANAL)) {
            if (!ckbDomingo.isSelected() && !ckbSegunda.isSelected() && !ckbTerca.isSelected()
                    && !ckbQuarta.isSelected() && !ckbQuinta.isSelected() && !ckbSexta.isSelected()
                    && !ckbSabado.isSelected()) {
                throw new Exception("Selecione pelo menos um dia da semana!!");
            }
        }
        if (this.lembrete.getTipo().equals(TipoLembrete.INTERVALODIAS)) {
            if (ftfHora.getText().equals("00:00")) {
                throw new Exception("Preencha o campo Hora!");
            }
            if (ftfHora.getText().equals("  :  ")) {
                throw new Exception("Preencha o campo Hora!");
            }
            if (ftfData.getText().equals("00/00/0000")) {
                throw new Exception("Preencha o campo Data!");
            }
            if (ftfData.getText().equals("  /  /    ")) {
                throw new Exception("Preencha o campo Data!");
            }
            if (tfIntervaloDias.getText().isEmpty() || tfIntervaloDias.getText().equals("")) {
                throw new Exception("Informe um Intervalo de dias!");
            }
        }
    }

    private void carregarTabelaLembretes(List<Lembrete> lista) {
        for (int linha = 0; linha < lista.size(); linha++) {
            tblLembretes.getModel().setValueAt(new Object[]{
                lista.get(linha).getId(),
                lista.get(linha).getTitulo(),
                lista.get(linha).getDescricao(),
                lista.get(linha).getTipo(),
                lista.get(linha).getCategoria(),
                lista.get(linha).getStatus()
            }, linha, 0);
        }
    }

    private void preencherCampos() {
        try {
            tfCampoTextoTitulo.setText(this.lembrete.getTitulo());
            tpnlDescricao.setText(this.lembrete.getDescricao());
            carregarCmbContato(this.lembrete.getContato());
            carregarCmbCategoria(this.lembrete.getCategoria());
            if (this.lembrete.getTipo().equals(TipoLembrete.UNICO)) {
                rtnUnico.setSelected(true);
                lblIntervaloDe.setVisible(false);
                tfIntervaloDias.setVisible(false);
                lblIntervaloDias.setVisible(false);
                lblHora.setVisible(true);
                ftfHora.setVisible(true);
                lblData.setVisible(true);
                ftfData.setVisible(true);
                ftfHora.setText(StringUtils.getHoraCalendar(this.lembrete.getCalendar().get(0)));
                ftfData.setText(StringUtils.formatarDataCalendar(this.lembrete.getCalendar().get(0)));
                CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
                card.show(pnlCentralTipo, "cardGenerico");

            }
            if (this.lembrete.getTipo().equals(TipoLembrete.DIARIO)) {
                rtnDiario.setSelected(true);
                lblIntervaloDe.setVisible(false);
                tfIntervaloDias.setVisible(false);
                lblIntervaloDias.setVisible(false);
                lblHora.setVisible(true);
                ftfHora.setVisible(true);
                lblData.setVisible(false);
                ftfData.setVisible(false);
                ftfHora.setText(StringUtils.getHoraCalendar(this.lembrete.getCalendar().get(0)));
                CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
                card.show(pnlCentralTipo, "cardGenerico");
            }

            if (this.lembrete.getTipo().equals(TipoLembrete.INTERVALODIAS)) {
                rtnIntervalo.setSelected(true);
                lblIntervaloDe.setVisible(true);
                tfIntervaloDias.setVisible(true);
                lblIntervaloDias.setVisible(true);
                lblHora.setVisible(true);
                ftfHora.setVisible(true);
                lblData.setVisible(true);
                ftfData.setVisible(true);
                ftfHora.setText(StringUtils.getHoraCalendar(this.lembrete.getCalendar().get(0)));
                ftfData.setText(StringUtils.formatarDataCalendar(this.lembrete.getCalendar().get(0)));
                tfIntervaloDias.setText(String.valueOf(this.lembrete.getIntervaloDias()));

                CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
                card.show(pnlCentralTipo, "cardGenerico");
            }

            if (this.lembrete.getTipo().equals(TipoLembrete.SEMANAL)) {
                rtnSemanal.setSelected(true);
                for (Calendar calendar : this.lembrete.getCalendar()) {
                    if (calendar.get(calendar.DAY_OF_WEEK) == 1) {
                        ckbDomingo.setSelected(true);
                    }
                    if (calendar.get(calendar.DAY_OF_WEEK) == 2) {
                        ckbSegunda.setSelected(true);
                    }
                    if (calendar.get(calendar.DAY_OF_WEEK) == 3) {
                        ckbTerca.setSelected(true);
                    }
                    if (calendar.get(calendar.DAY_OF_WEEK) == 4) {
                        ckbQuarta.setSelected(true);
                    }
                    if (calendar.get(calendar.DAY_OF_WEEK) == 5) {
                        ckbQuinta.setSelected(true);
                    }
                    if (calendar.get(calendar.DAY_OF_WEEK) == 6) {
                        ckbSexta.setSelected(true);
                    }
                    if (calendar.get(calendar.DAY_OF_WEEK) == 7) {
                        ckbSabado.setSelected(true);
                    }
                }
                CardLayout card = (CardLayout) pnlCentralTipo.getLayout();
                card.show(pnlCentralTipo, "cardSemanal");
            }
        } catch (ParseException ex) {
            Logger.getLogger(JDGerenciadorLembretes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gerarDatas() throws ParseException, Exception {
        Calendar calendar;
        this.lembrete.getCalendar().clear();

        if (this.lembrete.getTipo().equals(TipoLembrete.UNICO)) {
            calendar = Calendar.getInstance();
            calendar.set(calendar.HOUR_OF_DAY, Integer.parseInt(ftfHora.getText().substring(0, 2)));
            calendar.set(calendar.MINUTE, Integer.parseInt(ftfHora.getText().substring(3)));
            calendar.set(calendar.SECOND, 00);
            calendar.set(calendar.DATE, Integer.parseInt(ftfData.getText().substring(0, 2)));
            calendar.set(calendar.MONTH, Integer.parseInt(ftfData.getText().substring(3, 5)) - 1);
            calendar.set(calendar.YEAR, Integer.parseInt(ftfData.getText().substring(6)));
            this.lembrete.getCalendar().add(calendar);
        }
        if (this.lembrete.getTipo().equals(TipoLembrete.DIARIO)) {
            calendar = Calendar.getInstance();
            calendar.set(calendar.HOUR_OF_DAY, Integer.parseInt(ftfHora.getText().substring(0, 2)));
            calendar.set(calendar.MINUTE, Integer.parseInt(ftfHora.getText().substring(3)));
            calendar.set(calendar.SECOND, 00);
            this.lembrete.getCalendar().add(calendar);
        }
        if (this.lembrete.getTipo().equals(TipoLembrete.SEMANAL)) {
            calendar = Calendar.getInstance();
            if (ckbDomingo.isSelected()) {
                calendar.set(calendar.DAY_OF_WEEK, 1);
                calendar.set(calendar.HOUR_OF_DAY, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
                calendar.set(calendar.MINUTE, Calendar.getInstance().get(Calendar.MINUTE) + 1);
                calendar.set(calendar.SECOND, 00);
                this.lembrete.getCalendar().add((Calendar) calendar.clone());
            }
            if (ckbSegunda.isSelected()) {
                calendar.set(calendar.DAY_OF_WEEK, 2);
                calendar.set(calendar.HOUR_OF_DAY, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
                calendar.set(calendar.MINUTE, Calendar.getInstance().get(Calendar.MINUTE) + 1);
                calendar.set(calendar.SECOND, 00);
                this.lembrete.getCalendar().add((Calendar) calendar.clone());
            }
            if (ckbTerca.isSelected()) {
                calendar.set(calendar.DAY_OF_WEEK, 3);
                calendar.set(calendar.HOUR_OF_DAY, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
                calendar.set(calendar.MINUTE, Calendar.getInstance().get(Calendar.MINUTE) + 1);
                calendar.set(calendar.SECOND, 00);
                this.lembrete.getCalendar().add((Calendar) calendar.clone());
            }
            if (ckbQuarta.isSelected()) {
                calendar.set(calendar.DAY_OF_WEEK, 4);
                calendar.set(calendar.HOUR_OF_DAY, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
                calendar.set(calendar.MINUTE, Calendar.getInstance().get(Calendar.MINUTE) + 1);
                calendar.set(calendar.SECOND, 00);
                this.lembrete.getCalendar().add((Calendar) calendar.clone());
            }
            if (ckbQuinta.isSelected()) {
                calendar.set(calendar.DAY_OF_WEEK, 5);
                calendar.set(calendar.HOUR_OF_DAY, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
                calendar.set(calendar.MINUTE, Calendar.getInstance().get(Calendar.MINUTE) + 1);
                calendar.set(calendar.SECOND, 00);
                this.lembrete.getCalendar().add((Calendar) calendar.clone());
            }
            if (ckbSexta.isSelected()) {
                calendar.set(calendar.DAY_OF_WEEK, 6);
                calendar.set(calendar.HOUR_OF_DAY, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
                calendar.set(calendar.MINUTE, Calendar.getInstance().get(Calendar.MINUTE) + 1);
                calendar.set(calendar.SECOND, 00);
                this.lembrete.getCalendar().add((Calendar) calendar.clone());
            }
            if (ckbSabado.isSelected()) {
                calendar.set(calendar.DAY_OF_WEEK, 7);
                calendar.set(calendar.HOUR_OF_DAY, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
                calendar.set(calendar.MINUTE, Calendar.getInstance().get(Calendar.MINUTE) + 1);
                calendar.set(calendar.SECOND, 00);
                this.lembrete.getCalendar().add((Calendar) calendar.clone());
            }
        }
        if (this.lembrete.getTipo().equals(TipoLembrete.INTERVALODIAS)) {
            calendar = Calendar.getInstance();
            calendar.set(calendar.HOUR_OF_DAY, Integer.parseInt(ftfHora.getText().substring(0, 2)));
            calendar.set(calendar.MINUTE, Integer.parseInt(ftfHora.getText().substring(3)));
            calendar.set(calendar.SECOND, 00);
            calendar.set(calendar.DATE, Integer.parseInt(ftfData.getText().substring(0, 2)));
            calendar.set(calendar.MONTH, Integer.parseInt(ftfData.getText().substring(3, 5)) - 1);
            calendar.set(calendar.YEAR, Integer.parseInt(ftfData.getText().substring(6)));

            this.lembrete.getCalendar().add(calendar);
            try {
                this.lembrete.setIntervaloDias(Integer.parseInt(tfIntervaloDias.getText()));
            } catch (Exception e) {
                throw new Exception("Erro no intervalo de datas!!! inteiros permitidos entre 1 - 999");
            }
        }
    }

    private Lembrete obterObjetoLembrete(int indice) {
        try {
            if (tblLembretes.getModel().getValueAt(indice, 0).equals("")) {
                return null;
            } else {
                return facade.buscarLembrete(Long.parseLong(String.valueOf(tblLembretes.getModel().getValueAt(indice, 0))));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
