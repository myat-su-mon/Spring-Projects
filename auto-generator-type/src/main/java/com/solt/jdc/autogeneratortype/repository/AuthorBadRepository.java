package com.solt.jdc.autogeneratortype.repository;

import com.solt.jdc.autogeneratortype.entity.AuthorBad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorBadRepository extends JpaRepository<AuthorBad, Long> {
}
