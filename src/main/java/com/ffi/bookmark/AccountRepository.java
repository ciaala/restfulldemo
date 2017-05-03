package com.ffi.bookmark;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by crypt on 03/05/17.
 */

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}