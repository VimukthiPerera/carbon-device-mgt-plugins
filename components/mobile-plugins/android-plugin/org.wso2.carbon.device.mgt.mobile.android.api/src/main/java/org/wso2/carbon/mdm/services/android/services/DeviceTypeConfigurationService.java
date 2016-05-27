/*
 *   Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */
package org.wso2.carbon.mdm.services.android.services;

import io.swagger.annotations.*;
import org.wso2.carbon.device.mgt.common.configuration.mgt.PlatformConfiguration;
import org.wso2.carbon.mdm.services.android.exception.AndroidAgentException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api(value = "Android Configuration Management API", description = "This API carries all resource associated with " +
        "manipulating the general configurations of Android platform")
@Path("/configuration")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface DeviceTypeConfigurationService {

    @POST
    @ApiOperation(
            consumes = MediaType.APPLICATION_JSON,
            httpMethod = "POST",
            value = "Configuring Android Platform Settings",
            notes = "Configure the Android platform settings using this REST API"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Android platform configuration saved successfully"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    Response addConfiguration(@ApiParam(name = "configuration", value = "AndroidPlatformConfiguration")
                               PlatformConfiguration configuration) throws AndroidAgentException;
    @GET
    @ApiOperation(
            httpMethod = "GET",
            value = "Getting Android Platform Configurations",
            notes = "Get the Android platform configuration details using this REST API",
            response = PlatformConfiguration.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get Android Configurations"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    Response getConfiguration() throws AndroidAgentException;

    @PUT
    @ApiOperation(
            consumes = MediaType.APPLICATION_JSON,
            produces = MediaType.APPLICATION_JSON,
            httpMethod = "PUT",
            value = "Updating Android Platform Configurations",
            notes = "Update the Android platform configurations using this REST API"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. \n Platform configuration has successfully been updated"),
            @ApiResponse(code = 500, message = "Error occurred while modifying configuration settings of " +
                    "Android platform")
    })
    Response updateConfiguration(@ApiParam(name = "configuration", value = "AndroidPlatformConfiguration")
                                 PlatformConfiguration configuration) throws AndroidAgentException;

}