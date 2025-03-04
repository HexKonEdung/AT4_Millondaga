
package MAIN;
// importted classes //

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

public class AddAccount extends javax.swing.JFrame {

   // initialized Private static variables
    
    private static String UIusername, UIpassword, UIType ;
    
    private static String radiotype ;
    
    private static JSONArray user_archive = new JSONArray() ;
    private static JSONParser parser = new JSONParser() ;
    private static JSONObject changed_archive = new JSONObject();
    
    
    private static String file_path = "src\\MAIN\\users.json" ;
    
    public AddAccount() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addedusername = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        addedpassword = new javax.swing.JPasswordField();
        membertype = new javax.swing.JRadioButton();
        adminbutton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Account Details");

        jLabel2.setText("Enter New Username : ");

        jLabel3.setText("Enter New Username : ");

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        clearbutton.setText("Clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(membertype);
        membertype.setText("member");
        membertype.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                membertypeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
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

        jLabel4.setText("Select a type of account: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addedusername)
                                    .addComponent(addedpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(membertype)
                                        .addGap(54, 54, 54)
                                        .addComponent(addbutton)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearbutton))
                                    .addComponent(adminbutton)
                                    .addComponent(jLabel4))))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(143, 143, 143))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addedusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addedpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton)
                    .addComponent(clearbutton)
                    .addComponent(membertype))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jMenu1.setText("Home");

        jMenuItem2.setText("Back");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
    
    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed

        
        try {  // try and catch where the program will process the username and password the user inpuuted in the Jpanel
               // and compare them to the JSON file if any element will match with one
               
            UIusername = addedusername.getText() ; // varibales that get the inputted texts in the text field
            UIpassword = addedpassword.getText();
            // This part is not connected with a actioneventUItype = addedtypes.getText() ;
            
            filecheck() ; //filecheck() ; // the prompt for the File reader program void
            
            
            int passed = 0 ;
            int passed_type = 0 ;
            
                if(UIType == null) {
                    
                    JOptionPane.showMessageDialog(null, "Select a Type") ;
                    return ;
                }
                
                if (UIusername.isBlank() && UIpassword.isBlank()) {
                    
                    JOptionPane.showMessageDialog(null, "Input a username or password") ;
                    return ;
                    
                }
                
                if (userCheck() == true) {
                    
                    JOptionPane.showMessageDialog(null, "This account already exists") ;
                    return ;
                    
                }
                
                for (int a = 0; a < user_archive.size(); a++) { // iteration for the size of the Jsonfile which will come useful
                    
                JSONObject over = (JSONObject) user_archive.get(a) ; // a size that will highlights all the elements inside the array
                
                String getusername = (String) over.get("username") ; // Variables that will get the key's value inside the JSON array
                String getpassword = (String) over.get("password") ;
                String gettype = (String) over.get("type") ;
                        
                    } 
                    
                    //if () {
                        
                    //}
    
                    
                JSONObject even = new JSONObject() ;  // This methods will get all the elements in the JSONarray for inspection
                    
                String adduser = UIusername ;
                String addpass = UIpassword ; // This varibale contains the inputted data in the Jpanel 
                String addtype = UIType ; // This variable contains all the types in the JSON aray
                
                        
                        even.put("username", adduser) ;
                        even.put("password", addpass) ;
                        even.put("type", addtype) ;
                        
                        
                        user_archive.add(even) ;
                        
                        System.out.println(userCheck());
                        JOptionPane.showMessageDialog(null, "Successfully added") ;
                        
                        System.out.println(UIType) ;
                        
                       try { 
                           
                        savefile() ;
                        
                            } catch (IOException ex) {
                                Logger.getLogger(AddAccount.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ParseException ex) {
                                Logger.getLogger(AddAccount.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    
        } catch (IOException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        setVisible(false) ;
        Welcome2 admin = new Welcome2() ;
        admin.setVisible(true) ;
  
    }//GEN-LAST:event_addbuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        
        addedusername.setText("") ;
        addedpassword.setText("") ;
        // this part clears the option what type the account is addedtypes.setText("") ;
        
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        setVisible(false) ;
        Welcome2 admin = new Welcome2() ;
        admin.setVisible(true) ;
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void adminbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbuttonActionPerformed
            
        UIType = adminbutton.getActionCommand() ;
        
        System.out.println(UIType) ;
        
        
    }//GEN-LAST:event_adminbuttonActionPerformed

    private void membertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membertypeActionPerformed
        
        UIType = membertype.getActionCommand() ;
        
        System.out.println(UIType) ;
         
    }//GEN-LAST:event_membertypeActionPerformed

    private void membertypeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_membertypeAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_membertypeAncestorAdded

    
    
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
            java.util.logging.Logger.getLogger(AddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JPasswordField addedpassword;
    private javax.swing.JTextField addedusername;
    public javax.swing.JRadioButton adminbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton membertype;
    // End of variables declaration//GEN-END:variables

public static boolean userCheck() {
            
            
            for (Object hef : user_archive) {
                
                JSONObject you = (JSONObject) hef ;
                                                                                                             // this part UItype.equals("type")
                    if (UIusername.equals(you.get("username")) && UIpassword.equals(you.get("password")) && UIType.equals(you.get("type"))) {
                        
                        return true ;
                        
                    }
                    
                    else if (UIusername.equals(you.get("username")) && UIpassword.equals(you.get("password")) && !UIType.equals(you.get("type"))) {
                        
                        return true ;
                        
                    }
                    
            }
            
                return false ;

}
    
public static void filecheck() throws FileNotFoundException, IOException, ParseException {
    
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


