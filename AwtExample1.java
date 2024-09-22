import java.awt.*;
public class AwtExample1 extends Frame{

    public AwtExample1(){
        Button b=new Button("Click Me");
        b.setBounds(30,100,80,30);
        add(b);


        setSize(300,300);
        setTitle("This is example of awt ");
        setLayout(null);
        setVisible(true);


    }

    public static void main(String[] args){
        AwtExample1 obj = new AwtExample1();

    }
    
}
