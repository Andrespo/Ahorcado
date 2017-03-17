/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author Estudiantes
 */
public class Tablero extends javax.swing.JFrame {
    int vidas=8;
    int resultado;
    char[] caracter= new char[10];
    Ahorcado miAhorcado= new Ahorcado();
        
    void SelecPalabra(){
    
    caracter[0]='l';
    caracter[1]='a';
    caracter[2]='m';
    caracter[3]='b';
    caracter[4]='o';
    caracter[5]='r'; 
    caracter[6]='h';
    caracter[7]='i';
    caracter[8]='n';
    caracter[9]='i';
    
    }
    int Verificar(char letra){
        int a=0;
        for(int i=0;i<10;i++){
            if(caracter[i]==letra){
                marcar(i,letra);
                a=1;
            }
            }
        if(a==0){
            vidas--;
        }
        return a;      
    }
    void marcar(int posicion, char letra){
        switch(posicion){
            case 0: this.Letra0.setText(String.valueOf(letra)); break;
            case 1: this.Letra1.setText(String.valueOf(letra)); break;
            case 2: this.Letra2.setText(String.valueOf(letra)); break;
            case 3: this.Letra3.setText(String.valueOf(letra)); break;
            case 4: this.Letra4.setText(String.valueOf(letra)); break;
            case 5: this.Letra5.setText(String.valueOf(letra)); break;
            case 6: this.Letra6.setText(String.valueOf(letra)); break;
            case 7: this.Letra7.setText(String.valueOf(letra)); break;
            case 8: this.Letra8.setText(String.valueOf(letra)); break;
            case 9: this.Letra9.setText(String.valueOf(letra)); break;
          
        }
    }
    public Tablero() {
        
        SelecPalabra();
        initComponents();
      }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Letra0 = new javax.swing.JTextField();
        Letra1 = new javax.swing.JTextField();
        Letra2 = new javax.swing.JTextField();
        Letra3 = new javax.swing.JTextField();
        Letra4 = new javax.swing.JTextField();
        Letra5 = new javax.swing.JTextField();
        Letra6 = new javax.swing.JTextField();
        Letra7 = new javax.swing.JTextField();
        Letra8 = new javax.swing.JTextField();
        Letra9 = new javax.swing.JTextField();
        Ingresar = new javax.swing.JTextField();
        BotonJugar = new javax.swing.JButton();
        Vidas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        Letra0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra0ActionPerformed(evt);
            }
        });

        Letra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra1ActionPerformed(evt);
            }
        });

        Letra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra2ActionPerformed(evt);
            }
        });

        Letra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra3ActionPerformed(evt);
            }
        });

        Letra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra4ActionPerformed(evt);
            }
        });

        Letra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra5ActionPerformed(evt);
            }
        });

        Letra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra6ActionPerformed(evt);
            }
        });

        Letra7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra7ActionPerformed(evt);
            }
        });

        Letra8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra8ActionPerformed(evt);
            }
        });

        Letra9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Letra9ActionPerformed(evt);
            }
        });

        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        BotonJugar.setBackground(new java.awt.Color(255, 255, 255));
        BotonJugar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BotonJugar.setText("JUGAR");
        BotonJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonJugarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Sus vidas:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Letras:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(Vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BotonJugar)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Letra0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Letra1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Letra2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Letra5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Letra6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Letra7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Letra8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Letra9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(BotonJugar)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Letra0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Letra9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Letra0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra0ActionPerformed

    private void Letra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra1ActionPerformed

    private void Letra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra2ActionPerformed

    private void Letra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra3ActionPerformed

    private void Letra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra4ActionPerformed

    private void Letra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra5ActionPerformed

    private void Letra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra6ActionPerformed

    private void Letra7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra7ActionPerformed

    private void Letra8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra8ActionPerformed

    private void Letra9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Letra9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Letra9ActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarActionPerformed

    private void BotonJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJugarMouseClicked

        this.miAhorcado.letras=this.Ingresar.getText().charAt(0);
        this.Verificar(this.miAhorcado.letras);
        this.Vidas.setText(String.valueOf(vidas));
// TODO add your handling code here:
    }//GEN-LAST:event_BotonJugarMouseClicked

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonJugar;
    private javax.swing.JTextField Ingresar;
    private javax.swing.JTextField Letra0;
    private javax.swing.JTextField Letra1;
    private javax.swing.JTextField Letra2;
    private javax.swing.JTextField Letra3;
    private javax.swing.JTextField Letra4;
    private javax.swing.JTextField Letra5;
    private javax.swing.JTextField Letra6;
    private javax.swing.JTextField Letra7;
    private javax.swing.JTextField Letra8;
    private javax.swing.JTextField Letra9;
    private javax.swing.JLabel Vidas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
