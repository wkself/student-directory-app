package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//William Self
//Lab Section Tuesday 1:30 pm
//Lab 6 code written by William Self

public class NewFrame extends JFrame implements ActionListener
{

    Student[] undergrads = new Student[20];
    GradStudent[] graduates = new GradStudent[20];

    JPanel pnlContain;      //new panel for containing all elements

    public JTextField txtFirstName;
    public JTextField txtMidIn;
    public JTextField txtLastName;
    public JTextField txtPID;
    public JTextField txtAge;
    public JTextField txtBirth;
    public JTextField txtAdvisorFirst;
    public JTextField txtAdvisorMid;
    public JTextField txtAdvisorLast;
    public JTextField txtGraduation;
    public JTextField txtAddress1;
    public JTextField txtAddress2;
    public JTextField txtCity;
    public JTextField txtState;
    public JTextField txtZip;
    public JTextField txtThesis;

    JButton btnClear;       //clear buttons
    JButton btnSave;
    JButton btnExit;
    JButton btnRestore;

    JLabel lblFirstName;
    JLabel lblMidIn;
    JLabel lblLastName;
    JLabel lblPID;
    JLabel lblAge;
    JLabel lblBirth;
    JLabel lblMajor;
    JLabel lblClass;
    JLabel lblAdvisorFirst;
    JLabel lblAdvisorMidIn;
    JLabel lblAdvisorLast;
    JLabel lblGraduation;
    JLabel lblHogwarts;
    JLabel lblAddress1;
    JLabel lblAddress2;
    JLabel lblCity;
    JLabel lblState;
    JLabel lblZip;
    JLabel lblGradStudent;
    JLabel lblThesis;


    String[] major = new String[] {"CIT", "Physics", "Math", "Plant Science", "7-year plan"};
    String[] favClass = new String[] {"CIT 155", "CIT 255", "Literature of Monty Python", "Presidency of Kanye West", "Jazz Flute", "Theory of Killer Drones", "no comment"};
    String[] grad = new String[] {"Graduate", "Undergraduate"};
    String[] hog = new String[] {"Yes", "No"};

    JComboBox<String> majorList = new JComboBox<>(major);
    JComboBox<String> favorite = new JComboBox<>(favClass);
    JComboBox<String> gradStudent = new JComboBox<>(grad);
    JComboBox<String> hogWarts = new JComboBox<>(hog);


