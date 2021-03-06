package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.model.Token;
import ru.kpfu.itis.model.User;


@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findOneByUuid(String uuid);


}
