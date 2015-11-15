package com.example.repository;

import com.example.domain.Team;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by BoBinLee on 2015. 11. 8..
 */
public interface TeamRepository extends CrudRepository<Team, Integer> {
}
