/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 50488
 */
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class pantalla_registro extends javax.swing.JFrame {

    /**
     * Creates new form pantalla_registro
     */
    public pantalla_registro() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Genero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        FECHA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        EDAD = new javax.swing.JTextField();
        REGISTRO = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        contra = new javax.swing.JPasswordField();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/descarga.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel2.setText("REGISTRO TWIT");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese su nombre:");

        NOMBRE.setBackground(new java.awt.Color(204, 255, 255));
        NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese su usuario:");

        user.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setText("Ingrese su genero:");

        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre" }));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel6.setText("FECHA:");

        FECHA.setBackground(new java.awt.Color(204, 255, 255));
        FECHA.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Generar fecha actual");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese su edad:");

        EDAD.setBackground(new java.awt.Color(204, 255, 255));

        REGISTRO.setBackground(new java.awt.Color(204, 255, 255));
        REGISTRO.setText("Registrar");
        REGISTRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTROMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña: ");

        contra.setBackground(new java.awt.Color(204, 255, 255));

        volver.setBackground(new java.awt.Color(204, 255, 255));
        volver.setText("VOLVER");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel2)
                .addGap(0, 405, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel8)))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(NOMBRE)
                    .addComponent(contra)
                    .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jButton1))
                    .addComponent(EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FECHA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        LocalDate fechaActual = LocalDate.now();
        String fecha = fechaActual.toString();
        FECHA.setText(fecha);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void REGISTROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTROMouseClicked

        String nombre = NOMBRE.getText();
        String usuario = user.getText().trim();
        String contraseña = contra.getText().trim();
        String fechas = FECHA.getText();
        String edad = EDAD.getText();
        int gener = Genero.getSelectedIndex();
        String genero = Genero.getItemAt(gener);
        UsuarioInfo.verificar_cuenta(usuario);
        

        try {
            int Edad = Integer.parseInt(EDAD.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INGRESAR VALORES ENTEROS EN LA EDAD");
            return;
        }

        if (nombre.isEmpty() || usuario.isEmpty() || contraseña.isEmpty() || fechas.isEmpty() || edad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos solicitados");
        } else {
            if (UsuarioInfo.verificar_cuenta(usuario)) {
                JOptionPane.showMessageDialog(null, "el usuario ya esta en uso");
            } else {
                UsuarioInfo cuenta = new UsuarioInfo(usuario, nombre, edad, fechas, contraseña, genero);

                UsuarioInfo.agregarCuenta(cuenta);
                user_actual.setUsuarioActual(cuenta);

                NOMBRE.setText("");
                user.setText("");
                contra.setText("");
                FECHA.setText("");
                EDAD.setText("");
                JOptionPane.showMessageDialog(null, "Cuenta registrada exitosamente: " + "\n"
                        + "Nombre: " + nombre + "\n"
                        + "Usuario: " + usuario + "\n"
                        + "Fecha: " + fechas + "\n"
                        + "Edad: " + edad + "\n"
                        + "contra: " + contraseña
                        + "\n genero: " + genero);

                menu_principal menu = new menu_principal();
                menu.setVisible(true);
                this.dispose();
                
                
                

            }
        }


    }//GEN-LAST:event_REGISTROMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        Visual_Inicio inicio = new Visual_Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EDAD;
    private javax.swing.JLabel FECHA;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JButton REGISTRO;
    private javax.swing.JPasswordField contra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField user;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}
/*
 user_info.nombres[user_info.contador] = NOMBRE.getText();
            user_info.usuarios[user_info.contador] = usuario.getText();
            user_info.contraseñas[user_info.contador] = new String(contraseña.getPassword());
            user_info.fechas[user_info.contador] = FECHA.getText();
            user_info.edades[user_info.contador] = Integer.parseInt(edad.getText());

            user_info.contador++;
 */
