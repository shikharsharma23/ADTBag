import java.util.Random;

/**
 * Implementation of ADTBag Class
 */
public class ADTBagImpl implements ADTBag
{

  Object bagItems[] = new Object[100]; // stores the bag items in an array of objects

  int bagSize = 0;

  /**
   * Function to remove element from an array at specific index
   * @param arr : input array
   * @param index : element index to be remvoed
   * @return updated array
   */
  public Object[] removeTheElement(Object[] arr,
          int index)
  {

    // If the array is empty
    // or the index is not in array range
    // return the original array
    if (arr == null
            || index < 0
            || index >= arr.length)
    {

      return arr;
    }

    // Create another array of size one less
    Object[] anotherArray = new Object[arr.length - 1];

    // Copy the elements except the index
    // from original array to the other array
    for (int i = 0, k = 0; i < arr.length; i++)
    {

      // if the index is
      // the removal element index
      if (i == index)
      {
        continue;
      }

      // if the index is not
      // the removal element index
      anotherArray[k++] = arr[i];
    }

    // return the resultant array
    return anotherArray;
  }

  /**
   * Inserts an item to the bag
   * @param item : Object to be inserted
   */
  public void insert(Object item)
  {
    try
    {
      bagItems[this.bagSize] = item;
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      throw new RuntimeException("Bag if Full");
    }
    this.bagSize = this.bagSize + 1;
  }

  /**
   * removes teh last element from bag
   */
  public void removeLast()
  {
    try
    {
      bagItems[bagSize - 1] = 0;
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      throw new RuntimeException("Bag is Empty");
    }
    this.bagSize = this.bagSize - 1;
  }

  /**
   * removes random element from the bag
   */
  public void removeRandom()
  {
    Random r = new Random();
    int min = 0;
    int max = this.bagSize - 1;
    int indexToDelete = r.nextInt(((max - min) + 1) + min);
    this.bagItems = removeTheElement(this.bagItems, indexToDelete);

  }

  /**
   * gets an item from the bag
   * @param item item to be fetched
   * @return retrieved item
   */
  public Object get(Object item)
  {
    for (int i = 0; i < this.bagItems.length; i++)
    {
      if (bagItems[i] == item)
      {
        return item;
      }
    }
    return -1;
  }

  /**
   * gets element at a specific index of the bag
   * @param index index from which the elemnet must be returned
   * @return retrieved item
   */
  public Object index(int index)
  {
    try
    {
      return this.bagItems[index];
    }
    catch (IndexOutOfBoundsException e)
    {
      throw new RuntimeException("Index is out of range");
    }
  }

  /**
   * Gets the size of the bag
   * @return size of the bag
   */
  public int size()
  {
    return bagSize;
  }

  /**
   * checks if bag is full
   * @return true if bag is full
   */
  public boolean isFull()
  {
    if (this.bagSize == 100)
      return true;
    else
      return false;
  }

  /**
   * checks if bag is empty
   * @return true if bag is empty
   */
  public boolean isEmpty()
  {
    if (this.bagSize == 0)
      return true;
    else
      return false;
  }

  /**
   * empties the bag
   */
  public void makeEmpty()
  {
    for (int i = 0; i < this.bagSize; i++)
    {
      this.bagItems[i] = 0;
    }

    this.bagSize = 0;

  }

}
