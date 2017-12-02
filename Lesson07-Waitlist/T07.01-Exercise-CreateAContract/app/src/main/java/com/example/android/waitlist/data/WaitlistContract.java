package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public final class WaitlistContract {

    private WaitlistContract() {}

    // TODO (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    public final static class WaitListEntry implements BaseColumns{
        public static final String tableName = "waitList";
        public static final String columnGuestName = "guestName";
        public static final String columnPartySize = "partySize";
        public static final String columnTimestamp = "timestamp";
    }

        // TODO (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        // COLUMN_GUEST_NAME -> guestName
        // COLUMN_PARTY_SIZE -> partySize
        // COLUMN_TIMESTAMP -> timestamp

}
