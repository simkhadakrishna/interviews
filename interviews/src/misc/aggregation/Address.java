/**
 * This example shows the aggregatiion between Address and Student classes. Aggregation is a one way Association.
 * It represents a has a relatioship. We can maintain code re-usability by using aggregation.
 */
package misc.aggregation;

public class Address {
	int streetNo;
	String city;
	String State;
	String country;
	public Address(int streetNo, String city, String state, String country) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		State = state;
		this.country = country;
	}
	

}
