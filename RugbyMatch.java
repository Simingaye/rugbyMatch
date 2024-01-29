import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RugbyMatch {
    String homeTeam;
    private String awayTeam;
    private static LocalDate dateOfMatch;
    private double sAT;
    private double sHT;

    public RugbyMatch(String homeTeam, String awayTeam,LocalDate dateOfMatch,double sAT,double sHT){
          this.homeTeam = homeTeam;
          this.awayTeam = awayTeam;
          this.dateOfMatch= dateOfMatch;
          this.setSAT(sAT);
          this.setSHT(sHT);
    }

    public void setSAT(double sAT){
        if(sAT < 0){
            System.out.println("Score of the away team cannot be less than 0 ");
            this.sAT = 0;
        }else{
            this.sAT = sAT;
        }
    }

    public void setSHT(double sHT){
        if(sHT < 0){
            System.out.println("Score of the home team cannot be less than 0 ");
            this.sHT = 0;
        }else{
            this.sHT = sHT;
        }
    }

    public String getHomeTeam(){
        return homeTeam;
    }
    public LocalDate getDateOfMatch(){

        return dateOfMatch;
    }

    public String getAwayTeam(){
        return awayTeam;
    }
    public double getSHT(){
        return sHT;
    }
    public double getSAT()
    {
        return sAT;
    }

    public int getResult(){
        int result;
        if(sHT > sAT){
            result = 1;

        }else{
            if(sHT == sAT){
             result = 0;

            }else{
                result = -1;

            }
        }
        return result;
    }

    public static boolean hasBeenPlayed() {
        long daysDiff = ChronoUnit.DAYS.between(LocalDate.now(),dateOfMatch);
        boolean beenPlayed = true;

        if(daysDiff >= 0 ){
            beenPlayed = false;
        }else{
            beenPlayed = true;
        }

    return beenPlayed;
    }

}
