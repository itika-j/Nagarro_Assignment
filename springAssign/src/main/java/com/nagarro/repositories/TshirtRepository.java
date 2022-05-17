package com.nagarro.repositories;

import com.nagarro.model.Tshirt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TshirtRepository extends CrudRepository<Tshirt, String> {

//    public Tshirt find (String name,String email);
//    @Query("select f from Tshirt as f where f.colour=?1 and f.size=?2  and f.gender_recommendation=?3 order by ?4 ASC")
    @Query(value = "select * from tshirt where colour=?1 and size=?2 and gender_recommendation=?3 order by ?4 ASC", nativeQuery = true)

    List<Tshirt> searchTshirts(String colour, String size, String gender_recommendation, String sortingType);

}
