import java.util.Scanner;

public class BluntBot {
    private HealthTopic[] topics;
    private String[] generalResponses = {
        "Physical activity is important for health",
        "Eating balanced meals is good for you",
        "Mental health is as important as physical health",
        "I'm here to help you",
        "Sleep is critical"
    };
    private String[] unknownResponses = {
        "No clue what you’re saying. Try asking better questions.",
        "I don’t have all the answers. I’m just a chatbot, not a miracle worker.",
        "That’s not my expertise. Stick to health, food, or feelings.",
        "You’re wasting my time. Let’s stick to useful questions, okay?"
        };
    public String getUnknownResponses (int num){
        return (unknownResponses[num]);
    }
    public String[] helloResponses = {
        "Blunt Bot: Hey. I’m Blunt Bot. I talk about Physical Health, Nutrition, and Mental Health. Ask me about one of those topics. Say 'bye' or 'exit' to stop the chat" + //
                        "Don’t ask me dumb stuff—I don’t have time for it.",
        "Blunt Bot: Hi. I’m Blunt Bot. I’m here to help, not to coddle. Let’s keep this quick. Choose one between physical health, nuttrition, or mental health. Say 'bye' or 'exit' to stop the chat",
        "Blunt Bot: Yo. I’m Blunt Bot. Got questions about health? Ask me. Got nonsense? Keep it to yourself. Ask me about Physical Health, Nutrition, or Mental Health. Say 'bye' or 'exit' to stop the chat"
    };
    public String getHelloResponses (int num){
        return (helloResponses[num]);
    }
    public String[] fineResponses = {
        "You’re good. You don’t need me. Figure it out yourself.",
        "You're not broken. Get on with it.",
        "Seriously, why are you here? You can handle it."
    };
    public String getmentalResponses (int num){
        return (mentalResponses[num]);
    }

    public String[] mentalResponses = {
        "Cry, then shower. Get moving.",
        "Feel it, then walk it off. Get your body moving.",
        "Cry it out, then take a shower. Do something.",
        "Let it out, then move. Walk, stretch, anything.",
        "Cry, then do something—shower, walk, whatever.",
        "Cry, then get up and move. Your body needs it.",
        "Cry, then go for a walk. Change your environment.",
        "Feel it, then act. Shower, walk, anything.",
        "Cry, then move. Do something to snap out of it.",
        "Let it out, then get off your ass. Shower, walk, something."
    };
    public String getfineResponses (int num){
        return (fineResponses[num]);
    }

    public String[] itchyResponses = {
        "Stop this conversation right now and go take a shower. It's gross",
        "Gross. Go take a shower right now",
        "I know you stink. Go take a shower right now."
    };
    public String getitchyResponses (int num){
        return (itchyResponses[num]);
    }

    public String[] betterResponses = {
        "Better yet? Rate your feeling again.",
        "You feel any different? Rate your feeling again.",
        "Is it getting better? Rate your feeling again.",
        "Feel any less crappy? Rate your feeling again.",
        "Any improvement? Rate your feeling again.",
        "Better or still stuck? Rate your feeling again.",
        "Is it better now? Rate your feeling again.",
        "Feel better or not? Rate your feeling again.",
        "You doing better or what? Rate your feeling again.",
        "Any change yet? Rate your feeling again.",
        "Is it getting any easier? Rate your feeling again."
    };
    public String getbetterResponses (int num){
        return (betterResponses[num]);
    }

    public String[] injuredResponses= {
        "You’re hurt? Ice it, rest it, or see a doctor. Complaining won’t fix it.",
        "Pain happens. Figure out if it’s serious, then deal with it.",
        "If it’s a small injury, suck it up. If it’s bad, go get help. Simple.",
        "Wrap it, rest it, and stop doing whatever dumb thing got you hurt.",
    };
    public String getinjuredResponses (int num){
        return (injuredResponses[num]);
    }

    public String[] dehydratedResponses = {
        "Really? Just drink some water. No need for a chatbot.",
        "Are you for real? Drink water, it’s that simple.",
        "Come on, just drink some water. This doesn’t need a chatbot.",
        "Seriously? Stop overthinking and drink water.",
        "You’re not that desperate. Just drink some water.",
        "How old are you, 5? You know how to fix this issue. Get some water"
    };
    public String getdehydratedResponses (int num){
        return (dehydratedResponses[num]);
    }

