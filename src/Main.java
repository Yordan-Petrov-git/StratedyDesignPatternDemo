import models.entity.RubberDuck;
import models.entity.behaviour.impl.flyImpl.FlyRocketPoweredImpl;
import models.entity.behaviour.impl.quackImpl.QuackBehaviorSqueakImpl;

/**
 * @author Yordan Petrov
 * @version 1.0.0.0
 * @since 03/08/2020
 */
public class Main {


    /**
     * The Main method.
     *
     * <h1>The Strategy pattern</h1>
     * <p>The strategy pattern defines a family of algorithms
     * ,encapsulates each one ,and makes them interchangeable.
     * Strategy lets the algorithm vary independently from clients that use it.</p>
     *
     * @param args variable arguments.
     */
    public static void main(String[] args) {


        //Demonstration of the Strategy design pattern.

        RubberDuck rubberDuck = new RubberDuck("DuckTest");
        rubberDuck.performQuack();
        rubberDuck.setQuackBehavior(new QuackBehaviorSqueakImpl());
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.setFlyBehavior(new FlyRocketPoweredImpl());
        rubberDuck.performFly();
    }
}
