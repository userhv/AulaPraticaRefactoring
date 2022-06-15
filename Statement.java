import java.util.Enumeration;

public abstract class Statement {
    protected abstract String getPrologue(Customer aCustomer);
    protected abstract String getFigures(Rental aRental);
    protected abstract String getEpilogue(Customer aCustomer);

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
}