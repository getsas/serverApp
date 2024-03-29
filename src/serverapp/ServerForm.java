package serverapp;

import java.io.*;
import java.util.*;
import javax.swing.*;


public class ServerForm extends javax.swing.JFrame {

    ServerThread st;
    ArrayList<String> pelatesArray = new ArrayList<>();
    DefaultListModel<String> pelatesListModel = new DefaultListModel<>();
    DefaultListModel<String> pelatesOlokliromenoiListModel = new DefaultListModel<>();
    DefaultListModel<String> pelatesApontesListModel = new DefaultListModel<>();
    
    int plithosYpallilon = 0;
    int plithosAllodapon = 1;
    
    String filename = "pelates.txt";
    
    String[] pelates = new String[100];
    
    int counterPelati = 0;
    
    boolean eisagogiPelaton = true; //αν επιτρέπεται η επιλογή 'Εισαγωγή Πελατών'
    boolean diagrafiPelaton = false;  //αν επιτρέπεται η επιλογή 'Διαγραφή Πελατών'
    //boolean pigaineDeksiaPelati = false; //αν επιτρέπεται να πας δεξιά πελάτη
    //boolean UndoOloklirosi = false;
    
    // constructor της Αρχικής Φόρμας 'ServerForm'
    public ServerForm() {
        initComponents();
        jMenuItemEisagogiOnomaton.setEnabled(eisagogiPelaton);  //Ξεκινάει ενεργοποιημένο το 'Εισαγωγή Πελατών'
        jMenuItemDiagrafiOnomaton.setEnabled(diagrafiPelaton);  //Ξεκινάει απενεργοποιημένο το 'Διαγραφή Πελατών'
        
        //jBtnOloklirosiPelati.setEnabled(pigaineDeksiaPelati);   // Ξεκινάει απενεργοποιημένο το κουμπί ' > '
        //jBtnUndoOloklirosi.setEnabled(UndoOloklirosi);          //Ξεκινάει απενεργοποιημένο το κουμπί ' < '
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.  */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnKlisiProtou = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jlblYpalliloi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaRec = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListOura = new javax.swing.JList<>(pelatesListModel);
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaSend = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListOlokliromenoi = new javax.swing.JList<>(pelatesOlokliromenoiListModel);
        jLabel5 = new javax.swing.JLabel();
        jBtnOloklirosiPelati = new javax.swing.JButton();
        jBtnUndoOloklirosi = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListDenProsilthan = new javax.swing.JList<>(pelatesApontesListModel);
        jLabel6 = new javax.swing.JLabel();
        jBtnDenProsilthe = new javax.swing.JButton();
        jBtnUndoDenProsilthe = new javax.swing.JButton();
        jBtnUP = new javax.swing.JButton();
        jBtnDOWN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemEisagogiOnomaton = new javax.swing.JMenuItem();
        jMenuItemDiagrafiOnomaton = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Διαχείριση Ουράς Αλλοδαπών  v.2.0");
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName(""); // NOI18N

        btnKlisiProtou.setLabel("Κλήση 1ου στην ουρά");
        btnKlisiProtou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlisiProtouActionPerformed(evt);
            }
        });

        jLabel4.setText("Υπάλληλοι:");

        jSlider1.setBackground(new java.awt.Color(204, 204, 204));
        jSlider1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(5);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(1);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JSlider(evt);
            }
        });

        jlblYpalliloi.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblYpalliloi))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKlisiProtou, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jlblYpalliloi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnKlisiProtou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Recieved Message");

        jtaRec.setColumns(20);
        jtaRec.setRows(5);
        jScrollPane1.setViewportView(jtaRec);

        jLabel3.setText("Λίστα αναμονής");

        jListOura.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jListOura);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Send Message");

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtaSend.setColumns(20);
        jtaSend.setRows(5);
        jScrollPane2.setViewportView(jtaSend);

        jListOlokliromenoi.setBackground(new java.awt.Color(204, 255, 204));
        jListOlokliromenoi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jListOlokliromenoi);

        jLabel5.setText("Έχουν εξυπηρετηθεί");

        jBtnOloklirosiPelati.setText(">");
        jBtnOloklirosiPelati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOloklirosiPelatiActionPerformed(evt);
            }
        });

        jBtnUndoOloklirosi.setText("<");
        jBtnUndoOloklirosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUndoOloklirosiActionPerformed(evt);
            }
        });

        jListDenProsilthan.setBackground(new java.awt.Color(255, 204, 204));
        jScrollPane6.setViewportView(jListDenProsilthan);

        jLabel6.setText("Απόντες");

        jBtnDenProsilthe.setText(">");
        jBtnDenProsilthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDenProsiltheActionPerformed(evt);
            }
        });

        jBtnUndoDenProsilthe.setText("<");
        jBtnUndoDenProsilthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUndoDenProsiltheActionPerformed(evt);
            }
        });

        jBtnUP.setText("↑");
        jBtnUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUPActionPerformed(evt);
            }
        });

        jBtnDOWN.setText("↓");
        jBtnDOWN.setToolTipText("");
        jBtnDOWN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDOWNActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnOloklirosiPelati)
                            .addComponent(jBtnUndoOloklirosi)
                            .addComponent(jBtnDenProsilthe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnUndoDenProsilthe, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addComponent(jBtnUP)
                        .addGap(31, 31, 31)
                        .addComponent(jBtnDOWN))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton2)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jBtnOloklirosiPelati)
                .addGap(31, 31, 31)
                .addComponent(jBtnUndoOloklirosi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnDenProsilthe)
                .addGap(30, 30, 30)
                .addComponent(jBtnUndoDenProsilthe)
                .addGap(106, 106, 106))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jBtnUP)
                    .addComponent(jBtnDOWN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jMenu1.setText("Έναρξη");

        jMenuItem1.setText("Εκκίνηση επικοινωνίας");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Αλλοδαποί");

        jMenuItemEisagogiOnomaton.setText("Εισαγωγή ονομάτων");
        jMenuItemEisagogiOnomaton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEisagogiOnomatonActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEisagogiOnomaton);

        jMenuItemDiagrafiOnomaton.setText("Διαγραφή ονομάτων");
        jMenuItemDiagrafiOnomaton.setToolTipText("");
        jMenuItemDiagrafiOnomaton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDiagrafiOnomatonActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemDiagrafiOnomaton);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    // 'Send' button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //use st- serverthread object to call sendMessage method to send the message to client
        st.sendMessage(jtaSend.getText());       
    }//GEN-LAST:event_jButton1ActionPerformed

    // Επιλογή 'Εκκίνηση Επικοινωνίας'
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        st = new ServerThread(this);  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Επιλογή 'Εισαγωγή Ονομάτων'
    private void jMenuItemEisagogiOnomatonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEisagogiOnomatonActionPerformed
        
        readPelatesFromFile();
  
        jMenuItemEisagogiOnomaton.setEnabled(eisagogiPelaton = false); //Απενεργοποίηση του menuItem 'Εισαγωγή Ονομάτων' για να μην μπουν ξανά στον πίνακα
        jMenuItemDiagrafiOnomaton.setEnabled(eisagogiPelaton = true);  //Eνεργοποίηση του menuItem 'Διαγραφή Ονομάτων' για να μπορεί ο χρήστης να τα διαγράψει
        //jBtnOloklirosiPelati.setEnabled(pigaineDeksiaPelati = true);   //Eνεργοποίηση του μουμπιού ' > '
               
    }//GEN-LAST:event_jMenuItemEisagogiOnomatonActionPerformed

    // Επιλογή 'Διαγραφή Ονομάτων'
    private void jMenuItemDiagrafiOnomatonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDiagrafiOnomatonActionPerformed
        //καθάρισμα πίνακα αλλοδαπών
        for (int i = 0; i < pelates.length; i++) {
            pelates[i] = null;
        }   
        
        //καθάρισμα listModel για την JList
        pelatesListModel.clear();
        
        counterPelati = 0;                              //αρχικοποίηση του μετρητή πελατών στον πίνακα
        jMenuItemEisagogiOnomaton.setEnabled(eisagogiPelaton = true);   //ενεργοποίηση του menuItem 'Εισαγωγή Ονομάτων'         
        jMenuItemDiagrafiOnomaton.setEnabled(eisagogiPelaton = false);  //Eνεργοποίηση του menuItem 'Διαγραφή Ονομάτων' για να μπορεί ο χρήστης να τα διαγράψει   
        //jBtnOloklirosiPelati.setEnabled(pigaineDeksiaPelati = false);   //Απενεργοποίηση του μουμπιού ' > '
    }//GEN-LAST:event_jMenuItemDiagrafiOnomatonActionPerformed

    private void btnKlisiProtouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlisiProtouActionPerformed
               
    }//GEN-LAST:event_btnKlisiProtouActionPerformed

    private void JSlider(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JSlider
        jlblYpalliloi.setText(Integer.toString(jSlider1.getValue())); // Βάλε στο label την τιμή από το Slider
    }//GEN-LAST:event_JSlider

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        jlblYpalliloi.setText(Integer.toString(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged

    // =======================================================================================================================================
    // Πάτημα κουμπιού ' > ' στο Αρχική Λίστα --> λίστα Ολοκληρωμένων
    private void jBtnOloklirosiPelatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOloklirosiPelatiActionPerformed
        String epilegmenos = null;
        
        // ΜΟΝΟ αν ο χρήστης έχει επιλέξει μια εγγραφή, κάνε ενέργειες για να τον μεταφέρεις δεξιά
        if (jListOura.getSelectedValue() != null ) {
            epilegmenos = jListOura.getSelectedValue();
        
            pelatesOlokliromenoiListModel.addElement(epilegmenos);  //πρόσθεσε στη λίστα ολοκληρωμένων την επιλεγμένη εγγραφή
            pelatesListModel.removeElement(epilegmenos);            //αφαίρεσε την επιλεγμένη εγγραφή από την αρχική λίστα 
            //jBtnUndoOloklirosi.setEnabled(UndoOloklirosi = true);
        }
    }//GEN-LAST:event_jBtnOloklirosiPelatiActionPerformed
 
    // Πάτημα κουμπιού ' < ' στο Αρχική Λίστα <--  Λίστα ολοκληρωμένων
    private void jBtnUndoOloklirosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUndoOloklirosiActionPerformed
        String epilegmenos = null;
        
        // ΜΟΝΟ αν ο χρήστης έχει επιλέξει μια εγγραφή, κάνε ενέργειες για να τον μεταφέρεις αριστερά
        if (jListOlokliromenoi.getSelectedValue() != null ) {
            epilegmenos = jListOlokliromenoi.getSelectedValue();
       
            pelatesListModel.addElement(epilegmenos);  //επανάφερε στη λίστα ουράς την επιλεγμένη εγγραφή από τη λίστα ολοκληρωμένων
            sortList(pelatesListModel); //ταξινόμηση της λίστας έτσι ώστε ο αλλοδαπός να ταξινομηθεί στη θέση του (με βάση τον αριθμό του)
                //jListOura.updateUI(); //Κάνει refresh τη λίστα έτσι ώστε να τη δείξει ταξινομημένη. Όμως εδώ δεν χρειάστηκε τελικά
            pelatesOlokliromenoiListModel.removeElement(epilegmenos);  //αφαίρεσε την επιλεγμένη εγγραφή από τη λίστα ολοκληρωμένων
        }      
    }//GEN-LAST:event_jBtnUndoOloklirosiActionPerformed

    // =======================================================================================================================================
    // Πάτημα κουμπιού ' > ' στο Αρχική Λίστα --> λίστα Μη προσερχόντων
    private void jBtnDenProsiltheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDenProsiltheActionPerformed
        String epilegmenos = null;
        
        // ΜΟΝΟ αν ο χρήστης έχει επιλέξει μια εγγραφή, κάνε ενέργειες για να τον μεταφέρεις δεξιά
        if (jListOura.getSelectedValue() != null ) {
            epilegmenos = jListOura.getSelectedValue();
       
            pelatesApontesListModel.addElement(epilegmenos);  //πρόσθεσε στη λίστα απόντων την επιλεγμένη εγγραφή
            sortList(pelatesApontesListModel); //ταξινόμηση της λίστας έτσι ώστε ο αλλοδαπός να ταξινομηθεί στη θέση του (με βάση τον αριθμό του)
            pelatesListModel.removeElement(epilegmenos);  
            
        }         
    }//GEN-LAST:event_jBtnDenProsiltheActionPerformed

    // Πάτημα κουμπιού ' < ' στο Αρχική Λίστα <--  λίστα Μη προσερχόντων
    private void jBtnUndoDenProsiltheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUndoDenProsiltheActionPerformed
        String epilegmenos = null;
        
        // ΜΟΝΟ αν ο χρήστης έχει επιλέξει μια εγγραφή, κάνε ενέργειες για να τον μεταφέρεις αριστερά
        if (jListDenProsilthan.getSelectedValue() != null ) {
            epilegmenos = jListDenProsilthan.getSelectedValue();
       
            pelatesListModel.addElement(epilegmenos);  //επανάφερε στη λίστα ουράς την επιλεγμένη εγγραφή από τη λίστα Μη προσερχόντων
            sortList(pelatesListModel); //ταξινόμηση της λίστας έτσι ώστε ο αλλοδαπός να ταξινομηθεί στη θέση του (με βάση τον αριθμό του)
            pelatesApontesListModel.removeElement(epilegmenos);   //αφαίρεσε την επιλεγμένη εγγραφή από τη λίστα Μη προσερχόντων   
        }    
    }//GEN-LAST:event_jBtnUndoDenProsiltheActionPerformed
    // =======================================================================================================================================
    // Πάτημα κουμπιού ' ↓ ' στο Λίστα ολοκληρωμένων ↓ λίστα Μη προσερχόντων
    private void jBtnDOWNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDOWNActionPerformed
        String epilegmenos = null;
        
        // ΜΟΝΟ αν ο χρήστης έχει επιλέξει μια εγγραφή, κάνε ενέργειες για να τον μεταφέρεις αριστερά
        if (jListOlokliromenoi.getSelectedValue() != null ) {
            epilegmenos = jListOlokliromenoi.getSelectedValue();
       
            pelatesApontesListModel.addElement(epilegmenos);  //πρόσθεσε στη λίστα απόντων την επιλεγμένη εγγραφή
            sortList(pelatesApontesListModel); //ταξινόμηση της λίστας έτσι ώστε ο αλλοδαπός να ταξινομηθεί στη θέση του (με βάση τον αριθμό του)
            pelatesOlokliromenoiListModel.removeElement(epilegmenos);  //αφαίρεσε την επιλεγμένη εγγραφή από τη λίστα ολοκληρωμένων  
        }    
    }//GEN-LAST:event_jBtnDOWNActionPerformed

    // Πάτημα κουμπιού ' ↑ ' στο Λίστα ολοκληρωμένων ↑ λίστα Μη προσερχόντων
    private void jBtnUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUPActionPerformed
        String epilegmenos = null;
        
        // ΜΟΝΟ αν ο χρήστης έχει επιλέξει μια εγγραφή, κάνε ενέργειες για να τον μεταφέρεις αριστερά
        if (jListDenProsilthan.getSelectedValue() != null ) {
            epilegmenos = jListDenProsilthan.getSelectedValue();
            pelatesOlokliromenoiListModel.addElement(epilegmenos);  //πρόσθεσε στη λίστα ολοκληρωμένων την επιλεγμένη εγγραφή
            pelatesApontesListModel.removeElement(epilegmenos);   //αφαίρεσε την επιλεγμένη εγγραφή από τη λίστα Μη προσερχόντων  
        }   
    }//GEN-LAST:event_jBtnUPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!pelatesListModel.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                st.sendMessage(pelatesListModel.getElementAt(i) );  
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    // =======================================================================================================================================
    
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
            java.util.logging.Logger.getLogger(ServerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnKlisiProtou;
    private javax.swing.JButton jBtnDOWN;
    private javax.swing.JButton jBtnDenProsilthe;
    private javax.swing.JButton jBtnOloklirosiPelati;
    private javax.swing.JButton jBtnUP;
    private javax.swing.JButton jBtnUndoDenProsilthe;
    private javax.swing.JButton jBtnUndoOloklirosi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListDenProsilthan;
    private javax.swing.JList<String> jListOlokliromenoi;
    private javax.swing.JList<String> jListOura;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemDiagrafiOnomaton;
    private javax.swing.JMenuItem jMenuItemEisagogiOnomaton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlblYpalliloi;
    public javax.swing.JTextArea jtaRec;
    public javax.swing.JTextArea jtaSend;
    // End of variables declaration//GEN-END:variables
    
    // ---------------------------------------------------------------------------------------------------------------------------------------------------
    // Ανάγνωση των ονομάτων των αλλοδαπών από το txt αρχείο και τοποθέτηση τους στο pelatesListModel
    public void readPelatesFromFile() {
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));           
            String line = in.readLine(); //βάζει στην line την πρώτη γραμμή
            int counter = 1;
            
            while (line != null) {      //όσο η Line δεν είναι άδεια (δηλαδή η τελευταία) 
                pelatesArray.add(line); //βάζω τον αλλοδαπό στο arrayList               
                pelatesListModel.addElement(counter + ". " + line);  //αποθήκευσε τη γραμμή που θα διαβάσεις από το αρχείο, στην arrayList pelatesArray ως "x. onomateponymo"                                     
                line = in.readLine();   //διάβασε την επόμενη γραμμή
                counter++;
            }   
        } catch(IOException e) {
                    System.out.println(e.getMessage());
        }
    }
    // ---------------------------------------------------------------------------------------------------------------------------------------------------
    // Ταξινόμηση του μοντέλου της λίστας Ουράς (χρησιμεύει όταν επιστρέψω άτομο από τους ολοκληρωμένους
    private DefaultListModel<String> sortList(DefaultListModel<String> apelatesListModel) {
       /*
        (string1.compareTo(string1));//0  
        (string1.compareTo(string2));//1(because string1>string2)  
        (string1.compareTo(string2));//-1(because string2 < string1 )  
       */
       for (int i = 1; i < apelatesListModel.getSize(); i++) {
             for (int j = 0; j < apelatesListModel.getSize() - i; j++) {
                 if( apelatesListModel.get(j).compareTo(apelatesListModel.get(j+1)) > 0 ) {       
                     String tmp = apelatesListModel.get(j);
                     apelatesListModel.set(j, apelatesListModel.get(j+1));
                     apelatesListModel.set(j+1, tmp);         
                 }
             }
        } 
       return apelatesListModel;
    }
    // ---------------------------------------------------------------------------------------------------------------------------------------------------

}
