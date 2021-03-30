package equality;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  int primaryKey;

  public Customer(int primaryKey) {
    this.primaryKey = primaryKey;
  }

  //  public boolean sameAs(Customer other) {
  // NO NO NO, this form is an overLOAD
//  public boolean equals(Customer other) {
  @Override
  public boolean equals(Object other) {
    // instanceof is questionable, read Josh Bloch "effective Java"
    if (other.getClass() == Customer.class) {
      return this.primaryKey == ((Customer)other).primaryKey;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    List<Customer> lc = new ArrayList<>();
    lc.add(new Customer(1));
    System.out.println(lc.contains(new Customer(1)));
  }
}
