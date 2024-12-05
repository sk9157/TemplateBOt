public class Keywords {
    public String[] helloKey = {"hello", "hi", "hey", "up", "howdy"};
    public String[] mentalKey = {"mental", "depressed", "sad","bad","down"};
    public String[] physicalKey = {"physical", "injured", "hurt","health"};
    public String[] nutritionKey = {"nutrition", "food", "eating"};
    public String[] exitKey = {"bye", "exit"};

    public String[] injuredKey = {"injured", "hurt", "pain", "sick","ill"};
    public String[] dehyratedKey = {"dehydrated", "thirsty", "water"};
    public String[] itchyKey = {"itchy", "itch", "scratch"};

    public String[] fatkey = {"fat", "fats"};
    public String[] carbkey = {"carb", "carbs", "carbohydrate", "carbohydrates"};
    public String[] proteinkey = {"protiens", "protein"};

    public String[] ok = {"ok", "okay", "okie", "alright"};

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
