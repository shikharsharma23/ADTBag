/**
 * Interface for the ADT Bag
 */
public interface ADTBag
{

  /**
   * Inserts an element
   *
   * @param item : Object to be inserted
   */
  void insert(Object item);

  /**
   * Removes the last element from the bag
   */
  void removeLast();

  /**
   * removes a random element from the bag
   */
  void removeRandom();

  /**
   * Fetches and item from the bag
   *
   * @param item item to be fetched
   * @return
   */
  Object get(Object item);

  /**
   * Gets items a ta specific index in the bag
   *
   * @param index index from which the elemnet must be returned
   * @return
   */
  Object index(int index);

  /**
   * Returns the size of the bag
   *
   * @return number of elements in the bag
   */
  int size();

  /**
   * checks if bag is full
   *
   * @return boolean true if bag is full else false
   */
  boolean isFull();

  /**
   * checks if bag is empty
   *
   * @return boolean true if bag is empty else false
   */
  boolean isEmpty();

  /**
   * Empties the bag
   */
  void makeEmpty();

}
