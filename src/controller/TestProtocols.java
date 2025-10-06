package controller;

import model.estrutura.Router;

/**
 * Test class for demonstrating the Router functionality and protocol management system.
 * This class provides a comprehensive test scenario that showcases the FIFO behavior,
 * automatic protocol management, and error handling of the Router system.
 * 
 * <p>The test simulates real-world network traffic with multiple protocols
 * and demonstrates the complete lifecycle of protocol data management.</p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class TestProtocols { 

    /**
     * Default constructor for TestProtocols.
     * Calls the superclass constructor.
     */
    public TestProtocols() {
        super();
    }
    
    /**
     * Executes a comprehensive test of the Router system.
     * This test demonstrates:
     * <ul>
     *   <li>Adding data to multiple protocols</li>
     *   <li>FIFO (First-In-First-Out) data retrieval</li>
     *   <li>Automatic protocol cleanup when queues become empty</li>
     *   <li>Error handling for non-existent protocols</li>
     *   <li>Concurrent protocol management</li>
     * </ul>
     * 
     * <p>The test scenario includes:
     * <ol>
     *   <li>Adding data to HTTPS, POP, and HTTP protocols</li>
     *   <li>Reading data in mixed order to demonstrate independent queues</li>
     *   <li>Testing empty queue behavior and automatic protocol removal</li>
     *   <li>Attempting to read from non-existent protocols</li>
     * </ol>
     * 
     * @throws Exception if any unexpected error occurs during testing
     */
    public void beginTest() {
        try {
            
            Router newRouter = new Router();
            
            // Add test data to multiple protocols
            newRouter.addData("https", "OLA_MUNDO");
            newRouter.addData("https", "ADEUS_MUNDO");
            newRouter.addData("pop", "PRIMEIRO_EMAIL");
            newRouter.addData("http", "SITE_INSEGURO");
            newRouter.addData("pop", "ULTIMO_EMAIL");
            
            // Test FIFO behavior and protocol management
            System.out.println(newRouter.readData("https")); // Expected: "OLA_MUNDO"
            System.out.println(newRouter.readData("pop"));   // Expected: "PRIMEIRO_EMAIL"
            System.out.println(newRouter.readData("https")); // Expected: "ADEUS_MUNDO"
            System.out.println(newRouter.readData("http"));  // Expected: "SITE_INSEGURO"
            System.out.println(newRouter.readData("pop"));   // Expected: "ULTIMO_EMAIL"
            System.out.println(newRouter.readData("https")); // Expected: Protocol removal message
            System.out.println(newRouter.readData("pop"));   // Expected: Protocol removal message      
            System.out.println(newRouter.readData("http"));  // Expected: Protocol removal message      
            System.out.println(newRouter.readData("TESTE")); // Expected: Exception - protocol doesn't exist

            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }

}
