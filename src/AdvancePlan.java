public class AdvancePlan extends PlanDecorator {

    public AdvancePlan(Plans plans) {
        super.PlanDecorator(plans);
    }

    @Override
    public void get() {
        super.get();
        System.out.print(" + 1000sms + unlimited for messengers ");
    }
}
