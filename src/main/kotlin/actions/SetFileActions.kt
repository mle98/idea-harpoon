package org.mle98.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import org.mle98.setFile

class SetFile1Action : AnAction() {
    override fun actionPerformed(e: AnActionEvent) = setFile(e, 0)
}

class SetFile2Action : AnAction() {
    override fun actionPerformed(e: AnActionEvent) = setFile(e, 1)
}

class SetFile3Action : AnAction() {
    override fun actionPerformed(e: AnActionEvent) = setFile(e, 2)
}

class SetFile4Action : AnAction() {
    override fun actionPerformed(e: AnActionEvent) = setFile(e, 3)
}
