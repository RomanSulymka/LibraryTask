package com.task.romansulymka.onlinelibrary.dao;

import com.task.romansulymka.onlinelibrary.dao.entity.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository  extends CrudRepository<Subscription, Long> {
}
