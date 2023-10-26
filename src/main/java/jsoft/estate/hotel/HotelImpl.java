package jsoft.estate.hotel;

import jsoft.ConnectionPool;
import jsoft.estate.basic.BasicImpl;

public class HotelImpl extends BasicImpl implements Hotel {
	
	public HotelImpl(ConnectionPool cp) {
		super(cp, "RoomObject");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ConnectionPool getCP() {
		// TODO Auto-generated method stub
		return this.getCP();
	}

	@Override
	public void releaseConnection() {
		// TODO Auto-generated method stub
		this.releaseConnection();
	}

}
