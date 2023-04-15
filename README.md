"# HouseRentalSystem-using-JAVA" 
1.PROBLEM STATEMENT:
          The House Rental management system is to search a rented house and provides the admin a convenient and flexible way of updating the house details.
2. OUTCOMES AND OBJECTIVES:
          The main objectives of this project are
                  •	To display the list of available rental house in the city.
                  •	To select the desired house from the displayed list.
                  •	To pay rent and report issue using the application.
          The outcomes of the project are
                  •	Prices of selected rental house is displayed.
                  •	Booking rental house
                  •	Updation of house details
 3.EXSISTING MODEL:
              In the existing model, a person who is looking for a house should search the house in presence by going here and there which takes lot of time to get a house for a rent.
4.PROPOSED MODEL:
             This model eliminates that discomfortness while searching a house, the person who is searching a house can register their individual account, in this model, with the help of that account they can login into the tenant page where they can search the house which suits for them.  Which saves lot of time to search a house for rent.
5.SOFTWARE AND HARDWARE REQUIREMENTS:
            OPERATING SYSTEM: Windows 10
            FRONT END TOOLS: Java swing
            BACK END TOOLS: mySql and java
6.SYSTEM DESIGN:
            The Project has following classes for implementation
                      a)	HouseRent
                      b)	Home
                      c)	AdminLogin
                      d)	AdminInterface
                      e)	TenantDetails
                      f)	Feedback
                      g)	UpdateDetails
                      h)	SignUp
                      i)	TenantLogin
                      j)	TenantInterface
                      k)	House
                      l)	Agreement
                      m)	ReportIssue
                      n)	PayRent
                      o)	RentalSystem
7.DTABASE DESIGN:
            TABLE STRUCTURE
                  TABLE NAME: admin
                  SI.NO	FIELD NAME	DATATYPE	  DESCRIPTION
                  1	    Username	  Varchar(20)	username
                  2   	Password	  Vrchar(20)	password
                  
            TABLE NAME: Tenant
                  SI.NO	FIELD NAME	DATATYPE	    DESCRIPTION
                  1	    Username	  Varchar(20)	  Username
                  2	    Password	  varchar(20)	  Password
                  3	    Email	      Varchar(50)	  Email
                  4	    Phone	      Varchar(15)	  Phone
                  5	    Date	      Varchar(20)	  Date
     
            TABLE NAME: Tenant Details
                  SI.NO	  FIELD NAME	DATATYPE	    DESCRIPTION
                  1	      Name	      Varchar(20)  	Describes the name of the tenant
                  2	      Area	      varchar(50)	  Describes the area in which the rental house is available
                  3	      Rooms	      Varchar(10)	  Describe the number of rooms in the house
                  4	      House	      Varchar(15)	  Describes the name of the rental house
                  5	      People	    Varchar(10)	  Describes the number of people in the selected house
                  6	      Paid	      Varchar(10)	  Describes whether the tenant has paid the rent or not


            TABLE NAME: House Details
                  SI.NO	FIELD NAME	DATATYPE	DESCRIPTION
                  1	Area	Varchar(20)	Describes the area in which the rental house is available
                  2	Id	varchar(10)	Describes the ID of the house.
                  3	Housename	Varchar(20)	Describes the name of the rental house
                  4	Rooms	Varchar(10)	Describes the number of rooms
                  5	Booked	Varchar(10)	Describes whether the room has been booked or not.

             TABLE NAME: Issue
                  SI.NO	FIELD NAME	DATATYPE	DESCRIPTION
                  1	Name	Varchar(20)	Describe the name of the tenant
                  2	Email	varchar(30)	Describes the email of the tenant
                  3	Issue	Varchar(500)	Describes the issue faced by the tenant

             TABLE NAME: rent		
                  SI.NO	FIELD NAME	DATATYPE	DESCRIPTION
                  1	Name	Varchar(20)	Describes the name of the tenant
                  2	Credit card	varchar(20)	Describes the credit card number of the tenant
                  3	Amount	Varchar(10)	Describes the amount to be paid for the rent
                  4	Date	Varchar(20)	Describes the amount to be paid for the rent


                      
                   


