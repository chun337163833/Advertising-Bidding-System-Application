/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminProductCompany;

import Business.Enterprise.ProductCompany.Bid;
import Business.Enterprise.ProductCompany.Product;
import Business.Enterprise.ProductCompanyEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author anna
 */
public class ViewBidRuleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBidRuleJPanel
     */
    private JPanel userProcessContainer;
    private ProductCompanyEnterprise productCompanyEnterprise;
    private Product product;
    public ViewBidRuleJPanel(JPanel userProcessContainer, 
            ProductCompanyEnterprise productCompanyEnterprise, Product product) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCompanyEnterprise = productCompanyEnterprise;
        this.product = product;
        productCompanyjTextField1.setText(productCompanyEnterprise.getName());
        ProductjTextField8.setText(product.getName());
        displayData();
    }

    public void displayData(){
        Bid bid = product.getBid();
        femalejTextField1.setText(String.valueOf(bid.getFemaleP()));
        malejTextField2.setText(String.valueOf(bid.getMaleP()));
        primarySchooljTextField3.setText(String.valueOf(bid.getPschP()));
        highSchooljTextField4.setText(String.valueOf(bid.getHschP()));
        bachelorjTextField5.setText(String.valueOf(bid.getBechP()));
        masterTextField6.setText(String.valueOf(bid.getMasterP()));
        phdjTextField7.setText(String.valueOf(bid.getPhdP()));
        NEjTextField1.setText(String.valueOf(bid.getNeP()));
        NWjTextField3.setText(String.valueOf(bid.getNwp()));
        SEjTextField2.setText(String.valueOf(bid.getSeP()));
        SWJTextField4.setText(String.valueOf(bid.getSwP()));
        bigjTextField5.setText(String.valueOf(bid.getBigP()));
        smalljTextField6.setText(String.valueOf(bid.getSmallP()));
        uljTextField7.setText(String.valueOf(bid.getUlP()));
        urjTextField9.setText(String.valueOf(bid.getUrP()));
        bljTextField10.setText(String.valueOf(bid.getBlP()));
        brjTextField8.setText(String.valueOf(bid.getBrP()));
        
        

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
        productCompanyjTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        femalejTextField1 = new javax.swing.JTextField();
        malejTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        primarySchooljTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        highSchooljTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bachelorjTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        masterTextField6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        phdjTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ProductjTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        NEjTextField1 = new javax.swing.JTextField();
        SEjTextField2 = new javax.swing.JTextField();
        NWjTextField3 = new javax.swing.JTextField();
        SWJTextField4 = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        bigjTextField5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        smalljTextField6 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        uljTextField7 = new javax.swing.JTextField();
        brjTextField8 = new javax.swing.JTextField();
        urjTextField9 = new javax.swing.JTextField();
        bljTextField10 = new javax.swing.JTextField();
        updatejButton1 = new javax.swing.JButton();
        savejButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("View Bid RULL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));
        add(productCompanyjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 6, 87, -1));

        jLabel3.setText("Product Company");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 12, -1, -1));

        jLabel2.setText("Viewer Gender Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 49, -1, -1));

        jLabel8.setText("Ad Space Location Type");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 406, -1, -1));

        jLabel5.setText("Viewer Education Type");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 108, -1, -1));

        jLabel7.setText("Ad Space Size Type");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 344, -1, -1));

        jLabel6.setText("Viewer Location Type");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 242, -1, -1));

        jLabel4.setText("Female");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 80, -1, -1));
        add(femalejTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 74, 99, -1));
        add(malejTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 74, 95, -1));

        jLabel9.setText("Male");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 80, -1, -1));

        jLabel10.setText("Primary School");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 136, -1, -1));
        add(primarySchooljTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 130, 99, -1));

        jLabel11.setText("High School");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 130, -1, -1));
        add(highSchooljTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 133, 99, -1));

        jLabel12.setText("Bachelor");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 173, -1, -1));
        add(bachelorjTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 173, 99, -1));

        jLabel13.setText("Master");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 173, -1, -1));
        add(masterTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 167, 99, -1));

        jLabel14.setText("Phd");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 213, -1, -1));
        add(phdjTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 207, 99, -1));

        jLabel15.setText("Product");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 46, -1, -1));
        add(ProductjTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 40, 87, -1));

        jLabel16.setText("Northeast");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 270, -1, -1));

        jLabel17.setText("Northswest");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 270, -1, -1));

        jLabel18.setText("Southeast");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 310, -1, -1));

        jLabel19.setText("Southwest");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 310, -1, -1));
        add(NEjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 264, 100, -1));
        add(SEjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 304, 100, -1));

        NWjTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NWjTextField3ActionPerformed(evt);
            }
        });
        add(NWjTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 264, 100, -1));
        add(SWJTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 304, 100, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 508, -1, -1));

        jLabel20.setText("Big");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 372, -1, -1));
        add(bigjTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 366, 100, -1));

        jLabel21.setText("Small");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 372, -1, -1));
        add(smalljTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 366, 90, -1));

        jLabel22.setText("UpLeft");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 446, -1, -1));

        jLabel23.setText("UpRight");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 446, -1, -1));

        jLabel24.setText("BelowRight");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 480, -1, -1));

        jLabel25.setText("BelowLeft");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 480, -1, -1));
        add(uljTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 440, 90, -1));
        add(brjTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 474, 80, -1));
        add(urjTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 440, 80, -1));
        add(bljTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 474, 90, -1));

        updatejButton1.setText("Update");
        updatejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButton1ActionPerformed(evt);
            }
        });
        add(updatejButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, -1));

        savejButton2.setText("Save");
        savejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButton2ActionPerformed(evt);
            }
        });
        add(savejButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void NWjTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NWjTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NWjTextField3ActionPerformed

    private void updatejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatejButton1ActionPerformed

    private void savejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButton2ActionPerformed
        // TODO add your handling code here:
        
        Bid bid = product.getBid();
        
        bid.setFemaleP(Double.parseDouble(femalejTextField1.getText()));
        bid.setMaleP(Double.parseDouble(malejTextField2.getText()));
        
        bid.setPschP(Double.parseDouble(primarySchooljTextField3.getText()));
        bid.setHschP(Double.parseDouble(highSchooljTextField4.getText()));
        bid.setBechP(Double.parseDouble(bachelorjTextField5.getText()));
        bid.setMasterP(Double.parseDouble(masterTextField6.getText()));
        bid.setPhdP(Double.parseDouble(phdjTextField7.getText()));
        
        bid.setNeP(Double.parseDouble(NEjTextField1.getText()));
        bid.setNwp(Double.parseDouble(NWjTextField3.getText()));
        bid.setSeP(Double.parseDouble(SEjTextField2.getText()));
        bid.setSwP(Double.parseDouble(SWJTextField4.getText()));
        
        bid.setBigP(Double.parseDouble(bigjTextField5.getText()));
        bid.setSmallP(Double.parseDouble(smalljTextField6.getText()));
        
        bid.setUlP(Double.parseDouble(uljTextField7.getText()));
        bid.setUrP(Double.parseDouble(urjTextField9.getText()));
        bid.setBlP(Double.parseDouble(bljTextField10.getText()));
        bid.setBrP(Double.parseDouble(brjTextField8.getText()));
    }//GEN-LAST:event_savejButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NEjTextField1;
    private javax.swing.JTextField NWjTextField3;
    private javax.swing.JTextField ProductjTextField8;
    private javax.swing.JTextField SEjTextField2;
    private javax.swing.JTextField SWJTextField4;
    private javax.swing.JTextField bachelorjTextField5;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bigjTextField5;
    private javax.swing.JTextField bljTextField10;
    private javax.swing.JTextField brjTextField8;
    private javax.swing.JTextField femalejTextField1;
    private javax.swing.JTextField highSchooljTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField malejTextField2;
    private javax.swing.JTextField masterTextField6;
    private javax.swing.JTextField phdjTextField7;
    private javax.swing.JTextField primarySchooljTextField3;
    private javax.swing.JTextField productCompanyjTextField1;
    private javax.swing.JButton savejButton2;
    private javax.swing.JTextField smalljTextField6;
    private javax.swing.JTextField uljTextField7;
    private javax.swing.JButton updatejButton1;
    private javax.swing.JTextField urjTextField9;
    // End of variables declaration//GEN-END:variables
}