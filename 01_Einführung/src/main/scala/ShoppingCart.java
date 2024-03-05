package org.jetbrains.scala;

import java.util.ArrayList;


public class ShoppingCart {

    private ArrayList<String> shoppingCartItems = new ArrayList();
    private boolean bookAdded;


    public void addBook (String item) {
        shoppingCartItems.add(item);
        if(item.equalsIgnoreCase("book")){
            bookAdded = true;
        }

    }

    public void removeBook (String item) {
        shoppingCartItems.remove(item);
        if(item.equalsIgnoreCase("book")){
            bookAdded = false;
        }
    }

    public ArrayList<String> getBook (){
        return shoppingCartItems;
    }

    public boolean hasBook (){
        return bookAdded;
    }

    public double calculateDiscount (){
        if(bookAdded) {
            return 0.5;
        }else{
               return 0.0;
            }


    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBook("book");
        shoppingCart.addBook("shoes");
        shoppingCart.removeBook("shoes");
        System.out.println("This the cart have any books: " + shoppingCart.hasBook());
        System.out.println("What is the discount: " + shoppingCart.calculateDiscount());


    }


}
