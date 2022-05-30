// Generated by jextract

package io.github.dsheirer.sdrplay.api.v3_07;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sdrplay_api_GainCbParamT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("gRdB"),
        Constants$root.C_INT$LAYOUT.withName("lnaGRdB"),
        Constants$root.C_DOUBLE$LAYOUT.withName("currGain")
    );
    public static MemoryLayout $LAYOUT() {
        return sdrplay_api_GainCbParamT.$struct$LAYOUT;
    }
    static final VarHandle gRdB$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gRdB"));
    public static VarHandle gRdB$VH() {
        return sdrplay_api_GainCbParamT.gRdB$VH;
    }
    public static int gRdB$get(MemorySegment seg) {
        return (int)sdrplay_api_GainCbParamT.gRdB$VH.get(seg);
    }
    public static void gRdB$set( MemorySegment seg, int x) {
        sdrplay_api_GainCbParamT.gRdB$VH.set(seg, x);
    }
    public static int gRdB$get(MemorySegment seg, long index) {
        return (int)sdrplay_api_GainCbParamT.gRdB$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gRdB$set(MemorySegment seg, long index, int x) {
        sdrplay_api_GainCbParamT.gRdB$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lnaGRdB$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lnaGRdB"));
    public static VarHandle lnaGRdB$VH() {
        return sdrplay_api_GainCbParamT.lnaGRdB$VH;
    }
    public static int lnaGRdB$get(MemorySegment seg) {
        return (int)sdrplay_api_GainCbParamT.lnaGRdB$VH.get(seg);
    }
    public static void lnaGRdB$set( MemorySegment seg, int x) {
        sdrplay_api_GainCbParamT.lnaGRdB$VH.set(seg, x);
    }
    public static int lnaGRdB$get(MemorySegment seg, long index) {
        return (int)sdrplay_api_GainCbParamT.lnaGRdB$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lnaGRdB$set(MemorySegment seg, long index, int x) {
        sdrplay_api_GainCbParamT.lnaGRdB$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle currGain$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("currGain"));
    public static VarHandle currGain$VH() {
        return sdrplay_api_GainCbParamT.currGain$VH;
    }
    public static double currGain$get(MemorySegment seg) {
        return (double)sdrplay_api_GainCbParamT.currGain$VH.get(seg);
    }
    public static void currGain$set( MemorySegment seg, double x) {
        sdrplay_api_GainCbParamT.currGain$VH.set(seg, x);
    }
    public static double currGain$get(MemorySegment seg, long index) {
        return (double)sdrplay_api_GainCbParamT.currGain$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void currGain$set(MemorySegment seg, long index, double x) {
        sdrplay_api_GainCbParamT.currGain$VH.set(seg.asSlice(index*sizeof()), x);
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


