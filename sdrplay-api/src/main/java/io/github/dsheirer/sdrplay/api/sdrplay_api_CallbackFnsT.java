// Generated by jextract

package io.github.dsheirer.sdrplay.api;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;

import java.lang.invoke.VarHandle;

import static jdk.incubator.foreign.CLinker.C_POINTER;
public class sdrplay_api_CallbackFnsT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("StreamACbFn"),
        C_POINTER.withName("StreamBCbFn"),
        C_POINTER.withName("EventCbFn")
    );
    public static MemoryLayout $LAYOUT() {
        return sdrplay_api_CallbackFnsT.$struct$LAYOUT;
    }
    static final VarHandle StreamACbFn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("StreamACbFn")));
    public static VarHandle StreamACbFn$VH() {
        return sdrplay_api_CallbackFnsT.StreamACbFn$VH;
    }
    public static MemoryAddress StreamACbFn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)sdrplay_api_CallbackFnsT.StreamACbFn$VH.get(seg);
    }
    public static void StreamACbFn$set( MemorySegment seg, MemoryAddress x) {
        sdrplay_api_CallbackFnsT.StreamACbFn$VH.set(seg, x);
    }
    public static MemoryAddress StreamACbFn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)sdrplay_api_CallbackFnsT.StreamACbFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StreamACbFn$set(MemorySegment seg, long index, MemoryAddress x) {
        sdrplay_api_CallbackFnsT.StreamACbFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static sdrplay_api_StreamCallback_t StreamACbFn (MemorySegment segment) {
        return sdrplay_api_StreamCallback_t.ofAddress(StreamACbFn$get(segment));
    }
    static final VarHandle StreamBCbFn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("StreamBCbFn")));
    public static VarHandle StreamBCbFn$VH() {
        return sdrplay_api_CallbackFnsT.StreamBCbFn$VH;
    }
    public static MemoryAddress StreamBCbFn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)sdrplay_api_CallbackFnsT.StreamBCbFn$VH.get(seg);
    }
    public static void StreamBCbFn$set( MemorySegment seg, MemoryAddress x) {
        sdrplay_api_CallbackFnsT.StreamBCbFn$VH.set(seg, x);
    }
    public static MemoryAddress StreamBCbFn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)sdrplay_api_CallbackFnsT.StreamBCbFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StreamBCbFn$set(MemorySegment seg, long index, MemoryAddress x) {
        sdrplay_api_CallbackFnsT.StreamBCbFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static sdrplay_api_StreamCallback_t StreamBCbFn (MemorySegment segment) {
        return sdrplay_api_StreamCallback_t.ofAddress(StreamBCbFn$get(segment));
    }
    static final VarHandle EventCbFn$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("EventCbFn")));
    public static VarHandle EventCbFn$VH() {
        return sdrplay_api_CallbackFnsT.EventCbFn$VH;
    }
    public static MemoryAddress EventCbFn$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)sdrplay_api_CallbackFnsT.EventCbFn$VH.get(seg);
    }
    public static void EventCbFn$set( MemorySegment seg, MemoryAddress x) {
        sdrplay_api_CallbackFnsT.EventCbFn$VH.set(seg, x);
    }
    public static MemoryAddress EventCbFn$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)sdrplay_api_CallbackFnsT.EventCbFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EventCbFn$set(MemorySegment seg, long index, MemoryAddress x) {
        sdrplay_api_CallbackFnsT.EventCbFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static sdrplay_api_EventCallback_t EventCbFn (MemorySegment segment) {
        return sdrplay_api_EventCallback_t.ofAddress(EventCbFn$get(segment));
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


