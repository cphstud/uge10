public class MainTestAccount {
  public static void main(String[] args) {
    boolean retVal = true;
    AccountImproved macc = new AccountImproved("Kurt","Odense","Denmark");
    retVal = macc.setCreditCardNo(4904344348439820L);
    if (retVal) {
      System.out.println("CreditCard added ");
    } else {
      System.out.println("CreditCard not added ");
    }
    retVal = macc.setCreditCardNo(4737470823565213L);
    if (retVal) {
      System.out.println("CreditCard added ");
    } else {
      System.out.println("CreditCard not added ");
    }
  }

}
