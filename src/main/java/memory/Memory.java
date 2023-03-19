package memory;

public class Memory {

	// 사용중인 메모리
	private long used;
	// 최대 메모리
	private long max;

	public Memory(long used, long max) {
		this.used = used;
		this.max = max;
	}

	public long getUsed() {
		return used;
	}

	public long getMax() {
		return max;
	}

	@Override
	public String toString() {
		return "Memory{" +
			"used=" + used +
			", max=" + max +
			'}';
	}
}
