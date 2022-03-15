# Movie Ticket Booking Challenge 
##Walmart

# Walmart Ticket Booking

Walmart homework assignment to design and implement an algorithm for assigning
seats in a movie theatre to fulfill the reservation request and write a seat assignment
program to maximize both customer satisfaction and customer safety. 
For the purpose of public safety, assuming that a buffer of three seats and/or one row is required.

## Assumptions:
1. The seats will be allotted in the order in which reservations are present in the input file.
   It will be processed in First come, first served basis.
2. The reservation number will be in sequential(R001, R002...) in the input file.
3. Seats will be allotted from the top row(J) for a better viewing appearance.
4. If seats are available in any of the top rows, then, they will be allotted first while keeping in mind the public safety during COVID restrictions.
5. Breaking up a large party during a reservation is not possible since in these unprecedented times, it may not be comfortable for the customers. Therefore, if seats are not available in a single row, then, their reservation will not be accepted automatically by the application. They can then take it offline 
   and discuss the placement.
6. The maximum number of seats in a person can book in a single reservation is 20. Reservations larger than that will be
   taken offline and discussed with the customers.
7. To avoid very large gathering at one particular section, alternate rows have already been marked as unavailable before reservations are even accepted. This has been implemented keeping in mind the government guidelines and safety rules.
8. In case the same reservation ID occurs multiple times, it is read as one reservation. The number of people is the total number of people given for each duplicate reservation.

## Customer Satisfaction:
1. Since customers will be booking the seats for groups, they would prefer to watch a movie by sitting together rather than spreading out, 
   so the first priority will be to allocate seats for a group in a single row.

## Public Safety:
1. During the Covid pandemic, Theatres are instructed to follow a social distancing protocol to keep distance between the crowd.
2. To ensure the safety we will be keeping every alternate row in a movie theatre unoccupied
3. Also, we will be keeping a gap of 3 customers for every reservation.
## Solution

### Classes
1. TheatreScreen: Stores the information about the screen such as the occupancy, dimensions and the seating arrangement.
2. TheatreService: Implements methods to create reservations, showReservations and storeReservations in a file.
3. Reservation: Stores the information of each reservation such as the ID, seats or errorMessage if any.
4. Main: The driver class which reads from the input file, creates the necessary objects and calls the relevant functions.

### Steps to run the program
Running the Main program will read the input from Input.txt and output the directory and filename of the output file.
We have specified the input file and the name of the output file in the main program already.

The commands to run from the terminal are as follows:
``` 
javac Main.java
java Main <full-path to the Input file>
```
For example:
``` 
javac Main.java
java Main /Users/akshay/Desktop/WalmartTicketBooking/Input.txt
```
### Output
* Prints the reservation ID and the seat alloted to each reservation in the order in which the reservations were received.

* In case the reservation was not accepted, the ID of the reservation and the reason for not accepted it will be printed.

* The directory and the filename of the output will also be printed.

For example:
```
R001 J1, J2
R002 H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20
R003 J6, J7, J8, J9, J10, J11, J12, J13, J14, J15, J16, J17
R004 F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13
R005 D1, D2, D3, D4, D5, D6, D7, D8, D9
R006 F17, F18, F19, F20
R007 B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20
R008 D13, D14, D15, D16, D17, D18, D19, D20
R009 Cannot Accept Reservation. Not enough seats in a single row.
R010 Cannot accept reservation. Large number of people in reservation.
Directory: /Users/akshay/Desktop/WalmartTicketBooking/output.txt
```

## Running the tests
The Unit tests are written for the following method implementation

1. Theatre Service Test 
   1. TestBookSeats: Validates if user is able to book the seats based on the given parameter. 
   2. NegativeCount: Throws an exception if invalid number of people try to book seats. 
   3. MaxNumberOfPeople: Checks if a large number are people are booking in a single reservation. 
   4. HouseFull: Checks if the theatre is completely filled


2. Theatre Screen Test 
   1. GetSeatGap: Checks if valid seat gap is given between each reservation 
   2. GetOccupancy: Checks the current occupancy of the screen 
   3. GetSeatingArrangement: Checks the seating arrangement size


3. Reservation Test 
   1. GetID: checks if the returned reservation ID is valid 
   2. GetNoOfPeople: Checks the number of people for a given reservation Id 
   3. GetErrorMessage: Checks if valid error message is thrown

