/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline.reservation.system;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author AMAN
 */
public class TicketBooking extends javax.swing.JFrame {

    /**
     * Creates new form TicketBooking
     */
    public TicketBooking() {
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

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        fromCB = new javax.swing.JComboBox<>();
        From = new javax.swing.JLabel();
        Upto = new javax.swing.JLabel();
        uptoCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        BookBTN = new javax.swing.JButton();
        ResetBTN = new javax.swing.JButton();
        Date = new javax.swing.JLabel();
        HomeBTN = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(854, 480));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Airline Ticket Booking ");

        fromCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangkok", "Beijing", "Cairo", "Dhaka", "Florida", "Kolkata", "Mumbai", "New Delhi", "São Paulo", "Shanghai", "Texas", "Tokyo" }));
        fromCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromCBActionPerformed(evt);
            }
        });

        From.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        From.setForeground(new java.awt.Color(102, 102, 102));
        From.setText("From");

        Upto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Upto.setForeground(new java.awt.Color(102, 102, 102));
        Upto.setText("Upto");

        uptoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangkok", "Beijing", "Cairo", "Dhaka", "Florida", "Kolkata", "Mumbai", "New Delhi", "São Paulo", "Shanghai", "Texas", "Tokyo" }));
        uptoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uptoCBActionPerformed(evt);
            }
        });

        BookBTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BookBTN.setForeground(new java.awt.Color(102, 102, 102));
        BookBTN.setText("Book");
        BookBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBTNActionPerformed(evt);
            }
        });

        ResetBTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ResetBTN.setForeground(new java.awt.Color(102, 102, 102));
        ResetBTN.setText("Reset");
        ResetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBTNActionPerformed(evt);
            }
        });

        Date.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(102, 102, 102));
        Date.setText("Journey Date");

        HomeBTN.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        HomeBTN.setForeground(new java.awt.Color(102, 102, 102));
        HomeBTN.setText("Home");
        HomeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBTNActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(BookBTN)
                        .addGap(25, 25, 25)
                        .addComponent(ResetBTN)
                        .addGap(41, 41, 41)
                        .addComponent(HomeBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Date)
                                .addGap(10, 10, 10)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fromCB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(Upto)
                                .addGap(18, 18, 18)
                                .addComponent(uptoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(fromCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Upto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(uptoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookBTN)
                    .addComponent(ResetBTN)
                    .addComponent(HomeBTN)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromCBActionPerformed

    private void uptoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uptoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uptoCBActionPerformed

    private void BookBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBTNActionPerformed
        // TODO add your handling code here:
        //getting item from jcombobox1;
        String SelectedValue1=fromCB.getSelectedItem().toString();
        String SelectedValue2=uptoCB.getSelectedItem().toString();
        
        
        
        Date journeydate= jDateChooser1.getDate();
        
        String strDate = DateFormat.getDateInstance().format(journeydate);
        
        System.out.println(SelectedValue1);
        
        
        
        
        
        
        
     
        
        
        
        
    }//GEN-LAST:event_BookBTNActionPerformed

    private void ResetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBTNActionPerformed

    private void HomeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBTNActionPerformed
        // TODO add your handling code here:
        dispose();
        MainScreen ms= new MainScreen();
        ms.setVisible(true);
       
    }//GEN-LAST:event_HomeBTNActionPerformed

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookBTN;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel From;
    private javax.swing.JButton HomeBTN;
    private javax.swing.JButton ResetBTN;
    private javax.swing.JLabel Upto;
    private javax.swing.JComboBox<String> fromCB;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> uptoCB;
    // End of variables declaration//GEN-END:variables
}
