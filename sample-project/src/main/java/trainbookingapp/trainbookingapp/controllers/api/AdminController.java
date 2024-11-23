package trainbookingapp.trainbookingapp.controllers.api;

import java.lang.Iterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import trainbookingapp.trainbookingapp.Response;
import trainbookingapp.trainbookingapp.entity.Admin;
import trainbookingapp.trainbookingapp.repository.AdminRepository;

@RestController
@RequestMapping("/api")
public class AdminController {

  @Autowired
  private AdminRepository adminRepository;

  @GetMapping(path = "/admin-login")
  public Response adminLogin(
      @RequestParam String username,
      @RequestParam String password) {
    Iterable<Admin> iterator = adminRepository.findAll();

    for (Admin user : iterator) {
      if (user.getUsername().equals(username) &&
          user.getPassword().equals(password)) {
        Response response = new Response();
        response.message = user.getAadhar();
        response.status = 200;
        return response;
      }
    }
    Response response = new Response();
    response.message = "Username or Password is incorrect";
    response.status = 400;
    return response;
  }

  // QUERY
  // http://localhost:8080/api/register?username=dusklight00&firstName=dusk&lastName=light&email=r.rahul.developer@gmail.com&mobileNumber=999&address=boston&city=bangalore&state=karnataka&password=password&aadhar=999&pincode=123&gender=male
  @GetMapping(path = "/admin-register")
  public Response adminLogin(@ModelAttribute Admin admin) {
    adminRepository.save(admin);
    Response response = new Response();
    response.message = "Registration Successful";
    response.status = 200;
    return response;
  }

  @GetMapping(path = "/get-admin")
  public Admin getAdmin(@RequestParam String aadhar) {
    Admin admin = adminRepository.findByAadhar(aadhar);
    return admin;
  }

  @GetMapping("/change-admin-password")
  public Response changeAdminPassword(
      @RequestParam String email,
      @RequestParam String password) {
    Admin admin = adminRepository.findByEmail(email);
    admin.setPassword(password);
    adminRepository.save(admin);
    Response response = new Response();
    response.message = "Password Changed Successfully";
    response.status = 200;
    return response;
  }

  @GetMapping("/get-admin-by-aadhar")
  public Admin getAdminByAadhar(@RequestParam String aadhar) {
    Admin admin = adminRepository.findByAadhar(aadhar);
    return admin;
  }
}
