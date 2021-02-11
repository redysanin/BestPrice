import java.util.ArrayList;
import java.util.List;
public class BestPrice {
	
	static List<Flight> flightList = new ArrayList<Flight>();	
	static {
		flightList.add(new Flight("IAD", "SFO", 400, 3000));
		flightList.add(new Flight("IAD", "JFK", 180.50, 1000));
		flightList.add(new Flight("JFK", "SFO", 185, 1500));
		flightList.add(new Flight("IAD", "ORD", 190, 2500));
		flightList.add(new Flight("ORD", "LAX", 20, 2000));
		flightList.add(new Flight("ORD", "SFO", 160, 2000));
		flightList.add(new Flight("ORD", "LAX", 80, 500));
		flightList.add(new Flight("LAX", "SFO", 50, 200));
		flightList.add(new Flight("ORD", "DFW", 150, 200));
		flightList.add(new Flight("JFK", "DFW", 50, 200));
		flightList.add(new Flight("IAD", "LHR", 700, 3500));				
	}
	
	/**
	 * @param flightList . All input list of flights
	 * @param originAirport. Origin airport example IAD
	 * @param destinationAirport. Destination airport example SFO
	 * @return Best Price based on All input list of flights,Origin airport and Destination airport.
	 */
	public double getBestPrice(List<Flight> flightList,String originAirport,String destinationAirport) {
		// Implement this function that will return best price 		
		//candidates can write there code here.
		
		
		return 0;
	}

	public static void main(String[] args) {
		
		
		/* Flight List
		flight=Flight [originAirport=IAD, destinationAirport=SFO, price=$400.0, distance=3000 miles]
		flight=Flight [originAirport=IAD, destinationAirport=JFK, price=$180.5, distance=1000 miles]
		flight=Flight [originAirport=JFK, destinationAirport=SFO, price=$185.0, distance=1500 miles]
		flight=Flight [originAirport=IAD, destinationAirport=ORD, price=$190.0, distance=2500 miles]
		flight=Flight [originAirport=ORD, destinationAirport=LAX, price=$20.0, distance=2000 miles]
		flight=Flight [originAirport=ORD, destinationAirport=SFO, price=$160.0, distance=2000 miles]
		flight=Flight [originAirport=ORD, destinationAirport=LAX, price=$80.0, distance=500 miles]
		flight=Flight [originAirport=LAX, destinationAirport=SFO, price=$50.0, distance=200 miles]
		flight=Flight [originAirport=ORD, destinationAirport=DFW, price=$150.0, distance=200 miles]
		flight=Flight [originAirport=JFK, destinationAirport=DFW, price=$50.0, distance=200 miles]
		flight=Flight [originAirport=IAD, destinationAirport=LHR, price=$700.0, distance=3500 miles]
		*/
		
		/*
		 *  Based on list of above flights. These are flight combination possible if i want to go from originAirport IAD to destinationAirport SFO 
		 *  IAD-SFO -> $400
		 *  IAD-JFK-SFO -> 180.5+185.0 = $365.5
		 *  IAD-ORD-SFO -> 190.0+160.0 = $350.0
		 *  IAD-ORD-LAX-SFO -> 190.0+20.0+50.0=$260.0
		 *  IAD-ORD-LAX-SFO -> 190.0+80.0+50.0=$320.0		 *  
		 */
		
		
		/**
		 * Based on above calculation it should return value $260.0 if i am going from IAD to SFO
		 */
		double minPriceIadSfo=new BestPrice().getBestPrice(flightList,"IAD","SFO");		
		//expect minPriceIadSfo $260.0
		System.out.println("Price from IAD to SFO is: $"+minPriceIadSfo); 
		
		
		/**
		 * Based on above calculation it should return value $70.0 if i am going from ORD to SFO
		 */
		double minPriceOrdSfo=new BestPrice().getBestPrice(flightList,"ORD","SFO");		
		//expect minPriceOrdSfo $70.0
		System.out.println("Price from ORD to SFO is: $"+minPriceOrdSfo); 
				
	}

	static class Flight {
		public Flight(String originAirport, String destinationAirport, double price, long distance) {
			this.originAirport = originAirport;
			this.destinationAirport = destinationAirport;
			this.price = price;
			this.distance = distance;
		}

		private final String originAirport;
		private final String destinationAirport;
		private final double price;
		private final long distance;
		
		public String getOriginAirport() {
			return originAirport;
		}

		public String getDestinationAirport() {
			return destinationAirport;
		}

		public double getPrice() {
			return price;
		}

		public long getDistance() {
			return distance;
		}

		@Override
		public String toString() {
			return "Flight [originAirport=" + originAirport + ", destinationAirport=" + destinationAirport + ", price=$"
					+ price + ", distance=" + distance + " miles]";
		}
	}

}