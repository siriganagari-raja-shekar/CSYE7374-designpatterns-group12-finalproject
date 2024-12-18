/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye7374.views;

import javax.swing.JSplitPane;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        AddMgmtPanel mgmtPanel = AddMgmtPanel.getInstance();
        mgmtPanel.setMainFrame(this);
        mainSplitPanel.setRightComponent(mgmtPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainSplitPanel = new JSplitPane();
        MenuPanel = new javax.swing.JPanel();
        addApartments = new javax.swing.JButton();
        addManagements = new javax.swing.JButton();
        agreementHistoryBtn = new javax.swing.JButton();
        agreementBtn = new javax.swing.JButton();
        addBrokers = new javax.swing.JButton();
        MainContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addApartments.setText("Add Apartments");
        addApartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addApartmentsActionPerformed(evt);
            }
        });

        addManagements.setText("Add Managements");
        addManagements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManagementsActionPerformed(evt);
            }
        });

        agreementHistoryBtn.setText("Agreement History");
        agreementHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreementHistoryBtnActionPerformed(evt);
            }
        });

        agreementBtn.setText("Agreement");
        agreementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreementBtnActionPerformed(evt);
            }
        });

        addBrokers.setText("Add Brokers");
        addBrokers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBrokersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addApartments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addManagements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agreementHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agreementBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBrokers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addManagements)
                .addGap(18, 18, 18)
                .addComponent(addApartments)
                .addGap(18, 18, 18)
                .addComponent(agreementBtn)
                .addGap(18, 18, 18)
                .addComponent(agreementHistoryBtn)
                .addGap(18, 18, 18)
                .addComponent(addBrokers)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        mainSplitPanel.setLeftComponent(MenuPanel);

        javax.swing.GroupLayout MainContentPanelLayout = new javax.swing.GroupLayout(MainContentPanel);
        MainContentPanel.setLayout(MainContentPanelLayout);
        MainContentPanelLayout.setHorizontalGroup(
            MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        MainContentPanelLayout.setVerticalGroup(
            MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        mainSplitPanel.setRightComponent(MainContentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSplitPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSplitPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addApartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addApartmentsActionPerformed
        // TODO add your handling code here:
        AddApartmentsPanel addApartmentsPanel= AddApartmentsPanel.getInstance();
        addApartmentsPanel.setMainFrame(this);
        mainSplitPanel.setRightComponent(addApartmentsPanel);
    }//GEN-LAST:event_addApartmentsActionPerformed

    private void addManagementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManagementsActionPerformed
        // TODO add your handling code here:
        AddMgmtPanel mgmtPanel = AddMgmtPanel.getInstance();
        mgmtPanel.loadData();
        mgmtPanel.setMainFrame(this);
        mainSplitPanel.setRightComponent(mgmtPanel);
        
    }//GEN-LAST:event_addManagementsActionPerformed

    private void agreementHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreementHistoryBtnActionPerformed
        // TODO add your handling code here:
        AgreementHistory agreementHistoryPanel = AgreementHistory.getInstance();
        mainSplitPanel.setRightComponent(agreementHistoryPanel);
    }//GEN-LAST:event_agreementHistoryBtnActionPerformed

    private void agreementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreementBtnActionPerformed
        // TODO add your handling code here:
        AgreementPanel agreementPanel = AgreementPanel.getInstance();
        agreementPanel.setMainFrame(this);
        mainSplitPanel.setRightComponent(agreementPanel);
    }//GEN-LAST:event_agreementBtnActionPerformed

    private void addBrokersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBrokersActionPerformed
        // TODO add your handling code here:
        AddBrokerPanel brokerPanel = AddBrokerPanel.getInstance();
        mainSplitPanel.setRightComponent(brokerPanel);
    }//GEN-LAST:event_addBrokersActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainContentPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton addApartments;
    private javax.swing.JButton addBrokers;
    private javax.swing.JButton addManagements;
    private JSplitPane mainSplitPanel;
    private javax.swing.JButton agreementBtn;
    private javax.swing.JButton agreementHistoryBtn;
    // End of variables declaration//GEN-END:variables

    public JSplitPane getMainSplitPanel() {
        return mainSplitPanel;
    }
}