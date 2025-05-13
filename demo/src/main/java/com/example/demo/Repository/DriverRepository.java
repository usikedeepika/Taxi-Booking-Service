package com.example.demo.Repository;

import com.example.demo.Model.Driver;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer> {


    @Query (value = "select * from driver where cab_id=:myCabId",nativeQuery = true)
    public Driver getDriverByCabId(@Param("myCabId") int cabId);
}
