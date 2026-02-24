class HotelRunner
{
	public static void main(String[] agrs)
	{
		String[] itemName={"Paneer Butter Masala","Chicken Biryani","Veg Biryani","Masala Dosa","Idli Sambar",
		"Butter Naan","Tandoori Chicken","Palak Paneer","Dal Tadka","Chole Bhature","Vegetable Pulao","Mutton Rogan Josh",
		"Samosa","Veg Manchurian","Chicken Fried Rice","Veg Fried Rice","Hakka Noodles","Chicken Manchow Soup",
		"Tomato Soup","French Fries","Veg Sandwich","Club Sandwich","Chicken Burger","Veg Burger","Pasta Alfredo",
		"Pasta Arrabiata","Margherita Pizza","Farmhouse Pizza","Caesar Salad","Grilled Chicken","Chicken Shawarma",
		"Spring Rolls","Ice Cream Sundae","Gulab Jamun"};
		
		int[] quantity = {2,1,1,3,4,5,1,2,2,1,1,1,1,6,2,2,1,1,2,3,4,2,1,2,1,1,1,1,1,1,2,2,3,4,5};
		
		boolean[] parcel = {false,true,true,false,false,true,true,false,false,true,false,true,true,true,false,false,
		true,false,true,false,true,false,true,true,false,false,false,true,false,true,false,true,true,true,false};
		
		for(int i=0;i<itemName.length;i++)
		{
			Hotel.order(itemName[i],quantity[i],parcel[i]);
		}
		
		System.out.println();
		System.out.println();
		
		int tax[]={12000,13000,5000,6000,8000};
		
		int age[]={34,33,32,31,30};
		
		String address[]={"BTM Layout","Jayanagar","BasavanaGudi","WhiteField","Nagasandra"};
		
		for(int j=0;j<tax.length;j++)
		{
			Hotel.ownerInfo(tax[j],age[j],address[j]);
		}
		
		System.out.println();
		System.out.println();
		
		String[] type = {"Owner","Manager","Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter","Waitress",
		"Cleaner","Housekeeping","Receptionist","Cashier","Store Keeper","Supervisor","Security","Helper",
		"Manager","Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter","Waitress","Cleaner",
		"Housekeeping","Receptionist","Cashier","Store Keeper","Supervisor","Security","Helper","Manager",
		"Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter","Waitress","Cleaner","Housekeeping",
		"Receptionist","Cashier","Store Keeper","Supervisor","Security","Helper","Manager","Assistant Manager",
		"Chef","Assistant Chef","Head Cook","Waiter","Waitress","Cleaner","Housekeeping","Receptionist","Cashier",
		"Store Keeper","Supervisor","Security","Helper","Manager","Assistant Manager","Chef","Assistant Chef",
		"Head Cook","Waiter","Waitress","Cleaner","Housekeeping","Receptionist","Cashier","Store Keeper",
		"Supervisor","Security","Helper","Manager","Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter",
		"Waitress","Cleaner","Housekeeping","Receptionist","Cashier","Store Keeper","Supervisor","Security",
		"Helper","Manager","Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter","Waitress","Cleaner",
		"Housekeeping","Receptionist","Cashier","Store Keeper","Supervisor","Security","Helper","Manager",
		"Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter","Waitress","Cleaner","Housekeeping","Receptionist",
		"Cashier","Store Keeper","Supervisor","Security","Helper","Manager","Assistant Manager","Chef",
		"Assistant Chef","Head Cook","Waiter","Waitress","Cleaner","Housekeeping","Receptionist","Cashier","Store Keeper",
		"Supervisor","Security","Helper","Manager","Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter",
		"Waitress","Cleaner","Housekeeping","Receptionist","Cashier","Store Keeper","Supervisor","Security",
		"Helper","Manager","Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter","Waitress",
		"Cleaner","Housekeeping","Receptionist","Cashier","Store Keeper","Supervisor","Security","Helper",
		"Manager","Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter","Waitress","Cleaner",
		"Housekeeping","Receptionist","Cashier","Store Keeper","Supervisor","Security","Helper",
		"Manager","Assistant Manager","Chef","Assistant Chef","Head Cook","Waiter","Waitress",
		"Cleaner","Housekeeping","Receptionist","Cashier","Store Keeper","Supervisor","Security","Helper",
		"Manager","Assistant Manager","Chef","Assistant Chef","Head Cook"};
		
		String[] name = {"Adhya","Arun","Varun","Kiran","Rohit","Rahul","Suresh","Ramesh","Mahesh","Ganesh","Dinesh",
		"Lokesh","Naresh","Mukesh","Rajesh","Prakash","Vijay","Ajay","Sanjay","Anil","Sunil",
		"Anita","Sunita","Kavya","Divya","Pooja","Priya","Asha","Latha","Geetha","Suma",
		"Shilpa","Deepa","Manasa","Nandini","Ananya","Aishwarya","Sowmya","Shruthi","Harshitha","Bhavya",
		"Manoj","Vinod","Naveen","Deepak","Amit","Sumit","Pankaj","Ashok","Harish","Ravi",
		"Tejas","Nikhil","Abhishek","Akash","Shreyas","Karthik","Siddharth","Aditya","Arjun","Krishna",
		"Rashmi","Megha","Sneha","Chaitra","Pavithra","Vidya","Keerthi","Lavanya","Namrata","Swathi",
		"Sandhya","Anjali","Neha","Ritu","Pallavi","Aparna","Vaishnavi","Sharmila","Preethi","Roopa",
		"Vishal","Sandeep","Sachin","Yash","Darshan","Rohan","Pranav","Atharva","Omkar","Swapnil",
		"Bhavesh","Hardik","Jayesh","Hitesh","Paresh","Umesh","Kunal","Tushar","Chirag","Keyur",
		"Sanjana","Kiranmayi","Amruta","Shreya","Ishita","Riya","Diya","Tanvi","Madhuri","Archana",
		"Sudha","Nalini","Hemalatha","Padma","Indira","Uma","Radha","Sita","Ganga","Yamuna",
		"Dev","Neel","Parth","Meet","Harsh","Prince","Raj","Ritik","Mohit","Gaurav",
		"Ankit","Kapil","Rajat","Pulkit","Lakshay","Keshav","Madhav","Ishan","Tanmay","Ansh",
		"Shraddha","Kritika","Payal","Komal","Sakshi","Isha","Nisha","Rekha","Sarika","Chandana",
		"Malini","Bindu","Vandana","Renuka","Shobha","Savitha","Sulochana","Bharti","Jyothi","Usha",
		"Aryan","Ved","Rudra","Shivam","Shubham","Saurabh","Himanshu","Yogesh","Chandan","Piyush",
		"Rakesh","Suraj","Vivek","Dhruv","Varad","Anuj","Aniket","Raghav","Kartikeya","Bhaskar",
		"Sharmila","Ankita","Monika","Sonali","Mitali","Tanushree","Padmini","Meenakshi","Srilatha","Kavitha",
		"Gayathri","Bhanupriya","Krithika","Niveditha","Soujanya","Harini","Mrudula","Aarathi","Janani","Padmavathi"};
		
		int salary[]={70000,50000,45000,40000,35000,30000,28000,26000,24000,22000,20000,18000,17000,16000,15000,14000,
		50000,45000,40000,35000,30000,28000,26000,24000,22000,20000,18000,17000,16000,15000,14000,50000,45000,
		40000,35000,30000,28000,26000,24000,22000,20000,18000,17000,16000,15000,14000,50000,45000,40000,35000,
		30000,28000,26000,24000,22000,20000,18000,17000,16000,15000,14000,50000,45000,40000,35000,30000,28000,
		26000,24000,22000,20000,18000,17000,16000,15000,14000,50000,45000,40000,35000,30000,28000,26000,24000,
		22000,20000,18000,17000,16000,15000,14000,50000,45000,40000,35000,30000,28000,26000,24000,22000,20000,
		18000,17000,16000,15000,14000,50000,45000,40000,35000,30000,28000,26000,24000,22000,20000,18000,17000,
		16000,15000,14000,50000,45000,40000,35000,30000,28000,26000,24000,22000,20000,18000,17000,16000,15000,
		14000,50000,45000,40000,35000,30000,28000,26000,24000,22000,20000,18000,17000,16000,15000,14000,50000,
		45000,40000,35000,30000,28000,26000,24000,22000,20000,18000,17000,16000,15000,14000,50000,45000,40000,
		35000,30000,28000,26000,24000,22000,20000,18000,17000,16000,15000,14000,50000,45000,40000,35000,30000,
		28000,26000,24000,22000,20000,18000,17000,16000,15000,14000,50000,45000,40000,35000,30000};
		
		String nativity[]={"Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa",
		"Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana",
		"Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu","Kerala",
		"Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh","Karnataka",
		"Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal",
		"Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa",
		"Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana",
		"Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu","Kerala",
		"Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh","Karnataka",
		"Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh",
		"Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal",
		"Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa",
		"Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana",
		"Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu","Kerala",
		"Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh","Karnataka",
		"Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh",
		"Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal",
		"Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa",
		"Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana",
		"Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh",
		"Telangana","Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh","Karnataka","Tamil Nadu",
		"Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal","Uttar Pradesh",
		"Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa","Odisha","West Bengal",
		"Uttar Pradesh","Karnataka","Tamil Nadu","Kerala","Andhra Pradesh","Telangana","Maharashtra","Goa",
		"Odisha","West Bengal","Uttar Pradesh","Karnataka"};
		
		String[] email = {"Adhya@gmail.com","Arun@gmail.com","Varun@gmail.com","Kiran@gmail.com","Rohit@gmail.com","Rahul@gmail.com","Suresh@gmail.com","Ramesh@gmail.com","Mahesh@gmail.com","Ganesh@gmail.com","Dinesh@gmail.com",
		"Lokesh@gmail.com","Naresh@gmail.com","Mukesh@gmail.com","Rajesh@gmail.com","Prakash@gmail.com","Vijay@gmail.com","Ajay@gmail.com","Sanjay@gmail.com","Anil@gmail.com","Sunil@gmail.com",
		"Anita@gmail.com","Sunita@gmail.com","Kavya@gmail.com","Divya@gmail.com","Pooja@gmail.com","Priya@gmail.com","Asha@gmail.com","Latha@gmail.com","Geetha@gmail.com","Suma@gmail.com",
		"Shilpa@gmail.com","Deepa@gmail.com","Manasa@gmail.com","Nandini@gmail.com","Ananya@gmail.com","Aishwarya@gmail.com","Sowmya@gmail.com","Shruthi@gmail.com","Harshitha@gmail.com","Bhavya@gmail.com",
		"Manoj@gmail.com","Vinod@gmail.com","Naveen@gmail.com","Deepak@gmail.com","Amit@gmail.com","Sumit@gmail.com","Pankaj@gmail.com","Ashok@gmail.com","Harish@gmail.com","Ravi@gmail.com",
		"Tejas@gmail.com","Nikhil@gmail.com","Abhishek@gmail.com","Akash@gmail.com","Shreyas@gmail.com","Karthik@gmail.com","Siddharth@gmail.com","Aditya@gmail.com","Arjun@gmail.com","Krishna@gmail.com",
		"Rashmi@gmail.com","Megha@gmail.com","Sneha@gmail.com","Chaitra@gmail.com","Pavithra@gmail.com","Vidya@gmail.com","Keerthi@gmail.com","Lavanya@gmail.com","Namrata@gmail.com","Swathi@gmail.com",
		"Sandhya@gmail.com","Anjali@gmail.com","Neha@gmail.com","Ritu@gmail.com","Pallavi@gmail.com","Aparna@gmail.com","Vaishnavi@gmail.com","Sharmila@gmail.com","Preethi@gmail.com","Roopa@gmail.com",
		"Vishal@gmail.com","Sandeep@gmail.com","Sachin@gmail.com","Yash@gmail.com","Darshan@gmail.com","Rohan@gmail.com","Pranav@gmail.com","Atharva@gmail.com","Omkar@gmail.com","Swapnil@gmail.com",
		"Bhavesh@gmail.com","Hardik@gmail.com","Jayesh@gmail.com","Hitesh@gmail.com","Paresh@gmail.com","Umesh@gmail.com","Kunal@gmail.com","Tushar@gmail.com","Chirag@gmail.com","Hamsa@gmail.com",
		"Sanjana@gmail.com","Kiranmayi@gmail.com","Amruta@gmail.com","Shreya@gmail.com","Ishita@gmail.com","Riya@gmail.com","Diya@gmail.com","Tanvi@gmail.com","Madhuri@gmail.com","Archana@gmail.com",
		"Sudha@gmail.com","Nalini@gmail.com","Hemalatha@gmail.com","Padma@gmail.com","Indira@gmail.com","Uma@gmail.com","Radha@gmail.com","Sita@gmail.com","Ganga@gmail.com","Yamuna@gmail.com",
		"Dev@gmail.com","Neel@gmail.com","Parth@gmail.com","Meet@gmail.com","Harsh@gmail.com","Prince@gmail.com","Raj@gmail.com","Ritik@gmail.com","Mohit@gmail.com","Gaurav@gmail.com",
		"Ankit@gmail.com","Kapil@gmail.com","Rajat@gmail.com","Pulkit@gmail.com","Lakshay@gmail.com","Keshav@gmail.com","Madhav@gmail.com","Ishan@gmail.com","Tanmay@gmail.com","Ansh@gmail.com",
		"Shraddha@gmail.com","Kritika@gmail.com","Payal@gmail.com","Komal@gmail.com","Sakshi@gmail.com","Isha@gmail.com","Nisha@gmail.com","Rekha@gmail.com","Sarika@gmail.com","Chandana@gmail.com",
		"Malini@gmail.com","Bindu@gmail.com","Vandana@gmail.com","Renuka@gmail.com","Shobha@gmail.com","Savitha@gmail.com","Sulochana@gmail.com","Bharti@gmail.com","Jyothi@gmail.com","Usha@gmail.com",
		"Aryan@gmail.com","Ved@gmail.com","Rudra@gmail.com","Shivam@gmail.com","Shubham@gmail.com","Saurabh@gmail.com","Himanshu@gmail.com","Yogesh@gmail.com","Chandan@gmail.com","Piyush@gmail.com",
		"Rakesh@gmail.com","Suraj@gmail.com","Vivek@gmail.com","Dhruv@gmail.com","Varad@gmail.com","Anuj@gmail.com","Aniket@gmail.com","Raghav@gmail.com","Kartikeya@gmail.com","Bhaskar@gmail.com",
		"Sharmila@gmail.com","Ankita@gmail.com","Monika@gmail.com","Sonali@gmail.com","Mitali@gmail.com","Tanushree@gmail.com","Padmini@gmail.com","Meenakshi@gmail.com","Srilatha@gmail.com","Kavitha@gmail.com",
		"Gayathri@gmail.com","Bhanupriya@gmail.com","Krithika@gmail.com","Niveditha@gmail.com","Soujanya@gmail.com","Harini@gmail.com","Mrudula@gmail.com","Aarathi@gmail.com","Janani@gmail.com","Padmavathi@gmail.com"};
		
		long phoneNumber[]={6364817378L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,
		9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,
		8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,
		6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,
		7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,
		6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,
		7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,
		9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,
		9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,
		8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,
		6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,
		7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,
		6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,
		7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,
		9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,
		9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,
		8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,
		6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,
		7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,
		6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,
		7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,
		9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,
		6785340988L,8764565980L,7865436578L,6364817378L};
		
		for(int k=0;k<type.length;k++)
		{
			Hotel.staffInfo(type[k],name[k],salary[k],nativity[k],email[k],phoneNumber[k]);
		}
		
		System.out.println();
		System.out.println();
		
		String hotelNames[] = {"Hotel Paradise","Hotel Grand Plaza","Hotel Royal Inn","Hotel Sunshine","Hotel Green Leaf",
        "Hotel Blue Moon","Hotel Silver Star","Hotel Golden Crown","Hotel Urban Stay","Hotel Comfort Zone",
		"Hotel City View","Hotel Lake Side","Hotel Hill Top","Hotel Palm Tree","Hotel Ocean Breeze","Hotel Pearl Residency",
		"Hotel Crystal Inn","Hotel Emerald Bay","Hotel Sapphire Suites","Hotel Diamond Palace","Hotel Heritage",
		"Hotel Classic Inn","Hotel Elite Stay","Hotel Prime Residency","Hotel Signature","Hotel Imperial","Hotel Monarch",
		"Hotel Regency","Hotel Prestige","Hotel Supreme","Hotel Cozy Corner","Hotel Relax Inn","Hotel Happy Stay",
		"Hotel Dream Land","Hotel Tranquil","Hotel Serene","Hotel Harmony","Hotel Bliss","Hotel Retreat","Hotel Gateway",
		"Hotel Lotus","Hotel Orchid","Hotel Tulip","Hotel Rosewood","Hotel Lavender","Hotel Jasmine","Hotel Magnolia",
		"Hotel Sunbeam","Hotel Moonlight","Hotel Star Light","Hotel Riverside","Hotel Park View","Hotel Central",
		"Hotel Midtown","Hotel Downtown","Hotel Crossroads","Hotel Avenue","Hotel Horizon","Hotel Mathura",
		"Hotel Ragavendra"};
		
		String addresses[] = {"MG Road","Brigade Road","Indiranagar","Koramangala","Whitefield","Electronic City",
		"Jayanagar","JP Nagar","BTM Layout","Bannerghatta Road","Yelahanka","Hebbal","RT Nagar","Malleshwaram",
		"Rajajinagar","Basavanagudi","Vijayanagar","Kengeri","Nagarbhavi","Magadi Road","Marathahalli","Bellandur",
		"Sarjapur Road","HSR Layout","Domlur","Ulsoor","Frazer Town","Cox Town","Cooke Town","Banaswadi","KR Puram",
		"Ramamurthy Nagar","Mahadevapura","CV Raman Nagar","Brookefield","Kalyan Nagar","Hennur Road","Thanisandra",
		"Nagawara","Sanjay Nagar","Peenya","Yeshwanthpur","Seshadripuram","Shivajinagar","Majestic","Chickpet",
		"Basaveshwaranagar","Lingarajapuram","Rajankunte","Attibele","Bommasandra","Anekal","Nelamangala","Devanahalli",
		"DurgiGudi","Vijayanagar","Kengeri","Nagarbhavi","Magadi Road","Marathahalli"};
		
		String owner[]={"Adhya","Arun","Varun","Kiran","Rohit","Rahul","Suresh","Ramesh","Mahesh","Ganesh","Dinesh",
		"Lokesh","Naresh","Mukesh","Rajesh","Prakash","Vijay","Ajay","Sanjay","Anil","Sunil",
		"Anita","Sunita","Kavya","Divya","Pooja","Priya","Asha","Latha","Geetha","Suma",
		"Shilpa","Deepa","Manasa","Nandini","Ananya","Aishwarya","Sowmya","Shruthi","Harshitha","Bhavya",
		"Manoj","Vinod","Naveen","Deepak","Amit","Sumit","Pankaj","Ashok","Harish","Ravi",
		"Tejas","Nikhil","Abhishek","Akash","Shreyas","Karthik","Siddharth","Aditya","Krishna"}; 
		
		long mobileNo[]={6364817378L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,
		9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,
		8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,
		6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,
		7865431298L,9889657476L,6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,
		6785340988L,8764565980L,7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L,
		7865436578L,6364817378L,9945283474L,7865431298L,9889657476L,6785340988L,8764565980L};
		
		int noOfStaff[]={72, 185, 249, 98, 156, 221, 67, 290, 134, 178,205, 89, 260, 142, 298, 121, 164, 93, 247,
		181,56, 199, 273, 115, 168, 240, 82, 300, 149, 214,95, 187, 262, 128, 171, 226, 74, 291, 158, 203,63, 175,
		255, 104, 162, 232, 86, 299, 141, 219,58, 194, 268, 112, 167, 245, 79, 284, 152, 208};
		
		for(int l=0;l<owner.length;l++)
		{
			Hotel.hotelInfo(hotelNames[l],addresses[l],owner[l],mobileNo[l],noOfStaff[l]);
		}
		

	}
}