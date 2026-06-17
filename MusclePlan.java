class MusclePlan extends FitnessPlan {

    public MusclePlan(UserProfile user) {
        super(user);
    }

    public int calories() {
        return (int) (10 * user.getWeight() + 2000);
    }

    public String workout() {
        return """
        Mon: Push
        Tue: Pull
        Wed: Rest
        Thu: Legs
        Fri: Upper
        Sat: Abs
        Sun: Rest
        """;
    }

    public String tips() {
        return """
        - Eat protein
        - Progressive overload
        - Rest properly
        """;
    }
}