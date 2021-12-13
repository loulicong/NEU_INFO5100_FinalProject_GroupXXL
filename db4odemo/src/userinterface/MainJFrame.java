/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import System.Baby.Baby;
import System.Baby.BabyDirectory;
import System.BabyInfo.BabyInfo;
import System.BabyInfo.BabyInfoDirectory;
import System.BabyNurse.BabyNurse;
import System.BabyNurse.BabyNurseDirectory;
import System.City.City;
import System.City.CityList;
import System.Community.Community;
import System.Community.CommunityList;
import System.GODNurse.GODNurse;
import System.GODNurse.GODNurseDirectory;
import System.GODoc.GODoc;
import System.Government.Faculty;
import System.Government.FacultyDirectory;
import System.Government.Government;
import System.Government.GovernmentDirectory;
import System.Hospital.Hospital;
import System.HospitalContact.HospitalContact;
import System.HospitalContact.HospitalContactDirectory;
import System.Hospital_GO.Hospital_GO;
import System.Hospital_PED.Hospital_PED;
import System.InRequest.InRequest;
import System.InRequest.InRequestList;
import System.PEDoc.PEDoc;
import System.PEDoc.PEDocDirectory;
import System.PRC.PRC;
import System.PRC.PRCDirectory;
import System.PRCContact.PRCContact;
import System.PRCContact.PRCContactDirectory;
import System.PRC_GO.PRC_GO;
import System.PRC_PED.PRC_PED;
import System.Pregnant.Pregnant;
import System.Pregnant.PregnantDirectory;
import System.GODoc.GODocDirectory;
import System.CareCenterSystem;
import System.DB4OUtil.DB4OUtil;

