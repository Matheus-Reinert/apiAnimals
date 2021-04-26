package com.example.animals.api.repository;

import com.example.animals.api.model.Animal;
import com.example.animals.api.model.AnimalClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {


}
