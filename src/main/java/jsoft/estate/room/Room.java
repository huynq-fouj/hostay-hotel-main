package jsoft.estate.room;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.javatuples.Triplet;

import jsoft.ShareControl;
import jsoft.objects.RoomObject;

public interface Room extends ShareControl {
	
	public ResultSet getRoom(int id);
	public ArrayList<ResultSet> getRoomObjects(Triplet<RoomObject, Short, Byte> infors);
	
}