    public NewFrame()
    {
        pnlContain = new JPanel();      //create new JPanel
        Container cp = getContentPane();

        txtFirstName = new JTextField(10);
        txtMidIn = new JTextField(2);
        txtLastName = new JTextField(10);
        txtPID = new JTextField(10);
        txtAge = new JTextField(3);
        txtBirth = new JTextField(10);
        txtAdvisorFirst = new JTextField(10);
        txtAdvisorMid = new JTextField(10);
        txtAdvisorLast = new JTextField(10);
        txtGraduation = new JTextField(10);
        txtAddress1 = new JTextField(20);
        txtAddress2 = new JTextField(20);
        txtCity = new JTextField(10);
        txtState = new JTextField(10);
        txtZip = new JTextField(10);
        txtThesis = new JTextField(10);

        txtFirstName.setText("");
        txtMidIn.setText("");
        txtLastName.setText("");
        txtPID.setText("");
        txtAge.setText("");
        txtBirth.setText("");
        txtAdvisorFirst.setText("");
        txtAdvisorMid.setText("");
        txtAdvisorLast.setText("");
        txtGraduation.setText("");
        txtAddress2.setText("");
        txtAddress1.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtThesis.setText("");

        txtAge.setEditable(false);

        lblFirstName = new JLabel("First");
        lblMidIn = new JLabel("Mid");
        lblLastName = new JLabel("Last");
        lblPID = new JLabel("PID");
        lblAge = new JLabel("Age");
        lblBirth = new JLabel ("Birthday MM/DD/YYYY");
        lblMajor = new JLabel("Major");
        lblClass = new JLabel("Fav Class");
        lblAdvisorFirst = new JLabel("Advisor First");
        lblAdvisorMidIn = new JLabel("Advisor Mid");
        lblAdvisorLast = new JLabel ("Advisor Last");
        lblGraduation = new JLabel ("Grad Date");
        lblHogwarts = new JLabel("Hogwarts?");
        lblAddress1 = new JLabel("Address1");
        lblAddress2 = new JLabel ("Address2");
        lblCity = new JLabel ("City");
        lblState = new JLabel ("State");
        lblZip = new JLabel ("Zipcode");
        lblGradStudent = new JLabel("Grad Student?");
        lblThesis = new JLabel("Thesis title");


        btnClear = new JButton("Clear");        //create new button for clear
        btnExit = new JButton("Exit");
        btnSave = new JButton ("Save");
        btnRestore = new JButton("Restore");

        btnClear.addActionListener(this);       //new action listener for clear buttons
        btnSave.addActionListener(this);
        btnExit.addActionListener(this);
        btnRestore.addActionListener(this);



        pnlContain.setLayout(null);

        txtFirstName.setBounds(90,5,110,25);
        txtMidIn.setBounds(90,30,25,25);
        txtLastName.setBounds(90,55,110,25);
        txtPID.setBounds(90,80,80,25);
        txtAge.setBounds(90,105,40,25);
        txtBirth.setBounds(150,130,80,25);
        txtAdvisorFirst.setBounds(90,205,110,25);
        txtAdvisorMid.setBounds(90,230,25,25);
        txtAdvisorLast.setBounds(90,255,110,25);
        txtGraduation.setBounds(90,330,80,25);
        txtAddress1.setBounds(90,355,110,25);
        txtAddress2.setBounds(90,380,110,25);
        txtCity.setBounds(90,405,80,25);
        txtState.setBounds(90,430,80,25);
        txtZip.setBounds(90,455,80,25);
        txtThesis.setBounds(90,480,300,25);


        lblFirstName.setBounds(1,5,110,25);
        lblMidIn.setBounds(1,30,25,25);
        lblLastName.setBounds(1,55,110,25);
        lblPID.setBounds(1,80,80,25);
        lblAge.setBounds(1,105,40,25);
        lblBirth.setBounds(1,130,150,25);
        lblMajor.setBounds(1,155,80,25);
        lblClass.setBounds(1,180,80,25);
        lblAdvisorFirst.setBounds(1,205,80,25);
        lblAdvisorMidIn.setBounds(1,230,80,25);
        lblAdvisorLast.setBounds(1,255,80,25);
        lblGradStudent.setBounds(1,280,80,25);
        lblHogwarts.setBounds(1,305,80,25);
        lblGraduation.setBounds(1,330,80,25);
        lblAddress1.setBounds(1,355,80,25);
        lblAddress2.setBounds(1,380,80,25);
        lblCity.setBounds(1,405,80,25);
        lblState.setBounds(1,430,80,25);
        lblZip.setBounds(1,455,80,25);
        lblThesis.setBounds(1,480,80,25);


        btnExit.setBounds(450,360,100,40);
        btnSave.setBounds(450,405,100,40);
        btnClear.setBounds(450,450,100,40);
        btnRestore.setBounds(450,495,100,40);

        majorList.setBounds(90,155,130,25);
        favorite.setBounds(90,180,130,25);
        gradStudent.setBounds(90,280,130,25);
        hogWarts.setBounds(90,305,130,25);

        pnlContain.add(txtFirstName);
        pnlContain.add(txtMidIn);
        pnlContain.add(txtLastName);
        pnlContain.add(txtPID);
        pnlContain.add(txtAge);
        pnlContain.add(txtBirth);
        pnlContain.add(txtAdvisorFirst);
        pnlContain.add(txtAdvisorMid);
        pnlContain.add(txtAdvisorLast);
        pnlContain.add(txtGraduation);
        pnlContain.add(txtAddress1);
        pnlContain.add(txtAddress2);
        pnlContain.add(txtCity);
        pnlContain.add(txtState);
        pnlContain.add(txtZip);
        pnlContain.add(txtThesis);

        pnlContain.add(lblFirstName);
        pnlContain.add(lblMidIn);
        pnlContain.add(lblLastName);
        pnlContain.add(lblPID);
        pnlContain.add(lblAge);
        pnlContain.add(lblBirth);
        pnlContain.add(lblMajor);
        pnlContain.add(lblClass);
        pnlContain.add(lblAdvisorFirst);
        pnlContain.add(lblAdvisorMidIn);
        pnlContain.add(lblAdvisorLast);
        pnlContain.add(lblGraduation);
        pnlContain.add(lblHogwarts);
        pnlContain.add(lblAddress1);
        pnlContain.add(lblAddress2);
        pnlContain.add(lblCity);
        pnlContain.add(lblState);
        pnlContain.add(lblZip);
        pnlContain.add(lblGradStudent);
        pnlContain.add(lblThesis);

        pnlContain.add(btnClear);
        pnlContain.add(btnSave);
        pnlContain.add(btnExit);
        pnlContain.add(btnRestore);

        pnlContain.add(majorList);
        pnlContain.add(favorite);
        pnlContain.add(gradStudent);
        pnlContain.add(hogWarts);

        cp.add(pnlContain);     //Add contain method to JFrame
    }

