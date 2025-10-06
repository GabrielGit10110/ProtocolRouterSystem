package view;

import controller.TestProtocols;

/**
 * Main entry point for the Protocol Router System application.
 * This class serves as the view layer in the MVC architecture,
 * providing the user interface to launch and execute the protocol testing suite.
 * 
 * <p>This class demonstrates the separation of concerns between the view (UI),
 * controller (test logic), and model (business logic) layers.</p>
 *
 * @author Gabriel
 * @version 1.0
 * @since 2024
 */
public class Router {
    
    /**
     * Main method that serves as the entry point for the Protocol Router System.
     * Creates a TestProtocols instance and executes the comprehensive test suite
     * that demonstrates the functionality of the protocol management system.
     * 
     * <p>The application will output:
     * <ul>
     *   <li>Protocol data retrieval in FIFO order</li>
     *   <li>Automatic protocol management messages</li>
     *   <li>Error handling for non-existent protocols</li>
     *   <li>System status messages</li>
     * </ul>
     * 
     * @param args command-line arguments (not used in this application)
     */
    public static void main (String[] args) {
        TestProtocols newTest = new TestProtocols();
        
        newTest.beginTest();
    
    }

}
