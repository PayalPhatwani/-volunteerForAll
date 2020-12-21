package com.VFA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VFA.Model.volunteerBean;

@Repository
public interface volunteer_Repository extends JpaRepository<volunteerBean, Long>{

	
}
