package memory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemoryController {

	private final MemoryFinder memoryFinder;

	// 메모리 정보를 조회하는 컨트롤러 MemoryFinder를 주입 받아 사용
	@GetMapping("/memory")
	public Memory system(){
		Memory memory = memoryFinder.get();
		log.info("memory = {}", memory);
		return memory;
	}
}
