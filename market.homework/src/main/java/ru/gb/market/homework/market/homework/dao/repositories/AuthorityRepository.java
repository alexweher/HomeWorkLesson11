package ru.gb.market.homework.market.homework.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gb.market.homework.market.homework.dao.entities.Authority;
@Repository
public interface AuthorityRepository extends CrudRepository<Authority, Long> {



}
