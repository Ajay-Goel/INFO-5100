/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarProfile;
import Business.CarProfileHistory;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajaygoel
 */
public class BookCab extends javax.swing.JPanel {
    
    private CarProfileHistory cph;
    String Updated_time;

    /**
     * Creates new form BookCab
     */
    public BookCab(CarProfileHistory cph) {
        initComponents();
        this.cph = cph;
        
        buttonGroup1.clearSelection();
        ArrayList<CarProfile> carProfiles = new ArrayList<>();
        carProfiles = cph.getallAvail();
        populateTable(carProfiles);
        
        
        
    }
    
    
    
    public void populateTable(ArrayList<CarProfile> Car)
    {
        DefaultTableModel dtm = (DefaultTableModel)tblCarProfile.getModel();
        dtm.setRowCount(0);
        
        for (CarProfile cp : Car)
        {
            Object row[] =new Object[4];
            row[0]= cp;
            row[1]= cp.getManufacture_yr();
            row[2]= cp.getSeats();
            row[3]= cp.getCar_no();
            dtm.addRow(row); 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCarProfile = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        Manufacturerlbl = new javax.swing.JLabel();
        ManufacturerTxtField = new javax.swing.JTextField();
        Carlbl = new javax.swing.JLabel();
        CarTxtField = new javax.swing.JTextField();
        ManYrlbl = new javax.swing.JLabel();
        ManufactureYrTxtField = new javax.swing.JTextField();
        Noseatslbl = new javax.swing.JLabel();
        SeatsTxtField = new javax.swing.JTextField();
        colorlbl = new javax.swing.JLabel();
        ColorTxtField = new javax.swing.JTextField();
        carnolbl = new javax.swing.JLabel();
        CarNoTxtField = new javax.swing.JTextField();
        Chasisnolbl = new javax.swing.JLabel();
        ChasisNoTxtField = new javax.swing.JTextField();
        mobnolbl = new javax.swing.JLabel();
        MobNoTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NoBtn = new javax.swing.JRadioButton();
        YesRadio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        BokCabBtn = new javax.swing.JButton();

        jLabel1.setText("View Car Profile");

        tblCarProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car", "Manufacturer Yr", "No. of Seats", "Car No."
            }
        ));
        jScrollPane2.setViewportView(tblCarProfile);

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        Manufacturerlbl.setText("Manufacturer");

        Carlbl.setText("Car");

        ManYrlbl.setText("Manufacture Year");

        Noseatslbl.setText("No. of Seats");

        colorlbl.setText("Color");

        carnolbl.setText("Car No.");

        Chasisnolbl.setText("Chasis No.");

        mobnolbl.setText("Mobile No. driver");

        jLabel4.setText("Availibility");

        buttonGroup1.add(NoBtn);
        NoBtn.setText("click- No");
        NoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(YesRadio);
        YesRadio.setSelected(true);
        YesRadio.setText("click - yes");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Please find the details below :");

        BokCabBtn.setForeground(new java.awt.Color(0, 0, 255));
        BokCabBtn.setText("Book");
        BokCabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BokCabBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(colorlbl)
                                    .addComponent(carnolbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ColorTxtField)
                                    .addComponent(CarNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ManYrlbl)
                                    .addComponent(Manufacturerlbl))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ManufactureYrTxtField)
                                    .addComponent(ManufacturerTxtField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Chasisnolbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mobnolbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MobNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ChasisNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Noseatslbl)
                                    .addComponent(Carlbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CarTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BokCabBtn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NoBtn)
                                    .addComponent(YesRadio)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewDetails)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewDetails)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addComponent(BokCabBtn))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Manufacturerlbl)
                    .addComponent(Carlbl)
                    .addComponent(ManufacturerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManYrlbl)
                    .addComponent(Noseatslbl)
                    .addComponent(SeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManufactureYrTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorlbl)
                    .addComponent(ColorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(carnolbl)
                                .addComponent(CarNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NoBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Chasisnolbl)
                            .addComponent(ChasisNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YesRadio)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobnolbl)
                    .addComponent(MobNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoBtnActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:

        int selectedrow = tblCarProfile.getSelectedRow();

        if(selectedrow>=0)
        {
            CarProfile cp = (CarProfile)tblCarProfile.getValueAt(selectedrow,0);

            ManufacturerTxtField.setText(cp.getManufacturer());
            CarTxtField.setText(cp.getCar_name());
            ManufactureYrTxtField.setText(String.valueOf(cp.getManufacture_yr()));
            MobNoTxtField.setText(String.valueOf(cp.getMob_no()));
            SeatsTxtField.setText(String.valueOf(cp.getSeats()));
            ChasisNoTxtField.setText(cp.getChasis_no());
            //DateTxtField.setText(cp.getMaintenance_date());
            ColorTxtField.setText(cp.getColor());
            CarNoTxtField.setText(String.valueOf(cp.getCar_no()));

            Updated_time = cph.update_time();
            //Date_text.setText(Updated_time);

            String isAval = cp.isAvail_not()?"true":"false";
            //String isAval = cp.isAvail_not();
            if(isAval.equals("false")){
                buttonGroup1.clearSelection();
                YesRadio.setSelected(false);
                NoBtn.setSelected(true);

            }
            else
            {
                buttonGroup1.clearSelection();
                YesRadio.setSelected(true);
                NoBtn.setSelected(false);
            }

        }
        else
        JOptionPane.showMessageDialog(null,"Please select any row");
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void BokCabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BokCabBtnActionPerformed
        // TODO add your handling code here:
         int selectedrow = tblCarProfile.getSelectedRow();
         if(selectedrow>0)
         {
            CarProfile cp = (CarProfile)tblCarProfile.getValueAt(selectedrow,0);
            cp.setAvail_not(false);
            JOptionPane.showMessageDialog(null,"Cab is booked Successfully");
            ManufacturerTxtField.setText("");
            CarTxtField.setText("");
            ManufactureYrTxtField.setText("");
            MobNoTxtField.setText("");
            SeatsTxtField.setText("");
            ChasisNoTxtField.setText("");
            //DateTxtField.setText("");
            ColorTxtField.setText("");
            CarNoTxtField.setText("");
            buttonGroup1.clearSelection();
            ArrayList<CarProfile> carProfiles = new ArrayList<>();
            carProfiles = cph.getallAvail();
            populateTable(carProfiles);
         }
         else
             JOptionPane.showMessageDialog(null,"Please select any row");
    }//GEN-LAST:event_BokCabBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BokCabBtn;
    private javax.swing.JTextField CarNoTxtField;
    private javax.swing.JTextField CarTxtField;
    private javax.swing.JLabel Carlbl;
    private javax.swing.JTextField ChasisNoTxtField;
    private javax.swing.JLabel Chasisnolbl;
    private javax.swing.JTextField ColorTxtField;
    private javax.swing.JLabel ManYrlbl;
    private javax.swing.JTextField ManufactureYrTxtField;
    private javax.swing.JTextField ManufacturerTxtField;
    private javax.swing.JLabel Manufacturerlbl;
    private javax.swing.JTextField MobNoTxtField;
    private javax.swing.JRadioButton NoBtn;
    private javax.swing.JLabel Noseatslbl;
    private javax.swing.JTextField SeatsTxtField;
    private javax.swing.JRadioButton YesRadio;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel carnolbl;
    private javax.swing.JLabel colorlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mobnolbl;
    private javax.swing.JTable tblCarProfile;
    // End of variables declaration//GEN-END:variables
}
