package jsoft.objects;

public class HotelObject {
	private int hotel_id;
	private String hotel_name;
	private String hotel_detail;
	private String hotel_amenities;
	private boolean hotel_using;
	private short hotel_number_room;
	private byte hotel_number_people;
	private byte hotel_number_beds;
	private float hotel_length;
	private float hotel_width;
	private String hotel_map;
	private String hotel_address;
	private String hotel_city;
	private String hotel_manager_id;
	private String hotel_type;
	private String hotel_created_date;
	private String hotel_price;

	public int getHotel_id() {
		return hotel_id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public String getHotel_detail() {
		return hotel_detail;
	}

	public String getHotel_amenities() {
		return hotel_amenities;
	}

	public byte getHotel_number_people() {
		return hotel_number_people;
	}

	public byte getHotel_number_beds() {
		return hotel_number_beds;
	}

	public float getHotel_length() {
		return hotel_length;
	}

	public float getHotel_width() {
		return hotel_width;
	}

	public String getHotel_map() {
		return hotel_map;
	}

	public String getHotel_address() {
		return hotel_address;
	}

	public String getHotel_city() {
		return hotel_city;
	}

	public String getHotel_manager_id() {
		return hotel_manager_id;
	}

	public String getHotel_type() {
		return hotel_type;
	}

	public String getHotel_created_date() {
		return hotel_created_date;
	}

	public String getHotel_price() {
		return hotel_price;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public void setHotel_hotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public void setHotel_detail(String hotel_detail) {
		this.hotel_detail = hotel_detail;
	}

	public void setHotel_amenities(String hotel_amenities) {
		this.hotel_amenities = hotel_amenities;
	}

	public void setHotel_number_people(byte hotel_number_people) {
		this.hotel_number_people = hotel_number_people;
	}

	public void setHotel_number_beds(byte hotel_number_beds) {
		this.hotel_number_beds = hotel_number_beds;
	}

	public void setHotel_length(float hotel_length) {
		this.hotel_length = hotel_length;
	}

	public void setHotel_width(float hotel_width) {
		this.hotel_width = hotel_width;
	}

	public void setHotel_map(String hotel_map) {
		this.hotel_map = hotel_map;
	}

	public void setHotel_address(String hotel_address) {
		this.hotel_address = hotel_address;
	}

	public void setHotel_city(String hotel_city) {
		this.hotel_city = hotel_city;
	}

	public void setHotel_manager_id(String hotel_manager_id) {
		this.hotel_manager_id = hotel_manager_id;
	}

	public void setHotel_type(String hotel_type) {
		this.hotel_type = hotel_type;
	}

	public void setHotel_created_date(String hotel_created_date) {
		this.hotel_created_date = hotel_created_date;
	}

	public void setHotel_price(String hotel_price) {
		this.hotel_price = hotel_price;
	}

	public short getHotel_number_room() {
		return hotel_number_room;
	}

	public void setHotel_number_room(short hotel_number_room) {
		this.hotel_number_room = hotel_number_room;
	}

	public boolean isHotel_using() {
		return hotel_using;
	}

	public void setHotel_using(boolean hotel_using) {
		this.hotel_using = hotel_using;
	}
}
