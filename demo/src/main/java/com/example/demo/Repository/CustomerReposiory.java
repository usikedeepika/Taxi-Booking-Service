package com.example.demo.Repository;

import com.example.demo.Enum.Gender;
import com.example.demo.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerReposiory  extends JpaRepository<Customer,Integer> {
   public  List<Customer> findByGenderAndAge(Gender gender,int age) ;

   @Query("SELECT c FROM Customer c WHERE c.age > :myAge AND c.gender = :myGender")
   public List<Customer> getCustomerAgeGreaterGender(@Param("myGender") Gender gender,@Param("myAge") int age);


   @Query(value = "SELECT * FROM customer WHERE gender = :myGender AND age < :myAge", nativeQuery = true)
   public List<Customer> getCustomerAgeLessGender(@Param("myGender") String gender,@Param("myAge") int age);



}
