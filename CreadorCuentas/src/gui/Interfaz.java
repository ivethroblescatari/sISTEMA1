package gui;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.*;
public class Interfaz extends javax.swing.JFrame {
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Creación de Cuentas");        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPasswordField1 = new javax.swing.JPasswordField();
        label2 = new java.awt.Label();
        jPasswordField2 = new javax.swing.JPasswordField();
        label3 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        label1.setText("Nombre de Usuario:");

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        label2.setText("Contraseña");

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });

        label3.setText("Repetir Contraseña");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 0));
        jButton1.setText("Crear Cuenta");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2)
                            .addComponent(jTextField1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        crear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getExtendedKeyCode()==evt.VK_ENTER)
            jTextField1.transferFocus();
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getExtendedKeyCode()==evt.VK_ENTER)
            jPasswordField1.transferFocus();
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if(evt.getExtendedKeyCode()==evt.VK_ENTER)
            crear();
    }//GEN-LAST:event_jPasswordField2KeyPressed
    
    private void crear(){
        if((jPasswordField1.getText().equals(""))&&(jPasswordField2.getText().equals(""))&&(jTextField1.getText().equals(""))){
            JOptionPane.showMessageDialog(rootPane, "Debe Ingresar todos los Valores");
        }else{
            int sel = con.nSeleccionados("select * from `cuenta` where `nombre`='"+jTextField1.getText()+"';");
            if(sel == 1){
                JOptionPane.showMessageDialog(rootPane, "El Nombre: "+jTextField1.getText()+" está siendo utilizado por otro usuario\n ingrese otro nombre de usuario");
            }else{
                if(jPasswordField1.getText().equals(jPasswordField2.getText())){
                    int select = JOptionPane.showOptionDialog(
                    null,"¿Desea dar permisos de ingreso al usuario: "+jTextField1.getText(),
                    "Seleccione una opción",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,new Object[] { "Si", "No"}, "Si");
                    if(select != -1)
                        if((select +1)==1){
                            crearDB(crearCuenta(jTextField1.getText(),jPasswordField1.getText()));
                            JOptionPane.showMessageDialog(rootPane, "La cuenta fue creada satisfactoriamente");
                            System.exit(0);
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "La cuenta no fue creada");                
                            System.exit(0);
                        }
                }else{         
                    JOptionPane.showMessageDialog(rootPane, "La confirmación de Contraseña es diferente a la Contraseña Ingresada");
            
                }
            }
        }
    }
    private String crearCuenta(String user, String pass){
        int id = con.ultimo("cuenta", "id")+1;
        String db = id+"_"+user;
        try {
            con.query("INSERT INTO `cuenta`(`id`,`nombre`,`pass`,`estado`,`db`) VALUES ( '"
                    + id+"','"
                    + user+"','"
                    + SHA1.getHash(pass)+"','"
                    + 1+"','"
                    + db+"');");
            con.query("CREATE DATABASE `"+db+"`;");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return db;
    }
    private void crearDB(String db){
        con = new db.Conexion(user,pass,db,dir);
        con.query("CREATE TABLE `alumno`(`id` INT NOT NULL,`id_mat` INT NOT NULL,`nombres` VARCHAR(60),`apellidos` VARCHAR(60), `estado` VARCHAR(10), PRIMARY KEY (`id`,`id_mat`)); ");
        con.query("CREATE TABLE `materia`( `id` INT NOT NULL,	`nombre` VARCHAR(60),PRIMARY KEY (`id`));");
        con.query("CREATE TABLE `avance`(`id` INT NOT NULL,`id_mat` INT NOT NULL , `titulo` VARCHAR(100), `id_blo` INT, PRIMARY KEY (`id`));");
        con.query("CREATE TABLE `evaluacion`(`id_gru` INT NOT NULL,`id_mat` INT NOT NULL,`id_ava` INT NOT NULL, 	  `id_blo` INT NOT NULL,`id_alu` INT NOT NULL,`nota` INT , PRIMARY KEY (`id_gru`,`id_mat`,`id_ava`,`id_blo`,`id_alu`)); ");
        con.query("CREATE TABLE `grupo`( `id` INT NOT NULL, `tipo` VARCHAR(60), PRIMARY KEY (`id`));");
        con.query("CREATE TABLE `control`( `fecha` DATE NOT NULL , `id_alu` INT NOT NULL , `estado` VARCHAR(10) NOT NULL DEFAULT 'presente' , `id_blo` INT NOT NULL ,PRIMARY KEY (`fecha`, `id_alu`)); ");
        con.query("CREATE TABLE `bloque`( `id` INT NOT NULL , `nombre` VARCHAR(60) , PRIMARY KEY (`id`) );");
        con.query("ALTER TABLE `alumno` ADD CONSTRAINT `FK_materia_alumno` FOREIGN KEY (`id_mat`) REFERENCES `materia` (`id`);");
        con.query("ALTER TABLE `evaluacion` ADD CONSTRAINT `FK_evaluacion_grupo` FOREIGN KEY (`id_gru`) REFERENCES `grupo` (`id`); ");
        con.query("ALTER TABLE `evaluacion` ADD CONSTRAINT `FK_evaluacion_alumno` FOREIGN KEY (`id_alu`) REFERENCES `alumno` (`id`);");
        con.query("ALTER TABLE `control` ADD CONSTRAINT `FK_control_alumno` FOREIGN KEY (`id_alu`) REFERENCES `alumno` (`id`);");
        con.query("ALTER TABLE `evaluacion` ADD CONSTRAINT `FK_evaluacion_bloque` FOREIGN KEY (`id_blo`) REFERENCES `bloque` (`id`);");
        con.query("ALTER TABLE `evaluacion` ADD CONSTRAINT `FK_evaluacion_avance` FOREIGN KEY (`id_ava`) REFERENCES `avance` (`id`);");
        con.query("ALTER TABLE `control` ADD CONSTRAINT `FK_control_bloque` FOREIGN KEY (`id_blo`) REFERENCES `bloque` (`id`);");
        con.query("ALTER TABLE `avance` ADD CONSTRAINT `FK_avance_bloque` FOREIGN KEY (`id_blo`) REFERENCES `bloque` (`id`);");
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
    private String user = archivo.cuenta();
    private String pass = archivo.pass();
    private String db = archivo.db();
    private String dir = archivo.url();
    private db.Conexion con = new db.Conexion(user,pass,db,dir);
}
