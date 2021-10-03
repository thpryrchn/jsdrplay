// Generated by jextract

package io.github.dsheirer.sdrplay.api;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class sdrplay_api_RfFreqT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_DOUBLE.withName("rfHz"),
        C_CHAR.withName("syncUpdate"),
        MemoryLayout.paddingLayout(56)
    );
    public static MemoryLayout $LAYOUT() {
        return sdrplay_api_RfFreqT.$struct$LAYOUT;
    }
    static final VarHandle rfHz$VH = $struct$LAYOUT.varHandle(double.class, MemoryLayout.PathElement.groupElement("rfHz"));
    public static VarHandle rfHz$VH() {
        return sdrplay_api_RfFreqT.rfHz$VH;
    }
    public static double rfHz$get(MemorySegment seg) {
        return (double)sdrplay_api_RfFreqT.rfHz$VH.get(seg);
    }
    public static void rfHz$set( MemorySegment seg, double x) {
        sdrplay_api_RfFreqT.rfHz$VH.set(seg, x);
    }
    public static double rfHz$get(MemorySegment seg, long index) {
        return (double)sdrplay_api_RfFreqT.rfHz$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rfHz$set(MemorySegment seg, long index, double x) {
        sdrplay_api_RfFreqT.rfHz$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle syncUpdate$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("syncUpdate"));
    public static VarHandle syncUpdate$VH() {
        return sdrplay_api_RfFreqT.syncUpdate$VH;
    }
    public static byte syncUpdate$get(MemorySegment seg) {
        return (byte)sdrplay_api_RfFreqT.syncUpdate$VH.get(seg);
    }
    public static void syncUpdate$set( MemorySegment seg, byte x) {
        sdrplay_api_RfFreqT.syncUpdate$VH.set(seg, x);
    }
    public static byte syncUpdate$get(MemorySegment seg, long index) {
        return (byte)sdrplay_api_RfFreqT.syncUpdate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void syncUpdate$set(MemorySegment seg, long index, byte x) {
        sdrplay_api_RfFreqT.syncUpdate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


