package models.entity.behaviour.impl.flyImpl;

import models.entity.behaviour.FlyBehavior;

/**
 * Implementation for the no fly behavior.
 *
 * @author Yordan Petrov
 */
public class FlyDoNotFlyBehavior extends FlyBehaviorImpl implements FlyBehavior {
    /**
     * Method for flying.
     */
    @Override
    public void fly() {
        print.printMessage(MESSAGE_FLY_DO_NOT_FLY);
    }
}
