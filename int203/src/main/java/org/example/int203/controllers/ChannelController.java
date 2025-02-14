package org.example.int203.controllers;

import org.example.int203.entities.Branch;
import org.example.int203.entities.Channel;
import org.example.int203.services.BranchService;
import org.example.int203.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/channel")
public class ChannelController {
    @Autowired
    private ChannelService channelService;
    @Autowired
    private BranchService branchService;

}
