// Generated by jextract

package io.github.dsheirer.sdrplay.api;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$7 {

    static final FunctionDescriptor sdrplay_api_Open$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle sdrplay_api_Open$MH = RuntimeHelper.downcallHandle(
        sdrplay_api_h.LIBRARIES, "sdrplay_api_Open",
        "()I",
        constants$7.sdrplay_api_Open$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_Close$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle sdrplay_api_Close$MH = RuntimeHelper.downcallHandle(
        sdrplay_api_h.LIBRARIES, "sdrplay_api_Close",
        "()I",
        constants$7.sdrplay_api_Close$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_ApiVersion$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle sdrplay_api_ApiVersion$MH = RuntimeHelper.downcallHandle(
        sdrplay_api_h.LIBRARIES, "sdrplay_api_ApiVersion",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$7.sdrplay_api_ApiVersion$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_LockDeviceApi$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle sdrplay_api_LockDeviceApi$MH = RuntimeHelper.downcallHandle(
        sdrplay_api_h.LIBRARIES, "sdrplay_api_LockDeviceApi",
        "()I",
        constants$7.sdrplay_api_LockDeviceApi$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_UnlockDeviceApi$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle sdrplay_api_UnlockDeviceApi$MH = RuntimeHelper.downcallHandle(
        sdrplay_api_h.LIBRARIES, "sdrplay_api_UnlockDeviceApi",
        "()I",
        constants$7.sdrplay_api_UnlockDeviceApi$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_GetDevices$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle sdrplay_api_GetDevices$MH = RuntimeHelper.downcallHandle(
        sdrplay_api_h.LIBRARIES, "sdrplay_api_GetDevices",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$7.sdrplay_api_GetDevices$FUNC, false
    );
}


