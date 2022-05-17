package com.nagarro.services;

import com.nagarro.model.Tshirt;
import com.nagarro.repositories.TshirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class TshirtService {

    @Autowired
    private TshirtRepository tshirtRepository;

    // method to search all the flights
    public List<Tshirt> searchTshirts(String colour, String size, String gender_recommendation,
                                      String sortingType) throws ParseException {
        if(sortingType.equals("rating"))
            sortingType="rating";
        return tshirtRepository.searchTshirts(colour,size,gender_recommendation,sortingType);
    }

}
