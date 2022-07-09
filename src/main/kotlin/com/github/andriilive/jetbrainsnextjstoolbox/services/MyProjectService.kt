package com.github.andriilive.jetbrainsnextjstoolbox.services

import com.intellij.openapi.project.Project
import com.github.andriilive.jetbrainsnextjstoolbox.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
