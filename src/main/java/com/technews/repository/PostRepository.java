package main.java.com.technews.repository;

import main.java.com.technews.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
    List<Post> findAllPostsByUserId(Integer id) throws Exception;


}
