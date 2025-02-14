package org.example.int203.services;

import org.example.int203.entities.Channel;
import org.example.int203.repositoties.ChannelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelService {
    @Autowired
    private ChannelRepo channelRepo;

    public List<Channel> getAllChannels() {
        return channelRepo.findAll();
    }

    public Channel saveChannel(Channel channel) {
        return channelRepo.save(channel);
    }
}
