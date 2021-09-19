package com.huawei.ohos.build.plugins;

import java.io.File;
import javax.inject.Inject;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.file.RegularFile;
import org.gradle.api.internal.file.copy.CopyAction;
import org.gradle.api.internal.provider.DefaultProvider;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.bundling.AbstractArchiveTask;

public class DelegateArchiveTask extends AbstractArchiveTask {
  private Project project;
  
  private String delegatedTaskName;
  
  @Inject
  public DelegateArchiveTask(String delegatedTaskName, String extension, Project project) {
    this.project = project;
    this.delegatedTaskName = delegatedTaskName;
    getArchiveExtension().set(extension);
  }
  
  public Provider<RegularFile> getArchiveFile() {
    return (Provider<RegularFile>)new DefaultProvider(() -> this::getDelegateTaskFile);
  }
  
  private File getDelegateTaskFile() {
    return this.project.getTasks().getByName(this.delegatedTaskName)
      .getOutputs()
      .getFiles()
      .getSingleFile();
  }
  
  protected CopyAction createCopyAction() {
    return null;
  }
  
  public static TaskProvider<DelegateArchiveTask> newTask(String taskName, String delegatedTaskName, String extension, Project project) {
    TaskProvider<DelegateArchiveTask> delegateArchiveTaskTaskProvider = project.getTasks().register(taskName, DelegateArchiveTask.class, new Object[] { delegatedTaskName, extension, project });
    project.getTasks().whenTaskAdded(newTask -> {
          if (newTask.getName().equals(delegatedTaskName))
            ((DelegateArchiveTask)delegateArchiveTaskTaskProvider.get()).dependsOn(new Object[] { newTask }); 
        });
    return delegateArchiveTaskTaskProvider;
  }
}
