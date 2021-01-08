package com.github.yahito.kibanaplugin.services

import com.intellij.openapi.project.Project
import com.github.yahito.kibanaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
