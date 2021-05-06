package com.sds3.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sds3.dsvendas.entities.Sale;

/***
 * 
 * @author dionatan
 *
 */

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
