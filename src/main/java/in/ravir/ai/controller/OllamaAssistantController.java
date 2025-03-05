package in.ravir.ai.controller;

import in.ravir.ai.assistant.OllamaAssistant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OllamaAssistantController {

    private final OllamaAssistant ollamaAssistant;

    @GetMapping("/assistant")
    public String assistant(@RequestParam(value = "message", defaultValue = "What time is it now?") String message) {
        return ollamaAssistant.chat(message);
    }

}
