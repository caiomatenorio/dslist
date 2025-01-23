package com.caiomatenorio.dslist.repository;

import com.caiomatenorio.dslist.entity.Belonging;
import com.caiomatenorio.dslist.entity.BelongingPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK> {
}
