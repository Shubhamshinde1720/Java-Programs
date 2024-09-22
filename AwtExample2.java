import java.awt.*;


/**
 * AwtExample2
 */
public class AwtExample2 extends Frame {

    AwtExample2(){
       Frame f=new Frame("Registration Form");

       Button b=new Button("SUBMIT");
       b.setBounds(100,200,80,30);
       f.add(b);


       Label userid=new Label("Userid:: ");
       userid.setBounds(20,100,80,30);
       f.add(userid);
       
       Label password=new Label("password:: ");
       password.setBounds(20,150,80,30);
       f.add(password);



       TextField tuserid=new TextField("please enter valid user id");
       tuserid.setBounds(100,100,180,30);
       f.add(tuserid);
       TextField tpassword=new TextField("please enter valid password");
       tpassword.setBounds(100,150,180,30);
       f.add(tpassword);


      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
      f.setTitle("Registration Form");


    }
  public static void main(String[] args) {
    AwtExample2 obj=new AwtExample2();
  }
    
}