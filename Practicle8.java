import java.awt.*;


public class Practicle8 extends Frame{


   Practicle8(){
      MenuBar slide=new MenuBar();

      Menu file=new Menu("File");
      Menu edit=new Menu("Edit");
      Menu view=new Menu("View");


      MenuItem open=new MenuItem("Open");
      MenuItem save=new MenuItem("Save");
      MenuItem saveas=new MenuItem("SaveAs");
      MenuItem exit=new MenuItem("Exit");

      MenuItem delete=new MenuItem("Delete");
      MenuItem deleteAll=new MenuItem("DeleteAll");
      MenuItem properties=new MenuItem("Properties");
      MenuItem update=new MenuItem("Update");

      file.add(open);
      file.add(save);
      file.add(saveas);
      file.add(exit);

      edit.add(delete);
      edit.add(deleteAll);
      edit.add(properties);
      edit.add(update);


      slide.add(file);
      slide.add(edit);
      slide.add(view);



            setSize(500,500);
            setVisible(true);
            setLayout(null);
            setMenuBar(slide);
 }

 public static void main(String[] args) {
   Practicle8 obj=new Practicle8();
   
 }
   
}
