public class MediumPlan extends PlanDecorator {
    public MediumPlan(Plans plans) {
        super.PlanDecorator(plans);
    }

    @Override
    public void get() {
        super.get();
        System.out.print(" + 10gb for 4g");
    }
}
