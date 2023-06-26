package com.ww.channel;

import lombok.Data;

import java.util.Set;

@Data
public class ChannelMetaData {
    private String channelId;
    private String creatorId;
    private long createTimestamp;
    private long maxMsgId;
    private Set<String> memberIds;
}
