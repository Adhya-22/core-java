package com.xwork.practiceInterface.interfacesClasses;

public interface YouTubeChannel {

    int subscribers = 100000;
    String channelName = "Tech World";
    float rating = 4.8f;

    void uploadVideo();
    void livestream();

    default void likeVideo() {
        System.out.println("running like video in youtube channel interface");
    }

    default void commentVideo() {
        System.out.println("running comment video in youtube channel interface");
    }

    static void channelInfo() {
        System.out.println("running channel info in youtube channel interface");
    }
}
