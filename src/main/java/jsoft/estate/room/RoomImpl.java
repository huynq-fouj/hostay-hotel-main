package jsoft.estate.room;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.javatuples.Triplet;

import jsoft.ConnectionPool;
import jsoft.estate.basic.BasicImpl;
import jsoft.objects.RoomObject;

public class RoomImpl extends BasicImpl implements Room {

	public RoomImpl(ConnectionPool cp) {
		super(cp, "Room");
	}

	@Override
	public ResultSet getRoom(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tblroom WHERE id=?";
		return this.get(sql, id);
	}

	@Override
	public ArrayList<ResultSet> getRoomObjects(Triplet<RoomObject, Short, Byte> infors) {
		// TODO Auto-generated method stub
		RoomObject similar = infors.getValue0();
		byte total = infors.getValue2();
		int at = (infors.getValue1() - 1) * total;
		StringBuilder sql = new StringBuilder();
		//Lấy danh sach phòng
		sql.append("SELECT * FROM tblroom WHERE room_enabe=1 ");
		sql.append(this.createConditions(similar));
		sql.append("LIMIT " + at + ", " + total);
		sql.append(";");
		//Lấy số lượng phòng
		sql.append("SELECT COUNT(*) AS total FROM tblroom WHERE room_enable=1 ");
		sql.append(this.createConditions(similar));
		sql.append(";");
		return this.getReList(sql.toString());
	}
	
	public StringBuilder createConditions(RoomObject similar) {
		StringBuilder tmp = new StringBuilder();
		
		return tmp;
	}
	
}
