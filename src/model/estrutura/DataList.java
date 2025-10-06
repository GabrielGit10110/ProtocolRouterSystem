package model.estrutura;

/**
 * Represents a FIFO (First-In-First-Out) data structure implemented as a linked list.
 * This class provides operations to write data to the end of the list and read data
 * from the beginning, following the queue principle.
 * 
 * <p>The implementation maintains references to both head and tail nodes
 * for efficient append operations.</p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class DataList {
    Data head;
    Data last;
    
    /**
     * Constructs an empty DataList.
     * Both head and last references are initialized to null.
     */
    public DataList() {
        this.head = null;
        this.last = null;
    }
    
    /**
     * Writes (appends) the specified data to the end of the FIFO queue.
     * If the list is empty, the new data becomes both head and last.
     * Otherwise, it's appended after the current last node.
     *
     * @param data the string data to be added to the queue
     */
    public void writeData(String data) {
        Data newData = new Data(data);
        
        // primeiro dado
        if (this.head == null) {
            this.head = newData;
            this.last = newData;
        } 
        // outros dados
        else {
            Data lastData = this.last;
            lastData.setNextData(newData);
            this.last = newData;
        }
        
    }
    
    /**
     * Reads and removes the data from the beginning of the FIFO queue.
     * Returns "empty.!." if the queue is empty.
     * Following FIFO principle, the first element added is the first one removed.
     *
     * @return the data from the beginning of the queue, or "empty.!." if the queue is empty
     */
    public String readData() {
        if (this.head == null) {
            return "empty.!.";
        }
        
        Data dataToRead = this.head;
        
        String readableData = dataToRead.getData();
        
        this.head = this.head.getNextData();
        
        dataToRead.setNextData(null);
        dataToRead.setData(null);
        
        return readableData;
    }

}
