/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.management.batchai.v2018_03_01.ResourceId;
import com.microsoft.azure.management.batchai.v2018_03_01.MountVolumes;
import com.microsoft.azure.management.batchai.v2018_03_01.ContainerSettings;
import com.microsoft.azure.management.batchai.v2018_03_01.ToolType;
import com.microsoft.azure.management.batchai.v2018_03_01.CNTKsettings;
import com.microsoft.azure.management.batchai.v2018_03_01.PyTorchSettings;
import com.microsoft.azure.management.batchai.v2018_03_01.TensorFlowSettings;
import com.microsoft.azure.management.batchai.v2018_03_01.CaffeSettings;
import com.microsoft.azure.management.batchai.v2018_03_01.ChainerSettings;
import com.microsoft.azure.management.batchai.v2018_03_01.CustomToolkitSettings;
import com.microsoft.azure.management.batchai.v2018_03_01.JobPreparation;
import java.util.List;
import com.microsoft.azure.management.batchai.v2018_03_01.InputDirectory;
import com.microsoft.azure.management.batchai.v2018_03_01.OutputDirectory;
import com.microsoft.azure.management.batchai.v2018_03_01.EnvironmentVariable;
import com.microsoft.azure.management.batchai.v2018_03_01.EnvironmentVariableWithSecretValue;
import com.microsoft.azure.management.batchai.v2018_03_01.JobPropertiesConstraints;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batchai.v2018_03_01.ProvisioningState;
import com.microsoft.azure.management.batchai.v2018_03_01.ExecutionState;
import com.microsoft.azure.management.batchai.v2018_03_01.JobPropertiesExecutionInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Contains information about the job.
 */
@JsonFlatten
@SkipParentValidation
public class JobInner extends Resource {
    /**
     * Describe the experiment information of the job.
     */
    @JsonProperty(value = "properties.experimentName")
    private String experimentName;

    /**
     * Priority associated with the job.
     * Priority associated with the job. Priority values can range from -1000
     * to 1000, with -1000 being the lowest priority and 1000 being the highest
     * priority. The default value is 0.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * Specifies the Id of the cluster on which this job will run.
     */
    @JsonProperty(value = "properties.cluster")
    private ResourceId cluster;

    /**
     * Information on mount volumes to be used by the job.
     * These volumes will be mounted before the job execution and will be
     * unmouted after the job completion. The volumes will be mounted at
     * location specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
     */
    @JsonProperty(value = "properties.mountVolumes")
    private MountVolumes mountVolumes;

    /**
     * A segment of job's output directories path created by BatchAI.
     * Batch AI creates job's output directories under an unique path to avoid
     * conflicts between jobs. This value contains a path segment generated by
     * Batch AI to make the path unique and can be used to find the output
     * directory on the node or mounted filesystem.
     */
    @JsonProperty(value = "properties.jobOutputDirectoryPathSegment")
    private String jobOutputDirectoryPathSegment;

    /**
     * Number of compute nodes to run the job on.
     * The job will be gang scheduled on that many compute nodes.
     */
    @JsonProperty(value = "properties.nodeCount")
    private Integer nodeCount;

    /**
     * If provided the job will run in the specified container.
     * If the container was downloaded as part of cluster setup then the same
     * container image will be used. If not provided, the job will run on the
     * VM.
     */
    @JsonProperty(value = "properties.containerSettings")
    private ContainerSettings containerSettings;

    /**
     * The toolkit type of this job.
     * Possible values are: cntk, tensorflow, caffe, caffe2, chainer, pytorch,
     * custom. Possible values include: 'cntk', 'tensorflow', 'caffe',
     * 'caffe2', 'chainer', 'custom'.
     */
    @JsonProperty(value = "properties.toolType")
    private ToolType toolType;

    /**
     * Specifies the settings for CNTK (aka Microsoft Cognitive Toolkit) job.
     */
    @JsonProperty(value = "properties.cntkSettings")
    private CNTKsettings cntkSettings;

