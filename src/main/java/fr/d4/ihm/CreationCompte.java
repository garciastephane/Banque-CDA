package fr.d4.ihm;

import javax.swing.JFrame;

public class CreationCompte extends javax.swing.JFrame {

   
        /**
         * Creates new form RegisterForm
         */
        public CreationCompte() {
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jPanel3 = new javax.swing.JPanel();
            jPanel1 = new javax.swing.JPanel();
            jLabelMn = new javax.swing.JLabel();
            jLabelClose = new javax.swing.JLabel();
            jTextField2 = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            jButton2 = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jButtonRegister = new javax.swing.JButton();
            jLabel6 = new javax.swing.JLabel();
            jComboBox2 = new javax.swing.JComboBox<>();

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 100, Short.MAX_VALUE)
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);

            jPanel1.setBackground(new java.awt.Color(242, 120, 75));

//            jLabelMn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
//            jLabelMn.setForeground(new java.awt.Color(255, 255, 255));
//            jLabelMn.setText("-");
//            jLabelMn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//            jLabelMn.addMouseListener(new java.awt.event.MouseAdapter() {
//                public void mouseClicked(java.awt.event.MouseEvent evt) {
//                    jLabelMnMouseClicked(evt);
//                }
//            });

//            jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
//            jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
//            jLabelClose.setText("X");
//            jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//            jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
//                public void mouseClicked(java.awt.event.MouseEvent evt) {
//                    jLabelCloseMouseClicked(evt);
//                }
//            });

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLabel1.setText("LCR");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(170, 170, 170)
                            .addComponent(jLabelMn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelClose)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68))))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClose)
                            .addComponent(jLabelMn))
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE))
            );

            jPanel2.setBackground(new java.awt.Color(51, 110, 123));

            jButton2.setBackground(new java.awt.Color(241, 71, 71));
            jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("Cancel");

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Cr�ation Compte");

            jButtonRegister.setBackground(new java.awt.Color(34, 167, 240));
            jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
            jButtonRegister.setText("Valider");
            jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jButtonRegisterMouseClicked(evt);
                }
            });
            jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonRegisterActionPerformed(evt);
                }
            });

            jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(236, 240, 241));
            jLabel6.setText("Voulez vous cr�er :");

            jComboBox2.setBackground(new java.awt.Color(22, 160, 133));
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compte Courant", "Livret A", "Plan Epargne Logement" }));
            jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonRegister))
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(83, 83, 83))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(152, 152, 152))))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(62, 62, 62)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(87, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            pack();
        }// </editor-fold>                        

        private void jLabelMnMouseClicked(java.awt.event.MouseEvent evt) {                                      

            this.setState(JFrame.ICONIFIED);
        }                                     

        private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {                                         

            System.exit(0);
        }                                        

        private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {                                                

        }                                               

        private void jButtonRegisterMouseClicked(java.awt.event.MouseEvent evt) {                                             
            // TODO add your handling code here:
        }                                            

        private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            // TODO add your handling code here:
        }                                          

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
                java.util.logging.Logger.getLogger(CreationCompte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(CreationCompte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(CreationCompte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(CreationCompte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CreationCompte().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButtonRegister;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabelClose;
        private javax.swing.JLabel jLabelMn;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JTextField jTextField2;
        // End of variables declaration                   
    }


