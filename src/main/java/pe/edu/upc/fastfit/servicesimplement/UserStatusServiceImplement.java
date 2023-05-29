package pe.edu.upc.fastfit.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.fastfit.entities.UserStatus;
import pe.edu.upc.fastfit.repositories.IUserStatusRepository;
import pe.edu.upc.fastfit.services.IUserStatusService;
import java.util.List;
@Service
public class UserStatusServiceImplement implements IUserStatusService{

    @Autowired
    private IUserStatusRepository jH;

    @Override
    public void insert(UserStatus userStatus) {
        jH.save(userStatus);
    }

    @Override
    public List<UserStatus> list() {
        return jH.findAll();
    }

    @Override
    public void delete(int idUserStatus) {
        jH.deleteById(idUserStatus);
    }

    @Override
    public UserStatus listId(int idUserStatus) {
        return jH.findById(idUserStatus).orElse(new UserStatus());
    }
}
