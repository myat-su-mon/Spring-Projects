package com.solt.jdc.autogeneratortype.repository;

import com.solt.jdc.autogeneratortype.entity.AuthorGood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorGoodRepository extends JpaRepository<AuthorGood, Long> {
}
