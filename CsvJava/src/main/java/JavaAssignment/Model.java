package JavaAssignment;


class Model {

	private String ID;
	private String Name;
	private String Colour;
	private String gender;
	private String Size;
	private float Price;
	private float Rating;
	private String Availability;

	public Model() {
	}

	public Model(String ID, String Name, String Colour, String gender, String Size, float Price,
			float Rating, String Availability) {
		this.ID = ID;
		this.Name = Name;
		this.Colour = Colour;
		this.gender = gender;
		this.Size = Size;
		this.Price = Price;
		this.Rating = Rating;
		this.Availability = Availability;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getColour() {
		return Colour;
	}

	public void setColour(String Colour) {
		this.Colour = Colour;
	}

	public String getgender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String Size) {
		this.Size = Size;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(float Price) {
		this.Price = Price;
	}

	public double getRating() {
		return Rating;
	}

	public void setRating(float Rating) {
		this.Rating = Rating;
	}

	public String getAvailability() {
		return Availability;
	}

	public void Availability(String Availability) {
		this.Availability = Availability;
	}

}