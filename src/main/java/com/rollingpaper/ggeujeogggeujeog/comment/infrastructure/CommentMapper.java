package com.rollingpaper.ggeujeogggeujeog.comment.infrastructure;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.rollingpaper.ggeujeogggeujeog.comment.domain.Comment;

@Mapper
public interface CommentMapper {

	void save(Comment comment);

	Optional<Comment> findByPaperId(Long paperId);

	List<Comment> findAllByUserId(Long userId, int page);

	void delete(Long paperId);

	void update(Comment comment);
}
