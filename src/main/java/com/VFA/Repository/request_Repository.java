package com.VFA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VFA.Model.requestBean;

public interface request_Repository extends JpaRepository<requestBean, Long> {

}
