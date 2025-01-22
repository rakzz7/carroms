package com.rakesh.carroms.game.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.carroms.game.entities.StrikeLogs;

@Repository
public interface StrikeLogsDao extends CrudRepository<StrikeLogs,Integer > {

    List<StrikeLogs> findAllBySide(String string);

}
