package com.rollingpaper.ggeujeogggeujeog.user.infrastructure;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.rollingpaper.ggeujeogggeujeog.user.domain.User;

@Mapper
public interface UserMapper {

	void save(User user);

	void delete(Long id);

	void update(User user);

	Optional<User> findByEmail(String email);

	Optional<User> findById(Long id);
}
