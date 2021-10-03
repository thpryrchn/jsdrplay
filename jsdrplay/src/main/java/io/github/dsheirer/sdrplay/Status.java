package io.github.dsheirer.sdrplay;

import io.github.dsheirer.sdrplay.api.sdrplay_api_h;

public enum Status
{
    SUCCESS(sdrplay_api_h.sdrplay_api_Success(), "Success"),
    FAIL(sdrplay_api_h.sdrplay_api_Fail(), "Fail"),
    INVALID_PARAMETER(sdrplay_api_h.sdrplay_api_InvalidParam(), "Invalid Parameter"),
    OUT_OF_RANGE(sdrplay_api_h.sdrplay_api_OutOfRange(), "Out of Range"),
    GAIN_UPDATE_ERROR(sdrplay_api_h.sdrplay_api_GainUpdateError(), "Gain Update Error"),
    RF_UPDATE_ERROR(sdrplay_api_h.sdrplay_api_RfUpdateError(), "RF Update Error"),
    FS_UPDATE_ERROR(sdrplay_api_h.sdrplay_api_FsUpdateError(), "FS Update Error"),
    HARDWARE_ERROR(sdrplay_api_h.sdrplay_api_HwError(), "Hardware Error"),
    ALIASING_ERROR(sdrplay_api_h.sdrplay_api_AliasingError(), "Aliasing Error"),
    ALREADY_INITIALIZED(sdrplay_api_h.sdrplay_api_AlreadyInitialised(), "Already Initialized"),
    NOT_INITIALIZED(sdrplay_api_h.sdrplay_api_NotInitialised(), "Not Initialized"),
    NOT_ENABLED(sdrplay_api_h.sdrplay_api_NotEnabled(), "Not Enabled"),
    HARDWARE_VERSION_ERROR(sdrplay_api_h.sdrplay_api_HwVerError(), "Hardware Version Error"),
    OUT_OF_MEMORY(sdrplay_api_h.sdrplay_api_OutOfMemError(), "Out Of Memory"),
    SERVICE_NOT_RESPONDING(sdrplay_api_h.sdrplay_api_ServiceNotResponding(), "Service Not Responding"),
    START_PENDING(sdrplay_api_h.sdrplay_api_StartPending(), "Start Pending"),
    STOP_PENDING(sdrplay_api_h.sdrplay_api_StopPending(), "Stop Pending"),
    INVALID_MODE(sdrplay_api_h.sdrplay_api_InvalidMode(), "Invalid Mode"),
    FAILED_VERIFICATION_1(sdrplay_api_h.sdrplay_api_FailedVerification1(), "Failed Verification 1"),
    FAILED_VERIFICATION_2(sdrplay_api_h.sdrplay_api_FailedVerification2(), "Failed Verification 2"),
    FAILED_VERIFICATION_3(sdrplay_api_h.sdrplay_api_FailedVerification3(), "Failed Verification 3"),
    FAILED_VERIFICATION_4(sdrplay_api_h.sdrplay_api_FailedVerification4(), "Failed Verification 4"),
    FAILED_VERIFICATION_5(sdrplay_api_h.sdrplay_api_FailedVerification5(), "Failed Verification 5"),
    FAILED_VERIFICATION_6(sdrplay_api_h.sdrplay_api_FailedVerification6(), "Failed Verification 6"),
    INVALID_SERVICE_VERSION(sdrplay_api_h.sdrplay_api_InvalidServiceVersion(), "Invalid Service Version"),

    //Custom status codes
    API_UNAVAILABLE(-2, "SDRplay API Not Installed/Available"),
    UNKNOWN(-1, "Unknown");

    private int mValue;
    private String mDescription;

    Status(int value, String description)
    {
        mValue = value;
        mDescription = description;
    }

    /**
     * Status code value
     */
    public int getValue()
    {
        return mValue;
    }

    /**
     * Indicates if this is a SUCCESS status.
     */
    public boolean success()
    {
        return this == Status.SUCCESS;
    }

    public boolean fail()
    {
        return this != Status.SUCCESS;
    }

    /**
     * Lookup the status from a return code
     * @param value to lookup
     * @return status or UKNOWN if the code is not recognized
     */
    public static Status fromValue(int value)
    {
        for(Status status: Status.values())
        {
            if(status.getValue() == value)
            {
                return status;
            }
        }
        
        return UNKNOWN;
    }

    @Override
    public String toString()
    {
        return mDescription;
    }
}
