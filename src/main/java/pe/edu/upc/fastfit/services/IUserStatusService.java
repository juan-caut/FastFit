package pe.edu.upc.fastfit.services;
import pe.edu.upc.fastfit.entities.UserStatus;

import java.util.List;
public interface IUserStatusService {

    public void insert(UserStatus userStatus);
    List<UserStatus> list();
    public void delete(int idUserStatus);
    public UserStatus listId(int idUserStatus);
}
