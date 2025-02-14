package org.example.int203.services;

import org.example.int203.entities.Branch;
import org.example.int203.repositoties.BranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {
    @Autowired
    private BranchRepo branchRepo;
    public List<Branch> getAllBranches() {
        return branchRepo.findAll();
    }
    public Branch addBranch(Branch branch) {
        return branchRepo.save(branch);
    }
}
