package login;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class sesionTablas extends javax.swing.JFrame {

    public sesionTablas() {
        initComponents();
        setLocationRelativeTo(this);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../IMG/leon.jpg")).getImage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jpPrincipal, "" + e, "NO SE ENCUENTRA LA IMAGEN SOLICITADA", JOptionPane.ERROR_MESSAGE);
        }
        jpTablas.setVisible(true); lbl_NumeroA0.setVisible(false); lbl_NumeroA1.setVisible(false);
        lbl_NumeroA2.setVisible(false); lbl_NumeroA3.setVisible(false); lbl_NumeroA4.setVisible(false);
        lbl_NumeroA5.setVisible(false); lbl_NumeroA6.setVisible(false); lbl_NumeroA7.setVisible(false);
        lbl_NumeroA8.setVisible(false); lbl_NumeroA9.setVisible(false); lbl_NumeroB0.setVisible(false);
        lbl_NumeroB1.setVisible(false); lbl_NumeroB2.setVisible(false); lbl_NumeroB3.setVisible(false);
        lbl_NumeroB4.setVisible(false); lbl_NumeroB5.setVisible(false); lbl_NumeroB6.setVisible(false);
        lbl_NumeroB7.setVisible(false); lbl_NumeroB8.setVisible(false); lbl_NumeroB9.setVisible(false);
        lbl_Por.setVisible(false); 
        btnNumRes0.setVisible(false); btnNumRes1.setVisible(false); btnNumRes2.setVisible(false);
        btnNumRes3.setVisible(false); btnNumRes4.setVisible(false); btnNumRes5.setVisible(false);
        btnNumRes6.setVisible(false); btnNumRes7.setVisible(false); btnNumRes8.setVisible(false);
        btnNumRes9.setVisible(false); btnIgual.setVisible(false); btnRegresar.setVisible(false);
    }

    String numero="",vacio="";
    int respuesta = 0, numeroA = 0, numeroB = 0;
    int contador = 0;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpTablas = new javax.swing.JPanel();
        btnSalir_Tablas = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblAnuncio = new javax.swing.JLabel();
        btn_Nuevo = new javax.swing.JButton();
        btnNumRes1 = new javax.swing.JButton();
        btnNumRes2 = new javax.swing.JButton();
        btnNumRes3 = new javax.swing.JButton();
        btnNumRes4 = new javax.swing.JButton();
        btnNumRes5 = new javax.swing.JButton();
        btnNumRes6 = new javax.swing.JButton();
        btnNumRes7 = new javax.swing.JButton();
        btnNumRes8 = new javax.swing.JButton();
        btnNumRes9 = new javax.swing.JButton();
        btnNumRes0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        txtRespuesta = new javax.swing.JTextField();
        lbl_Por = new javax.swing.JLabel();
        lbl_NumeroA0 = new javax.swing.JLabel();
        lbl_NumeroA1 = new javax.swing.JLabel();
        lbl_NumeroA2 = new javax.swing.JLabel();
        lbl_NumeroA3 = new javax.swing.JLabel();
        lbl_NumeroA4 = new javax.swing.JLabel();
        lbl_NumeroA5 = new javax.swing.JLabel();
        lbl_NumeroA6 = new javax.swing.JLabel();
        lbl_NumeroA7 = new javax.swing.JLabel();
        lbl_NumeroA8 = new javax.swing.JLabel();
        lbl_NumeroA9 = new javax.swing.JLabel();
        lbl_NumeroB0 = new javax.swing.JLabel();
        lbl_NumeroB1 = new javax.swing.JLabel();
        lbl_NumeroB2 = new javax.swing.JLabel();
        lbl_NumeroB3 = new javax.swing.JLabel();
        lbl_NumeroB4 = new javax.swing.JLabel();
        lbl_NumeroB5 = new javax.swing.JLabel();
        lbl_NumeroB6 = new javax.swing.JLabel();
        lbl_NumeroB7 = new javax.swing.JLabel();
        lbl_NumeroB8 = new javax.swing.JLabel();
        lbl_NumeroB9 = new javax.swing.JLabel();
        t1_lbl_Titulo = new javax.swing.JLabel();
        t1_lbl_Leon1 = new javax.swing.JLabel();
        t1_lbl_Leon2 = new javax.swing.JLabel();
        t1_lbl_Leon3 = new javax.swing.JLabel();
        t1_lbl_Leon4 = new javax.swing.JLabel();
        t1_lbl_Leon5 = new javax.swing.JLabel();
        t1_lbl_Leon6 = new javax.swing.JLabel();
        pCorrecto = new javax.swing.JPanel();

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

        btnRegresar.setBackground(new java.awt.Color(204, 0, 1));
        btnRegresar.setForeground(new java.awt.Color(204, 0, 1));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/siguienteTabla.png"))); // NOI18N
        btnRegresar.setToolTipText("REGRESAR");
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/siguienteTablaB.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jpTablas.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 455, -1, -1));

        lblAnuncio.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblAnuncio.setForeground(new java.awt.Color(204, 0, 1));
        lblAnuncio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnuncio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(lblAnuncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 640, 110));

        btn_Nuevo.setBackground(new java.awt.Color(204, 0, 1));
        btn_Nuevo.setForeground(new java.awt.Color(204, 0, 1));
        btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo_64.png"))); // NOI18N
        btn_Nuevo.setToolTipText("NUEVO");
        btn_Nuevo.setBorder(null);
        btn_Nuevo.setBorderPainted(false);
        btn_Nuevo.setContentAreaFilled(false);
        btn_Nuevo.setFocusPainted(false);
        btn_Nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Nuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo_48.png"))); // NOI18N
        btn_Nuevo.setRequestFocusEnabled(false);
        btn_Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NuevoMouseClicked(evt);
            }
        });
        jpTablas.add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 64, 64));

        btnNumRes1.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num1_64.png"))); // NOI18N
        btnNumRes1.setToolTipText("UNO");
        btnNumRes1.setBorder(null);
        btnNumRes1.setBorderPainted(false);
        btnNumRes1.setContentAreaFilled(false);
        btnNumRes1.setDefaultCapable(false);
        btnNumRes1.setFocusPainted(false);
        btnNumRes1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num1_48.png"))); // NOI18N
        btnNumRes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes1ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 270, 64, 64));

        btnNumRes2.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes2.setForeground(new java.awt.Color(204, 0, 1));
        btnNumRes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num2_64.png"))); // NOI18N
        btnNumRes2.setToolTipText("DOS");
        btnNumRes2.setBorder(null);
        btnNumRes2.setBorderPainted(false);
        btnNumRes2.setContentAreaFilled(false);
        btnNumRes2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes2.setPreferredSize(new java.awt.Dimension(64, 64));
        btnNumRes2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num2_48.png"))); // NOI18N
        btnNumRes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes2ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 270, -1, -1));

        btnNumRes3.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num3_64.png"))); // NOI18N
        btnNumRes3.setBorder(null);
        btnNumRes3.setBorderPainted(false);
        btnNumRes3.setContentAreaFilled(false);
        btnNumRes3.setFocusPainted(false);
        btnNumRes3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num3_48.png"))); // NOI18N
        btnNumRes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes3ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        btnNumRes4.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes4.setForeground(new java.awt.Color(204, 0, 1));
        btnNumRes4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num4_64.png"))); // NOI18N
        btnNumRes4.setToolTipText("CUATRO");
        btnNumRes4.setBorder(null);
        btnNumRes4.setBorderPainted(false);
        btnNumRes4.setContentAreaFilled(false);
        btnNumRes4.setFocusPainted(false);
        btnNumRes4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num4_48.png"))); // NOI18N
        btnNumRes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes4ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 270, -1, -1));

        btnNumRes5.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes5.setForeground(new java.awt.Color(204, 0, 1));
        btnNumRes5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num5_64.png"))); // NOI18N
        btnNumRes5.setToolTipText("CINCO");
        btnNumRes5.setBorder(null);
        btnNumRes5.setBorderPainted(false);
        btnNumRes5.setContentAreaFilled(false);
        btnNumRes5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes5.setPreferredSize(new java.awt.Dimension(64, 64));
        btnNumRes5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num5_48.png"))); // NOI18N
        btnNumRes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes5ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 270, -1, -1));

        btnNumRes6.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes6.setForeground(new java.awt.Color(204, 0, 1));
        btnNumRes6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num6_64.png"))); // NOI18N
        btnNumRes6.setToolTipText("SEIS");
        btnNumRes6.setBorder(null);
        btnNumRes6.setBorderPainted(false);
        btnNumRes6.setContentAreaFilled(false);
        btnNumRes6.setFocusPainted(false);
        btnNumRes6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num6_48.png"))); // NOI18N
        btnNumRes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes6ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 270, -1, -1));

        btnNumRes7.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes7.setForeground(new java.awt.Color(204, 0, 1));
        btnNumRes7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num7_64.png"))); // NOI18N
        btnNumRes7.setToolTipText("SIETE");
        btnNumRes7.setBorder(null);
        btnNumRes7.setBorderPainted(false);
        btnNumRes7.setContentAreaFilled(false);
        btnNumRes7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num7_48.png"))); // NOI18N
        btnNumRes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes7ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 270, -1, -1));

        btnNumRes8.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes8.setForeground(new java.awt.Color(204, 0, 1));
        btnNumRes8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num8_64.png"))); // NOI18N
        btnNumRes8.setBorder(null);
        btnNumRes8.setBorderPainted(false);
        btnNumRes8.setContentAreaFilled(false);
        btnNumRes8.setFocusPainted(false);
        btnNumRes8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num8_48.png"))); // NOI18N
        btnNumRes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes8ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        btnNumRes9.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes9.setForeground(new java.awt.Color(204, 0, 1));
        btnNumRes9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num9_64.png"))); // NOI18N
        btnNumRes9.setToolTipText("NUEVE");
        btnNumRes9.setBorder(null);
        btnNumRes9.setBorderPainted(false);
        btnNumRes9.setContentAreaFilled(false);
        btnNumRes9.setFocusPainted(false);
        btnNumRes9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num9_48.png"))); // NOI18N
        btnNumRes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes9ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 270, -1, -1));

        btnNumRes0.setBackground(new java.awt.Color(204, 0, 1));
        btnNumRes0.setForeground(new java.awt.Color(204, 0, 1));
        btnNumRes0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num0_64.png"))); // NOI18N
        btnNumRes0.setToolTipText("CERO");
        btnNumRes0.setBorder(null);
        btnNumRes0.setBorderPainted(false);
        btnNumRes0.setContentAreaFilled(false);
        btnNumRes0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNumRes0.setPreferredSize(new java.awt.Dimension(64, 64));
        btnNumRes0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num0_48.png"))); // NOI18N
        btnNumRes0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumRes0ActionPerformed(evt);
            }
        });
        jpTablas.add(btnNumRes0, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 270, -1, -1));

        btnIgual.setBackground(new java.awt.Color(204, 0, 1));
        btnIgual.setForeground(new java.awt.Color(204, 0, 1));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/igual_64.png"))); // NOI18N
        btnIgual.setToolTipText("IGUAL");
        btnIgual.setBorder(null);
        btnIgual.setBorderPainted(false);
        btnIgual.setContentAreaFilled(false);
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/igual_48.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jpTablas.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        txtRespuesta.setEditable(false);
        txtRespuesta.setColumns(3);
        txtRespuesta.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(255, 51, 0));
        txtRespuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRespuesta.setToolTipText("RESPUESTA");
        txtRespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRespuestaMouseClicked(evt);
            }
        });
        jpTablas.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 260, 50));

        lbl_Por.setBackground(new java.awt.Color(255, 0, 1));
        lbl_Por.setForeground(new java.awt.Color(255, 0, 1));
        lbl_Por.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Por.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/por_64.png"))); // NOI18N
        lbl_Por.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpTablas.add(lbl_Por, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        lbl_NumeroA0.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA0.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num0_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA1.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA1.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num1_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA2.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA2.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num2_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA3.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA3.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num3_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA4.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA4.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num4_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA5.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA5.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num5_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA6.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA6.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num6_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA7.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA7.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num7_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA8.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA8.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num8_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroA9.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA9.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroA9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroA9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num9_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lbl_NumeroB0.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB0.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num0_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB1.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB1.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num1_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB2.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB2.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num2_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB3.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB3.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num3_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB4.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB4.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num4_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB5.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB5.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num5_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB6.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB6.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num6_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB7.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB7.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num7_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB8.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB8.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num8_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        lbl_NumeroB9.setBackground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB9.setForeground(new java.awt.Color(255, 0, 1));
        lbl_NumeroB9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumeroB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Num9_64.png"))); // NOI18N
        jpTablas.add(lbl_NumeroB9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        t1_lbl_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        t1_lbl_Titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        t1_lbl_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        t1_lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1_lbl_Titulo.setText("Tabla de Multiplicar");
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
        jpPrincipal.add(pCorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        getContentPane().add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir_TablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir_TablasMouseClicked
        this.setVisible(false);
        menu m = new menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnSalir_TablasMouseClicked


    private void btnSalir_TablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir_TablasActionPerformed

    }//GEN-LAST:event_btnSalir_TablasActionPerformed

    private void btn_NuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NuevoMouseClicked
        lbl_NumeroA0.setVisible(false); lbl_NumeroA1.setVisible(false);
        lbl_NumeroA2.setVisible(false); lbl_NumeroA3.setVisible(false);
        lbl_NumeroA4.setVisible(false); lbl_NumeroA5.setVisible(false);
        lbl_NumeroA6.setVisible(false); lbl_NumeroA7.setVisible(false);
        lbl_NumeroA8.setVisible(false); lbl_NumeroA9.setVisible(false);
        lbl_NumeroB0.setVisible(false); lbl_NumeroB1.setVisible(false);
        lbl_NumeroB2.setVisible(false); lbl_NumeroB3.setVisible(false);
        lbl_NumeroB4.setVisible(false); lbl_NumeroB5.setVisible(false);
        lbl_NumeroB6.setVisible(false); lbl_NumeroB7.setVisible(false);
        lbl_NumeroB8.setVisible(false); lbl_NumeroB9.setVisible(false);
        lbl_Por.setVisible(true); 
        int randomA, randomB;
        Random numero = new Random();
        randomA = numero.nextInt(10);
        String numRandomA = Integer.toString(randomA);
        randomB = numero.nextInt(10);
        String numRandomB = Integer.toString(randomB);
        switch (numRandomA) {
            case "0":
                lbl_NumeroA0.setVisible(true);
                numeroA = 0;
                break;
            case "1":
                lbl_NumeroA1.setVisible(true);
                numeroA = 1;
                break;
            case "2":
                lbl_NumeroA2.setVisible(true);
                numeroA = 2;
                break;
            case "3":
                lbl_NumeroA3.setVisible(true);
                numeroA = 3;
                break;
            case "4":
                lbl_NumeroA4.setVisible(true);
                numeroA = 4;
                break;
            case "5":
                lbl_NumeroA5.setVisible(true);
                numeroA = 5;
                break;
            case "6":
                lbl_NumeroA6.setVisible(true);
                numeroA = 6;
                break;
            case "7":
                lbl_NumeroA7.setVisible(true);
                numeroA = 7;
                break;
            case "8":
                lbl_NumeroA8.setVisible(true);
                numeroA = 8;
                break;
            case "9":
                lbl_NumeroA9.setVisible(true);
                numeroA = 9;
                break;
            default:
                JOptionPane.showMessageDialog(jpTablas, "No es un numero entre 0 y 9", "ERROR EN GENERACIÓN DE RANDOM", JOptionPane.ERROR_MESSAGE);
        }
        switch (numRandomB) {
            case "0":
                lbl_NumeroB0.setVisible(true);
                numeroB = 0;
                break;
            case "1":
                lbl_NumeroB1.setVisible(true);
                numeroB = 1;
                break;
            case "2":
                lbl_NumeroB2.setVisible(true);
                numeroB = 2;
                break;
            case "3":
                lbl_NumeroB3.setVisible(true);
                numeroB = 3;
                break;
            case "4":
                lbl_NumeroB4.setVisible(true);
                numeroB = 4;
                break;
            case "5":
                lbl_NumeroB5.setVisible(true);
                numeroB = 5;
                break;
            case "6":
                lbl_NumeroB6.setVisible(true);
                numeroB = 6;
                break;
            case "7":
                lbl_NumeroB7.setVisible(true);
                numeroB = 7;
                break;
            case "8":
                lbl_NumeroB8.setVisible(true);
                numeroB = 8;
                break;
            case "9":
                lbl_NumeroB9.setVisible(true);
                numeroB = 9;
                break;
            default:
                JOptionPane.showMessageDialog(jpTablas, "No es un numero entre 0 y 9", "ERROR EN GENERACIÓN DE RANDOM", JOptionPane.ERROR_MESSAGE);
        }

        btn_Nuevo.setVisible(false); btnNumRes1.setVisible(true); btnNumRes2.setVisible(true); btnNumRes3.setVisible(true);
        btnNumRes4.setVisible(true); btnNumRes5.setVisible(true); btnNumRes6.setVisible(true); btnNumRes7.setVisible(true);
        btnNumRes8.setVisible(true); btnNumRes9.setVisible(true); btnNumRes0.setVisible(true); btnIgual.setVisible(true);
        
    }//GEN-LAST:event_btn_NuevoMouseClicked

    private void btnNumRes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes1ActionPerformed
        numero += "1";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes1ActionPerformed

    private void txtRespuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRespuestaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaMouseClicked

    private void btnNumRes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes2ActionPerformed
        numero += "2";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes2ActionPerformed

    private void btnNumRes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes3ActionPerformed
        numero += "3";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes3ActionPerformed

    private void btnNumRes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes4ActionPerformed
        numero += "4";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes4ActionPerformed

    private void btnNumRes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes5ActionPerformed
        numero += "5";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes5ActionPerformed

    private void btnNumRes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes6ActionPerformed
        numero += "6";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes6ActionPerformed

    private void btnNumRes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes7ActionPerformed
        numero += "7";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes7ActionPerformed

    private void btnNumRes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes8ActionPerformed
        numero += "8";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes8ActionPerformed

    private void btnNumRes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes9ActionPerformed
        numero += "9";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes9ActionPerformed

    private void btnNumRes0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumRes0ActionPerformed
        numero += "0";
        txtRespuesta.setText(numero);
    }//GEN-LAST:event_btnNumRes0ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
          respuesta = Integer.parseInt(txtRespuesta.getText());
        System.out.println("respuesta del usuario: "+respuesta);
        if (txtRespuesta.getText().equals("")) {
            JOptionPane.showMessageDialog(jpTablas, "No puede estar vacio!!! escriba su respuesta por favor", "ERROR EN RESPUESTA", JOptionPane.ERROR_MESSAGE);
        } else if (!txtRespuesta.getText().equals("")) {
//            if (JOptionPane.showConfirmDialog(jpPrincipal, "Esta Seguro de su respuesta") == JOptionPane.YES_OPTION) {
            contador = numeroA * numeroB;
            System.out.println("Resultado de la multiplicacion: " + contador);
            if (respuesta == contador) {
                System.out.println("respuesta correcta");
                lbl_NumeroA0.setVisible(false); lbl_NumeroA1.setVisible(false);
                lbl_NumeroA2.setVisible(false); lbl_NumeroA3.setVisible(false); lbl_NumeroA4.setVisible(false);
                lbl_NumeroA5.setVisible(false); lbl_NumeroA6.setVisible(false); lbl_NumeroA7.setVisible(false);
                lbl_NumeroA8.setVisible(false); lbl_NumeroA9.setVisible(false); lbl_NumeroB0.setVisible(false);
                lbl_NumeroB1.setVisible(false); lbl_NumeroB2.setVisible(false); lbl_NumeroB3.setVisible(false);
                lbl_NumeroB4.setVisible(false); lbl_NumeroB5.setVisible(false); lbl_NumeroB6.setVisible(false);
                lbl_NumeroB7.setVisible(false); lbl_NumeroB8.setVisible(false); lbl_NumeroB9.setVisible(false);
                lbl_Por.setVisible(false); btn_Nuevo.setVisible(true); 
                numero = "";
                txtRespuesta.setText(vacio);
                correcto correcto = new correcto();
                correcto.setVisible(true);
            } else {
                System.out.println("respuesta INCORRECTA!!!!");
                btnIgual.setVisible(true);
                txtRespuesta.setVisible(true);
                error error = new error();
                error.setVisible(true);
                txtRespuesta.setText("");
                numero = "";
            }
        } else {
            this.setVisible(true);
        }
