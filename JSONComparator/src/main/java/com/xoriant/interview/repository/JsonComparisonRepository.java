package com.xoriant.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xoriant.interview.model.BaseJsonData;

@Repository
public interface JsonComparisonRepository extends JpaRepository<BaseJsonData, Long> {

}
