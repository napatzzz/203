package org.example.int203.controllers;

import org.example.int203.entities.Branch;
import org.example.int203.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branch/")
public class BranchController {
    @Autowired
    private BranchService branchService;
    @GetMapping("")
    public ResponseEntity<List<Branch>> getBranch() {
        return ResponseEntity.ok().body(branchService.getAllBranches());
    }

    @PostMapping("")
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) {
        return ResponseEntity.ok().body(branchService.addBranch(branch));
    }
}
