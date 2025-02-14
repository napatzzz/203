package org.example.int203.repositoties;

import org.example.int203.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepo extends JpaRepository<Reply, Integer> {
}
