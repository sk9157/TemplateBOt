import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main
{

    //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
    //May want to create an array of goodbye answers.
    static String[] goodBye = {"bye"};
        static BluntBot x = new BluntBot();
        static Keywords k = new Keywords();
        static User user = new User(0,0);
        static Scanner in = new Scanner (System.in);//Creates scanner object.
        static Scanner in2 = new Scanner (System.in);//Creates a second scanner object.
        static Scanner in3 = new Scanner (System.in);
        static boolean exit = false;
        static boolean mentaltopic = false;
        static boolean physicaltopic = false;
        static boolean nutritiontopic = false;
        static LocalTime now = LocalTime.of(19,45);
       public static void main(String[] args)
       {
        
        
        System.out.println("Welcome to Blunt Bot. Say 'hello' to start the conversation.");
        while(!exit){
                String userResp = in.nextLine().toLowerCase(); 
                // System.out.println(userResp);
                if (k.check(k.helloKey,userResp)){
                        System.out.println(x.getHelloResponses(k.random(3)));

                } else if(k.check(k.mentalKey,userResp)){
                        mentaltopic = true;
                        mental();
                        break;
                } else if(k.check(k.physicalKey,userResp)){
                        physicaltopic = true;
                        physical();
                        break;
                }else if(k.check(k.nutritionKey,userResp)){
                        nutritiontopic = true;
                        nutrition();
                        break;
                }else if(k.check(k.exitKey,userResp)){
                        exit = true;
                }else if(k.check(k.ok,userResp)){
                        System.out.println("ok. Stick to the topics given.");
                }else {
                        System.out.println(x.getUnknownResponses(k.random(4)));
                }
                
                
        }
        }


       public static void mental(){
                System.out.println("Give it a number from 1 to 10. 1 is horrible, 10 is perfect.");
                while(mentaltopic){
                        String userInput = in2.nextLine().toLowerCase();
                        if(k.check(k.exitKey,userInput)){
                                mentaltopic = false;
                                break;
                        } else if(k.check(k.physicalKey,userInput)){
                                physicaltopic = true;
                                physical();
                                mentaltopic = false;
                        } else if (k.check(k.nutritionKey,userInput)){
                                nutritiontopic = true;
                                nutrition();
                                mentaltopic = false;
                        }else {
                                try {
                                        int numResp = Integer.parseInt(userInput); // Convert it to integer
                                        if(numResp > 6){
                                                user.setfeeling(numResp);
                                            System.out.println(x.getfineResponses(k.random(3)));
                                            System.out.println("Still have any health or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                        } else if(numResp < 7 && numResp > 4){
                                                user.setfeeling(numResp);
                                            System.out.println("Start exercising, even if it’s just a walk. Talk to your friends. Fix your sleep. Stop isolating. Quit making excuses.");
                                            System.out.println("Still have any health or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                        } else if(numResp < 5){
                                                user.setfeeling(numResp);
                                            System.out.println(x.getmentalResponses(k.random(10)));
                                            System.out.println(x.getbetterResponses(k.random(10)));
                                        }else if(k.check(k.ok,userInput)){
                                                System.out.println("ok. Stick to the topics given.");
                                        } else {
                                            System.out.println(x.getUnknownResponses(k.random(4)));
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("That's not a number. Stop messing around.");
                                    }
                        }
                }
        }

        public static void physical(){
                System.out.println("Describe your problem. Injured? Dehydrated? Feeling itchy?");
                while(physicaltopic){
                        String userInput = in2.nextLine().toLowerCase();
                        if(k.check(k.exitKey,userInput)){
                                physicaltopic = false;
                                break;
                        } else if (k.check(k.nutritionKey,userInput)){
                                nutritiontopic = true;
                                nutrition();
                                physicaltopic = false;
                        }else if (k.check(k.mentalKey,userInput)){
                                mentaltopic = true;
                                mental();
                                physicaltopic = false;
                        }else {
                                if(k.check(k.injuredKey,userInput)){
                                        System.out.println("Rate your pain out of 1 to 10.");
                                        try {
                                                userInput = in2.nextLine().toLowerCase();
                                                int numResp = Integer.parseInt(userInput); // Convert it to integer
                                                if(numResp > 6){
                                                        user.setpain(numResp);
                                                    System.out.println(x.getseverepainResponses(k.random(5)));
                                                    System.out.println("Still have any mental or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                                } else if(numResp < 7 && numResp > 3){
                                                        user.setpain(numResp);
                                                        System.out.println(x.getmoderatepainResponses(k.random(5)));
                                                        System.out.println("Still have any mental or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                                } else if(numResp < 4){
                                                        user.setpain(numResp);
                                                    System.out.println(x.getmildpainResponses(k.random(10)));
                                                    System.out.println("Still have any mental or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                                }else if(k.check(k.ok,userInput)){
                                                        System.out.println("ok. Stick to the topics given.");
                                                } else {
                                                    System.out.println(x.getUnknownResponses(k.random(4)));
                                                }
                                            } catch (NumberFormatException e) {
                                                System.out.println("That's not a number. Stop messing around.");
                                                System.out.println("Now you have to restate your problem becuase you messed around.");
                                            }
                                        
                                } else if (k.check(k.dehyratedKey,userInput)){
                                                System.out.println(x.getdehydratedResponses(k.random(6)));
                                                System.out.println("Still have any mental or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                } else if (k.check(k.itchyKey,userInput)){
                                                System.out.println("Is it severe? moderate? mild?");
                                                String userResp = in3.nextLine();
                                                if(userResp.equals("severe")){
                                                        System.out.println("Go see a doctor.");
                                                        System.out.println("Still have any mental or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                                } else if(userResp.equals("moderate")){
                                                        System.out.println("Check if you got a mosquito bite.");
                                                        System.out.println("Still have any mental or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                                } else if(userResp.equals("mild")){
                                                        System.out.println(x.getitchyResponses(k.random(3)));
                                                        break;
                                                } else {
                                                System.out.println(x.getUnknownResponses(k.random(4)));
                                                System.out.println("Now you have to restate your problem becuase you messed around.");
                                                }
                                        
                                } else {
                                        System.out.println(x.getUnknownResponses(k.random(4)));
                                }
                        }
                }
        }

        public static void nutrition(){
                System.out.println("Pick a nutrient you need or are clueless about: fats, carbohydrates,  proteins");
                while (nutritiontopic){
                        String userResp = in3.nextLine().toLowerCase();
                        if(k.check(k.exitKey,userResp)){
                                nutritiontopic = false;
                                break;
                        } else if (k.check(k.physicalKey,userResp)){
                                physicaltopic = true;
                                physical();
                                nutritiontopic = false;
                        }else if (k.check(k.mentalKey,userResp)){
                                mentaltopic = true;
                                mental();
                                nutritiontopic = false;
                        }else {
                                LocalTime time = LocalTime.now();
                                time = time.minusHours(8).withSecond(0);
                                if (time.isAfter(now)){
                                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
                                        String formattedTime = time.format(formatter);
                                        System.out.println("You want to eat something at " + formattedTime + "? Smart Choice.");
                                }
                                if(k.check(k.fatkey,userResp)){
                                        System.out.println(x.getfatResponses(k.random(3)));
                                        System.out.println("Still have any mental or physical issues to talk about? Otherwise, type 'bye' to end this.");
                                } else if (k.check(k.carbkey, userResp)){
                                        System.out.println(x.getcarbResponses(k.random(3)));
                                        System.out.println("Still have any mental or physical issues to talk about? Otherwise, type 'bye' to end this.");
                                } else if (k.check(k.proteinkey, userResp)){
                                        System.out.println(x.getproteinResponses(k.random(3)));
                                        System.out.println("Still have any mental or physical issues to talk about? Otherwise, type 'bye' to end this.");
                                } else {
                                        System.out.println(x.getUnknownResponses(k.random(4)));
                                }
                        }
                }
        }


       

}