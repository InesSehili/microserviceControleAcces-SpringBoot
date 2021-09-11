package org.sid.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.sid.entite.TableAccee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TableAcceeDao extends JpaRepository<TableAccee, Long>{
	@Query(value= "select * from tableaccee  ", nativeQuery = true)
	@Transactional
	public List<TableAccee> findByColonne ();
	
}
