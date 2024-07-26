package com.devyk.crash_module.inter;

import android.content.Context;
import android.util.Log;

/**
 * <pre>
 *     author  : devyk on 2019-09-18 01:30
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is NativeCrashImp
 * </pre>
 */
public class NativeCrashImp implements ICrash {
    private static final String TAG = "NativeCrashImp : ";

    static {
        System.loadLibrary("breakpad-core");
    }

    private static native void initBreakpadNative(String path);

    @Override
    public void init(Context context, String logPath) {
        Log.d(TAG, "init: logPath : " + logPath);
        initBreakpadNative(logPath);
    }
}
