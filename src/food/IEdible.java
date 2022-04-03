package food;

/**
 * Interface IEdible, describes objects that can be eaten
 */
public interface IEdible {

    /**
     * @return the food type of the edible object which activates the method
     */
    public EFoodType getFoodtype();
}
