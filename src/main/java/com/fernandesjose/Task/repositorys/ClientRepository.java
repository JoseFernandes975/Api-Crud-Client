package com.fernandesjose.Task.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernandesjose.Task.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
