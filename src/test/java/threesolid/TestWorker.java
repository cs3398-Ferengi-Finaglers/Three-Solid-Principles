package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
    
        private Worker w = new Worker();

	@DisplayName("Work Method Test")
	@Test
	public void testWorkMethod() {
             assertEquals(w.work(),"I am a worker. \n So you should pay me. \n", "Mismatch between test text and method text");

   }

}