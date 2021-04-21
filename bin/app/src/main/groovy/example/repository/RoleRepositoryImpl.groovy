package example.repository;

import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

    @Override
    public List<String> findAll(){
      String[] arr = ["ADMIN","SUPER","USER"] as String[];
      return Arrays.asList(arr);
    }
}
