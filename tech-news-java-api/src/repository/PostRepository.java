package repository;

import model.Post;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
    List<Post> findAllPostsByUserId(Integer id) throws Exception;


}
