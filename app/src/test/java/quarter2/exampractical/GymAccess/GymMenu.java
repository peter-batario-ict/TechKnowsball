package quarter2.exampractical.GymAccess;

import java.util.Scanner;

public class  GymMenu{

    public void start(Scanner scanner) {

        boolean running = true;

        System.out.println("==== DOES USER WANT TO ENTER THE GYM??? ====");
        System.out.println("1. YES");
        System.out.println("2. NO\n");

        while(running && scanner.hasNextLine()){
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.println("USER HAS SUCCESFULLY ENTERED!....");
                    break;
                case "2":
                    System.out.println("Does user want to hire a trainer?");
                    System.out.println("1. Yes");
                    System.out.println("2. No\n");
                    if (scanner.hasNextLine()) {
                        String tierInput = scanner.nextLine().trim();
                        if (tierInput.equals("1")){
                            System.out.println("--------------USER PROFILE-----------------");
                            System.out.println("NAME:   ######### ");
                            System.out.println("EMAIL: ###########");
                            System.out.println("MEMBERSHIP: REGULAR\n");
                            System.out.println("TRAINER UNAVAILABLE, NEED TO UPGRADE MEMBERSHIP\n");

                        }else if(tierInput.equals("2")){
                            System.out.println("--------------USER PROFILE-----------------");
                            System.out.println("NAME:   ######### ");
                            System.out.println("EMAIL: ###########");
                            System.out.println("MEMBERSHIP: REGULAR\n");
                            System.out.println("USER HAS SUCCESFULLY HIRED A TRAINER");

                        }
                        break;



                    }

            }

        }





    }
}