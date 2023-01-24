package org.example.demo.core.scholar.lessons;

import org.springframework.stereotype.Service;

@Service
public class ModulesService {
    public Module addLesson(Module module, Lesson lesson) {
        // TODO
        module.addLesson(lesson);
        return module;
    }

    public Module createModule() {
        // TODO
        return new Module("Example module");
    }
}
