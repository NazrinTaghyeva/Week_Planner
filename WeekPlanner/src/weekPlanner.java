import java.util.Objects;
import java.util.Scanner;

public class weekPlanner {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = " - do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = " - go to courses";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = " - meet with friends";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = " - prepare for the IELTS exam";
        scedule[4][0] = "Thursday";
        scedule[4][1] = " - watch a film";
        scedule[5][0] = "Friday";
        scedule[5][1] = " - visit the grandmother";
        scedule[6][0] = "Saturday";
        scedule[6][1] = " - play the game";

        Scanner sc=new Scanner(System.in);
//          for (int i=0; i<7;i++){
//              for (int j=0; j<2;j++){
////                  scedule[i][j]=sc.nextLine();
//                  System.out.print(scedule[i][j]);
//                  }
//              System.out.println();
//          }
//        for (int i = 0; i < 7; i++)
//        {
//            for (int j = 0; j < 2; j++)
//                System.out.print(scedule[i][j] + " ");
//
//            System.out.println();
//        }


        while (true) {
            System.out.println("Please, input the day of the week:");
            String day=sc.nextLine().replace(" ","");
            String newDay = day.substring(0,1).toUpperCase() + day.substring(1,day.length()).toLowerCase();
            if (newDay.equalsIgnoreCase("exit")) {break;}
            switch (newDay) {
                case "Sunday": {
                    System.out.println(scedule[0][0] + scedule[0][1]);
                    break;
                }
                case "Monday": {
                    System.out.println(scedule[1][0] + scedule[1][1]);
                    break;
                }
                case "Tuesday": {
                    System.out.println(scedule[2][0] + scedule[2][1]);
                    break;
                }
                case "Wednesday": {
                    System.out.println(scedule[3][0] + scedule[3][1]);
                    break;
                }
                case "Thursday": {
                    System.out.println(scedule[4][0] + scedule[4][1]);
                    break;
                }
                case "Friday": {
                    System.out.println(scedule[5][0] + scedule[5][1]);
                    break;
                }
                case "Saturday": {
                    System.out.println(scedule[6][0] + scedule[6][1]);
                    break;
                }
                default: {
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
                }
            }
        }
    }

}