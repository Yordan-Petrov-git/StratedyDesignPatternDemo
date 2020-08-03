package models.entity.behaviour.impl.quackImpl;

import models.entity.behaviour.QuackBehavior;

/**
 * Implementation for the standard  quack behavior.
 *
 * @author Yordan Petrov
 */
public class QuackBehaviorSqueakImpl extends QuackBehaviorImpl implements QuackBehavior {
    /**
     *
     */
    @Override
    public void quack() {
        print.printMessage(MESSAGE_QUACK_SQUEAK);
    }


}
