// Generated by jextract

package io.github.dsheirer.sdrplay.api.v3_07;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2 {

    static final FunctionDescriptor sdrplay_api_UnlockDeviceApi_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle sdrplay_api_UnlockDeviceApi_t$MH = RuntimeHelper.downcallHandle(
        constants$2.sdrplay_api_UnlockDeviceApi_t$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_GetDevices_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sdrplay_api_GetDevices_t$MH = RuntimeHelper.downcallHandle(
        constants$2.sdrplay_api_GetDevices_t$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_SelectDevice_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sdrplay_api_SelectDevice_t$MH = RuntimeHelper.downcallHandle(
        constants$2.sdrplay_api_SelectDevice_t$FUNC, false
    );
}


