package project.aircraft.bo;

import project.aircraft.Dao;
import project.aircraft.factory.AbstractFactory;

public class AircraftBo {
	public void registerAircraft(){
		AbstractFactory fac=AbstractFactory.getFactory(1);
		Dao dao=fac.getDao();
		dao.registerAircraft();
		dao.viewAircraft();
	}

}
