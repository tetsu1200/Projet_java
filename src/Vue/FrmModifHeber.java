/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vue;

import Model.Hebergement;
import Model.HebergementDao;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author PROBOOK 450 I7
 */
public class FrmModifHeber extends javax.swing.JInternalFrame {

    ImageIcon photo;
    String chemin;
    
    Hebergement he = new Hebergement();
    Hebergement he1 = new Hebergement();
    HebergementDao hed = new HebergementDao();
    /**
     * Creates new form FrmModifHeber
     */
    public FrmModifHeber(Hebergement he) {
        this.he = he;
        initComponents();
        charger();
        
    }
    
    public void charger(){
        remplir();
        
        try {
            this.setMaximum(true);
            //this.setExtendedState(MAXIMIZED_BOTH);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        chargH();
    }
    
    public void chargH(){
        txtNom.setText(he.getNom());
        System.err.println("He---->Modif"+ he.getNom());
        txtAdresse.setText(he.getAdresse());
        txtAvis.setText(he.getAvis());
        txtTarif.setText(Integer.toString(he.getTarif()));
        txtVille.setText(he.getVille());
        cCategorie.setSelectedIndex(0);
        cEtoile.setSelectedIndex(he.getNbrEtoile()-1);
        tNbrChambre.setValue(he.getNbrChambre());
        chemin=he.getPhoto();

            
        //creation d'objet ImageIcon avec le fichier
        photo=new ImageIcon(chemin);
        //redimentionnement de l'image en fonction de la zone d'affichage
        photo=new ImageIcon(photo.getImage()
            .getScaledInstance(113, 112, Image.SCALE_DEFAULT));
        //affichage de l'image dans la zone
        lblphoto.setIcon(photo);
    }
    
    private void vider(){
        txtNom.setText("");
        txtAdresse.setText("");
        txtAvis.setText("");
        txtTarif.setText("");
        txtVille.setText("");
        cCategorie.setSelectedIndex(0);
        cEtoile.setSelectedIndex(0);
        tNbrChambre.setValue(0);
    }
    
    public void remplir()
    {
        cCategorie.addItem("Maison d'hôtes");
        cCategorie.addItem("Chalet");
        cCategorie.addItem("Séjour chez l'habitant");
        cCategorie.addItem("Appartement");
        cCategorie.addItem("Villa");
        cCategorie.addItem("Hôtel");
        cCategorie.addItem("B&B");
        cCategorie.addItem("B&B");
        
        
        
        
        cEtoile.addItem("1 étoile");
        cEtoile.addItem("2 étoiles");
        cEtoile.addItem("3 étoiles");
        cEtoile.addItem("4 étoiles");
        cEtoile.addItem("5 étoiles");
        cEtoile.addItem("non classé");
        
        /*jCheckBox15.setText("Moins de 1 km");
        jCheckBox16.setText("Moins de 3 km");
        jCheckBox17.setText("Moins de 5 km");*/
                
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAvis = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        lblphoto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        tNbrChambre = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        txtAdresse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        cCategorie = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCharger = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTarif = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        txtVille = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cEtoile = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(117, 42, 181));
        jLabel2.setText("Nom");

        txtAvis.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtAvis.setForeground(new java.awt.Color(163, 96, 230));
        txtAvis.setText("Entrer votre mot de passe");
        txtAvis.setBorder(null);
        txtAvis.setName("txtAvis"); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblphoto.setText("jLabel8");
        lblphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(117, 42, 181));
        jLabel4.setText("Adresse");

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tNbrChambre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tNbrChambre.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        tNbrChambre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));
        tNbrChambre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtAdresse.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtAdresse.setForeground(new java.awt.Color(163, 96, 230));
        txtAdresse.setText("Entrer votre email");
        txtAdresse.setBorder(null);
        txtAdresse.setName("tEmail"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(117, 42, 181));
        jLabel6.setText("Categorie");

        txtNom.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNom.setForeground(new java.awt.Color(163, 96, 230));
        txtNom.setText("Entrer votre nom");
        txtNom.setBorder(null);
        txtNom.setName("txtNom"); // NOI18N

        cCategorie.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cCategorie.setForeground(new java.awt.Color(163, 96, 230));
        cCategorie.setBorder(null);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(117, 42, 181));
        jLabel5.setText("Avis");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(117, 42, 181));
        jLabel3.setText("Nombre chambre");

        btnCharger.setText("Charger");
        btnCharger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargerActionPerformed(evt);
            }
        });

        btnEnregistrer.setBackground(new java.awt.Color(117, 42, 181));
        btnEnregistrer.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnEnregistrer.setForeground(new java.awt.Color(255, 255, 255));
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.setName("btnLogin"); // NOI18N
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(117, 42, 181));
        jLabel8.setText("Prix");

        txtTarif.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtTarif.setForeground(new java.awt.Color(163, 96, 230));
        txtTarif.setText("Entrer votre mot de passe");
        txtTarif.setBorder(null);
        txtTarif.setName("tMdp"); // NOI18N

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtVille.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtVille.setForeground(new java.awt.Color(163, 96, 230));
        txtVille.setText("Entrer votre mot de passe");
        txtVille.setBorder(null);
        txtVille.setName("tMdp"); // NOI18N

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(117, 42, 181));
        jLabel9.setText("Ville");

        cEtoile.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cEtoile.setForeground(new java.awt.Color(163, 96, 230));
        cEtoile.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(117, 42, 181));
        jLabel10.setText("Nombre etoile");

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 42, 181)));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNom)
                        .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(txtAvis)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(txtVille)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNbrChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(txtTarif)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cEtoile, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCharger)
                                .addGap(118, 118, 118))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tNbrChambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cEtoile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCharger))
                                .addGap(9, 9, 9)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAvis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(btnEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargerActionPerformed
        // TODO add your handling code here:
        //creation d'un explorateur de fichier
        JFileChooser fc=new JFileChooser();
        //ouverture en mode selection
        int a=fc.showOpenDialog(this);
        //si l'utilisateur a choisi un fichier alors continuer
        if(a==JFileChooser.APPROVE_OPTION){
            //recuperation du chemin du fichier selectionné
            chemin=fc.getSelectedFile().getAbsolutePath();

            he1.setPhoto(chemin);
            //creation d'objet ImageIcon avec le fichier
            photo=new ImageIcon(chemin);
            //redimentionnement de l'image en fonction de la zone d'affichage
            photo=new ImageIcon(photo.getImage()
                .getScaledInstance(113, 112, Image.SCALE_DEFAULT));
            //affichage de l'image dans la zone
            lblphoto.setIcon(photo);
        }
    }//GEN-LAST:event_btnChargerActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed

        String nom = txtNom.getText();
        String adresse = txtAdresse.getText();
        String avis = txtAvis.getText();
        int prix = Integer.parseInt(txtTarif.getText());
        String ville = txtVille.getText();

        String categorie = cCategorie.getSelectedItem().toString();
        int nbrEtoile = cEtoile.getSelectedIndex()+1;

        int nbrChambre = (int)tNbrChambre.getValue();

        if (nom.isEmpty()){
            JOptionPane.showMessageDialog(this, "Veillez Entrer votre nom",
                "Veillez Réessayer", JOptionPane.ERROR_MESSAGE);
            txtNom.requestFocus();
        }else if (adresse.isEmpty()){
            JOptionPane.showMessageDialog(this, "Veillez Entrer votre numero de telephone",
                "Veillez Réessayer", JOptionPane.ERROR_MESSAGE);
            txtAdresse.requestFocus();
        }else if (avis.isEmpty()){
            JOptionPane.showMessageDialog(this, "Veillez Entrer votre mail",
                "Veillez Réessayer", JOptionPane.ERROR_MESSAGE);
            txtAvis.requestFocus();
        }else if (prix < 0){
            JOptionPane.showMessageDialog(this, "Veillez Entrer votre mot de passe",
                "Veillez Réessayer", JOptionPane.ERROR_MESSAGE);
            txtTarif.requestFocus();
        }else if (ville.length() > 12){
            JOptionPane.showMessageDialog(this, "Veillez Entrer votre numero de telephone",
                "Veillez Réessayer", JOptionPane.ERROR_MESSAGE);
            txtVille.requestFocus();
        }else{
            try {

                he1 = new Hebergement(nbrChambre, nbrEtoile, prix, nom, adresse, "description", avis, categorie, ville);
                he1.setPhoto(chemin);
                he1.setId(he.getId());
                boolean BO =hed.Modifier(he1);

                JOptionPane.showMessageDialog(this, "Hebergement Ajouté ",
                    "Message", JOptionPane.INFORMATION_MESSAGE);

                vider();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }//GEN-LAST:event_btnEnregistrerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCharger;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JComboBox<String> cCategorie;
    private javax.swing.JComboBox<String> cEtoile;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JSpinner tNbrChambre;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtAvis;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTarif;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
