package io.github.dsheirer.sdrplay.parameter.tuner;

import io.github.dsheirer.sdrplay.util.Flag;
import io.github.dsheirer.sdrplay.SDRplayException;
import io.github.dsheirer.sdrplay.api.sdrplay_api_RfFreqT;
import jdk.incubator.foreign.MemorySegment;

/**
 * RF Frequency structure (sdrplay_api_RfFreqT)
 */
public class RfFrequency
{
    private static final double MINIMUM_FREQUENCY = 0;
    private static final double MAXIMUM_FREQUENCY = 2_000_000_000;
    private MemorySegment mMemorySegment;

    /**
     * Constructs an instance from the foreign memory segment
     * @param memorySegment representing the structure
     */
    public RfFrequency(MemorySegment memorySegment)
    {
        mMemorySegment = memorySegment;
    }

    private MemorySegment getMemorySegment()
    {
        return mMemorySegment;
    }

    /**
     * RF Frequency
     * @return frequency in Hertz
     */
    public double getFrequency()
    {
        return sdrplay_api_RfFreqT.rfHz$get(getMemorySegment());
    }

    /**
     * Sets the RF frequency
     * @param frequency (0 < frequency <= 2,000,000,000 Hz)
     * @param synchronousUpdate to set the frequency as a synchronous update
     * @throws SDRplayException for an invalid frequency (ie out of valid range)
     */
    public void setFrequency(double frequency, boolean synchronousUpdate) throws SDRplayException
    {
        if(MINIMUM_FREQUENCY < frequency && frequency <= MAXIMUM_FREQUENCY)
        {
            sdrplay_api_RfFreqT.rfHz$set(getMemorySegment(), frequency);
            sdrplay_api_RfFreqT.syncUpdate$set(getMemorySegment(), Flag.of(synchronousUpdate));
        }
        else
        {
            throw new SDRplayException("Invalid frequency: " + frequency + " - valid range: " +
                    MINIMUM_FREQUENCY + "-" + MAXIMUM_FREQUENCY);
        }
    }

    /**
     * Sets the RF frequency as a synchronous update
     */
    public void setFrequency(double frequency) throws SDRplayException
    {
        setFrequency(frequency, true);
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Frequency:").append(getFrequency());
        return sb.toString();
    }
}
