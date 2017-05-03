package bookmark;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by crypt on 03/05/17.
 */

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}

