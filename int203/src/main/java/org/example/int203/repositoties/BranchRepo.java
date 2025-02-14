package org.example.int203.repositoties;

import org.example.int203.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepo extends JpaRepository<Branch, Integer> {
}
