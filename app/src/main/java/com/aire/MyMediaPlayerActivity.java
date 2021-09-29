package com.aire;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;

import com.cxp.learningvideo.R;

import java.io.IOException;

public class MyMediaPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_media_player);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void testMediaCodec() throws IOException {
//        String name = "avc/mp4";
//        MediaCodec codec = MediaCodec.createByCodecName(name);
//        codec.configure(format, …);
//        MediaFormat outputFormat = codec.getOutputFormat(); // option B
//        codec.start();
//        for (;;) {
//            int inputBufferId = codec.dequeueInputBuffer(timeoutUs);
//            if (inputBufferId >= 0) {
//                ByteBuffer inputBuffer = codec.getInputBuffer(…);
//                // fill inputBuffer with valid data
//    …
//                codec.queueInputBuffer(inputBufferId, …);
//            }
//            int outputBufferId = codec.dequeueOutputBuffer(…);
//            if (outputBufferId >= 0) {
//                ByteBuffer outputBuffer = codec.getOutputBuffer(outputBufferId);
//                MediaFormat bufferFormat = codec.getOutputFormat(outputBufferId); // option A
//                // bufferFormat is identical to outputFormat
//                // outputBuffer is ready to be processed or rendered.
//    …
//                codec.releaseOutputBuffer(outputBufferId, …);
//            } else if (outputBufferId == MediaCodec.INFO_OUTPUT_FORMAT_CHANGED) {
//                // Subsequent data will conform to new format.
//                // Can ignore if using getOutputFormat(outputBufferId)
//                outputFormat = codec.getOutputFormat(); // option B
//            }
//        }
//        codec.stop();
//        codec.release();
    }
}