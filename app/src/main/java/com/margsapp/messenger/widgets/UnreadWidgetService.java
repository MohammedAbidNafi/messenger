package com.margsapp.messenger.widgets;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class UnreadWidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new WidgetDataProvider(this, intent);
    }
}
