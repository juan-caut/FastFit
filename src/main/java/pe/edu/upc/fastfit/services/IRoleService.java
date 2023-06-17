package pe.edu.upc.fastfit.services;


import pe.edu.upc.fastfit.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();
}
