package com.core.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.core.entity.RdDocuments;

@Repository
public interface RdDocRepository extends JpaRepository<RdDocuments, Long>{
	
	

}
