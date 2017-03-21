package com.github.blindpirate.gogradle.task;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;

import static com.github.blindpirate.gogradle.GogradleGlobal.GOGRADLE_BUILD_DIR_NAME;
import static com.github.blindpirate.gogradle.util.IOUtils.clearDirectory;
import static com.github.blindpirate.gogradle.util.IOUtils.isValidDirectory;

public class CleanTask extends DefaultTask {

    @TaskAction
    public void clean() {
        File gogradleBuildDir = new File(getProject().getRootDir(), GOGRADLE_BUILD_DIR_NAME);
        if (isValidDirectory(gogradleBuildDir)) {
            clearDirectory(gogradleBuildDir);
        }
    }
}
