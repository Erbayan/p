abstract public class PlanDecorator implements Plans {
    private Plans plans;

    public void PlanDecorator(Plans plans) {
        this.plans = plans;
    }

    @Override
    public void get() {
        this.plans.get();
    }
}
