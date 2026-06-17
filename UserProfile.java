public class UserProfile {

    private String name;
    private double weight;
    private String goal;
    private int age;
    private double height;
    private String bodyType;

    public UserProfile(String name, double weight, String goal,
                       int age, double height, String bodyType) {

        this.name = name;
        this.weight = weight;
        this.goal = goal;
        this.age = age;
        this.height = height;
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getGoal() {
        return goal;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getBodyType() {
        return bodyType;
    }
}