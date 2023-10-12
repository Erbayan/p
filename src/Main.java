
interface Plans {
    public void get();
}
class BasicPlan implements Plans {
    @Override
    public void get() {
        System.out.print("100min for call");
    }

}

abstract class PlanDecorator implements Plans {
    private Plans plans;

    public void PlanDecorator(Plans plans) {
        this.plans = plans;
    }

    @Override
    public void get() {
        this.plans.get();
    }
}

class MediumPlan extends PlanDecorator {
    public MediumPlan(Plans plans) {
        super.PlanDecorator(plans);
    }

    @Override
    public void get() {
        super.get();
        System.out.print(" + 10gb for 4g");
    }
}

class AdvancePlan extends PlanDecorator {

    public  AdvancePlan(Plans plans) {
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
