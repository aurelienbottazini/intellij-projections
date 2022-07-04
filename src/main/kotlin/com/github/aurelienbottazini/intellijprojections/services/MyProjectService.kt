package com.github.aurelienbottazini.intellijprojections.services

import com.intellij.openapi.project.Project
import com.github.aurelienbottazini.intellijprojections.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
