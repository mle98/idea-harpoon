package org.mle98

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.project.ProjectManager
import com.intellij.openapi.vfs.VirtualFile
import java.util.*

private val harpoonFiles: Array<Optional<VirtualFile>> = Array(4) { Optional.empty<VirtualFile>() }
private val project = ProjectManager.getInstance().openProjects.first()
private val fileEditorManager = FileEditorManager.getInstance(project)

fun setFile(e: AnActionEvent, index: Int) {
    e.getData(CommonDataKeys.VIRTUAL_FILE)?.let {
        harpoonFiles[index] = Optional.of(it)
    }
}

fun switch(index: Int) = harpoonFiles[index].ifPresent {
    fileEditorManager.openFile(it, true)
}

