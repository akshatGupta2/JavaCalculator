/*
 * Copyright 2024 Akshat Gupta <akshat2032003@gmail.com>
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
// A simple GUI Calculator using javax.swing
package mail.akshat.calc;

import java.awt.Image;
import javax.swing.ImageIcon;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Akshat Gupta
 */
public class Calci extends javax.swing.JFrame {

    /**
     * Creates new form Calci
     */
    public Calci() {
        initComponents();
        Image i = new ImageIcon(this.getClass().getResource("c.png"), "ddfsdf").getImage();
        this.setIconImage(i);
    }
    
    double s1 = Double.MAX_VALUE;
    double s2 = Double.MAX_VALUE;
    int choice = -1;
    
    public void enterSymbol(String q) {
        firstNum.setText(firstNum.getText() + q);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        firstNum = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        mulBtn = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        clrBtn = new javax.swing.JButton();
        squareBtn = new javax.swing.JButton();
        rootBtn = new javax.swing.JButton();
        invBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        bkspBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        pminBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        percentBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        eqBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        modBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        firstNum.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        firstNum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addBtn.setText("+");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        subBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        subBtn.setText("-");
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });

        mulBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        mulBtn.setText("*");
        mulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulBtnActionPerformed(evt);
            }
        });

        divBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        divBtn.setText("/");
        divBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtnActionPerformed(evt);
            }
        });

        clrBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clrBtn.setText("clr");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });

        squareBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        squareBtn.setText("x^2");
        squareBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareBtnActionPerformed(evt);
            }
        });

        rootBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rootBtn.setText("sqrt()");
        rootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootBtnActionPerformed(evt);
            }
        });

        invBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        invBtn.setText("1/x");
        invBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invBtnActionPerformed(evt);
            }
        });

        sevenBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        eightBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        eightBtn.setText("8");
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });

        nineBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nineBtn.setText("9");
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });

        bkspBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bkspBtn.setText("bksp");
        bkspBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkspBtnActionPerformed(evt);
            }
        });

        fourBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fourBtn.setText("4");
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });

        fiveBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });

        sixBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sixBtn.setText("6");
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });

        pminBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pminBtn.setText("+/-");
        pminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pminBtnActionPerformed(evt);
            }
        });

        twoBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        twoBtn.setText("2");
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });

        threeBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        threeBtn.setText("3");
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });

        percentBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        percentBtn.setText("%");
        percentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentBtnActionPerformed(evt);
            }
        });

        oneBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        oneBtn.setText("1");
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });

        zeroBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });

        eqBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        eqBtn.setText("=");
        eqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqBtnActionPerformed(evt);
            }
        });

        dotBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dotBtn.setText(".");
        dotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBtnActionPerformed(evt);
            }
        });

        modBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        modBtn.setText("mod");
        modBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNum)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mulBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(squareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dotBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bkspBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(firstNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(subBtn)
                    .addComponent(mulBtn)
                    .addComponent(divBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrBtn)
                    .addComponent(squareBtn)
                    .addComponent(rootBtn)
                    .addComponent(invBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sevenBtn)
                    .addComponent(eightBtn)
                    .addComponent(nineBtn)
                    .addComponent(bkspBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourBtn)
                    .addComponent(fiveBtn)
                    .addComponent(sixBtn)
                    .addComponent(pminBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneBtn)
                    .addComponent(twoBtn)
                    .addComponent(threeBtn)
                    .addComponent(percentBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroBtn)
                    .addComponent(eqBtn)
                    .addComponent(dotBtn)
                    .addComponent(modBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try {
            choice = 0;
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText("");
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                      

    private void mulBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try {
            choice = 1;
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText("");
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                      

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try {
            choice = 2;
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText("");
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                      

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        firstNum.setText("");
    }                                      

    private void squareBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
        try {
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText(String.valueOf(Math.pow(s1, 2)));
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                         

    private void rootBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText(String.valueOf(Math.sqrt(s1)));
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                       

    private void invBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try {
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText(String.valueOf(1/s1));
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                      

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        enterSymbol("7");
    }                                        

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        enterSymbol("8");
    }                                        

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        enterSymbol("9");
    }                                       

    private void bkspBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String t = firstNum.getText();
        if (t.equals("Invalid length"))
            firstNum.setText("");
        else if (t.length() > 1)
            firstNum.setText(t.substring(0, t.length()-1));
        else
            firstNum.setText("Invalid length");
    }                                       

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        enterSymbol("4");
    }                                       

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        enterSymbol("5");
    }                                       

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        enterSymbol("6");
    }                                      

    private void pminBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try {
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText(String.valueOf(-s1));
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                       

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        enterSymbol("2");
    }                                      

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        enterSymbol("3");
    }                                        

    private void percentBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try {
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText(String.valueOf(s1/100));
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                          

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        enterSymbol("1");
    }                                      

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        enterSymbol("0");
    }                                       

    private void eqBtnActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        int tc = choice;
        choice = -1;
        if (s1 == Double.MAX_VALUE) {
            firstNum.setText("Enter the first number first");
        }
        else {
            try {
                s2 = Double.parseDouble(firstNum.getText());
                if (tc == 0) firstNum.setText(String.valueOf(s1-s2));
                else if (tc == 0) firstNum.setText(String.valueOf(s1-s2));
                else if (tc == 1) firstNum.setText(String.valueOf(s1*s2));
                else if (tc == 2) firstNum.setText(String.valueOf(s1/s2));
                else if (tc == 3) firstNum.setText(String.valueOf(s1+s2));
                else if (tc == 0) firstNum.setText(String.valueOf(s1%s2));
                s1 = s2 = Double.MAX_VALUE;
            }
            catch(IllegalArgumentException iae) {
                firstNum.setText("Invalid second number");
            }
        }
    }                                     

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        enterSymbol(".");
    }                                      

    private void modBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try {
            choice = 4;
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText("");
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                      

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try {
            choice = 3;
            s1 = Double.parseDouble(firstNum.getText());
            firstNum.setText("");
        }
        catch (NumberFormatException e) {
            firstNum.setText("Invalid Number");
        }
    }                                      

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
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addBtn;
    private javax.swing.JButton bkspBtn;
    private javax.swing.JButton clrBtn;
    private javax.swing.JButton divBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton eqBtn;
    private javax.swing.JTextField firstNum;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JButton invBtn;
    private javax.swing.JButton modBtn;
    private javax.swing.JButton mulBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton percentBtn;
    private javax.swing.JButton pminBtn;
    private javax.swing.JButton rootBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton squareBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration                   
}
