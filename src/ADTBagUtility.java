import java.io.*;
import java.util.Scanner;

/**
 * Utiltity class to test ADT BAg
 */
public class ADTBagUtility
{

  /**
   * fills the bag from file
   *
   * @param bag input bag
   * @return populated bag
   */
  public static ADTBagImpl fillBagFromFile(ADTBagImpl bag)
  {
    Scanner scanner = null;
    try
    {
      scanner = new Scanner(new File(System.getProperty("user.dir") + "/data.txt"));
    }
    catch (FileNotFoundException e)
    {
      throw new RuntimeException("File not Found");
    }
    Object insertItems[] = scanner.nextLine().split(",");
    for (int i = 0; i < insertItems.length; i++)
    {
      bag.bagItems[i] = insertItems[i];
    }
    bag.bagSize = insertItems.length;
    return bag;
  }

  /**
   * displays the bag
   *
   * @param bag input bag to display
   */
  public static void displayBag(ADTBagImpl bag)
  {
    System.out.println("Items in bag are  : ");
    for (int i = 0; i < bag.bagSize; i++)
    {
      System.out.println(bag.bagItems[i]);
    }
  }

  /**
   * applies operations and displays bag
   *
   * @param bag bag to display
   * @return
   */
  public static ADTBagImpl applyOperations(ADTBagImpl bag)
  {
    System.out.println("Checking if Bag is Full");
    if (bag.isFull())
    {
      System.out.println("Bag is Full");
    }
    else
    {
      System.out.println("Bag is Not Full");
    }

    System.out.println("Inserting apple and 6 to bag");
    bag.insert("apple");
    bag.insert(6);
    System.out.println("Updated bag Items");
    displayBag(bag);

    System.out.println("Removing last element");
    bag.removeLast();
    System.out.println("Updated bag Items");
    displayBag(bag);

    System.out.println("Removing random element");
    bag.removeRandom();
    System.out.println("Updated bag Items");
    displayBag(bag);

    System.out.println("Getting apple from bag");
    Object appleElement = bag.get("apple");
    System.out.println("Fetched element is");
    System.out.println(appleElement.toString());

    System.out.println("Size of bag is ");
    System.out.println(bag.size());

    System.out.println("Element at index 1 is ");
    Object element = bag.index(1);
    System.out.println(element.toString());

    System.out.println("Emptying the bag ");
    bag.makeEmpty();
    System.out.println("Updated bag Items");
    displayBag(bag);

    return bag;
  }

  /**
   * starts the testing
   */
  public static void start()
  {
    System.out.println("Creating Empty Bag and Reading Data from file");

    ADTBagImpl bag = new ADTBagImpl();

    System.out.println("Checking if bag is empty");

    if (bag.isEmpty())
    {
      System.out.println("YEs, Bag is empty");
    }
    else
    {

      System.out.println("YEs, Bag is not empty");
    }

    bag = fillBagFromFile(bag);

    System.out.println("Displaying created bag");
    displayBag(bag);

    System.out.println("Applying bag operations");

    bag = applyOperations(bag);

  }

}

