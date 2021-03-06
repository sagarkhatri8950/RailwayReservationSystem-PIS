import java.sql.*;
import javax.swing.*;
/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ADDPASSENGER.java
 *
 * Created on Dec 24, 2010, 1:35:30 PM
 */

/**
 *
 * @author Neeraj
 */
public class RESERVATION extends javax.swing.JFrame {
    Connection con;
Statement stmt;
ResultSet rs;
int acseats,slseats,role;
String account_name;

    /** Creates new form ADDPASSENGER */
    public RESERVATION() {
        initComponents();
        DBConnector db = new DBConnector();
        con = db.getDBConnection();
    }
    
    public RESERVATION(int r_id,String account){
        initComponents();
        DBConnector db = new DBConnector();
        con = db.getDBConnection();
        role=r_id;
        account_name=account;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtcharge = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbclass = new javax.swing.JComboBox();
        txtage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbstart = new javax.swing.JComboBox();
        cmbend = new javax.swing.JComboBox();
        cmbtname = new javax.swing.JComboBox();
        txttno = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("TICKET RESERVATION ");

        jLabel2.setText("CHOOSE TRAIN");

        jLabel3.setText("PASSENGER NAME");

        jLabel4.setText("START STATION");

        jLabel5.setText("END STATION");

        jLabel6.setText("ADDRESS");

        jLabel7.setText("PHONE");

        txtpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnameActionPerformed(evt);
            }
        });

        jButton3.setText("BACK TO MAIN MENU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("TRAIN NO");

        jButton4.setText("BOOK TICKET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("CHARGE FOR TICKET");

        jLabel10.setText("SELECT CLASS");

        cmbclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "SLEEPER" }));
        cmbclass.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbclassItemStateChanged(evt);
            }
        });
        cmbclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbclassActionPerformed(evt);
            }
        });

        jLabel11.setText("AGE");

        cmbstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstartActionPerformed(evt);
            }
        });

        cmbtname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Train" }));
        cmbtname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbtnameItemStateChanged(evt);
            }
        });
        cmbtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtnameActionPerformed(evt);
            }
        });

        jButton5.setText("FIND TRAINS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbstart, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttno)
                            .addComponent(cmbend, 0, 187, Short.MAX_VALUE))
                        .addGap(147, 147, 147))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addGap(129, 129, 129))
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(cmbtname, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbclass, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(351, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbclass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try{
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e);
        }
        if(role == 0){
            new MAINFORM(role,account_name).setVisible(true);
            this.setVisible(false);
        }
        else{
            new User(role,account_name).setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    //    if(chkconfirm.isSelected())
      //  {
          try
        {
           // Class.forName("com.mysql.jdbc.Driver");
           // Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123");
            Statement stmt=null;
            Statement stmt1=null;
            // ResultSet rs=null;
            // String sql=("select * from train);
           // jOptionPane1.showMessageDialog(null,"ok");
            stmt=con.createStatement();
            stmt1=con.createStatement();
            // rs=stmt.executeQuery(sql);
            // while(rs.next())
            // System.out.println(rs.getString("name")+"\n");
            // }E
            int tno=Integer.parseInt(txttno.getText().trim());
            String pname=txtpname.getText();
            String address=txtadd.getText();
             int age=Integer.parseInt(txtage.getText());
             String phoneno= txtphone.getText();
             String froms =(String) cmbstart.getSelectedItem();
             String end =(String) cmbend.getSelectedItem();
             String Class=(String) cmbclass.getSelectedItem();
             String tname=(String) cmbtname.getSelectedItem();
             String strsql="insert into passenger values('"+ account_name +"','" +(address)+"','"+(pname)+"','"+(tname)+"',"+(age)+",'"+(phoneno)+"','"+(froms)+"','"+(end)+"','"+(Class)+"',"+(tno)+");";
             stmt.executeUpdate(strsql);
             if(Class.equals("AC"))
             {String strsql1="update train set ac_seats="+(acseats-1)+" where tname='"+cmbtname.getSelectedItem()+ "'and source='"+cmbstart.getSelectedItem()+"' and destination='"+cmbend.getSelectedItem()+"';";
             stmt1.executeUpdate(strsql1);
             }
             else
              if(Class.equals("SLEEPER"))
             {String strsql1="update train set sl_seats="+(slseats-1)+" where tname='"+cmbtname.getSelectedItem()+ "'and source='"+cmbstart.getSelectedItem()+"' and destination='"+cmbend.getSelectedItem()+"';";
             stmt1.executeUpdate(strsql1);
             }
              
              opane1.showMessageDialog(null,"Record saved successfully");
             // con.close();

    }
        catch(Exception e)
        {
//  jOptionPane1.showMessageDialog(null,"Record saved successfully");
            opane1.showMessageDialog(null,e.getMessage());

        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        try
        {
            stmt=con.createStatement();
            String sql="Select * from train";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
               cmbstart.addItem(rs.getString("source"));
               cmbend.addItem(rs.getString("destination"));

            }

            //jList1.setModel(dl);
            //con.close();
        }
        catch(Exception e)
        {
            opane1.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpnameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cmbtname.removeAllItems();
        int c=0;
        try {
           
            stmt=con.createStatement();
           
           String query="select * from train where source='"+cmbstart.getSelectedItem()+"' and destination='"+cmbend.getSelectedItem()+"';";
            rs=stmt.executeQuery(query);

            while(rs.next())
            {
                cmbtname.addItem(rs.getString("tname"));
                c++;
             }
            if(c==0)
                opane1.showMessageDialog(null, "No Train find on This route");
           
        } catch(Exception e)
        {
            opane1.showMessageDialog(null,e.getMessage());

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cmbtnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbtnameItemStateChanged
        // TODO add your handling code here:
        try {
           
            stmt=con.createStatement();
           
           String query="select * from train where tname='"+cmbtname.getSelectedItem()+"' and source='"+cmbstart.getSelectedItem()+"' and destination='"+cmbend.getSelectedItem()+"';";
            rs=stmt.executeQuery(query);

            if(rs.next())
            {
              acseats=rs.getInt("ac_seats");
              slseats=rs.getInt("sl_seats");
              //opane1.showMessageDialog(null, acseats);
              //opane1.showMessageDialog(null, slseats);
                txttno.setText(" "+rs.getInt("tno"));
             }
           
        } catch(Exception e)
        {
            opane1.showMessageDialog(null,e.getMessage());

        }

        
    }//GEN-LAST:event_cmbtnameItemStateChanged

    private void cmbclassItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbclassItemStateChanged
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {

            stmt=con.createStatement();

            int tn=Integer.parseInt(txttno.getText().trim());
           String query="select * from train where tno="+tn+" and source='"+cmbstart.getSelectedItem()+"' and destination='"+cmbend.getSelectedItem()+"';";

            rs=stmt.executeQuery(query);

            if(rs.next())
            {

                if(cmbclass.getSelectedIndex()==0){
                    txtcharge.setText(" "+rs.getInt("actr"));
                    jLabel12.setText(" "+rs.getInt("ac_seats")+" seats available");
                }
                else
                    if(cmbclass.getSelectedIndex()==1){
                        txtcharge.setText(" "+rs.getInt("sctr"));
                        jLabel12.setText(" "+rs.getInt("sl_seats")+" seats available");
                    }
                

             }

        } catch(Exception e)
        {
            opane1.showMessageDialog(null,e.getMessage());

        }

}//GEN-LAST:event_cmbclassItemStateChanged

    private void cmbtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbtnameActionPerformed

    private void cmbstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstartActionPerformed

    private void cmbclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbclassActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESERVATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbclass;
    private javax.swing.JComboBox cmbend;
    private javax.swing.JComboBox cmbstart;
    private javax.swing.JComboBox cmbtname;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane opane1;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcharge;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txttno;
    // End of variables declaration//GEN-END:variables

}
