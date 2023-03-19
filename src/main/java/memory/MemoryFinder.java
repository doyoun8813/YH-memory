package memory;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemoryFinder {

	// JVM에서 메모리 정보를 실시간으로 조회하는 기능
	public Memory get(){
		// JVM이 사용할 수 있는 최대 메모리양. 이 수치를 넘어가면 OutOfMemory 예외 발생
		long max = Runtime.getRuntime().maxMemory();
		// JVM이 확보한 전체 메모리
		long total = Runtime.getRuntime().totalMemory();
		// total 중 현재 사용 가능한 메모리 공간
		long free = Runtime.getRuntime().freeMemory();
		// JVM이 실제 사용중인 메모리
		long used = total - free;
		return new Memory(used, max);
	}

	@PostConstruct
	public void init() {
		log.info("init memoryFinder");
	}
}
