package model.estrutura;

/**
 * Represents a router that manages multiple protocols and their associated data
 * queues.
 * The router provides functionality to add data to specific protocols and read
 * data
 * from protocol queues following FIFO principles.
 * 
 * <p>
 * This class acts as a facade that coordinates between the protocol management
 * system and the data storage mechanism.
 * </p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class Router {
	ProtocolList newProtocolList;

	/**
	 * Constructs a new Router with an empty protocol list.
	 * Initializes the internal protocol management system.
	 */
	public Router() {
		this.newProtocolList = new ProtocolList();
	}

	/**
	 * Adds data to the specified protocol type.
	 * If the protocol doesn't exist, it will be created automatically.
	 * The data is written to the protocol's FIFO data queue.
	 *
	 * @param type the protocol type to which the data should be added
	 * @param data the data to be added to the protocol's queue
	 */
	public void addData(String type, String data) {
		Protocol protocol = this.newProtocolList.getOrAddProtocol(type, data);

		DataList addData = protocol.getDataList();

		addData.writeData(data);

	}

	/**
	 * Reads and removes data from the specified protocol's queue.
	 * If the protocol's queue becomes empty after reading, the protocol
	 * is automatically removed from the system.
	 *
	 * @param type the protocol type from which to read data
	 * @return the data read from the protocol's queue, or a message indicating
	 *         the protocol was removed if the queue is empty
	 * @throws IllegalArgumentException if no protocols exist in the system
	 *                                  or if the specified protocol doesn't exist
	 */
	public String readData(String type) throws IllegalArgumentException {
		if (this.newProtocolList == null) {
			throw new IllegalArgumentException("Nao existem protocolos no momento...");
		}

		Protocol protocol = this.newProtocolList.get(type);

		if (protocol == null) {
			throw new IllegalArgumentException("Protocolo nao existe no sistema...");
		}

		DataList toRead = protocol.getDataList();

		String buffer = toRead.readData();

		if (buffer.equals("empty.!.")) {
			this.newProtocolList.remove(type);
			return "Nada para ler, excluindo o protocolo...";
		}

		return buffer;

	}

}
