package models.entity.behaviour.impl.flyImpl;

import models.entity.behaviour.FlyBehavior;

/**
 * Implementation for the fly behavior with wings.
 *
 * @author Yordan Petrov
 */
public class FlyBehaviorWithWings extends FlyBehaviorImpl implements FlyBehavior {
    /**
     * Method for flying.
     */
    @Override
    public void fly() {
        print.printMessage(MESSAGE_FLY_WITH_WINGS);
    }
}
