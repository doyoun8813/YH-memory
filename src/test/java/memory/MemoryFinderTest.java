package memory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemoryFinderTest {

	@Test
	void get() {
		final MemoryFinder memoryFinder = new MemoryFinder();
		final Memory memory = memoryFinder.get();
		System.out.println("MemoryFinderTest.get");
		assertNotNull(memory);
	}
}
