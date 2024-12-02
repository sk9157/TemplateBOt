public class Keywords {
    public String[] helloKey = {"hello", "hi", "hey", "up", "howdy"};
    public String[] mentalKey = {"mental", "depressed", "sad"};
    public String[] physicalKey = {"physical", "injured", "hurt","health"};
    public String[] nutritionKey = {"nutrition", "food", "eating"};
    public String[] exitKey = {"bye", "exit"};

    public String[] injuredKey = {"injured", "hurt", "pain"};
    public String[] dehyratedKey = {"dehydrated", "thirsty", "water"};
    public String[] itchyKey = {"itchy", "itch", "scratch"};


    public boolean check(String[] arr, String res){
        boolean result = false;
        for (String str : arr){
            if (res.contains(str)){
                result = true;
            }
        }
        return result;
    }
    
    public int random (int n){
        return (int)(Math.random()*n);
    }
}
