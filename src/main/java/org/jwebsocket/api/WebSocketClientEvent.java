//  ---------------------------------------------------------------------------
//  jWebSocket - Copyright (c) 2010 Innotrade GmbH
//  ---------------------------------------------------------------------------
//  This program is free software; you can redistribute it and/or modify it
//  under the terms of the GNU Lesser General Public License as published by the
//  Free Software Foundation; either version 3 of the License, or (at your
//  option) any later version.
//  This program is distributed in the hope that it will be useful, but WITHOUT
//  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//  FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//  more details.
//  You should have received a copy of the GNU Lesser General Public License along
//  with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//  ---------------------------------------------------------------------------
package org.jwebsocket.api;

/**
 * Base interface jWebSocket events
 *
 * @author puran
 * @author aschulze
 * @version $Id: WebSocketClientEvent.java 702 2010-07-18 17:54:17Z
 * mailtopuran@gmail.com $
 */
public interface WebSocketClientEvent {

    /**
     * Returns the name of the event.
     *
     * @return
     */
    String getName();

    /**
     * Returns the data (usually a message) for the event.
     *
     * @return
     */
    String getData();

    /**
     * Returns the WebSocket client which fired the event.
     *
     * @return
     */
    WebSocketClient getClient();
}
