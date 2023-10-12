
interface plans{
    public void get();
}
class BasicPlan implements plans {
    @Override
    public void get() {
        System.out.print("100min for call");
    }

}

abstract class PlanDecorator implements plans{
    private plans plans;

    public void PlanDecorator(plans plans) {
        this.plans = plans;
    }

    @Override
    public void get() {
        this.plans.get();
    }
}

class MediumPlan extends PlanDecorator {
    public MediumPlan(plans plans) {
        super.PlanDecorator(plans);
    }

    @Override
    public void get() {
        super.get();
        System.out.print(" + 10gb for 4g");
    }
}

class AdvancePlan extends PlanDecorator {

    public  AdvancePlan(plans plans) {
        super.PlanDecorator(plans);
    }

    @Override
    public void get() {
        super.get();
        System.out.print(" + 1000sms + unlimited for messengers ");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Basic plan:");
        plans basic = new BasicPlan();
        basic.get();
        System.out.println("\nMedium plan:");
        plans medium = new MediumPlan(new BasicPlan());
        medium.get();
        System.out.println("\nAdvance plan: ");
        plans advance = new AdvancePlan(new MediumPlan(new BasicPlan()));
        advance.get();
    }
}
