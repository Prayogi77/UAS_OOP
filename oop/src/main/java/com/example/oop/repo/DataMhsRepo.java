package com.example.oop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.oop.entity.DataMhs;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}