package com.aircraft.abstractair;

import com.aircraft.dao.AircraftIDao;

public abstract class AbstractAircraft {
	public abstract AircraftIDao getDao();
	public static AbstractAircraft getAircraft(int c){
		AbstractAircraft craft=null;
		switch(c){
		case 1:
			craft=new OracleAircraft();
			break;
		case 2:
			craft=new SqlAircraft();
			break;
		case 3:
			craft=new FileSystemAircraft();
			break;
		}
		return craft;
		
	}
	

}
