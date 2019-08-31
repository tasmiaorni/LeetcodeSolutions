
public class DefangingIPaddress {
	public String defangIPaddr(String address) {
        String newAddress=address.replace(".","[.]");
        return newAddress;
    }
	public static void main(String[] args) {
		String address = "255.100.50.0";
		DefangingIPaddress in= new DefangingIPaddress();
		System.out.print(in.defangIPaddr(address));

	}

}
