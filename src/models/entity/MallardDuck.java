package models.entity;

import models.entity.behaviour.impl.flyImpl.FlyDoNotFlyBehavior;
import models.entity.behaviour.impl.quackImpl.QuackBehaviorMuteImpl;

/**
 * Class for Mallard Duck.
 *
 * @author Yordan Petrov
 */
public class MallardDuck extends Duck {

    public MallardDuck(String name) {
        super(name);
        quackBehavior = new QuackBehaviorMuteImpl();
        flyBehavior = new FlyDoNotFlyBehavior();
    }
}
