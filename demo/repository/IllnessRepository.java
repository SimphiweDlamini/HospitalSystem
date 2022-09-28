package com.demo.repository;

import com.demo.model.Illness;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IllnessRepository extends CrudRepository<Illness,Long> {
    @Query("from Illness i")
    public List<Illness> fetchAllIllness();
}
