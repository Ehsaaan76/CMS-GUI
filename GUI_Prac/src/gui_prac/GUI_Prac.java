package gui_prac;


//author Ehsan ullah
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


class Teacher{
    private String teacher_first_name;
    private String teacher_last_name;
    private int teacher_age;
    private String teacher_gender;
    private Long teacher_contact;
    private String teacher_email;
    private String teacher_address;
    private String teacher_username;
    private String teacher_password;

   public Teacher(String teacher_first_name, String teacher_last_name, int teacher_age, String teacher_gender, Long teacher_contact, String teacher_email, String teacher_username, String teacher_password, String teacher_address) {
    this.teacher_first_name = teacher_first_name;
    this.teacher_last_name = teacher_last_name;
    this.teacher_age = teacher_age;
    this.teacher_gender = teacher_gender;
    this.teacher_contact = teacher_contact;
    this.teacher_email = teacher_email;
    this.teacher_username = teacher_username;
    this.teacher_password = teacher_password;
    this.teacher_address = teacher_address;
}

    public String getteacher_first_name() {
        return teacher_first_name;
    }

    public String getteacher_last_name() {
        return teacher_last_name;
    }

    public int getteacher_age() {
        return teacher_age;
    }

    public String getteacher_gender() {
        return teacher_gender;
    }

    public Long getteacher_contact() {
        return teacher_contact;
    }

    public String getteacher_email() {
        return teacher_email;
    }

    public String getteacher_address() {
        return teacher_address;
    }
    
    public String getteacher_username() {
        return teacher_username;
    }

    public String getteacher_password() {
        return teacher_password;
    }
}

class Announcement{
    private String subject;
    private String type;
    private String description;
    private int marks;
    
    
    Announcement(String subject, String type, int marks, String description){
        this.subject = subject;
        this.type = type;
        this.description = description;
        this.marks = marks;
    }
    
     public String getsubject() {
        return subject;
    }

    public String gettype() {
        return type;
    }

    public String getdescription() {
        return description;
    }
    
    public int getmarks() {
        return marks;
    }
    
}


class Student{
    private int student_roll;
    private int student_class;
    private String student_first_name;
    private String student_last_name;
    private int student_age;
    private String student_gender;
    private Long student_contact;
    private String student_email;
    private String student_username;
    private String student_password;
    private String student_address;
    private boolean Fees;
    

   public Student(int student_roll, int student_class, String student_first_name, String student_last_name, int student_age, String student_gender, Long student_contact, String student_email, String student_username, String student_password, String student_address) {
    this.student_roll = student_roll;
    this.student_class = student_class;
    this.student_first_name = student_first_name;
    this.student_last_name = student_last_name;
    this.student_age = student_age;
    this.student_gender = student_gender;
    this.student_contact = student_contact;
    this.student_email = student_email;
    this.student_username = student_username;
    this.student_password = student_password;
    this.student_address = student_address;
}


    public int getstudent_Roll() {
        return student_roll;
    }

    public int getstudent_class() {
        return student_class;
    }

    public String getstudent_First_name() {
        return student_first_name;
    }

    public String getstudent_Last_name() {
        return student_last_name;
    }

    public int getstudent_Age() {
        return student_age;
    }

    public String getstudent_Gender() {
        return student_gender;
    }

    public Long getstudent_Contact() {
        return student_contact;
    }

    public String getstudent_Email() {
        return student_email;
    }

    public String getstudent_Address() {
        return student_address;
    }
    
    public String getstudent_username() {
        return student_username;
    }

    public String getstudent_password() {
        return student_password;
    }
}



class utility{
    
        public static void hover_effect(JButton button) {
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent event) {
                    button.setBackground(new Color(50, 90, 140));
                }

                @Override
                public void mouseExited(MouseEvent event) {
                    button.setBackground(new Color(70, 130, 180));
            }
        });
    }
        public JButton Back_button(JButton button){
                    button.setText("Back");
                    button.setBounds(20, 430, 100, 30);
                    button.setBackground(new Color(70, 130, 180));
                    button.setFont(new Font("Courier New", Font.BOLD, 14));
                    utility.hover_effect(button);
                    button.setToolTipText("Click to Go Back");
                    button.setForeground(Color.WHITE);
                    return button;
        }
        
        public JButton Exit_button(JButton button){
                    button.setText("Exit");
                    button.setBounds(573, 430, 100, 30);
                    button.setBackground(new Color(70, 130, 180));
                    button.setFont(new Font("Courier New", Font.BOLD, 14));
                    utility.hover_effect(button);
                    button.setToolTipText("Click to Quit");
                    button.setForeground(Color.WHITE);
                    return button;
        }
        
        public void Back_func(JButton button, JFrame frame, JPanel back_panel) {
                button.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent event) {
                    frame.setContentPane(back_panel);
                    frame.revalidate();
                }
                
    });
        }
        
        public void Exit_func(JButton button) {
                button.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent event) {
                    System.exit(0);
                }
            });
    }
       
}


public class GUI_Prac{

    private static int total_students = 0;
    private static int total_teachers = 0;
    private static int total_announcements=0;
    
    static int student_roll;
    static int student_class;
    static String student_first_name;
    static String student_last_name;
    static int student_age;
    static String student_gender;
    static Long student_contact;
    static String student_email;
    static String student_address; 
    static String student_username;
    static String student_password;
    
    
    static String teacher_first_name;
    static String teacher_last_name;
    static int teacher_age;
    static String teacher_gender;
    static Long teacher_contact;
    static String teacher_email;
    static String teacher_address;
    static String teacher_username;
    static String teacher_password;
    
    static String subject;
    static String type;
    static String description;
    static int marks;
    
    
    public static void main(String[] args) {
        
       
        Student[] students = new Student[30];
        Teacher[] teachers = new Teacher[1];
        Announcement[] announcements = new Announcement[30];
        

        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        utility utility = new utility();



       
        frame.setTitle("Class Management System");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocation(300,100);
        panel.setBackground(new Color(173, 216, 230));
        panel.setLayout(null);
        
        JLabel Login_label = new JLabel("CMS Login");
        Login_label.setBounds(90, 30, 500, 60);
        Login_label.setHorizontalAlignment(JLabel.CENTER);
        Login_label.setVerticalAlignment(JLabel.CENTER);
        Login_label.setFont(new Font("Serif", Font.BOLD, 40));
        Login_label.setForeground(new Color (70, 130, 180));
        panel.add(Login_label);
        
        
        {
        JLabel t_label = new JLabel();
        t_label.setText("Login as a TEACHER");
        t_label.setBounds(80, 325, 200, 30);
        t_label.setHorizontalAlignment(JLabel.CENTER);
        t_label.setVerticalAlignment(JLabel.TOP);
        t_label.setFont(new Font("Courier New", Font.BOLD, 15));
        URL t_img = GUI_Prac.class.getResource("teacher.png");
        ImageIcon teacher_icon = new ImageIcon(t_img);
        Image teacher_image = teacher_icon.getImage();
        Image t_resizedImage = teacher_image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon t_resizedIcon = new ImageIcon(t_resizedImage);
        JButton t_image_button = new JButton(t_resizedIcon);
        t_image_button.setBounds(80, 120, 200, 200);
        t_image_button.setBackground(new Color(70, 130, 180));
        t_image_button.setBorder(BorderFactory.createEmptyBorder());
        t_image_button.setToolTipText("Click here to log in as a TEACHER");
        panel.add(t_label);
        panel.add(t_image_button);
        utility.hover_effect(t_image_button);
        
        
        JButton admin_button = new JButton(); 
        admin_button.setText("Admin");
        admin_button.setBounds(20, 430, 100, 30);
        admin_button.setBackground(new Color(70, 130, 180));
        admin_button.setFont(new Font("Courier New", Font.BOLD, 14));
        utility.hover_effect(admin_button);
        admin_button.setToolTipText("Login as an Admin");
        admin_button.setForeground(Color.WHITE);
        panel.add(admin_button);
        
        JButton button_exit_main_panel = utility.Exit_button(new JButton());
        panel.add(button_exit_main_panel);
        utility.Exit_func(button_exit_main_panel);
      
        
        admin_button.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent event) {
                    
        final String admin_username = "ehsan76";
        final String admin_password = "ehsan76";
        

        JPanel admin_login_panel = new JPanel();
        admin_login_panel.setBackground(new Color(173, 216, 230));
        admin_login_panel.setLayout(null);
        
      
        JLabel admin_login_label = new JLabel("Admin's Login");
        admin_login_label.setBounds(90, 30, 500, 60);
        admin_login_label.setHorizontalAlignment(JLabel.CENTER);
        admin_login_label.setFont(new Font("Serif", Font.BOLD, 35));
        admin_login_label.setForeground(new Color(70, 130, 180));
        admin_login_panel.add(admin_login_label);

        JLabel admin_username_label = new JLabel("Username:");
        admin_username_label.setBounds(170, 180, 100, 30);
        admin_username_label.setFont(new Font("Serif", Font.ROMAN_BASELINE, 22));
        admin_login_panel.add(admin_username_label);

        JTextField admin_username_field = new JTextField();
        admin_username_field.setBounds(278, 180, 180, 35);
        admin_username_field.setFont(new Font("Arial", Font.PLAIN, 20));
        admin_username_field.setHorizontalAlignment(JLabel.CENTER);
        admin_username_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        admin_login_panel.add(admin_username_field);

        JLabel admin_password_label = new JLabel("Password:");
        admin_password_label.setBounds(170, 230, 100, 30);
        admin_password_label.setFont(new Font("Serif", Font.ROMAN_BASELINE, 22));
        admin_login_panel.add(admin_password_label);

        JPasswordField admin_password_field = new JPasswordField();
        admin_password_field.setBounds(278, 230, 180, 35);
        admin_password_field.setFont(new Font("Arial", Font.PLAIN, 25));
        admin_password_field.setHorizontalAlignment(JLabel.CENTER);
        admin_password_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        admin_login_panel.add(admin_password_field);

        JButton login_button = new JButton("Login");
        login_button.setBounds(170, 290, 290, 35);
        login_button.setBackground(new Color(70, 130, 180));
        login_button.setFont(new Font("Courier New", Font.BOLD, 16));
        login_button.setForeground(Color.WHITE);
        utility.hover_effect(login_button);
        admin_login_panel.add(login_button);
        
        JButton back_button_admin_login_panel = utility.Back_button(new JButton());
        admin_login_panel.add(back_button_admin_login_panel);
        utility.Back_func(back_button_admin_login_panel, frame, panel);
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String current_date = formatter.format(new Date());
        JLabel date_label = new JLabel("Date: " + current_date);
        date_label.setBounds(573, 440, 100, 30);
        admin_login_panel.add(date_label);
        
        
        frame.setContentPane(admin_login_panel);
        frame.setVisible(true);
        login_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                String username = admin_username_field.getText();
                String password = new String(admin_password_field.getPassword());

                
                if (!admin_username.equals(username) || !admin_password.equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Wrong Username or Password! Try Again...");
                    admin_username_field.setText("");
                    admin_password_field.setText("");
                }
                else {
                    JPanel admin_panel = new JPanel();
                    admin_panel.setBackground(new Color(173, 216, 230));
                    admin_panel.setLayout(null);
                    JLabel admin_label = new JLabel();
                    admin_label.setText("Admin's Dashboard");
                    admin_label.setBounds(90, 30, 500, 60);
                    admin_label.setHorizontalAlignment(JLabel.CENTER);
                    admin_label.setFont(new Font("Serif", Font.BOLD,35));
                    admin_label.setForeground(new Color (70, 130, 180));
                    admin_panel.add(admin_label);
                    frame.setContentPane(admin_panel);
                    frame.revalidate();
                    
                    if(total_teachers == teachers.length){
                    JLabel admin_t_label = new JLabel();
                    admin_t_label.setText("VIEW TEACHER");
                    admin_t_label.setBounds(80, 325, 200, 30);
                    admin_t_label.setHorizontalAlignment(JLabel.CENTER);
                    admin_t_label.setVerticalAlignment(JLabel.TOP);
                    admin_t_label.setFont(new Font("Courier New", Font.BOLD, 15));
                    URL admin_t_img = GUI_Prac.class.getResource("teacher.png");
                    ImageIcon admin_teacher_icon = new ImageIcon(admin_t_img);
                    Image admin_teacher_image = admin_teacher_icon.getImage();
                    Image admin_t_resizedImage = admin_teacher_image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    ImageIcon admin_t_resizedIcon = new ImageIcon(admin_t_resizedImage);
                    JButton admin_t_image_button = new JButton(admin_t_resizedIcon);
                    admin_t_image_button.setBounds(80, 120, 200, 200);
                    admin_t_image_button.setBackground(new Color(70, 130, 180));
                    admin_t_image_button.setBorder(BorderFactory.createEmptyBorder());
                    admin_t_image_button.setToolTipText("Click here to add a Teacher");
                    admin_panel.add(admin_t_label);
                    admin_panel.add(admin_t_image_button);
                    utility.hover_effect(admin_t_image_button);
                    
               admin_t_image_button.addMouseListener(new java.awt.event.MouseAdapter(){
               @Override
                    public void mousePressed(java.awt.event.MouseEvent event){

                    JPanel view_teacher_panel = new JPanel();
                    view_teacher_panel.setBackground(new Color(173, 216, 230));
                    view_teacher_panel.setLayout(null);
                    JLabel view_teacher_label = new JLabel();
                    view_teacher_label.setText("Viewing Teacher's Data");
                    view_teacher_label.setHorizontalAlignment(JLabel.CENTER);
                    view_teacher_label.setFont(new Font("Serif", Font.BOLD,35));
                    view_teacher_label.setForeground(new Color (70, 130, 180));
                    view_teacher_label.setBounds(90, 30, 500, 60);
                    view_teacher_panel.add(view_teacher_label);
                    

                    JTextArea teacher_data_area = new JTextArea();
                    teacher_data_area.setBounds(50, 100, 600, 300);
                    teacher_data_area.setFont(new Font("Arial", Font.PLAIN, 14));
                    teacher_data_area.setEditable(false);

                    StringBuilder TeacherData = new StringBuilder();

                        Teacher teacher = teachers[0];
                        TeacherData.append("First Name: ").append(teacher.getteacher_first_name()).append("\n");
                        TeacherData.append("Last Name: ").append(teacher.getteacher_last_name()).append("\n");
                        TeacherData.append("Age: ").append(teacher.getteacher_age()).append("\n");
                        TeacherData.append("Gender: ").append(teacher.getteacher_gender()).append("\n");
                        TeacherData.append("Contact: ").append(teacher.getteacher_contact()).append("\n");
                        TeacherData.append("Email: ").append(teacher.getteacher_email()).append("\n");
                        TeacherData.append("Username: ").append(teacher.getteacher_username()).append("\n");
                        TeacherData.append("Password: ").append(teacher.getteacher_password()).append("\n");
                        TeacherData.append("Address: ").append(teacher.getteacher_address()).append("\n");
                        TeacherData.append("=======================================\n");
                     

                    teacher_data_area.setText(TeacherData.toString());
                    JScrollPane scrollPane = new JScrollPane(teacher_data_area);
                    scrollPane.setBounds(50, 100, 600, 300);
                    view_teacher_panel.add(scrollPane);
                    
                    JButton back_button_teacher_view_panel = utility.Back_button(new JButton());
                    view_teacher_panel.add(back_button_teacher_view_panel);
                    utility.Back_func(back_button_teacher_view_panel, frame, admin_panel);
                    
                    JButton update_teacher_data = new JButton();
                    update_teacher_data.setText("Update");
                    update_teacher_data.setBounds(573, 430, 100, 30);
                    update_teacher_data.setBackground(new Color(70, 130, 180));
                    update_teacher_data.setFont(new Font("Courier New", Font.BOLD, 14));
                    utility.hover_effect(update_teacher_data);
                    update_teacher_data.setToolTipText("Click to Update Teacher's Data");
                    update_teacher_data.setForeground(Color.WHITE);
                    view_teacher_panel.add(update_teacher_data);
                    
                    update_teacher_data.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        
                    
                    JPanel update_teacher_panel = new JPanel();
                    update_teacher_panel.setBackground(new Color(173, 216, 230));
                    update_teacher_panel.setLayout(null);
                    JLabel update_teacher_label = new JLabel();
                    update_teacher_label.setText("Updating Teacher's Data");
                    update_teacher_label.setHorizontalAlignment(JLabel.CENTER);
                    update_teacher_label.setFont(new Font("Serif", Font.BOLD,35));
                    update_teacher_label.setForeground(new Color (70, 130, 180));
                    update_teacher_label.setBounds(90, 30, 500, 60);
                    update_teacher_panel.add(update_teacher_label);
                    
                    
                        JLabel t_update_fname_label = new JLabel("First Name:");
                        t_update_fname_label.setBounds(90, 105, 100, 30);
                        update_teacher_panel.add(t_update_fname_label);

                        JTextField t_update_fname_field = new JTextField(teacher_first_name);
                        t_update_fname_field.setBounds(158, 110, 150, 25);
                        t_update_fname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_fname_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_fname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_fname_field);

                        JLabel t_update_lname_label = new JLabel("Last Name:");
                        t_update_lname_label.setBounds(390, 105, 100, 30);
                        update_teacher_panel.add(t_update_lname_label);

                        JTextField t_update_lname_field = new JTextField(teacher_last_name);
                        t_update_lname_field.setBounds(458, 110, 150, 25);
                        t_update_lname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_lname_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_lname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_lname_field);

                        JLabel t_update_age_label = new JLabel("Age:");
                        t_update_age_label.setBounds(90, 150, 100, 30);
                        update_teacher_panel.add(t_update_age_label);

                        JTextField t_update_age_field = new JTextField(String.valueOf(teacher_age));
                        t_update_age_field.setBounds(158, 155, 150, 25);
                        t_update_age_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_age_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_age_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_age_field);

                        JLabel t_update_gender_label = new JLabel("Gender:");
                        t_update_gender_label.setBounds(390, 150, 100, 30);
                        update_teacher_panel.add(t_update_gender_label);

                        String[] genderOptions = {"Select", "Male", "Female", "Other"};
                        JComboBox<String> t_gender_field = new JComboBox<>(genderOptions);
                        t_gender_field.setBounds(458, 155, 150, 25);
                        t_gender_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        update_teacher_panel.add(t_gender_field);

                        JLabel t_update_contact_label = new JLabel("Contact:");
                        t_update_contact_label.setBounds(90, 190, 200, 40);
                        update_teacher_panel.add(t_update_contact_label);

                        JTextField t_update_contact_field = new JTextField(String.valueOf(teacher_contact));
                        t_update_contact_field.setBounds(158, 195, 150, 25);
                        t_update_contact_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_contact_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_contact_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_contact_field);

                        JLabel t_update_email_label = new JLabel("Email:");
                        t_update_email_label.setBounds(390, 190, 200, 40);
                        update_teacher_panel.add(t_update_email_label);

                        JTextField t_update_email_field = new JTextField(teacher_email);
                        t_update_email_field.setBounds(458, 195, 150, 25);
                        t_update_email_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_email_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_email_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_email_field);

                        JLabel t_update_username_label = new JLabel("Username:");
                        t_update_username_label.setBounds(90, 230, 200, 40);
                        update_teacher_panel.add(t_update_username_label);

                        JTextField t_update_username_field = new JTextField(teacher_username);
                        t_update_username_field.setBounds(158, 235, 150, 25);
                        t_update_username_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_username_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_username_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_username_field);


                        JLabel t_update_password_label = new JLabel("Password:");
                        t_update_password_label.setBounds(390, 230, 200, 40);
                        update_teacher_panel.add(t_update_password_label);

                        JTextField t_update_password_field = new JTextField(teacher_password);
                        t_update_password_field.setBounds(458, 235, 150, 25);
                        t_update_password_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_password_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_password_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_password_field);


