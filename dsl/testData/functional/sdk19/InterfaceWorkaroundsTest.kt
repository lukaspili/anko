public final class InterfaceWorkarounds {

    public static interface DeletedContactsColumns {
        public static final java.lang.String CONTACT_ID = android.provider.ContactsContract.DeletedContacts.CONTACT_ID;
        public static final java.lang.String CONTACT_DELETED_TIMESTAMP = android.provider.ContactsContract.DeletedContacts.CONTACT_DELETED_TIMESTAMP;
    }

    public static interface ContactOptionsColumns {
        public static final java.lang.String TIMES_CONTACTED = android.provider.ContactsContract.RawContacts.TIMES_CONTACTED;
        public static final java.lang.String LAST_TIME_CONTACTED = android.provider.ContactsContract.RawContacts.LAST_TIME_CONTACTED;
        public static final java.lang.String STARRED = android.provider.ContactsContract.RawContacts.STARRED;
        public static final java.lang.String CUSTOM_RINGTONE = android.provider.ContactsContract.RawContacts.CUSTOM_RINGTONE;
        public static final java.lang.String SEND_TO_VOICEMAIL = android.provider.ContactsContract.RawContacts.SEND_TO_VOICEMAIL;
    }

    public static interface StreamItemsColumns {
        public static final java.lang.String CONTACT_ID = android.provider.ContactsContract.Contacts.StreamItems.CONTACT_ID;
        public static final java.lang.String CONTACT_LOOKUP_KEY = android.provider.ContactsContract.Contacts.StreamItems.CONTACT_LOOKUP_KEY;
        public static final java.lang.String RAW_CONTACT_ID = android.provider.ContactsContract.Contacts.StreamItems.RAW_CONTACT_ID;
        public static final java.lang.String RES_PACKAGE = android.provider.ContactsContract.Contacts.StreamItems.RES_PACKAGE;
        public static final java.lang.String ACCOUNT_TYPE = android.provider.ContactsContract.Contacts.StreamItems.ACCOUNT_TYPE;
        public static final java.lang.String ACCOUNT_NAME = android.provider.ContactsContract.Contacts.StreamItems.ACCOUNT_NAME;
        public static final java.lang.String DATA_SET = android.provider.ContactsContract.Contacts.StreamItems.DATA_SET;
        public static final java.lang.String RAW_CONTACT_SOURCE_ID = android.provider.ContactsContract.Contacts.StreamItems.RAW_CONTACT_SOURCE_ID;
        public static final java.lang.String RES_ICON = android.provider.ContactsContract.Contacts.StreamItems.RES_ICON;
        public static final java.lang.String RES_LABEL = android.provider.ContactsContract.Contacts.StreamItems.RES_LABEL;
        public static final java.lang.String TEXT = android.provider.ContactsContract.Contacts.StreamItems.TEXT;
        public static final java.lang.String TIMESTAMP = android.provider.ContactsContract.Contacts.StreamItems.TIMESTAMP;
        public static final java.lang.String COMMENTS = android.provider.ContactsContract.Contacts.StreamItems.COMMENTS;
        public static final java.lang.String SYNC1 = android.provider.ContactsContract.Contacts.StreamItems.SYNC1;
        public static final java.lang.String SYNC2 = android.provider.ContactsContract.Contacts.StreamItems.SYNC2;
        public static final java.lang.String SYNC3 = android.provider.ContactsContract.Contacts.StreamItems.SYNC3;
        public static final java.lang.String SYNC4 = android.provider.ContactsContract.Contacts.StreamItems.SYNC4;
    }

    public static interface RawContactsColumns {
        public static final java.lang.String CONTACT_ID = android.provider.ContactsContract.RawContacts.CONTACT_ID;
        public static final java.lang.String DATA_SET = android.provider.ContactsContract.RawContacts.DATA_SET;
        public static final java.lang.String AGGREGATION_MODE = android.provider.ContactsContract.RawContacts.AGGREGATION_MODE;
        public static final java.lang.String DELETED = android.provider.ContactsContract.RawContacts.DELETED;
        public static final java.lang.String RAW_CONTACT_IS_READ_ONLY = android.provider.ContactsContract.RawContacts.RAW_CONTACT_IS_READ_ONLY;
        public static final java.lang.String RAW_CONTACT_IS_USER_PROFILE = android.provider.ContactsContract.RawContacts.RAW_CONTACT_IS_USER_PROFILE;
    }

    public static interface ContactsColumns {
        public static final java.lang.String DISPLAY_NAME = android.provider.ContactsContract.Contacts.Entity.DISPLAY_NAME;
        public static final java.lang.String PHOTO_ID = android.provider.ContactsContract.Contacts.Entity.PHOTO_ID;
        public static final java.lang.String PHOTO_FILE_ID = android.provider.ContactsContract.Contacts.Entity.PHOTO_FILE_ID;
        public static final java.lang.String PHOTO_URI = android.provider.ContactsContract.Contacts.Entity.PHOTO_URI;
        public static final java.lang.String PHOTO_THUMBNAIL_URI = android.provider.ContactsContract.Contacts.Entity.PHOTO_THUMBNAIL_URI;
        public static final java.lang.String IN_VISIBLE_GROUP = android.provider.ContactsContract.Contacts.Entity.IN_VISIBLE_GROUP;
        public static final java.lang.String IS_USER_PROFILE = android.provider.ContactsContract.Contacts.Entity.IS_USER_PROFILE;
        public static final java.lang.String HAS_PHONE_NUMBER = android.provider.ContactsContract.Contacts.Entity.HAS_PHONE_NUMBER;
        public static final java.lang.String LOOKUP_KEY = android.provider.ContactsContract.Contacts.Entity.LOOKUP_KEY;
        public static final java.lang.String CONTACT_LAST_UPDATED_TIMESTAMP = android.provider.ContactsContract.Contacts.Entity.CONTACT_LAST_UPDATED_TIMESTAMP;
    }

    public static interface StreamItemPhotosColumns {
        public static final java.lang.String STREAM_ITEM_ID = android.provider.ContactsContract.StreamItemPhotos.STREAM_ITEM_ID;
        public static final java.lang.String SORT_INDEX = android.provider.ContactsContract.StreamItemPhotos.SORT_INDEX;
        public static final java.lang.String PHOTO_FILE_ID = android.provider.ContactsContract.StreamItemPhotos.PHOTO_FILE_ID;
        public static final java.lang.String PHOTO_URI = android.provider.ContactsContract.StreamItemPhotos.PHOTO_URI;
        public static final java.lang.String SYNC1 = android.provider.ContactsContract.StreamItemPhotos.SYNC1;
        public static final java.lang.String SYNC2 = android.provider.ContactsContract.StreamItemPhotos.SYNC2;
        public static final java.lang.String SYNC3 = android.provider.ContactsContract.StreamItemPhotos.SYNC3;
        public static final java.lang.String SYNC4 = android.provider.ContactsContract.StreamItemPhotos.SYNC4;
    }

    public static interface AttendeesColumns {
        public static final java.lang.String EVENT_ID = android.provider.CalendarContract.Attendees.EVENT_ID;
        public static final java.lang.String ATTENDEE_NAME = android.provider.CalendarContract.Attendees.ATTENDEE_NAME;
        public static final java.lang.String ATTENDEE_EMAIL = android.provider.CalendarContract.Attendees.ATTENDEE_EMAIL;
        public static final java.lang.String ATTENDEE_RELATIONSHIP = android.provider.CalendarContract.Attendees.ATTENDEE_RELATIONSHIP;
        public static final int RELATIONSHIP_NONE = android.provider.CalendarContract.Attendees.RELATIONSHIP_NONE;
        public static final int RELATIONSHIP_ATTENDEE = android.provider.CalendarContract.Attendees.RELATIONSHIP_ATTENDEE;
        public static final int RELATIONSHIP_ORGANIZER = android.provider.CalendarContract.Attendees.RELATIONSHIP_ORGANIZER;
        public static final int RELATIONSHIP_PERFORMER = android.provider.CalendarContract.Attendees.RELATIONSHIP_PERFORMER;
        public static final int RELATIONSHIP_SPEAKER = android.provider.CalendarContract.Attendees.RELATIONSHIP_SPEAKER;
        public static final java.lang.String ATTENDEE_TYPE = android.provider.CalendarContract.Attendees.ATTENDEE_TYPE;
        public static final int TYPE_NONE = android.provider.CalendarContract.Attendees.TYPE_NONE;
        public static final int TYPE_REQUIRED = android.provider.CalendarContract.Attendees.TYPE_REQUIRED;
        public static final int TYPE_OPTIONAL = android.provider.CalendarContract.Attendees.TYPE_OPTIONAL;
        public static final int TYPE_RESOURCE = android.provider.CalendarContract.Attendees.TYPE_RESOURCE;
        public static final java.lang.String ATTENDEE_STATUS = android.provider.CalendarContract.Attendees.ATTENDEE_STATUS;
        public static final int ATTENDEE_STATUS_NONE = android.provider.CalendarContract.Attendees.ATTENDEE_STATUS_NONE;
        public static final int ATTENDEE_STATUS_ACCEPTED = android.provider.CalendarContract.Attendees.ATTENDEE_STATUS_ACCEPTED;
        public static final int ATTENDEE_STATUS_DECLINED = android.provider.CalendarContract.Attendees.ATTENDEE_STATUS_DECLINED;
        public static final int ATTENDEE_STATUS_INVITED = android.provider.CalendarContract.Attendees.ATTENDEE_STATUS_INVITED;
        public static final int ATTENDEE_STATUS_TENTATIVE = android.provider.CalendarContract.Attendees.ATTENDEE_STATUS_TENTATIVE;
        public static final java.lang.String ATTENDEE_IDENTITY = android.provider.CalendarContract.Attendees.ATTENDEE_IDENTITY;
        public static final java.lang.String ATTENDEE_ID_NAMESPACE = android.provider.CalendarContract.Attendees.ATTENDEE_ID_NAMESPACE;
    }

    public static interface CalendarAlertsColumns {
        public static final java.lang.String EVENT_ID = android.provider.CalendarContract.CalendarAlerts.EVENT_ID;
        public static final java.lang.String BEGIN = android.provider.CalendarContract.CalendarAlerts.BEGIN;
        public static final java.lang.String END = android.provider.CalendarContract.CalendarAlerts.END;
        public static final java.lang.String ALARM_TIME = android.provider.CalendarContract.CalendarAlerts.ALARM_TIME;
        public static final java.lang.String CREATION_TIME = android.provider.CalendarContract.CalendarAlerts.CREATION_TIME;
        public static final java.lang.String RECEIVED_TIME = android.provider.CalendarContract.CalendarAlerts.RECEIVED_TIME;
        public static final java.lang.String NOTIFY_TIME = android.provider.CalendarContract.CalendarAlerts.NOTIFY_TIME;
        public static final java.lang.String STATE = android.provider.CalendarContract.CalendarAlerts.STATE;
        public static final int STATE_SCHEDULED = android.provider.CalendarContract.CalendarAlerts.STATE_SCHEDULED;
        public static final int STATE_FIRED = android.provider.CalendarContract.CalendarAlerts.STATE_FIRED;
        public static final int STATE_DISMISSED = android.provider.CalendarContract.CalendarAlerts.STATE_DISMISSED;
        public static final java.lang.String MINUTES = android.provider.CalendarContract.CalendarAlerts.MINUTES;
        public static final java.lang.String DEFAULT_SORT_ORDER = android.provider.CalendarContract.CalendarAlerts.DEFAULT_SORT_ORDER;
    }

    public static interface CalendarContract_SyncColumns {
        public static final java.lang.String ACCOUNT_NAME = android.provider.CalendarContract.EventsEntity.ACCOUNT_NAME;
        public static final java.lang.String ACCOUNT_TYPE = android.provider.CalendarContract.EventsEntity.ACCOUNT_TYPE;
        public static final java.lang.String _SYNC_ID = android.provider.CalendarContract.EventsEntity._SYNC_ID;
        public static final java.lang.String DIRTY = android.provider.CalendarContract.EventsEntity.DIRTY;
        public static final java.lang.String MUTATORS = android.provider.CalendarContract.EventsEntity.MUTATORS;
        public static final java.lang.String DELETED = android.provider.CalendarContract.EventsEntity.DELETED;
        public static final java.lang.String CAN_PARTIALLY_UPDATE = android.provider.CalendarContract.EventsEntity.CAN_PARTIALLY_UPDATE;
    }

    public static interface SettingsColumns {
        public static final java.lang.String ACCOUNT_NAME = android.provider.ContactsContract.Settings.ACCOUNT_NAME;
        public static final java.lang.String ACCOUNT_TYPE = android.provider.ContactsContract.Settings.ACCOUNT_TYPE;
        public static final java.lang.String DATA_SET = android.provider.ContactsContract.Settings.DATA_SET;
        public static final java.lang.String SHOULD_SYNC = android.provider.ContactsContract.Settings.SHOULD_SYNC;
        public static final java.lang.String UNGROUPED_VISIBLE = android.provider.ContactsContract.Settings.UNGROUPED_VISIBLE;
        public static final java.lang.String ANY_UNSYNCED = android.provider.ContactsContract.Settings.ANY_UNSYNCED;
        public static final java.lang.String UNGROUPED_COUNT = android.provider.ContactsContract.Settings.UNGROUPED_COUNT;
        public static final java.lang.String UNGROUPED_WITH_PHONES = android.provider.ContactsContract.Settings.UNGROUPED_WITH_PHONES;
    }

    public static interface GroupsColumns {
        public static final java.lang.String DATA_SET = android.provider.ContactsContract.Groups.DATA_SET;
        public static final java.lang.String TITLE = android.provider.ContactsContract.Groups.TITLE;
        public static final java.lang.String NOTES = android.provider.ContactsContract.Groups.NOTES;
        public static final java.lang.String SYSTEM_ID = android.provider.ContactsContract.Groups.SYSTEM_ID;
        public static final java.lang.String SUMMARY_COUNT = android.provider.ContactsContract.Groups.SUMMARY_COUNT;
        public static final java.lang.String SUMMARY_WITH_PHONES = android.provider.ContactsContract.Groups.SUMMARY_WITH_PHONES;
        public static final java.lang.String GROUP_VISIBLE = android.provider.ContactsContract.Groups.GROUP_VISIBLE;
        public static final java.lang.String DELETED = android.provider.ContactsContract.Groups.DELETED;
        public static final java.lang.String SHOULD_SYNC = android.provider.ContactsContract.Groups.SHOULD_SYNC;
        public static final java.lang.String AUTO_ADD = android.provider.ContactsContract.Groups.AUTO_ADD;
        public static final java.lang.String FAVORITES = android.provider.ContactsContract.Groups.FAVORITES;
        public static final java.lang.String GROUP_IS_READ_ONLY = android.provider.ContactsContract.Groups.GROUP_IS_READ_ONLY;
    }

    public static interface CalendarColumns {
        public static final java.lang.String CALENDAR_COLOR = android.provider.CalendarContract.CalendarAlerts.CALENDAR_COLOR;
        public static final java.lang.String CALENDAR_COLOR_KEY = android.provider.CalendarContract.CalendarAlerts.CALENDAR_COLOR_KEY;
        public static final java.lang.String CALENDAR_DISPLAY_NAME = android.provider.CalendarContract.CalendarAlerts.CALENDAR_DISPLAY_NAME;
        public static final java.lang.String CALENDAR_ACCESS_LEVEL = android.provider.CalendarContract.CalendarAlerts.CALENDAR_ACCESS_LEVEL;
        public static final int CAL_ACCESS_NONE = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_NONE;
        public static final int CAL_ACCESS_FREEBUSY = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_FREEBUSY;
        public static final int CAL_ACCESS_READ = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_READ;
        public static final int CAL_ACCESS_RESPOND = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_RESPOND;
        public static final int CAL_ACCESS_OVERRIDE = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_OVERRIDE;
        public static final int CAL_ACCESS_CONTRIBUTOR = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_CONTRIBUTOR;
        public static final int CAL_ACCESS_EDITOR = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_EDITOR;
        public static final int CAL_ACCESS_OWNER = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_OWNER;
        public static final int CAL_ACCESS_ROOT = android.provider.CalendarContract.CalendarAlerts.CAL_ACCESS_ROOT;
        public static final java.lang.String VISIBLE = android.provider.CalendarContract.CalendarAlerts.VISIBLE;
        public static final java.lang.String CALENDAR_TIME_ZONE = android.provider.CalendarContract.CalendarAlerts.CALENDAR_TIME_ZONE;
        public static final java.lang.String SYNC_EVENTS = android.provider.CalendarContract.CalendarAlerts.SYNC_EVENTS;
        public static final java.lang.String OWNER_ACCOUNT = android.provider.CalendarContract.CalendarAlerts.OWNER_ACCOUNT;
        public static final java.lang.String CAN_ORGANIZER_RESPOND = android.provider.CalendarContract.CalendarAlerts.CAN_ORGANIZER_RESPOND;
        public static final java.lang.String CAN_MODIFY_TIME_ZONE = android.provider.CalendarContract.CalendarAlerts.CAN_MODIFY_TIME_ZONE;
        public static final java.lang.String MAX_REMINDERS = android.provider.CalendarContract.CalendarAlerts.MAX_REMINDERS;
        public static final java.lang.String ALLOWED_REMINDERS = android.provider.CalendarContract.CalendarAlerts.ALLOWED_REMINDERS;
        public static final java.lang.String ALLOWED_AVAILABILITY = android.provider.CalendarContract.CalendarAlerts.ALLOWED_AVAILABILITY;
        public static final java.lang.String ALLOWED_ATTENDEE_TYPES = android.provider.CalendarContract.CalendarAlerts.ALLOWED_ATTENDEE_TYPES;
        public static final java.lang.String IS_PRIMARY = android.provider.CalendarContract.CalendarAlerts.IS_PRIMARY;
    }

    public static interface ContactStatusColumns {
        public static final java.lang.String CONTACT_PRESENCE = android.provider.ContactsContract.Contacts.Entity.CONTACT_PRESENCE;
        public static final java.lang.String CONTACT_CHAT_CAPABILITY = android.provider.ContactsContract.Contacts.Entity.CONTACT_CHAT_CAPABILITY;
        public static final java.lang.String CONTACT_STATUS = android.provider.ContactsContract.Contacts.Entity.CONTACT_STATUS;
        public static final java.lang.String CONTACT_STATUS_TIMESTAMP = android.provider.ContactsContract.Contacts.Entity.CONTACT_STATUS_TIMESTAMP;
        public static final java.lang.String CONTACT_STATUS_RES_PACKAGE = android.provider.ContactsContract.Contacts.Entity.CONTACT_STATUS_RES_PACKAGE;
        public static final java.lang.String CONTACT_STATUS_LABEL = android.provider.ContactsContract.Contacts.Entity.CONTACT_STATUS_LABEL;
        public static final java.lang.String CONTACT_STATUS_ICON = android.provider.ContactsContract.Contacts.Entity.CONTACT_STATUS_ICON;
    }

    public static interface CalendarCacheColumns {
        public static final java.lang.String KEY = android.provider.CalendarContract.CalendarCache.KEY;
        public static final java.lang.String VALUE = android.provider.CalendarContract.CalendarCache.VALUE;
    }

    public static interface CommonColumns {
        public static final java.lang.String DATA = android.provider.ContactsContract.CommonDataKinds.Nickname.DATA;
        public static final java.lang.String TYPE = android.provider.ContactsContract.CommonDataKinds.Nickname.TYPE;
        public static final java.lang.String LABEL = android.provider.ContactsContract.CommonDataKinds.Nickname.LABEL;
    }

    public static interface EventDaysColumns {
        public static final java.lang.String STARTDAY = android.provider.CalendarContract.EventDays.STARTDAY;
        public static final java.lang.String ENDDAY = android.provider.CalendarContract.EventDays.ENDDAY;
    }

    public static interface PresenceColumns {
        public static final java.lang.String DATA_ID = android.provider.ContactsContract.StatusUpdates.DATA_ID;
        public static final java.lang.String PROTOCOL = android.provider.ContactsContract.StatusUpdates.PROTOCOL;
        public static final java.lang.String CUSTOM_PROTOCOL = android.provider.ContactsContract.StatusUpdates.CUSTOM_PROTOCOL;
        public static final java.lang.String IM_HANDLE = android.provider.ContactsContract.StatusUpdates.IM_HANDLE;
        public static final java.lang.String IM_ACCOUNT = android.provider.ContactsContract.StatusUpdates.IM_ACCOUNT;
    }

    public static interface PhoneLookupColumns {
        public static final java.lang.String NUMBER = android.provider.ContactsContract.PhoneLookup.NUMBER;
        public static final java.lang.String TYPE = android.provider.ContactsContract.PhoneLookup.TYPE;
        public static final java.lang.String LABEL = android.provider.ContactsContract.PhoneLookup.LABEL;
        public static final java.lang.String NORMALIZED_NUMBER = android.provider.ContactsContract.PhoneLookup.NORMALIZED_NUMBER;
    }

    public static interface ExtendedPropertiesColumns {
        public static final java.lang.String EVENT_ID = android.provider.CalendarContract.ExtendedProperties.EVENT_ID;
        public static final java.lang.String NAME = android.provider.CalendarContract.ExtendedProperties.NAME;
        public static final java.lang.String VALUE = android.provider.CalendarContract.ExtendedProperties.VALUE;
    }

    public static interface RemindersColumns {
        public static final java.lang.String EVENT_ID = android.provider.CalendarContract.Reminders.EVENT_ID;
        public static final java.lang.String MINUTES = android.provider.CalendarContract.Reminders.MINUTES;
        public static final int MINUTES_DEFAULT = android.provider.CalendarContract.Reminders.MINUTES_DEFAULT;
        public static final java.lang.String METHOD = android.provider.CalendarContract.Reminders.METHOD;
        public static final int METHOD_DEFAULT = android.provider.CalendarContract.Reminders.METHOD_DEFAULT;
        public static final int METHOD_ALERT = android.provider.CalendarContract.Reminders.METHOD_ALERT;
        public static final int METHOD_EMAIL = android.provider.CalendarContract.Reminders.METHOD_EMAIL;
        public static final int METHOD_SMS = android.provider.CalendarContract.Reminders.METHOD_SMS;
        public static final int METHOD_ALARM = android.provider.CalendarContract.Reminders.METHOD_ALARM;
    }

    public static interface ColorsColumns {
        public static final java.lang.String COLOR_TYPE = android.provider.CalendarContract.Colors.COLOR_TYPE;
        public static final int TYPE_CALENDAR = android.provider.CalendarContract.Colors.TYPE_CALENDAR;
        public static final int TYPE_EVENT = android.provider.CalendarContract.Colors.TYPE_EVENT;
        public static final java.lang.String COLOR_KEY = android.provider.CalendarContract.Colors.COLOR_KEY;
        public static final java.lang.String COLOR = android.provider.CalendarContract.Colors.COLOR;
    }

    public static interface DataColumns {
        public static final java.lang.String MIMETYPE = android.provider.ContactsContract.RawContacts.Entity.MIMETYPE;
        public static final java.lang.String RAW_CONTACT_ID = android.provider.ContactsContract.RawContacts.Entity.RAW_CONTACT_ID;
        public static final java.lang.String IS_PRIMARY = android.provider.ContactsContract.RawContacts.Entity.IS_PRIMARY;
        public static final java.lang.String IS_SUPER_PRIMARY = android.provider.ContactsContract.RawContacts.Entity.IS_SUPER_PRIMARY;
        public static final java.lang.String IS_READ_ONLY = android.provider.ContactsContract.RawContacts.Entity.IS_READ_ONLY;
        public static final java.lang.String DATA_VERSION = android.provider.ContactsContract.RawContacts.Entity.DATA_VERSION;
        public static final java.lang.String DATA1 = android.provider.ContactsContract.RawContacts.Entity.DATA1;
        public static final java.lang.String DATA2 = android.provider.ContactsContract.RawContacts.Entity.DATA2;
        public static final java.lang.String DATA3 = android.provider.ContactsContract.RawContacts.Entity.DATA3;
        public static final java.lang.String DATA4 = android.provider.ContactsContract.RawContacts.Entity.DATA4;
        public static final java.lang.String DATA5 = android.provider.ContactsContract.RawContacts.Entity.DATA5;
        public static final java.lang.String DATA6 = android.provider.ContactsContract.RawContacts.Entity.DATA6;
        public static final java.lang.String DATA7 = android.provider.ContactsContract.RawContacts.Entity.DATA7;
        public static final java.lang.String DATA8 = android.provider.ContactsContract.RawContacts.Entity.DATA8;
        public static final java.lang.String DATA9 = android.provider.ContactsContract.RawContacts.Entity.DATA9;
        public static final java.lang.String DATA10 = android.provider.ContactsContract.RawContacts.Entity.DATA10;
        public static final java.lang.String DATA11 = android.provider.ContactsContract.RawContacts.Entity.DATA11;
        public static final java.lang.String DATA12 = android.provider.ContactsContract.RawContacts.Entity.DATA12;
        public static final java.lang.String DATA13 = android.provider.ContactsContract.RawContacts.Entity.DATA13;
        public static final java.lang.String DATA14 = android.provider.ContactsContract.RawContacts.Entity.DATA14;
        public static final java.lang.String DATA15 = android.provider.ContactsContract.RawContacts.Entity.DATA15;
        public static final java.lang.String SYNC1 = android.provider.ContactsContract.RawContacts.Entity.SYNC1;
        public static final java.lang.String SYNC2 = android.provider.ContactsContract.RawContacts.Entity.SYNC2;
        public static final java.lang.String SYNC3 = android.provider.ContactsContract.RawContacts.Entity.SYNC3;
        public static final java.lang.String SYNC4 = android.provider.ContactsContract.RawContacts.Entity.SYNC4;
    }

    public static interface ContactsContract_SyncColumns {
        public static final java.lang.String ACCOUNT_NAME = android.provider.ContactsContract.RawContacts.ACCOUNT_NAME;
        public static final java.lang.String ACCOUNT_TYPE = android.provider.ContactsContract.RawContacts.ACCOUNT_TYPE;
        public static final java.lang.String SOURCE_ID = android.provider.ContactsContract.RawContacts.SOURCE_ID;
        public static final java.lang.String VERSION = android.provider.ContactsContract.RawContacts.VERSION;
        public static final java.lang.String DIRTY = android.provider.ContactsContract.RawContacts.DIRTY;
    }

    public static interface EventsColumns {
        public static final java.lang.String CALENDAR_ID = android.provider.CalendarContract.Reminders.CALENDAR_ID;
        public static final java.lang.String TITLE = android.provider.CalendarContract.Reminders.TITLE;
        public static final java.lang.String DESCRIPTION = android.provider.CalendarContract.Reminders.DESCRIPTION;
        public static final java.lang.String EVENT_LOCATION = android.provider.CalendarContract.Reminders.EVENT_LOCATION;
        public static final java.lang.String EVENT_COLOR = android.provider.CalendarContract.Reminders.EVENT_COLOR;
        public static final java.lang.String EVENT_COLOR_KEY = android.provider.CalendarContract.Reminders.EVENT_COLOR_KEY;
        public static final java.lang.String DISPLAY_COLOR = android.provider.CalendarContract.Reminders.DISPLAY_COLOR;
        public static final java.lang.String STATUS = android.provider.CalendarContract.Reminders.STATUS;
        public static final int STATUS_TENTATIVE = android.provider.CalendarContract.Reminders.STATUS_TENTATIVE;
        public static final int STATUS_CONFIRMED = android.provider.CalendarContract.Reminders.STATUS_CONFIRMED;
        public static final int STATUS_CANCELED = android.provider.CalendarContract.Reminders.STATUS_CANCELED;
        public static final java.lang.String SELF_ATTENDEE_STATUS = android.provider.CalendarContract.Reminders.SELF_ATTENDEE_STATUS;
        public static final java.lang.String SYNC_DATA1 = android.provider.CalendarContract.Reminders.SYNC_DATA1;
        public static final java.lang.String SYNC_DATA2 = android.provider.CalendarContract.Reminders.SYNC_DATA2;
        public static final java.lang.String SYNC_DATA3 = android.provider.CalendarContract.Reminders.SYNC_DATA3;
        public static final java.lang.String SYNC_DATA4 = android.provider.CalendarContract.Reminders.SYNC_DATA4;
        public static final java.lang.String SYNC_DATA5 = android.provider.CalendarContract.Reminders.SYNC_DATA5;
        public static final java.lang.String SYNC_DATA6 = android.provider.CalendarContract.Reminders.SYNC_DATA6;
        public static final java.lang.String SYNC_DATA7 = android.provider.CalendarContract.Reminders.SYNC_DATA7;
        public static final java.lang.String SYNC_DATA8 = android.provider.CalendarContract.Reminders.SYNC_DATA8;
        public static final java.lang.String SYNC_DATA9 = android.provider.CalendarContract.Reminders.SYNC_DATA9;
        public static final java.lang.String SYNC_DATA10 = android.provider.CalendarContract.Reminders.SYNC_DATA10;
        public static final java.lang.String LAST_SYNCED = android.provider.CalendarContract.Reminders.LAST_SYNCED;
        public static final java.lang.String DTSTART = android.provider.CalendarContract.Reminders.DTSTART;
        public static final java.lang.String DTEND = android.provider.CalendarContract.Reminders.DTEND;
        public static final java.lang.String DURATION = android.provider.CalendarContract.Reminders.DURATION;
        public static final java.lang.String EVENT_TIMEZONE = android.provider.CalendarContract.Reminders.EVENT_TIMEZONE;
        public static final java.lang.String EVENT_END_TIMEZONE = android.provider.CalendarContract.Reminders.EVENT_END_TIMEZONE;
        public static final java.lang.String ALL_DAY = android.provider.CalendarContract.Reminders.ALL_DAY;
        public static final java.lang.String ACCESS_LEVEL = android.provider.CalendarContract.Reminders.ACCESS_LEVEL;
        public static final int ACCESS_DEFAULT = android.provider.CalendarContract.Reminders.ACCESS_DEFAULT;
        public static final int ACCESS_CONFIDENTIAL = android.provider.CalendarContract.Reminders.ACCESS_CONFIDENTIAL;
        public static final int ACCESS_PRIVATE = android.provider.CalendarContract.Reminders.ACCESS_PRIVATE;
        public static final int ACCESS_PUBLIC = android.provider.CalendarContract.Reminders.ACCESS_PUBLIC;
        public static final java.lang.String AVAILABILITY = android.provider.CalendarContract.Reminders.AVAILABILITY;
        public static final int AVAILABILITY_BUSY = android.provider.CalendarContract.Reminders.AVAILABILITY_BUSY;
        public static final int AVAILABILITY_FREE = android.provider.CalendarContract.Reminders.AVAILABILITY_FREE;
        public static final int AVAILABILITY_TENTATIVE = android.provider.CalendarContract.Reminders.AVAILABILITY_TENTATIVE;
        public static final java.lang.String HAS_ALARM = android.provider.CalendarContract.Reminders.HAS_ALARM;
        public static final java.lang.String HAS_EXTENDED_PROPERTIES = android.provider.CalendarContract.Reminders.HAS_EXTENDED_PROPERTIES;
        public static final java.lang.String RRULE = android.provider.CalendarContract.Reminders.RRULE;
        public static final java.lang.String RDATE = android.provider.CalendarContract.Reminders.RDATE;
        public static final java.lang.String EXRULE = android.provider.CalendarContract.Reminders.EXRULE;
        public static final java.lang.String EXDATE = android.provider.CalendarContract.Reminders.EXDATE;
        public static final java.lang.String ORIGINAL_ID = android.provider.CalendarContract.Reminders.ORIGINAL_ID;
        public static final java.lang.String ORIGINAL_SYNC_ID = android.provider.CalendarContract.Reminders.ORIGINAL_SYNC_ID;
        public static final java.lang.String ORIGINAL_INSTANCE_TIME = android.provider.CalendarContract.Reminders.ORIGINAL_INSTANCE_TIME;
        public static final java.lang.String ORIGINAL_ALL_DAY = android.provider.CalendarContract.Reminders.ORIGINAL_ALL_DAY;
        public static final java.lang.String LAST_DATE = android.provider.CalendarContract.Reminders.LAST_DATE;
        public static final java.lang.String HAS_ATTENDEE_DATA = android.provider.CalendarContract.Reminders.HAS_ATTENDEE_DATA;
        public static final java.lang.String GUESTS_CAN_MODIFY = android.provider.CalendarContract.Reminders.GUESTS_CAN_MODIFY;
        public static final java.lang.String GUESTS_CAN_INVITE_OTHERS = android.provider.CalendarContract.Reminders.GUESTS_CAN_INVITE_OTHERS;
        public static final java.lang.String GUESTS_CAN_SEE_GUESTS = android.provider.CalendarContract.Reminders.GUESTS_CAN_SEE_GUESTS;
        public static final java.lang.String ORGANIZER = android.provider.CalendarContract.Reminders.ORGANIZER;
        public static final java.lang.String IS_ORGANIZER = android.provider.CalendarContract.Reminders.IS_ORGANIZER;
        public static final java.lang.String CAN_INVITE_OTHERS = android.provider.CalendarContract.Reminders.CAN_INVITE_OTHERS;
        public static final java.lang.String CUSTOM_APP_PACKAGE = android.provider.CalendarContract.Reminders.CUSTOM_APP_PACKAGE;
        public static final java.lang.String CUSTOM_APP_URI = android.provider.CalendarContract.Reminders.CUSTOM_APP_URI;
        public static final java.lang.String UID_2445 = android.provider.CalendarContract.Reminders.UID_2445;
    }

    public static interface ContactNameColumns {
        public static final java.lang.String DISPLAY_NAME_SOURCE = android.provider.ContactsContract.RawContacts.DISPLAY_NAME_SOURCE;
        public static final java.lang.String DISPLAY_NAME_PRIMARY = android.provider.ContactsContract.RawContacts.DISPLAY_NAME_PRIMARY;
        public static final java.lang.String DISPLAY_NAME_ALTERNATIVE = android.provider.ContactsContract.RawContacts.DISPLAY_NAME_ALTERNATIVE;
        public static final java.lang.String PHONETIC_NAME_STYLE = android.provider.ContactsContract.RawContacts.PHONETIC_NAME_STYLE;
        public static final java.lang.String PHONETIC_NAME = android.provider.ContactsContract.RawContacts.PHONETIC_NAME;
        public static final java.lang.String SORT_KEY_PRIMARY = android.provider.ContactsContract.RawContacts.SORT_KEY_PRIMARY;
        public static final java.lang.String SORT_KEY_ALTERNATIVE = android.provider.ContactsContract.RawContacts.SORT_KEY_ALTERNATIVE;
    }

    public static interface StatusColumns {
        public static final java.lang.String PRESENCE = android.provider.ContactsContract.Contacts.Entity.PRESENCE;
        public static final java.lang.String PRESENCE_STATUS = android.provider.ContactsContract.Contacts.Entity.PRESENCE_STATUS;
        public static final int OFFLINE = android.provider.ContactsContract.Contacts.Entity.OFFLINE;
        public static final int INVISIBLE = android.provider.ContactsContract.Contacts.Entity.INVISIBLE;
        public static final int AWAY = android.provider.ContactsContract.Contacts.Entity.AWAY;
        public static final int IDLE = android.provider.ContactsContract.Contacts.Entity.IDLE;
        public static final int DO_NOT_DISTURB = android.provider.ContactsContract.Contacts.Entity.DO_NOT_DISTURB;
        public static final int AVAILABLE = android.provider.ContactsContract.Contacts.Entity.AVAILABLE;
        public static final java.lang.String STATUS = android.provider.ContactsContract.Contacts.Entity.STATUS;
        public static final java.lang.String PRESENCE_CUSTOM_STATUS = android.provider.ContactsContract.Contacts.Entity.PRESENCE_CUSTOM_STATUS;
        public static final java.lang.String STATUS_TIMESTAMP = android.provider.ContactsContract.Contacts.Entity.STATUS_TIMESTAMP;
        public static final java.lang.String STATUS_RES_PACKAGE = android.provider.ContactsContract.Contacts.Entity.STATUS_RES_PACKAGE;
        public static final java.lang.String STATUS_LABEL = android.provider.ContactsContract.Contacts.Entity.STATUS_LABEL;
        public static final java.lang.String STATUS_ICON = android.provider.ContactsContract.Contacts.Entity.STATUS_ICON;
        public static final java.lang.String CHAT_CAPABILITY = android.provider.ContactsContract.Contacts.Entity.CHAT_CAPABILITY;
        public static final int CAPABILITY_HAS_VOICE = android.provider.ContactsContract.Contacts.Entity.CAPABILITY_HAS_VOICE;
        public static final int CAPABILITY_HAS_VIDEO = android.provider.ContactsContract.Contacts.Entity.CAPABILITY_HAS_VIDEO;
        public static final int CAPABILITY_HAS_CAMERA = android.provider.ContactsContract.Contacts.Entity.CAPABILITY_HAS_CAMERA;
    }



}