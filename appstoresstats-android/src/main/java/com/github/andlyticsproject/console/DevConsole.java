package com.github.andlyticsproject.console;

import java.util.List;

import com.github.andlyticsproject.model.AppInfo;
import com.github.andlyticsproject.model.Comment;

public interface DevConsole {

	// activity is needed for starting an authentication sub-activity
	// which may be returned from the AccountManager (leaky...)
	// pass null when calling from a service
	List<AppInfo> getAppInfo() throws DevConsoleException;

	List<Comment> getComments(String packageName, String developerId,
			int startIndex, int count, String displayLocale) throws DevConsoleException;

	Comment replyToComment(String packageName, String developerId,
			String commentUniqueId, String reply);

}
