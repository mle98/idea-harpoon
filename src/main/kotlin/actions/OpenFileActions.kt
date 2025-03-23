package org.mle98.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import org.mle98.switch

class OpenFile1Action() : AnAction() {
    override fun actionPerformed(e: AnActionEvent) = switch(0)
}

class OpenFile2Action() : AnAction() {
    override fun actionPerformed(e: AnActionEvent) = switch(1)
}

class OpenFile3Action() : AnAction() {
    override fun actionPerformed(e: AnActionEvent) = switch(2)
}

class OpenFile4Action() : AnAction() {
    override fun actionPerformed(e: AnActionEvent) = switch(3)
}


