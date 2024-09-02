
/**
 * Test the schedule
 *
 * @author (Rachit Jha)
 * @version (1/9/24)
 */
public class ScheduleRunner
{
    public static void main(String[] args){
        Schedule schedule = new Schedule();
        /*
        schedule.readTeams();
        schedule.writeTeams();
        schedule.writeTeamsToFile();
        */
        schedule.readTeams();
                schedule.writeTeamsToFile();

    }
}