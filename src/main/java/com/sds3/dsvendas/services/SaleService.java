package com.sds3.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sds3.dsvendas.dto.SaleDTO;
import com.sds3.dsvendas.entities.Sale;
import com.sds3.dsvendas.repositories.SaleRepository;
import com.sds3.dsvendas.repositories.SellerRepository;

/***
 * 
 * @author dionatan
 *
 */

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
}