package uabc.RecolectorCriteriosInterfaz;

import uabc.CalificacionAnalisis.Calcular;
import uabc.CalificacionAnalisis.Revisar;
import uabc.RetroalimentacionTarea.Analisis;
import uabc.RetroalimentacionTarea.Mensaje;

/**
 *
 * @author Princ
 */
public class FormularioGuia extends javax.swing.JFrame {

    /**
     * Creates new form FormularioGuia
     */
    
    SelectorArchivoTarea arc = new SelectorArchivoTarea();
    String direccion = "";
    String tipo = ""; 
    int extension = 0; 
    String mensaje = "";
    public FormularioGuia() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BuscarArchivo = new javax.swing.JButton();
        resumen = new javax.swing.JCheckBox();
        ensayo = new javax.swing.JCheckBox();
        preguntas = new javax.swing.JCheckBox();
        ext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tema = new javax.swing.JTextField();
        BotonCalificador = new javax.swing.JButton();
        msj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Calificador Automático");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Formulario guía para el docente");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Tipo de tarea:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("Extensión en palabras: ");

        BuscarArchivo.setBackground(new java.awt.Color(0, 102, 102));
        BuscarArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BuscarArchivo.setForeground(new java.awt.Color(255, 255, 255));
        BuscarArchivo.setText("Seleccionar tarea");
        BuscarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarArchivoActionPerformed(evt);
            }
        });

        resumen.setText("Resumen");

        ensayo.setText("Ensayo");

        preguntas.setText("Preguntas Abiertas");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Tema: ");

        BotonCalificador.setBackground(new java.awt.Color(0, 102, 102));
        BotonCalificador.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonCalificador.setForeground(new java.awt.Color(255, 255, 255));
        BotonCalificador.setText("Calificar");
        BotonCalificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalificadorActionPerformed(evt);
            }
        });

        msj.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        msj.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ext, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(resumen)
                                            .addGap(18, 18, 18)
                                            .addComponent(ensayo)
                                            .addGap(18, 18, 18)
                                            .addComponent(preguntas)))
                                    .addGap(110, 110, 110)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonCalificador)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BuscarArchivo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(msj, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(resumen)
                    .addComponent(ensayo)
                    .addComponent(preguntas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarArchivo))
                .addGap(32, 32, 32)
                .addComponent(BotonCalificador)
                .addGap(28, 28, 28)
                .addComponent(msj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botón para llamar a un JFrame que lee la dirección del archivo
    private void BuscarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarArchivoActionPerformed
        arc.setVisible(true);
    }//GEN-LAST:event_BuscarArchivoActionPerformed

    //Botón para iniciar el proceso de calificación y retroalimentación
    private void BotonCalificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalificadorActionPerformed
        direccion = arc.direccion;
        if (resumen.isSelected()){
            tipo = "resumen"; 
        } else if (ensayo.isSelected()){
            tipo = "ensayo"; 
        } else if (preguntas.isSelected()){
            tipo = "preguntas"; 
        }
        extension = Integer.parseInt(ext.getText());
        Revisar r = new Revisar();
        Calcular c = new Calcular();
        Analisis a = new Analisis();
        Mensaje m = new Mensaje(); 
        mensaje = m.mensaje(a.analisis(c.Calificacion(r.cumplimientoTipo(tipo, direccion), r.cumplimientoExtension(extension, direccion))),tema.getText());
        msj.setText(mensaje);
        //src/main/java/uabc/RecolectorCriteriosInterfaz/tareas/resumen.txt
    }//GEN-LAST:event_BotonCalificadorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioGuia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioGuia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalificador;
    private javax.swing.JButton BuscarArchivo;
    private javax.swing.JCheckBox ensayo;
    private javax.swing.JTextField ext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel msj;
    private javax.swing.JCheckBox preguntas;
    private javax.swing.JCheckBox resumen;
    private javax.swing.JTextField tema;
    // End of variables declaration//GEN-END:variables
}
