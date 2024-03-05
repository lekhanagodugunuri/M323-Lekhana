package org.jetbrains.scala

import java.util


object ShoppingCartFunctional {
  def getDiscountPercentage(items: util.List[String]): Double = {
    val hasBook = items.stream.anyMatch((item: String) => item.equalsIgnoreCase("book"))
    if (hasBook) 0.05
    else 0.0
  }

  def main(args: Array[String]): Unit = {
    val cartWithBook = util.List.of("book", "shoes")
    val cartWithoutBook = util.List.of("shoes", "hat")
    System.out.println("Discount for cart with book: " + getDiscountPercentage(cartWithBook))
    System.out.println("Discount for cart without book: " + getDiscountPercentage(cartWithoutBook))

  }
}
