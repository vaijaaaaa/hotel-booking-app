package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {

  @Id
  String pnr;

  String hotel_id;
  String method;
  int amount;
  String email;
  String visitor_mobile_number;

  public String getPnr() {
    return pnr;
  }

  public void setPnr(String pnr) {
    this.pnr = pnr;
  }

  public String getHotelId() {
    return hotel_id;
  }

  public void setHotelId(String hotel_id) {
    this.hotel_id = hotel_id;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getVisitorMobileNumber() {
    return visitor_mobile_number;
  }

  public void setVisitorMobileNumber(String visitor_mobile_number) {
    this.visitor_mobile_number= visitor_mobile_number;
  }
}
