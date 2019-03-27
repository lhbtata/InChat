package com.myself.nettychat.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import com.myself.nettychat.common.enums.ProtocolEnum;
import com.myself.nettychat.common.mqtts.MqttHander;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 10:54 2018\8\14 0014
 */
@Data
@ConfigurationProperties(prefix = "netty")
public class InitNetty {

    private ProtocolEnum protocol;

    private int webport;

    private int tcpport;

    private int mqttport;

    private int bossThread;

    private int workerThread;

    private boolean keepalive;

    private int backlog;

    private boolean nodelay;

    private boolean reuseaddr;

    private String serverName ;

    private  int  sndbuf ;

    private int revbuf ;

    private int heart ;

    private boolean ssl ;

    private String jksFile;

    private String jksStorePassword;

    private String jksCertificatePassword;

    private Class<MqttHander> mqttHander ;

    private int  initalDelay ;

    private  int period ;

    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public int getWebport() {
        return webport;
    }

    public void setWebport(int webport) {
        this.webport = webport;
    }

    public int getTcpport() {
        return tcpport;
    }

    public void setTcpport(int tcpport) {
        this.tcpport = tcpport;
    }

    public int getMqttport() {
        return mqttport;
    }

    public void setMqttport(int mqttport) {
        this.mqttport = mqttport;
    }

    public int getBossThread() {
        return bossThread;
    }

    public void setBossThread(int bossThread) {
        this.bossThread = bossThread;
    }

    public int getWorkerThread() {
        return workerThread;
    }

    public void setWorkerThread(int workerThread) {
        this.workerThread = workerThread;
    }

    public boolean isKeepalive() {
        return keepalive;
    }

    public void setKeepalive(boolean keepalive) {
        this.keepalive = keepalive;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public boolean isNodelay() {
        return nodelay;
    }

    public void setNodelay(boolean nodelay) {
        this.nodelay = nodelay;
    }

    public boolean isReuseaddr() {
        return reuseaddr;
    }

    public void setReuseaddr(boolean reuseaddr) {
        this.reuseaddr = reuseaddr;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getSndbuf() {
        return sndbuf;
    }

    public void setSndbuf(int sndbuf) {
        this.sndbuf = sndbuf;
    }

    public int getRevbuf() {
        return revbuf;
    }

    public void setRevbuf(int revbuf) {
        this.revbuf = revbuf;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public String getJksFile() {
        return jksFile;
    }

    public void setJksFile(String jksFile) {
        this.jksFile = jksFile;
    }

    public String getJksStorePassword() {
        return jksStorePassword;
    }

    public void setJksStorePassword(String jksStorePassword) {
        this.jksStorePassword = jksStorePassword;
    }

    public String getJksCertificatePassword() {
        return jksCertificatePassword;
    }

    public void setJksCertificatePassword(String jksCertificatePassword) {
        this.jksCertificatePassword = jksCertificatePassword;
    }

    public Class<MqttHander> getMqttHander() {
        return mqttHander;
    }

    public void setMqttHander(Class<MqttHander> mqttHander) {
        this.mqttHander = mqttHander;
    }

    public int getInitalDelay() {
        return initalDelay;
    }

    public void setInitalDelay(int initalDelay) {
        this.initalDelay = initalDelay;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
