/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminProductCompany;

import Business.Enterprise.ProductCompany.Product;
import Business.Enterprise.ProductCompanyEnterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anna
 */
public class ManageProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductJPanel
     */
     JPanel userProcessContainer;
    ProductCompanyEnterprise productCompanyehrenterprise;
    public ManageProductJPanel(JPanel userProcessContainer,ProductCompanyEnterprise productCompanyehrenterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCompanyehrenterprise = productCompanyehrenterprise;
        productCompanyjTextField.setText(productCompanyehrenterprise.getName());
        
        popTable();
        populateCombOX();
    }
    

     public void popTable(){
        DefaultTableModel model = (DefaultTableModel) productjTable.getModel();
        model.setRowCount(0);
        for (Product p : productCompanyehrenterprise.getProductCatalog().getProductcatalog()){
            Object row[] = new Object[4];
                row[0] = p.getProductID();
                row[1] = p;
                row[2] = p.getTargetPrice();
                row[3] = p.getPtype();
                
                
                ((DefaultTableModel) productjTable.getModel()).addRow(row);
     }
       }
    
    
     public void populateCombOX(){
     typejComboBox.removeAllItems();
     for (Product.ProductType ptype : Product.ProductType.values()){
         typejComboBox.addItem(ptype);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        productjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        productCompanyjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        targetPricejTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        typejComboBox = new javax.swing.JComboBox();
        createjButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        productjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Target Price", "Type"
            }
        ));
        jScrollPane1.setViewportView(productjTable);

        jLabel1.setText("Name");

        jLabel2.setText("Product Company");

        jLabel3.setText("Target Price");

        jLabel4.setText("Type ");

        typejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        createjButton1.setText("Create");
        createjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButton1ActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(productCompanyjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(39, 39, 39))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel4)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 69, Short.MAX_VALUE)
                                        .add(typejComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel3)
                                            .add(jLabel1))
                                        .add(26, 26, 26)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(namejTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                            .add(targetPricejTextField1))))
                                .add(125, 125, 125)
                                .add(createjButton1))))
                    .add(layout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(backJButton)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(productCompanyjTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(namejTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(targetPricejTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 39, Short.MAX_VALUE)
                        .add(createjButton1)
                        .add(118, 118, 118))
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(typejComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(backJButton)
                        .add(56, 56, 56))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButton1ActionPerformed
        // TODO add your handling code here:
       
      String name = namejTextField.getText();
      Double price = Double.parseDouble(targetPricejTextField1.getText());
     Product.ProductType ptype = (Product.ProductType) typejComboBox.getSelectedItem();
              
      Product p = productCompanyehrenterprise.getProductCatalog().createProduct(name, price, ptype);
     // p.setProductID(p.getProductID()+1);
      popTable();
    }//GEN-LAST:event_createjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField productCompanyjTextField;
    private javax.swing.JTable productjTable;
    private javax.swing.JTextField targetPricejTextField1;
    private javax.swing.JComboBox typejComboBox;
    // End of variables declaration//GEN-END:variables
}