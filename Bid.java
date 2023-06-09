import javax.management.StringValueExp;
import java.util.Comparator;

import static java.lang.System.out;

public class Bid {
	public SellersBids comparator;
	final public String name;
	private int bid;

	public int getBid(){
		return bid;
	}

	/**
	 * Uppdatering, added getName metod
	 * @return
	 */
	public String getName(){
		return name;
	}

	void setBid(int newBid){
		bid = newBid;
	}

	public Bid(String name, int bid) {
		this.name = name;
		this.bid = bid;
	}

	public int hashCode() {
		return 1 + 23*bid + 31*name.hashCode();
	}

	public boolean equals(Object obj){
		if (obj == null || !(obj instanceof Bid)) return false;
		try {
			Bid bid = (Bid) obj;

			if(comparator.compare(bid, this) == 0){
				return true;
			}
			else {
				return false;
			}

			}
		catch (Exception e) { // hitta en mer exakt exception
			// TODO: compare the objects
			throw new UnsupportedOperationException();
		}
	}
	
	public String toString(){

		String amount = String.valueOf(bid);
		
		return name + " has bid " + amount;

		// TODO: return a description of the bid

			//throw new UnsupportedOperationException();

	}
}

