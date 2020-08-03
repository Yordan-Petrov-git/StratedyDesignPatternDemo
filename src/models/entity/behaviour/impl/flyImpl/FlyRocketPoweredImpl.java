package models.entity.behaviour.impl.flyImpl;

import models.entity.behaviour.FlyBehavior;

/**
 * Implementation for the rocket fly behavior.
 *
 * @author Yordan Petrov
 */
public class FlyRocketPoweredImpl extends FlyBehaviorImpl implements FlyBehavior {
    /**
     * Method for flying.
     */
    @Override
    public void fly() {
        print.printMessage(MESSAGE_FLY_ROCKET_POWERED);
    }
}
