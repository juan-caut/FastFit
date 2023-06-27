package pe.edu.upc.fastfit.services;
import pe.edu.upc.fastfit.entities.Users;

import java.util.List;


public interface IUserService {
	public Integer insert(Users user);

	List<Users> list();
	public void insertarFinal(Users user);

}
