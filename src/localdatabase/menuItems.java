package localdatabase;

import java.lang.String;

public class menuItems {

    public static String[] menuAppetizers = new String[]{"App 1", "App 2", "App 3"};
    public static Double[] menuAppCost = new Double[]{5.99, 6.99, 7.99};
    public static String[] menuEntrees = new String[]{"Entree 1", "Entree 2", "Entree 3"};
    public static Double[] menuEntCost = new Double[]{15.99, 16.99, 17.99};
    public static String[] menuDrinks = new String[]{"Drink 1", "Drink 2", "Drink 3"};
    public static Double[] menuDrinkCost = new Double[]{2.99, 1.99, 0.99};
    public static String[] menuPromos = new String[]{"Promo 1", "Promo 2", "Promo 3"};
    public static Double[] menuPromoCost = new Double[]{12.99, 11.99, 10.99};

    public static void ListApp(){
        for(int i = 0; i < menuAppetizers.length; i++){
            System.out.println(menuAppetizers[i] + " cost " + menuAppCost[i]);
        }
    }

    public static void ListEntrees(){
        for(int i = 0; i < menuEntrees.length; i++){
            System.out.println(menuEntrees[i] + " cost " + menuEntCost[i]);
        }
    }

    public static void ListDrinks(){
        for(int i = 0; i < menuDrinks.length; i++){
            System.out.println(menuDrinks[i] + " cost " + menuDrinkCost[i]);
        }
    }

    public static void ListPromos(){
        for(int i = 0; i < menuPromos.length; i++){
            System.out.println(menuPromos[i] + " cost " + menuPromoCost[i]);
        }
    }

    public static void ListMenu(){
        ListApp();
        ListEntrees();
        ListDrinks();
        ListPromos();
    }

}
