/*Write a Java method that will return the number of bits that will need to be changed in order to convert an integer, X, 
 * into another integer, Y and vice versa. The method should accept two different integers as input. For example, 
 * if your method is passed the integers 12 and 16 then your method should return a 3.*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic2_Class;

import java.util.Scanner;

public class bit {
	public int a;
	public int mas1[] = new int[8];
	public int mas2[] = new int[8];

public int binar1 (int a){
		this.a=a;
        int k;
        System.out.print("The number " + a + " in binary notation: ");
        while (a!=0){
        for(int i = 0;i < mas1.length;i++){
        	mas1[i] = a%2;
            a=a/2;
        }
        for(int i = 0;i < mas1.length/2;i++){
            k = mas1[i];
            mas1[i] = mas1[mas1.length - i - 1];
            mas1[mas1.length - 1 - i] = k;
        }
        for(int i = 0;i < mas1.length;i++){
        System.out.print(mas1[i]);
        }
        }
		return 0;
}

public int binar2 (int a){
	this.a=a;
    int k;
    System.out.print("\nThe number " + a + " in binary notation: ");
    while (a!=0){
    for(int i = 0;i < mas2.length;i++){
    	mas2[i] = a%2;
        a=a/2;
    }
    for(int i = 0;i < mas2.length/2;i++){
        k = mas2[i];
        mas2[i] = mas2[mas2.length - i - 1];
        mas2[mas2.length - 1 - i] = k;
    }
    for(int i = 0;i < mas2.length;i++){
    System.out.print(mas2[i]);
    }
    }
	return 0;
}

public int bits (){
    System.out.println();
    int k = 0;
    for(int i = 0; i < 8; i++){
            if (mas1[i] != mas2[i])
            k++;
        }
       System.out.println("The number of bits will need to be changed: " + k); 
	return 0;
}

	public static void main(String[] args) {
		int one, two;
		Scanner in = new Scanner( System.in );
		System.out.print("Enter number one: ");
		one = in.nextInt();
		System.out.print("Enter number two: ");
		two = in.nextInt();
		bit b = new bit();
		b.binar1(one);
		b.binar2(two);
		b.bits();
		in.close();

	}

}
