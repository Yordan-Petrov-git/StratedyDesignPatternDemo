package models.entity.behaviour.impl.quackImpl;

import models.entity.behaviour.QuackBehavior;

/**
 * Implementation for the mute quack behavior.
 *
 * @author Yordan Petrov
 */
public class QuackBehaviorMuteImpl extends QuackBehaviorImpl implements QuackBehavior {
    /**
     *
     */
    @Override
    public void quack() {
        print.printMessage(MESSAGE_QUACK_MUTE);
    }
}
