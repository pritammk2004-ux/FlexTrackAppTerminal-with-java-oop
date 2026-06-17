class BalancedPlan extends FitnessPlan {

    public BalancedPlan(UserProfile user) {
        super(user);
    }

    public int calories() {
        return (int) (10 * user.getWeight() + 1500);
    }

    public String workout() {
        return """
        - 3 days workout
        - 2 days walking
        - Stay active daily
        """;
    }

    public String tips() {
        return """
        - Balanced diet
        - Move daily
        - Don’t stress
        """;
    }
}