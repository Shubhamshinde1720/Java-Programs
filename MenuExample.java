class MenuExample  
{  
     MenuExample(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("Menu");  
         Menu submenu=new Menu("Sub Menu");  


         MenuItem i1=new MenuItem("save ");  
         MenuItem i2=new MenuItem("save as");  
         MenuItem i3=new MenuItem("delete"); 
         MenuItem i4=new MenuItem("open");  
         MenuItem i5=new MenuItem("open with");  


         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);
         
         
         submenu.add(i4);  
         submenu.add(i5); 

         menu.add(submenu);  
         mb.add(menu);
         
         
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuExample();  
}  
}  