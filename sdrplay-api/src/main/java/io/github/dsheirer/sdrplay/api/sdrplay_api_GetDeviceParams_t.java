// Generated by jextract

package io.github.dsheirer.sdrplay.api;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface sdrplay_api_GetDeviceParams_t {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(sdrplay_api_GetDeviceParams_t fi) {
        return RuntimeHelper.upcallStub(sdrplay_api_GetDeviceParams_t.class, fi, constants$4.sdrplay_api_GetDeviceParams_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(sdrplay_api_GetDeviceParams_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(sdrplay_api_GetDeviceParams_t.class, fi, constants$4.sdrplay_api_GetDeviceParams_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static sdrplay_api_GetDeviceParams_t ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$4.sdrplay_api_GetDeviceParams_t$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


