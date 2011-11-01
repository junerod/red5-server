package org.red5.server.stream.bandwidth;

import org.red5.server.api.IConnection;

/**
 * 
 * @author The Red5 Project (red5@osflash.org)
 * @author Dan Rossi
 */
public interface IBandwidthDetection {
	
	public void checkBandwidth(IConnection conn);

	public void calculateClientBw(IConnection conn);
	
}