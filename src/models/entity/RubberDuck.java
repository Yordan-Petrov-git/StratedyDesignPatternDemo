package models.entity;

import models.entity.behaviour.impl.flyImpl.FlyDoNotFlyBehavior;
import models.entity.behaviour.impl.quackImpl.QuackBehaviorMuteImpl;

/**
 * Class for rubber duck.
 *
 * @author Yordan Petrov
 */
public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name);
        quackBehavior = new QuackBehaviorMuteImpl();
        flyBehavior = new FlyDoNotFlyBehavior();
    }


}