    /**
     * Specifies the settings for pyTorch job.
     */
    @JsonProperty(value = "properties.pyTorchSettings")
    private PyTorchSettings pyTorchSettings;

    /**
     * Specifies the settings for Tensor Flow job.
     */
    @JsonProperty(value = "properties.tensorFlowSettings")
    private TensorFlowSettings tensorFlowSettings;

    /**
     * Specifies the settings for Caffe job.
     */
    @JsonProperty(value = "properties.caffeSettings")
    private CaffeSettings caffeSettings;

    /**
     * Specifies the settings for Chainer job.
     */
    @JsonProperty(value = "properties.chainerSettings")
    private ChainerSettings chainerSettings;

    /**
     * Specifies the settings for custom tool kit job.
     */
    @JsonProperty(value = "properties.customToolkitSettings")
    private CustomToolkitSettings customToolkitSettings;

    /**
     * Specifies the actions to be performed before tool kit is launched.
     * The specified actions will run on all the nodes that are part of the
     * job.
     */
    @JsonProperty(value = "properties.jobPreparation")
    private JobPreparation jobPreparation;

    /**
     * The path where the Batch AI service will upload stdout and stderror of
     * the job.
     */
    @JsonProperty(value = "properties.stdOutErrPathPrefix")
    private String stdOutErrPathPrefix;

    /**
     * Specifies the list of input directories for the Job.
     */
    @JsonProperty(value = "properties.inputDirectories")
    private List<InputDirectory> inputDirectories;

    /**
     * Specifies the list of output directories where the models will be
     * created.
     */
    @JsonProperty(value = "properties.outputDirectories")
    private List<OutputDirectory> outputDirectories;

    /**
     * Additional environment variables to set on the job.
     * Batch AI will setup these additional environment variables for the job.
     */
    @JsonProperty(value = "properties.environmentVariables")
    private List<EnvironmentVariable> environmentVariables;

    /**
     * Additional environment variables with secret values to set on the job.
     * Batch AI will setup these additional environment variables for the job.
     * Server will never report values of these variables back.
     */
    @JsonProperty(value = "properties.secrets")
    private List<EnvironmentVariableWithSecretValue> secrets;

    /**
     * Constraints associated with the Job.
     */
    @JsonProperty(value = "properties.constraints")
    private JobPropertiesConstraints constraints;

    /**
     * The job creation time.
     * The creation time of the job.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * The provisioned state of the Batch AI job. Possible values include:
     * 'creating', 'succeeded', 'failed', 'deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The time at which the job entered its current provisioning state.
     * The time at which the job entered its current provisioning state.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime provisioningStateTransitionTime;

    /**
     * The current state of the job.
     * The current state of the job. Possible values are: queued - The job is
     * queued and able to run. A job enters this state when it is created, or
     * when it is awaiting a retry after a failed run. running - The job is
     * running on a compute cluster. This includes job-level preparation such
     * as downloading resource files or set up container specified on the job -
     * it does not necessarily mean that the job command line has started
     * executing. terminating - The job is terminated by the user, the
     * terminate operation is in progress. succeeded - The job has completed
     * running succesfully and exited with exit code 0. failed - The job has
     * finished unsuccessfully (failed with a non-zero exit code) and has
     * exhausted its retry limit. A job is also marked as failed if an error
     * occurred launching the job. Possible values include: 'queued',
     * 'running', 'terminating', 'succeeded', 'failed'.
     */
    @JsonProperty(value = "properties.executionState")
    private ExecutionState executionState;

