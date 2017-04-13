package Topic3_String;

public class Analize {

    static int manchesterGoals = 0, otherTeamGoal = 0, winManchester = 0, loseManchester = 0, drawsManchester = 0, goalScored = 0, numberOfPoints = 0;

    static public void main(String[] args)
    {
        String results = "Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1, Liverpool 2 Manchester United 1, Swansea 2 Manchester United 4";

        //Split string by comma
        for (String tempStr: results.split(","))
        {
            splitString(tempStr);
        }



        System.out.println("Number of wins = " + winManchester);
        System.out.println("Number of draws = " + drawsManchester);
        System.out.println("Number of defeats = " + loseManchester);
        System.out.println("Goal scored = " + manchesterGoals);
        System.out.println("Goal conceded = " + otherTeamGoal);
        numberOfPoints = winManchester * 3 + drawsManchester * 1;
        System.out.println("Number of points = " + numberOfPoints);
    }

    static String splitString(String tempStr)
    {
        String manchesterString;
        String manchester = "Manchester United ";
        int x = 0, muGoals = 0, otherGoals = 0;


        //Delete spaces in string
        tempStr = tempStr.trim();
        // number of position MU Team
        x = tempStr.lastIndexOf(manchester);
        manchesterString = tempStr.substring(x);

        //Save matches MU in manchesterBuffer
        StringBuffer manchesterBuffer = new StringBuffer(manchesterString);
        manchesterBuffer = manchesterBuffer.delete(manchester.length() + 1, tempStr.length());
        
        System.out.println(manchesterBuffer);
        
        muGoals = result(manchesterBuffer);
        //Calculating goals of MU
        manchesterGoals += muGoals;
        //System.out.println(manchesterBuffer + " " + manchesterGoals);

        //Calculating start position of MU string
        x = tempStr.indexOf(manchester);
        //Buffer for Other team string
        StringBuffer otherTeam = new StringBuffer(tempStr);
        otherTeam = otherTeam.delete(x, x + manchester.length() + 2);
        otherGoals = result(otherTeam);
        //Calculating goals of other team
        otherTeamGoal += otherGoals;

        //System.out.println(otherTeam + " " + otherTeamGoal);


        if(muGoals > otherGoals)
        {
            winManchester++;
        }
        else if (muGoals < otherGoals)
            {
                loseManchester++;
            }
            else
            {
                drawsManchester++;
            }



        return tempStr;
    }

    static int result(StringBuffer team)
    {
        int goal = 0;
        //string for cut the name of team
        StringBuffer temp = new StringBuffer(team);
        temp = temp.delete(0, team.length() - 2);
        String out = new String(temp);
        out = out.trim();

        goal = Integer.parseInt(out);
        return goal;
    }

}
