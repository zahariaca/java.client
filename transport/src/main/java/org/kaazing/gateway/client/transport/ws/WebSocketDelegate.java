/**
 * Copyright 2007-2015, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.gateway.client.transport.ws;

import java.io.IOException;
import java.nio.ByteBuffer;

import org.kaazing.gateway.client.transport.BridgeDelegate;

public interface WebSocketDelegate extends BridgeDelegate {

    void processOpen();
    void processAuthorize(String string);
    void processDisconnect() throws IOException;
    void processDisconnect(short code, String reason) throws IOException; //add code and reason
    void processSend(ByteBuffer byteBuffer);
    void processSend(String text); //add this method to send text frame message
    
    void setListener(WebSocketDelegateListener listener);
    void setIdleTimeout(int timeout); //set WebSocket idle timeout in miliseconds
}