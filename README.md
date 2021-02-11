# BestPrice

This have sample BestPrice java program. Which can run standalone. Any java version is fine.

Candidate need to implement getBestPrice function which will take input as FlightsList,OriginAirport,DestinationAirport and return best price from list of flights.


Use Case:

  List of Flights
		Flight [originAirport=IAD, destinationAirport=SFO, price=$400.0, distance=3000 miles]
		
		Flight [originAirport=IAD, destinationAirport=JFK, price=$180.5, distance=1000 miles]
		
		Flight [originAirport=JFK, destinationAirport=SFO, price=$185.0, distance=1500 miles]
		
		Flight [originAirport=IAD, destinationAirport=ORD, price=$190.0, distance=2500 miles]
		
		Flight [originAirport=ORD, destinationAirport=LAX, price=$20.0, distance=2000 miles]
		
		Flight [originAirport=ORD, destinationAirport=SFO, price=$160.0, distance=2000 miles]
		
		Flight [originAirport=ORD, destinationAirport=LAX, price=$80.0, distance=500 miles]
		
		Flight [originAirport=LAX, destinationAirport=SFO, price=$50.0, distance=200 miles]
		
		Flight [originAirport=ORD, destinationAirport=DFW, price=$150.0, distance=200 miles]
		
		Flight [originAirport=JFK, destinationAirport=DFW, price=$50.0, distance=200 miles]
		
		Flight [originAirport=IAD, destinationAirport=LHR, price=$700.0, distance=3500 miles]
		
		
  Based on list of above flights. These are flight combination possible if i want to go from originAirport IAD to destinationAirport SFO 
		  
		  IAD-SFO -> $400
		  
		  IAD-JFK-SFO -> 180.5+185.0 = $365.5
		  
		  IAD-ORD-SFO -> 190.0+160.0 = $350.0
		  
		  IAD-ORD-LAX-SFO -> 190.0+20.0+50.0=$260.0
		  
		  IAD-ORD-LAX-SFO -> 190.0+80.0+50.0=$320.0
		  
      
 If we call function getBestPrice from originAirport IAD to destinationAirport SFO  it should give me result $260.0
 
 If we call function getBestPrice from originAirport ORD to destinationAirport SFO  it should give me result $70.0
 
 
 *Candidate can write jnuit to test their code
 
      
		
