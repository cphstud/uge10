import java.time.LocalDateTime;
/*

   Vælger Card_Number, Name, City, Country og Account_Created som instansvariabler til klassen Account
   Vælger at se bort fra det specifikke timestamp-format og lader java's LocalDateTime-bibliotek klare det

   Transaction_date,Product,Price,Payment_Type,Card_Number,Name,City,State,Country,Account_Created,Last_Login,Latitude,Longitude
   1/4/09 13:17,Product1,1200,Mastercard,5287379262968457,Renee Elisabeth,Tel Aviv,Tel Aviv,Israel,1/4/09 13:03,1/4/09 22:10,32.0666667,34.7666667

*/

public class AccountImproved {
  long cardNumber;
  String name;
  String city;
  String country;
  LocalDateTime account_Created_LDT;

  public AccountImproved(String name, String city,  String country) {
    this.name = name;
    this.city = city;
    this.country = country;
    this.account_Created_LDT = LocalDateTime.now();
  }

  public boolean setCreditCardNo(long creditCardNo) {
    boolean retVal = false;
    if (doLuhn(creditCardNo)) {
      this.cardNumber = creditCardNo;
      retVal = true;
    }
    return retVal;
  }

  public long getCreditCardNo() {
    return this.cardNumber;
  }

  public boolean doLuhn(long creditCardNo) {
    //5287379262968457
    //bruger i%2 til at tage hverandet tal
    
    String tmpString = Long.toString(creditCardNo);
    long tmpSum = 0;
    long rest = 0;
    long digit = 10;
    long tmpNumber = creditCardNo;
    boolean retVal = false;

    for (int i=tmpString.length();i>=0; i--) {

      if(tmpNumber>0) {
        digit=tmpNumber%10; //5287379262968457 digit=7
        tmpNumber=tmpNumber/10; // resten - 528737926296845 - gemmes så det bliver det næste tal

        if (i%2==0) {
          tmpSum = tmpSum+digit;
        } else {
          digit = 2*digit;
          if (digit > 9) {
            // vi tager tværsummen hvis tallet er på to cifre
            digit = digit%10+digit/10;
          }
          tmpSum = tmpSum+digit;
        }
      }
    }
    if (tmpSum%10==0) {
      retVal = true;
    }
    return retVal;
  }

  public String getAccountCreated() {
    // Det er ok at returnere et "grimt" timestamp som f.eks 2020-03-05T10:50:44.378551
    String retValDate = account_Created_LDT.toString();
    return retValDate;
  }
}
