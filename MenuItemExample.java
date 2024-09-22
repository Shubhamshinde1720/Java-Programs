import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;


public class MenuItemExample{

    
    MenuItemExample(){

        Frame f=new Frame("Menu");
        MenuBar mb=new MenuBar();
        Menu m=new Menu();
        Menu subMenu =new Menu("sub  Menu");


        MenuItem i1=new MenuItem("open");
        MenuItem i2=new MenuItem("open with");
        MenuItem i3=new MenuItem("save");
        MenuItem i4=new MenuItem("save as");
        MenuItem i5=new MenuItem("delete");
        MenuItem i6=new MenuItem("about");


        

        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        
    
        subMenu.add(i5);
        subMenu.add(i6);

        m.add(subMenu);
        mb.add(m);
        

        f.setMenuBar(mb);
        f.setSize(444,444);

        f.setLayout(null);
        f.setVisible(true);
        



       

       
    }


        public static void main(String[] args) {
        new MenuItemExample();
    }

}