// Generated by jextract

package io.github.dsheirer.sdrplay.api;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$6 {

    static final FunctionDescriptor sdrplay_api_SwapRspDuoActiveTuner_t$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle sdrplay_api_SwapRspDuoActiveTuner_t$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$6.sdrplay_api_SwapRspDuoActiveTuner_t$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_SwapRspDuoDualTunerModeSampleRate_t$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle sdrplay_api_SwapRspDuoDualTunerModeSampleRate_t$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$6.sdrplay_api_SwapRspDuoDualTunerModeSampleRate_t$FUNC, false
    );
    static final FunctionDescriptor sdrplay_api_SwapRspDuoMode_t$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_DOUBLE,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle sdrplay_api_SwapRspDuoMode_t$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IDIIII)I",
        constants$6.sdrplay_api_SwapRspDuoMode_t$FUNC, false
    );
}


