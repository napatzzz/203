package org.example.int203.repositoties;

import org.example.int203.entities.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepo extends JpaRepository<Channel, Integer> {
}
