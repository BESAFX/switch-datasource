package com.besafx.app.switchdatasource.repository;

import com.besafx.app.switchdatasource.model.SwitchDatasource;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchDatasourceRepository extends PagingAndSortingRepository<SwitchDatasource, String>, JpaSpecificationExecutor<SwitchDatasource> {


}

