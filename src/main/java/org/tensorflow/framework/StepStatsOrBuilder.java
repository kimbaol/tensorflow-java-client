// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: step_stats.proto

package org.tensorflow.framework;

public interface StepStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.StepStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  java.util.List<DeviceStepStats>
      getDevStatsList();
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  DeviceStepStats getDevStats(int index);
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  int getDevStatsCount();
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  java.util.List<? extends DeviceStepStatsOrBuilder>
      getDevStatsOrBuilderList();
  /**
   * <code>repeated .tensorflow.DeviceStepStats dev_stats = 1;</code>
   */
  DeviceStepStatsOrBuilder getDevStatsOrBuilder(
          int index);
}
