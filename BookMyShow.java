import java.util.Scanner;
class BookMyShow 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int price=0;
		int amount=0;
		int amount1=0;
		int amount2=0;
		int status=0;
		int qty=0;
		int date=0;
		int choice=0;
		int cost=0;
		int time=0;
		int num=0;
		int theater=0;
		int time1=0;
		System.out.println("                                                Welcome to BookMyShow");
		System.out.println("search your City");
		String city=scan.next();
		System.out.println("Movies Languages");
		System.out.println("Telugu   Hindi  English  Tamil  Kannada  Malayalam  ");
		System.out.println("Enter Language ");
		String language=scan.next();
		System.out.println("Available Movies");
		switch (language)
		{
		case "Telugu":System.out.println("1.God Father");
					  System.out.println("2.Kanthara");
					  System.out.println("3.Sardar");
					  System.out.println("4.Prince");
					  System.out.println("5.Ori Devuda");
					  choice=scan.nextInt();
					  switch (choice)
					  {
					  case 1: System.out.println("1.God Father");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Miraj Cinemas,Miyapur");
							  System.out.println("Show Timings 1.(04:10 PM)");
							  System.out.println("2.Asian Cine Square,Uppal");
							  System.out.println("Show Timings 1.(07:25 PM)");
							  System.out.println("3.PVR:Mallapur,Hyderabad");
							  System.out.println("Show Timings 1.(04:15 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  theater=scan.nextInt();
							  switch (theater)
							  {
							  case 1:System.out.println("1.Miraj Cinemas,Miyapur");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("1.Miraj Cinemas,Miyapur    04:10 PM");
									 }
									 System.out.println("Select the Seats  EXECUTIVE  ");
									 System.out.println("Ticket cost         195");
									 System.out.println("Enter Cost Of Ticket is (195)   ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Asian Cine Square,Uppal");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("2.Asian Cine Square,Uppal    07:25 PM");
									 }
									 System.out.println("Select the Seats  SOFA    GOLD  ");
									 System.out.println("Ticket cost        200     180");
									 System.out.print("Select Cost Of Ticket is (200/180)     ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.PVR:Mallapur,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("3.PVR:Mallapur,Hyderabad    04:15 PM");
									 }
									 System.out.println("Select the Seats  CLASSIC ");
									 System.out.println("Ticket cost         195");
									 System.out.println("Enter Cost Of Ticket is (195)     ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice");
							  }
							  break;
					  case 2: System.out.println("2.Kanthara");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.BVK Multiplux ");
							  System.out.println("Show Timings 1.(04:25 PM)  2.(07:25 PM)   3.(10:40 PM)");
							  System.out.println("2.Asian Swapna ");
							  System.out.println("Show Timings 1.(6:00 PM)    2.(9:00 PM)");
							  System.out.println("3.CCPL Mall Malkajgiri");
							  System.out.println("Show Timings 1.(07:50 PM)   2.(10:45 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.BVK Multiplux");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("BVK Multiplux   04:25 PM");
											break;
									 case 2:System.out.println("BVK Multiplux   07:25 PM");
											break;
									 case 3:System.out.println("BVK Multiplux   10:40 PM");
											break;
									 }
									 System.out.println("Select the Seats  BOX A   BOX B    BALCONY");
									 System.out.println("Ticket cost        250     250        200");
									 System.out.println("Enter Cost Of Ticket is (250/250/200)    ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Asian Swapna");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Asian Swapna   06:00 PM");
											break;
									 case 2:System.out.println("Asian Swapna   09:00 PM");
											break;
									 }
									 System.out.println("Select the Seats    PLATINUM  GOLD  ");
									 System.out.println("Ticket cost            110     80   ");
									 System.out.println("Enter Cost Of Ticket is (110/80)	");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.CCPL Mall Malkajgiri");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("CCPL Mall Malkajgiri   07:50 PM");
											break;
									 case 2:System.out.println("CCPL Mall Malkajgiri  10:45 PM");
											break;
									 }
									 System.out.println("Select the Seats  EXECUTIVE");
									 System.out.println("Ticket cost          195");
									 System.out.println("Enter Cost Of Ticket is (195)  ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice");
							  }
							  break;
					  case 3: System.out.println("3.Sardar");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Sudha Cinemas");
							  System.out.println("Show Timings 1.(07:35 PM)   2.(10.40 PM)");
							  System.out.println("2.GSM Mall");
							  System.out.println("Show Timings 1.(07.20 PM)   2.(10.40 PM)");
							  System.out.println("3.GVK One");
							  System.out.println("Show Timings 1.(04.00 PM)   2.(07.20 PM)    3.(10.40 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Sudha Cinemas");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Sudha Cinemas   07:35 PM");
											break;
									 case 2:System.out.println("Sudha Cinemas  10:40 PM");
											break;
									 }
									 System.out.println("Select the Seats  EXECUTIVE");
									 System.out.println("Ticket cost          195");
									 System.out.println("Enter Cost Of Ticket is (195)	 ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.GSM Mall");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("GSM Mall   07:20 PM");
											break;
									 case 2:System.out.println("GSM Mall  10:40 PM");
											break;
									 }
									 System.out.println("Select the Seats  EXECUTIVE");
									 System.out.println("Ticket cost          225");
									 System.out.println("Enter Cost Of Ticket is (225)	");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.GVK One");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("GVK One   04:00 PM");
											break;
									 case 2:System.out.println("GVK One   07:20 PM");
											break;
									 case 3:System.out.println("GVK One  10:40 PM");
											break;
									 }
									 System.out.println("Select the Seats  ROYAL  EXECUTIVE");
									 System.out.println("Ticket cost        250     195");
									 System.out.println("Enter Cost Of Ticket is (250/195)	");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice");
							  }
							  break;
					  case 4: System.out.println("4.Prince");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Asian Mukta Cinemas");
							  System.out.println("Show Timings 1.(07:40 PM)  2.(10:25 PM)");
							  System.out.println("2.Geeta,Chandanagar");
							  System.out.println("Show Timings  1.(07:25 PM)");
							  System.out.println("3.Raghavendra Theater");
							  System.out.println("Show Timings   1.(10:45 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Asian Mukta Cinemas");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Asian Mukta Cinemas   07:40 PM");
											break;
									 case 2:System.out.println("Asian Mukta Cinemas  10:25 PM");
											break;
									 }
									 System.out.println("Select the Seats  RECLINERS  SOFA  GOLD");
									 System.out.println("Ticket cost         180       180   150");
									 System.out.println("Enter Cost Of Ticket is (180/180/150)      ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Geeta,Chandanagar");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Geeta,Chandanagar   07:25 PM");
											break;
									 }
									 System.out.println("Select the Seats  GOLD  EXECUTIVE");
									 System.out.println("Ticket cost        250     195");
									 System.out.println("Enter Cost Of Ticket is (250/195)    ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.Raghavendra");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("GSM Mall   10:45 PM");
											break;
									 }
									 System.out.println("Select the Seats  ROYAL  EXECUTIVE");
									 System.out.println("Ticket cost        250     195");
									 System.out.println("Enter Cost Of Ticket is (250/195)  ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice");
							  }
							  break;
					  case 5: System.out.println("5.Ori Devuda");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Maheswari");
							  System.out.println("Show Timings   1.(04:10 PM)  2.(07:15 PM)   3.(10:20 PM)");
							  System.out.println("2.Sattva Necklace Mall,Kavadiguda");
							  System.out.println("Show Timings   1.(04:20 PM)  2.(07:25 PM)   3.(10:30 PM)");
							  System.out.println("3.Mahalaxmi Complex,Kothapeta");
							  System.out.println("Show Timings (6:15 PM)  2.(09:30 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Maheswari");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Maheswari   04:10 PM");
											break;
									 case 2:System.out.println("Maheswari   07:15 PM");
											break;
									 case 3:System.out.println("Maheswari  10:20 PM");
											break;
									 }
									 System.out.println("Select the Seats  EXECUTIVE");
									 System.out.println("Ticket cost         195");
									 System.out.println("Enter Cost Of Ticket is (195)  ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Sattva Necklace Mall,Kavadiguda");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Sattva Necklace Mall,Kavadiguda   04:20 PM");
											break;
									 case 2:System.out.println("Sattva Necklace Mall,Kavadiguda   07:25 PM");
											break;
									 case 3:System.out.println("Sattva Necklace Mall,Kavadiguda  10:30 PM");
											break;
									 }
									 System.out.println("Select the Seats  ROYAL  EXECUTIVE");
									 System.out.println("Ticket cost        250      195");
									 System.out.println("Enter Cost Of Ticket is (250/195)   ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.Mahalaxmi Complex,Kothapeta");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Mahalaxmi Complex,Kothapeta   06:15 PM");
											break;
									 case 2:System.out.println("Mahalaxmi Complex,Kothapeta   09:30 PM");
											break;
									 }
									 System.out.println("Select the Seats  EXECUTIVE");
									 System.out.println("Ticket cost          195");
									 System.out.println("Enter Cost Of Ticket is (195)    ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice");
							  }
							  break;
					  default:System.out.println("Invalid Choice");
					  }
					  break;
		case "Hindi"  :System.out.println("1.God Father");
					   System.out.println("2.Black Adam");
					   System.out.println("3.Doctor G");
					   System.out.println("4.Ram Setu");
					   choice=scan.nextInt();
					   switch (choice)
					   {
					   case 1:System.out.println("1.God Father");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Asian CineSquare,Uppal");
							  System.out.println("Show Timings   1.(04:45 PM)");
							  System.out.println("2.DSL Virtue Mall,Uppal");
							  System.out.println("Show Timings    1.(04:25 PM)");
							  System.out.println("3.Sudarshan 35MM ,RTC X Roads");
							  System.out.println("Show Timings   1.(11:00 AM)  2.(02:15 PM)  3.(06:00 PM)   4.(09.15 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Asian CineSquare,Uppal");
								     System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Asian CineSquare,Uppal   04:45 PM");
											break;
									 }
									 System.out.println("Select the Seats  SOFA     GOLD");
									 System.out.println("Ticket cost        200      180");
									 System.out.println("Enter Cost Of Ticket is (200/180)   ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.DSL Virtue Mall,Uppal");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("DSL Virtue Mall,Uppal   04:25 PM");
											break;
									 }
									 System.out.println("Select the Seats  VIP  EXECUTIVE   NORMAL");
									 System.out.println("Ticket cost       250      195       195");
									 System.out.println("Enter Cost Of Ticket is (250/195/195)    ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.Sudarshan 35MM ,RTC X Roads");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Sudarshan 35MM ,RTC X Roads   11:00 AM");
											break;
									 case 2:System.out.println("Sudarshan 35MM ,RTC X Roads   02:15 PM");
											break;
									 case 3:System.out.println("Sudarshan 35MM ,RTC X Roads  06:00 PM");
											break;
									 case 4:System.out.println("Sudarshan 35MM ,RTC X Roads  09:15 PM");
											break;
									 }
									 System.out.println("Select the Seats  UPPPER BALCONY    LOWER BALCONY    FIRST CLASS     SECOND CLASS");
									 System.out.println("Ticket cost          150                 150              110              55");
									 System.out.println("Enter Cost Of Ticket is (150/150/110/55)    ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice");
							  }
					   		  break;
					   case 2:System.out.println("2.Black Adam");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Maheswari");
							  System.out.println("Show Timings   1.(01:15 PM)");
							  System.out.println("2.Sattva Necklace Mall,Kavadiguda");
							  System.out.println("Show Timings   1.(11:30 AM)    2.(02:20 PM)  3.(07:40 PM)");
							  System.out.println("3.Mantra mall,Attapur");
							  System.out.println("Show Timings   1.(02:15 PM)   2.(10:50 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Maheswari");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Maheswari   01:15 PM");
											break;
									 }
									 System.out.println("Select the Seats  Executive");
									 System.out.println("Ticket cost          150");
									 System.out.println("Enter Cost Of Ticket is (150)   ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Sattva Necklace Mall,Kavadiguda");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Sattva Necklace Mall,Kavadiguda   11:30 AM");
											break;
									 case 2:System.out.println("Sattva Necklace Mall,Kavadiguda   02:20 PM");
											break;
									 case 3:System.out.println("Sattva Necklace Mall,Kavadiguda  07:40 PM");
											break;
									 }
									 System.out.println("Select the Seats  Royal  Executive");
									 System.out.println("Ticket cost        250      150");
									 System.out.println("Enter Cost Of Ticket is (250/150)   ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.Mantra mall,Attapur");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Mantra mall,Attapur   02:15 PM");
											break;
									 case 2:System.out.println("Mantra mall,Attapur   10:50 PM");
											break;
									 }
									 System.out.println("Select the Seats     VIP    NORMAL");
									 System.out.println("Ticket cost          250      150");
									 System.out.println("Enter Cost Of Ticket is (250/150)   ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice");
							  }
							  break;
					   case 3:System.out.println("3.Doctor G");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Maheswari");
							  System.out.println("Show Timings (04:30 PM)");
							  System.out.println("2.Tivoli Cinemas,Secunderabad");
							  System.out.println("Show Timings (07:50 PM)");
							  System.out.println("3.Irrum Manzil,Hyderabad");
							  System.out.println("Show Timings (08:00 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Maheswari");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Maheswari   04:30 PM");
											break;
									 }
									 System.out.println("Select the Seats  Executive");
									 System.out.println("Ticket cost          150");
									 System.out.println("Enter Cost Of Ticket is (150)   ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Tivoli Cinemas,Secunderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Tivoli Cinemas,Secunderabad   07:50 PM");
											break;
									 }
									 System.out.println("Select the Seats  GOLD  ");
									 System.out.println("Ticket cost        150     ");
									 System.out.println("Enter Cost Of Ticket is (150)   ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.Irrum Manzil,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Irrum Manzil,Hyderabad   08:00 PM");
											break;
									 }
									 System.out.println("Select the Seats  RECLINER     CLASSIC");
									 System.out.println("Ticket cost          250         150");
									 System.out.println("Enter Cost Of Ticket is (250/150)    ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
							  break;
					   case 4:System.out.println("4.Ram Setu");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Mukta A2 Cinemas,Abids");
							  System.out.println("Show Timings   1.(11:30 AM)  2.(06.00 PM)");
							  System.out.println("2.Metro Cinema,Bahadurpura");
							  System.out.println("Show Timings   1.(02:30 PM)  2.(09:00 PM)");
							  System.out.println("3.Prasad Multiplex,Hyderabad");
							  System.out.println("Show Timings   1.(10:00 AM)  2.(07.00 PM)   3.(10:30 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Mukta A2 Cinemas,Abids");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Mukta A2 Cinemas,Abids   11:30 AM");
											break;
									 case 2:System.out.println("Mukta A2 Cinemas,Abids   06:00 PM");
											break;
									 }
									 System.out.println("Select the Seats  PREMIUM RECLINER    PREMIUM SOFA    GOLD    SILVER");
									 System.out.println("Ticket cost              200               150         110       55 ");
									 System.out.println("Enter Cost Of Ticket is (200/150/110/55)");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Metro Cinrma,Bahadurpura");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Metro Cinema,Bahadurpura   02:30 PM");
											break;
									 case 2:System.out.println("Metro Cinema,Bahadurpura   09:00 PM");
											break;
									 }
									 System.out.println("Select the Seats  BALCONY  SILVER");
									 System.out.println("Ticket cost        100       80");
									 System.out.println("Enter Cost Of Ticket is (100/80)");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.Prasad Multiplex,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Prasad Multiplex,Hyderabad   10:00 AM");
											break;
									 case 2:System.out.println("Prasad Multiplex,Hyderabad   07:00 PM");
											break;
									 case 3:System.out.println("Prasad Multiplex,Hyderabad   10:30 PM");
											break;
									 }
									 System.out.println("Select the Seats  SILVER");
									 System.out.println("Ticket cost         200");
									 System.out.println("Enter Cost Of Ticket is (200) ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
							  break;
					   default:System.out.println("Invalid Choice");
					   }
					   break;
		case "English":System.out.println("1.Black Adam");
					   System.out.println("2.Minions:The Rise of Guru");
					   System.out.println("3.DC League of Super-Pets");
					   choice=scan.nextInt();
					   switch (choice)
					   {
					   case 1:System.out.println("1.Black Adam");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.PVR:Mallapur,Hyderabad");
							  System.out.println("Show Timings   1.(01:50 PM)  2.(08:10 PM)");
							  System.out.println("2.Shalini Shivani,Hyderabad");
							  System.out.println("Show Timings   1.(04:30 PM)  2.(07:20 PM)");
							  System.out.println("3.Ragavendra");
							  System.out.println("Show Timings   1.(04.45 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.PVR:Mallapur,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("PVR:Mallapur,Hyderabad   01:50 PM");
											break;
									 case 2:System.out.println("PVR:Mallapur,Hyderabad  08:10 PM");
											break;
									 }
									 System.out.println("Select the Seats  CLASSIC");
									 System.out.println("Ticket cost          150 ");
									 System.out.println("Enter Cost Of Ticket is (150)  ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Shalini Shivani,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Shalini Shivani,Hyderabad   04:30 PM");
											break;
									 case 2:System.out.println("Shalini Shivani,Hyderabad   07:20 PM");
											break;
									 }
									 System.out.println("Select the Seats  GOLD  EXECUTIVE");
									 System.out.println("Ticket cost        250     150");
									 System.out.println("Enter Cost Of Ticket is (250/150)   ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.Ragavendra");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Ragavendra   04:45 PM");
											break;
									 }
									 System.out.println("Select the Seats  GOLD  EXECUTIVE");
									 System.out.println("Ticket cost        250     150");
									 System.out.println("Enter Cost Of Ticket is (250/150)   ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
					 		  break;
					   case 2:System.out.println("2.Minions:The Rise of Guru");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Next Galleria Mall,Panjagutta");
							  System.out.println("Show Timings (02:25 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Next Galleria Mall,Panjagutta");
									 System.out.println("Select the Seats      CLASSIC    ");
									 System.out.println("Ticket cost             150      ");
									 System.out.println("Select Cost Of Ticket is (150)");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
							  break;
					   case 3:System.out.println("3.DC League of Super-Pets");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Next Galleria Mall,Panjagutta");
							  System.out.println("Show Timings (04.35 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Next Galleria Mall,Panjagutta");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Next Galleria Mall,Panjagutta   04:35 PM");
											break;
									 }
									 System.out.println("Select the Seats       CLASSIC");
									 System.out.println("Ticket cost              150 ");
									 System.out.println("Enter Cost Of Ticket is (150)   ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
							  break;
					   default:System.out.println("Invalid Choice");
					   }
					   break;
		case "Tamil"  :System.out.println("1.Sardar");
					   System.out.println("2.Prince");
					   System.out.println("3.Ram Setu");
					   choice=scan.nextInt();
					   switch (choice)
					   {
					   case 1:System.out.println("1.Sardar.");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.PVR:Mallapur,Hyderabad");
							  System.out.println("Show Timings    1.(01:50 PM)   2.(08:10 PM)");
							  System.out.println("2.Shalini Shivani,Hyderabad");
							  System.out.println("Show Timings    1.(04.30 PM)   2.(07:20 PM)");
							  System.out.println("3.Ragavendra");
							  System.out.println("Show Timings   1.(04:45 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.PVR:Mallapur,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("PVR:Mallapur,Hyderabad   01:50 PM");
											break;
									 case 2:System.out.println("PVR:Mallapur,Hyderabad   08:10 PM");
											break;
									 }
									 System.out.println("Select the Seats  CLASSIC");
									 System.out.println("Ticket cost          150 ");
									 System.out.println("Enter Cost Of Ticket is (150)   ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Shalini Shivani,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Shalini Shivani,Hyderabad   04:30 PM");
											break;
									 case 2:System.out.println("Shalini Shivani,Hyderabad   07:20 PM");
											break;
									 }
									 System.out.println("Select the Seats  GOLD  EXECUTIVE");
									 System.out.println("Ticket cost        250     150");
									 System.out.println("Enter Cost Of Ticket is (250/150)   ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.Ragavendra");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Ragavendra   04:45 PM");
											break;
									 }
									 System.out.println("Select the Seats  GOLD  EXECUTIVE");
									 System.out.println("Ticket cost        250     150");
									 System.out.println("Enter Cost Of Ticket is (250/150)  ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
					 		  break;
					   case 2:System.out.println("2.Prince");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Prasads Multiplex:Hyderabad");
							  System.out.println("Show Timings   1.(05:45 PM)");
							  System.out.println("2.Platinum Movietime Cinema,Gachibowli");
							  System.out.println("Show Timings   1.(02:30 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Prasads Multiplex:Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Prasads Multiplex:Hyderabad   05:45 PM");
											break;
									 }
									 System.out.println("Select the Seats  EXECUTIVE");
									 System.out.println("Ticket cost          200 ");
									 System.out.println("Enter Cost Of Ticket is (200)   ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Platinum Movietime Cinema,Gachibowli");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Platinum Movietime Cinema,Gachibowli   02:30 PM");
											break;
									 }
									 System.out.println("Select the Seats  PLATINUM PREMIUM RECLINER      PLATINUM  RECLINER");
									 System.out.println("Ticket cost                 350                          250");
									 System.out.println("Enter Cost Of Ticket is (350/250)    ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
							  break;
					   case 3:System.out.println("3.Har Har Mahadev");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Maheshwari");
							  System.out.println("Show Timings (04:30 PM)");
							  System.out.println("2.Nexus Mall Kukatpally,Hyderabad");
							  System.out.println("Show Timings (01:10 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Maheshwari");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Maheshwari   04:30 PM");
											break;
									 }
									 System.out.println("Select the Seats  EXECUTIVE");
									 System.out.println("Ticket cost          150 ");
									 System.out.println("Enter Cost Of Ticket is (150)  ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("Nexus Mall Kukatpally,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Nexus Mall Kukatpally,Hyderabad   01:10 PM");
											break;
									 }
									 System.out.println("Select the Seats  RECLINER      CLASSIC");
									 System.out.println("Ticket cost         250           150");
									 System.out.println("Enter Cost Of Ticket is (250/150)   ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
							  break;
					   default:System.out.println("Invalid Choice");
					   }
					   break;
		case "Kannada":System.out.println("1.Kantara ");
					   System.out.println("2.Har Har Mahadev");
					   choice=scan.nextInt();
					   switch (choice)
					   {
					   case 1:System.out.println("1.Kantara");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Irrum Manzil,,Hyderabad");
							  System.out.println("Show Timings    1.(04:35 PM)");
							  System.out.println("2.Nexus Mall Kukatpally,Hyderabad");
							  System.out.println("Show Timings    1.(04:30 PM)");
							  System.out.println("3.GSM Mall,Hyderabad");
							  System.out.println("Show Timings    1.(03:45 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Irrum Manzil,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Irrum Manzil,Hyderabad   04:35 PM");
											break;
									 }
									 System.out.println("Select the Seats   RECLINER  CLASSIC");
									 System.out.println("Ticket cost          350       250 ");
									 System.out.println("Enter Cost Of Ticket is (350/250)   ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Nexus Mall Kukatpally,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Nexus Mall Kukatpally,Hyderabad   04:30 PM");
											break;
									 }
									 System.out.println("Select the Seats  RECLINER  CLASSIC");
									 System.out.println("Ticket cost         350       250");
									 System.out.println("Enter Cost Of Ticket is (350/250)   ");
									 cost=scan.nextInt();
									 break;
							  case 3:System.out.println("3.GSM Mall,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("GSM Mall,Hyderabad   03:45 PM");
											break;
									 }
									 System.out.println("Select the Seats  ROYAL  EXECUTIVE");
									 System.out.println("Ticket cost        350     250");
									 System.out.println("Enter Cost Of Ticket is (350/250)   ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice"); 
							  }
							  break;
					   case 2:System.out.println("2.Har Har Mahadev");
							  System.out.println("Available Dates");
							  System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
							  System.out.println("21   22   23   24   25   26   27  ");
							  System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
							  System.out.println("Available  Theaters");
							  System.out.println("1.Maheshwari");
							  System.out.println("Show Timings   1.(04:30 PM)");
							  System.out.println("2.Nexus Mall Kukatpally,Hyderabad");
							  System.out.println("Show Timings   1.(01:10 PM)");
							  System.out.println("Enter the Date");
							  date=scan.nextInt();
							  System.out.println("Enter Theatre Number");
							  choice=scan.nextInt();
							  switch (choice)
							  {
							  case 1:System.out.println("1.Maheshwari");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Maheshwari   04:30 PM");
											break;
									 }
									 System.out.println("Select the Seats  EXECUTIVE");
									 System.out.println("Ticket cost          150 ");
									 System.out.println("Enter Cost Of Ticket is (150)   ");
									 cost=scan.nextInt();
									 break;
							  case 2:System.out.println("2.Nexus Mall Kukatpally,Hyderabad");
									 System.out.println("Enter Show Time Number");
									 time=scan.nextInt();
									 switch (time)
									 {
									 case 1:System.out.println("Nexus Mall Kukatpally,Hyderabad   01:10 PM");
											break;
									 }
									 System.out.println("Select the Seats  RECLINER  CLASSIC");
									 System.out.println("Ticket cost         250       150");
									 System.out.println("Enter Cost Of Ticket is (250/150)   ");
									 cost=scan.nextInt();
									 break;
							  default:System.out.println("Invalid choice");
							  }
							  break;
					   default:System.out.println("Invalid Choice");
					   }
					   break;
		case "Malayalam":System.out.println("1.Monster");
						 System.out.println("2.Padavettu");
						 choice=scan.nextInt();
						 switch (choice)
						 {
						 case 1:System.out.println("1.Monster");
								System.out.println("Available Dates");
								System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
								System.out.println("21   22   23   24   25   26   27  ");
								System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
								System.out.println("Available  Theaters");
								System.out.println("1.Irrum Manzil,,Hyderabad");
								System.out.println("Show Timings   1.(08:00 PM)");
								System.out.println("2.Nexus Mall Kukatpally,Hyderabad");
								System.out.println("Show Timings   1.(07:25 PM)");
								System.out.println("3.CCPL Mall Kukatpally,Hyderabad");
								System.out.println("Show Timings   1.(03:45 PM)");
								System.out.println("Enter the Date");
								date=scan.nextInt();
								System.out.println("Enter Theatre Number");
								choice=scan.nextInt();
								switch (choice)
								{
								case 1:	System.out.println("1.Irrum Manzil,Hyderabad");
										System.out.println("Enter Show Time Number");
										time=scan.nextInt();
										switch (time)
										{
										case 1:System.out.println("Irrum Manzil,Hyderabad   08:00 PM");
									           break;
										}
										System.out.println("Select the Seats   RECLINER  CLASSIC");
										System.out.println("Ticket cost          250       150 ");
										System.out.println("Enter Cost Of Ticket is (350/250)   ");
										cost=scan.nextInt();
										break;
							    case 2:	System.out.println("2.Nexus Mall Kukatpally,Hyderabad");
										System.out.println("Enter Show Time Number");
										time=scan.nextInt();
										switch (time)
										{
										case 1:System.out.println("Nexus Mall Kukatpally,Hyderabad   07:25 PM");
									           break;
										}
										System.out.println("Select the Seats  RECLINER  CLASSIC");
										System.out.println("Ticket cost         250       150");
										System.out.println("Enter Cost Of Ticket is (250/150)   ");
										cost=scan.nextInt();
										break;
								case 3: System.out.println("3.CCPL Mall Kukatpally,Hyderabad");
										System.out.println("Enter Show Time Number");
										time=scan.nextInt();
										switch (time)
										{
										case 1:System.out.println("CCPL Mall Kukatpally,Hyderabad   03:45 PM");
									           break;
										}
										System.out.println("Select the Seats  EXECUTIVE");
										System.out.println("Ticket cost           150");
										System.out.println("Enter Cost Of Ticket is (150)   ");
										cost=scan.nextInt();
										break;
								default:System.out.println("Invalid choice"); 
								}
								break;
						 case 2:System.out.println("2.Padavettu");
								System.out.println("Available Dates");
								System.out.println("Fri  Sat  Sun  Mon  Tue  Wed  Thu ");
								System.out.println("21   22   23   24   25   26   27  ");
								System.out.println("Oct  Oct  Oct  Oct  Oct  Oct  Oct ");
								System.out.println("Available  Theaters");
								System.out.println("1.Nexus Mall Kukatpally,Hyderabad");
								System.out.println("Show Timings (04:15 PM)");
								System.out.println("Enter the Date");
								date=scan.nextInt();
								System.out.println("Enter Theatre Number");
								choice=scan.nextInt();
								switch (choice)
								{
							    case 1:	System.out.println("1.Nexus Mall Kukatpally,Hyderabad");
										System.out.println("Enter Show Time Number");
										time=scan.nextInt();
										switch (time)
										{
										case 1:System.out.println("Nexus Mall Kukatpally,Hyderabad  04:15 PM");
									           break;
										}
										System.out.println("Select the Seats  RECLINER  CLASSIC");
										System.out.println("Ticket cost         250       150");
										System.out.println("Enter Cost Of Ticket is (250/150)   ");
										cost=scan.nextInt();
										break;
								default:System.out.println("Invalid choice"); 
								}
						 default:System.out.println("Invalid choice"); 
						 }
		default:System.out.println("Invalid choice"); 
		}
		System.out.println("Select the number of Tickets (1/2/3/4/5)");
		num=scan.nextInt();
		if (num<6)
		{
			for (int i=1;i<=num ;i++ )
			{
				amount=cost*i;
			}
			System.out.println("Amount of Tickets is "+amount);
		}
		
		System.out.println();
		System.out.println("Select your Snacks");
		System.out.println("1.French Fries 130gms "+150);
		System.out.println("2.Jumbo Popcorn Salted 200gms "+350);
		System.out.println("3.Large coke 900ml "+220);
		System.out.println("4.Panner Tikka Pizza 7inch "+220);
		System.out.println("5.Regular Salted Popcorn 80gms "+200);
		System.out.println("6.Chicken Tikka Pizza 7inch "+250);
		System.out.println("7.Veg Burger with Fries 180gms "+150);
		System.out.println("8.Chicken Burger with Fries 180gms "+180);
		System.out.println("9.Medium Coke 650ml "+200);
		System.out.println("10.Cappucino 180ml "+140);
		System.out.println("11.Panner Tikka Sandwich 160gms "+150);
		System.out.println("12.Black Forest Pasty 100gms "+120);
		System.out.println("13.Lava Cake Pasty 100gms "+120);
		System.out.println("14.Chicken Puff 100gms "+100);
		System.out.println("15.Veg Puff 100gms "+80);
		System.out.println("Press 0 to skip the snacks");
		do
		{
			choice=scan.nextInt();
			switch (choice)
			{
				case 1:price=150;
						System.out.println("French Fries 130gms Price:"+price);
						System.out.println("Select the Quantity");
						int qty1=scan.nextInt();
						price=price*qty1;
						System.out.println("French Fries 130gms "+" Quantity:"+qty+" Price:"+price);
						break;
				case 2:price=350;
						System.out.println("Jumbo Popcorn Salted 200gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Jumbo Popcorn Salted 200gms "+" Quantity:"+qty+" Price:"+price);
						break;
				case 3:price=220;
						System.out.println("Large coke 900ml Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Large coke 900ml "+" Quantity:"+qty+" Price:"+price);
						break;
				case 4:price=220;
						System.out.println("Panner Tikka Pizza 7inch Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Panner Tikka Pizza 7inch "+" Quantity:"+qty+" Price:"+price);
						break;
				case 5:price=200;
						System.out.println("Regular Salted Popcorn 80gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Regular Salted Popcorn 80gms "+" Quantity:"+qty+" Price:"+price);
						break;
				case 6:price=250;
						System.out.println("Chicken Tikka Pizza 7inch Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Chicken Tikka Pizza 7inch "+" Quantity:"+qty+" Price:"+price);
						break;
				case 7:price=150;
						System.out.println("Veg Burger with Fries 180gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Veg Burger with Fries 180gms "+" Quantity:"+qty+" Price:"+price);
						break;
				case 8:price=180;
						System.out.println("Chicken Burger with Fries 180gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Chicken Burger with Fries 180gms "+" Quantity:"+qty+" Price:"+price);
						break;
				case 9:price=200;
						System.out.println("Medium Coke 650ml Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Medium Coke 650ml "+" Quantity:"+qty+" Price:"+price);
						break;
				case 10:price=140;
						System.out.println("Cappucino 180ml Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Cappucino 180ml "+" Quantity:"+qty+" Price:"+price);
						break;
				case 11:price=150;
						System.out.println("Panner Tikka Sandwich 160gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Panner Tikka Sandwich 160gms "+" Quantity:"+qty+" Price:"+price);
						break;
				case 12:price=120;
						System.out.println("Black Forest Pasty 100gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Black Forest Pasty 100gms "+" Quantity:"+qty+" Price:"+price);
						break;
				case 13:price=120;
						System.out.println("Lava Cake Pasty 100gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Lava Cake Pasty 100gms "+" Quantity:"+qty+" Price:"+price);
						break;
				case 14:price=100;
						System.out.println("Chicken Puff 100gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Chicken Puff 100gms Price "+" Quantity:"+qty+" Price:"+price);
						break;
				case 15:price=80;
						System.out.println("Veg Puff 100gms Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Veg Puff 100gms "+" Quantity:"+qty+" Price:"+price);
						break;
			}
			System.out.println("Do you want to Add press 0");
			System.out.println("Do you want to Skip press 1");
			status=scan.nextInt();
			amount1=amount1+price;
			System.out.println("Amount of Tickets is "+amount);
			System.out.println("Amount of Snacks  is "+amount1);
		}
		while (status==0);
		amount2=amount+amount1;
		System.out.println("Total Amount is      "+amount2);
		System.out.println("Choose Payment method");
		System.out.println("1.Paytm(Postpaid|Wallet|UPI)");
		System.out.println("2.UPI(Google Pay/Phonepe)");
		System.out.println("3.Debit/Credit Card");
		choice=scan.nextInt();
		switch (choice)
		{
		case 1:System.out.println("Enter your UPI pin");
			   System.out.println("Payment "+amount2+" done Successfully");
			   break;
		case 2:System.out.println("Enter your UPI pin");
			   System.out.println("Payment "+amount2+" done Successfully");
			   break;
		case 3:System.out.println("Enter your Card details");
			   System.out.println("Payment "+amount2+" done Successfully");
			   break;
		default:System.out.println("Invalid Payment Method");	  
		}
		System.out.println("Your Tickets was Booked ");
		System.out.println("Thank You");
	}
}
