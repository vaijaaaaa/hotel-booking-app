package trainbookingapp.trainbookingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotel {

  @Id
  private String hotel_number;

  private String hotel_name;
  private String location;
  private String date;
  private String time;

  public String getHotelNumber() {
    return hotel_number;
  }

  public void setHotelNumber(String hotelNumber) {
    this.hotel_number = hotelNumber;
  }

  public String getHotelName() {
    return hotel_name;
  }

  public void setHotelName(String hotelName) {
    this.hotel_name = hotelName;
  }


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  // TODO : these String can be parsed into Date using SimpleDateFormat

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
