# Taxi-Booking-Service
 a backend for a taxi booking service, similar to Ola or Uber

1. Driver Controller
Handles driver-related operations. Endpoints
POST /driver/add → Add a new driver.

GET /driver/allDrivers → Retrieve all registered drivers.


2. Customer Controller
Manages customer-related functionalities.

POST /customer/add → Add a new customer.

GET /customer/get/{customerId} → Fetch a customer's details using their unique ID.

GET /customer/get-customer-ageLesser-gender → Get customers below a certain age and matching a gender filter.

GET /customer/get-customer-ageGreater-gender → Fetch customers above a certain age with a specific gender.

GET /customer/get-by-gender-age → Retrieve customers based on both gender and age criteria.


3. Cab Controller
Handles cab registration.

POST /cab/regiser-cab → Register a new taxi in the system.



4. Booking Controller
Manages taxi booking requests.

POST /booking/book-cab → Book a cab for a customer.
