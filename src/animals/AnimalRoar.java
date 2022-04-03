package animals;

import mobility.Point;

/**
 * AnimalRoar is an abstract class representing animals that can roar.
 * it is an Animal descendant.
 * @see Animal
 */
public abstract class AnimalRoar extends Animal {

    /**
     * AnimalRoar constructor
     * passing values from descendant to Animal
     * @see Animal
     * @param name String representation of the animal.
     * @param location Point coordinates of the current location of an animal.
     */
    public AnimalRoar(String name, Point location) {
        super(name, location);
    }

    /**
     * abstract method, need to be implemented in AnimalRoar descendants.
     */
    public abstract void roar();

    /**
     * makeSound activates the roar method.
     */
    @Override
    public void makeSound() {
        roar();
    }

    /**
     * equals of AnimalRoar object.
     * @param o the object to check equality.
     * @return boolean value if the objects are equal or not.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }


    /**
     * toString of AnimalRoar object.
     * @see Animal toString() method.
     * @return String representation of the AnimalRoar object.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
