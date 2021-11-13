package com.besafx.app.switchdatasource.repository;

import com.besafx.app.switchdatasource.model.Client;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends PagingAndSortingRepository<Client, String>, JpaSpecificationExecutor<Client> {


}

