 
abstract class Vechile{
   
        public abstract int getWheels();
        public abstract void name();
    }

    class Bus extends Vechile{
        public int getWheels(){
            return 7;
        }
        public void name(){

        }
        
    }

    class Auto extends Vechile{
        public int getWheels(){

            return 3;
        }

        public void name(){
            System.out.println("toyata");
        }

        

        public static void main(String args[]){
            Auto a=new Auto();
            
         a.name();

           System.out.println( a.getWheels());
        }
    }
