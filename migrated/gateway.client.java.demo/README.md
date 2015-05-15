Java WebSocket Client Demo
========================
[![Build Status][build-status-image]][build-status]

[build-status-image]: https://travis-ci.org/kaazing/gateway.client.java.demo-1.svg?branch=develop
[build-status]: https://travis-ci.org/kaazing/gateway.client.java.demo-1


About this Project
------------------
This is a simple maven-based project that shows how to use Kaazing WebSocket Java Client library!

Requirements
------------
* Java SE Development Kit (JDK) 7 or higher
* Maven 3.0.5 or higher

Steps for building this project
--------------------------------
0. Clone the repo: ```git clone https://github.com/kaazing/gateway.client.java.demo.git```
0. Go to the cloned directory: ```cd gateway.client.java.demo```
0. Build the project: ```mvn clean install```

Running the demo from the command-line
---------------------------------------
0. Go to the target directory: ```cd target```
0. Run the demo application: ```java -cp . -jar gateway.client.java.demo<-5.0.0.1-SNAPSHOT>.jar```

Running the demo from within Eclipse
------------------------------------
0. Import the project in Eclipse
0. Right-click on WebSocketFrame.java or WebSocketApplet.java under src/main/java/org.kaazing.net.ws.demo and run!