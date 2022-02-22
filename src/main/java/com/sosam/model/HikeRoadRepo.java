package com.sosam.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HikeRoadRepo extends JpaRepository<HikeRoad, String>{

	Optional<List<HikeRoad>> findBymcode(String mCode);

}
