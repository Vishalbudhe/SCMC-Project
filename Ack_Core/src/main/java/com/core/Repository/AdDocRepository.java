package com.core.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.core.entity.AdDocuments;


@Repository
public interface AdDocRepository extends JpaRepository<AdDocuments, Serializable>{

	

}