    public void actionPerformed(ActionEvent evt)
    {

        if (evt.getSource() == btnClear) {
            txtFirstName.setText("");
            txtMidIn.setText("");
            txtLastName.setText("");
            txtPID.setText("");
            txtAge.setText("");
            txtBirth.setText("");
            txtAdvisorLast.setText("");
            txtAdvisorFirst.setText("");
            txtAdvisorMid.setText("");
            txtGraduation.setText("");
            txtAddress1.setText("");
            txtAddress2.setText("");
            txtCity.setText("");
            txtState.setText("");
            txtZip.setText("");
            txtThesis.setText("");
            majorList.setSelectedItem("CIT");
            favorite.setSelectedItem("CIT 155");
            gradStudent.setSelectedItem("Graduate");
            hogWarts.setSelectedItem("Yes");
        }


        if (evt.getSource() == btnSave) {

            if (gradStudent.getSelectedItem().toString().equals("Undergraduate"))
            {
                for (int i = 0; i < 20; i++)
                {

                    undergrads[i] = new Student(txtFirstName.getText(), txtMidIn.getText(), txtLastName.getText(),
                            txtAddress1.getText(), txtAddress2.getText(), txtCity.getText(),txtState.getText(),
                            txtZip.getText(), txtBirth.getText(), txtPID.getText(),
                            majorList.getSelectedItem().toString(), favorite.getSelectedItem().toString(), txtGraduation.getText(),
                            hogWarts.getSelectedItem().toString(), gradStudent.getSelectedItem().toString());
                }

            }

            if (gradStudent.getSelectedItem().toString().equals("Graduate"))
            {
                for (int i = 0; i < 20; i++)
                {

                    graduates[i] = new GradStudent(txtFirstName.getText(), txtMidIn.getText(), txtLastName.getText(),
                            txtAddress1.getText(), txtAddress2.getText(), txtCity.getText(),txtState.getText(),
                            txtZip.getText(), txtBirth.getText(), txtPID.getText(),
                            majorList.getSelectedItem().toString(), favorite.getSelectedItem().toString(), txtGraduation.getText(),
                            hogWarts.getSelectedItem().toString(), gradStudent.getSelectedItem().toString(), txtAdvisorFirst.getText(),
                             txtAdvisorMid.getText(), txtAdvisorLast.getText(), txtThesis.getText());
                }

            }

        }

        if (evt.getSource() == btnRestore) {

            for (int i = 0; i < 20; i++) {

                    if (gradStudent.getSelectedItem().equals("Graduate")) {

                        if (graduates[i].getPurdueID().equals(txtPID.getText())) {

                            for (int k = 0; k < 20; k++) {

                                txtFirstName.setText(graduates[k].studentName.getFirstName());
                                txtMidIn.setText(graduates[k].studentName.getMiddleInitial());
                                txtLastName.setText(graduates[k].studentName.getLastName());
                                txtAddress1.setText(graduates[k].studentAddress.getStreetAddress());
                                txtAddress2.setText(graduates[k].studentAddress.getStreetAddress2());
                                txtCity.setText(graduates[k].studentAddress.getCity());
                                txtState.setText(graduates[k].studentAddress.getState());
                                txtZip.setText(graduates[k].studentAddress.getZipcode());
                                txtAge.setText(Integer.toString(graduates[k].getAge()));
                                txtBirth.setText(graduates[k].getBirthday());
                                txtPID.setText(graduates[k].getPurdueID());
                                majorList.setSelectedItem(graduates[k].getMajor());
                                favorite.setSelectedItem(graduates[k].getClass());
                                txtGraduation.setText(graduates[k].getGradDate());
                                hogWarts.setSelectedItem(graduates[k].getHogWarts());
                                gradStudent.setSelectedItem(graduates[k].getIsGradStudent());
                                txtAdvisorFirst.setText(graduates[k].advisorName.getFirstName());
                                txtAdvisorMid.setText(graduates[k].advisorName.getMiddleInitial());
                                txtAdvisorLast.setText(graduates[k].advisorName.getLastName());
                                txtThesis.setText(graduates[k].getThesisTitle());
                            }
                        }
                    }

                    else {

                        if (undergrads[i].getPurdueID().equals(txtPID.getText())) {

                            for (int g = 0; g < 20; g++) {
                                txtFirstName.setText(undergrads[g].studentName.getFirstName());
                                txtMidIn.setText(undergrads[g].studentName.getMiddleInitial());
                                txtLastName.setText(undergrads[g].studentName.getLastName());
                                txtAddress1.setText(undergrads[g].studentAddress.getStreetAddress());
                                txtAddress2.setText(undergrads[g].studentAddress.getStreetAddress2());
                                txtCity.setText(undergrads[g].studentAddress.getCity());
                                txtState.setText(undergrads[g].studentAddress.getState());
                                txtZip.setText(undergrads[g].studentAddress.getZipcode());
                                txtAge.setText(Integer.toString(undergrads[g].getAge()));
                                txtBirth.setText(undergrads[g].getBirthday());
                                txtPID.setText(undergrads[g].getPurdueID());
                                majorList.setSelectedItem(undergrads[g].getMajor());
                                favorite.setSelectedItem(undergrads[g].getClass());
                                txtGraduation.setText(undergrads[g].getGradDate());
                                hogWarts.setSelectedItem(undergrads[g].getHogWarts());
                                gradStudent.setSelectedItem(undergrads[g].getIsGradStudent());
                            }
                        }
                    }

            }
        }

        if (evt.getSource() == btnExit) {

            System.exit(0);
        }

    }

    public static void main(String[] args){

        NewFrame calc = new NewFrame();
        calc.setSize(600,600);

        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");
        mb.add(file);

        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenu help = new JMenu("Help");
        mb.add(help);

        JMenuItem about = new JMenuItem("About");
        help.add(about);

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(calc, "William Self");
            }
        });

        calc.setJMenuBar(mb);
        calc.setVisible(true);

    }
}