//        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        if(lblAnuncio.getText().equals("<html><center>!!! RESPUESTA INCORRECTA <br> VERIFICA POR FAVOR ¡¡¡</center></html>")){
            System.out.println("INCORRECTO"); 
            btnRegresar.setVisible(false);
            //lblRespuestaIncorrecta.setVisible(false);
            lblAnuncio.setText("");
            txtRespuesta.setText("");
            numero="";
        }else{
            System.out.println("CORRECTO");
            btnRegresar.setVisible(false);
            //lblRespuestaCorrecta.setVisible(false);
            lblAnuncio.setText("");
            txtRespuesta.setText("");
            numero="";
        }
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnNumRes0;
    private javax.swing.JButton btnNumRes1;
    private javax.swing.JButton btnNumRes2;
    private javax.swing.JButton btnNumRes3;
    private javax.swing.JButton btnNumRes4;
    private javax.swing.JButton btnNumRes5;
    private javax.swing.JButton btnNumRes6;
    private javax.swing.JButton btnNumRes7;
    private javax.swing.JButton btnNumRes8;
    private javax.swing.JButton btnNumRes9;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir_Tablas;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTablas;
    private javax.swing.JLabel lblAnuncio;
    private javax.swing.JLabel lbl_NumeroA0;
    private javax.swing.JLabel lbl_NumeroA1;
    private javax.swing.JLabel lbl_NumeroA2;
    private javax.swing.JLabel lbl_NumeroA3;
    private javax.swing.JLabel lbl_NumeroA4;
    private javax.swing.JLabel lbl_NumeroA5;
    private javax.swing.JLabel lbl_NumeroA6;
    private javax.swing.JLabel lbl_NumeroA7;
    private javax.swing.JLabel lbl_NumeroA8;
    private javax.swing.JLabel lbl_NumeroA9;
    private javax.swing.JLabel lbl_NumeroB0;
    private javax.swing.JLabel lbl_NumeroB1;
    private javax.swing.JLabel lbl_NumeroB2;
    private javax.swing.JLabel lbl_NumeroB3;
    private javax.swing.JLabel lbl_NumeroB4;
    private javax.swing.JLabel lbl_NumeroB5;
    private javax.swing.JLabel lbl_NumeroB6;
    private javax.swing.JLabel lbl_NumeroB7;
    private javax.swing.JLabel lbl_NumeroB8;
    private javax.swing.JLabel lbl_NumeroB9;
    private javax.swing.JLabel lbl_Por;
    private javax.swing.JPanel pCorrecto;
    private javax.swing.JLabel t1_lbl_Leon1;
    private javax.swing.JLabel t1_lbl_Leon2;
    private javax.swing.JLabel t1_lbl_Leon3;
    private javax.swing.JLabel t1_lbl_Leon4;
    private javax.swing.JLabel t1_lbl_Leon5;
    private javax.swing.JLabel t1_lbl_Leon6;
    private javax.swing.JLabel t1_lbl_Titulo;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
