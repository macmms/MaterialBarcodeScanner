package com.edwardvanraak.materialbarcodescanner;

class Events {
    static class CameraParametersSetEvent{
        final boolean isFlashEnabled;

        CameraParametersSetEvent(boolean isFlashEnabled) {
            this.isFlashEnabled = isFlashEnabled;
        }

    }
}
