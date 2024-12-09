/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.csye7374.views;

import edu.neu.csye7374.fileUtil.GeneralFileUtil;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AgreementHistory extends javax.swing.JPanel {

    private String AGREEMENTS_FILE_NAME = "AgreementsData.csv";
    private static AgreementHistory instance = null;

    /**
     * Creates new form AgreementHistory
     */
    public AgreementHistory() {
        initComponents();
        loadData();
    }
    
    public static AgreementHistory getInstance() {
        if (instance == null) {
            instance = new AgreementHistory();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        agreementHistoryTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(793, 581));

        agreementHistoryTable.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Apartment Address", "Category", "Mgmt Name", "Sale type", "Handover Method", "Agreement Cost", "Handover Cost", "Discount Type", "Discount Price", "Final Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(agreementHistoryTable);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Previous Agreement History");

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(refreshBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshBtn)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable agreementHistoryTable;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
    
    private void loadData() {
        List<String> rawData = GeneralFileUtil.readFile(AGREEMENTS_FILE_NAME);
        DefaultTableModel model = (DefaultTableModel) agreementHistoryTable.getModel();
        model.setRowCount(0);
        for (String line : rawData) {
            Object[] row = new Object[10];

            String[] apartmentString = line.split(",");
            int i;
            for (i = 0; i < 10; i++) {
                if(i==4){
                    if(apartmentString[i].strip().equals("In_Person")){
                        row[i] = "In Person";
                    } else {
                        row[i] = "Digital";
                    }
                    continue;
                }
                if(i==7){
                    String val = "";
                    switch(apartmentString[i].strip()){
                        case "FamilyOfferStrategy":
                            val = "Family Discount";
                            break;
                        case "NewMemberOfferStrategy":
                            val = "New Member Discount";
                            break;
                        case "PromotionalStrategy":
                            val = "Promotional Discount";
                            break;
                        case "StudentOfferStrategy":
                            val = "Student Discount";
                            break;
                        default:
                            val = "None";
                    }
                    row[i] = val; 
                    continue;
                }
                row[i] = apartmentString[i];
            }

            model.addRow(row);
        }
        
    }

}