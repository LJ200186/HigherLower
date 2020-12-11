/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package higherlower;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class HigherLowerGUI extends javax.swing.JFrame {

    public static String[] cardFace = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static String[] suit = {"D","H","S","C"};
    
    public String CurrCard = "";
    public int Total = 0;
    
    
    public HigherLowerGUI() {
        initComponents();
        
        CurrCard = getNextCard();
    }
    
    public String getNextCard(){
        
        Random random = new Random();
        
        String Card = cardFace[random.nextInt(13)]+ suit[random.nextInt(4)];
        
        ImageIcon CardImg = new javax.swing.ImageIcon(getClass().getResource("cards\\"+ Card + ".png"));
        
        CurCard.setIcon(new ImageIcon(CardImg.getImage().getScaledInstance(170, 240, Image.SCALE_DEFAULT)));
        
        return Card;
    }
    
    public int getFaceInt(String Card){
        
        String CardFFace = "" + Card.charAt(0);
        int pos = 0;
        
        for (int i = 0; i < 13; i++) {
            
            if (cardFace[i].equals(CardFFace)){
                pos = i;
                break;
                
            }
            
        }
        return pos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        CurCard = new javax.swing.JLabel();
        HigherB = new javax.swing.JButton();
        LowerB = new javax.swing.JButton();
        TotalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(1, 1, 1));
        setResizable(false);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel2.setText("Current Card:");

        CurCard.setMaximumSize(new java.awt.Dimension(135, 200));
        CurCard.setPreferredSize(new java.awt.Dimension(135, 200));

        HigherB.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        HigherB.setText("Higher");
        HigherB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HigherBActionPerformed(evt);
            }
        });

        LowerB.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        LowerB.setText("Lower");
        LowerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowerBActionPerformed(evt);
            }
        });

        TotalLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        TotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        TotalLabel.setText("Total: 0");

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(CurCard, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(HigherB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LowerB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TotalLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(CurCard, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HigherB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LowerB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CurCard, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(HigherB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LowerB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TotalLabel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HigherBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HigherBActionPerformed
        
        String NewCard = getNextCard();
        
        if(getFaceInt(NewCard) > getFaceInt(CurrCard)){
            
            Total++;
            TotalLabel.setText("Total: "+Integer.toString(Total));
        }else{
            Total--;
            TotalLabel.setText("Total: "+Integer.toString(Total));
        }
        
        CurrCard = NewCard;
        
    }//GEN-LAST:event_HigherBActionPerformed

    private void LowerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowerBActionPerformed
        
        String NewCard = getNextCard();
        
        if(getFaceInt(NewCard) < getFaceInt(CurrCard)){
            
            Total++;
            TotalLabel.setText("Total: "+Integer.toString(Total));
        }else{
            Total--;
            TotalLabel.setText("Total: "+Integer.toString(Total));
        }
        
        CurrCard = NewCard;
        
        
    }//GEN-LAST:event_LowerBActionPerformed

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
            java.util.logging.Logger.getLogger(HigherLowerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HigherLowerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HigherLowerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HigherLowerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HigherLowerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurCard;
    private javax.swing.JButton HigherB;
    private javax.swing.JButton LowerB;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
