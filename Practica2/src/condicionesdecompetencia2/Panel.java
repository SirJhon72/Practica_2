/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionesdecompetencia2;

import javax.swing.text.html.HTML;

/**
 *
 * @author jgonz
 */
public class Panel extends javax.swing.JFrame {
    
    
    public Panel() {
        initComponents();
        //Creamos nuestros hilos y rc
        rc = new RC();
        h1 = new Hilo(JArea_H1, rc);
        h1.setName("Hilo 1");
        
        h2 = new Hilo(JArea_H2, rc);
        h2.setName("Hilo 2");
        
        h3 = new Hilo(JArea_H3, rc);
        h3.setName("Hilo 3");
        
        h4 = new Hilo(JArea_H4, rc);
        h4.setName("Hilo 4");
        
        Pausa.setEnabled(false);
        Reanudar.setEnabled(false);
        Detener.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Correr = new javax.swing.JButton();
        Pausa = new javax.swing.JButton();
        Reanudar = new javax.swing.JButton();
        Detener = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JArea_H1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        JArea_H2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        JArea_H4 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        JArea_H3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Correr.setText("Correr");
        Correr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrerActionPerformed(evt);
            }
        });

        Pausa.setText("Pausar");
        Pausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausaActionPerformed(evt);
            }
        });

        Reanudar.setText("Reanudar");
        Reanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReanudarActionPerformed(evt);
            }
        });

        Detener.setText("Detener");
        Detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetenerActionPerformed(evt);
            }
        });

        JArea_H1.setColumns(20);
        JArea_H1.setRows(5);
        jScrollPane1.setViewportView(JArea_H1);

        JArea_H2.setColumns(20);
        JArea_H2.setRows(5);
        jScrollPane2.setViewportView(JArea_H2);

        JArea_H4.setColumns(20);
        JArea_H4.setRows(5);
        jScrollPane3.setViewportView(JArea_H4);

        JArea_H3.setColumns(20);
        JArea_H3.setRows(5);
        jScrollPane4.setViewportView(JArea_H3);

        jLabel1.setText("Hilo1");

        jLabel2.setText("Hilo2");

        jLabel3.setText("Hilo3");

        jLabel4.setText("Hilo4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Reanudar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Correr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Detener, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Correr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pausa)
                        .addGap(13, 13, 13)
                        .addComponent(Reanudar)
                        .addGap(18, 18, 18)
                        .addComponent(Detener)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrerActionPerformed
        h1.start();
        h2.start();
        h3.start();
        h4.start();   
        Correr.setEnabled(false);
        Pausa.setEnabled(true);
        Detener.setEnabled(true);
    }//GEN-LAST:event_CorrerActionPerformed

    private void PausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausaActionPerformed
        h1.pausarHilo();
        h2.pausarHilo();
        h3.pausarHilo();
        h4.pausarHilo();
        
        Pausa.setEnabled(false);
        Reanudar.setEnabled(true);        
    }//GEN-LAST:event_PausaActionPerformed

    private void ReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReanudarActionPerformed
        h1.reanudarHilo();
        h2.reanudarHilo();
        h3.reanudarHilo();
        h4.reanudarHilo();
        Pausa.setEnabled(true);
        Reanudar.setEnabled(false);
    }//GEN-LAST:event_ReanudarActionPerformed

    private void DetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetenerActionPerformed
        h1.detenerHilo();
        h2.detenerHilo();
        h3.detenerHilo();
        h4.detenerHilo();
        Pausa.setEnabled(false);
        Reanudar.setEnabled(false);
    }//GEN-LAST:event_DetenerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Correr;
    private javax.swing.JButton Detener;
    private javax.swing.JTextArea JArea_H1;
    private javax.swing.JTextArea JArea_H2;
    private javax.swing.JTextArea JArea_H3;
    private javax.swing.JTextArea JArea_H4;
    private javax.swing.JButton Pausa;
    private javax.swing.JButton Reanudar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    Hilo h1,h2,h3,h4;
    RC rc;
}
