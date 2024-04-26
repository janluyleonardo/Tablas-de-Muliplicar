package login;

/**
 *
 * @author leonardo moreno
 */
public class licencia extends javax.swing.JFrame {

    public licencia() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalirMenu = new javax.swing.JButton();
        lblAnuncio = new javax.swing.JLabel();
        lblAnuncio1 = new javax.swing.JLabel();
        lblAnuncio2 = new javax.swing.JLabel();
        lblAnuncio3 = new javax.swing.JLabel();
        fondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirMenu.setBackground(new java.awt.Color(204, 0, 1));
        btnSalirMenu.setForeground(new java.awt.Color(204, 0, 1));
        btnSalirMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32.png"))); // NOI18N
        btnSalirMenu.setToolTipText("EXIT / SALIR");
        btnSalirMenu.setAlignmentY(0.0F);
        btnSalirMenu.setBorder(null);
        btnSalirMenu.setBorderPainted(false);
        btnSalirMenu.setContentAreaFilled(false);
        btnSalirMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirMenu.setFocusPainted(false);
        btnSalirMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalirMenu.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSalirMenu.setMaximumSize(new java.awt.Dimension(48, 48));
        btnSalirMenu.setMinimumSize(new java.awt.Dimension(48, 48));
        btnSalirMenu.setName("btn_Salir"); // NOI18N
        btnSalirMenu.setPreferredSize(new java.awt.Dimension(48, 48));
        btnSalirMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/salir_32B.png"))); // NOI18N
        btnSalirMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMenuMouseClicked(evt);
            }
        });
        btnSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 3, 32, 32));

        lblAnuncio.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblAnuncio.setForeground(new java.awt.Color(204, 0, 1));
        lblAnuncio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnuncio.setText("Esta licencia");
        lblAnuncio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblAnuncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 60));

        lblAnuncio1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblAnuncio1.setForeground(new java.awt.Color(204, 0, 1));
        lblAnuncio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnuncio1.setText("aún no se");
        lblAnuncio1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblAnuncio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 60));

        lblAnuncio2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblAnuncio2.setForeground(new java.awt.Color(204, 0, 1));
        lblAnuncio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnuncio2.setText("encuentra");
        lblAnuncio2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblAnuncio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 60));

        lblAnuncio3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblAnuncio3.setForeground(new java.awt.Color(204, 0, 1));
        lblAnuncio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnuncio3.setText("activa");
        lblAnuncio3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblAnuncio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 60));

        fondoMenu.setBackground(new java.awt.Color(204, 0, 1));
        fondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/leon.jpg"))); // NOI18N
        fondoMenu.setEnabled(false);
        fondoMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(fondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMenuMouseClicked
        System.exit(0);        
    }//GEN-LAST:event_btnSalirMenuMouseClicked

    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed

    }//GEN-LAST:event_btnSalirMenuActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JLabel fondoMenu;
    private javax.swing.JLabel lblAnuncio;
    private javax.swing.JLabel lblAnuncio1;
    private javax.swing.JLabel lblAnuncio2;
    private javax.swing.JLabel lblAnuncio3;
    // End of variables declaration//GEN-END:variables
}
