public class Address{
        private String street;
        private String city;
        private int	pincode;
        private String country;	
		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		void displayAddress() {
			System.out.println("Street: " + getStreet());
			System.out.println("City: " + getCity());
			System.out.println("Pincode: " + getPincode());
			System.out.println("Country: " + getCountry());
		}
}