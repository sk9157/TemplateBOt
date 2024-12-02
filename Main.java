import java.util.Scanner;
public class Main
{

    //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
    //May want to create an array of goodbye answers.
    static String[] goodBye = {"bye"};
        static BluntBot x = new BluntBot();
        static Keywords k = new Keywords();
        static Scanner in = new Scanner (System.in);//Creates scanner object.
        static Scanner in2 = new Scanner (System.in);//Creates a second scanner object.
        static Scanner in3 = new Scanner (System.in);
        static boolean exit = false;
        static boolean mentaltopic = false;
        static boolean physicaltopic = false;
        static boolean nutritiontopic = false;
       public static void main(String[] args)
       {
        
        
        System.out.println("Hi");
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
                        } else if (k.check(k.nutritionKey,userInput)){
                                nutritiontopic = true;
                                nutrition();
                        }else {
                                try {
                                        int numResp = Integer.parseInt(userInput); // Convert it to integer
                                        if(numResp > 6){
                                            System.out.println(x.getfineResponses(k.random(3)));
                                            System.out.println("Got any health or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                        } else if(numResp < 7 && numResp > 4){
                                            System.out.println("Start exercising, even if it’s just a walk. Talk to your friends. Fix your sleep. Stop isolating. Quit making excuses.");
                                            System.out.println("Got any health or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                        } else if(numResp < 5){
                                            System.out.println(x.getmentalResponses(k.random(10)));
                                            System.out.println(x.getbetterResponses(k.random(10)));
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
                System.out.println("Describe your problem. Injured? Dehydrated? breathing issue? Feelinf itchy?");
                while(physicaltopic){
                        String userInput = in2.nextLine().toLowerCase();
                        if(k.check(k.exitKey,userInput)){
                                physicaltopic = false;
                                break;
                        } else if (k.check(k.nutritionKey,userInput)){
                                nutritiontopic = true;
                                nutrition();
                        }else if (k.check(k.mentalKey,userInput)){
                                mentaltopic = true;
                                mental();
                        }else {
                                if(k.check(k.injuredKey,userInput)){
                                        System.out.println(x.getinjuredResponses(k.random(4)));
                                } else if (k.check(k.dehyratedKey,userInput)){
                                        System.out.println(x.getdehydratedResponses(k.random(6)));
                                } else if (k.check(k.itchyKey,userInput)){
                                        System.out.println("Is it severe? moderate? mild?");
                                        String userResp = in3.nextLine();
                                        if(userResp.equals("severe")){
                                                System.out.println("Go see a doctor.");
                                                System.out.println("Got any mental or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                            } else if(userResp.equals("moderate")){
                                                System.out.println("Check if you got a mosquito bite.");
                                                System.out.println("Got any mental or nutrition issues to talk about? Otherwise, type 'bye' to end this.");
                                            } else if(userResp.equals("mild")){
                                                System.out.println(x.getitchyResponses(k.random(3)));
                                                break;
                                                // System.out.println(x.getbetterResponses(k.random(10)));
                                            } else {
                                                System.out.println(x.getUnknownResponses(k.random(4)));
                                        }
                                }
                        }
                }
        }

        public static void nutrition(){
                System.out.println("nutrition");
        }


       public static String getRandomResponse(){
            return "";
       }
       // It'll generate a random response when the chatbot doesn't understand what to say

       //Here is an example of a method you might use.
         public static String getResponse(String statement)
         {
                 String response = "";
                 if (statement.indexOf("no") >= 0)
                 {
                         response = "Why so negative?";
                 }
                 else if (statement.indexOf("mother") >= 0
                                 || statement.indexOf("father") >= 0
                                 || statement.indexOf("sister") >= 0
                                 || statement.indexOf("brother") >= 0)
                 {
                         response = "Tell me more about your family.";
                 }
                 else
                 {
                         //respoonse = getRandomResponse() <--- yo uwill need to create this methodd.
                 }
                 return response;
         }

}