package models.entity;

/**
 * Class for  Animal.
 *
 * @author Yordan Petrov
 */
public class Animal {

    /**
     *
     */
    String name;

    /**
     * @param name
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
