public class Main {
    public static void main(String[] args) {
        System.out.println("Basic plan:");
        Plans basic = new BasicPlan();
        basic.get();
        System.out.println("\nMedium plan:");
        Plans medium = new MediumPlan(new BasicPlan());
        medium.get();
        System.out.println("\nAdvance plan: ");
        Plans advance = new AdvancePlan(new MediumPlan(new BasicPlan()));
        advance.get();
    }
}
