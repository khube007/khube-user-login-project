package org.kk.spring.boot.repository;

import org.kk.spring.boot.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>, CrudRepository<Address, Long>{

}
