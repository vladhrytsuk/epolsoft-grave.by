/*Set up a string variable to hold the following results:

String results = "Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1, Liverpool 2 Manchester United 1, Swansea 2 Manchester United 4";
Write a programme to work out how many wins Manchester United had, how many games they drew, and how many Manchester United lost.

Extend the programme to work out how many goals Manchester United scored and how many they conceded.

Suppose a win gains you 3 points, a draw 1 point, and a loss no points. Have your programme work out how many points in total Manchester United have acquired.

When you have finished this exercise, the output in your textbox, listbox or console should be as follows:

Number of wins = 3
Number of draws = 1
Number of defeats = 1
Goal scored = 10
Goal conceded = 6
Number of points = 10
*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic3_String;

import java.util.Scanner;

public class Analizefootball {
	
	public int winMU = 0, loseMU = 0, drawsMU = 0, goalsOT = 0, goalsMU = 0, pointsMU = 0; 
	
    public int splitWIN(StringBuffer team)
    {
        int goal = 0;
        StringBuffer temp = new StringBuffer(team);
        temp = temp.delete(0, team.length() - 2); // �������� ������ �� ������ �� ����� ������ ������ �� - 2 �������� �����
        String out = new String(temp);
        out = out.trim(); // ������� ������� � ����� ������ ������
        goal = Integer.parseInt(out); // ����������� ������ � int
        return goal; // ���������� ���������� ��������
    }
    
    public void show(){
		System.out.println();
		System.out.println("\t\t\tAnalize football statistics:");
        System.out.println("Number of wins = " + winMU); // ���-�� �����
        System.out.println("Number of draws = " + drawsMU); // ���-�� ������
        System.out.println("Number of defeats = " + loseMU); // ���-�� ���������
        System.out.println("Goal scored = " + goalsMU); // ���-�� ������� ������� 
        System.out.println("Goal conceded = " + goalsOT);// ���-�� ����������� �������
        pointsMU = winMU * 3 + drawsMU * 1;
        System.out.println("Number of points = " + pointsMU); // ���-�� �����
    }
	
    public String[] MUsplint(String results){
    	int x = 0, muGoals = 0, otGoals = 0;
		//String results = "Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1, Liverpool 2 Manchester United 1, Swansea 2 Manchester United 4";
		String []chArray = results.split("[,]"); // ���������� �����, �� ��������� � ������� ���������� ���������
		String manchesterString;
        String manchester = "Manchester United";
		
		for (int i = 0; i < chArray.length; i++) {
			chArray[i] = chArray[i].trim(); // ������� ������� � ���� ������ ������
			x = chArray[i].indexOf(manchester); // ���� �� ������� ��������� ������ Manchester United � ������� �����
			manchesterString = chArray[i].substring(x); // ���������� ������ Manchester United �� ��������
	        StringBuffer BufferMU = new StringBuffer(manchesterString);
	        BufferMU = BufferMU.delete(manchester.length() + 2, chArray[i].length());
	        
	        muGoals = splitWIN(BufferMU); // ��������� �����, � ����� ������ �������� ������� Manchester United
	        goalsMU = goalsMU + muGoals;
	        
	        x = chArray[i].indexOf(manchester); // ���� �� ������� ��������� ������ Manchester United � ������� �����
	        StringBuffer BufferOT = new StringBuffer(chArray[i]);
	        BufferOT = BufferOT.delete(x, x + manchester.length() + 2);
	        
	        otGoals = splitWIN(BufferOT); // ��������� �����, � ����� ������ �������� ����� ������ �������
	        goalsOT = goalsOT + otGoals;
	        
	        if (muGoals > otGoals) { // ���� ���-�� ����� ������ ����������� �� 1 ������
	        	winMU++;
	        }
	        	else if (muGoals < otGoals) { // ���� ���-�� ����� ������ ����������� �� 1 ���������
	        		loseMU++;
	        			}
	        				else { // � ��������� ������� ����������� �� 1 ������
	        					drawsMU++;
	        					}
					}
		return chArray;
    }
    
public static void main(String[] args) {
	String str;
	Scanner in = new Scanner( System.in );
	System.out.println();
	System.out.println(".--------------------------------------------------------------------------------------------.");
	System.out.println("| Please enter the game statistics for Manchester United team, for example:                  |");
	System.out.println("| Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1 |");
	System.out.println("'--------------------------------------------------------------------------------------------'");
	System.out.println();
	System.out.print("Enter the string \"Football statistics\": ");
	str = in.nextLine();
	Analizefootball ob = new Analizefootball();
	ob.MUsplint(str);
	ob.show();
	in.close();
	}
}

