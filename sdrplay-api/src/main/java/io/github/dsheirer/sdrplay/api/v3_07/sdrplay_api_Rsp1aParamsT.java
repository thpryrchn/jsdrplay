// Generated by jextract

package io.github.dsheirer.sdrplay.api.v3_07;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sdrplay_api_Rsp1aParamsT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("rfNotchEnable"),
        Constants$root.C_CHAR$LAYOUT.withName("rfDabNotchEnable")
    );
    public static MemoryLayout $LAYOUT() {
        return sdrplay_api_Rsp1aParamsT.$struct$LAYOUT;
    }
    static final VarHandle rfNotchEnable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rfNotchEnable"));
    public static VarHandle rfNotchEnable$VH() {
        return sdrplay_api_Rsp1aParamsT.rfNotchEnable$VH;
    }
    public static byte rfNotchEnable$get(MemorySegment seg) {
        return (byte)sdrplay_api_Rsp1aParamsT.rfNotchEnable$VH.get(seg);
    }
    public static void rfNotchEnable$set( MemorySegment seg, byte x) {
        sdrplay_api_Rsp1aParamsT.rfNotchEnable$VH.set(seg, x);
    }
    public static byte rfNotchEnable$get(MemorySegment seg, long index) {
        return (byte)sdrplay_api_Rsp1aParamsT.rfNotchEnable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rfNotchEnable$set(MemorySegment seg, long index, byte x) {
        sdrplay_api_Rsp1aParamsT.rfNotchEnable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rfDabNotchEnable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rfDabNotchEnable"));
    public static VarHandle rfDabNotchEnable$VH() {
        return sdrplay_api_Rsp1aParamsT.rfDabNotchEnable$VH;
    }
    public static byte rfDabNotchEnable$get(MemorySegment seg) {
        return (byte)sdrplay_api_Rsp1aParamsT.rfDabNotchEnable$VH.get(seg);
    }
    public static void rfDabNotchEnable$set( MemorySegment seg, byte x) {
        sdrplay_api_Rsp1aParamsT.rfDabNotchEnable$VH.set(seg, x);
    }
    public static byte rfDabNotchEnable$get(MemorySegment seg, long index) {
        return (byte)sdrplay_api_Rsp1aParamsT.rfDabNotchEnable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rfDabNotchEnable$set(MemorySegment seg, long index, byte x) {
        sdrplay_api_Rsp1aParamsT.rfDabNotchEnable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


