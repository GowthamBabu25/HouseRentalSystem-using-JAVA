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

 8.PROJECT FEATURES:
 
             The project is implemented with the following features:
                 1. The tenant button is selected in the home window.
                 2. The look for a house button is clicked and the required area, required rooms and required house are selected and register button is clicked.
                 3. The pay rent button is clicked. Now the name, credit card number and amount are entered and the pay rent button is clicked to pay the rent.
                 4. The report an issue button is clicked. Now the name, email and the issue in the house are sent to the admin when the report button is clicked.
                 5. In the admin interface the update house details button is clicked and the new rental house details like area, rooms and house name are updated.
                 6. The view house details button is selected to view the details of tenants after registration
                 7. The view feedback button is clicked to view the issue faced by the tenants in their respective houses.
9. Screenshots
          
          Intro
          ![1](https://user-images.githubusercontent.com/121682057/232264645-0f43536c-c32d-4e5e-b506-b60a6dca00d6.png)
          
          Home
          ![2](https://user-images.githubusercontent.com/121682057/232264731-33f10e1e-ced0-4158-ba0f-9579d9754d07.png)
          
          Admin Login
          ![adminlogin](https://user-images.githubusercontent.com/121682057/232264780-096f1db7-0412-4ff2-90dd-88ef1ae9aec2.png)
          
          Admin Interface
          ![admininterface](https://user-images.githubusercontent.com/121682057/232264766-ad3b8c56-011c-4ef6-b5b5-83567b34c094.png)
          
          Update House Details
          ![updatehousedetails](https://user-images.githubusercontent.com/121682057/232264795-f8c17663-5506-4a64-b45d-7099077c3dc1.png)

          View Reports
          ![viewreports](https://user-images.githubusercontent.com/121682057/232264809-ed093ad5-1db3-4c48-bee7-e3fb2c3e173c.png)
          
          View Tenant Details
          ![viewtenantdetails](https://user-images.githubusercontent.com/121682057/232264815-2d54cc60-720a-4392-8eff-fe037c27726a.png)
          
          Tenant Login
          ![tenantlogin](https://user-images.githubusercontent.com/121682057/232264830-1aca11a7-a577-4307-813b-17440344a338.png)
          
          Tenant Interface
          ![TenantInterface](https://user-images.githubusercontent.com/121682057/232264845-15eff5c6-ad95-454c-928e-ff3db001dffc.png)
          
          Searching House
          ![bookhouse](https://user-images.githubusercontent.com/121682057/232264874-47986f7b-81ba-4dce-a973-c8ce1bd36e3a.png)
          
          Report Issue
          ![reportissue](https://user-images.githubusercontent.com/121682057/232264908-c9f457ef-005f-4ba9-8a4f-752b5265c2f4.png)

          Pay Rent
          ![payrent](https://user-images.githubusercontent.com/121682057/232264915-657d939f-65b3-4f25-8a19-2c86c0c8e918.png)

          View Agreement
          ![agreement](https://user-images.githubusercontent.com/121682057/232264931-c63cb2e2-1ec2-403e-b0f8-51982daefccc.png)

          SignUp
          ![signup](https://user-images.githubusercontent.com/121682057/232264946-3cb9ef24-75cf-42f7-85d7-fa040fe73f33.png)

9.SUMMARY:
          
          Effectively resolving the house issues is important to the tenant’s long-term future, the House Rental Project will be an important tool for creating rental housing stability by helping tenants speak with greater credibility through initiating and documenting communications and building productive relationships with admins. Finally, the goal of the project is to create a better relationship between tenants and a sellers which can be achieved through this project.



          