    /**
     * The time at which the job entered its current execution state.
     * The time at which the job entered its current execution state.
     */
    @JsonProperty(value = "properties.executionStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime executionStateTransitionTime;

    /**
     * Contains information about the execution of a job in the Azure Batch
     * service.
     */
    @JsonProperty(value = "properties.executionInfo")
    private JobPropertiesExecutionInfo executionInfo;

    /**
     * Get describe the experiment information of the job.
     *
     * @return the experimentName value
     */
    public String experimentName() {
        return this.experimentName;
    }

    /**
     * Set describe the experiment information of the job.
     *
     * @param experimentName the experimentName value to set
     * @return the JobInner object itself.
     */
    public JobInner withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get priority associated with the job. Priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. The default value is 0.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority associated with the job. Priority values can range from -1000 to 1000, with -1000 being the lowest priority and 1000 being the highest priority. The default value is 0.
     *
     * @param priority the priority value to set
     * @return the JobInner object itself.
     */
    public JobInner withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the cluster value.
     *
     * @return the cluster value
     */
    public ResourceId cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster value.
     *
     * @param cluster the cluster value to set
     * @return the JobInner object itself.
     */
    public JobInner withCluster(ResourceId cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get these volumes will be mounted before the job execution and will be unmouted after the job completion. The volumes will be mounted at location specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
     *
     * @return the mountVolumes value
     */
    public MountVolumes mountVolumes() {
        return this.mountVolumes;
    }

    /**
     * Set these volumes will be mounted before the job execution and will be unmouted after the job completion. The volumes will be mounted at location specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
     *
     * @param mountVolumes the mountVolumes value to set
     * @return the JobInner object itself.
     */
    public JobInner withMountVolumes(MountVolumes mountVolumes) {
        this.mountVolumes = mountVolumes;
        return this;
    }

    /**
     * Get batch AI creates job's output directories under an unique path to avoid conflicts between jobs. This value contains a path segment generated by Batch AI to make the path unique and can be used to find the output directory on the node or mounted filesystem.
     *
     * @return the jobOutputDirectoryPathSegment value
     */
    public String jobOutputDirectoryPathSegment() {
        return this.jobOutputDirectoryPathSegment;
    }

    /**
     * Set batch AI creates job's output directories under an unique path to avoid conflicts between jobs. This value contains a path segment generated by Batch AI to make the path unique and can be used to find the output directory on the node or mounted filesystem.
     *
     * @param jobOutputDirectoryPathSegment the jobOutputDirectoryPathSegment value to set
     * @return the JobInner object itself.
     */
    public JobInner withJobOutputDirectoryPathSegment(String jobOutputDirectoryPathSegment) {
        this.jobOutputDirectoryPathSegment = jobOutputDirectoryPathSegment;
        return this;
    }

    /**
     * Get the job will be gang scheduled on that many compute nodes.
     *
     * @return the nodeCount value
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the job will be gang scheduled on that many compute nodes.
     *
     * @param nodeCount the nodeCount value to set
     * @return the JobInner object itself.
     */
    public JobInner withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get if the container was downloaded as part of cluster setup then the same container image will be used. If not provided, the job will run on the VM.
     *
     * @return the containerSettings value
     */
    public ContainerSettings containerSettings() {
        return this.containerSettings;
    }

    /**
     * Set if the container was downloaded as part of cluster setup then the same container image will be used. If not provided, the job will run on the VM.
     *
     * @param containerSettings the containerSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withContainerSettings(ContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Get possible values are: cntk, tensorflow, caffe, caffe2, chainer, pytorch, custom. Possible values include: 'cntk', 'tensorflow', 'caffe', 'caffe2', 'chainer', 'custom'.
     *
     * @return the toolType value
     */
    public ToolType toolType() {
        return this.toolType;
    }

    /**
     * Set possible values are: cntk, tensorflow, caffe, caffe2, chainer, pytorch, custom. Possible values include: 'cntk', 'tensorflow', 'caffe', 'caffe2', 'chainer', 'custom'.
     *
     * @param toolType the toolType value to set
     * @return the JobInner object itself.
     */
    public JobInner withToolType(ToolType toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * Get the cntkSettings value.
     *
     * @return the cntkSettings value
     */
    public CNTKsettings cntkSettings() {
        return this.cntkSettings;
    }

    /**
     * Set the cntkSettings value.
     *
     * @param cntkSettings the cntkSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCntkSettings(CNTKsettings cntkSettings) {
        this.cntkSettings = cntkSettings;
        return this;
    }

    /**
     * Get the pyTorchSettings value.
     *
     * @return the pyTorchSettings value
     */
    public PyTorchSettings pyTorchSettings() {
        return this.pyTorchSettings;
    }

    /**
     * Set the pyTorchSettings value.
     *
     * @param pyTorchSettings the pyTorchSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withPyTorchSettings(PyTorchSettings pyTorchSettings) {
        this.pyTorchSettings = pyTorchSettings;
        return this;
    }

    /**
     * Get the tensorFlowSettings value.
     *
     * @return the tensorFlowSettings value
     */
    public TensorFlowSettings tensorFlowSettings() {
        return this.tensorFlowSettings;
    }

    /**
     * Set the tensorFlowSettings value.
     *
     * @param tensorFlowSettings the tensorFlowSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withTensorFlowSettings(TensorFlowSettings tensorFlowSettings) {
        this.tensorFlowSettings = tensorFlowSettings;
        return this;
    }

    /**
     * Get the caffeSettings value.
     *
     * @return the caffeSettings value
     */
    public CaffeSettings caffeSettings() {
        return this.caffeSettings;
    }

    /**
     * Set the caffeSettings value.
     *
     * @param caffeSettings the caffeSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCaffeSettings(CaffeSettings caffeSettings) {
        this.caffeSettings = caffeSettings;
        return this;
    }

    /**
     * Get the chainerSettings value.
     *
     * @return the chainerSettings value
     */
    public ChainerSettings chainerSettings() {
        return this.chainerSettings;
    }

    /**
     * Set the chainerSettings value.
     *
     * @param chainerSettings the chainerSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withChainerSettings(ChainerSettings chainerSettings) {
        this.chainerSettings = chainerSettings;
        return this;
    }

    /**
     * Get the customToolkitSettings value.
     *
     * @return the customToolkitSettings value
     */
    public CustomToolkitSettings customToolkitSettings() {
        return this.customToolkitSettings;
    }

    /**
     * Set the customToolkitSettings value.
     *
     * @param customToolkitSettings the customToolkitSettings value to set
     * @return the JobInner object itself.
     */
    public JobInner withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings) {
        this.customToolkitSettings = customToolkitSettings;
        return this;
    }

    /**
     * Get the specified actions will run on all the nodes that are part of the job.
     *
     * @return the jobPreparation value
     */
    public JobPreparation jobPreparation() {
        return this.jobPreparation;
    }

    /**
     * Set the specified actions will run on all the nodes that are part of the job.
     *
     * @param jobPreparation the jobPreparation value to set
     * @return the JobInner object itself.
     */
    public JobInner withJobPreparation(JobPreparation jobPreparation) {
        this.jobPreparation = jobPreparation;
        return this;
    }

    /**
     * Get the path where the Batch AI service will upload stdout and stderror of the job.
     *
     * @return the stdOutErrPathPrefix value
     */
    public String stdOutErrPathPrefix() {
        return this.stdOutErrPathPrefix;
    }

    /**
     * Set the path where the Batch AI service will upload stdout and stderror of the job.
     *
     * @param stdOutErrPathPrefix the stdOutErrPathPrefix value to set
     * @return the JobInner object itself.
     */
    public JobInner withStdOutErrPathPrefix(String stdOutErrPathPrefix) {
        this.stdOutErrPathPrefix = stdOutErrPathPrefix;
        return this;
    }

    /**
     * Get the inputDirectories value.
     *
     * @return the inputDirectories value
     */
    public List<InputDirectory> inputDirectories() {
        return this.inputDirectories;
    }

    /**
     * Set the inputDirectories value.
     *
     * @param inputDirectories the inputDirectories value to set
     * @return the JobInner object itself.
     */
    public JobInner withInputDirectories(List<InputDirectory> inputDirectories) {
        this.inputDirectories = inputDirectories;
        return this;
    }

    /**
     * Get the outputDirectories value.
     *
     * @return the outputDirectories value
     */
    public List<OutputDirectory> outputDirectories() {
        return this.outputDirectories;
    }

    /**
     * Set the outputDirectories value.
     *
     * @param outputDirectories the outputDirectories value to set
     * @return the JobInner object itself.
     */
    public JobInner withOutputDirectories(List<OutputDirectory> outputDirectories) {
        this.outputDirectories = outputDirectories;
        return this;
    }

    /**
     * Get batch AI will setup these additional environment variables for the job.
     *
     * @return the environmentVariables value
     */
    public List<EnvironmentVariable> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set batch AI will setup these additional environment variables for the job.
     *
     * @param environmentVariables the environmentVariables value to set
     * @return the JobInner object itself.
     */
    public JobInner withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get batch AI will setup these additional environment variables for the job. Server will never report values of these variables back.
     *
     * @return the secrets value
     */
    public List<EnvironmentVariableWithSecretValue> secrets() {
        return this.secrets;
    }

    /**
     * Set batch AI will setup these additional environment variables for the job. Server will never report values of these variables back.
     *
     * @param secrets the secrets value to set
     * @return the JobInner object itself.
     */
    public JobInner withSecrets(List<EnvironmentVariableWithSecretValue> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get constraints associated with the Job.
     *
     * @return the constraints value
     */
    public JobPropertiesConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set constraints associated with the Job.
     *
     * @param constraints the constraints value to set
     * @return the JobInner object itself.
     */
    public JobInner withConstraints(JobPropertiesConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the creation time of the job.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioned state of the Batch AI job. Possible values include: 'creating', 'succeeded', 'failed', 'deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the time at which the job entered its current provisioning state.
     *
     * @return the provisioningStateTransitionTime value
     */
    public DateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get the current state of the job. Possible values are: queued - The job is queued and able to run. A job enters this state when it is created, or when it is awaiting a retry after a failed run. running - The job is running on a compute cluster. This includes job-level preparation such as downloading resource files or set up container specified on the job - it does not necessarily mean that the job command line has started executing. terminating - The job is terminated by the user, the terminate operation is in progress. succeeded - The job has completed running succesfully and exited with exit code 0. failed - The job has finished unsuccessfully (failed with a non-zero exit code) and has exhausted its retry limit. A job is also marked as failed if an error occurred launching the job. Possible values include: 'queued', 'running', 'terminating', 'succeeded', 'failed'.
     *
     * @return the executionState value
     */
    public ExecutionState executionState() {
        return this.executionState;
    }

    /**
     * Set the current state of the job. Possible values are: queued - The job is queued and able to run. A job enters this state when it is created, or when it is awaiting a retry after a failed run. running - The job is running on a compute cluster. This includes job-level preparation such as downloading resource files or set up container specified on the job - it does not necessarily mean that the job command line has started executing. terminating - The job is terminated by the user, the terminate operation is in progress. succeeded - The job has completed running succesfully and exited with exit code 0. failed - The job has finished unsuccessfully (failed with a non-zero exit code) and has exhausted its retry limit. A job is also marked as failed if an error occurred launching the job. Possible values include: 'queued', 'running', 'terminating', 'succeeded', 'failed'.
     *
     * @param executionState the executionState value to set
     * @return the JobInner object itself.
     */
    public JobInner withExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
        return this;
    }

    /**
     * Get the time at which the job entered its current execution state.
     *
     * @return the executionStateTransitionTime value
     */
    public DateTime executionStateTransitionTime() {
        return this.executionStateTransitionTime;
    }

    /**
     * Get contains information about the execution of a job in the Azure Batch service.
     *
     * @return the executionInfo value
     */
    public JobPropertiesExecutionInfo executionInfo() {
        return this.executionInfo;
    }

    /**
     * Set contains information about the execution of a job in the Azure Batch service.
     *
     * @param executionInfo the executionInfo value to set
     * @return the JobInner object itself.
     */
    public JobInner withExecutionInfo(JobPropertiesExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

}
