package jsoft.estate.room;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.javatuples.Pair;
import org.javatuples.Triplet;

import jsoft.ConnectionPool;
import jsoft.objects.RoomObject;

public class RoomModel {

	private RoomImpl ri;
	
	public RoomModel(ConnectionPool cp) {
		this.ri = new RoomImpl(cp);
	}
	
	public ConnectionPool getCP() {
		return this.ri.getCP();
	}
	
	public void releaseConenction() {
		this.ri.releaseConnection();
	}
	
	public RoomObject getRoom(int id) {
		ResultSet rs = this.ri.getRoom(id);
		RoomObject item = null;
		if(rs != null) {
			try {
				if(rs.next()) {
					item = new RoomObject();
					item.setRoom_id(rs.getInt("room_id"));
					item.setRoom_type(rs.getString("room_type"));
					item.setRoom_services(rs.getString("room_services"));
					item.setRoom_title(rs.getString("room_title"));
					item.setRoom_detail(rs.getString("room_detail"));
					item.setRoom_width(rs.getFloat("room_width"));
					item.setRoom_length(rs.getFloat("room_length"));
					item.setRoom_number_people(rs.getInt("room_number_people"));
					item.setRoom_number_bed(rs.getInt("room_number_bed"));
					item.setRoom_price(rs.getFloat("room_price"));
					item.setRoom_quality(rs.getFloat("room_quality"));
					item.setRoom_quantity(rs.getInt("room_quantity"));
					item.setRoom_static(rs.getString("room_static"));
					item.setRoom_address(rs.getString("room_address"));
					item.setRoom_image(rs.getString("room_image"));
					item.setRoom_enable(rs.getBoolean("room_enable"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return item;
	}
	
	public Pair<ArrayList<RoomObject>, Integer> getRooms(Triplet<RoomObject, Short, Byte> infors) {
		ArrayList<RoomObject> rooms = new ArrayList<>();
		ArrayList<ResultSet> res = this.ri.getRoomObjects(infors);
		ResultSet rs = res.get(0);
		RoomObject item = null;
		if(rs != null) {
			try {
				while(rs.next()) {
					item = new RoomObject();
					item.setRoom_id(rs.getInt("room_id"));
					item.setRoom_type(rs.getString("room_type"));
					item.setRoom_services(rs.getString("room_services"));
					item.setRoom_title(rs.getString("room_title"));
					item.setRoom_detail(rs.getString("room_detail"));
					item.setRoom_width(rs.getFloat("room_width"));
					item.setRoom_length(rs.getFloat("room_length"));
					item.setRoom_number_people(rs.getInt("room_number_people"));
					item.setRoom_number_bed(rs.getInt("room_number_bed"));
					item.setRoom_price(rs.getFloat("room_price"));
					item.setRoom_quality(rs.getFloat("room_quality"));
					item.setRoom_quantity(rs.getInt("room_quantity"));
					item.setRoom_static(rs.getString("room_static"));
					item.setRoom_address(rs.getString("room_address"));
					item.setRoom_image(rs.getString("room_image"));
					item.setRoom_enable(rs.getBoolean("room_enable"));
					rooms.add(item);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int total = 0;
		rs = res.get(1);
		if(rs != null) {
			try {
				if(rs.next()) {
					total = rs.getInt("total");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return new Pair<>(rooms, total);
	}
	
}
