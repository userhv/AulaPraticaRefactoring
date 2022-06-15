import java.util.Enumeration;

public class TextStatement extends Statement {

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getPrologue(aCustomer);
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
       result += getFigures(each);
    }
    result += getEpilogue(aCustomer);
    return result;
  }
  private String getPrologue(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  private String getFigures(Rental aRental) {
    return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
  }

  private String getEpilogue(Customer aCustomer) {
    return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
           "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
           " frequent renter points";
  }
}