// Generated by jextract

package io.github.dsheirer.sdrplay.api.v3_07;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface sdrplay_api_LockDeviceApi_t {

    int apply();
    static NativeSymbol allocate(sdrplay_api_LockDeviceApi_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(sdrplay_api_LockDeviceApi_t.class, fi, constants$1.sdrplay_api_LockDeviceApi_t$FUNC, "()I", scope);
    }
    static sdrplay_api_LockDeviceApi_t ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("sdrplay_api_LockDeviceApi_t::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
            try {
                return (int)constants$1.sdrplay_api_LockDeviceApi_t$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


