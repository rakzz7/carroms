package com.rakesh.carroms.game.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.carroms.game.entities.GamePlayerDetails;

@Repository
public interface GamePlayerDetailsDao extends CrudRepository<GamePlayerDetails,Integer> {

}