import System.Hospital.HospitalDirectory;
import System.PregnantInfo.PregnantInfo;
import System.PregnantInfo.PregnantInfoDirectory;
import System.Role.*;
import System.UserAccount.UserAccount;
import System.UserAccount.UserAccountDirectory;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private CareCenterSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccountDirectory userAccountDirectory;


    public void initialize(){
        this.system = CareCenterSystem.getInstance();
        this.userAccountDirectory=new UserAccountDirectory();

        Role role_1 = new HospitalContactRole();
        Hospital hospital =new Hospital();
        hospital.setName("hospital_1");
        HospitalContact hospitalContact = new HospitalContact();
        hospitalContact.setHospital(hospital);
        hospitalContact.setName("hospital_contact");
        hospitalContact.setUsername("hospital_1");
        HospitalDirectory hospitalDirectory = new HospitalDirectory();
        hospitalDirectory.getHospitalArrayList().add(hospital);
        UserAccount userAccount_1=userAccountDirectory.createUserAccount("hospital_1","123", role_1);

        Role role_5 = new PRCContactRole();
        PRCDirectory prcDirectory = new PRCDirectory();
        PRC prc =new PRC();
        prc.setName("PRC_1");
        PRCContactDirectory prcContactDirectory = new PRCContactDirectory();
        PRCContact prcContact =new PRCContact();
        prcContact.setName("prc_contact");
        prcContact.setUsername("PRC_1");
        prcDirectory.getPRCList().add(prc);
        prcContactDirectory.getPRCtArrayList().add(prcContact);
        UserAccount userAccount_5=userAccountDirectory.createUserAccount("PRC_1","123", role_5);
        PRC_GO prc_go= new PRC_GO();
        PRC_PED prc_ped = new PRC_PED();
        GODNurse godNurse = new GODNurse();
        godNurse.setName("Lee");
        godNurse.setSex("male");
        godNurse.setPRC(prc);
        godNurse.setUsrname("GODoctor_1");
        godNurse.setPassword("123");
        godNurse.setStatu("Free");
        Role r_1=new GONurseRole();
        GODNurseDirectory godNurseDirectory = new GODNurseDirectory();
        godNurseDirectory.getDeliveryManArrayList().add(godNurse);
        prc_go.addGOD(godNurse);
        userAccountDirectory.createUserAccount("GONurse_1","123",r_1);
        BabyNurseDirectory babyNurseDirectory = new BabyNurseDirectory();
        BabyNurse babyNurse = babyNurseDirectory.createDeliverMan("Lily","BabyNurse_1","female",prc);
        babyNurse.setPassword("123");
        prc_ped.addPED(babyNurse);
        Role role_10 = new BabyNurseRole();
        userAccountDirectory.createUserAccount("BabyNurse_1","123",role_10);
        prc.setPRC_GO(prc_go);
        prc.setPRC_PED(prc_ped);



//        Role role_2 = new PregnantRole();
        GODocDirectory GODocDirectory = new GODocDirectory();
//        GODocDirectory.createDeliverMan("deliverman_1");
//        UserAccount userAccount_2=userAccountDirectory.createUserAccount("deliverman_1","123",role_2);

        Role role_3 = new PregnantRole();
        PregnantDirectory pregnantDirectory =new PregnantDirectory();
        Pregnant pregnant_1 = new Pregnant();
        pregnant_1.setName("Lily");
        pregnant_1.setUsername("customer_2");
        pregnantDirectory.getCustomerArrayList().add(pregnant_1);
        system.setUserDirectory(pregnantDirectory);
        UserAccount userAccount_11=userAccountDirectory.createUserAccount("customer_2","123", role_3);
        Pregnant pregnant = new Pregnant();
        pregnant.setName("Florence");
        pregnant.setUsername("customer_1");
        pregnantDirectory.getCustomerArrayList().add(pregnant);
        system.setUserDirectory(pregnantDirectory);
        UserAccount userAccount_3=userAccountDirectory.createUserAccount("customer_1","123", role_3);
        PregnantInfo pregnantInfo = new PregnantInfo();
        pregnantInfo.setDescription("good");
        pregnantInfo.setCheckdate("december 10");
        PregnantInfoDirectory pregnantInfoDirectory = new PregnantInfoDirectory();
        pregnantInfoDirectory.getPregnantInfoArrayList().add(pregnantInfo);
        pregnant.getPregnantInfoArrayList().add(pregnantInfo);

        Baby baby = new Baby();
        baby.setName("Henry");
        baby.setMom(pregnant_1);
        BabyDirectory babyDirectory = new BabyDirectory();
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, - 7);
        Date d = c.getTime();
        baby.setBirth(d);
        BabyInfo babyInfo = new BabyInfo();
        babyInfo.setDescription("everything goes well");
        SimpleDateFormat sdf_1 = new SimpleDateFormat();
        sdf_1.applyPattern("yyyy-MM-dd HH:mm:ss a");
        Date date_1 = new Date();
        babyInfo.setCheckdate(sdf_1.format(date_1));
        babyDirectory.getDeliveryManArrayList().add(baby);
        baby.getBabyinfoDirectory().getBabyInfoArrayList().add(babyInfo);




//        InRequest inRequest_1 =new InRequest("",userAccount_3,null,"available", hospitalDirectory.getHospitalArrayList().get(0),null);
//        InRequest inRequest =new InRequest("",userAccount_3,userAccount_2,"pending", hospitalDirectory.getHospitalArrayList().get(0),null);
        Role role_6 = new CityRole();
        CityList cityList =new CityList();
        City city = new City("boston");
        cityList.getCityArrayList().add(city);
        Community community = new Community("malden");
        CommunityList communityList = new CommunityList();
        communityList.getCommunityArrayList().add(community);
        city.setCommunityArrayList(communityList.getCommunityArrayList());
        UserAccount userAccount_6 = userAccountDirectory.createUserAccount("city_1","123",role_6);

        Government government=new Government();
        GovernmentDirectory governmentDirectory=new GovernmentDirectory();
        government.setCity(city);
        governmentDirectory.getGovernmentArrayList().add(government);
        Faculty faculty=new Faculty("Lily");
        faculty.setUsername("faculty_1");
        faculty.setCommunity(community);
        community.setFaculty(faculty);
        faculty.setPassword("123");
        faculty.setCommunity(community);
        government.getFacultyArrayList().add(faculty);
        FacultyDirectory facultyDirectory=new FacultyDirectory();
        facultyDirectory.getFacultyArrayList().add(faculty);
        Role role_7 = new GovernmentAdmin();
        Role role_8 = new GovernmentFaculty();
        UserAccount userAccount_7 = userAccountDirectory.createUserAccount("boston","123",role_7);
        UserAccount userAccount_8 = userAccountDirectory.createUserAccount("faculty_1","123",role_8);

        HospitalContactDirectory hospitalContactDirectory=new HospitalContactDirectory();
        hospitalContactDirectory.getPRCtArrayList().add(hospitalContact);

        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间

        InRequestList inRequestList = new InRequestList();

        InRequest inRequest = new InRequest();
        inRequest.setHospital(hospital);
        inRequest.setSender(userAccount_3);
        inRequest.setStatus("Requesting");
        inRequest.setPrePeriod("3 week");
        inRequestList.getRequestList().add(inRequest);


        hospital.getInrequestDirectory().getRequestList().add(inRequest);
        PEDocDirectory peDocDirectory = new PEDocDirectory();
