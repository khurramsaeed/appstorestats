/**
* Copyright 2013 Arcadia Consulting C.B.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*     http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
**/package es.arcadiaconsulting.appstoresstats.common;

import java.util.Date;


public interface IStoreStats {
	
	public CommonStatsData getStatsForApp(String user,String password,String appId,Date initDate,Date endDate,String vendorId,String store);
	//public List<CommonStatsData> getStatsForAllApps(String user,String password,Date initDate,Date endDate);
	public CommonStatsData getFullStatsForApp(String user, String password, String appId, String vectorId, String store);


    //public List<CommonStatsData> getFullStatsForAllApps(String user,String password);
	
}