    public BluntBot() {
        topics = new HealthTopic[]{
            new HealthTopic("Physical Health", "Staying active keeps you healthy", new String[]{"Try being active for 30 mins daily.", "Consider yoga for flexibility.", "Strength training is great for muscles!"}),
            new HealthTopic("Nutrition", "Eating well keeps you from getting sick.", new String[]{"Include more veggies in meals.", "Drink plenty of water daily.", "Eat balanced meals with protein, carbs, and fats."}),
            new HealthTopic("Mental Health", "Take care of your mind", new String[]{"Practice deep breathing.", "Take breaks when stressed", "Talk to friends or family about feelings."})
        };
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blunt Bot. Ask me about health topics like Physical Health, Nutrition, or Mental Health. Say 'exit' 'bye' or 'i'm done' to stop");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            // Check for multiple exit keywords
            if (input.contains("exit") || input.contains("bye") || input.contains("i'm done")) {
                System.out.println("Blunt Bot: bye. Remember, health is wealth. Goodbye!");
                break;
            }

            respond(input);
        }
        scanner.close();
    }

    private void respond(String input) {
        if (input.contains("physical health")) {
            System.out.println("Blunt Bot: physical health is vital to stasy healthy");
        } 
        else if (input.contains("nutrition")) {
            System.out.println("Blunt Bot: if you want to stay healthy stop eating as much fast food");
        } 
        else if (input.contains("mental health")) {
            System.out.println("Blunt Bot: Have you tried walking or going outside to improve your mental health?");
        } 
        else if (input.contains("exercise")) {
            System.out.println("Blunt Bot: Exercise boosts your mood and helps you stay healthy! Try to get at least 30 minutes each day.");
        } 
        else if (input.contains("hydration")) {
            System.out.println("Blunt Bot: Staying hydrated is crucial! Aim for about 8 glasses of water daily.");
        } 
        else if (input.contains("stress")) {
            System.out.println("Blunt Bot: Stress is well stressful. Try taking a deep breath or taking a break to help manage it.");
        } 
        else if (input.contains("hurt")) {
            System.out.println("Blunt Bot: If the pain is over a 4 on a scale of 1-10 take some pain medication");
        }
        else if (input.contains("hurting")) {
            System.out.println("Blunt Bot: If your pain is over a 7 its time for some intervention. Call 911 or your nearest Doctor");
        }
        else if (input.contains("depressed")) {
            System.out.println("Blunt Bot: are you really depressed or are you just saying that?");
        }
        else if (input.contains("sad")) {
            System.out.println("Blunt Bot: Try and identify what is making you sad or upset");
        }
        else if (input.contains("upset")) {
            System.out.println("Blunt Bot: Try and identify what is making you sad or upset");
        }
        else if (input.contains("broken")) {
            System.out.println("Blunt Bot: If you think you have a broken bone call 911! (you should know this)");
        }

        else if (input.contains("dehydrated")) {
            System.out.println("Blunt Bot: Drink some water! If that doesn't work mix in some salt");
        }
        else if (input.contains("scared")) {
            System.out.println("Blunt Bot: Try and identify what is making you scared. Maybe try facing your fears");
        }
        else if (input.contains("anxious")) {
            System.out.println("Blunt Bot: Calm down.");
        }
        else if (input.contains("eat")) {
            System.out.println("Blunt Bot: Hungry? Eat something healthy. No chips.");
        }
        else if (input.contains("hi")) {
            System.out.println("Blunt Bot: Hello.");
        }
        else if (input.contains("hello")) {
            System.out.println("Blunt Bot: What do you want from me?");
        }

        else if (input.contains("hey")) {
            System.out.println("Blunt Bot: Hi there. What do you need?");
        }
        else if (input.contains("nothing")) {
            System.out.println("Blunt Bot: its always something.");
        }
        else if (input.contains("sick")) {
            System.out.println("Blunt Bot: Is it a cold? Maybe try some cold medicine.");
        }
        
        else {
            respondGenerallyOrUnknown();
        }
    }

    private void respondWithTopic(int topicIndex) {
        HealthTopic topic = topics[topicIndex];
        System.out.println("Blunt Bot: " + topic.getRandomTip());
    }

    private void respondGenerallyOrUnknown() {
        if (Math.random() > 0.5) {
            System.out.println("Blunt Bot: " + generalResponses[(int) (Math.random() * generalResponses.length)]);
        } else {
            System.out.println("Blunt Bot: " + unknownResponses[(int) (Math.random() * unknownResponses.length)]);
        }
    }
}
