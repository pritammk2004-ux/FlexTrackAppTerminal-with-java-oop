class WeightLossPlan extends FitnessPlan {

    public WeightLossPlan(UserProfile user) {
        super(user);
    }

    public int calories() {
        return (int) (10 * user.getWeight() + 1200);
    }

    public String workout() {
        return """
        Mon: Cardio
        Tue: Full body
        Wed: Rest
        Thu: HIIT
        Fri: Upper body
        Sat: Walking
        Sun: Rest
        """;
    }

    public String tips() {
        return """
        - Eat less sugar
        - Drink water
        - Sleep well
        """;
    }
}