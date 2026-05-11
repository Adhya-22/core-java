package com.xwork.practiceInterface.runner;

import com.xwork.practiceInterface.interfacesClasses.Creator;
import com.xwork.practiceInterface.interfacesClasses.YouTubeChannel;

public class YoutubeChannelRunner {

    public static void main(String[] args) {

        YouTubeChannel youTubeChannel = new Creator();

        youTubeChannel.uploadVideo();
        youTubeChannel.livestream();
        youTubeChannel.likeVideo();
        youTubeChannel.commentVideo();

        YouTubeChannel.channelInfo();
    }
}
