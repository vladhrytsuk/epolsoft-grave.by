
public class ProgramMIN {

	public static void main(String[] args) {
		int n = 10;
		int []mas = new int[n];
		for(int i = 0; i < mas.length; i++){
			mas[i] = (i+1) * 25;
			System.out.println(mas[i]);
		}
		
		int min = 0;
		for(int i = 0; i < mas.length; i++){
			min = mas[i];
			for (int j = 0; j < mas.length; j++) {
				if (min > mas[j]) min = mas[j];
			}
		}
		System.out.println("min - " + min);
	}

}
