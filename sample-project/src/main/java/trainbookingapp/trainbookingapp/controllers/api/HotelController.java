package trainbookingapp.trainbookingapp.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.Response;
import trainbookingapp.trainbookingapp.entity.Hotel;
import trainbookingapp.trainbookingapp.repository.HotelRepository;

@RestController
@RequestMapping("/api")
public class HotelController {

  @Autowired
  private HotelRepository hotelRepository;

  // QUERY
  // http://localhost:8080/api/create-train?trainName=dusky_train&trainNumber=212&source=patna&destination=bangalore&date=17-07-2024&time=23:41
  @GetMapping("/create-hotel")
  public Response createTrain(@ModelAttribute Hotel hotel) {
    hotelRepository.save(hotel);
    Response response = new Response();
    response.message = "hotel Created Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/edit-hotel")
  public Response editTrain(@ModelAttribute Hotel hotel) {
    String trainId = hotel.getHotelNumber();

    if (hotelRepository.existsById(trainId)) {
      Hotel existingTrain = hotelRepository.findById(trainId).get();
      if (hotel.getHotelName() != null) {
        existingTrain.setHotelName(hotel.getHotelName());
      }
      // if (train.getSource() != null) {
      // existingTrain.setSource(train.getSource());
      // }
      if (hotel.getLocation() != null) {
        existingTrain.setLocation(hotel.getLocation());
      }
      if (hotel.getDate() != null) {
        existingTrain.setDate(hotel.getDate());
      }
      if (hotel.getTime() != null) {
        existingTrain.setTime(hotel.getTime());
      }

      hotelRepository.save(existingTrain);
      Response response = new Response();
      response.message = "hotel Edited Successfully";
      response.status = 200;
      return response;
    } else {
      Response response = new Response();
      response.message = "hotel Not Found";
      response.status = 404;
      return response;
    }
  }

  // QUERY
  // http://localhost:8080/api/delete-train?trainId=212
  @GetMapping("/delete-hotel")
  public Response deleteTrain(@RequestParam String hotelId) {
    hotelRepository.deleteById(hotelId);
    Response response = new Response();
    response.message = "hotel Deleted Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/all-hotels")
  public Iterable<Hotel> allTrains() {
    return hotelRepository.findAll();
  }

  @GetMapping("/search-hotel-by-id")
  public Hotel searchTrainById(@RequestParam String hotelId) {
    return hotelRepository.findById(hotelId).get();
  }

  @GetMapping("/search-hotel")
  public Iterable<Hotel> searchTicket(
      @RequestParam String location,
      @RequestParam String date) {
    // return trainRepository.findAll();
    return hotelRepository.findAllByLocationAndDate(

        location,
        date);
  }
}
