package com.example.holamundo.repository;

import com.example.holamundo.dtos.EmpleadosPorPaisDto;
import com.example.holamundo.dtos.EmpleadosRegionDto;
import com.example.holamundo.entity.Employee;
import com.example.holamundo.entity.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Integer> {

    @Query(nativeQuery = true, value = "select * from shippers where CompanyName like %?1%")
    List<Shipper> buscarPorNombreParcial(String companyName);


}

