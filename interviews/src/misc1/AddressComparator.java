package misc1;

import java.util.Comparator;

public class AddressComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return -o1.empAddress.compareTo(o2.empAddress);
	}

}
