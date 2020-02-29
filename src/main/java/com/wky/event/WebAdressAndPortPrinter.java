package com.wky.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
@Slf4j
public class WebAdressAndPortPrinter implements ApplicationListener<WebServerInitializedEvent> {


    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        int port=event.getWebServer().getPort();
        log.info("web access url: http://{}:{}",getUrl(),port);
    }
    public String getUrl() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return address.getHostAddress();
    }
}
