/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.GetData;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public String user;
    GetData dt = new GetData();
    public static Connection conn = null; 
    public static Login loginForm = null;
    public Menu(String user) {
        initComponents();
        this.user=user;
        this.setLocationRelativeTo(null);
        Object[][] tennv = dt.getTenNV(user);
        textUserName.setText((String) tennv[0][0]);
    }

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        btn_logout = new javax.swing.JButton();
        btn_Customer = new javax.swing.JButton();
        btn_Employee = new javax.swing.JButton();
        btn_Product = new javax.swing.JButton();
        btn_Shoes = new javax.swing.JButton();
        btn_Import = new javax.swing.JButton();
        btn_Supplier = new javax.swing.JButton();
        btn_Manufacturer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 0));
        jLabel1.setText("SHOE STORE MANAGER");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 0));
        jLabel3.setText("Staff's Name");

        textUserName.setBackground(new java.awt.Color(0, 51, 102));
        textUserName.setEnabled(false);

        btn_logout.setBackground(new java.awt.Color(242, 242, 242));
        btn_logout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_logout.setText("Log Out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_Customer.setBackground(new java.awt.Color(51, 51, 51));
        btn_Customer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Customer.setForeground(new java.awt.Color(255, 255, 255));
        btn_Customer.setText("Customer Management");
        btn_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CustomerActionPerformed(evt);
            }
        });

        btn_Employee.setBackground(new java.awt.Color(51, 51, 51));
        btn_Employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Employee.setForeground(new java.awt.Color(255, 255, 255));
        btn_Employee.setText("Employee Manager");
        btn_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmployeeActionPerformed(evt);
            }
        });

        btn_Product.setBackground(new java.awt.Color(51, 51, 51));
        btn_Product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Product.setForeground(new java.awt.Color(255, 255, 255));
        btn_Product.setText("Product Management");
        btn_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductActionPerformed(evt);
            }
        });

        btn_Shoes.setBackground(new java.awt.Color(51, 51, 51));
        btn_Shoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Shoes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Shoes.setText("Selling Shoes");
        btn_Shoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShoesActionPerformed(evt);
            }
        });

        btn_Import.setBackground(new java.awt.Color(51, 51, 51));
        btn_Import.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Import.setForeground(new java.awt.Color(255, 255, 255));
        btn_Import.setText("Import Goods");
        btn_Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImportActionPerformed(evt);
            }
        });

        btn_Supplier.setBackground(new java.awt.Color(51, 51, 51));
        btn_Supplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_Supplier.setText("Supplier");
        btn_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SupplierActionPerformed(evt);
            }
        });

        btn_Manufacturer.setBackground(new java.awt.Color(51, 51, 51));
        btn_Manufacturer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Manufacturer.setForeground(new java.awt.Color(255, 255, 255));
        btn_Manufacturer.setText("Manufacturer");
        btn_Manufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ManufacturerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Shoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Customer))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Manufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Import, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addComponent(btn_Import, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Shoes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(btn_Manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel2, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/thiet-ke-shop-giay-1.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this,"Are you sure you want to sign out?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION)
        {
            this.setVisible(false);
            new Login().setVisible(true);
        }
        else{
            this.setVisible(true);
        }
        
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CustomerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Customer_Management(user).setVisible(true);
    }//GEN-LAST:event_btn_CustomerActionPerformed

    private void btn_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Product_Management(user).setVisible(true);
    }//GEN-LAST:event_btn_ProductActionPerformed

    private void btn_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmployeeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Employee_Manager(user).setVisible(true);
    }//GEN-LAST:event_btn_EmployeeActionPerformed

    private void btn_ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImportActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Import_Goods(user).setVisible(true);
    }//GEN-LAST:event_btn_ImportActionPerformed

    private void btn_ShoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShoesActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Selling_Shoes(user).setVisible(true);
    }//GEN-LAST:event_btn_ShoesActionPerformed

    private void btn_ManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ManufacturerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Manufacturer(user).setVisible(true);
    }//GEN-LAST:event_btn_ManufacturerActionPerformed

    private void btn_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SupplierActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Supplier(user).setVisible(true);
    }//GEN-LAST:event_btn_SupplierActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Customer;
    private javax.swing.JButton btn_Employee;
    private javax.swing.JButton btn_Import;
    private javax.swing.JButton btn_Manufacturer;
    private javax.swing.JButton btn_Product;
    private javax.swing.JButton btn_Shoes;
    private javax.swing.JButton btn_Supplier;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}
