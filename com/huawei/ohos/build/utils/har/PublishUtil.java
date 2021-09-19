package com.huawei.ohos.build.utils.har;

import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ConfigurationPublications;
import org.gradle.api.artifacts.ConfigurationVariant;
import org.gradle.api.artifacts.PublishArtifact;

public class PublishUtil {
  public static void publish(PublishArtifact artifact, String configName, Project project) {
    Configuration configuration = project.getConfigurations().getByName(configName);
    ConfigurationPublications publications = configuration.getOutgoing();
    ConfigurationVariant configVariant = (ConfigurationVariant)publications.getVariants().create("har");
    configVariant.artifact(artifact);
  }
}
