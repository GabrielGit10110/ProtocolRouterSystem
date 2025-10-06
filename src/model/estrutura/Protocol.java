package model.estrutura;

/**
 * Represents a protocol node in a doubly linked list structure with an embedded
 * FIFO data queue.
 * Each protocol node contains type information, data, and maintains a FIFO data
 * list
 * for additional data storage and processing.
 * 
 * <p>
 * This class is designed for protocol management systems where each protocol
 * can have its own queue of data packets or messages.
 * </p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class Protocol {
	private String type;
	private String data;
	private Protocol nextProtocol;
	private Protocol previousProtocol;
	private DataList dataList; // lista FIFO simples

	/**
	 * Constructs a new Protocol node with the specified type and data.
	 * Initializes next and previous protocol references to null and creates
	 * an empty FIFO data list for additional data storage.
	 *
	 * @param type the protocol type identifier
	 * @param data the primary data associated with this protocol
	 */
	// criar nó com tipo especifico
	// e os dados que entrarão no nó
	public Protocol(String type, String data) {
		this.type = type;
		this.data = data;
		this.nextProtocol = null;
		this.previousProtocol = null;
		this.dataList = new DataList();

	}

	/**
	 * Returns the protocol type identifier.
	 *
	 * @return the protocol type
	 */
	public String getType() {
		return this.type;

	}

	/**
	 * Sets the protocol type identifier.
	 *
	 * @param type the new protocol type
	 */
	public void setType(String type) {
		this.type = type;

	}

	/**
	 * Returns the primary data associated with this protocol.
	 *
	 * @return the primary data
	 */
	public String getData() {
		return this.data;

	}

	/**
	 * Sets the primary data for this protocol.
	 *
	 * @param data the new primary data
	 */
	public void setData(String data) {
		this.data = data;

	}

	/**
	 * Returns the next protocol node in the sequence.
	 *
	 * @return the next protocol node, or null if this is the last node
	 */
	public Protocol getNextProtocol() {
		return this.nextProtocol;

	}

	/**
	 * Sets the reference to the next protocol node in the sequence.
	 *
	 * @param nextProtocol the next protocol node, or null to make this the last
	 *                     node
	 */
	public void setNextProtocol(Protocol nextProtocol) {
		this.nextProtocol = nextProtocol;

	}

	/**
	 * Returns the previous protocol node in the sequence.
	 *
	 * @return the previous protocol node, or null if this is the first node
	 */
	public Protocol getPreviousProtocol() {
		return this.previousProtocol;

	}

	/**
	 * Sets the reference to the previous protocol node in the sequence.
	 *
	 * @param previousProtocol the previous protocol node, or null to make this the
	 *                         first node
	 */
	public void setPreviousProtocol(Protocol previousProtocol) {
		this.previousProtocol = previousProtocol;

	}

	/**
	 * Returns the FIFO data list associated with this protocol.
	 * This list can be used to store additional data packets or messages
	 * in first-in-first-out order.
	 *
	 * @return the DataList instance for this protocol
	 */
	public DataList getDataList() {
		return this.dataList;
	}

	/**
	 * Returns a string representation of this protocol node.
	 * The format is the concatenation of type and data.
	 *
	 * @return a string representation of this protocol node
	 */
	@Override
	public String toString() {
		return (this.type + this.data);
	}

}
