// Generated by jextract

package io.github.dsheirer.sdrplay.api.v3_07;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$5 {

    static final FunctionDescriptor sdrplay_api_Init_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sdrplay_api_Init_t$MH = RuntimeHelper.downcallHandle(
        constants$5.sdrplay_api_Init_t$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_Uninit_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sdrplay_api_Uninit_t$MH = RuntimeHelper.downcallHandle(
        constants$5.sdrplay_api_Uninit_t$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_Update_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sdrplay_api_Update_t$MH = RuntimeHelper.downcallHandle(
        constants$5.sdrplay_api_Update_t$FUNC, false
    );
}


