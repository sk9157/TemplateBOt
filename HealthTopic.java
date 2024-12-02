//different health topics: mental, physical, crisis, and store basic info about each topic
public class HealthTopic {


    private String name;
    private String description;
    private String[] tips;

    public HealthTopic(String name, String description, String[] tips) {
        this.name = name;
        this.description = description;
        this.tips = tips;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRandomTip() {
        int index = (int) (Math.random() * tips.length);
        return tips[index];
    }
}