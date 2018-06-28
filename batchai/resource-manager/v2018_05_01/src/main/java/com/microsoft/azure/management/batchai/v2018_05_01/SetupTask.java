/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies a setup task which can be used to customize the compute nodes of
 * the cluster.
 */
public class SetupTask {
    /**
     * Command line.
     * The command line to be executed on each cluster's node after it being
     * allocated or rebooted. The command is executed in a bash subshell as a
     * root.
     */
    @JsonProperty(value = "commandLine", required = true)
    private String commandLine;

    /**
     * Environment variables.
     * A collection of user defined environment variables to be set for setup
     * task.
     */
    @JsonProperty(value = "environmentVariables")
    private List<EnvironmentVariable> environmentVariables;

    /**
     * Secrets.
     * A collection of user defined environment variables with secret values to
     * be set for the setup task. Server will never report values of these
     * variables back.
     */
    @JsonProperty(value = "secrets")
    private List<EnvironmentVariableWithSecretValue> secrets;

    /**
     * Output path prefix.
     * The prefix of a path where the Batch AI service will upload the stdout,
     * stderr and execution log of the setup task.
     */
    @JsonProperty(value = "stdOutErrPathPrefix", required = true)
    private String stdOutErrPathPrefix;

    /**
     * Output path suffix.
     * A path segment appended by Batch AI to stdOutErrPathPrefix to form a
     * path where stdout, stderr and execution log of the setup task will be
     * uploaded. Batch AI creates the setup task output directories under an
     * unique path to avoid conflicts between different clusters. The full path
     * can be obtained by concatenation of stdOutErrPathPrefix and
     * stdOutErrPathSuffix.
     */
    @JsonProperty(value = "stdOutErrPathSuffix", access = JsonProperty.Access.WRITE_ONLY)
    private String stdOutErrPathSuffix;

    /**
     * Get the command line to be executed on each cluster's node after it being allocated or rebooted. The command is executed in a bash subshell as a root.
     *
     * @return the commandLine value
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set the command line to be executed on each cluster's node after it being allocated or rebooted. The command is executed in a bash subshell as a root.
     *
     * @param commandLine the commandLine value to set
     * @return the SetupTask object itself.
     */
    public SetupTask withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Get a collection of user defined environment variables to be set for setup task.
     *
     * @return the environmentVariables value
     */
    public List<EnvironmentVariable> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set a collection of user defined environment variables to be set for setup task.
     *
     * @param environmentVariables the environmentVariables value to set
     * @return the SetupTask object itself.
     */
    public SetupTask withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get a collection of user defined environment variables with secret values to be set for the setup task. Server will never report values of these variables back.
     *
     * @return the secrets value
     */
    public List<EnvironmentVariableWithSecretValue> secrets() {
        return this.secrets;
    }

    /**
     * Set a collection of user defined environment variables with secret values to be set for the setup task. Server will never report values of these variables back.
     *
     * @param secrets the secrets value to set
     * @return the SetupTask object itself.
     */
    public SetupTask withSecrets(List<EnvironmentVariableWithSecretValue> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the prefix of a path where the Batch AI service will upload the stdout, stderr and execution log of the setup task.
     *
     * @return the stdOutErrPathPrefix value
     */
    public String stdOutErrPathPrefix() {
        return this.stdOutErrPathPrefix;
    }

    /**
     * Set the prefix of a path where the Batch AI service will upload the stdout, stderr and execution log of the setup task.
     *
     * @param stdOutErrPathPrefix the stdOutErrPathPrefix value to set
     * @return the SetupTask object itself.
     */
    public SetupTask withStdOutErrPathPrefix(String stdOutErrPathPrefix) {
        this.stdOutErrPathPrefix = stdOutErrPathPrefix;
        return this;
    }

    /**
     * Get a path segment appended by Batch AI to stdOutErrPathPrefix to form a path where stdout, stderr and execution log of the setup task will be uploaded. Batch AI creates the setup task output directories under an unique path to avoid conflicts between different clusters. The full path can be obtained by concatenation of stdOutErrPathPrefix and stdOutErrPathSuffix.
     *
     * @return the stdOutErrPathSuffix value
     */
    public String stdOutErrPathSuffix() {
        return this.stdOutErrPathSuffix;
    }

}
