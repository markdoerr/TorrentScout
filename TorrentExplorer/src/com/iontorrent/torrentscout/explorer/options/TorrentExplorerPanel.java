/*
 * Copyright (C) 2011 chantal.roth
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.iontorrent.torrentscout.explorer.options;

import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.openide.util.NbPreferences;

public final class TorrentExplorerPanel extends javax.swing.JPanel {

    private final TorrentExplorerOptionsPanelController controller;
    Preferences p;

    TorrentExplorerPanel(TorrentExplorerOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSpan = new javax.swing.JTextField();
        automatic = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtbins = new javax.swing.JTextField();
        norm = new javax.swing.JCheckBox();
        second = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.jPanel1.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.jLabel1.text")); // NOI18N

        txtSpan.setText(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.txtSpan.text")); // NOI18N
        txtSpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpanActionPerformed(evt);
            }
        });
        txtSpan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSpanFocusLost(evt);
            }
        });

        automatic.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(automatic, org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.automatic.text")); // NOI18N
        automatic.setToolTipText(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.automatic.toolTipText")); // NOI18N
        automatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automaticActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSpan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(automatic))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(automatic)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.jPanel2.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.jLabel3.text")); // NOI18N

        txtbins.setText(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.txtbins.text")); // NOI18N
        txtbins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbinsActionPerformed(evt);
            }
        });

        norm.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(norm, org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.norm.text")); // NOI18N
        norm.setOpaque(false);

        second.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(second, org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.second.text")); // NOI18N
        second.setToolTipText(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.second.toolTipText")); // NOI18N
        second.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtbins, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(norm)
                    .addComponent(second))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(norm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(second)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.jPanel3.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.jLabel2.text")); // NOI18N

        txtSize.setText(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.txtSize.text")); // NOI18N
        txtSize.setToolTipText(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.txtSize.toolTipText")); // NOI18N
        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });
        txtSize.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSizeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.jPanel4.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.jLabel4.text")); // NOI18N

        txtPath.setText(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.txtPath.text")); // NOI18N
        txtPath.setToolTipText(org.openide.util.NbBundle.getMessage(TorrentExplorerPanel.class, "TorrentExplorerPanel.txtPath.toolTipText")); // NOI18N
        txtPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathActionPerformed(evt);
            }
        });
        txtPath.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPathFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPath, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpanActionPerformed
        controller.changed();
    }//GEN-LAST:event_txtSpanActionPerformed

    private void txtSpanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSpanFocusLost
        controller.changed();
    }//GEN-LAST:event_txtSpanFocusLost

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        controller.changed();
    }//GEN-LAST:event_txtSizeActionPerformed

    private void txtSizeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSizeFocusLost
        controller.changed();
    }//GEN-LAST:event_txtSizeFocusLost

    private void txtbinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbinsActionPerformed
        controller.changed();
    }//GEN-LAST:event_txtbinsActionPerformed

    private void txtPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathActionPerformed

    private void txtPathFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPathFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathFocusLost

    private void automaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automaticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_automaticActionPerformed

    void load() {
        p = NbPreferences.forModule(TorrentExplorerPanel.class);
        this.txtSpan.setText(p.get("span", "" + 5));


        this.txtSize.setText(p.get("masksize", "" + 100));
        this.txtbins.setText(p.get("bins", "" + 100));
        second.setSelected(p.getBoolean("second", true));
        this.automatic.setSelected(p.getBoolean("automatic_nn", true));
        norm.setSelected(p.getBoolean("normalize", true));
        txtPath.setText(p.get("export_path", "/tmp"));
//        String func = p.get("medianfunction", "median");
//        p("Function is "+func);
//        if (func.equalsIgnoreCase("mode")) mode.setSelected(true);
//        else if (func.equalsIgnoreCase("mean")) mean.setSelected(true);
//        else  median.setSelected(true);
    }

    void store() {
        p.put("export_path", txtPath.getText());
        p.put("span", "" + getInt(txtSpan));

        int size = getInt(txtSize);
        if (size < 10) {
            int ans = JOptionPane.showConfirmDialog(this, size + " is a bit small for the <b>mask size</b>, 100 is the default, and I will use nothing smaller than 10.\n"
                    + "Do you want to use the default 100 instead?", "Small value",  JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            size = Math.max(size, 10);
            if (ans == JOptionPane.OK_OPTION) {
                size = 100;
            }
        } else if (size > 200) {

            long tot = size * size;
            long tot1 = tot*220;
            int ans = JOptionPane.showConfirmDialog(this, "<html>"+size + " is a bit large for the <b>mask size</b>, 100 is the default."
                    + "<br>You know that this means it will load <b>" + tot + " x nr frames</b> data points,"
                    + "<br>So for 220 frames this would be <b>" + tot1 + "</b> data points (<b>"+tot1/1000000+" million</b>)"
                    + "<br>If your computer has lots of memory, AND you give Java a lot of memory, that is probably ok.<br>"
                    + "Do you want to really use <b>" + size + "</b>? (Cancel to use the default instead)</html>", "Large value", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

            if (ans != JOptionPane.OK_OPTION) {
                size = 100;
            }

        }
        p.put("masksize", "" + size);
        
        size = getInt(txtbins);
        
        if (size < 10) {
            int ans = JOptionPane.showConfirmDialog(this, size + " is a bit small for the nr of BINS, 100 is the default, and I will use nothing smaller than 10.\n"
                    + "Do you want to use the default 100 instead?", "Small value",  JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            size = Math.max(size, 10);
            if (ans == JOptionPane.OK_OPTION) {
                size = 100;
            }
        } else if (size > 200) {

           
            int ans = JOptionPane.showConfirmDialog(this, "<html>"+size + " is a bit large for the nr of BINS, 100 is the default."
                    + "<br>With such a large value, the histogram might look noisy - especially if there are not many wells in your selected mask<br>"
                    +" or if there are lot of different values<br>"
                    + "Do you want to really use <b>" + size + "</b>? (Cancel to use the default instead)</html>", "Large value", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);

            if (ans != JOptionPane.OK_OPTION) {
                size = 100;
            }

        }
        p.put("bins", "" +size);
        
        p.putBoolean("second", second.isSelected());
        p.putBoolean("normalize", norm.isSelected());
        p.putBoolean("automatic_nn", automatic.isSelected());
        
//        String func = "median";
//        if (mode.isSelected()) func = "mode";
//        else if (mean.isSelected()) func = "mean";
//        p("Function is "+func);
//        p.put("medianfunction", func);
    }

    private void p(String s) {
        System.out.println("Explorer options: " + s);
    }

    private int getInt(JTextField txt) {
        if (txt.getText() == null) {
            return 0;
        }
        int i = 0;
        try {
            i = Integer.parseInt(txt.getText());
        } catch (Exception e) {
        }
        return i;
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox automatic;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox norm;
    private javax.swing.JCheckBox second;
    private javax.swing.JTextField txtPath;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSpan;
    private javax.swing.JTextField txtbins;
    // End of variables declaration//GEN-END:variables
}