//        system.getWorkQueue().getRequestList().add((inRequest));
//        system.getWorkQueue().getRequestList().add(inRequest_1);
        ArrayList<UserAccount> userAccountArrayList = new ArrayList<>();
        userAccount_3.getHospitalinRequestListt().getRequestList().add(inRequest);
        Hospital_GO hospital_go = new Hospital_GO();
        Hospital_PED hospital_ped = new Hospital_PED();
        GODoc goDoc = new GODoc();
        goDoc.setName("Jack");
        goDoc.setSex("male");
        goDoc.setHospital(hospital);
        goDoc.setUsrname("GODoctor_1");
        goDoc.setPassword("123");
        goDoc.setStatu("Free");
        Role r=new GODoctorRole();
        GODocDirectory goDocDirectory =new GODocDirectory();
        goDocDirectory.getDeliveryManArrayList().add(goDoc);
        hospital_go.addGOD(goDoc);
        userAccountDirectory.createUserAccount("GOdoctor_1","123",r);
        PEDoc peDoc = peDocDirectory.createEmployee("Black","PEDoctor_1","female",hospital);
        peDoc.setPassword("123");
        hospital_ped.addPED(peDoc);
        Role role_9 = new PedDocRole();
        userAccountDirectory.createUserAccount("PEDoctor_1","123",role_9);
        hospital.setHospital_GO(hospital_go);
        hospital.setHospital_PED(hospital_ped);


        hospital.setCommunity(community);
        Role role_4 = new SystemAdminRole();
        UserAccount userAccount_4=userAccountDirectory.createUserAccount("admin_1","123", role_4);

        this.system=new CareCenterSystem(hospitalDirectory, pregnantDirectory, GODocDirectory,prcDirectory,cityList,governmentDirectory,facultyDirectory,communityList,babyDirectory,hospitalContactDirectory);
        system.setInRequestList(inRequestList);
        system.setPEdocDirectory(peDocDirectory);
        system.setPRCcontactDirectory(prcContactDirectory);
        system.setUserAccountDirectory(this.userAccountDirectory);
        dB4OUtil.storeSystem(system);
    }

    public MainJFrame() {
        initialize();
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        registerJButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerJButton.setText("register");
        registerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJButtonActionPerformed(evt);
            }
        });

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addGap(26, 26, 26)
                            .addComponent(loginJLabel)))
                            .addComponent(registerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginJButton)
                .addGap(34, 34, 34)
                .addComponent(logoutJButton)
                    .addGap(34, 34, 34)
                    .addComponent(registerJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJLabel)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_loginJButtonActionPerformed
        if ( userNameJTextField.getText().equals("")||passwordField.getPassword().equals("")){
            JOptionPane.showMessageDialog(this,"empty input");
            return;
        }
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userNameJTextField.getText(),passwordField.getText());
        if(userAccount==null){
            JOptionPane.showMessageDialog(this,"no such account");
            userNameJTextField.setText("");
            passwordField.setText("");
            return;
        }
        else {
            container.add(userAccount.getRole().createWorkArea(container,userAccount,system));
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.next(container);
            jSplitPane1.setRightComponent(container);
        }
        logoutJButton.setEnabled(true);

        // Get user name
       
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void registerJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterJPanel registerJPanel = new RegisterJPanel(container,system);
        container.add(registerJPanel);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        jSplitPane1.setRightComponent(container);
    }

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JButton registerJButton;
    // End of variables declaration//GEN-END:variables
}
