package com.rollingpaper.ggeujeogggeujeog.notification.infrastructure;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.rollingpaper.ggeujeogggeujeog.notification.domain.Notification;

@Mapper
public interface NotificationMapper {

	List<Notification> findAllByUserId(Long userId);

	Optional<Notification> findNotificationById(Long notificationId);

	void update(Notification notification);

	void saveEntity(Notification notification);
}
