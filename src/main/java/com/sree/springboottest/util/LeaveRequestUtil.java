package com.sree.springboottest.util;

public class LeaveRequestUtil {
public static String generateLeaveRequestId(String userId,Long startDate,Long endDate){
	return userId+startDate+endDate;
	
}
}
