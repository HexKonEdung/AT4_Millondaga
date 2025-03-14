
package MAIN;

//imports

import static MAIN.AddAccount.filecheck;
import static MAIN.AddAccount.savefile;
import static MAIN.AddAccount.userCheck;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UpdateAccountDetails extends javax.swing.JFrame {

    private static String UIusername, UIpassword, UIType ; // UI username will be only used for updating one account's username and will be work inprogress
    
    private static JSONArray user_archive = new JSONArray() ;
    private static JSONParser parser = new JSONParser() ;
    private static JSONObject changed_archive = new JSONObject();
    
    
    private static String file_path = "src\\MAIN\\users.json" ;
    
    
    public UpdateAccountDetails() {
        initComponents();
        
        Accountlabel.setText("Cuurent Updating Account Details: " + UpdateAccount.getuname()) ; // A message showing what username account your updating
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Accountlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        membertype = new javax.swing.JRadioButton();
        adminbutton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter New Username : ");

        jLabel6.setText("Enter New Password : ");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(membertype);
        membertype.setText("member");
        membertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membertypeActionPerformed(evt);
            }
        });

        buttonGroup1.add(adminbutton);
        adminbutton.setText("admin");
        adminbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jButton1))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(username)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton2)))
                .addGap(225, 225, 225))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(membertype)
                            .addComponent(adminbutton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Accountlabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Accountlabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(adminbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(membertype)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbuttonActionPerformed
        // A method where every click of the radio button will activate and send a text to other voids
        UIType = adminbutton.getActionCommand() ; 
        
        System.out.println(UIType) ;
        
    }//GEN-LAST:event_adminbuttonActionPerformed

    private void membertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membertypeActionPerformed
        // A method where every click of the radio button will activate and send a text to other voids
        UIType = membertype.getActionCommand() ;
        
        System.out.println(UIType) ;
        
    }//GEN-LAST:event_membertypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // A code for erasing all texts in the text fields
        username.setText("") ;
        password.setText("") ;
        // this part clears the option what type the account is addedtypes.setText("") ;
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {  // try and catch where the program will process the username and password the user inpuuted in the Jpanel
               // and compare them to the JSON file if any element will match with one
               
            UIusername = username.getText() ; // varibales that get the inputted texts in the text field
            UIpassword = password.getText();
            // This part is not connected with a actioneventUItype = addedtypes.getText() ;
            
            filecheck() ; //filecheck() ; // the prompt for the File reader program void
            
            for (int i = 0 ; i <user_archive.size() ; i++) { // iteration for getting all the lements out of the jsona rray and later examining them
              
              JSONObject over = (JSONObject) user_archive.get(i) ;
              
              if (UpdateAccount.getuname().equals(over.get("username"))) { // This will activate if the UpdateAccount. java panel's username input will be siilar to a element inside the json array
                  
                  user_archive.get(i) ;
                  System.out.println(user_archive) ; // this ocde will change the current useranme with the new username the user inputted
                  over.put("username", UIusername) ;
                  
                  
              }
              
              if (UpdateAccount.getuname().equals(over.get("username"))) {
              
                  user_archive.get(i) ;
                  System.out.println(user_archive) ; // work in porgress because theres no variable that contains the password on the UpdateAccount. java panel GUI
                  over.put("password", UIpassword) ;
                  
       
            }
            
              if (UpdateAccount.getuname().equals(over.get("username"))) {
                  
                  user_archive.get(i) ;
                  System.out.println(user_archive) ; // work in porgress because theres no variable that contains the password on the UpdateAccount. java panel GUI
                  over.put("type", UIType) ;
                  
                  
              }
 
                       try { 
                           
                        savefile() ; //  a prompt that will send and activate the saving of changes into the JSONarray and input it to the JSON file
                        
                            } catch (IOException ex) {
                                Logger.getLogger(AddAccount.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ParseException ex) {
                                Logger.getLogger(AddAccount.class.getName()).log(Level.SEVERE, null, ex);
                            }
            }             
        } catch (IOException ex) { // exceptions to cattch to incrase security and errors 
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        setVisible(false) ;
        Welcome2 admin = new Welcome2() ; // This will activate if the Update button is clicked and your take in back to the aadmin Panel
        admin.setVisible(true) ;
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAccountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accountlabel;
    private javax.swing.JRadioButton adminbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton membertype;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

public static boolean userCheck() { // a code that will detect if the user's inputted details will be similar to the elements of the jsonarray
            
            
            for (Object hef : user_archive) {
                
                JSONObject you = (JSONObject) hef ;
                                                                                                             // this part UItype.equals("type")
                    if (UIusername.equals(you.get("username")) && UIpassword.equals(you.get("password")) && UIType.equals(you.get("type"))) {
                        
                        return true ; // This will turn the code into true which means there is a account in the JSOnarray that is similar to the user's inputted details
                        
                    }
                    
                    else if (UIusername.equals(you.get("username")) && UIpassword.equals(you.get("password")) && !UIType.equals(you.get("type"))) {
                        
                        return true ; // This will turn the code into true which means there is a account in the JSOnarray that is similar to the user's inputted details
                        
                    }
                    
            }
            
                return false ; // This code means if there's no account in the json file that is similar to the user's inpuuted details it turns off the userhceck void

}
    
public static void filecheck() throws FileNotFoundException, IOException, ParseException { // The save code to save all the changes into the json file
    
     // The filereader that will you guess it will read the where the JSON file is
     
       FileReader reader = new FileReader(file_path);
        
        if(reader.ready())
        {
            
            Scanner sc = new Scanner(reader);
            String line="";
            
            while (sc.hasNext())
            {
                line = line + sc.nextLine();}
            
            
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

public static void savefile() throws FileNotFoundException, IOException, ParseException {
            
            try (FileWriter writer = new FileWriter(file_path)) {
              
            JSONObject overwrite = new JSONObject();
            overwrite.put("users", user_archive) ;
            
            writer.write(overwrite.toJSONString());
            System.out.println("student data saved successfully.");
        } catch (Exception e) {
            System.out.println("student saving data to file: " + e.getMessage());
        }
}

    
}
