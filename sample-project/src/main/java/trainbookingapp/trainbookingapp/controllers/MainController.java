package trainbookingapp.trainbookingapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String mainPage() {
    return "main-page.html";
  }

  @GetMapping("/admin-login")
  public String adminLoginPage() {
    return "admin-login-page.html";
  }

  @GetMapping("/admin-register")
  public String adminRegisterPage() {
    return "admin-register-page.html";
  }

  @GetMapping("/book-room")
  public String bookTicketPage() {
    return "book-room-page.html";
  }

  @GetMapping("/cancel-room")
  public String cancelTicketPage() {
    return "cancel-room-page.html";
  }

  @GetMapping("/create-hotel")
  public String createTrainPage() {
    return "create-hotel-page.html";
  }

  @GetMapping("/delete-hotel")
  public String deleteTrainPage() {
    return "delete-hotel-page.html";
  }

  @GetMapping("/edit-hotel")
  public String editTrainPage() {
    return "edit-hotel-page.html";
  }

  @GetMapping("/forgot-password")
  public String forgotPasswordPage() {
    return "forgot-password-page.html";
  }

  @GetMapping("/admin-forgot-password")
  public String forgotadminPasswordPage() {
    return "forgot-admin-password-page.html";
  }

  @GetMapping("/visitors-details")
  public String passangerDetailsPage() {
    return "visitors-details-page.html";
  }

  @GetMapping("/payment")
  public String paymentPage() {
    return "payment-page.html";
  }

  @GetMapping("/reset-password")
  public String resetPasswordPage() {
    return "reset-password-page.html";
  }

  @GetMapping("/reset-admin-password")
  public String resetadminPasswordPage() {
    return "reset-admin-password-page.html";
  }

  @GetMapping("/search-booked-room-details")
  public String searchBookTicketDetailsPage() {
    return "search-booked-room-details-page.html";
  }

  @GetMapping("/search-hotel")
  public String ticketSearchPage() {
    return "search-hotel.html";
  }

  @GetMapping("/user-dashboard")
  public String userDashboardPage() {
    return "user-dashboard-page.html";
  }

  @GetMapping("/user-login")
  public String userLoginPage() {
    return "user-login-page.html";
  }

  @GetMapping("/user-register")
  public String userRegisterPage() {
    return "user-register-page.html";
  }

  @GetMapping("/view-booked-detail")
  public String viewBookedDetailPage() {
    return "view-booked-detail-page.html";
  }

  @GetMapping("/view-booked-room")
  public String viewBookedTicketPage() {
    return "view-booked-room-page.html";
  }

  @GetMapping("/admin-dashboard")
  public String adminDasboard() {
    return "admin-dashboard-page.html";
  }
}
