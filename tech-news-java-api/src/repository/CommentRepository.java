package repository;

import com.technews.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface CommentRepository extends JpaRepository< comment, integer >{

    List<Comment> findAllCommentsByPostId(int postId);


}
