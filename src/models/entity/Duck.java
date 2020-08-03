package models.entity;

import models.entity.behaviour.FlyBehavior;
import models.entity.behaviour.QuackBehavior;

/**
 * Class for Duck.
 *
 * @author Yordan Petrov
 */
public class Duck extends Animal {

    /**
     *
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(String name) {
        super(name);
    }

    /**
     *
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     *
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * @return
     */
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    /**
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * @return
     */
    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    /**
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
