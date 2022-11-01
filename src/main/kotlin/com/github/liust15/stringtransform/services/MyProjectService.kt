package com.github.liust15.stringtransform.services

import com.intellij.openapi.project.Project
import com.github.liust15.stringtransform.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
