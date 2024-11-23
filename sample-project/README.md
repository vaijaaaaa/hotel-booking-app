# Hotel Booking App

This is a simple implementation of a Hotel Booking Application using the following technology stack:

- **Spring Boot**: Backend framework for building RESTful APIs.
- **HTML**: Frontend markup for creating the structure of the web pages.
- **CSS**: Styling the frontend for better user experience.
- **MySQL**: Relational database to store and manage booking details.

## Features

- **Hotel Search**: Search for hotels based on location, dates, and other preferences.
- **Booking Management**: Book rooms, view existing bookings, and cancel them if required.
- **Email Notifications**: Get email updates for booking confirmations and cancellations.
- **User Authentication**: Secure user login and registration for a personalized experience.

## Endpoints Overview

The application includes RESTful API endpoints for managing hotel searches, bookings, and user authentication:

- **`/api/hotels`**: Search for hotels.
- **`/api/bookings`**: Manage room bookings.
- **`/api/users`**: User registration and login.



## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- MySQL

### Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/hotel-booking-app.git
   cd sample-project
   ```

2. **Configure MySQL:**

   - Create a database named `hotel_booking`.
   - Update the `application.properties` file with your MySQL credentials.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/train_booking
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

3. **Build the application:**

   ```bash
   mvn clean install
   ```

4. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

5. **Access the application:**

   - The app will be accessible at `http://localhost:6010`.

## Usage

- **Hotel Search**: Go to the `/hotels` endpoint and enter your destination, check-in, and check-out dates to search for available hotels.
- **Booking Rooms**: Use the `/bookings` endpoint to book rooms at your preferred hotel.
- **Manage Bookings**: View or cancel your existing bookings via the `/bookings` endpoint.
- **User Login**: Register or log in using the `/users` endpoint to securely manage your bookings and profile.


## Contributing

If you would like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

## License

This project is open-source and available under the [MIT License](LICENSE).
