import java.awt.*;

public class RegistrationForm extends Frame{
    RegistrationForm(){
        Frame f=new Frame();
        Button b=new Button("SUBMIT");
        Label l1=new Label("REGISTRATION FORM");
        Label l2=new Label("NAME :: ");
        Label l3=new Label("AGE :: ");
        Label l4=new Label("DATE OF BIRTH");
        Label l5=new Label("DATE");
        Label l6=new Label("MONTH");
        Label l7=new Label("YEAR");
        Label l8=new Label("Email id ::");

        TextField t1=new TextField();
        TextField t2=new TextField();
        TextField t3=new TextField();
        TextField t4=new TextField();
        TextField t5=new TextField();
        TextField t6=new TextField();


        f.setSize(300,300);

        l1.setBounds(80,40,140,20);
        l2.setBounds(60,60,80,20);
        l3.setBounds(60,100,80,20);
        l4.setBounds(60,180,100,20);
        l5.setBounds(60,225,40,20);
        l6.setBounds(110,225,50,20);
        l7.setBounds(180,225,80,20);
        l8.setBounds(60,140,80,20);

        t1.setBounds(160,60,80,20);
        t2.setBounds(160,100,80,20);
        t3.setBounds(60,200,40,20);
        t4.setBounds(110,200,40,20);
        t5.setBounds(160,200,80,20);
        t6.setBounds(160,140,80,20);


        b.setBounds(120,260,80,20);

        f.add(b);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);


        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);


        f.setTitle("Registration Form");
        f.setLayout(null);
        f.setVisible(true);


     
    }

    public static void main(String[] args){
        RegistrationForm obj=new RegistrationForm();
        
    }
}