/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author HP
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        newac = new javax.swing.JMenuItem();
        off = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        mod = new javax.swing.JMenuItem();
        del = new javax.swing.JMenuItem();
        sbacc = new javax.swing.JMenuItem();
        sbnm = new javax.swing.JMenuItem();
        view = new javax.swing.JMenuItem();
        ministate = new javax.swing.JMenuItem();
        transact = new javax.swing.JMenu();
        depo = new javax.swing.JMenuItem();
        with = new javax.swing.JMenuItem();
        trans = new javax.swing.JMenuItem();
        profile = new javax.swing.JMenu();
        editp = new javax.swing.JMenuItem();
        editsec = new javax.swing.JMenuItem();
        chgpass = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 3, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bank-PO-2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        file.setText("File");

        newac.setText("Open New Account");
        newac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newacActionPerformed(evt);
            }
        });
        file.add(newac);

        off.setText("LogOff");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });
        file.add(off);

        jMenuBar1.add(file);

        edit.setText("Edit");

        mod.setText("Modify");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        edit.add(mod);

        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        edit.add(del);

        sbacc.setText("Search By Acc No");
        sbacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbaccActionPerformed(evt);
            }
        });
        edit.add(sbacc);

        sbnm.setText("Search By Name");
        sbnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbnmActionPerformed(evt);
            }
        });
        edit.add(sbnm);

        view.setText("View All");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        edit.add(view);

        ministate.setText("View Mini Statement");
        ministate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ministateActionPerformed(evt);
            }
        });
        edit.add(ministate);

        jMenuBar1.add(edit);

        transact.setText("Transaction");

        depo.setText("Deposit");
        depo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depoActionPerformed(evt);
            }
        });
        transact.add(depo);

        with.setText("Withdraw");
        with.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withActionPerformed(evt);
            }
        });
        transact.add(with);

        trans.setText("Transfer");
        trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transActionPerformed(evt);
            }
        });
        transact.add(trans);

        jMenuBar1.add(transact);

        profile.setText("Profile");

        editp.setText("Edit Profile");
        editp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpActionPerformed(evt);
            }
        });
        profile.add(editp);

        editsec.setText("Edit Security Settings");
        editsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsecActionPerformed(evt);
            }
        });
        profile.add(editsec);

        chgpass.setText("Change The Password");
        chgpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpassActionPerformed(evt);
            }
        });
        profile.add(chgpass);

        jMenuBar1.add(profile);

        help.setText("Help");

        about.setText("About The Software");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

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

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        delete dele=new delete();
        dele.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_delActionPerformed

    private void newacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newacActionPerformed
        // TODO add your handling code here:
        newacc y=new newacc();
        y.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_newacActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_offActionPerformed

    private void sbaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbaccActionPerformed
        // TODO add your handling code here:
        searchbyacc nw=new searchbyacc();
        nw.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_sbaccActionPerformed

    private void sbnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbnmActionPerformed
        // TODO add your handling code here:
        searchbynm nn=new searchbynm();
        nn.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_sbnmActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:
        modify modi=new modify();
        modi.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_modActionPerformed

    private void editpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpActionPerformed
        // TODO add your handling code here:
        editprof pro=new editprof();
        pro.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_editpActionPerformed

    private void chgpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpassActionPerformed
        // TODO add your handling code here:
        changepass ss=new changepass();
        ss.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_chgpassActionPerformed

    private void editsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsecActionPerformed
        // TODO add your handling code here:
        edit_sec se=new edit_sec();
        se.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_editsecActionPerformed

    private void depoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depoActionPerformed
        // TODO add your handling code here:
        deposit u=new deposit();
        u.setVisible(true);
        this.pack();
        this.dispose();
    }//GEN-LAST:event_depoActionPerformed

    private void withActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withActionPerformed
        // TODO add your handling code here:
        withdraw w=new withdraw();
        w.setVisible(true);
        this.pack();
        this.dispose();
    }//GEN-LAST:event_withActionPerformed

    private void transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transActionPerformed
        // TODO add your handling code here:
        transfer tran=new transfer();
        tran.setVisible(true);
        this.pack();
        this.dispose();
    }//GEN-LAST:event_transActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        about abt=new about();
        abt.setVisible(true);
        this.pack();
        this.dispose();
    }//GEN-LAST:event_aboutActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        view i=new view();
        i.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_viewActionPerformed

    private void ministateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ministateActionPerformed
        // TODO add your handling code here:
         minist t=new minist();
        t.setVisible(true);
        this.pack(); this.dispose();
    }//GEN-LAST:event_ministateActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem chgpass;
    private javax.swing.JMenuItem del;
    private javax.swing.JMenuItem depo;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem editp;
    private javax.swing.JMenuItem editsec;
    private javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem ministate;
    private javax.swing.JMenuItem mod;
    private javax.swing.JMenuItem newac;
    private javax.swing.JMenuItem off;
    private javax.swing.JMenu profile;
    private javax.swing.JMenuItem sbacc;
    private javax.swing.JMenuItem sbnm;
    private javax.swing.JMenuItem trans;
    private javax.swing.JMenu transact;
    private javax.swing.JMenuItem view;
    private javax.swing.JMenuItem with;
    // End of variables declaration//GEN-END:variables
}
