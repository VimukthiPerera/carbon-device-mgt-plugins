/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.device.mgt.iot.raspberrypi.plugin.constants;

public class RaspberrypiConstants {

    public final static String DEVICE_TYPE = "raspberrypi";
    public final static String DEVICE_PLUGIN_DEVICE_NAME = "DEVICE_NAME";
    public final static String DEVICE_PLUGIN_DEVICE_ID = "RASPBERRYPI_DEVICE_ID";
    public final static String STATE_ON = "ON";
    public final static String STATE_OFF = "OFF";

    public static final String URL_PREFIX = "http://";
    public static final String BULB_CONTEXT = "/BULB/";
    public static final String TEMPERATURE_CONTEXT = "/TEMPERATURE/";

    //type of the sensor
    public static final String SENSOR_TEMPERATURE = "temperature";
    //sensor events summerized table name
    public static final String TEMPERATURE_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_TEMPERATURE";
    public static final String DATA_SOURCE_NAME = "jdbc/RaspberryPiDM_DB";
    public final static String DEVICE_TYPE_PROVIDER_DOMAIN = "carbon.super";

}