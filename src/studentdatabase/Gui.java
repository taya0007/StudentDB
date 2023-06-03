package studentdatabase;

import studentdatabase.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;




public class Gui extends JFrame {
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel4;

    private  JLabel topicDetailsLabel;

    private JPanel panel3;
    private JButton addStudentButton;
    private JButton findStudentButton;
    private JButton printAllRecordsButton;
    private JButton clearAllRecordsButton;
    private JTextField artMajorField;
    private JTextField artMinorField;
    private JTextField studentNumField;
    private JTextField familyNameField;
    private JTextField givenNamesField;
    private JRadioButton medicineRadioButton;
    private JRadioButton artsRadioButton;
    private JRadioButton scienceRadioButton;
    private JComboBox<String> gradeComboBox;
    private JButton topicResultButton;
    private JButton findTopicResultsButton;

    private JTextField topicTitleTextField;
    private JTextField marksField;
    private JTextField topicNumberTextField;
    private JTextField templateField;
    private JTextField numOfTopicsField;
    private JLabel topicNumberLabel;
    private  JLabel TopicDetails;



    private JFrame frame;

    private JLabel topicTitleLabel;
    public Gui() {
        initComponents();
        frame = new JFrame();
    }

    private void initComponents() {
        setTitle("Student Database Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 453));

        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        panel1 = new JPanel();
        panel1.setBounds(46, 32, 240, 162);
        panel1.setBackground(new Color(220, 220, 220));
        panel1.setLayout(null);

        panel2 = new JPanel();
        panel2.setBounds(293, 32, 237, 163);
        panel2.setBackground(new Color(220, 220, 220));
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(46, 204, 237, 171);
        panel3.setBackground(Color.decode("#DCDCDC"));

        panel4 = new JPanel();
        panel4.setBounds(293, 204, 237, 171);
        panel4.setBackground(new Color(220, 220, 220));
        panel4.setLayout(null);



        // Add components to panel1

        // Degree Options label
        JLabel degreeOptionsLabel = new JLabel("Degree Options");
        degreeOptionsLabel.setBounds(12, 6, 100, 15);
        degreeOptionsLabel.setFont(new Font("System Bold Italic", Font.PLAIN, 10));
        panel1.add(degreeOptionsLabel);

        // Art Major label and text field
        JLabel artMajorLabel = new JLabel("Art Major");
        artMajorLabel.setBounds(16, 42, 70, 10);
        artMajorLabel.setFont(new Font("", Font.PLAIN, 8));
        panel1.add(artMajorLabel);

        artMajorField = new JTextField();
        artMajorField.setBounds(74, 36, 146, 21);
        artMajorField.setFont(new Font("", Font.PLAIN, 6));
        panel1.add(artMajorField);

        // Art Minor label and text field
        JLabel artMinorLabel = new JLabel("Art Minor");
        artMinorLabel.setBounds(17, 65, 70, 10);
        artMinorLabel.setFont(new Font("", Font.PLAIN, 8));
        panel1.add(artMinorLabel);

        artMinorField = new JTextField();
        artMinorField.setBounds(73, 61, 146, 21);
        artMinorField.setFont(new Font("", Font.PLAIN, 6));
        panel1.add(artMinorField);

        // Medicine Prizes label and scroll pane
        JLabel medicinePrizesLabel = new JLabel("Medicine Prizes");
        medicinePrizesLabel.setBounds(5, 111, 80, 10);
        medicinePrizesLabel.setFont(new Font("", Font.PLAIN, 8));
        panel1.add(medicinePrizesLabel);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(73, 94, 145, 67);
        panel1.add(scrollPane);

        // Medicine Prizes text area inside scroll pane
        JTextArea medicinePrizesArea = new JTextArea();
        medicinePrizesArea.setFont(new Font("", Font.PLAIN, 6));
        scrollPane.setViewportView(medicinePrizesArea);

        mainPanel.add(panel1);



        // Add components to panel2

        // Student Number label and text field

        JLabel TopicDetails = new JLabel("Topic Details");
        TopicDetails.setBounds(12, 6, 100, 15);
        TopicDetails.setFont(new Font("System Bold Italic", Font.PLAIN, 10));
        panel2.add(TopicDetails);

        JLabel studentNumLabel = new JLabel("Student Number");
        studentNumLabel.setBounds(12, 22, 100, 15);
        studentNumLabel.setFont(new Font("", Font.PLAIN, 8));
        panel2.add(studentNumLabel);

        studentNumField = new JTextField();
        studentNumField.setBounds(120, 20, 105, 21);
        studentNumField.setFont(new Font("", Font.PLAIN, 6));
        panel2.add(studentNumField);

        // Family Name label and text field
        JLabel familyNameLabel = new JLabel("Family Name");
        familyNameLabel.setBounds(12, 48, 100, 15);
        familyNameLabel.setFont(new Font("", Font.PLAIN, 8));
        panel2.add(familyNameLabel);

        familyNameField = new JTextField();
        familyNameField.setBounds(120, 46, 105, 21);
        familyNameField.setFont(new Font("", Font.PLAIN, 6));
        panel2.add(familyNameField);

        // Given Names label and text field
        JLabel givenNamesLabel = new JLabel("Given Names");
        givenNamesLabel.setBounds(12, 74, 100, 15);
        givenNamesLabel.setFont(new Font("", Font.PLAIN, 8));
        panel2.add(givenNamesLabel);

        givenNamesField = new JTextField();
        givenNamesField.setBounds(120, 72, 105, 21);
        givenNamesField.setFont(new Font("", Font.PLAIN, 6));
        panel2.add(givenNamesField);

        // Degree label
        JLabel degreeLabel = new JLabel("Degree");
        degreeLabel.setBounds(12, 96, 100, 15);
        degreeLabel.setFont(new Font("", Font.PLAIN, 8));
        panel2.add(degreeLabel);

        // Degree radio buttons
        medicineRadioButton = new JRadioButton("Medicine");
        medicineRadioButton.setBounds(120, 96, 80, 20);
        medicineRadioButton.setFont(new Font("", Font.PLAIN, 8));
        panel2.add(medicineRadioButton);

        artsRadioButton = new JRadioButton("Arts");
        artsRadioButton.setBounds(120, 116, 80, 20);
        artsRadioButton.setFont(new Font("", Font.PLAIN, 8));
        panel2.add(artsRadioButton);

        scienceRadioButton = new JRadioButton("Science");
        scienceRadioButton.setBounds(120, 136, 80, 20);
        scienceRadioButton.setFont(new Font("", Font.PLAIN, 8));
        panel2.add(scienceRadioButton);

        ButtonGroup degreeButtonGroup = new ButtonGroup();
        degreeButtonGroup.add(medicineRadioButton);
        degreeButtonGroup.add(artsRadioButton);
        degreeButtonGroup.add(scienceRadioButton);

        mainPanel.add(panel2);

        // Add Student button
        addStudentButton = new JButton("Add Student");
        addStudentButton.setBounds(46, 380, 111, 25);
        mainPanel.add(addStudentButton);

        // Find Student button
        findStudentButton = new JButton("Find Student");
        findStudentButton.setBounds(168, 380, 111, 25);
        mainPanel.add(findStudentButton);

        // Print All Records button
        printAllRecordsButton = new JButton("Print All Records");
        printAllRecordsButton.setBounds(300, 380, 111, 25);
        mainPanel.add(printAllRecordsButton);

        // Clear All Records button
        clearAllRecordsButton = new JButton("Clear All Records");
        clearAllRecordsButton.setBounds(420, 380, 111, 25);
        mainPanel.add(clearAllRecordsButton);


        topicDetailsLabel = new JLabel("Topic Details");
        topicDetailsLabel.setFont(new Font("System Bold Italic", Font.PLAIN, 10));
        topicDetailsLabel.setBounds(12, 13, 68, 13);
        panel3.add(topicDetailsLabel);

        topicNumberLabel = new JLabel("Topic Code");
        topicNumberLabel.setFont(new Font("", Font.PLAIN, 8));
        topicNumberLabel.setBounds(16, 35, 66, 13);
        panel3.add(topicNumberLabel);

        topicNumberTextField = new JTextField();
        topicNumberTextField.setFont(new Font("", Font.PLAIN, 6));
        topicNumberTextField.setBounds(89, 32, 130, 21);
        panel3.add(topicNumberTextField);

        topicTitleLabel = new JLabel("Marks");
        topicTitleLabel.setFont(new Font("", Font.PLAIN, 8));
        topicTitleLabel.setBounds(16, 58, 51, 13);
        panel3.add(topicTitleLabel);

        topicTitleTextField = new JTextField();
        topicTitleTextField.setFont(new Font("", Font.PLAIN, 6));
        topicTitleTextField.setBounds(89, 58, 130, 21);
        panel3.add(topicTitleTextField);

        // Add Grade label
        JLabel gradeLabel = new JLabel("Grade");
        gradeLabel.setBounds(16, 98, 100, 15);
        gradeLabel.setFont(new Font("", Font.PLAIN, 8));
        panel2.add(gradeLabel);

// Grade combo box
        String[] gradeOptions = {"HD", "DN", "CR", "P", "F"};
        gradeComboBox = new JComboBox<>(gradeOptions);
        gradeComboBox.setBounds(89, 86, 105, 21);
        gradeComboBox.setFont(new Font("", Font.PLAIN, 6));
        panel3.add(gradeComboBox);


        mainPanel.add(panel3);

        JLabel awardPrizesLabel = new JLabel("Award Prizes");
        awardPrizesLabel.setFont(new Font("System Bold Italic", Font.PLAIN, 10));
        awardPrizesLabel.setBounds(16, 16, 80, 14);
        panel4.add(awardPrizesLabel);

        // Add Prize Name label
        JLabel prizeNameLabel = new JLabel("Prize Name");
        prizeNameLabel.setFont(new Font("", Font.PLAIN, 8));
        prizeNameLabel.setBounds(29, 43, 62, 14);
        panel4.add(prizeNameLabel);

        // Add Prize Name text field
        JTextField prizeNameTextField = new JTextField();
        prizeNameTextField.setBounds(77, 34, 146, 21);
        prizeNameTextField.setFont(new Font("", Font.PLAIN, 6));
        panel4.add(prizeNameTextField);

        // Add Template label
        JLabel templateLabel = new JLabel("Template");
        templateLabel.setFont(new Font("", Font.PLAIN, 8));
        templateLabel.setBounds(36, 74, 45, 14);
        panel4.add(templateLabel);

        // Add Template text field
        JTextField templateTextField = new JTextField();
        templateTextField.setBounds(77, 66, 146, 21);
        templateTextField.setFont(new Font("", Font.PLAIN, 6));
        panel4.add(templateTextField);

        // Add Number of Topics label
        JLabel numberOfTopicsLabel = new JLabel("Number of Topics");
        numberOfTopicsLabel.setFont(new Font("", Font.PLAIN, 8));
        numberOfTopicsLabel.setBounds(9, 101, 81, 14);
        panel4.add(numberOfTopicsLabel);

        // Add Number of Topics text field
        JTextField numberOfTopicsTextField = new JTextField();
        numberOfTopicsTextField.setBounds(77, 95, 146, 21);
        numberOfTopicsTextField.setFont(new Font("", Font.PLAIN, 6));
        panel4.add(numberOfTopicsTextField);

        mainPanel.add(panel4);

        // Action listeners for buttons

       /* addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve student information from text fields
                String studentNum = studentNumField.getText();
                String familyName = familyNameField.getText();
                String givenNames = givenNamesField.getText();
                String degree = "";

                // Determine the selected degree
                if (medicineRadioButton.isSelected()) {
                    degree = "Medicine";
                } else if (artsRadioButton.isSelected()) {
                    degree = "Arts";
                } else if (scienceRadioButton.isSelected()) {
                    degree = "Science";
                }

                // Create a new student object
                Student student = new Student(studentNum, familyName, givenNames, degree);

                // Add the student to the records list
                studenttudent.add(student);

                // Display a success message
                JOptionPane.showMessageDialog(frame, "Student added successfully!");

                // Clear the text fields
                studentNumField.setText("");
                familyNameField.setText("");
                givenNamesField.setText("");
                degreeButtonGroup.clearSelection();
            }
        });

       findStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve student number to search
                String searchStudentNum = studentNumField.getText();

                // Search for the student in the records list
                for (Student student : records) {
                    if (student.getStudentNumber.equals(searchStudentNum)) {
                        // Display the found student's information
                        JOptionPane.showMessageDialog(frame, student.toString());
                        return; // Exit the loop once the student is found
                    }
                }

                // If no student is found, display an error message
                JOptionPane.showMessageDialog(frame, "Student not found!");
            }
        });

        printAllRecordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if there are any records
                if (records.isEmpty()) {
                    // Display a message if no records are available
                    JOptionPane.showMessageDialog(frame, "No records found!");
                } else {
                    // Print all the records
                    StringBuilder allRecords = new StringBuilder();
                    for (Student student : records) {
                        allRecords.append(student.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(frame, allRecords.toString());
                }
            }
        });

        clearAllRecordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear all the records
                records.clear();

                // Display a success message
                JOptionPane.showMessageDialog(frame, "All records cleared!");
            }
        });*/

        // Set the frame properties
        setTitle("Student Database Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 453));
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Gui gui = new Gui();
            }
        });
    }
}









