
interface SwimBehavior {
    void swim();
}

interface QuackBehavior {
    void quack();
}

interface FlyBehavior {
    void fly();
}

class RubberDuck implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("Rubber Duck is swimming.");
    }
}

class WoodenDuck implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("Wooden Duck is swimming.");
    }
}

class RedHeadDuck implements SwimBehavior, QuackBehavior, FlyBehavior {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck is quacking.");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }
}

class LakeDuck implements SwimBehavior, QuackBehavior {
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck is quacking.");
    }
}

public class DuckGame {
    public static void main(String[] args) {
        SwimBehavior rubberDuck = new RubberDuck();
        SwimBehavior woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();
        
        rubberDuck.swim();
        woodenDuck.swim();
        redHeadDuck.swim();
        lakeDuck.swim();
        
        redHeadDuck.quack();
        redHeadDuck.fly();
        lakeDuck.quack();
    }
}
