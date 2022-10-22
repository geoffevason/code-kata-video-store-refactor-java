package movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

  private String name;
  private List<Rental> rentals = new ArrayList<Rental>();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String textStatement() {
    double amt = 0;
    int pnts = 0;
    String result = "Rental Record for " + getName() + "\n";

    for (Rental each : rentals) {
      double thisAmt = 0;

      //determine amounts for each line
      switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
          thisAmt += 2;
          if (each.getDaysRented() > 2) {
            thisAmt += (each.getDaysRented() - 2) * 1.5;
          }
          break;
        case Movie.NEW_RELEASE:
          thisAmt += each.getDaysRented() * 3;
          break;
        case Movie.CHILDRENS:
          thisAmt += 1.5;
          if (each.getDaysRented() > 3) {
            thisAmt += (each.getDaysRented() - 3) * 1.5;
          }
          break;
      }

      // add frequent renter points, with bonus for a two day new release rental
      if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
        pnts += 2;
      } else {
        pnts++;
      }

      // show figures for this rental
      result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmt) + "\n";
      amt += thisAmt;
    }

    // add footer lines
    result += "Amount owed is " + String.valueOf(amt) + "\n";
    result += "You earned " + String.valueOf(pnts) + " frequent renter points";

    return result;
  }

  public String htmlStatement() {
    return "";
  }

}
