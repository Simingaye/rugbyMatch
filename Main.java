import java.time.LocalDate;

class testRugbyMatch {
    public static void main(String[] args) {
        RugbyMatch match = new RugbyMatch("falcons", "eagles", LocalDate.parse("2023-09-28"), 34, 23);

        System.out.println("Home Team: " + match.getHomeTeam());
        System.out.println("Score: " + match.getSHT());
        System.out.println(" ");

        System.out.println("Away Team: " + match.getAwayTeam());
        System.out.println("Score: " + match.getSAT());
        System.out.println(" ");

        if (match.getResult() == 1) {
            System.out.println("Home team won");
        } else {
            if (match.getResult() == 0) {
                System.out.println("Draw");
            } else {
                System.out.println("Away team won");
            }
            System.out.println(" ");

            if (match.hasBeenPlayed() == false) {
                System.out.println("Match has not been  played");
            } else {
                System.out.println("Match has been played");
            }


        }
    }
}