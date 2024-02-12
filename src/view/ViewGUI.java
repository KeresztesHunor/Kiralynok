package view;

public class ViewGUI extends javax.swing.JFrame
{
    public ViewGUI()
    {
        initComponents();
        setVisible(true);
    }
    
    public void megjelenit(char[][] t, int uresSorokSama, int uresOszlopokSzama)
    {
        String sorok = "";
        for (int i = 0; i < t.length; i++)
        {
            for (int ii = 0; ii < t[i].length; ii++)
            {
                sorok += t[i][ii];
            }
            sorok += "\n";
        }
        textArea.setText(sorok);
        uresOszlopokDbLabel.setText("" + uresOszlopokSzama);
        uresSorokDbLabel.setText("" + uresSorokSama);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        uresOszlopokSzamaLabel = new javax.swing.JLabel();
        uresSorokSzamaLabel = new javax.swing.JLabel();
        uresOszlopokDbLabel = new javax.swing.JLabel();
        uresSorokDbLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(256, 320));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        uresOszlopokSzamaLabel.setText("Üres oszlopok száma:");

        uresSorokSzamaLabel.setText("Üres sorok száma:");

        uresOszlopokDbLabel.setText("0");

        uresSorokDbLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uresOszlopokSzamaLabel)
                            .addComponent(uresSorokSzamaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uresSorokDbLabel)
                            .addComponent(uresOszlopokDbLabel))
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uresOszlopokSzamaLabel)
                    .addComponent(uresOszlopokDbLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uresSorokSzamaLabel)
                    .addComponent(uresSorokDbLabel))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel uresOszlopokDbLabel;
    private javax.swing.JLabel uresOszlopokSzamaLabel;
    private javax.swing.JLabel uresSorokDbLabel;
    private javax.swing.JLabel uresSorokSzamaLabel;
    // End of variables declaration//GEN-END:variables
}
