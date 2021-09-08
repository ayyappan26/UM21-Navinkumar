package project.aircraft.factory;

import project.aircraft.Dao;
import project.aircraft.FileSystemDao;

public class FileSystemFactory extends AbstractFactory{

	public Dao getDao() {
		return new FileSystemDao();
	}

}
