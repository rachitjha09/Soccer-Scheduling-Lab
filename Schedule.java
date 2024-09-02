import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Schedule {
    private int howManyTeams;
    private String[] teams;

    public void readTeams() {
        try {
            File f=new File("input.txt");
            Scanner s=new Scanner(f);
            howManyTeams=Integer.parseInt(s.nextLine());
            teams=new String[howManyTeams];
            for(int i=0; i<howManyTeams; i++){
                teams[i]=s.nextLine();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public void writeTeamsToFile(){
        try{
            File output=new File("output.txt");
            PrintWriter pw=new PrintWriter(output);
            boolean isOdd=howManyTeams%2!=0;
            for (int round=1; round<=howManyTeams; round++) {
                pw.println("Week " + round);
                if (isOdd==true){
                    pw.println(teams[round-1] + " has a bye round");
                }
                for (int match=1; match<=howManyTeams/2; match++) {
                    int team1Index=(round+match*2)%(howManyTeams-1);
                    int team2Index=team1Index+1;
                    String team1=teams[team1Index];
                    String team2=teams[team2Index];
                    pw.println(team1 + " plays " + team2);
                }
                pw.println();
            }
            pw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



