// Generated by jextract

package io.github.dsheirer.sdrplay.api.v3_07;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$4 {

    static final FunctionDescriptor sdrplay_api_DisableHeartbeat_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle sdrplay_api_DisableHeartbeat_t$MH = RuntimeHelper.downcallHandle(
        constants$4.sdrplay_api_DisableHeartbeat_t$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_DebugEnable_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sdrplay_api_DebugEnable_t$MH = RuntimeHelper.downcallHandle(
        constants$4.sdrplay_api_DebugEnable_t$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_GetDeviceParams_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sdrplay_api_GetDeviceParams_t$MH = RuntimeHelper.downcallHandle(
        constants$4.sdrplay_api_GetDeviceParams_t$FUNC, false
    );
}


