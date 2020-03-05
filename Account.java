import java.time.LocalDateTime;
/*

   Vælger Card_Number, Name, City, Country og Account_Created som instansvariabler til klassen Account
   Vælger at se bort fra det specifikke timestamp-format og lader java's LocalDateTime-bibliotek klare det

  Transaction_date,Product,Price,Payment_Type,Card_Number,Name,City,State,Country,Account_Created,Last_Login,Latitude,Longitude
  1/4/09 13:17,Product1,1200,Mastercard,5287379262968457,Renee Elisabeth,Tel Aviv,Tel Aviv,Israel,1/4/09 13:03,1/4/09 22:10,32.0666667,34.7666667
  
 */

public class Account {
  int cardNumber;
  String name;
  String city;
  String country;
  LocalDateTime account_Created_LDT;

  public Account(String name, String city,  String country) {
    this.name = name;
    this.city = city;
    this.country = country;
    this.account_Created_LDT = LocalDateTime.now();
  }

  public void setCreditCardNo(int creditCardNo) {
    this.cardNumber = creditCardNo;
  }
  public int  getCreditCardNo() {
    return this.cardNumber;
  }

  public String getAccountCreated() {
    // Det er ok at returnere et "grimt" timestamp som f.eks 2020-03-05T10:50:44.378551
    String retValDate = account_Created_LDT.toString();
    return retValDate;
  }
}
