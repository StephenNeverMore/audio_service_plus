package org.suchone.audio_service_plus;

public enum AudioProcessingState {
    idle,
    loading,
    buffering,
    ready,
    completed,
    error,
}
