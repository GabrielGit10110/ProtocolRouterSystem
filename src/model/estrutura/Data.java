package model.estrutura;

/**
 * Represents a data node in a linked list structure.
 * Each node contains a string data value and a reference to the next data node.
 * 
 * <p>This class is designed to be used as a building block for linked list
 * implementations that store string data.</p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class Data {
    String data;
    Data nextData;
    
    /**
     * Constructs a new Data node with the specified string data.
     * The nextData reference is initialized to null.
     *
     * @param data the string data to be stored in this node
     */
    public Data(String data) {
        this.data = data;
        this.nextData = null;
    }
    
    /**
     * Returns the string data stored in this node.
     *
     * @return the string data stored in this node
     */
    public String getData() {
        return this.data;
    }
    
    /**
     * Sets the string data for this node.
     *
     * @param data the new string data to be stored in this node
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Returns the next data node in the sequence.
     * If this node is the last one in the list, returns null.
     *
     * @return the next data node in the sequence, or null if this is the last node
     */
    public Data getNextData() {
        return this.nextData;
    }
    
    /**
     * Sets the reference to the next data node in the sequence.
     * Use null to indicate that this node is the last one in the list.
     *
     * @param nextData the next data node in the sequence, or null to make this the last node
     */
    public void setNextData(Data nextData) {
        this.nextData = nextData;
    }
    
    /**
     * Returns a string representation of this data node.
     * The returned string is the data value stored in this node.
     *
     * @return a string representation of this data node
     */
    @Override
    public String toString() {
        return this.data;
    }
}
