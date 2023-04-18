/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vue;

import Model.Client;
import Model.ClientDao;
import Model.FrmModifClient;
import Model.Hebergement;
import Model.HebergementDao;
import Model.UserManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author PROBOOK 450 I7
 */
public class panRe extends javax.swing.JPanel {

    /**
     * Creates new form pan
     */
    public panRe() { 
        initComponents();
        charger();
    }

    public void setLblNom(String lblNom) {
        this.lblNomCl.setText(lblNom);
    }

    public void setLblPhoto(Icon lblPhoto) {
        this.lblPhoto.setIcon(lblPhoto);
    }

    public void setLblId(int lblId) {
        this.lblId.setText(Integer.toString(lblId));
    }
    
    public void charger(){
        
    }
    
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomCl = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        lblNomHe = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblNomCl.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblNomCl.setForeground(new java.awt.Color(51, 51, 255));
        lblNomCl.setText("Nom hotel");

        lblPhoto.setText("jLabel2");

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblId.setText("id");

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Supprimer");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnModif.setBackground(new java.awt.Color(0, 0, 255));
        btnModif.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnModif.setForeground(new java.awt.Color(255, 255, 255));
        btnModif.setText("Modifier");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });

        lblNomHe.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblNomHe.setForeground(new java.awt.Color(51, 51, 255));
        lblNomHe.setText("Nom hotel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNomCl, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(86, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(lblNomHe, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblNomCl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblNomHe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        Client cl = new Client();
        ClientDao hed = new ClientDao();
        List<Client> list = new ArrayList<>();
        
        cl = cl.rechercherById(Integer.parseInt(lblId.getText()));
        hed.supprimer(cl);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed
        Client cl = new Client();
        cl = cl.rechercherById(Integer.parseInt(lblId.getText()));
        // Récupérer le JDesktopPane du JFrame parent (FrmPrincipale)
        JDesktopPane desktopPane = (JDesktopPane) SwingUtilities.getAncestorOfClass(JDesktopPane.class, this);

        // Récupérer le JInternalFrame parent (FrmHebergement2)
        JInternalFrame internalFrame = (JInternalFrame) SwingUtilities.getAncestorOfClass(JInternalFrame.class, this);
        FrmModifClient fmc = new FrmModifClient(cl);
        desktopPane.add(fmc);
        fmc.setVisible(true);
        
        // Supprimer l'ancien JInternalFrame (FrmHebergement2)
        internalFrame.dispose();
        
    }//GEN-LAST:event_btnModifActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModif;
    private javax.swing.JLabel lblId;
    public javax.swing.JLabel lblNomCl;
    public javax.swing.JLabel lblNomHe;
    private javax.swing.JLabel lblPhoto;
    // End of variables declaration//GEN-END:variables
}
