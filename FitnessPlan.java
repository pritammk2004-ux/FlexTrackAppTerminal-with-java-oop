abstract class FitnessPlan {

    protected UserProfile user;

    public FitnessPlan(UserProfile user) {
        this.user = user;
    }

    public abstract int calories();
    public abstract String workout();
    public abstract String tips();

    public String generateReport() {
        return """
        
        FLEXTRACK FITNESS PLAN

        Name   : %s
        Weight : %.1f kg
        Goal   : %s

        Calories: %d kcal/day

        WORKOUT:
        %s

        TIPS:
        %s

        Stay consistent and track your progress!
        """.formatted(
                user.getName(),
                user.getWeight(),
                user.getGoal(),
                calories(),
                workout(),
                tips()
        );
    }

    public static FitnessPlan create(UserProfile user) {

        return switch (user.getGoal()) {
            case "Weight Loss" -> new WeightLossPlan(user);
            case "Muscle Building" -> new MusclePlan(user);
            default -> new BalancedPlan(user);
        };
    }
}