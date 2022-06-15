public abstract class Price {
  public abstract int getPriceCode();
  public abstract double getCharge(int daysRented);
  public int getFrequentRenterPoints(int daysRented) {
      //Adicionar o trecho de código extraído.
    if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) 
      return 2;
    return 1;
   }
}