package login;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class correcto extends javax.swing.JFrame {

    public correcto() {
        initComponents();
        setLocationRelativeTo(this);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../IMG/leon.jpg")).getImage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jpPrincipal, "" + e, "NO SE ENCUENTRA LA IMAGEN SOLICITADA", JOptionPane.ERROR_MESSAGE);
        }
        jpTablas.setVisible(true);
    }

    String numero="";
    int respuesta = 0, numeroA = 0, numeroB = 0;
    int contador = 0;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpTablas = new javax.swing.JPanel();
        btnSalir_Tablas = new javax.swing.JButton();
        lblRespuestaCorrecta = new javax.swing.JLabel();
        lblAnuncio = new javax.swing.JLabel();
        lblAnuncio1 = new javax.swing.JLabel();
        t1_lbl_Titulo = new javax.swing.JLabel();
        t1_lbl_Leon1 = new javax.swing.JLabel();
        t1_lbl_Leon2 = new javax.swing.JLabel();
        t1_lbl_Leon3 = new javax.swing.JLabel();
        t1_lbl_Leon4 = new javax.swing.JLabel();
        t1_lbl_Leon5 = new javax.swing.JLabel();
        t1_lbl_Leon6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tablas de Multiplicar");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 51, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(677, 506));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipal.setBackground(new java.awt.Color(204, 0, 1));
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTablas.setBackground(new java.awt.Color(204, 0, 1));
        jpTablas.setForeground(new java.awt.Color(255, 255, 255));
        jpTablas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir_Tablas.setAction(btnSalir_Tablas.getAction());
        btnSalir_Tablas.setBackground(new java.awt.Color(204, 0, 1));
        btnSalir_Tablas.setForeground(new java.awt.Color(204, 0, 1));
        btnSalir_Tablas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32.png"))); // NOI18N
        btnSalir_Tablas.setToolTipText("EXIT / SALIR");
        btnSalir_Tablas.setAlignmentY(0.0F);
        btnSalir_Tablas.setBorder(null);
        btnSalir_Tablas.setBorderPainted(false);
        btnSalir_Tablas.setContentAreaFilled(false);
        btnSalir_Tablas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir_Tablas.setFocusPainted(false);
        btnSalir_Tablas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir_Tablas.setMaximumSize(new java.awt.Dimension(48, 48));
        btnSalir_Tablas.setMinimumSize(new java.awt.Dimension(48, 48));
        btnSalir_Tablas.setName("btn_Salir"); // NOI18N
        btnSalir_Tablas.setPreferredSize(new java.awt.Dimension(48, 48));
        btnSalir_Tablas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32B.png"))); // NOI18N
        btnSalir_Tablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalir_TablasMouseClicked(evt);
            }
        });
        btnSalir_Tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir_TablasActionPerformed(evt);
            }
        });
        jpTablas.add(btnSalir_Tablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 0, 32, 32));

        lblRespuestaCorrecta.setBackground(new java.awt.Color(102, 102, 102));
        lblRespuestaCorrecta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespuestaCorrecta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/correcto.gif"))); // NOI18N
        lblRespuestaCorrecta.setToolTipText("SU RESPUESTA");
        lblRespuestaCorrecta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(lblRespuestaCorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 640, 380));

        lblAnuncio.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblAnuncio.setForeground(new java.awt.Color(204, 0, 1));
        lblAnuncio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnuncio.setText("felicitaciones!!!");
        lblAnuncio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(lblAnuncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 640, 60));

        lblAnuncio1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblAnuncio1.setForeground(new java.awt.Color(204, 0, 1));
        lblAnuncio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnuncio1.setText("Tu respuesta es correcta,");
        lblAnuncio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(lblAnuncio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 640, 60));

        t1_lbl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        t1_lbl_Titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        t1_lbl_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        t1_lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1_lbl_Titulo.setText("Respuesta");
        jpTablas.add(t1_lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 640, -1));

        t1_lbl_Leon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1_lbl_Leon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        t1_lbl_Leon1.setEnabled(false);
        t1_lbl_Leon1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(t1_lbl_Leon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 280));

        t1_lbl_Leon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1_lbl_Leon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        t1_lbl_Leon2.setEnabled(false);
        t1_lbl_Leon2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(t1_lbl_Leon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 260, 280));

        t1_lbl_Leon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1_lbl_Leon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        t1_lbl_Leon3.setEnabled(false);
        t1_lbl_Leon3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(t1_lbl_Leon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 260, 280));

        t1_lbl_Leon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1_lbl_Leon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        t1_lbl_Leon4.setEnabled(false);
        t1_lbl_Leon4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(t1_lbl_Leon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 280));

        t1_lbl_Leon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1_lbl_Leon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        t1_lbl_Leon5.setEnabled(false);
        t1_lbl_Leon5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(t1_lbl_Leon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 260, 280));

        t1_lbl_Leon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1_lbl_Leon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        t1_lbl_Leon6.setEnabled(false);
        t1_lbl_Leon6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(t1_lbl_Leon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 260, 280));

        jpPrincipal.add(jpTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 681, 510));

        getContentPane().add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir_TablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir_TablasMouseClicked
        this.setVisible(false);            
    }//GEN-LAST:event_btnSalir_TablasMouseClicked

    private void btnSalir_TablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir_TablasActionPerformed

    }//GEN-LAST:event_btnSalir_TablasActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir_Tablas;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTablas;
    private javax.swing.JLabel lblAnuncio;
    private javax.swing.JLabel lblAnuncio1;
    private javax.swing.JLabel lblRespuestaCorrecta;
    private javax.swing.JLabel t1_lbl_Leon1;
    private javax.swing.JLabel t1_lbl_Leon2;
    private javax.swing.JLabel t1_lbl_Leon3;
    private javax.swing.JLabel t1_lbl_Leon4;
    private javax.swing.JLabel t1_lbl_Leon5;
    private javax.swing.JLabel t1_lbl_Leon6;
    private javax.swing.JLabel t1_lbl_Titulo;
    // End of variables declaration//GEN-END:variables
}
