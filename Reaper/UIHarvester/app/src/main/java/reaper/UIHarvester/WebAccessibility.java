package reaper.UIHarvester;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import de.robv.android.xposed.XSharedPreferences;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

import static reaper.UIHarvester.UIHarvester.modulePrefs;
import static reaper.UIHarvester.UIHarvester.printing;

public class WebAccessibility extends AccessibilityService {
    public String Tag = "WebAccService: ";
    @SuppressLint("LongLogTag")
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {

        if(AccessibilityEvent.eventTypeToString(event.getEventType()).equals("TYPE_WINDOW_CONTENT_CHANGED")){

            //Log.d(Tag, AccessibilityEvent.eventTypeToString(event.getEventType()));
            String modulePrefs = "UIHarvesterPrefs";
            Set apps = new HashSet();
            SharedPreferences prefs ;

        }
    }

    @Override
    public void onInterrupt() {
    }
    @Override
    public void onServiceConnected() {
        // Set the type of events that this service wants to listen to. Others
        // won't be passed to this service.
        AccessibilityServiceInfo info = new AccessibilityServiceInfo();
        info.eventTypes = AccessibilityEvent.TYPES_ALL_MASK;
        info.feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC;
        info.flags |= AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS
                | AccessibilityServiceInfo.FLAG_REPORT_VIEW_IDS;
        //| AccessibilityServiceInfo.FLAG_FORCE_DIRECT_BOOT_AWARE;
//        info.setCapabilities(AccessibilityServiceInfo.CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT
//                | AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION
//                | AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY
//                | AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS);

        //info.packageNames = packages;
        info.packageNames = null;
        info.notificationTimeout = 100;

        this.setServiceInfo(info);

    }
}
