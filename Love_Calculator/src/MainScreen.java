import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;


public class MainScreen extends javax.swing.JFrame {
    
    private JPanel contentPane;
    private JTextField maleName;
    private JTextField femaleName;
    private JTextField resultDisplay;
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		maleName = new JTextField();
		maleName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		maleName.setForeground(Color.RED);
		maleName.setBounds(164, 9, 174, 29);
		contentPane.add(maleName);
		maleName.setColumns(10);
		
		femaleName = new JTextField();
		femaleName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		femaleName.setForeground(Color.RED);
		femaleName.setBounds(164, 173, 174, 29);
		femaleName.setBackground(Color.WHITE);
		contentPane.add(femaleName);
		femaleName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Male");
		lblNewLabel.setBounds(34, 11, 120, 26);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblFemale = new JLabel("Female");
		lblFemale.setBounds(34, 174, 120, 29);
		lblFemale.setForeground(Color.RED);
		lblFemale.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblFemale);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(164, 43, 174, 125);
		Image img4 = new ImageIcon(this.getClass().getResource("/Heart.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img4));
		contentPane.add(lblNewLabel_1);
		
		resultDisplay = new JTextField();
		resultDisplay.setEditable(false);
		resultDisplay.setBackground(Color.WHITE);
		resultDisplay.setForeground(new Color(255, 0, 0));
		resultDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		resultDisplay.setFont(new Font("Times New Roman", Font.BOLD, 25));
		resultDisplay.setBounds(223, 73, 58, 62);
		contentPane.add(resultDisplay);
		resultDisplay.setColumns(10);
        //initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuite = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnNewButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQuite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuite.setText("Quite");
        btnQuite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuiteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnNewButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNewButton.setText("Calculator");
        btnNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Male");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Female");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(btnNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuite)
                    .addComponent(btnReset)
                    .addComponent(btnNewButton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        /*JButton btnNewButton = new JButton("Calculate");
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	btnNewButton.setForeground(Color.RED);
	btnNewButton.setBounds(299, 227, 125, 23);
	Image img3 = new ImageIcon(this.getClass().getResource("/loveee.png")).getImage();
	btnNewButton.setIcon(new ImageIcon(img3));
	btnNewButton.setBackground(Color.WHITE);*/
    private void btnNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewButtonActionPerformed
        try{
		BufferedReader bufferreader = new BufferedReader (new InputStreamReader(System.in));
		String male = maleName.getText();
		String female = femaleName.getText();
	
		int sum1 = 0, sum2 = 0;
		for(int i=0;i<male.length();i++)
                {
                    char ch = male.charAt(i);
                    int ascii = ch;
                    sum1 = sum1+ascii;
		}
                for(int i=0;i<female.length();i++)
                {
                    char ch = female.charAt(i);
                    int ascii = ch;
                    sum2 = sum2+ascii;
		}
					
		int total = sum1+sum2;
                int loveparse = total%100;
					
		if(maleName.getText().equals("")) 
                {
                    JOptionPane.showMessageDialog(null,"Enter Male Name");
		}
                
		else if(femaleName.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Enter Female Name");
		}
		else
		{
                    resultDisplay.setText(""+loveparse + "" + "%");
		}

            }
        catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null,"Enter a Valid Input");
            }
	
        contentPane.add(btnNewButton);
        JButton btnNewButton = new JButton("Calculate");
	btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	btnNewButton.setForeground(Color.RED);
	btnNewButton.setBounds(299, 227, 125, 23);
	Image img3 = new ImageIcon(this.getClass().getResource("/loveee.png")).getImage();
	btnNewButton.setIcon(new ImageIcon(img3));
	btnNewButton.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnNewButtonActionPerformed

    private void btnQuiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuiteActionPerformed
        System.exit(0);
        
        btnQuite.setBackground(Color.WHITE);
	contentPane.add(btnQuite);
        
        JButton btnQuite = new JButton("Quite");
	btnQuite.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	btnQuite.setForeground(Color.RED);
	btnQuite.setBounds(34, 227, 110, 23);
	Image img1 = new ImageIcon(this.getClass().getResource("/loveee.png")).getImage();
	btnQuite.setIcon(new ImageIcon(img1));
    }//GEN-LAST:event_btnQuiteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        maleName.setText(null);
	femaleName.setText(null);
	resultDisplay.setText(null);
        
        btnReset.setBackground(Color.WHITE);
	contentPane.add(btnReset);
		
	JButton btnReset = new JButton("Reset");
        btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	btnReset.setForeground(Color.RED);
	btnReset.setBounds(164, 227, 113, 23);
	Image img2 = new ImageIcon(this.getClass().getResource("/loveee.png")).getImage();
	btnReset.setIcon(new ImageIcon(img2));
        
    }//GEN-LAST:event_btnResetActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                try {
                        MainScreen frame = new MainScreen();
			frame.setVisible(true);
                    }
                catch (Exception e)
                    {
                       e.printStackTrace();
                    }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewButton;
    private javax.swing.JButton btnQuite;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
