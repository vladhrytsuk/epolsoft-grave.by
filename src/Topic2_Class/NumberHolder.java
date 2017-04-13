/*Given the following class, called NumberHolder, write some code that creates an instance of the class, 
initializes its two member variables, and then displays the value of each member variable.
What is default values of the members?*/

/*Powered by vlad-aizen@yandex.by*/

package Topic2_Class;


public class NumberHolder {
	   public int anInt; 
	   public float aFloat;

	   public NumberHolder () {   
	   }
	   
	   private void show (int anInt){
		   this.anInt = anInt;
         System.out.println("int anInt = " + anInt);
	   }
	   
	   private void show1 (float aFloat){
		   this.aFloat = aFloat;
         System.out.println("float aFloat = " + aFloat);
	   }
	   

	   public static void main(String[] args) {
		   System.out.println("Programm 1 - NumberHolder: \n");
		   NumberHolder ob1 = new NumberHolder();
	        ob1.show(5);
	        ob1.show1((float) 5.55);
	    }
	}


    