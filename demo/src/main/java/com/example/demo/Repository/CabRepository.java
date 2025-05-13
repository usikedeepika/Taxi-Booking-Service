package com.example.demo.Repository;

import com.example.demo.Model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRepository  extends JpaRepository<Cab,Integer> {

    @Query("select c from Cab c  where c.available=true order by rand() LIMIT 1")
    public  Cab getAvailableCab();
}
