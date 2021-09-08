package project.aircraft.factory;

import project.aircraft.Dao;
import project.aircraft.OracleDao;

public class OracleFactory extends AbstractFactory {

	public Dao getDao() {
		
		return new OracleDao();
	}

}
