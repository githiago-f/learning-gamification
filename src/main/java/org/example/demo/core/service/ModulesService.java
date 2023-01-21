package org.example.demo.core.service;

import org.example.demo.core.scholar.lessons.Lesson;
import org.example.demo.core.scholar.lessons.Module;
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
