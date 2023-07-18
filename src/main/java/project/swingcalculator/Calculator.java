package project.swingcalculator;

public class Calculator extends javax.swing.JFrame {

    private double v1 = 0;
    private double v2 = 0;
    private double vr = 0;
    private String op = "+";
    private boolean isEqualActive = false;

    public Calculator() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public void equalResetCalc() {
        if (isEqualActive) {
            v1 = 0;
            v2 = 0;
            vr = 0;
            op = "+";
            lblOperations.setText("");
            lblResult.setText("");
            isEqualActive = false;
        }
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

        rootPanel = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnErase = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblOperations = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        modeMenu = new javax.swing.JMenu();
        calculatorItem = new javax.swing.JMenuItem();
        moneyConverterItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setMinimumSize(new java.awt.Dimension(280, 400));

        rootPanel.setLayout(new java.awt.GridBagLayout());

        btn0.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn0, gridBagConstraints);

        btn1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn1, gridBagConstraints);

        btn2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn2, gridBagConstraints);

        btn3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn3, gridBagConstraints);

        btn4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn4, gridBagConstraints);

        btn5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn5, gridBagConstraints);

        btn6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn6, gridBagConstraints);

        btn7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn7, gridBagConstraints);

        btn8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn8, gridBagConstraints);

        btn9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btn9, gridBagConstraints);

        btnPlusMinus.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnPlusMinus.setText("±");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnPlusMinus, gridBagConstraints);

        btnC.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnC, gridBagConstraints);

        btnSqrt.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnSqrt.setText("√");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnSqrt, gridBagConstraints);

        btnDivision.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnDivision.setText("÷");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnDivision, gridBagConstraints);

        btnPlus.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnPlus, gridBagConstraints);

        btnMinus.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnMinus, gridBagConstraints);

        btnX.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnX.setText("x");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnX, gridBagConstraints);

        btnEquals.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnEquals, gridBagConstraints);

        btnDot.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnDot, gridBagConstraints);

        btnErase.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnErase.setText("Ce");
        btnErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        rootPanel.add(btnErase, gridBagConstraints);

        lblResult.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResult.setMinimumSize(new java.awt.Dimension(100, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        rootPanel.add(lblResult, gridBagConstraints);

        lblOperations.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOperations.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOperations.setMinimumSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        rootPanel.add(lblOperations, gridBagConstraints);

        modeMenu.setText("Mode");

        calculatorItem.setIcon(new javax.swing.ImageIcon("D:\\calculator icon.png")); // NOI18N
        calculatorItem.setText("Calculator");
        calculatorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorItemActionPerformed(evt);
            }
        });
        modeMenu.add(calculatorItem);

        moneyConverterItem.setIcon(new javax.swing.ImageIcon("D:\\converterImg.png")); // NOI18N
        moneyConverterItem.setText("Currency Converter");
        moneyConverterItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyConverterItemActionPerformed(evt);
            }
        });
        modeMenu.add(moneyConverterItem);
        modeMenu.add(jSeparator1);

        exitItem.setIcon(new javax.swing.ImageIcon("D:\\primary-exit.png")); // NOI18N
        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        modeMenu.add(exitItem);

        jMenuBar1.add(modeMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        equalResetCalc();
        if(!(lblResult.getText().equals("0")) && !(lblResult.getText().equals("")))
            lblResult.setText(lblResult.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        equalResetCalc();
        lblResult.setText(lblResult.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        v1 = 0;
        v2 = 0;
        vr = 0;
        op = "+";
        isEqualActive = false;
        lblOperations.setText("");
        lblResult.setText("");

    }//GEN-LAST:event_btnCActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        if (!isEqualActive) {
            if (!lblResult.getText().equals("")) {
                v2 = Double.parseDouble(lblResult.getText());
            } else {
                v2 = op.equals("+") || op.equals("-") ? 0 : 1;
            }
        } else {
            v2 = op.equals("+") || op.equals("-") ? 0 : 1;
            isEqualActive = false;
        }

        switch (op) {
            case "+" ->
                vr = v1 + v2;
            case "-" ->
                vr = v1 - v2;
            case "*" ->
                vr = v1 * v2;
            case "/" ->
                vr = v1 / v2;
        }

        lblOperations.setText((vr == (int) vr ? String.valueOf((int) vr) : String.valueOf(vr)) + " + ");
        lblResult.setText("");
        v1 = vr;
        op = "+";

    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        lblResult.setText(lblResult.getText() + ".");
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        if (!isEqualActive) {
            if (!lblResult.getText().equals("")) {
                v2 = Double.parseDouble(lblResult.getText());
            } else {
                v2 = 0;
            }
        }
        switch (op) {
            case "+" ->
                vr = v1 + v2;
            case "-" ->
                vr = v1 - v2;
            case "*" ->
                vr = v1 * v2;
            case "/" ->
                vr = v1 / v2;
        }

        lblOperations.setText((v1 == (int) v1 ? String.valueOf((int) v1) : String.valueOf(v1)) + " " + op + " " + (v2 == (int) v2 ? String.valueOf((int) v2) : String.valueOf(v2)) + " = ");
        lblResult.setText((vr == (int) vr ? String.valueOf((int) vr) : String.valueOf(vr)));
        v1 = vr;
        isEqualActive = true;


    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed

        if (!isEqualActive) {
            if (!lblResult.getText().equals("")) {
                v2 = Double.parseDouble(lblResult.getText());
            } else {
                v2 = op.equals("+") || op.equals("-") ? 0 : 1;
            }
        } else {
            v2 = op.equals("+") || op.equals("-") ? 0 : 1;
            isEqualActive = false;
        }

        switch (op) {
            case "+" ->
                vr = v1 + v2;
            case "-" ->
                vr = v1 - v2;
            case "*" ->
                vr = v1 * v2;
            case "/" ->
                vr = v1 / v2;
        }

        lblOperations.setText((vr == (int) vr ? String.valueOf((int) vr) : String.valueOf(vr)) + " - ");
        lblResult.setText("");
        v1 = vr;
        op = "-";


    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        if (!isEqualActive) {
            if (!lblResult.getText().equals("")) {
                v2 = Double.parseDouble(lblResult.getText());
            } else {
                v2 = op.equals("+") || op.equals("-") ? 0 : 1;
            }
        } else {
            v2 = op.equals("+") || op.equals("-") ? 0 : 1;
            isEqualActive = false;
        }

        switch (op) {
            case "+" ->
                vr = v1 + v2;
            case "-" ->
                vr = v1 - v2;
            case "*" ->
                vr = v1 * v2;
            case "/" ->
                vr = v1 / v2;
        }

        lblOperations.setText((vr == (int) vr ? String.valueOf((int) vr) : String.valueOf(vr)) + " x ");
        lblResult.setText("");
        v1 = vr;
        op = "*";
    }//GEN-LAST:event_btnXActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        if (!isEqualActive) {
            if (!lblResult.getText().equals("")) {
                v2 = Double.parseDouble(lblResult.getText());
            } else {
                v2 = op.equals("+") || op.equals("-") ? 0 : 1;
            }
        } else {
            v2 = op.equals("+") || op.equals("-") ? 0 : 1;
            isEqualActive = false;
        }

        switch (op) {
            case "+" ->
                vr = v1 + v2;
            case "-" ->
                vr = v1 - v2;
            case "*" ->
                vr = v1 * v2;
            case "/" ->
                vr = v1 / v2;
        }

        lblOperations.setText((vr == (int) vr ? String.valueOf((int) vr) : String.valueOf(vr)) + " / ");
        lblResult.setText("");
        v1 = vr;
        op = "/";
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseActionPerformed
        if (isEqualActive)
            equalResetCalc();
        else 
            lblResult.setText("");
    }//GEN-LAST:event_btnEraseActionPerformed

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed

        vr = Double.parseDouble(lblResult.getText()) * -1;
        lblResult.setText((vr == (int) vr ? String.valueOf((int) vr) : String.valueOf(vr)));
        v1 = vr;

    }//GEN-LAST:event_btnPlusMinusActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        lblOperations.setText("√(" + lblResult.getText() + ")");
        vr = Math.sqrt(Double.parseDouble(lblResult.getText()));
        lblResult.setText((vr == (int) vr ? String.valueOf((int) vr) : String.valueOf(vr)));
        v1 = vr;
        isEqualActive=true;
        
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void calculatorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorItemActionPerformed
        
    }//GEN-LAST:event_calculatorItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void moneyConverterItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyConverterItemActionPerformed
        System.out.println(evt);
        dispose();
        CurrencyConverter currency = new CurrencyConverter();
    }//GEN-LAST:event_moneyConverterItemActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnErase;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnX;
    private javax.swing.JMenuItem calculatorItem;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblOperations;
    private javax.swing.JLabel lblResult;
    private javax.swing.JMenu modeMenu;
    private javax.swing.JMenuItem moneyConverterItem;
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables
}
