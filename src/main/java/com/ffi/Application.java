package com.ffi;

import com.ffi.bookmark.Account;
import com.ffi.bookmark.AccountRepository;
import com.ffi.bookmark.Bookmark;
import com.ffi.bookmark.BookmarkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by crypt on 03/05/17.
 */
@SpringBootApplication
public class Application {
    public static void main(final String [] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    CommandLineRunner init(AccountRepository accountRepository,
                           BookmarkRepository bookmarkRepository) {
        return (evt) -> Arrays.asList(
                "jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
                .forEach(
                        a -> {
                            Account account = accountRepository.save(new Account(a,
                                    "password"));
                            bookmarkRepository.save(new Bookmark(account,
                                    "http://com.ffi.bookmark.com/1/" + a, "A description"));
                            bookmarkRepository.save(new Bookmark(account,
                                    "http://com.ffi.bookmark.com/2/" + a, "A description"));
                        });
    }
}
