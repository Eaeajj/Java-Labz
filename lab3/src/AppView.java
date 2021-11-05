public class AppView {
  public static void printMenu(){
    System.out.print("\033[H\033[2J");
    System.out.println(
      "1. Print database\n" +
      "2. Write to database\n" +
      "3. Add cocktail\n" +
      "4. Quit"
      );
    System.out.print("Your input: ");
  }

  public static void cocktailMenu() {
    System.out.print("\033[H\033[2J");
    System.out.println(
      "Choose between cocktails: \n" + 
      "1. White Russian\n" +
      "2. Iced Vodka"
      );
      System.out.print("Your input: ");
  }

public static void func() {
  System.out.print("\033[H\033[2J");
  System.out.println(
      "1. Do it manually\n" +
      "2. Make default automatically"
      );
      System.out.print("Your input: ");
}

  public static void ingredientMenu() {
    System.out.print("\033[H\033[2J");
    System.out.println(
      "1. Ice\n" +
      "2. Liquor\n" +
      "3. Milk Cream\n" +
      "4. Vodka\n"
      );
      System.out.print("Your input: ");
  }

  public static void actionMenu() {
    System.out.print("\033[H\033[2J");
    System.out.println(
      "1. POUR\n" +
      "2. STIR\n" +
      "3. SHAKE\n" +
      "4. ADD"
      );
      System.out.print("Your input: ");
  }

  public static void characteristics() {
    System.out.print("\033[H\033[2J");
    System.out.print(
      "Input ingredient characteristics: "
      );
    }

  public static void volume() {
    System.out.print(
      "\nInput volume: "
    );
  }

  public static void abv() {
    System.out.print(
      "\nInput alcohol by volume: "
    );
  }

}
