
package MAIN;

// importted classes //

import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//                        //

public class LoginUI extends javax.swing.JFrame {

    // initialized Private static variables
    
    private static String UIusername, UIpassword, UItype ;
    
    private static JSONArray user_archive = new JSONArray() ;
    private static JSONParser parser = new JSONParser() ;
    private static JSONObject changed_archive = new JSONObject();
    
    private static String file_path = "src\\MAIN\\users.json" ;
    
    public LoginUI() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameUI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        passwordUI = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        jLabel2.setText("Enter Username :");

        jLabel3.setText("Enter Password :");

        usernameUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameUIActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(228, 228, 228))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameUI, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(passwordUI)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton1)
                        .addGap(117, 117, 117)
                        .addComponent(jButton2)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(96, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // the algorithm for the login button //
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        System.out.println("Ready...") ;
        
        try {  // try and catch where the program will process the username and password the user inpuuted in the Jpanel
               // and compare them to the JSON file if any element will match with one
            
            UIusername = usernameUI.getText() ; // varibales that get the inputted texts in the text field
            UIpassword = passwordUI.getText() ;
            
            filecheck() ; //filecheck() ; // the prompt for the File reader program void
            
            String member = "member" ;
            String admin = "admin" ;
            int passed = 0 ;
            int passed_type = 0 ;
            
            for (int a = 0; a < user_archive.size(); a++) { // iteration for the size of the Jsonfile which will come useful
                
                JSONObject userobject = (JSONObject) user_archive.get(a);
                
                    userobject.get("username") ;
                    userobject.get("password") ;
                    userobject.get("type") ;
                        
                    if (UIusername.equals(userobject.get("username")) && UIpassword.equals(userobject.get("password")) && admin.equals(userobject.get("type"))) {
                        // A code that will detect if the user's input is similar to a account in json and has admin it will grant access to the admin panel
                        System.out.println("Username: " + userobject.get("username"));
                        System.out.println("Password: " + userobject.get("password"));
                        System.out.println("Type: " + userobject.get("type"));
                        
                        passed = 1 ; // The "key" to access the admin panel
                        passed_type = 1 ;
                       
                    }
                    else if (UIusername.equals(userobject.get("username")) && UIpassword.equals(userobject.get("password")) && member.equals(userobject.get("type"))) {
                        // A code that will detect if the user's input is similar to a account in json and has member type it will grant access to the member panel
                        System.out.println("Username: " + userobject.get("username"));
                        System.out.println("Password: " + userobject.get("password"));
                        System.out.println("Type: " + userobject.get("type"));
                        
                        passed = 1 ; // The "key" to access the memebr panel
                        passed_type = 0 ;
                        
                    }
                    
                    if (passed == 1 && passed_type == 1) { // the requirements to unlock admin panel
                        
                        setVisible(false) ;
                        
                        Welcome2 adminUI = new Welcome2() ;
                        adminUI.setVisible(true) ;
                        
                        
                        System.out.println(passed + ", " + passed_type);
                        System.out.println("You did it!!!!");
                    break ;
                        
                    } 
                    else if (passed == 1 && passed_type == 0) { // the requirements to unlock member panel
                        
                        setVisible(false) ;
                        
                        Welcome memberUI = new Welcome() ;
                        memberUI.setVisible(true) ;
                        
                        System.out.println(passed + ", " + passed_type);
                        System.out.println("Something went wrong") ;
                    break ;
                        
                      
                    }
                    
                    
            }       
                    
                    
                      
            
              
        } catch (IOException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static String getuname() {
        
        return UIusername ; // a variable that will contain UIusername string value
        
    }
    
    private void usernameUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameUIActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        // The code for erasing the text field in the Main login window
        usernameUI.setText("") ;
        passwordUI.setText("") ;
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordUI;
    private javax.swing.JTextField usernameUI;
    // End of variables declaration//GEN-END:variables

 public static void filecheck() throws FileNotFoundException, IOException, ParseException{ // the code for detetcing aand finding the json file for changes
    
     // The filereader that will you guess it will read the where the JSON file is
     
       FileReader reader = new FileReader(file_path);
        
        if(reader.ready())
        {
            
            Scanner sc = new Scanner(reader);
            String line="";
            
            while (sc.hasNext())
            {
                line = line + sc.nextLine();
            }
            
            if(!line.equals(""))
            {
            
                reader.close();
                FileReader reader2 = new FileReader(file_path);
                changed_archive = (JSONObject) parser.parse(reader2);
                user_archive = (JSONArray) changed_archive.get("users");
                reader2.close();
            }
            
        }
          
 }
 
 
 }
