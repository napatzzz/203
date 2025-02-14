package org.example.int203.controllers;

import org.example.int203.entities.Branch;
import org.example.int203.entities.Channel;
import org.example.int203.services.BranchService;
import org.example.int203.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branch/")
public class BranchController {
    @Autowired
    private BranchService branchService;
    @Autowired
    private ChannelService channelService;
    @GetMapping("")
    public ResponseEntity<List<Branch>> getBranch() {
        return ResponseEntity.ok().body(branchService.getAllBranches());
    }

    @PostMapping("")
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) {
        return ResponseEntity.ok().body(branchService.addBranch(branch));
    }

    @PostMapping("{branch_id}/channels")
    public Channel createChannel(@PathVariable Integer branch_id, @RequestBody Channel channel) {
        Branch branch = branchService.findById(branch_id);
        if(branch == null) {
            throw new ResourceNotFoundException("Branch not found");
        }
        channel.setBranch(branch);
        return channelService.saveChannel(channel);
    }
}