                        JLabel t_update_address_label = new JLabel("Address:");
                        t_update_address_label.setBounds(90, 270, 200, 40);
                        update_teacher_panel.add(t_update_address_label);

                        JTextField t_update_address_field = new JTextField(teacher_address);
                        t_update_address_field.setBounds(158, 275, 450, 50);
                        t_update_address_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_address_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_address_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_address_field);

                        JButton save_update_button = new JButton("Save");
                        save_update_button.setBounds(250, 350, 200, 30);
                        save_update_button.setBackground(new Color(70, 130, 180));
                        save_update_button.setFont(new Font("Courier New", Font.BOLD, 16));
                        save_update_button.setForeground(Color.WHITE);
                        utility.hover_effect(save_update_button);
                        update_teacher_panel.add(save_update_button);


                        save_update_button.addMouseListener(new MouseAdapter() {
                            @Override
                             public void mousePressed(MouseEvent event) {
                                try {
                                    total_teachers = 0;
                                    teacher_first_name = t_update_fname_field.getText();
                                    teacher_last_name = t_update_lname_field.getText();
                                    teacher_age = Integer.parseInt(t_update_age_field.getText());
                                    teacher_gender = (String) t_gender_field.getSelectedItem();
                                    teacher_contact = Long.parseLong(t_update_contact_field.getText());
                                    teacher_email = t_update_email_field.getText();
                                    teacher_username =  t_update_username_field.getText();
                                    teacher_password = t_update_password_field.getText();
                                    teacher_address = t_update_address_field.getText();
                                    
                                    if (teacher_first_name.isEmpty() || teacher_last_name.isEmpty() || teacher_email.isEmpty() || teacher_username.isEmpty() || teacher_password.isEmpty() || teacher_address.isEmpty() || teacher_gender.equals("Select")){
                                        throw new Exception("Please enter valid data!");
                                    }

                                    Teacher new_teacher = new Teacher(teacher_first_name, teacher_last_name, teacher_age, teacher_gender, teacher_contact, teacher_email, teacher_username, teacher_password, teacher_address);
                                    if (total_teachers < teachers.length) {
                                        teachers[total_teachers] = new_teacher;
                                        total_teachers++;
                                        JOptionPane.showMessageDialog(frame, "Teacher's Data Updated successfully! Login Again...");
                                        frame.setContentPane(panel);
                                        frame.revalidate();
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Only One Teacher can be Added...!");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(frame, "Please enter valid data!");
                                }
                            }

                           
                        });
                    
                    frame.setContentPane(update_teacher_panel);
                    frame.revalidate();
                    
                    
                    JButton back_button_teacher_update_panel = utility.Back_button(new JButton());
                    update_teacher_panel.add(back_button_teacher_update_panel);
                    utility.Back_func(back_button_teacher_update_panel, frame, admin_panel);

 
                        
                        JButton print_teacher_data = new JButton();
                        print_teacher_data.setText("Print");
                        print_teacher_data.setBounds(573, 430, 100, 30);
                        print_teacher_data.setBackground(new Color(70, 130, 180));
                        print_teacher_data.setFont(new Font("Courier New", Font.BOLD, 14));
                        utility.hover_effect(print_teacher_data);
                        print_teacher_data.setToolTipText("Click here to Print Student's Data");
                        print_teacher_data.setForeground(Color.WHITE);
                        update_teacher_panel.add(print_teacher_data);

                        print_teacher_data.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){


                            File file = new File("Teacher_data.txt");

                            if(file.exists()){
                               int user_response = JOptionPane.showConfirmDialog(frame,"File already exist. Do you want to overwrite it?", "Confirm Overwrite", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if(user_response != JOptionPane.YES_OPTION){
                                return;
                            }
                        }
                            try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {

                            Teacher teacher = teachers[0];
                            
                            pw.println("Full Name: " + teacher.getteacher_first_name()+" " + teacher.getteacher_last_name());
                            pw.println("Age: " + teacher.getteacher_age());
                            pw.println("Gender: " + teacher.getteacher_gender()); 
                            pw.println("Contact: " + teacher.getteacher_contact());
                            pw.println("Email: " + teacher.getteacher_email());  
                            pw.println("Username: " + teacher.getteacher_username());
                            pw.println("Password: " + teacher.getteacher_password());
                            pw.println("Address: " + teacher.getteacher_address());
                            pw.println("=======================================\n");
                        
                                 
                            JOptionPane.showMessageDialog(frame, "Teacher data successfully saved to Teacher_data.txt!");

                              }catch(Exception e){
                                 JOptionPane.showMessageDialog(frame, "Error saving Teacher data: " + e.getMessage());

                              }        }
                        
                        });

                        
                        
               
                    
                    }
                    });
                    
                    frame.setContentPane(view_teacher_panel);
                    frame.revalidate();
                    }
                              });

                 
               }
                   
                    
                    else{
                    JLabel admin_t_label = new JLabel();
                    admin_t_label.setText("ADD TEACHER");
                    admin_t_label.setBounds(80, 325, 200, 30);
                    admin_t_label.setHorizontalAlignment(JLabel.CENTER);
                    admin_t_label.setVerticalAlignment(JLabel.TOP);
                    admin_t_label.setFont(new Font("Courier New", Font.BOLD, 15));
                    URL admin_t_img = GUI_Prac.class.getResource("teacher.png");
                    ImageIcon admin_teacher_icon = new ImageIcon(admin_t_img);
                    Image admin_teacher_image = admin_teacher_icon.getImage();
                    Image admin_t_resizedImage = admin_teacher_image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    ImageIcon admin_t_resizedIcon = new ImageIcon(admin_t_resizedImage);
                    JButton admin_t_image_button = new JButton(admin_t_resizedIcon);
                    admin_t_image_button.setBounds(80, 120, 200, 200);
                    admin_t_image_button.setBackground(new Color(70, 130, 180));
                    admin_t_image_button.setBorder(BorderFactory.createEmptyBorder());
                    admin_t_image_button.setToolTipText("Click here to add a Teacher");
                    admin_panel.add(admin_t_label);
                    admin_panel.add(admin_t_image_button);
                    utility.hover_effect(admin_t_image_button);
                    
               admin_t_image_button.addMouseListener(new java.awt.event.MouseAdapter(){
               @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                    JPanel add_teacher_panel = new JPanel();
                    add_teacher_panel.setBackground(new Color(173, 216, 230));
                    add_teacher_panel.setLayout(null);
                    JLabel add_teacher_label = new JLabel();
                    add_teacher_label.setText("Adding Teacher");
                    add_teacher_label.setBounds(90, 30, 500, 60);
                    add_teacher_label.setHorizontalAlignment(JLabel.CENTER);
                    add_teacher_label.setFont(new Font("Serif", Font.BOLD,35));
                    add_teacher_label.setForeground(new Color (70, 130, 180));
                    add_teacher_panel.add(add_teacher_label);
                   
                    
                    JLabel t_fname_label = new JLabel("First Name:");
                    t_fname_label.setBounds(90, 105, 100, 30);
                    add_teacher_panel.add(t_fname_label);
                    
                    JTextField t_fname_field = new JTextField();
                    t_fname_field.setBounds(158, 110, 150, 25);
                    t_fname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    t_fname_field.setHorizontalAlignment(JLabel.CENTER);
                    t_fname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    add_teacher_panel.add(t_fname_field);

                    JLabel t_lname_label = new JLabel("Last Name:");
                    t_lname_label.setBounds(390, 105, 100, 30);
                    add_teacher_panel.add(t_lname_label);

                    JTextField t_lname_field = new JTextField();
                    t_lname_field.setBounds(458, 110, 150, 25);
                    t_lname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    t_lname_field.setHorizontalAlignment(JLabel.CENTER);
                    t_lname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    add_teacher_panel.add(t_lname_field);

                    JLabel t_age_label = new JLabel("Age:");
                    t_age_label.setBounds(90, 150, 100, 30);
                    add_teacher_panel.add(t_age_label);

                    JTextField t_age_field = new JTextField();
                    t_age_field.setBounds(158, 155, 150, 25);
                    t_age_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    t_age_field.setHorizontalAlignment(JLabel.CENTER);
                    t_age_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    add_teacher_panel.add(t_age_field);

                    JLabel t_gender_label = new JLabel("Gender:");
                    t_gender_label.setBounds(390, 150, 100, 30);
                    add_teacher_panel.add(t_gender_label);

                    String[] genderOptions = {"Select", "Male", "Female", "Other"};
                    JComboBox<String> t_gender_field = new JComboBox<>(genderOptions);
                    t_gender_field.setBounds(458, 155, 150, 25);
                    t_gender_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    add_teacher_panel.add(t_gender_field);
                    
                    JLabel t_contact_label = new JLabel("Contact:");
                    t_contact_label.setBounds(90, 190, 200, 40);
                    add_teacher_panel.add(t_contact_label);

                    JTextField t_contact_field = new JTextField();
                    t_contact_field.setBounds(158, 195, 150, 25);
                    t_contact_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    t_contact_field.setHorizontalAlignment(JLabel.CENTER);
                    t_contact_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    add_teacher_panel.add(t_contact_field);
                    
                    JLabel t_email_label = new JLabel("Email:");
                    t_email_label.setBounds(390, 190, 200, 40);
                    add_teacher_panel.add(t_email_label);

                    JTextField t_email_field = new JTextField();
                    t_email_field.setBounds(458, 195, 150, 25);
                    t_email_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    t_email_field.setHorizontalAlignment(JLabel.CENTER);
                    t_email_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    add_teacher_panel.add(t_email_field);
                    
                    JLabel t_username_label = new JLabel("Username:");
                    t_username_label.setBounds(90, 230, 200, 40);
                    add_teacher_panel.add(t_username_label);
                    
                    JTextField t_username_field = new JTextField();
                    t_username_field.setBounds(158, 235, 150, 25);
                    t_username_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    t_username_field.setHorizontalAlignment(JLabel.CENTER);
                    t_username_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    add_teacher_panel.add(t_username_field);
                    

                    JLabel t_password_label = new JLabel("Password:");
                    t_password_label.setBounds(390, 230, 200, 40);
                    add_teacher_panel.add(t_password_label);

                    JTextField t_password_field = new JTextField();
                    t_password_field.setBounds(458, 235, 150, 25);
                    t_password_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    t_password_field.setHorizontalAlignment(JLabel.CENTER);
                    t_password_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    add_teacher_panel.add(t_password_field);
                    
                             
                    JLabel t_address_label = new JLabel("Address:");
                    t_address_label.setBounds(90, 270, 200, 40);
                    add_teacher_panel.add(t_address_label);

                    JTextField t_address_field = new JTextField();
                    t_address_field.setBounds(158, 275, 450, 50);
                    t_address_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    t_address_field.setHorizontalAlignment(JLabel.CENTER);
                    t_address_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    add_teacher_panel.add(t_address_field);
                    
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    String current_date = formatter.format(new Date());
                    JLabel date_label = new JLabel("Date: " + current_date);
                    date_label.setBounds(573, 440, 100, 30);
                    add_teacher_panel.add(date_label);
                    
                    
                   
                    JButton save_button = new JButton("Save");
                    save_button.setBounds(250, 350, 200, 30);
                    save_button.setBackground(new Color(70, 130, 180));
                    save_button.setFont(new Font("Courier New", Font.BOLD, 16));
                    save_button.setForeground(Color.WHITE);
                    utility.hover_effect(save_button);
                    add_teacher_panel.add(save_button);
                    
                    
                    save_button.addMouseListener(new MouseAdapter() {
                            @Override
                             public void mousePressed(MouseEvent event) {
                                try {
                                    teacher_first_name = t_fname_field.getText();
                                    teacher_last_name = t_lname_field.getText();
                                    teacher_age = Integer.parseInt(t_age_field.getText());
                                    teacher_gender = (String) t_gender_field.getSelectedItem();
                                    teacher_contact = Long.parseLong(t_contact_field.getText());
                                    teacher_email = t_email_field.getText();
                                    teacher_username =  t_username_field.getText();
                                    teacher_password = t_password_field.getText();
                                    teacher_address = t_address_field.getText();
                                    
                                    if (teacher_first_name.isEmpty() || teacher_last_name.isEmpty() || teacher_email.isEmpty() || teacher_username.isEmpty() || teacher_password.isEmpty() || teacher_address.isEmpty() || teacher_gender.equals("Select")){
                                        throw new Exception("Please enter valid data!");
                                        
                                    }
                                 
                                    Teacher new_teacher = new Teacher(teacher_first_name, teacher_last_name, teacher_age, teacher_gender, teacher_contact, teacher_email, teacher_username, teacher_password, teacher_address);
                                    if (total_teachers < teachers.length) {
                                        teachers[total_teachers] = new_teacher;
                                        total_teachers++;
                                        JOptionPane.showMessageDialog(frame, "Teacher added successfully! Login Again...");
                                        frame.setContentPane(panel);
                                        frame.revalidate();
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Only One Teacher can be Added...!");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(frame, "Please enter valid data!");
                                }
                            }

                        });
                    
                    
                    frame.setContentPane(add_teacher_panel);
                    frame.revalidate();
                    
                    JButton back_button_teacher_add_panel = utility.Back_button(new JButton());
                    add_teacher_panel.add(back_button_teacher_add_panel);
                    utility.Back_func(back_button_teacher_add_panel, frame, admin_panel);
                   
                    
                    }
               });
                    }
                    
                    JLabel admin_s_label = new JLabel();
                    admin_s_label.setText("ADD STUDENT");
                    admin_s_label.setBounds(400, 325, 200, 30);
                    admin_s_label.setHorizontalAlignment(JLabel.CENTER);
                    admin_s_label.setVerticalAlignment(JLabel.TOP);
                    admin_s_label.setFont(new Font("Courier New", Font.BOLD, 15));
                    URL admin_s_img = GUI_Prac.class.getResource("student.png");
                    ImageIcon admin_originalIcon = new ImageIcon(admin_s_img);
                    Image admin_s_originalImage = admin_originalIcon.getImage();
                    Image admin_s_resizedImage = admin_s_originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    ImageIcon admin_s_resizedIcon = new ImageIcon(admin_s_resizedImage);
                    JButton admin_s_image_button = new JButton(admin_s_resizedIcon);
                    admin_s_image_button.setBounds(400, 120, 200, 200);
                    admin_s_image_button.setBackground(new Color(70, 130, 180));
                    admin_s_image_button.setBorder(BorderFactory.createEmptyBorder());
                    admin_s_image_button.setBorder(BorderFactory.createLineBorder(new Color(100, 160, 200), 2, true));
                    admin_s_image_button.setToolTipText("Click here to add a Student");
                    admin_panel.add(admin_s_label);
                    admin_panel.add(admin_s_image_button);
                    utility.hover_effect(admin_s_image_button);
                    
                    
                    
                    admin_s_image_button.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                    JPanel stu_add_panel = new JPanel();
                    stu_add_panel.setBackground(new Color(173, 216, 230));
                    stu_add_panel.setLayout(null);
                    JLabel label2 = new JLabel();
                    label2.setText("Adding New Student");
                    label2.setBounds(90, 30, 500, 60);                    
                    label2.setHorizontalAlignment(JLabel.CENTER);
                    label2.setFont(new Font("Serif", Font.BOLD,35));
                    label2.setForeground(new Color (70, 130, 180));                 
                    stu_add_panel.add(label2);
                    frame.setContentPane(stu_add_panel);
                    frame.revalidate();
                    
                    if(total_students > 0){
                        
                    JLabel s_rollno_label = new JLabel("Roll No. / ID:");
                    s_rollno_label.setBounds(90, 105, 100, 30);
                    stu_add_panel.add(s_rollno_label);
                    
                    int random_num = 1000 + (int)(Math.random() * 9000);
                    stu_add_panel.revalidate();

                    JTextField s_rollno_field = new JTextField();
                    s_rollno_field.setBounds(158, 110, 150, 25);
                    s_rollno_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_rollno_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    s_rollno_field.setHorizontalAlignment(JLabel.CENTER);
                    s_rollno_field.setText(""+ random_num);
                    s_rollno_field.setEditable(false);
                    stu_add_panel.add(s_rollno_field);
                    
                    
                    JLabel s_class_label = new JLabel("Class:");
                    s_class_label.setBounds(390, 105, 100, 30);
                    stu_add_panel.add(s_class_label);

                    JTextField s_class_field = new JTextField();
                    s_class_field.setBounds(458, 110, 150, 25);
                    s_class_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_class_field.setHorizontalAlignment(JLabel.CENTER);
                    s_class_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_class_field);
                    
                    JLabel s_fname_label = new JLabel("First Name:");
                    s_fname_label.setBounds(90, 150, 100, 30);
                    stu_add_panel.add(s_fname_label);
                    
                    JTextField s_fname_field = new JTextField();
                    s_fname_field.setBounds(158, 155, 150, 25);
                    s_fname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_fname_field.setHorizontalAlignment(JLabel.CENTER);
                    s_fname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_fname_field);

                    JLabel s_lname_label = new JLabel("Last Name:");
                    s_lname_label.setBounds(390, 150, 100, 30);
                    stu_add_panel.add(s_lname_label);

                    JTextField s_lname_field = new JTextField();
                    s_lname_field.setBounds(458, 155, 150, 25);
                    s_lname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_lname_field.setHorizontalAlignment(JLabel.CENTER);
                    s_lname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_lname_field);

                    JLabel s_age_label = new JLabel("Age:");
                    s_age_label.setBounds(90, 190, 200, 40);
                    stu_add_panel.add(s_age_label);

                    JTextField s_age_field = new JTextField();
                    s_age_field.setBounds(158, 195, 150, 25);
                    s_age_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_age_field.setHorizontalAlignment(JLabel.CENTER);
                    s_age_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_age_field);

                    JLabel s_gender_label = new JLabel("Gender:");
                    s_gender_label.setBounds(390, 190, 200, 40);
                    stu_add_panel.add(s_gender_label);

                    String[] genderOptions = {"Select", "Male", "Female", "Other"};
                    JComboBox<String> s_gender_field = new JComboBox<>(genderOptions);
                    s_gender_field.setBounds(458, 195, 150, 25);
                    s_gender_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    stu_add_panel.add(s_gender_field);
                    
                    JLabel s_contact_label = new JLabel("Contact:");
                    s_contact_label.setBounds(90, 230, 200, 40);
                    stu_add_panel.add(s_contact_label);

                    JTextField s_contact_field = new JTextField();
                    s_contact_field.setBounds(158, 235, 150, 25);
                    s_contact_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_contact_field.setHorizontalAlignment(JLabel.CENTER);
                    s_contact_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_contact_field);
                    
                    JLabel s_email_label = new JLabel("Email:");
                    s_email_label.setBounds(390, 230, 200, 40);
                    stu_add_panel.add(s_email_label);

                    JTextField s_email_field = new JTextField();
                    s_email_field.setBounds(458, 235, 150, 25);
                    s_email_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_email_field.setHorizontalAlignment(JLabel.CENTER);
                    s_email_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_email_field);
                    
                    JLabel s_username_label = new JLabel("Username:");
                    s_username_label.setBounds(90, 270, 100, 30);
                    stu_add_panel.add(s_username_label);
                    
                    JTextField s_username_field = new JTextField();
                    s_username_field.setBounds(158, 275, 150, 25);
                    s_username_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_username_field.setHorizontalAlignment(JLabel.CENTER);
                    s_username_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_username_field);

                    JLabel s_password_label = new JLabel("Password:");
                    s_password_label.setBounds(390, 270, 100, 30);
                    stu_add_panel.add(s_password_label);

                    JTextField s_password_field = new JTextField();
                    s_password_field.setBounds(458, 275, 150, 25);
                    s_password_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_password_field.setHorizontalAlignment(JLabel.CENTER);
                    s_password_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_password_field);
                    
                    JLabel s_address_label = new JLabel("Address:");
                    s_address_label.setBounds(90, 310, 200, 40);
                    stu_add_panel.add(s_address_label);

                    JTextField s_address_field = new JTextField();
                    s_address_field.setBounds(158, 315, 450, 50);
                    s_address_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_address_field.setHorizontalAlignment(JLabel.CENTER);
                    s_address_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_address_field);
                    
                    JButton admin_view_student = new JButton();
                    admin_view_student.setText("View");
                    admin_view_student.setBounds(573, 430, 100, 30);
                    admin_view_student.setBackground(new Color(70, 130, 180));
                    admin_view_student.setFont(new Font("Courier New", Font.BOLD, 14));
                    utility.hover_effect(admin_view_student);
                    admin_view_student.setToolTipText("Click to Quit");
                    admin_view_student.setForeground(Color.WHITE);
                    stu_add_panel.add(admin_view_student);
    
                    
                    admin_view_student.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){

                    JPanel view_stu_panel = new JPanel();
                    view_stu_panel.setBackground(new Color(173, 216, 230));
                    view_stu_panel.setLayout(null);
                    JLabel view_stu_label = new JLabel();
                    view_stu_label.setText("Viewing All Students Data");
                    view_stu_label.setHorizontalAlignment(JLabel.CENTER);
                    view_stu_label.setFont(new Font("Serif", Font.BOLD,35));
                    view_stu_label.setForeground(new Color (70, 130, 180));
                    view_stu_label.setBounds(90, 30, 500, 60);
                    view_stu_panel.add(view_stu_label);

                    JTextArea student_data_area = new JTextArea();
                    student_data_area.setBounds(50, 100, 600, 300);
                    student_data_area.setFont(new Font("Arial", Font.PLAIN, 14));
                    student_data_area.setEditable(false);

                    StringBuilder studentData = new StringBuilder();
                    for (int i = 0; i < total_students; i++) {
                        Student student = students[i];
                        studentData.append("Roll No: ").append(student.getstudent_Roll()).append("\n");
                        studentData.append("Class: ").append(student.getstudent_class()).append("\n");
                        studentData.append("First Name: ").append(student.getstudent_First_name()).append("\n");
                        studentData.append("Last Name: ").append(student.getstudent_Last_name()).append("\n");
                        studentData.append("Age: ").append(student.getstudent_Age()).append("\n");
                        studentData.append("Gender: ").append(student.getstudent_Gender()).append("\n");
                        studentData.append("Contact: ").append(student.getstudent_Contact()).append("\n");
                        studentData.append("Email: ").append(student.getstudent_Email()).append("\n");
                        studentData.append("Username: ").append(student.getstudent_username()).append("\n");
                        studentData.append("Password: ").append(student.getstudent_password()).append("\n");
                        studentData.append("Address: ").append(student.getstudent_Address()).append("\n");
                        studentData.append("=======================================\n");
                    }

                    student_data_area.setText(studentData.toString());
                    JScrollPane scrollPane = new JScrollPane(student_data_area);
                    scrollPane.setBounds(50, 100, 600, 300);
                    view_stu_panel.add(scrollPane);

                    
                    JButton back_button_student_view_panel = utility.Back_button(new JButton());
                    view_stu_panel.add(back_button_student_view_panel);
                    utility.Back_func(back_button_student_view_panel, frame, stu_add_panel);
                    
                    JButton update_student_data = new JButton();
                    update_student_data.setText("Update");
                    update_student_data.setBounds(573, 430, 100, 30);
                    update_student_data.setBackground(new Color(70, 130, 180));
                    update_student_data.setFont(new Font("Courier New", Font.BOLD, 14));
                    utility.hover_effect(update_student_data);
                    update_student_data.setToolTipText("Click to Update Students Data");
                    update_student_data.setForeground(Color.WHITE);
                    view_stu_panel.add(update_student_data);
                    
                    update_student_data.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        
                    
                    JPanel update_student_panel = new JPanel();
                    update_student_panel.setBackground(new Color(173, 216, 230));
                    update_student_panel.setLayout(null);
                    JLabel update_student_label = new JLabel();
                    update_student_label.setText("Updating Students Data");
                    update_student_label.setHorizontalAlignment(JLabel.CENTER);
                    update_student_label.setFont(new Font("Serif", Font.BOLD,35));
                    update_student_label.setForeground(new Color (70, 130, 180));
                    update_student_label.setBounds(90, 30, 500, 60);
                    update_student_panel.add(update_student_label);
                    

                    JTextArea student_update_data_area = new JTextArea();
                    student_update_data_area.setBounds(50, 100, 600, 300);
                    student_update_data_area.setFont(new Font("Arial", Font.PLAIN, 14));
                    student_update_data_area.setEditable(true);

                    StringBuilder student_updated_Data = new StringBuilder();
                    for (int i = 0; i < total_students; i++) {
                        Student student = students[i];
                        student_updated_Data.append("Roll No: ").append(student.getstudent_Roll()).append("\n");
                        student_updated_Data.append("Class: ").append(student.getstudent_class()).append("\n");
                        student_updated_Data.append("First Name: ").append(student.getstudent_First_name()).append("\n");
                        student_updated_Data.append("Last Name: ").append(student.getstudent_Last_name()).append("\n");
                        student_updated_Data.append("Age: ").append(student.getstudent_Age()).append("\n");
                        student_updated_Data.append("Gender: ").append(student.getstudent_Gender()).append("\n");
                        student_updated_Data.append("Contact: ").append(student.getstudent_Contact()).append("\n");
                        student_updated_Data.append("Email: ").append(student.getstudent_Email()).append("\n");
                        student_updated_Data.append("Username: ").append(student.getstudent_username()).append("\n");
                        student_updated_Data.append("Password: ").append(student.getstudent_password()).append("\n");
                        student_updated_Data.append("Address: ").append(student.getstudent_Address()).append("\n");
                        student_updated_Data.append("=======================================\n");
                    }
                    student_update_data_area.setText(student_updated_Data.toString());
                    JScrollPane scrollPane = new JScrollPane(student_update_data_area);
                    scrollPane.setBounds(50, 100, 600, 300);
                    update_student_panel.add(scrollPane);
                    
                    
                    frame.setContentPane(update_student_panel);
                    frame.revalidate();
                    
                    JButton back_button_student_update_panel = utility.Back_button(new JButton());
                    update_student_panel.add(back_button_student_update_panel);
                    utility.Back_func(back_button_student_update_panel, frame, admin_panel);
                    
                    JButton save_student_data = new JButton();
                    save_student_data.setText("Save");
                    save_student_data.setBounds(573, 430, 100, 30);
                    save_student_data.setBackground(new Color(70, 130, 180));
                    save_student_data.setFont(new Font("Courier New", Font.BOLD, 14));
                    utility.hover_effect(save_student_data);
                    save_student_data.setToolTipText("Click to Save Studentss Data");
                    save_student_data.setForeground(Color.WHITE);
                    update_student_panel.add(save_student_data);
                    
                    save_student_data.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        JPanel save_updated_student_data_panel = new JPanel();
                        save_updated_student_data_panel.setBackground(new Color(173, 216, 230));
                        save_updated_student_data_panel.setLayout(null);
                        JLabel save_updated_student_data_label = new JLabel();
                        save_updated_student_data_label.setText("Updated Students Data");
                        save_updated_student_data_label.setHorizontalAlignment(JLabel.CENTER);
                        save_updated_student_data_label.setFont(new Font("Serif", Font.BOLD,35));
                        save_updated_student_data_label.setForeground(new Color (70, 130, 180));
                        save_updated_student_data_label.setBounds(90, 30, 500, 60);
                        save_updated_student_data_panel.add(save_updated_student_data_label);
                        frame.setContentPane(save_updated_student_data_panel);
                        frame.revalidate();
                        
                        JLabel save_label = new JLabel();
                        save_label.setText("Save Button Feature Will be available soon");
                        save_label.setHorizontalAlignment(JLabel.CENTER);
                        save_label.setFont(new Font("Serif", Font.BOLD,20));
                        save_label.setForeground(Color.red);
                        save_label.setBounds(90, 220, 500, 60);
                        save_updated_student_data_panel.add(save_label);
                        
                        JButton back_button_student_save_update_panel = utility.Back_button(new JButton());
                        save_updated_student_data_panel.add(back_button_student_save_update_panel);
                        utility.Back_func(back_button_student_save_update_panel, frame, view_stu_panel);
                        
                        JButton print_student_data = new JButton();
                        print_student_data.setText("Print");
                        print_student_data.setBounds(573, 430, 100, 30);
                        print_student_data.setBackground(new Color(70, 130, 180));
                        print_student_data.setFont(new Font("Courier New", Font.BOLD, 14));
                        utility.hover_effect(print_student_data);
                        print_student_data.setToolTipText("Click here to Print Student's Data");
                        print_student_data.setForeground(Color.WHITE);
                        save_updated_student_data_panel.add(print_student_data);

                        print_student_data.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){


                            File file = new File("Students_data.txt");

                            if(file.exists()){
                               int user_response = JOptionPane.showConfirmDialog(frame,"File already exist. Do you want to overwrite it?", "Confirm Overwrite", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if(user_response != JOptionPane.YES_OPTION){
                                return;
                            }
                        }
                            try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {

                            for (int i = 0; i < total_students; i++) {
                            Student student = students[i];
                            if (student != null) {
                            pw.println("Roll Number: " + student.getstudent_Roll());
                            pw.println("Class: " + student.getstudent_class()); 
                            pw.println("Full Name: " + student.getstudent_First_name()+" " + student.getstudent_Last_name());
                            pw.println("Age: " + student.getstudent_Age());
                            pw.println("Gender: " + student.getstudent_Gender()); 
                            pw.println("Contact: " + student.getstudent_Contact());
                            pw.println("Email: " + student.getstudent_Email());  
                            pw.println("Username: " + student.getstudent_username());
                            pw.println("Password: " + student.getstudent_password());
                            pw.println("Address: " + student.getstudent_Address());
                            pw.println("=======================================\n");
                        }
                            }     
                            JOptionPane.showMessageDialog(frame, "Student data successfully saved to students_data.txt!");


                              }catch(Exception e){
                                 JOptionPane.showMessageDialog(frame, "Error saving student data: " + e.getMessage());

                                      }

                        }
                        });

                        
                        
                    }
                    });
                    
                    }
                    });
                    
                    frame.setContentPane(view_stu_panel);
                    frame.revalidate();
                    }
                              });

                 
                    
                    JButton save_button = new JButton("Save");
                    save_button.setBounds(250, 390, 200, 30);
                    save_button.setBackground(new Color(70, 130, 180));
                    save_button.setFont(new Font("Courier New", Font.BOLD, 16));
                    save_button.setForeground(Color.WHITE);
                    utility.hover_effect(save_button);
                    stu_add_panel.add(save_button);
                    
                    
                    save_button.addMouseListener(new MouseAdapter() {
                            @Override
                             public void mousePressed(MouseEvent event) {
                                try {
                                    student_roll = Integer.parseInt(s_rollno_field.getText());
                                    student_class = Integer.parseInt(s_class_field.getText());
                                    student_first_name = s_fname_field.getText();
                                    student_last_name = s_lname_field.getText();
                                    student_age = Integer.parseInt(s_age_field.getText());
                                    student_gender = (String) s_gender_field.getSelectedItem();
                                    student_contact = Long.parseLong(s_contact_field.getText());
                                    student_email = s_email_field.getText();
                                    student_username = s_username_field.getText();
                                    student_password = s_password_field.getText();
                                    student_address = s_address_field.getText();

                                    
                                    if (student_first_name.isEmpty() || student_last_name.isEmpty() || student_email.isEmpty() || student_username.isEmpty() || student_password.isEmpty() || student_address.isEmpty() || student_gender.equals("Select")){
                                        throw new Exception("Please enter valid data!");
                                    }
                                    
                                    Student new_student = new Student(student_roll, student_class, student_first_name, student_last_name, student_age, student_gender, student_contact, student_email, student_username, student_password, student_address);
                                    if (total_students < students.length) {
                                        students[total_students] = new_student;
                                        total_students++;
                                        JOptionPane.showMessageDialog(frame, "Student added successfully!");
                                        clearFields();
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Student list is full!");
                                    }
                                   
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(frame, "Please enter valid data!");
                                }
                            }

                            private void clearFields() {
                                s_rollno_field.setText("" + (1000 + (int) (Math.random() * 9000)));
                                s_class_field.setText("");
                                s_fname_field.setText("");
                                s_lname_field.setText("");
                                s_age_field.setText("");
                                s_gender_field.setSelectedIndex(0);
                                s_contact_field.setText("");
                                s_email_field.setText("");
                                s_username_field.setText("");
                                s_password_field.setText("");
                                s_address_field.setText("");
                            }
                        });
                        
                    }else{
                        
                    
                    JLabel s_rollno_label = new JLabel("Roll No. / ID:");
                    s_rollno_label.setBounds(90, 105, 100, 30);
                    stu_add_panel.add(s_rollno_label);
                    
                    int random_num = 1000 + (int)(Math.random() * 9000);
                    stu_add_panel.revalidate();

                    JTextField s_rollno_field = new JTextField();
                    s_rollno_field.setBounds(158, 110, 150, 25);
                    s_rollno_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_rollno_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    s_rollno_field.setHorizontalAlignment(JLabel.CENTER);
                    s_rollno_field.setText(""+ random_num);
                    s_rollno_field.setEditable(false);
                    stu_add_panel.add(s_rollno_field);
                    
                    
                    JLabel s_class_label = new JLabel("Class:");
                    s_class_label.setBounds(390, 105, 100, 30);
                    stu_add_panel.add(s_class_label);

                    JTextField s_class_field = new JTextField();
                    s_class_field.setBounds(458, 110, 150, 25);
                    s_class_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_class_field.setHorizontalAlignment(JLabel.CENTER);
                    s_class_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_class_field);
                    
                    JLabel s_fname_label = new JLabel("First Name:");
                    s_fname_label.setBounds(90, 150, 100, 30);
                    stu_add_panel.add(s_fname_label);
                    
                    JTextField s_fname_field = new JTextField();
                    s_fname_field.setBounds(158, 155, 150, 25);
                    s_fname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_fname_field.setHorizontalAlignment(JLabel.CENTER);
                    s_fname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_fname_field);

                    JLabel s_lname_label = new JLabel("Last Name:");
                    s_lname_label.setBounds(390, 150, 100, 30);
                    stu_add_panel.add(s_lname_label);

                    JTextField s_lname_field = new JTextField();
                    s_lname_field.setBounds(458, 155, 150, 25);
                    s_lname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_lname_field.setHorizontalAlignment(JLabel.CENTER);
                    s_lname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_lname_field);

                    JLabel s_age_label = new JLabel("Age:");
                    s_age_label.setBounds(90, 190, 200, 40);
                    stu_add_panel.add(s_age_label);

                    JTextField s_age_field = new JTextField();
                    s_age_field.setBounds(158, 195, 150, 25);
                    s_age_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_age_field.setHorizontalAlignment(JLabel.CENTER);
                    s_age_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_age_field);

                    JLabel s_gender_label = new JLabel("Gender:");
                    s_gender_label.setBounds(390, 190, 200, 40);
                    stu_add_panel.add(s_gender_label);

                    String[] genderOptions = {"Select", "Male", "Female", "Other"};
                    JComboBox<String> s_gender_field = new JComboBox<>(genderOptions);
                    s_gender_field.setBounds(458, 195, 150, 25);
                    s_gender_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    stu_add_panel.add(s_gender_field);
                    
                    JLabel s_contact_label = new JLabel("Contact:");
                    s_contact_label.setBounds(90, 230, 200, 40);
                    stu_add_panel.add(s_contact_label);

                    JTextField s_contact_field = new JTextField();
                    s_contact_field.setBounds(158, 235, 150, 25);
                    s_contact_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_contact_field.setHorizontalAlignment(JLabel.CENTER);
                    s_contact_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_contact_field);
                    
                    JLabel s_email_label = new JLabel("Email:");
                    s_email_label.setBounds(390, 230, 200, 40);
                    stu_add_panel.add(s_email_label);

                    JTextField s_email_field = new JTextField();
                    s_email_field.setBounds(458, 235, 150, 25);
                    s_email_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_email_field.setHorizontalAlignment(JLabel.CENTER);
                    s_email_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_email_field);
                    
                    JLabel s_username_label = new JLabel("Username:");
                    s_username_label.setBounds(90, 270, 100, 30);
                    stu_add_panel.add(s_username_label);
                    
                    JTextField s_username_field = new JTextField();
                    s_username_field.setBounds(158, 275, 150, 25);
                    s_username_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_username_field.setHorizontalAlignment(JLabel.CENTER);
                    s_username_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_username_field);

                    JLabel s_password_label = new JLabel("Password:");
                    s_password_label.setBounds(390, 270, 100, 30);
                    stu_add_panel.add(s_password_label);

                    JTextField s_password_field = new JTextField();
                    s_password_field.setBounds(458, 275, 150, 25);
                    s_password_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_password_field.setHorizontalAlignment(JLabel.CENTER);
                    s_password_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_password_field);
                    
                    JLabel s_address_label = new JLabel("Address:");
                    s_address_label.setBounds(90, 310, 200, 40);
                    stu_add_panel.add(s_address_label);

                    JTextField s_address_field = new JTextField();
                    s_address_field.setBounds(158, 315, 450, 50);
                    s_address_field.setFont(new Font("Arial", Font.PLAIN, 14));
                    s_address_field.setHorizontalAlignment(JLabel.CENTER);
                    s_address_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    stu_add_panel.add(s_address_field);
                    
                    
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    String current_date = formatter.format(new Date());
                    JLabel date_label = new JLabel("Date: " + current_date);
                    date_label.setBounds(573, 440, 100, 30);
                    stu_add_panel.add(date_label);
                    
                   
                    
                    JButton save_button = new JButton("Save");
                    save_button.setBounds(250, 390, 200, 30);
                    save_button.setBackground(new Color(70, 130, 180));
                    save_button.setFont(new Font("Courier New", Font.BOLD, 16));
                    save_button.setForeground(Color.WHITE);
                    utility.hover_effect(save_button);
                    stu_add_panel.add(save_button);
                    
                    
                    save_button.addMouseListener(new MouseAdapter() {
                            @Override
                             public void mousePressed(MouseEvent event) {
                                try {
                                    student_roll = Integer.parseInt(s_rollno_field.getText());
                                    student_class = Integer.parseInt(s_class_field.getText());
                                    student_first_name = s_fname_field.getText();
                                    student_last_name = s_lname_field.getText();
                                    student_age = Integer.parseInt(s_age_field.getText());
                                    student_gender = (String) s_gender_field.getSelectedItem();
                                    student_contact = Long.parseLong(s_contact_field.getText());
                                    student_email = s_email_field.getText();
                                    student_username = s_username_field.getText();
                                    student_password = s_password_field.getText();
                                    student_address = s_address_field.getText();
                                    
                                    if (student_first_name.isEmpty() || student_last_name.isEmpty() || student_email.isEmpty() || student_username.isEmpty() || student_password.isEmpty() || student_address.isEmpty() || student_gender.equals("Select")) {
                                    throw new Exception("Please enter valid data!");
                                      }
                                    
                                    
                                    Student new_student = new Student(student_roll, student_class, student_first_name, student_last_name, student_age, student_gender, student_contact, student_email, student_username, student_password, student_address);
                                    if (total_students < students.length) {
                                        students[total_students] = new_student;
                                        total_students++;
                                        JOptionPane.showMessageDialog(frame, "Student added successfully!");
                                        clearFields();
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Student list is full!");
                                    }
                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(frame, "Please enter valid data!");
                                }catch (Exception e) {
                                    JOptionPane.showMessageDialog(frame, e.getMessage());
                                }
                            }

                            private void clearFields() {
                                s_rollno_field.setText("" + (1000 + (int) (Math.random() * 9000)));
                                s_class_field.setText("");
                                s_fname_field.setText("");
                                s_lname_field.setText("");
                                s_age_field.setText("");
                                s_gender_field.setSelectedIndex(0);
                                s_contact_field.setText("");
                                s_email_field.setText("");
                                s_username_field.setText("");
                                s_password_field.setText("");
                                s_address_field.setText("");
                            }
                        });
                    }
                    JButton back_button_stu_add = utility.Back_button(new JButton());
                    stu_add_panel.add(back_button_stu_add);
                    utility.Back_func(back_button_stu_add, frame, admin_panel);
                   
                    }
                });
    
                    JButton back_button_admin_panel = utility.Back_button(new JButton());
                    admin_panel.add(back_button_admin_panel);
                    utility.Back_func(back_button_admin_panel, frame, panel);
                   
                    JButton button_exit_admin_panel = utility.Exit_button(new JButton());
                    admin_panel.add(button_exit_admin_panel);
                    utility.Exit_func(button_exit_admin_panel);
                }
            }
        });


                }
        });
        
       
        t_image_button.addMouseListener(new java.awt.event.MouseAdapter(){
                @Override
                public void mousePressed(java.awt.event.MouseEvent event){
                    if(total_teachers==0){
                        JOptionPane.showMessageDialog(frame, "Teacher Not Added Yet!");
                    }else{
                        
                        JPanel teacher_login_panel = new JPanel();
                        teacher_login_panel.setBackground(new Color(173, 216, 230));
                        teacher_login_panel.setLayout(null);

                        JLabel teacher_login_label = new JLabel("Teacher's Login");
                        teacher_login_label.setBounds(90, 30, 500, 60);
                        teacher_login_label.setHorizontalAlignment(JLabel.CENTER);
                        teacher_login_label.setFont(new Font("Serif", Font.BOLD, 35));
                        teacher_login_label.setForeground(new Color(70, 130, 180));
                        teacher_login_panel.add(teacher_login_label);

                        JLabel teacher_username_label = new JLabel("Username:");
                        teacher_username_label.setBounds(170, 180, 100, 30);
                        teacher_username_label.setFont(new Font("Serif", Font.ROMAN_BASELINE, 22));
                        teacher_login_panel.add(teacher_username_label);

                        JTextField teacher_username_field = new JTextField();
                        teacher_username_field.setBounds(278, 180, 180, 35);
                        teacher_username_field.setFont(new Font("Arial", Font.PLAIN, 20));
                        teacher_username_field.setHorizontalAlignment(JLabel.CENTER);
                        teacher_username_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        teacher_login_panel.add(teacher_username_field);

                        JLabel teacher_password_label = new JLabel("Password:");
                        teacher_password_label.setBounds(170, 230, 100, 30);
                        teacher_password_label.setFont(new Font("Serif", Font.ROMAN_BASELINE, 22));
                        teacher_login_panel.add(teacher_password_label);

                        JPasswordField teacher_password_field = new JPasswordField();
                        teacher_password_field.setBounds(278, 230, 180, 35);
                        teacher_password_field.setFont(new Font("Arial", Font.PLAIN, 25));
                        teacher_password_field.setHorizontalAlignment(JLabel.CENTER);
                        teacher_password_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        teacher_login_panel.add(teacher_password_field);

                        JButton teacher_login_button = new JButton("Login");
                        teacher_login_button.setBounds(170, 290, 290, 35);
                        teacher_login_button.setBackground(new Color(70, 130, 180));
                        teacher_login_button.setFont(new Font("Courier New", Font.BOLD, 16));
                        teacher_login_button.setForeground(Color.WHITE);
                        utility.hover_effect(teacher_login_button);
                        teacher_login_panel.add(teacher_login_button);

                        JButton back_button_teacher_login_panel = utility.Back_button(new JButton());
                        teacher_login_panel.add(back_button_teacher_login_panel);
                        utility.Back_func(back_button_teacher_login_panel, frame, panel);

                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                        String current_date = formatter.format(new Date());
                        JLabel date_label = new JLabel("Date: " + current_date);
                        date_label.setBounds(573, 440, 100, 30);
                        teacher_login_panel.add(date_label);


                        frame.setContentPane(teacher_login_panel);
                        frame.setVisible(true);
                        
                        teacher_login_button.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent event) {
                            
                        String teacher_username_entered = teacher_username_field.getText();
                        String teacher_password_entered = new String(teacher_password_field.getPassword());
                        


                        if (!teacher_username_entered.equals(teacher_username) || !teacher_password_entered.equals(teacher_password)) {
                            JOptionPane.showMessageDialog(frame, "Wrong Username or Password! Try Again...");
                            teacher_username_field.setText("");
                            teacher_password_field.setText("");
                        }else{
                            
                        JPanel dashboard_panel = new JPanel();
                        dashboard_panel.setBackground(new Color(173, 216, 230));
                        dashboard_panel.setLayout(null);
                        JLabel dashboard_label = new JLabel();
                        dashboard_label.setText("Teacher's Dashboard");
                        dashboard_label.setBounds(90, 30, 500, 60);
                        dashboard_label.setHorizontalAlignment(JLabel.CENTER);
                        dashboard_label.setFont(new Font("Serif", Font.BOLD,35));
                        dashboard_label.setForeground(new Color (70, 130, 180));
                        dashboard_panel.add(dashboard_label);
                        frame.setContentPane(dashboard_panel);
                        frame.revalidate();

                        JButton back_button_dashboard_panel = utility.Back_button(new JButton());
                        dashboard_panel.add(back_button_dashboard_panel);
                        utility.Back_func(back_button_dashboard_panel, frame, panel);

                        JButton button_exit_dashboard_panel = utility.Exit_button(new JButton());
                        dashboard_panel.add(button_exit_dashboard_panel);
                        utility.Exit_func(button_exit_dashboard_panel);


                        URL arrow2_img = GUI_Prac.class.getResource("arrow.png");
                        ImageIcon arrow2_icon = new ImageIcon(arrow2_img);
                        Image arrow2_image = arrow2_icon.getImage();
                        Image a2_resizedImage = arrow2_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon a2_resizedIcon = new ImageIcon(a2_resizedImage);
                        JLabel a2_image = new JLabel(a2_resizedIcon);
                        a2_image.setBounds(-25, 40, 200, 200);
                        JButton button2 = new JButton("View All Students");
                        button2.setBounds(100, 120, 250, 35);
                        button2.setBackground(new Color(70, 130, 180));
                        button2.setFont(new Font("Courier New", Font.BOLD, 16));
                        utility.hover_effect(button2);
                        button2.setToolTipText("Click here to view Students");
                        button2.setForeground(Color.WHITE);                    

                        button2.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){

                        if(total_students==0){
                            JOptionPane.showMessageDialog(frame, "No Student Entered Yet!");
                        }
                        else{

                        JPanel view_stu_panel = new JPanel();
                        view_stu_panel.setBackground(new Color(173, 216, 230));
                        view_stu_panel.setLayout(null);
                        JLabel view_stu_label = new JLabel();
                        view_stu_label.setText("Viewing All Students Data");
                        view_stu_label.setHorizontalAlignment(JLabel.CENTER);
                        view_stu_label.setFont(new Font("Serif", Font.BOLD,35));
                        view_stu_label.setForeground(new Color (70, 130, 180));
                        view_stu_label.setBounds(90, 30, 500, 60);
                        view_stu_panel.add(view_stu_label);

                        JTextArea student_data_area = new JTextArea();
                        student_data_area.setBounds(50, 100, 600, 300);
                        student_data_area.setFont(new Font("Arial", Font.PLAIN, 14));
                        student_data_area.setEditable(false);

                        StringBuilder studentData = new StringBuilder();
                        for (int i = 0; i < total_students; i++) {
                            Student student = students[i];
                            studentData.append("Roll No: ").append(student.getstudent_Roll()).append("\n");
                            studentData.append("Class: ").append(student.getstudent_class()).append("\n");
                            studentData.append("First Name: ").append(student.getstudent_First_name()).append("\n");
                            studentData.append("Last Name: ").append(student.getstudent_Last_name()).append("\n");
                            studentData.append("Age: ").append(student.getstudent_Age()).append("\n");
                            studentData.append("Gender: ").append(student.getstudent_Gender()).append("\n");
                            studentData.append("Contact: ").append(student.getstudent_Contact()).append("\n");
                            studentData.append("Email: ").append(student.getstudent_Email()).append("\n");
                            studentData.append("Address: ").append(student.getstudent_Address()).append("\n");
                            studentData.append("=======================================\n");
                        }

                        student_data_area.setText(studentData.toString());
                        JScrollPane scrollPane = new JScrollPane(student_data_area);
                        scrollPane.setBounds(50, 100, 600, 300);
                        view_stu_panel.add(scrollPane);

                        JButton back_button_stu_view = utility.Back_button(new JButton());
                        view_stu_panel.add(back_button_stu_view);
                        utility.Back_func(back_button_stu_view, frame, dashboard_panel);


                        frame.setContentPane(view_stu_panel);
                        frame.revalidate();


                        JButton print_student_data = new JButton();
                        print_student_data.setText("Print");
                        print_student_data.setBounds(573, 430, 100, 30);
                        print_student_data.setBackground(new Color(70, 130, 180));
                        print_student_data.setFont(new Font("Courier New", Font.BOLD, 14));
                        utility.hover_effect(print_student_data);
                        print_student_data.setToolTipText("Click here to Print Student's Data");
                        print_student_data.setForeground(Color.WHITE);
                        view_stu_panel.add(print_student_data);

                        print_student_data.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){


                            File file = new File("Students_data.txt");

                            if(file.exists()){
                               int user_response = JOptionPane.showConfirmDialog(frame,"File already exist. Do you want to overwrite it?", "Confirm Overwrite", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if(user_response != JOptionPane.YES_OPTION){
                                return;
                            }
                        }
                            try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {

                            for (int i = 0; i < total_students; i++) {
                            Student student = students[i];
                            if (student != null) {
                            pw.println("Roll Number: " + student.getstudent_Roll());
                            pw.println("Class: " + student.getstudent_class()); 
                            pw.println("Full Name: " + student.getstudent_First_name()+" " + student.getstudent_Last_name());
                            pw.println("Age: " + student.getstudent_Age());
                            pw.println("Gender: " + student.getstudent_Gender()); 
                            pw.println("Contact: " + student.getstudent_Contact());
                            pw.println("Email: " + student.getstudent_Email());  
                            pw.println("Username: " + student.getstudent_username());
                            pw.println("Password: " + student.getstudent_password());
                            pw.println("Address: " + student.getstudent_Address());
                            pw.println("=======================================\n");
                        }
                            }     
                            JOptionPane.showMessageDialog(frame, "Student data successfully saved to students_data.txt!");


                              }catch(Exception e){
                                 JOptionPane.showMessageDialog(frame, "Error saving student data: " + e.getMessage());

                                      }

                        }
                        });
                        }

                    }
                });


                        URL arrow3_img = GUI_Prac.class.getResource("arrow.png");
                        ImageIcon arrow3_icon = new ImageIcon(arrow3_img);
                        Image arrow3_image = arrow3_icon.getImage();
                        Image a3_resizedImage = arrow3_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon a3_resizedIcon = new ImageIcon(a3_resizedImage);
                        JLabel a3_image = new JLabel(a3_resizedIcon);
                        a3_image.setBounds(-25, 85, 200, 200);
                        JButton button3 = new JButton("View Profile");
                        button3.setBounds(100, 165, 250, 35);
                        button3.setBackground(new Color(70, 130, 180));
                        button3.setFont(new Font("Courier New", Font.BOLD, 16));
                        utility.hover_effect(button3);
                        button3.setToolTipText("Click here to view your Profile");
                        button3.setForeground(Color.WHITE);

                        button3.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){

                        if(total_teachers==0){
                            JOptionPane.showMessageDialog(frame, "No Teacher added");
                        }else{

                            JPanel view_teacher_panel = new JPanel();
                            view_teacher_panel.setBackground(new Color(173, 216, 230));
                            view_teacher_panel.setLayout(null);
                            JLabel view_teacher_label = new JLabel();
                            view_teacher_label.setText("Your Profile");
                            view_teacher_label.setHorizontalAlignment(JLabel.CENTER);
                            view_teacher_label.setFont(new Font("Serif", Font.BOLD,35));
                            view_teacher_label.setForeground(new Color (70, 130, 180));
                            view_teacher_label.setBounds(90, 30, 500, 60);
                            view_teacher_panel.add(view_teacher_label);


                            JTextArea teacher_data_area = new JTextArea();
                            teacher_data_area.setBounds(50, 100, 600, 300);
                            teacher_data_area.setFont(new Font("Arial", Font.PLAIN, 14));
                            teacher_data_area.setEditable(false);

                            StringBuilder TeacherData = new StringBuilder();

                            Teacher teacher = teachers[0];
                            TeacherData.append("First Name: ").append(teacher.getteacher_first_name()).append("\n");
                            TeacherData.append("Last Name: ").append(teacher.getteacher_last_name()).append("\n");
                            TeacherData.append("Age: ").append(teacher.getteacher_age()).append("\n");
                            TeacherData.append("Gender: ").append(teacher.getteacher_gender()).append("\n");
                            TeacherData.append("Contact: ").append(teacher.getteacher_contact()).append("\n");
                            TeacherData.append("Email: ").append(teacher.getteacher_email()).append("\n");
                            TeacherData.append("Username: ").append(teacher.getteacher_username()).append("\n");
                            TeacherData.append("Password: ").append(teacher.getteacher_password()).append("\n");
                            TeacherData.append("Address: ").append(teacher.getteacher_address()).append("\n");
                            TeacherData.append("=======================================\n");


                        teacher_data_area.setText(TeacherData.toString());
                        JScrollPane scrollPane = new JScrollPane(teacher_data_area);
                        scrollPane.setBounds(50, 100, 600, 300);
                        view_teacher_panel.add(scrollPane);

                        JButton back_button_teacher_view_panel = utility.Back_button(new JButton());
                        view_teacher_panel.add(back_button_teacher_view_panel);
                        utility.Back_func(back_button_teacher_view_panel, frame, dashboard_panel);

                        JButton update_teacher_data = new JButton();
                        update_teacher_data.setText("Update");
                        update_teacher_data.setBounds(573, 430, 100, 30);
                        update_teacher_data.setBackground(new Color(70, 130, 180));
                        update_teacher_data.setFont(new Font("Courier New", Font.BOLD, 14));
                        utility.hover_effect(update_teacher_data);
                        update_teacher_data.setToolTipText("Click to Update Teacher's Data");
                        update_teacher_data.setForeground(Color.WHITE);
                        view_teacher_panel.add(update_teacher_data);

                        update_teacher_data.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){


                        JPanel update_teacher_panel = new JPanel();
                        update_teacher_panel.setBackground(new Color(173, 216, 230));
                        update_teacher_panel.setLayout(null);
                        JLabel update_teacher_label = new JLabel();
                        update_teacher_label.setText("Updating Data");
                        update_teacher_label.setHorizontalAlignment(JLabel.CENTER);
                        update_teacher_label.setFont(new Font("Serif", Font.BOLD,35));
                        update_teacher_label.setForeground(new Color (70, 130, 180));
                        update_teacher_label.setBounds(90, 30, 500, 60);
                        update_teacher_panel.add(update_teacher_label);


                        JLabel t_update_fname_label = new JLabel("First Name:");
                        t_update_fname_label.setBounds(90, 105, 100, 30);
                        update_teacher_panel.add(t_update_fname_label);

                        JTextField t_update_fname_field = new JTextField(teacher_first_name);
                        t_update_fname_field.setBounds(158, 110, 150, 25);
                        t_update_fname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_fname_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_fname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_fname_field);

                        JLabel t_update_lname_label = new JLabel("Last Name:");
                        t_update_lname_label.setBounds(390, 105, 100, 30);
                        update_teacher_panel.add(t_update_lname_label);

                        JTextField t_update_lname_field = new JTextField(teacher_last_name);
                        t_update_lname_field.setBounds(458, 110, 150, 25);
                        t_update_lname_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_lname_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_lname_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_lname_field);

                        JLabel t_update_age_label = new JLabel("Age:");
                        t_update_age_label.setBounds(90, 150, 100, 30);
                        update_teacher_panel.add(t_update_age_label);

                        JTextField t_update_age_field = new JTextField(String.valueOf(teacher_age));
                        t_update_age_field.setBounds(158, 155, 150, 25);
                        t_update_age_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_age_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_age_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_age_field);

                        JLabel t_update_gender_label = new JLabel("Gender:");
                        t_update_gender_label.setBounds(390, 150, 100, 30);
                        update_teacher_panel.add(t_update_gender_label);

                        String[] genderOptions = {"Select", "Male", "Female", "Other"};
                        JComboBox<String> t_gender_field = new JComboBox<>(genderOptions);
                        t_gender_field.setBounds(458, 155, 150, 25);
                        t_gender_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        update_teacher_panel.add(t_gender_field);

                        JLabel t_update_contact_label = new JLabel("Contact:");
                        t_update_contact_label.setBounds(90, 190, 200, 40);
                        update_teacher_panel.add(t_update_contact_label);

                        JTextField t_update_contact_field = new JTextField(String.valueOf(teacher_contact));
                        t_update_contact_field.setBounds(158, 195, 150, 25);
                        t_update_contact_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_contact_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_contact_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_contact_field);

                        JLabel t_update_email_label = new JLabel("Email:");
                        t_update_email_label.setBounds(390, 190, 200, 40);
                        update_teacher_panel.add(t_update_email_label);

                        JTextField t_update_email_field = new JTextField(teacher_email);
                        t_update_email_field.setBounds(458, 195, 150, 25);
                        t_update_email_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_email_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_email_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_email_field);

                        JLabel t_update_username_label = new JLabel("Username:");
                        t_update_username_label.setBounds(90, 230, 200, 40);
                        update_teacher_panel.add(t_update_username_label);

                        JTextField t_update_username_field = new JTextField(teacher_username);
                        t_update_username_field.setBounds(158, 235, 150, 25);
                        t_update_username_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_username_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_username_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_username_field);


                        JLabel t_update_password_label = new JLabel("Password:");
                        t_update_password_label.setBounds(390, 230, 200, 40);
                        update_teacher_panel.add(t_update_password_label);

                        JTextField t_update_password_field = new JTextField(teacher_password);
                        t_update_password_field.setBounds(458, 235, 150, 25);
                        t_update_password_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_password_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_password_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_password_field);


                        JLabel t_update_address_label = new JLabel("Address:");
                        t_update_address_label.setBounds(90, 270, 200, 40);
                        update_teacher_panel.add(t_update_address_label);

                        JTextField t_update_address_field = new JTextField(teacher_address);
                        t_update_address_field.setBounds(158, 275, 450, 50);
                        t_update_address_field.setFont(new Font("Arial", Font.PLAIN, 14));
                        t_update_address_field.setHorizontalAlignment(JLabel.CENTER);
                        t_update_address_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                        update_teacher_panel.add(t_update_address_field);


                        JButton save_update_button = new JButton("Save");
                        save_update_button.setBounds(250, 350, 200, 30);
                        save_update_button.setBackground(new Color(70, 130, 180));
                        save_update_button.setFont(new Font("Courier New", Font.BOLD, 16));
                        save_update_button.setForeground(Color.WHITE);
                        utility.hover_effect(save_update_button);
                        update_teacher_panel.add(save_update_button);


                        save_update_button.addMouseListener(new MouseAdapter() {
                            @Override
                             public void mousePressed(MouseEvent event) {
                                try {
                                    total_teachers = 0;
                                    teacher_first_name = t_update_fname_field.getText();
                                    teacher_last_name = t_update_lname_field.getText();
                                    teacher_age = Integer.parseInt(t_update_age_field.getText());
                                    teacher_gender = (String) t_gender_field.getSelectedItem();
                                    teacher_contact = Long.parseLong(t_update_contact_field.getText());
                                    teacher_email = t_update_email_field.getText();
                                    teacher_username =  t_update_username_field.getText();
                                    teacher_password = t_update_password_field.getText();
                                    teacher_address = t_update_address_field.getText();
                                    
                                    if (teacher_first_name.isEmpty() || teacher_last_name.isEmpty() || teacher_email.isEmpty() || teacher_username.isEmpty() || teacher_password.isEmpty() || teacher_address.isEmpty() || teacher_gender.equals("Select")){
                                        throw new Exception("Please enter valid data!");
                                    }

                                    Teacher new_teacher = new Teacher(teacher_first_name, teacher_last_name, teacher_age, teacher_gender, teacher_contact, teacher_email, teacher_username, teacher_password, teacher_address);
                                    if (total_teachers < teachers.length) {
                                        teachers[total_teachers] = new_teacher;
                                        total_teachers++;
                                        JOptionPane.showMessageDialog(frame, "Your Data Updated successfully! Login Again...");
                                        frame.setContentPane(panel);
                                        frame.revalidate();
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Only One Teacher can be Added...!");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(frame, "Please enter valid data!");
                                }
                            }

                           
                        });
                    
                    frame.setContentPane(update_teacher_panel);
                    frame.revalidate();
                    
                    

                        JButton back_button_teacher_update_panel = utility.Back_button(new JButton());
                        update_teacher_panel.add(back_button_teacher_update_panel);
                        utility.Back_func(back_button_teacher_update_panel, frame, dashboard_panel);
                        
                        JButton print_teacher_data = new JButton();
                        print_teacher_data.setText("Print");
                        print_teacher_data.setBounds(573, 430, 100, 30);
                        print_teacher_data.setBackground(new Color(70, 130, 180));
                        print_teacher_data.setFont(new Font("Courier New", Font.BOLD, 14));
                        utility.hover_effect(print_teacher_data);
                        print_teacher_data.setToolTipText("Click here to Print Student's Data");
                        print_teacher_data.setForeground(Color.WHITE);
                        update_teacher_panel.add(print_teacher_data);

                        print_teacher_data.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){


                            File file = new File("Teacher_data.txt");

                            if(file.exists()){
                               int user_response = JOptionPane.showConfirmDialog(frame,"File already exist. Do you want to overwrite it?", "Confirm Overwrite", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if(user_response != JOptionPane.YES_OPTION){
                                return;
                            }
                        }
                            try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {

                            Teacher teacher = teachers[0];
                            
                            pw.println("Full Name: " + teacher.getteacher_first_name()+" " + teacher.getteacher_last_name());
                            pw.println("Age: " + teacher.getteacher_age());
                            pw.println("Gender: " + teacher.getteacher_gender()); 
                            pw.println("Contact: " + teacher.getteacher_contact());
                            pw.println("Email: " + teacher.getteacher_email());  
                            pw.println("Username: " + teacher.getteacher_username());
                            pw.println("Password: " + teacher.getteacher_password());
                            pw.println("Address: " + teacher.getteacher_address());
                            pw.println("=======================================\n");
                        
                                 
                            JOptionPane.showMessageDialog(frame, "Teacher data successfully saved to Teacher_data.txt!");

                              }catch(Exception e){
                                 JOptionPane.showMessageDialog(frame, "Error saving Teacher data: " + e.getMessage());

                                      }

                        }
                        });



                        }
                        });

                        frame.setContentPane(view_teacher_panel);
                        frame.revalidate();
                        }

                        }
                         });



                        URL arrow4_img = GUI_Prac.class.getResource("arrow.png");
                        ImageIcon arrow4_icon = new ImageIcon(arrow4_img);
                        Image arrow4_image = arrow4_icon.getImage();
                        Image a4_resizedImage = arrow4_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon a4_resizedIcon = new ImageIcon(a4_resizedImage);
                        JLabel a4_image = new JLabel(a4_resizedIcon);
                        a4_image.setBounds(-25, 130, 200, 200);
                        JButton button4 = new JButton("Delete All Records");
                        button4.setBounds(100, 210, 250, 35);
                        button4.setBackground(new Color(70, 130, 180));
                        button4.setFont(new Font("Courier New", Font.BOLD, 16));
                        utility.hover_effect(button4);
                        button4.setToolTipText("Click here to delete Records");
                        button4.setForeground(Color.WHITE);

                        button4.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){

                        if(total_students==0){
                              JOptionPane.showMessageDialog(frame, "No Student Entered yet!");
                        }
                        else{

                            int response = JOptionPane.showConfirmDialog(frame,"Do you want to delete all students?", "Confirm Deletion",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                          if(response != JOptionPane.YES_OPTION){
                                return;                            
                            }
                          total_students = 0;
                          JOptionPane.showMessageDialog(frame, "All Students Deleted!");
                        }

                        }
                        });


                        URL arrow5_img = GUI_Prac.class.getResource("arrow.png");
                        ImageIcon arrow5_icon = new ImageIcon(arrow5_img);
                        Image arrow5_image = arrow5_icon.getImage();
                        Image a5_resizedImage = arrow5_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon a5_resizedIcon = new ImageIcon(a5_resizedImage);
                        JLabel a5_image = new JLabel(a5_resizedIcon);
                        a5_image.setBounds(-25, 175, 200, 200);
                        JButton button5 = new JButton("View Fee Record");
                        button5.setBounds(100, 255, 250, 35);
                        button5.setBackground(new Color(70, 130, 180));
                        button5.setFont(new Font("Courier New", Font.BOLD, 16));
                        utility.hover_effect(button5);
                        button5.setToolTipText("Click here to view Fee Records");
                        button5.setForeground(Color.WHITE);

                        button5.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){

                        if(total_students==0){
                              JOptionPane.showMessageDialog(frame, "No Student Entered yet!");

                        }
                        else{

                         JPanel fee_stu_panel = new JPanel();
                        fee_stu_panel.setBackground(new Color(173, 216, 230));
                        fee_stu_panel.setLayout(null);
                        JLabel fee_stu_label = new JLabel();
                        fee_stu_label.setText("View Fee Records");
                        fee_stu_label.setHorizontalAlignment(JLabel.CENTER);
                        fee_stu_label.setFont(new Font("Serif", Font.BOLD,35));
                        fee_stu_label.setForeground(new Color (70, 130, 180));
                        fee_stu_label.setBounds(90, 30, 500, 60);
                        fee_stu_panel.add(fee_stu_label);
                        frame.setContentPane(fee_stu_panel);
                        frame.revalidate();
                        
                        JLabel ann_label = new JLabel();
                        ann_label.setText("Fee Records Will be available soon");
                        ann_label.setHorizontalAlignment(JLabel.CENTER);
                        ann_label.setFont(new Font("Serif", Font.BOLD,20));
                        ann_label.setForeground(Color.red);
                        ann_label.setBounds(90, 220, 500, 60);
                        fee_stu_panel.add(ann_label);

                        JButton back_button_stu_fee = utility.Back_button(new JButton());
                        fee_stu_panel.add(back_button_stu_fee);
                        utility.Back_func(back_button_stu_fee, frame, dashboard_panel); 




                        }

                        }
                        });


                        URL arrow6_img = GUI_Prac.class.getResource("arrow.png");
                        ImageIcon arrow6_icon = new ImageIcon(arrow6_img);
                        Image arrow6_image = arrow6_icon.getImage();
                        Image a6_resizedImage = arrow6_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon a6_resizedIcon = new ImageIcon(a6_resizedImage);
                        JLabel a6_image = new JLabel(a6_resizedIcon);
                        a6_image.setBounds(-25, 220, 200, 200);
                        JButton button6 = new JButton("Add Announcement");
                        button6.setBounds(100, 300, 250, 35);
                        button6.setBackground(new Color(70, 130, 180));
                        button6.setFont(new Font("Courier New", Font.BOLD, 16));
                        utility.hover_effect(button6);
                        button6.setToolTipText("Click here to Add Announcement");
                        button6.setForeground(Color.WHITE);

                        button6.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){

                            JPanel add_ann_panel = new JPanel();
                            add_ann_panel.setBackground(new Color(173, 216, 230));
                            add_ann_panel.setLayout(null);
                            JLabel add_ann_label = new JLabel();
                            add_ann_label.setText("Add Announcements");
                            add_ann_label.setHorizontalAlignment(JLabel.CENTER);
                            add_ann_label.setFont(new Font("Serif", Font.BOLD,35));
                            add_ann_label.setForeground(new Color (70, 130, 180));
                            add_ann_label.setBounds(90, 30, 500, 60);
                            add_ann_panel.add(add_ann_label);
                            frame.setContentPane(add_ann_panel);
                            frame.revalidate();

                            JLabel subject_label = new JLabel("Subject:");
                            subject_label.setBounds(90, 125, 100, 40);
                            add_ann_panel.add(subject_label);

                            JTextField subject_field = new JTextField();
                            subject_field.setBounds(158, 130, 230, 35);
                            subject_field.setFont(new Font("Arial", Font.PLAIN, 14));
                            subject_field.setHorizontalAlignment(JLabel.CENTER);
                            subject_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                            add_ann_panel.add(subject_field);

                            JLabel type_label = new JLabel("Type:");
                            type_label.setBounds(90, 175, 100, 40);
                            add_ann_panel.add(type_label);

                            JTextField type_field = new JTextField();
                            type_field.setBounds(158, 180, 450, 35);
                            type_field.setFont(new Font("Arial", Font.PLAIN, 14));
                            type_field.setHorizontalAlignment(JLabel.CENTER);
                            type_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                            add_ann_panel.add(type_field);

                            JLabel marks_label = new JLabel("Marks:");
                            marks_label.setBounds(405, 125, 100, 40);
                            add_ann_panel.add(marks_label);

                            JTextField marks_field = new JTextField();
                            marks_field.setBounds(458, 130, 150, 35);
                            marks_field.setFont(new Font("Arial", Font.PLAIN, 14));
                            marks_field.setHorizontalAlignment(JLabel.CENTER);
                            marks_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                            add_ann_panel.add(marks_field);

                            JLabel description_label = new JLabel("Description:");
                            description_label.setBounds(90, 225, 200, 50);
                            add_ann_panel.add(description_label);

                            JTextField description_field = new JTextField();
                            description_field.setBounds(158, 230, 450, 60);
                            description_field.setFont(new Font("Arial", Font.PLAIN, 14));
                            description_field.setHorizontalAlignment(JLabel.CENTER);
                            description_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                            add_ann_panel.add(description_field);

                            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                            String current_date = formatter.format(new Date());
                            JLabel date_label = new JLabel("Date: " + current_date);
                            date_label.setBounds(573, 440, 100, 30);
                            add_ann_panel.add(date_label);


                            JButton save_ann_button = new JButton("Save");
                            save_ann_button.setBounds(250, 320, 200, 30);
                            save_ann_button.setBackground(new Color(70, 130, 180));
                            save_ann_button.setFont(new Font("Courier New", Font.BOLD, 16));
                            save_ann_button.setForeground(Color.WHITE);
                            utility.hover_effect(save_ann_button);
                            add_ann_panel.add(save_ann_button);
                            
                            JButton back_button_add_ann_panel = utility.Back_button(new JButton());
                            add_ann_panel.add(back_button_add_ann_panel);
                            utility.Back_func(back_button_add_ann_panel, frame, dashboard_panel); 
                            
                            
                            save_ann_button.addMouseListener(new java.awt.event.MouseAdapter(){
                            @Override
                            public void mousePressed(java.awt.event.MouseEvent event){
                                
                                          
                            try {
                                    subject = subject_field.getText();
                                    type = type_field.getText();
                                    marks = Integer.parseInt(marks_field.getText());
                                    description = description_field.getText();
                                    
                                    Announcement new_announcement = new Announcement(subject, type, marks, description);
                                     if (total_announcements < announcements.length) {
                                        announcements[total_announcements] = new_announcement;
                                        total_announcements++;
                                        JOptionPane.showMessageDialog(frame, "Announcement added successfully!");
                                        clearFields();
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Announcement list is full!");
                                    }
                                 
                                }catch(Exception e){
                                    JOptionPane.showMessageDialog(frame, "Please enter valid data!");

                                }
                            }
                            private void clearFields() {
                                subject_field.setText("");
                                type_field.setText("");
                                marks_field.setText("");
                                description_field.setText("");
                            }

                          
                            });
                  
                  
                             }
                            });


                        URL arrow7_img = GUI_Prac.class.getResource("arrow.png");
                        ImageIcon arrow7_icon = new ImageIcon(arrow7_img);
                        Image arrow7_image = arrow7_icon.getImage();
                        Image a7_resizedImage = arrow7_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                        ImageIcon a7_resizedIcon = new ImageIcon(a7_resizedImage);
                        JLabel a7_image = new JLabel(a7_resizedIcon);
                        a7_image.setBounds(-25, 265, 200, 200);
                        JButton button7 = new JButton("Log Out");
                        button7.setBounds(100, 345, 250, 35);
                        button7.setBackground(new Color(70, 130, 180));
                        button7.setFont(new Font("Courier New", Font.BOLD, 16));
                        utility.hover_effect(button7);
                        button7.setToolTipText("Click here to Log Out");
                        button7.setForeground(Color.WHITE);

                        button7.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){
                            frame.setContentPane(panel);
                            frame.revalidate();

                             }
                            });


                        dashboard_panel.add(a2_image);
                        dashboard_panel.add(button2);
                        dashboard_panel.add(a3_image);
                        dashboard_panel.add(button3);
                        dashboard_panel.add(a4_image);
                        dashboard_panel.add(button4);
                        dashboard_panel.add(a5_image);
                        dashboard_panel.add(button5);
                        dashboard_panel.add(a6_image);
                        dashboard_panel.add(button6);
                        dashboard_panel.add(a7_image);
                        dashboard_panel.add(button7);

                         
 
                            
                            
                        }
                            
                        }
                        });
                            

                       
                        
                     
                        
                    }
                    
                }    
        });

    }
    
        {
        JLabel s_label = new JLabel();
        s_label.setText("Login as a STUDENT");
        s_label.setBounds(400, 325, 200, 30);
        s_label.setHorizontalAlignment(JLabel.CENTER);
        s_label.setVerticalAlignment(JLabel.TOP);
        s_label.setFont(new Font("Courier New", Font.BOLD, 15));
        URL s_img = GUI_Prac.class.getResource("student.png");
        ImageIcon originalIcon = new ImageIcon(s_img);
        Image s_originalImage = originalIcon.getImage();
        Image s_resizedImage = s_originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon s_resizedIcon = new ImageIcon(s_resizedImage);
        JButton s_image_button = new JButton(s_resizedIcon);
        s_image_button.setBounds(400, 120, 200, 200);
        s_image_button.setBackground(new Color(70, 130, 180));
        s_image_button.setBorder(BorderFactory.createEmptyBorder());
        s_image_button.setBorder(BorderFactory.createLineBorder(new Color(100, 160, 200), 2, true));
        s_image_button.setToolTipText("Click here to log in as a STUDENT");
        panel.add(s_label);
        panel.add(s_image_button);
        utility.hover_effect(s_image_button);
        
        
               
        s_image_button.addMouseListener(new java.awt.event.MouseAdapter(){
                @Override
                public void mousePressed(java.awt.event.MouseEvent event){
                    if(total_students==0){
                        JOptionPane.showMessageDialog(frame, "No Student Added Yet!");
                    }
                    else{
                     
                    JPanel student_login_panel = new JPanel();
                    student_login_panel.setBackground(new Color(173, 216, 230));
                    student_login_panel.setLayout(null);


                    JLabel student_login_label = new JLabel("Student Login");
                    student_login_label.setBounds(90, 30, 500, 60);
                    student_login_label.setHorizontalAlignment(JLabel.CENTER);
                    student_login_label.setFont(new Font("Serif", Font.BOLD, 35));
                    student_login_label.setForeground(new Color(70, 130, 180));
                    student_login_panel.add(student_login_label);

                    JLabel student_username_label = new JLabel("Username:");
                    student_username_label.setBounds(170, 180, 100, 30);
                    student_username_label.setFont(new Font("Serif", Font.ROMAN_BASELINE, 22));
                    student_login_panel.add(student_username_label);

                    JTextField student_username_field = new JTextField();
                    student_username_field.setBounds(278, 180, 180, 35);
                    student_username_field.setFont(new Font("Arial", Font.PLAIN, 20));
                    student_username_field.setHorizontalAlignment(JLabel.CENTER);
                    student_username_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    student_login_panel.add(student_username_field);

                    JLabel student_password_label = new JLabel("Password:");
                    student_password_label.setBounds(170, 230, 100, 30);
                    student_password_label.setFont(new Font("Serif", Font.ROMAN_BASELINE, 22));
                    student_login_panel.add(student_password_label);

                    JPasswordField student_password_field = new JPasswordField();
                    student_password_field.setBounds(278, 230, 180, 35);
                    student_password_field.setFont(new Font("Arial", Font.PLAIN, 25));
                    student_password_field.setHorizontalAlignment(JLabel.CENTER);
                    student_password_field.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
                    student_login_panel.add(student_password_field);

                    JButton login_button = new JButton("Login");
                    login_button.setBounds(170, 290, 290, 35);
                    login_button.setBackground(new Color(70, 130, 180));
                    login_button.setFont(new Font("Courier New", Font.BOLD, 16));
                    login_button.setForeground(Color.WHITE);
                    utility.hover_effect(login_button);
                    student_login_panel.add(login_button);

                    JButton back_button_student_login_panel = utility.Back_button(new JButton());
                    student_login_panel.add(back_button_student_login_panel);
                    utility.Back_func(back_button_student_login_panel, frame, panel);

                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    String current_date = formatter.format(new Date());
                    JLabel date_label = new JLabel("Date: " + current_date);
                    date_label.setBounds(573, 440, 100, 30);
                    student_login_panel.add(date_label);


                    frame.setContentPane(student_login_panel);
                    frame.setVisible(true);
                    login_button.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent event) {
                      String student_username = student_username_field.getText();
                      String student_password = new String(student_password_field.getPassword());
                      int current_student; 
                      boolean found = false;
                    try{
                        
                    for(int i=0; i<=total_students; i++){
                    if (student_username.equals(students[i].getstudent_username()) && student_password.equals(students[i].getstudent_password())) {
                          
                    current_student = i;
                    found = true;
                    JPanel dashboard_panel = new JPanel();
                    dashboard_panel.setBackground(new Color(173, 216, 230));
                    dashboard_panel.setLayout(null);
                    JLabel dashboard_label = new JLabel();
                    dashboard_label.setText("Student Dashboard");
                    dashboard_label.setBounds(90, 30, 500, 60);
                    dashboard_label.setHorizontalAlignment(JLabel.CENTER);
                    dashboard_label.setFont(new Font("Serif", Font.BOLD,35));
                    dashboard_label.setForeground(new Color (70, 130, 180));
                    dashboard_panel.add(dashboard_label);
                    frame.setContentPane(dashboard_panel);
                    frame.revalidate();
                    
                    JButton back_button_dashboard_panel = utility.Back_button(new JButton());
                    dashboard_panel.add(back_button_dashboard_panel);
                    utility.Back_func(back_button_dashboard_panel, frame, panel);
                   
                    JButton button_exit_dashboard_panel = utility.Exit_button(new JButton());
                    dashboard_panel.add(button_exit_dashboard_panel);
                    utility.Exit_func(button_exit_dashboard_panel);

                    
                    URL arrow2_img = GUI_Prac.class.getResource("arrow.png");
                    ImageIcon arrow2_icon = new ImageIcon(arrow2_img);
                    Image arrow2_image = arrow2_icon.getImage();
                    Image a2_resizedImage = arrow2_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    ImageIcon a2_resizedIcon = new ImageIcon(a2_resizedImage);
                    JLabel a2_image = new JLabel(a2_resizedIcon);
                    a2_image.setBounds(-25, 40, 200, 200);
                    JButton button2 = new JButton("View All Students");
                    button2.setBounds(100, 120, 250, 35);
                    button2.setBackground(new Color(70, 130, 180));
                    button2.setFont(new Font("Courier New", Font.BOLD, 16));
                    utility.hover_effect(button2);
                    button2.setToolTipText("Click here to view Students");
                    button2.setForeground(Color.WHITE);
                    
                    button2.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                    JPanel view_stu_panel = new JPanel();
                    view_stu_panel.setBackground(new Color(173, 216, 230));
                    view_stu_panel.setLayout(null);
                    JLabel view_stu_label = new JLabel();
                    view_stu_label.setText("Viewing All Students Data");
                    view_stu_label.setHorizontalAlignment(JLabel.CENTER);
                    view_stu_label.setFont(new Font("Serif", Font.BOLD,35));
                    view_stu_label.setForeground(new Color (70, 130, 180));
                    view_stu_label.setBounds(90, 30, 500, 60);
                    view_stu_panel.add(view_stu_label);

                    JTextArea student_data_area = new JTextArea();
                    student_data_area.setBounds(50, 100, 600, 300);
                    student_data_area.setFont(new Font("Arial", Font.PLAIN, 14));
                    student_data_area.setEditable(false);

                    StringBuilder studentData = new StringBuilder();
                    for (int i = 0; i < total_students; i++) {
                        Student student = students[i];
                        studentData.append("Roll No: ").append(student.getstudent_Roll()).append("\n");
                        studentData.append("Class: ").append(student.getstudent_class()).append("\n");
                        studentData.append("First Name: ").append(student.getstudent_First_name()).append("\n");
                        studentData.append("Last Name: ").append(student.getstudent_Last_name()).append("\n");
                        studentData.append("=======================================\n");
                    }

                    student_data_area.setText(studentData.toString());
                    JScrollPane scrollPane = new JScrollPane(student_data_area);
                    scrollPane.setBounds(50, 100, 600, 300);
                    view_stu_panel.add(scrollPane);

                    JButton back_button_stu_view = utility.Back_button(new JButton());
                    view_stu_panel.add(back_button_stu_view);
                    utility.Back_func(back_button_stu_view, frame, dashboard_panel);
                    
                    JButton button_exit_view_stu_panel = utility.Exit_button(new JButton());
                    view_stu_panel.add(button_exit_view_stu_panel);
                    utility.Exit_func(button_exit_view_stu_panel);

                    frame.setContentPane(view_stu_panel);
                    frame.revalidate();
                }
            });

                    
                    URL arrow3_img = GUI_Prac.class.getResource("arrow.png");
                    ImageIcon arrow3_icon = new ImageIcon(arrow3_img);
                    Image arrow3_image = arrow3_icon.getImage();
                    Image a3_resizedImage = arrow3_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    ImageIcon a3_resizedIcon = new ImageIcon(a3_resizedImage);
                    JLabel a3_image = new JLabel(a3_resizedIcon);
                    a3_image.setBounds(-25, 85, 200, 200);
                    JButton button3 = new JButton("View Profile");
                    button3.setBounds(100, 165, 250, 35);
                    button3.setBackground(new Color(70, 130, 180));
                    button3.setFont(new Font("Courier New", Font.BOLD, 16));
                    utility.hover_effect(button3);
                    button3.setToolTipText("Click here to View Your Profile");
                    button3.setForeground(Color.WHITE);

                    button3.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        
                    JPanel view_profile_panel = new JPanel();
                    view_profile_panel.setBackground(new Color(173, 216, 230));
                    view_profile_panel.setLayout(null);
                    
                    JLabel view_profile_label = new JLabel();
                    view_profile_label.setText("Your Profile");
                    view_profile_label.setHorizontalAlignment(JLabel.CENTER);
                    view_profile_label.setFont(new Font("Serif", Font.BOLD,35));
                    view_profile_label.setForeground(new Color (70, 130, 180));
                    view_profile_label.setBounds(90, 30, 500, 60);
                    view_profile_panel.add(view_profile_label);
                    frame.setContentPane(view_profile_panel);
                    frame.revalidate();
                    

                    JTextArea student_profile_area = new JTextArea();
                    student_profile_area.setBounds(50, 100, 600, 300);
                    student_profile_area.setFont(new Font("Arial", Font.PLAIN, 16));
                    student_profile_area.setEditable(false);

                    StringBuilder ProfileData = new StringBuilder();

                        Student student = students[current_student];
                            ProfileData.append("\t\tYour Profile").append("\n");
                            ProfileData.append("==================================================================\n");
                            ProfileData.append("Roll No: ").append(student.getstudent_Roll()).append("\n");
                            ProfileData.append("Class: ").append(student.getstudent_class()).append("\n");
                            ProfileData.append("First Name: ").append(student.getstudent_First_name()).append("\n");
                            ProfileData.append("Last Name: ").append(student.getstudent_Last_name()).append("\n");
                            ProfileData.append("Age: ").append(student.getstudent_Age()).append("\n");
                            ProfileData.append("Gender: ").append(student.getstudent_Gender()).append("\n");
                            ProfileData.append("Contact: ").append(student.getstudent_Contact()).append("\n");
                            ProfileData.append("Email: ").append(student.getstudent_Email()).append("\n");
                            ProfileData.append("Username: ").append(student.getstudent_username()).append("\n");
                            ProfileData.append("Password: ").append(student.getstudent_password()).append("\n");
                            ProfileData.append("Address: ").append(student.getstudent_Address()).append("\n");
                     

                    student_profile_area.setText(ProfileData.toString());
                    JScrollPane scrollPane = new JScrollPane(student_profile_area);
                    scrollPane.setBounds(50, 100, 600, 300);
                    view_profile_panel.add(scrollPane);
                    
                    JButton back_button_stu_profile = utility.Back_button(new JButton());
                    view_profile_panel.add(back_button_stu_profile);
                    utility.Back_func(back_button_stu_profile, frame, dashboard_panel); 
                        
                        JButton print_profile_data = new JButton();
                        print_profile_data.setText("Print");
                        print_profile_data.setBounds(573, 430, 100, 30);
                        print_profile_data.setBackground(new Color(70, 130, 180));
                        print_profile_data.setFont(new Font("Courier New", Font.BOLD, 14));
                        utility.hover_effect(print_profile_data);
                        print_profile_data.setToolTipText("Click here to Print Student's Data");
                        print_profile_data.setForeground(Color.WHITE);
                        view_profile_panel.add(print_profile_data);

                        print_profile_data.addMouseListener(new java.awt.event.MouseAdapter(){
                        @Override
                        public void mousePressed(java.awt.event.MouseEvent event){


                            File file = new File(student.getstudent_Roll()+" Pr ofile_data.txt");

                            if(file.exists()){
                               int user_response = JOptionPane.showConfirmDialog(frame,"File already exist. Do you want to overwrite it?", "Confirm Overwrite", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if(user_response != JOptionPane.YES_OPTION){
                                return;
                            }
                        }
                            try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {

                            Student student = students[current_student];
                            
                            pw.println("Roll Number: " + student.getstudent_Roll());
                            pw.println("Class: " + student.getstudent_class());
                            pw.println("Full Name: " + student.getstudent_First_name()+" " + student.getstudent_Last_name());
                            pw.println("Age: " + student.getstudent_Age());
                            pw.println("Gender: " + student.getstudent_Gender()); 
                            pw.println("Contact: " + student.getstudent_Contact());
                            pw.println("Email: " + student.getstudent_Email());  
                            pw.println("Username: " + student.getstudent_username());
                            pw.println("Password: " + student.getstudent_password());
                            pw.println("Address: " + student.getstudent_Address());
                            pw.println("=======================================\n");
                            
                                 
                            JOptionPane.showMessageDialog(frame, "Your Profile data successfully saved to " + student.getstudent_Roll()+" Profile_data.txt!");

                              }catch(Exception e){
                                 JOptionPane.showMessageDialog(frame, "Error saving Teacher data: " + e.getMessage());

                                      }

                        }
                        });


                    
                    
                    }
                    });
                    
                    
                    URL arrow4_img = GUI_Prac.class.getResource("arrow.png");
                    ImageIcon arrow4_icon = new ImageIcon(arrow4_img);
                    Image arrow4_image = arrow4_icon.getImage();
                    Image a4_resizedImage = arrow4_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    ImageIcon a4_resizedIcon = new ImageIcon(a4_resizedImage);
                    JLabel a4_image = new JLabel(a4_resizedIcon);
                    a4_image.setBounds(-25, 130, 200, 200);
                    JButton button4 = new JButton("View Teacher");
                    button4.setBounds(100, 210, 250, 35);
                    button4.setBackground(new Color(70, 130, 180));
                    button4.setFont(new Font("Courier New", Font.BOLD, 16));
                    utility.hover_effect(button4);
                    button4.setToolTipText("Click here to View Your Teacher");
                    button4.setForeground(Color.WHITE);
                    
                    button4.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        
                    if(total_teachers==0){
                        JOptionPane.showMessageDialog(frame, "No Teacher Added Yet!");
                        
                    }else{
                        
                    JPanel view_stu_teacher_panel = new JPanel();
                    view_stu_teacher_panel.setBackground(new Color(173, 216, 230));
                    view_stu_teacher_panel.setLayout(null);
                    JLabel view_stu_teacher_label = new JLabel();
                    view_stu_teacher_label.setText("Your Teacher");
                    view_stu_teacher_label.setHorizontalAlignment(JLabel.CENTER);
                    view_stu_teacher_label.setFont(new Font("Serif", Font.BOLD,35));
                    view_stu_teacher_label.setForeground(new Color (70, 130, 180));
                    view_stu_teacher_label.setBounds(90, 30, 500, 60);
                    view_stu_teacher_panel.add(view_stu_teacher_label);
                    frame.setContentPane(view_stu_teacher_panel);
                    frame.revalidate();
                    
                    JTextArea teacher_data_area = new JTextArea();
                    teacher_data_area.setBounds(50, 100, 600, 300);
                    teacher_data_area.setFont(new Font("Arial", Font.PLAIN, 16));
                    teacher_data_area.setEditable(false);

                    StringBuilder TeacherData = new StringBuilder();

                        Teacher teacher = teachers[0];
                        TeacherData.append("\t\tTeacher's Information").append("\n");
                        TeacherData.append("==================================================================\n");
                        TeacherData.append("First Name: ").append(teacher.getteacher_first_name()).append("\n");
                        TeacherData.append("Last Name: ").append(teacher.getteacher_last_name()).append("\n");
                        TeacherData.append("Gender: ").append(teacher.getteacher_gender()).append("\n");
                        TeacherData.append("Contact: ").append(teacher.getteacher_contact()).append("\n");
                        TeacherData.append("Email: ").append(teacher.getteacher_email()).append("\n");
                     

                    teacher_data_area.setText(TeacherData.toString());
                    JScrollPane scrollPane = new JScrollPane(teacher_data_area);
                    scrollPane.setBounds(50, 100, 600, 300);
                    view_stu_teacher_panel.add(scrollPane);
                    
                    JButton back_button_stu_teacher_view_panel = utility.Back_button(new JButton());
                    view_stu_teacher_panel.add(back_button_stu_teacher_view_panel);
                    utility.Back_func(back_button_stu_teacher_view_panel, frame, dashboard_panel);
                    
                    }
                    

                    }
                    });
                    
                    
                    URL arrow5_img = GUI_Prac.class.getResource("arrow.png");
                    ImageIcon arrow5_icon = new ImageIcon(arrow5_img);
                    Image arrow5_image = arrow5_icon.getImage();
                    Image a5_resizedImage = arrow5_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    ImageIcon a5_resizedIcon = new ImageIcon(a5_resizedImage);
                    JLabel a5_image = new JLabel(a5_resizedIcon);
                    a5_image.setBounds(-25, 175, 200, 200);
                    JButton button5 = new JButton("View Fee Record");
                    button5.setBounds(100, 255, 250, 35);
                    button5.setBackground(new Color(70, 130, 180));
                    button5.setFont(new Font("Courier New", Font.BOLD, 16));
                    utility.hover_effect(button5);
                    button5.setToolTipText("Click here to view Fee Records");
                    button5.setForeground(Color.WHITE);

                    button5.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        
                    JPanel fee_stu_panel = new JPanel();
                    fee_stu_panel.setBackground(new Color(173, 216, 230));
                    fee_stu_panel.setLayout(null);
                    
                    JLabel fee_stu_label = new JLabel();
                    fee_stu_label.setText("Fee Records");
                    fee_stu_label.setHorizontalAlignment(JLabel.CENTER);
                    fee_stu_label.setFont(new Font("Serif", Font.BOLD,35));
                    fee_stu_label.setForeground(new Color (70, 130, 180));
                    fee_stu_label.setBounds(90, 30, 500, 60);
                    fee_stu_panel.add(fee_stu_label);
                    frame.setContentPane(fee_stu_panel);
                    frame.revalidate();
                    

                    
                    JLabel fee_label = new JLabel();
                    fee_label.setText("Fee Records Will be available soon");
                    fee_label.setHorizontalAlignment(JLabel.CENTER);
                    fee_label.setFont(new Font("Serif", Font.BOLD,20));
                    fee_label.setForeground(Color.red);
                    fee_label.setBounds(90, 220, 500, 60);
                    fee_stu_panel.add(fee_label);
                    
                    JButton back_button_stu_fee = utility.Back_button(new JButton());
                    fee_stu_panel.add(back_button_stu_fee);
                    utility.Back_func(back_button_stu_fee, frame, dashboard_panel); 
                    
                    
                    
                    }
                    });
                    
                    
                    URL arrow6_img = GUI_Prac.class.getResource("arrow.png");
                    ImageIcon arrow6_icon = new ImageIcon(arrow6_img);
                    Image arrow6_image = arrow6_icon.getImage();
                    Image a6_resizedImage = arrow6_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    ImageIcon a6_resizedIcon = new ImageIcon(a6_resizedImage);
                    JLabel a6_image = new JLabel(a6_resizedIcon);
                    a6_image.setBounds(-25, 220, 200, 200);
                    JButton button6 = new JButton("View Announcements");
                    button6.setBounds(100, 300, 250, 35);
                    button6.setBackground(new Color(70, 130, 180));
                    button6.setFont(new Font("Courier New", Font.BOLD, 16));
                    utility.hover_effect(button6);
                    button6.setToolTipText("Click here to View Announcement");
                    button6.setForeground(Color.WHITE);
                    
                    button6.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        
                    JPanel view_ann_panel = new JPanel();
                    view_ann_panel.setBackground(new Color(173, 216, 230));
                    view_ann_panel.setLayout(null);
                    
                    JLabel view_ann_label = new JLabel();
                    view_ann_label.setText("View Announcements");
                    view_ann_label.setHorizontalAlignment(JLabel.CENTER);
                    view_ann_label.setFont(new Font("Serif", Font.BOLD,35));
                    view_ann_label.setForeground(new Color (70, 130, 180));
                    view_ann_label.setBounds(90, 30, 500, 60);
                    view_ann_panel.add(view_ann_label);
                    frame.setContentPane(view_ann_panel);
                    frame.revalidate();
                    
                    JTextArea ann_data_area = new JTextArea();
                    ann_data_area.setBounds(50, 100, 600, 300);
                    ann_data_area.setFont(new Font("Arial", Font.PLAIN, 16));
                    ann_data_area.setEditable(false);

                    StringBuilder AnnouncementData = new StringBuilder();

                     for (int i = 0; i < total_announcements; i++) {
                        Announcement announcement = announcements[i];
                        AnnouncementData.append("Subject Name: ").append(announcement.getsubject()).append("\n");
                        AnnouncementData.append("Type: ").append(announcement.gettype()).append("\n");
                        AnnouncementData.append("Marks: ").append(announcement.getmarks()).append("\n");
                        AnnouncementData.append("Description: ").append(announcement.getdescription()).append("\n");
                        AnnouncementData.append("=======================================\n");
                        AnnouncementData.append("\n");
                    }

                    ann_data_area.setText(AnnouncementData.toString());
                    JScrollPane scrollPane = new JScrollPane(ann_data_area);
                    scrollPane.setBounds(50, 100, 600, 300);
                    view_ann_panel.add(scrollPane);
                    
                    JButton back_button_view_ann = utility.Back_button(new JButton());
                    view_ann_panel.add(back_button_view_ann);
                    utility.Back_func(back_button_view_ann, frame, dashboard_panel);
                    
                    
                    JButton search_ann_data = new JButton();
                    search_ann_data.setText("Search");
                    search_ann_data.setBounds(573, 430, 100, 30);
                    search_ann_data.setBackground(new Color(70, 130, 180));
                    search_ann_data.setFont(new Font("Courier New", Font.BOLD, 14));
                    utility.hover_effect(search_ann_data);
                    search_ann_data.setToolTipText("Click here to Search Announcements");
                    search_ann_data.setForeground(Color.WHITE);
                    view_ann_panel.add(search_ann_data);

                    search_ann_data.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                            
                    JPanel search_ann_panel = new JPanel();
                    search_ann_panel.setBackground(new Color(173, 216, 230));
                    search_ann_panel.setLayout(null);
                    
                    JLabel search_ann_label = new JLabel();
                    search_ann_label.setText("Search Announcements");
                    search_ann_label.setHorizontalAlignment(JLabel.CENTER);
                    search_ann_label.setFont(new Font("Serif", Font.BOLD,35));
                    search_ann_label.setForeground(new Color (70, 130, 180));
                    search_ann_label.setBounds(90, 30, 500, 60);
                    search_ann_panel.add(search_ann_label);
                    frame.setContentPane(search_ann_panel);
                    frame.revalidate();
                        
                    JLabel search_label = new JLabel();
                    search_label.setText("Searching Announcements Will be available soon");
                    search_label.setHorizontalAlignment(JLabel.CENTER);
                    search_label.setFont(new Font("Serif", Font.BOLD,20));
                    search_label.setForeground(Color.red);
                    search_label.setBounds(90, 220, 500, 60);
                    search_ann_panel.add(search_label);
                    
                    JButton print_ann_data = new JButton();
                    print_ann_data.setText("Print");
                    print_ann_data.setBounds(573, 430, 100, 30);
                    print_ann_data.setBackground(new Color(70, 130, 180));
                    print_ann_data.setFont(new Font("Courier New", Font.BOLD, 14));
                    utility.hover_effect(print_ann_data);
                    print_ann_data.setToolTipText("Click here to Print Announcements");
                    print_ann_data.setForeground(Color.WHITE);
                    search_ann_panel.add(print_ann_data);
                    
                    print_ann_data.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        
                    File file = new File("Announcements_data.txt");

                            if(file.exists()){
                               int user_response = JOptionPane.showConfirmDialog(frame,"File already exist. Do you want to overwrite it?", "Confirm Overwrite", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if(user_response != JOptionPane.YES_OPTION){
                                return;
                            }
                        }
                            try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
                            for (int i = 0; i < total_announcements; i++) {
                                Announcement announcement = announcements[i];
                                if (announcement != null) {
                                    pw.println("Subject Name: " + announcement.getsubject());
                                    pw.println("Type: " + announcement.gettype()); 
                                    pw.println("Marks: " + announcement.getmarks());
                                    pw.println("Description: " + announcement.getdescription());
                                    pw.println("=======================================\n");
                                    pw.println("\n");
                            }
 }
                        
                                 
                            JOptionPane.showMessageDialog(frame, "Announcements successfully saved to Announcements_data.txt!");

                              }catch(Exception e){
                                 JOptionPane.showMessageDialog(frame, "Error saving Announcements data: " + e.getMessage());

                              }
                        
                        
                        
                    }
                    });
                    
                    
                    JButton back_button_search_ann_panel = utility.Back_button(new JButton());
                    search_ann_panel.add(back_button_search_ann_panel);
                    utility.Back_func(back_button_search_ann_panel, frame, view_ann_panel); 
                        
                        
                    }
                     });
                    
                    }
                    });
                    
                                        
                    URL arrow7_img = GUI_Prac.class.getResource("arrow.png");
                    ImageIcon arrow7_icon = new ImageIcon(arrow7_img);
                    Image arrow7_image = arrow7_icon.getImage();
                    Image a7_resizedImage = arrow7_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    ImageIcon a7_resizedIcon = new ImageIcon(a7_resizedImage);
                    JLabel a7_image = new JLabel(a7_resizedIcon);
                    a7_image.setBounds(-25, 265, 200, 200);
                    JButton button7 = new JButton("Log Out");
                    button7.setBounds(100, 345, 250, 35);
                    button7.setBackground(new Color(70, 130, 180));
                    button7.setFont(new Font("Courier New", Font.BOLD, 16));
                    utility.hover_effect(button7);
                    button7.setToolTipText("Click here to Log Out");
                    button7.setForeground(Color.WHITE);
                    
                    button7.addMouseListener(new java.awt.event.MouseAdapter(){
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent event){
                        frame.setContentPane(panel);
                        frame.revalidate();

                         }
                        });

                    dashboard_panel.add(a2_image);
                    dashboard_panel.add(button2);
                    dashboard_panel.add(a3_image);
                    dashboard_panel.add(button3);
                    dashboard_panel.add(a4_image);
                    dashboard_panel.add(button4);
                    dashboard_panel.add(a5_image);
                    dashboard_panel.add(button5);
                    dashboard_panel.add(a6_image);
                    dashboard_panel.add(button6);
                    dashboard_panel.add(a7_image);
                    dashboard_panel.add(button7);
                    
                    JOptionPane.showMessageDialog(frame,"Welcome "+students[current_student].getstudent_First_name() +" "+ students[current_student].getstudent_Last_name());
                    break;
                    }
                    
                    }
                    if(!found){
                        JOptionPane.showMessageDialog(frame, "Wrong Username or Password! Try Again...");
                          student_username_field.setText("");
                          student_password_field.setText("");
                          frame.setContentPane(student_login_panel);
                          frame.revalidate();
                  
                       }
                    
                    
                       }
                    catch(NullPointerException e){
                          JOptionPane.showMessageDialog(frame, "Wrong Username or Password! Try Again...");
  
                            }
                               
                }
                    });
                    }
                }    
        });
          
        }

        frame.add(panel);
        frame.setVisible(true);
     
    }   
}
    